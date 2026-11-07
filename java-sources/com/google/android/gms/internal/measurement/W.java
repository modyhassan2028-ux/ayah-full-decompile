package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class W extends V6.a {
    public static final Parcelable.Creator<W> CREATOR = new X(0);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final long f14146r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final long f14147s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final boolean f14148t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Bundle f14149u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final String f14150v;

    public W(long j, long j10, boolean z10, Bundle bundle, String str) {
        this.f14146r = j;
        this.f14147s = j10;
        this.f14148t = z10;
        this.f14149u = bundle;
        this.f14150v = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iD0 = p017b7.g.D0(parcel, 20293);
        p017b7.g.G0(parcel, 1, 8);
        parcel.writeLong(this.f14146r);
        p017b7.g.G0(parcel, 2, 8);
        parcel.writeLong(this.f14147s);
        p017b7.g.G0(parcel, 3, 4);
        parcel.writeInt(this.f14148t ? 1 : 0);
        p017b7.g.w0(parcel, 7, this.f14149u);
        p017b7.g.z0(parcel, 8, this.f14150v);
        p017b7.g.F0(parcel, iD0);
    }
}
