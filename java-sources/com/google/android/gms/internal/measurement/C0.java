package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class C0 extends AbstractC0828i2 {
    private static final C0 zzi;
    private int zzb;
    private InterfaceC0858o2 zzd;
    private InterfaceC0858o2 zze;
    private InterfaceC0858o2 zzf;
    private boolean zzg;
    private InterfaceC0858o2 zzh;

    static {
        C0 c10 = new C0();
        zzi = c10;
        AbstractC0828i2.m(C0.class, c10);
    }

    public C0() {
        I2 i10 = I2.f14048v;
        this.zzd = i10;
        this.zze = i10;
        this.zzf = i10;
        this.zzh = i10;
    }

    public static C0 v() {
        return zzi;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0828i2
    public final Object o(int i10) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new J2(zzi, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0004\u0000\u0001\u001b\u0002\u001b\u0003\u001b\u0004ဇ\u0000\u0005\u001b", new Object[]{"zzb", "zzd", C0910z0.class, "zze", A0.class, "zzf", B0.class, "zzg", "zzh", C0910z0.class});
        }
        if (i11 == 3) {
            return new C0();
        }
        if (i11 == 4) {
            return new C0880t0(zzi);
        }
        if (i11 == 5) {
            return zzi;
        }
        throw null;
    }

    public final List p() {
        return this.zzd;
    }

    public final List q() {
        return this.zze;
    }

    public final List r() {
        return this.zzf;
    }

    public final boolean s() {
        return (this.zzb & 1) != 0;
    }

    public final boolean t() {
        return this.zzg;
    }

    public final InterfaceC0858o2 u() {
        return this.zzh;
    }
}
