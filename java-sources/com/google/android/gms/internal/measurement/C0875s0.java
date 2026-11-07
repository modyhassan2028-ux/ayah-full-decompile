package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.s0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0875s0 extends AbstractC0828i2 {
    private static final C0875s0 zzh;
    private int zzb;
    private C0905y0 zzd;
    private C0890v0 zze;
    private boolean zzf;
    private String zzg = "";

    static {
        C0875s0 c0875s0 = new C0875s0();
        zzh = c0875s0;
        AbstractC0828i2.m(C0875s0.class, c0875s0);
    }

    public static C0875s0 x() {
        return zzh;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0828i2
    public final Object o(int i10) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new J2(zzh, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဇ\u0002\u0004ဈ\u0003", new Object[]{"zzb", "zzd", "zze", "zzf", "zzg"});
        }
        if (i11 == 3) {
            return new C0875s0();
        }
        if (i11 == 4) {
            return new C0870r0(zzh);
        }
        if (i11 == 5) {
            return zzh;
        }
        throw null;
    }

    public final boolean p() {
        return (this.zzb & 1) != 0;
    }

    public final C0905y0 q() {
        C0905y0 c0905y0 = this.zzd;
        return c0905y0 == null ? C0905y0.w() : c0905y0;
    }

    public final boolean r() {
        return (this.zzb & 2) != 0;
    }

    public final C0890v0 s() {
        C0890v0 c0890v0 = this.zze;
        return c0890v0 == null ? C0890v0.y() : c0890v0;
    }

    public final boolean t() {
        return (this.zzb & 4) != 0;
    }

    public final boolean u() {
        return this.zzf;
    }

    public final boolean v() {
        return (this.zzb & 8) != 0;
    }

    public final String w() {
        return this.zzg;
    }

    public final /* synthetic */ void y(String str) {
        this.zzb |= 8;
        this.zzg = str;
    }
}
