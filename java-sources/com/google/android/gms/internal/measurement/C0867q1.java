package com.google.android.gms.internal.measurement;

import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.q1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0867q1 extends AbstractC0828i2 {
    private static final C0867q1 zzf;
    private int zzb;
    private int zzd;
    private InterfaceC0853n2 zze = C0897w2.f14499v;

    static {
        C0867q1 c0867q1 = new C0867q1();
        zzf = c0867q1;
        AbstractC0828i2.m(C0867q1.class, c0867q1);
    }

    public static C0862p1 u() {
        return (C0862p1) zzf.h();
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0828i2
    public final Object o(int i10) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new J2(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001င\u0000\u0002\u0014", new Object[]{"zzb", "zzd", "zze"});
        }
        if (i11 == 3) {
            return new C0867q1();
        }
        if (i11 == 4) {
            return new C0862p1(zzf);
        }
        if (i11 == 5) {
            return zzf;
        }
        throw null;
    }

    public final boolean p() {
        return (this.zzb & 1) != 0;
    }

    public final int q() {
        return this.zzd;
    }

    public final List r() {
        return this.zze;
    }

    public final int s() {
        return ((C0897w2) this.zze).size();
    }

    public final long t(int i10) {
        return ((C0897w2) this.zze).c(i10);
    }

    public final /* synthetic */ void v(int i10) {
        this.zzb |= 1;
        this.zzd = i10;
    }

    public final void w(List list) {
        RandomAccess randomAccess = this.zze;
        if (!((U1) randomAccess).f14141r) {
            C0897w2 c0897w2 = (C0897w2) randomAccess;
            int i10 = c0897w2.f14501t;
            this.zze = c0897w2.i(i10 + i10);
        }
        T1.c(list, this.zze);
    }
}
