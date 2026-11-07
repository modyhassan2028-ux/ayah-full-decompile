package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class Y extends V6.a {
    public static final Parcelable.Creator<Y> CREATOR = new X(1);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f14175r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final String f14176s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Intent f14177t;

    public Y(int i10, String str, Intent intent) {
        this.f14175r = i10;
        this.f14176s = str;
        this.f14177t = intent;
    }

    public static Y b(Activity activity) {
        return new Y(activity.hashCode(), activity.getClass().getCanonicalName(), activity.getIntent());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Y)) {
            return false;
        }
        Y y10 = (Y) obj;
        return this.f14175r == y10.f14175r && Objects.equals(this.f14176s, y10.f14176s) && Objects.equals(this.f14177t, y10.f14177t);
    }

    public final int hashCode() {
        return this.f14175r;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iD0 = p017b7.g.D0(parcel, 20293);
        p017b7.g.G0(parcel, 1, 4);
        parcel.writeInt(this.f14175r);
        p017b7.g.z0(parcel, 2, this.f14176s);
        p017b7.g.y0(parcel, 3, this.f14177t, i10);
        p017b7.g.F0(parcel, iD0);
    }
}
