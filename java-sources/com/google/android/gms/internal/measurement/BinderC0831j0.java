package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.j0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class BinderC0831j0 extends AbstractBinderC0904y implements T {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p081h8.b f14338f;

    public BinderC0831j0(p081h8.b bVar) {
        super("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
        this.f14338f = bVar;
    }

    @Override // com.google.android.gms.internal.measurement.T
    public final void P(long j, Bundle bundle, String str, String str2) {
        this.f14338f.a(j, bundle, str, str2);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractBinderC0904y
    public final boolean a(int i10, Parcel parcel, Parcel parcel2) {
        if (i10 != 1) {
            if (i10 != 2) {
                return false;
            }
            int iIdentityHashCode = System.identityHashCode(this.f14338f);
            parcel2.writeNoException();
            parcel2.writeInt(iIdentityHashCode);
            return true;
        }
        String string = parcel.readString();
        String string2 = parcel.readString();
        Bundle bundle = (Bundle) AbstractC0909z.a(parcel, Bundle.CREATOR);
        long j = parcel.readLong();
        AbstractC0909z.d(parcel);
        P(j, bundle, string, string2);
        parcel2.writeNoException();
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.T
    public final int f() {
        return System.identityHashCode(this.f14338f);
    }
}
