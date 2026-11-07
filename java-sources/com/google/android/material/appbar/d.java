package com.google.android.material.appbar;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class d extends Q1.b {
    public static final Parcelable.Creator<d> CREATOR = new c();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f14595t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f14596u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f14597v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public float f14598w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f14599x;

    public d(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f14595t = parcel.readByte() != 0;
        this.f14596u = parcel.readByte() != 0;
        this.f14597v = parcel.readInt();
        this.f14598w = parcel.readFloat();
        this.f14599x = parcel.readByte() != 0;
    }

    @Override // Q1.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        super.writeToParcel(parcel, i10);
        parcel.writeByte(this.f14595t ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f14596u ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.f14597v);
        parcel.writeFloat(this.f14598w);
        parcel.writeByte(this.f14599x ? (byte) 1 : (byte) 0);
    }
}
