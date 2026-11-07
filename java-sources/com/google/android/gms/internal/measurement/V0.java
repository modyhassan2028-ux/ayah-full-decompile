package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public final class V0 extends AbstractC0828i2 {
    private static final V0 zzh;
    private int zzb;
    private int zzd;
    private C0857o1 zze;
    private C0857o1 zzf;
    private boolean zzg;

    static {
        V0 v10 = new V0();
        zzh = v10;
        AbstractC0828i2.m(V0.class, v10);
    }

    public static U0 w() {
        return (U0) zzh.h();
    }

    public final /* synthetic */ void A(boolean z10) {
        this.zzb |= 8;
        this.zzg = z10;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0828i2
    public final Object o(int i10) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new J2(zzh, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဇ\u0003", new Object[]{"zzb", "zzd", "zze", "zzf", "zzg"});
        }
        if (i11 == 3) {
            return new V0();
        }
        if (i11 == 4) {
            return new U0(zzh);
        }
        if (i11 == 5) {
            return zzh;
        }
        throw null;
    }

    public final boolean p() {
        return (this.zzb & 1) != 0;
    }

    public final int q() {
        return this.zzd;
    }

    public final C0857o1 r() {
        C0857o1 c0857o1 = this.zze;
        return c0857o1 == null ? C0857o1.y() : c0857o1;
    }

    public final boolean s() {
        return (this.zzb & 4) != 0;
    }

    public final C0857o1 t() {
        C0857o1 c0857o1 = this.zzf;
        return c0857o1 == null ? C0857o1.y() : c0857o1;
    }

    public final boolean u() {
        return (this.zzb & 8) != 0;
    }

    public final boolean v() {
        return this.zzg;
    }

    public final /* synthetic */ void x(int i10) {
        this.zzb |= 1;
        this.zzd = i10;
    }

    public final /* synthetic */ void y(C0857o1 c0857o1) {
        this.zze = c0857o1;
        this.zzb |= 2;
    }

    public final /* synthetic */ void z(C0857o1 c0857o1) {
        this.zzf = c0857o1;
        this.zzb |= 4;
    }
}
