package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class Q extends AbstractC0899x implements T {
    public Q(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IEventHandlerProxy", 0);
    }

    @Override // com.google.android.gms.internal.measurement.T
    public final void P(long j, Bundle bundle, String str, String str2) {
        Parcel parcelG = g();
        parcelG.writeString(str);
        parcelG.writeString(str2);
        AbstractC0909z.b(parcelG, bundle);
        parcelG.writeLong(j);
        E0(parcelG, 1);
    }

    @Override // com.google.android.gms.internal.measurement.T
    public final int f() {
        Parcel parcelC = c(g(), 2);
        int i10 = parcelC.readInt();
        parcelC.recycle();
        return i10;
    }
}
