package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public final class A0 extends AbstractC0828i2 {
    private static final A0 zzf;
    private int zzb;
    private int zzd;
    private int zze;

    static {
        A0 a9 = new A0();
        zzf = a9;
        AbstractC0828i2.m(A0.class, a9);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0828i2
    public final Object o(int i10) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            C0885u0 c0885u0 = C0885u0.f14417e;
            return new J2(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"zzb", "zzd", c0885u0, "zze", c0885u0});
        }
        if (i11 == 3) {
            return new A0();
        }
        if (i11 == 4) {
            return new C0880t0(zzf);
        }
        if (i11 == 5) {
            return zzf;
        }
        throw null;
    }

    public final int p() {
        int iE0 = p050e8.b.e0(this.zzd);
        if (iE0 == 0) {
            return 1;
        }
        return iE0;
    }

    public final int q() {
        int iE0 = p050e8.b.e0(this.zze);
        if (iE0 == 0) {
            return 1;
        }
        return iE0;
    }
}
