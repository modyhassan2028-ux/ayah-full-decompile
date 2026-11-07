package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.s1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0876s1 extends AbstractC0828i2 {
    private static final C0876s1 zzg;
    private int zzb;
    private int zzd;
    private int zze;
    private int zzf;

    static {
        C0876s1 c0876s1 = new C0876s1();
        zzg = c0876s1;
        AbstractC0828i2.m(C0876s1.class, c0876s1);
    }

    public static C0871r1 q() {
        return (C0871r1) zzg.h();
    }

    public static C0876s1 r() {
        return zzg;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0828i2
    public final Object o(int i10) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new J2(zzg, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003᠌\u0002", new Object[]{"zzb", "zzd", C0885u0.f14424n, "zze", C0885u0.f14422l, "zzf", C0885u0.f14423m});
        }
        if (i11 == 3) {
            return new C0876s1();
        }
        if (i11 == 4) {
            return new C0871r1(zzg);
        }
        if (i11 == 5) {
            return zzg;
        }
        throw null;
    }

    public final int p() {
        int iK = android.support.v4.media.session.p.k(this.zze);
        if (iK == 0) {
            return 1;
        }
        return iK;
    }

    public final void s(int i10) {
        this.zze = android.support.v4.media.session.p.m(i10);
        this.zzb |= 2;
    }

    public final int t() {
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

    /* JADX WARN: Code duplicated, block: B:15:0x0017 A[PHI: r3
      0x0017: PHI (r3v1 int) = (r3v0 int), (r3v2 int) binds: [B:7:0x0009, B:11:0x000f] A[DONT_GENERATE, DONT_INLINE]] */
    public final int u() {
        int i10;
        int i11 = this.zzf;
        if (i11 != 0) {
            i10 = 2;
            if (i11 != 1) {
                int i12 = 3;
                if (i11 != 2) {
                    i10 = 4;
                    if (i11 != 3) {
                        i12 = 5;
                        if (i11 != 4) {
                            i10 = i11 != 5 ? 0 : 6;
                        } else {
                            i10 = i12;
                        }
                    }
                } else {
                    i10 = i12;
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

    public final /* synthetic */ void v(int i10) {
        this.zzd = i10 - 1;
        this.zzb |= 1;
    }

    public final /* synthetic */ void w(int i10) {
        this.zzf = i10 - 1;
        this.zzb |= 4;
    }
}
