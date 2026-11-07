package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public final class B0 extends AbstractC0828i2 {
    private static final B0 zzf;
    private int zzb;
    private String zzd = "";
    private String zze = "";

    static {
        B0 b5 = new B0();
        zzf = b5;
        AbstractC0828i2.m(B0.class, b5);
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
            return new B0();
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
}
