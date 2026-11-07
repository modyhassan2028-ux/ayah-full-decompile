package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0856o0 extends AbstractC0828i2 {
    private static final C0856o0 zzi;
    private int zzb;
    private int zzd;
    private InterfaceC0858o2 zze;
    private InterfaceC0858o2 zzf;
    private boolean zzg;
    private boolean zzh;

    static {
        C0856o0 c0856o0 = new C0856o0();
        zzi = c0856o0;
        AbstractC0828i2.m(C0856o0.class, c0856o0);
    }

    public C0856o0() {
        I2 i10 = I2.f14048v;
        this.zze = i10;
        this.zzf = i10;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0828i2
    public final Object o(int i10) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new J2(zzi, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001င\u0000\u0002\u001b\u0003\u001b\u0004ဇ\u0001\u0005ဇ\u0002", new Object[]{"zzb", "zzd", "zze", C0900x0.class, "zzf", C0866q0.class, "zzg", "zzh"});
        }
        if (i11 == 3) {
            return new C0856o0();
        }
        if (i11 == 4) {
            return new C0851n0(zzi);
        }
        if (i11 == 5) {
            return zzi;
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
        return this.zze.size();
    }

    public final C0900x0 t(int i10) {
        return (C0900x0) this.zze.get(i10);
    }

    public final InterfaceC0858o2 u() {
        return this.zzf;
    }

    public final int v() {
        return this.zzf.size();
    }

    public final C0866q0 w(int i10) {
        return (C0866q0) this.zzf.get(i10);
    }

    public final void x(int i10, C0900x0 c0900x0) {
        InterfaceC0858o2 interfaceC0858o2 = this.zze;
        if (!((U1) interfaceC0858o2).f14141r) {
            int size = interfaceC0858o2.size();
            this.zze = interfaceC0858o2.i(size + size);
        }
        this.zze.set(i10, c0900x0);
    }

    public final void y(int i10, C0866q0 c0866q0) {
        InterfaceC0858o2 interfaceC0858o2 = this.zzf;
        if (!((U1) interfaceC0858o2).f14141r) {
            int size = interfaceC0858o2.size();
            this.zzf = interfaceC0858o2.i(size + size);
        }
        this.zzf.set(i10, c0866q0);
    }
}
