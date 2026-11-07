package com.google.android.material.datepicker;

import E2.O;
import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new O(25);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final j f14862r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final j f14863s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final d f14864t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final j f14865u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f14866v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f14867w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int f14868x;

    public b(j jVar, j jVar2, d dVar, j jVar3, int i10) {
        Objects.requireNonNull(jVar, "start cannot be null");
        Objects.requireNonNull(jVar2, "end cannot be null");
        Objects.requireNonNull(dVar, "validator cannot be null");
        this.f14862r = jVar;
        this.f14863s = jVar2;
        this.f14865u = jVar3;
        this.f14866v = i10;
        this.f14864t = dVar;
        if (jVar3 != null && jVar.f14884r.compareTo(jVar3.f14884r) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        }
        if (jVar3 != null && jVar3.f14884r.compareTo(jVar2.f14884r) > 0) {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        }
        if (i10 < 0 || i10 > q.c(null).getMaximum(7)) {
            throw new IllegalArgumentException("firstDayOfWeek is not valid");
        }
        this.f14868x = jVar.d(jVar2) + 1;
        this.f14867w = (jVar2.f14886t - jVar.f14886t) + 1;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f14862r.equals(bVar.f14862r) && this.f14863s.equals(bVar.f14863s) && Objects.equals(this.f14865u, bVar.f14865u) && this.f14866v == bVar.f14866v && this.f14864t.equals(bVar.f14864t);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f14862r, this.f14863s, this.f14865u, Integer.valueOf(this.f14866v), this.f14864t});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.f14862r, 0);
        parcel.writeParcelable(this.f14863s, 0);
        parcel.writeParcelable(this.f14865u, 0);
        parcel.writeParcelable(this.f14864t, 0);
        parcel.writeInt(this.f14866v);
    }
}
