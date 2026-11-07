package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.v1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0891v1 extends AbstractC0828i2 {
    private static final C0891v1 zzd;
    private InterfaceC0858o2 zzb = I2.f14048v;

    static {
        C0891v1 c0891v1 = new C0891v1();
        zzd = c0891v1;
        AbstractC0828i2.m(C0891v1.class, c0891v1);
    }

    public static C0891v1 r() {
        return zzd;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0828i2
    public final Object o(int i10) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new J2(zzd, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzb", C0896w1.class});
        }
        if (i11 == 3) {
            return new C0891v1();
        }
        if (i11 == 4) {
            return new C0880t0(zzd);
        }
        if (i11 == 5) {
            return zzd;
        }
        throw null;
    }

    public final List p() {
        return this.zzb;
    }

    public final int q() {
        return this.zzb.size();
    }
}
