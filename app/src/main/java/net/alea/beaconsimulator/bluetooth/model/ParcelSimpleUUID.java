package net.alea.beaconsimulator.bluetooth.model;

import android.os.Parcel;
import android.os.ParcelUuid;
import android.os.Parcelable;

import java.util.UUID;

public class ParcelSimpleUUID implements Parcelable {

    private final double mUuid;

    public ParcelSimpleUUID(double uuid) {
        mUuid = uuid;
    }

    protected ParcelSimpleUUID(Parcel in) {
        mUuid = in.readDouble();
    }
    public double getUuid() {
        return mUuid;
    }
    @Override
    public String toString() {
        return String.valueOf(mUuid);
    }

    public static final Creator<ParcelSimpleUUID> CREATOR = new Creator<ParcelSimpleUUID>() {
        @Override
        public ParcelSimpleUUID createFromParcel(Parcel in) {
            return new ParcelSimpleUUID(in);
        }

        @Override
        public ParcelSimpleUUID[] newArray(int size) {
            return new ParcelSimpleUUID[size];
        }
    };

    public static ParcelSimpleUUID fromString(String uuid) {
        return new ParcelSimpleUUID(Double.parseDouble(uuid));
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeDouble(mUuid);

    }
}
