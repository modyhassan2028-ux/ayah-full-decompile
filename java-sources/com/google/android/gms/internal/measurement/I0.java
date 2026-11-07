package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public final class I0 extends AbstractC0828i2 {
    private static final I0 zzd;
    private InterfaceC0858o2 zzb = I2.f14048v;

    static {
        I0 i10 = new I0();
        zzd = i10;
        AbstractC0828i2.m(I0.class, i10);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0828i2
    public final Object o(int i10) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new J2(zzd, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"zzb"});
        }
        if (i11 == 3) {
            return new I0();
        }
        if (i11 == 4) {
            return new C0880t0(zzd);
        }
        if (i11 == 5) {
            return zzd;
        }
        throw null;
    }
}
