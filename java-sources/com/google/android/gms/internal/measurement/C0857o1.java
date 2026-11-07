package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.o1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0857o1 extends AbstractC0828i2 {
    private static final C0857o1 zzg;
    private InterfaceC0853n2 zzb;
    private InterfaceC0853n2 zzd;
    private InterfaceC0858o2 zze;
    private InterfaceC0858o2 zzf;

    static {
        C0857o1 c0857o1 = new C0857o1();
        zzg = c0857o1;
        AbstractC0828i2.m(C0857o1.class, c0857o1);
    }

    public C0857o1() {
        C0897w2 c0897w2 = C0897w2.f14499v;
        this.zzb = c0897w2;
        this.zzd = c0897w2;
        I2 i10 = I2.f14048v;
        this.zze = i10;
        this.zzf = i10;
    }

    public static C0852n1 x() {
        return (C0852n1) zzg.h();
    }

    public static C0857o1 y() {
        return zzg;
    }

    public final void A() {
        this.zzb = C0897w2.f14499v;
    }

    public final void B(List list) {
        RandomAccess randomAccess = this.zzd;
        if (!((U1) randomAccess).f14141r) {
            C0897w2 c0897w2 = (C0897w2) randomAccess;
            int i10 = c0897w2.f14501t;
            this.zzd = c0897w2.i(i10 + i10);
        }
        T1.c(list, this.zzd);
    }

    public final void C() {
        this.zzd = C0897w2.f14499v;
    }

    public final void D(ArrayList arrayList) {
        InterfaceC0858o2 interfaceC0858o2 = this.zze;
        if (!((U1) interfaceC0858o2).f14141r) {
            int size = interfaceC0858o2.size();
            this.zze = interfaceC0858o2.i(size + size);
        }
        T1.c(arrayList, this.zze);
    }

    public final void E() {
        this.zze = I2.f14048v;
    }

    public final void F(Iterable iterable) {
        InterfaceC0858o2 interfaceC0858o2 = this.zzf;
        if (!((U1) interfaceC0858o2).f14141r) {
            int size = interfaceC0858o2.size();
            this.zzf = interfaceC0858o2.i(size + size);
        }
        T1.c(iterable, this.zzf);
    }

    public final void G() {
        this.zzf = I2.f14048v;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0828i2
    public final Object o(int i10) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new J2(zzg, "\u0004\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0004\u0000\u0001\u0015\u0002\u0015\u0003\u001b\u0004\u001b", new Object[]{"zzb", "zzd", "zze", C0792b1.class, "zzf", C0867q1.class});
        }
        if (i11 == 3) {
            return new C0857o1();
        }
        if (i11 == 4) {
            return new C0852n1(zzg);
        }
        if (i11 == 5) {
            return zzg;
        }
        throw null;
    }

    public final List p() {
        return this.zzb;
    }

    public final int q() {
        return ((C0897w2) this.zzb).size();
    }

    public final List r() {
        return this.zzd;
    }

    public final int s() {
        return ((C0897w2) this.zzd).size();
    }

    public final InterfaceC0858o2 t() {
        return this.zze;
    }

    public final int u() {
        return this.zze.size();
    }

    public final List v() {
        return this.zzf;
    }

    public final int w() {
        return this.zzf.size();
    }

    public final void z(Iterable iterable) {
        RandomAccess randomAccess = this.zzb;
        if (!((U1) randomAccess).f14141r) {
            C0897w2 c0897w2 = (C0897w2) randomAccess;
            int i10 = c0897w2.f14501t;
            this.zzb = c0897w2.i(i10 + i10);
        }
        T1.c(iterable, this.zzb);
    }
}
