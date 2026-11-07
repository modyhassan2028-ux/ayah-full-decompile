package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.z0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0910z0 extends AbstractC0828i2 {
    private static final C0910z0 zzg;
    private int zzb;
    private int zzd;
    private int zze;
    private int zzf;

    static {
        C0910z0 c0910z0 = new C0910z0();
        zzg = c0910z0;
        AbstractC0828i2.m(C0910z0.class, c0910z0);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0828i2
    public final Object o(int i10) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new J2(zzg, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003᠌\u0002", new Object[]{"zzb", "zzd", C0885u0.f14417e, "zze", C0885u0.f14416d, "zzf", C0885u0.f14418f});
        }
        if (i11 == 3) {
            return new C0910z0();
        }
        if (i11 == 4) {
            return new C0880t0(zzg);
        }
        if (i11 == 5) {
            return zzg;
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

    public final int r() {
        int i10;
        int i11 = this.zzf;
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
}
