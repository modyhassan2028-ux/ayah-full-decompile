package com.google.android.material.datepicker;

import E2.O;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.measurement.K1;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;

/* JADX INFO: loaded from: classes.dex */
public final class j implements Comparable, Parcelable {
    public static final Parcelable.Creator<j> CREATOR = new O(27);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Calendar f14884r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f14885s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f14886t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final int f14887u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f14888v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final long f14889w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public String f14890x;

    public j(Calendar calendar) {
        calendar.set(5, 1);
        Calendar calendarA = q.a(calendar);
        this.f14884r = calendarA;
        this.f14885s = calendarA.get(2);
        this.f14886t = calendarA.get(1);
        this.f14887u = calendarA.getMaximum(7);
        this.f14888v = calendarA.getActualMaximum(5);
        this.f14889w = calendarA.getTimeInMillis();
    }

    public static j a(int i10, int i11) {
        Calendar calendarC = q.c(null);
        calendarC.set(1, i10);
        calendarC.set(2, i11);
        return new j(calendarC);
    }

    public static j b(long j) {
        Calendar calendarC = q.c(null);
        calendarC.setTimeInMillis(j);
        return new j(calendarC);
    }

    public final String c() {
        if (this.f14890x == null) {
            this.f14890x = K1.h(this.f14884r.getTimeInMillis());
        }
        return this.f14890x;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f14884r.compareTo(((j) obj).f14884r);
    }

    public final int d(j jVar) {
        if (!(this.f14884r instanceof GregorianCalendar)) {
            throw new IllegalArgumentException("Only Gregorian calendars are supported.");
        }
        return (jVar.f14885s - this.f14885s) + ((jVar.f14886t - this.f14886t) * 12);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.f14885s == jVar.f14885s && this.f14886t == jVar.f14886t;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f14885s), Integer.valueOf(this.f14886t)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f14886t);
        parcel.writeInt(this.f14885s);
    }
}
