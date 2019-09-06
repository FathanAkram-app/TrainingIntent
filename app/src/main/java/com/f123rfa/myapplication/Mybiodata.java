package com.f123rfa.myapplication;

import android.os.Parcel;
import android.os.Parcelable;

public class Mybiodata implements Parcelable {
    private String nama;
    private int umur;

    public Mybiodata(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.nama);
        dest.writeInt(this.umur);
    }

    protected Mybiodata(Parcel in) {
        this.nama = in.readString();
        this.umur = in.readInt();
    }

    public static final Parcelable.Creator<Mybiodata> CREATOR = new Parcelable.Creator<Mybiodata>() {
        @Override
        public Mybiodata createFromParcel(Parcel source) {
            return new Mybiodata(source);
        }

        @Override
        public Mybiodata[] newArray(int size) {
            return new Mybiodata[size];
        }
    };
}
