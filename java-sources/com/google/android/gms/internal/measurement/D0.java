package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public final class D0 extends AbstractC0828i2 {
    private static final D0 zzg;
    private int zzb;
    private String zzd = "";
    private InterfaceC0858o2 zze = I2.f14048v;
    private boolean zzf;

    static {
        D0 d1 = new D0();
        zzg = d1;
        AbstractC0828i2.m(D0.class, d1);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0828i2
    public final Object o(int i10) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new J2(zzg, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003ဇ\u0001", new Object[]{"zzb", "zzd", "zze", K0.class, "zzf"});
        }
        if (i11 == 3) {
            return new D0();
        }
        if (i11 == 4) {
            return new C0880t0(zzg);
        }
        if (i11 == 5) {
            return zzg;
        }
        throw null;
    }

    public final String p() {
        return this.zzd;
    }
}
