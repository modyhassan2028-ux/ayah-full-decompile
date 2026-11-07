package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public final class F0 extends AbstractC0828i2 {
    private static final F0 zzh;
    private int zzb;
    private String zzd = "";
    private boolean zze;
    private boolean zzf;
    private int zzg;

    static {
        F0 f3 = new F0();
        zzh = f3;
        AbstractC0828i2.m(F0.class, f3);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0828i2
    public final Object o(int i10) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new J2(zzh, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004င\u0003", new Object[]{"zzb", "zzd", "zze", "zzf", "zzg"});
        }
        if (i11 == 3) {
            return new F0();
        }
        if (i11 == 4) {
            return new E0(zzh);
        }
        if (i11 == 5) {
            return zzh;
        }
        throw null;
    }

    public final String p() {
        return this.zzd;
    }

    public final boolean q() {
        return (this.zzb & 2) != 0;
    }

    public final boolean r() {
        return this.zze;
    }

    public final boolean s() {
        return (this.zzb & 4) != 0;
    }

    public final boolean t() {
        return this.zzf;
    }

    public final boolean u() {
        return (this.zzb & 8) != 0;
    }

    public final int v() {
        return this.zzg;
    }

    public final /* synthetic */ void w(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zzd = str;
    }
}
