package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public final class Y0 extends AbstractC0828i2 {
    private static final Y0 zzf;
    private int zzb;
    private int zzd;
    private int zze;

    static {
        Y0 y10 = new Y0();
        zzf = y10;
        AbstractC0828i2.m(Y0.class, y10);
    }

    public static X0 p() {
        return (X0) zzf.h();
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0828i2
    public final Object o(int i10) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new J2(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"zzb", "zzd", C0885u0.f14419h, "zze", C0885u0.f14420i});
        }
        if (i11 == 3) {
            return new Y0();
        }
        if (i11 == 4) {
            return new X0(zzf);
        }
        if (i11 == 5) {
            return zzf;
        }
        throw null;
    }

    public final int q() {
        int i10;
        int i11 = this.zzd;
        if (i11 != 0) {
            i10 = 2;
            if (i11 != 1) {
                if (i11 != 2) {
                    i10 = 4;
                    if (i11 != 3) {
                        i10 = i11 != 4 ? 0 : 5;
                    }
                } else {
                    i10 = 3;
                }
            }
        } else {
            i10 = 1;
        }
        if (i10 == 0) {
            return 1;
        }
        return i10;
    }

    public final int r() {
        int i10;
        int i11 = this.zze;
        if (i11 != 0) {
            i10 = 2;
            if (i11 != 1) {
                i10 = i11 != 2 ? 0 : 3;
            }
        } else {
            i10 = 1;
        }
        if (i10 == 0) {
            return 1;
        }
        return i10;
    }

    public final /* synthetic */ void s(int i10) {
        this.zzd = i10 - 1;
        this.zzb |= 1;
    }

    public final /* synthetic */ void t(int i10) {
        this.zze = i10 - 1;
        this.zzb |= 2;
    }
}
