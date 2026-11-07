package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class M extends AbstractC0899x implements N {
    public M(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IBundleReceiver", 0);
    }

    @Override // com.google.android.gms.internal.measurement.N
    public final void D(Bundle bundle) {
        Parcel parcelG = g();
        AbstractC0909z.b(parcelG, bundle);
        E0(parcelG, 1);
    }
}
