package cepmodel.evaluation;

import java.util.Optional;

import logiToppMetamodel.base.Time;
import logiToppMetamodel.base.Weekday;
import logiToppMetamodel.logiTopp.distribution.delivery.ParcelActivity;
import logiToppMetamodel.logiTopp.distribution.tours.PlannedDeliveryTour;

/*
 * Describes a single transport hop of a parcel
 */
class ParcelRecordEntry {
	private ParcelRecord parcelRecord;
	private int no;
	private Optional<ParcelRecordEntry> previous;
	private Optional<ParcelRecordEntry> next;
	private final PlannedDeliveryTour tour;
	private final ParcelActivity pickUp;
	private final ParcelActivity delivery;
	// start: begin of pickup activity
	private final Time start;
	// end: end of delivery activity (including duration of activity)
	private final Time end;

	public ParcelRecordEntry(PlannedDeliveryTour tour, ParcelActivity pickUp, ParcelActivity delivery) {
		super();
		this.tour = tour;
		this.pickUp = pickUp;
		this.delivery = delivery;
		this.start = pickUp.getPlannedTime();
		this.end = LogiToppHelper.addMinutesToTime(delivery.getPlannedTime(), delivery.getDeliveryDuration());
	}

	// getter

	public ParcelRecord getRecord() {
		return parcelRecord;
	}

	public int getNo() {
		return no;
	}

	public Optional<ParcelRecordEntry> getPrevious() {
		return previous;
	}

	public Optional<ParcelRecordEntry> getNext() {
		return next;
	}

	public PlannedDeliveryTour getTour() {
		return tour;
	}

	public ParcelActivity getPickUp() {
		return pickUp;
	}

	public ParcelActivity getDelivery() {
		return delivery;
	}

	public Time getStart() {
		return start;
	}

	public Time getEnd() {
		return end;
	}

	// setter

	public void setRecord(ParcelRecord parcelRecord) {
		this.parcelRecord = parcelRecord;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public void setPrevious(Optional<ParcelRecordEntry> previous) {
		this.previous = previous;
	}

	public void setNext(Optional<ParcelRecordEntry> next) {
		this.next = next;
	}

	public boolean inSlice(Weekday sliceDay) {
		return this.start.getDay() == sliceDay && this.end.getDay() == sliceDay;
	}

}