package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.m1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0847m1 extends AbstractC0828i2 {
    private static final C0847m1 zzf;
    private int zzb;
    private int zzd = 1;
    private InterfaceC0858o2 zze = I2.f14048v;

    static {
        C0847m1 c0847m1 = new C0847m1();
        zzf = c0847m1;
        AbstractC0828i2.m(C0847m1.class, c0847m1);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0828i2
    public final Object o(int i10) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new J2(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001᠌\u0000\u0002\u001b", new Object[]{"zzb", "zzd", C0885u0.f14421k, "zze", C0807e1.class});
        }
        if (i11 == 3) {
            return new C0847m1();
        }
        if (i11 == 4) {
            return new C0880t0(zzf);
        }
        if (i11 == 5) {
            return zzf;
        }
        throw null;
    }
}
