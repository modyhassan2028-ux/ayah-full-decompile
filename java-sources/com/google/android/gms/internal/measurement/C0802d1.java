package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.d1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0802d1 extends AbstractC0828i2 {
    private static final C0802d1 zzj;
    private int zzb;
    private InterfaceC0858o2 zzd = I2.f14048v;
    private String zze = "";
    private long zzf;
    private long zzg;
    private int zzh;
    private long zzi;

    static {
        C0802d1 c0802d1 = new C0802d1();
        zzj = c0802d1;
        AbstractC0828i2.m(C0802d1.class, c0802d1);
    }

    public static C0797c1 z() {
        return (C0797c1) zzj.h();
    }

    public final /* synthetic */ void A(int i10, C0817g1 c0817g1) {
        J();
        this.zzd.set(i10, c0817g1);
    }

    public final /* synthetic */ void B(C0817g1 c0817g1) {
        c0817g1.getClass();
        J();
        this.zzd.add(c0817g1);
    }

    public final /* synthetic */ void C(Iterable iterable) {
        J();
        T1.c(iterable, this.zzd);
    }

    public final void D() {
        this.zzd = I2.f14048v;
    }

    public final /* synthetic */ void E(int i10) {
        J();
        this.zzd.remove(i10);
    }

    public final /* synthetic */ void F(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zze = str;
    }

    public final /* synthetic */ void G(long j) {
        this.zzb |= 2;
        this.zzf = j;
    }

    public final /* synthetic */ void H(long j) {
        this.zzb |= 4;
        this.zzg = j;
    }

    public final /* synthetic */ void I(long j) {
        this.zzb |= 16;
        this.zzi = j;
    }

    public final void J() {
        InterfaceC0858o2 interfaceC0858o2 = this.zzd;
        if (((U1) interfaceC0858o2).f14141r) {
            return;
        }
        int size = interfaceC0858o2.size();
        this.zzd = interfaceC0858o2.i(size + size);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0828i2
    public final Object o(int i10) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new J2(zzj, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000\u0003ဂ\u0001\u0004ဂ\u0002\u0005င\u0003\u0006ဂ\u0004", new Object[]{"zzb", "zzd", C0817g1.class, "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (i11 == 3) {
            return new C0802d1();
        }
        if (i11 == 4) {
            return new C0797c1(zzj);
        }
        if (i11 == 5) {
            return zzj;
        }
        throw null;
    }

    public final List p() {
        return this.zzd;
    }

    public final int q() {
        return this.zzd.size();
    }

    public final C0817g1 r(int i10) {
        return (C0817g1) this.zzd.get(i10);
    }

    public final String s() {
        return this.zze;
    }

    public final boolean t() {
        return (this.zzb & 2) != 0;
    }

    public final long u() {
        return this.zzf;
    }

    public final boolean v() {
        return (this.zzb & 4) != 0;
    }

    public final long w() {
        return this.zzg;
    }

    public final boolean x() {
        return (this.zzb & 8) != 0;
    }

    public final int y() {
        return this.zzh;
    }
}
