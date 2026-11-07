package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.j1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0832j1 extends AbstractC0828i2 {
    private static final C0832j1 zzh;
    private int zzb;
    private InterfaceC0858o2 zzd = I2.f14048v;
    private String zze = "";
    private String zzf = "";
    private int zzg;

    static {
        C0832j1 c0832j1 = new C0832j1();
        zzh = c0832j1;
        AbstractC0828i2.m(C0832j1.class, c0832j1);
    }

    public static C0827i1 w() {
        return (C0827i1) zzh.h();
    }

    public static C0827i1 x(C0832j1 c0832j1) {
        AbstractC0823h2 abstractC0823h2H = zzh.h();
        abstractC0823h2H.f(c0832j1);
        return (C0827i1) abstractC0823h2H;
    }

    public final /* synthetic */ void A(ArrayList arrayList) {
        E();
        T1.c(arrayList, this.zzd);
    }

    public final void B() {
        this.zzd = I2.f14048v;
    }

    public final /* synthetic */ void C(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zze = str;
    }

    public final /* synthetic */ void D(String str) {
        str.getClass();
        this.zzb |= 2;
        this.zzf = str;
    }

    public final void E() {
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
            return new J2(zzh, "\u0004\u0004\u0000\u0001\u0001\t\u0004\u0000\u0001\u0000\u0001\u001b\u0007ဈ\u0000\bဈ\u0001\t᠌\u0002", new Object[]{"zzb", "zzd", C0842l1.class, "zze", "zzf", "zzg", C0885u0.j});
        }
        if (i11 == 3) {
            return new C0832j1();
        }
        if (i11 == 4) {
            return new C0827i1(zzh);
        }
        if (i11 == 5) {
            return zzh;
        }
        throw null;
    }

    public final List p() {
        return this.zzd;
    }

    public final int q() {
        return this.zzd.size();
    }

    public final C0842l1 r(int i10) {
        return (C0842l1) this.zzd.get(i10);
    }

    public final boolean s() {
        return (this.zzb & 1) != 0;
    }

    public final String t() {
        return this.zze;
    }

    public final boolean u() {
        return (this.zzb & 2) != 0;
    }

    public final String v() {
        return this.zzf;
    }

    public final /* synthetic */ void y(int i10, C0842l1 c0842l1) {
        E();
        this.zzd.set(i10, c0842l1);
    }

    public final /* synthetic */ void z(C0842l1 c0842l1) {
        E();
        this.zzd.add(c0842l1);
    }
}
