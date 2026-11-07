package com.google.android.gms.internal.measurement;

import android.os.Parcel;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.d0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class BinderC0801d0 extends AbstractBinderC0904y implements P {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p039d8.a f14223f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BinderC0801d0(Z z10, p039d8.a aVar) {
        super("com.google.android.gms.measurement.api.internal.IDynamiteUploadBatchesCallback");
        this.f14223f = aVar;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractBinderC0904y
    public final boolean a(int i10, Parcel parcel, Parcel parcel2) {
        if (i10 != 2) {
            return false;
        }
        d();
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.P
    public final void d() {
        this.f14223f.run();
    }
}
