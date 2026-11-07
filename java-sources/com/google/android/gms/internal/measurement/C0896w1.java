package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.w1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0896w1 extends AbstractC0828i2 {
    private static final C0896w1 zzf;
    private int zzb;
    private String zzd = "";
    private InterfaceC0858o2 zze = I2.f14048v;

    static {
        C0896w1 c0896w1 = new C0896w1();
        zzf = c0896w1;
        AbstractC0828i2.m(C0896w1.class, c0896w1);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0828i2
    public final Object o(int i10) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new J2(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b", new Object[]{"zzb", "zzd", "zze", C0906y1.class});
        }
        if (i11 == 3) {
            return new C0896w1();
        }
        if (i11 == 4) {
            return new C0880t0(zzf);
        }
        if (i11 == 5) {
            return zzf;
        }
        throw null;
    }

    public final String p() {
        return this.zzd;
    }

    public final List q() {
        return this.zze;
    }
}
