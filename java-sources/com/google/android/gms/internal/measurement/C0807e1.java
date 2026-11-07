package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.e1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0807e1 extends AbstractC0828i2 {
    private static final C0807e1 zzf;
    private int zzb;
    private String zzd = "";
    private long zze;

    static {
        C0807e1 c0807e1 = new C0807e1();
        zzf = c0807e1;
        AbstractC0828i2.m(C0807e1.class, c0807e1);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0828i2
    public final Object o(int i10) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new J2(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001", new Object[]{"zzb", "zzd", "zze"});
        }
        if (i11 == 3) {
            return new C0807e1();
        }
        if (i11 == 4) {
            return new C0880t0(zzf);
        }
        if (i11 == 5) {
            return zzf;
        }
        throw null;
    }
}
