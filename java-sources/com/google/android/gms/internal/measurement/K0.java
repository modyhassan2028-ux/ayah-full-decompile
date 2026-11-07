package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public final class K0 extends AbstractC0828i2 {
    private static final K0 zzf;
    private int zzb;
    private String zzd = "";
    private String zze = "";

    static {
        K0 k7 = new K0();
        zzf = k7;
        AbstractC0828i2.m(K0.class, k7);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0828i2
    public final Object o(int i10) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new J2(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zzb", "zzd", "zze"});
        }
        if (i11 == 3) {
            return new K0();
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
