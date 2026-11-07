package com.google.android.material.datepicker;

import E2.O;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class d implements Parcelable {
    public static final Parcelable.Creator<d> CREATOR = new O(26);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final long f14871r;

    public d(long j) {
        this.f14871r = j;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && this.f14871r == ((d) obj).f14871r;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f14871r)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f14871r);
    }
}
