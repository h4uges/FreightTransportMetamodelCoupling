package cepmodel.evaluation;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import logiToppMetamodel.dataExchange.SolutionExchangeRoot;
import logiToppMetamodel.logiTopp.distribution.delivery.ParcelActivity;
import logiToppMetamodel.logiTopp.parcels.Parcel;

class LogiToppModelIndex {
	private SolutionExchangeRoot logiToppRoot;

	private Optional<Map<Parcel, ParcelRecord>> parcelRecords;

	public LogiToppModelIndex(SolutionExchangeRoot logiToppRoot) {
		this.logiToppRoot = logiToppRoot;

		this.parcelRecords = Optional.empty();
	}

	public Collection<ParcelActivity> getDeliveryStopsForParcel(Parcel parcel) {
		if (this.parcelRecords.isEmpty()) {
			this.buildParcelRecords();
		}

		return parcelRecords.get().get(parcel).getEntries().stream().map(entry -> entry.getDelivery()).toList();
	}

	public Collection<ParcelActivity> getPickupStopsForParcel(Parcel parcel) {
		if (this.parcelRecords.isEmpty()) {
			this.buildParcelRecords();
		}

		return parcelRecords.get().get(parcel).getEntries().stream().map(entry -> entry.getPickUp()).toList();
	}

	public ParcelRecord getParcelRecordForParcel(Parcel parcel) {
		if (this.parcelRecords.isEmpty()) {
			this.buildParcelRecords();
		}

		return parcelRecords.get().get(parcel);
	}

	public Collection<ParcelRecordEntry> getAllParcelRecordEntries() {
		if (this.parcelRecords.isEmpty()) {
			this.buildParcelRecords();
		}

		return parcelRecords.get().values().stream().flatMap(parcelRecord -> parcelRecord.getEntries().stream())
				.toList();
	}

	private void buildParcelRecords() {
		Map<Parcel, List<ParcelRecordEntry>> rawParcelRecords = logiToppRoot.getDemand().getParcels().stream()
				.collect(Collectors.toMap(parcel -> parcel, parcel -> new ArrayList<ParcelRecordEntry>()));

		logiToppRoot.getSolution().getPlannedTours().forEach(plannedTour -> {
			Map<Parcel, ParcelActivity> pickupStops = new HashMap<>();
			Map<Parcel, ParcelActivity> deliveryStops = new HashMap<>();
			plannedTour.getStops().forEach(stop -> {

				if (stop instanceof ParcelActivity parcelActivity) {
					parcelActivity.getPickUps()
							.forEach(pickedUpParcel -> pickupStops.put(pickedUpParcel, parcelActivity));
					parcelActivity.getParcels()
							.forEach(deliveredParcel -> deliveryStops.put(deliveredParcel, parcelActivity));
				}
			});

			pickupStops.keySet().forEach(parcel -> rawParcelRecords.get(parcel)
					.add(new ParcelRecordEntry(plannedTour, pickupStops.get(parcel), deliveryStops.get(parcel))));
		});

		Map<Parcel, ParcelRecord> parcel2ParcelRecords = rawParcelRecords.entrySet().stream().map(rawParcelRecord -> {
			rawParcelRecord.getValue().sort((entry1, entry2) -> LogiToppHelper
					.compareTimes(entry1.getPickUp().getPlannedTime(), entry2.getPickUp().getPlannedTime()));
			return new ParcelRecord(rawParcelRecord.getKey(), rawParcelRecord.getValue());
		}).collect(Collectors.toMap(ParcelRecord::getParcel, parcelRecord -> parcelRecord));

		this.parcelRecords = Optional.of(parcel2ParcelRecords);
	}
}