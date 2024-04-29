package cepmodel.evaluation;

import java.util.List;
import java.util.Optional;

import logiToppMetamodel.logiTopp.parcels.Parcel;

class ParcelRecord {
	private final Parcel parcel;
	private final List<ParcelRecordEntry> entries;

	public ParcelRecord(Parcel parcel, List<ParcelRecordEntry> entries) {
		super();
		this.parcel = parcel;
		this.entries = entries;

		build();
	}

	public Parcel getParcel() {
		return parcel;
	}

	public List<ParcelRecordEntry> getEntries() {
		return entries;
	}

	private void build() {
		for (int no = 0; no < this.entries.size(); no++) {
			ParcelRecordEntry current = entries.get(no);
			current.setNo(no);
			current.setRecord(this);

			current.setPrevious(Optional.empty());
			if (no != 0) {
				current.setPrevious(Optional.of(entries.get(no - 1)));
			}

			current.setNext(Optional.empty());
			if (no != this.entries.size() - 1) {
				current.setNext(Optional.of(entries.get(no + 1)));
			}

		}
	}
}