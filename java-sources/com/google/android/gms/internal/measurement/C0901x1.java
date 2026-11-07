package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.x1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0901x1 extends AbstractC0828i2 {
    private static final C0901x1 zzf;
    private int zzb;
    private InterfaceC0858o2 zzd = I2.f14048v;
    private C0891v1 zze;

    static {
        C0901x1 c0901x1 = new C0901x1();
        zzf = c0901x1;
        AbstractC0828i2.m(C0901x1.class, c0901x1);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0828i2
    public final Object o(int i10) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new J2(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"zzb", "zzd", C0906y1.class, "zze"});
        }
        if (i11 == 3) {
            return new C0901x1();
        }
        if (i11 == 4) {
            return new C0880t0(zzf);
        }
        if (i11 == 5) {
            return zzf;
        }
        throw null;
    }

    public final List p() {
        return this.zzd;
    }

    public final C0891v1 q() {
        C0891v1 c0891v1 = this.zze;
        return c0891v1 == null ? C0891v1.r() : c0891v1;
    }
}
