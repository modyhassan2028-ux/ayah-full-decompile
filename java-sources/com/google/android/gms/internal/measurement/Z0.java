package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class Z0 extends AbstractC0828i2 {
    private static final Z0 zzd;
    private InterfaceC0858o2 zzb = I2.f14048v;

    static {
        Z0 z10 = new Z0();
        zzd = z10;
        AbstractC0828i2.m(Z0.class, z10);
    }

    public static W0 q() {
        return (W0) zzd.h();
    }

    public static Z0 r() {
        return zzd;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0828i2
    public final Object o(int i10) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new J2(zzd, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzb", Y0.class});
        }
        if (i11 == 3) {
            return new Z0();
        }
        if (i11 == 4) {
            return new W0(zzd);
        }
        if (i11 == 5) {
            return zzd;
        }
        throw null;
    }

    public final List p() {
        return this.zzb;
    }

    public final void s(ArrayList arrayList) {
        InterfaceC0858o2 interfaceC0858o2 = this.zzb;
        if (!((U1) interfaceC0858o2).f14141r) {
            int size = interfaceC0858o2.size();
            this.zzb = interfaceC0858o2.i(size + size);
        }
        T1.c(arrayList, this.zzb);
    }
}
