package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.q0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0866q0 extends AbstractC0828i2 {
    private static final C0866q0 zzl;
    private int zzb;
    private int zzd;
    private String zze = "";
    private InterfaceC0858o2 zzf = I2.f14048v;
    private boolean zzg;
    private C0890v0 zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;

    static {
        C0866q0 c0866q0 = new C0866q0();
        zzl = c0866q0;
        AbstractC0828i2.m(C0866q0.class, c0866q0);
    }

    public static C0861p0 B() {
        return (C0861p0) zzl.h();
    }

    public final boolean A() {
        return this.zzk;
    }

    public final /* synthetic */ void C(String str) {
        this.zzb |= 2;
        this.zze = str;
    }

    public final void D(int i10, C0875s0 c0875s0) {
        InterfaceC0858o2 interfaceC0858o2 = this.zzf;
        if (!((U1) interfaceC0858o2).f14141r) {
            int size = interfaceC0858o2.size();
            this.zzf = interfaceC0858o2.i(size + size);
        }
        this.zzf.set(i10, c0875s0);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0828i2
    public final Object o(int i10) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new J2(zzl, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001င\u0000\u0002ဈ\u0001\u0003\u001b\u0004ဇ\u0002\u0005ဉ\u0003\u0006ဇ\u0004\u0007ဇ\u0005\bဇ\u0006", new Object[]{"zzb", "zzd", "zze", "zzf", C0875s0.class, "zzg", "zzh", "zzi", "zzj", "zzk"});
        }
        if (i11 == 3) {
            return new C0866q0();
        }
        if (i11 == 4) {
            return new C0861p0(zzl);
        }
        if (i11 == 5) {
            return zzl;
        }
        throw null;
    }

    public final boolean p() {
        return (this.zzb & 1) != 0;
    }

    public final int q() {
        return this.zzd;
    }

    public final String r() {
        return this.zze;
    }

    public final List s() {
        return this.zzf;
    }

    public final int t() {
        return this.zzf.size();
    }

    public final C0875s0 u(int i10) {
        return (C0875s0) this.zzf.get(i10);
    }

    public final boolean v() {
        return (this.zzb & 8) != 0;
    }

    public final C0890v0 w() {
        C0890v0 c0890v0 = this.zzh;
        return c0890v0 == null ? C0890v0.y() : c0890v0;
    }

    public final boolean x() {
        return this.zzi;
    }

    public final boolean y() {
        return this.zzj;
    }

    public final boolean z() {
        return (this.zzb & 64) != 0;
    }
}
