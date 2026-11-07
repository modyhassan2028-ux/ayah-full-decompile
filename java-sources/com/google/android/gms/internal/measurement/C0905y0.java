package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.y0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0905y0 extends AbstractC0828i2 {
    private static final C0905y0 zzh;
    private int zzb;
    private int zzd;
    private boolean zzf;
    private String zze = "";
    private InterfaceC0858o2 zzg = I2.f14048v;

    static {
        C0905y0 c0905y0 = new C0905y0();
        zzh = c0905y0;
        AbstractC0828i2.m(C0905y0.class, c0905y0);
    }

    public static C0905y0 w() {
        return zzh;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0828i2
    public final Object o(int i10) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new J2(zzh, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004\u001a", new Object[]{"zzb", "zzd", C0885u0.f14415c, "zze", "zzf", "zzg"});
        }
        if (i11 == 3) {
            return new C0905y0();
        }
        if (i11 == 4) {
            return new C0880t0(zzh);
        }
        if (i11 == 5) {
            return zzh;
        }
        throw null;
    }

    public final boolean p() {
        return (this.zzb & 1) != 0;
    }

    public final boolean q() {
        return (this.zzb & 2) != 0;
    }

    public final String r() {
        return this.zze;
    }

    public final boolean s() {
        return (this.zzb & 4) != 0;
    }

    public final boolean t() {
        return this.zzf;
    }

    public final InterfaceC0858o2 u() {
        return this.zzg;
    }

    public final int v() {
        return this.zzg.size();
    }

    public final int x() {
        int i10;
        switch (this.zzd) {
            case 0:
                i10 = 1;
                break;
            case 1:
                i10 = 2;
                break;
            case 2:
                i10 = 3;
                break;
            case 3:
                i10 = 4;
                break;
            case 4:
                i10 = 5;
                break;
            case 5:
                i10 = 6;
                break;
            case 6:
                i10 = 7;
                break;
            default:
                i10 = 0;
                break;
        }
        if (i10 == 0) {
            return 1;
        }
        return i10;
    }
}
