package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.h1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0822h1 extends AbstractC0828i2 {
    private static final C0822h1 zzg;
    private int zzb;
    private String zzd = "";
    private String zze = "";
    private R0 zzf;

    static {
        C0822h1 c0822h1 = new C0822h1();
        zzg = c0822h1;
        AbstractC0828i2.m(C0822h1.class, c0822h1);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0828i2
    public final Object o(int i10) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new J2(zzg, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဉ\u0002", new Object[]{"zzb", "zzd", "zze", "zzf"});
        }
        if (i11 == 3) {
            return new C0822h1();
        }
        if (i11 == 4) {
            return new C0880t0(zzg);
        }
        if (i11 == 5) {
            return zzg;
        }
        throw null;
    }
}
