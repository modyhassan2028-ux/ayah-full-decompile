package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class H0 extends AbstractC0828i2 {
    private static final H0 zzu;
    private int zzb;
    private long zzd;
    private String zze = "";
    private int zzf;
    private InterfaceC0858o2 zzg;
    private InterfaceC0858o2 zzh;
    private InterfaceC0858o2 zzi;
    private String zzj;
    private boolean zzk;
    private InterfaceC0858o2 zzl;
    private InterfaceC0858o2 zzm;
    private String zzn;
    private String zzo;
    private C0 zzp;
    private J0 zzq;
    private M0 zzr;
    private K0 zzs;
    private I0 zzt;

    static {
        H0 h7 = new H0();
        zzu = h7;
        AbstractC0828i2.m(H0.class, h7);
    }

    public H0() {
        I2 i10 = I2.f14048v;
        this.zzg = i10;
        this.zzh = i10;
        this.zzi = i10;
        this.zzj = "";
        this.zzl = i10;
        this.zzm = i10;
        this.zzn = "";
        this.zzo = "";
    }

    public static G0 F() {
        return (G0) zzu.h();
    }

    public static H0 G() {
        return zzu;
    }

    public final String A() {
        return this.zzn;
    }

    public final boolean B() {
        return (this.zzb & 128) != 0;
    }

    public final C0 C() {
        C0 c10 = this.zzp;
        return c10 == null ? C0.v() : c10;
    }

    public final boolean D() {
        return (this.zzb & 512) != 0;
    }

    public final M0 E() {
        M0 m10 = this.zzr;
        return m10 == null ? M0.r() : m10;
    }

    public final void H(int i10, F0 f3) {
        InterfaceC0858o2 interfaceC0858o2 = this.zzh;
        if (!((U1) interfaceC0858o2).f14141r) {
            int size = interfaceC0858o2.size();
            this.zzh = interfaceC0858o2.i(size + size);
        }
        this.zzh.set(i10, f3);
    }

    public final void I() {
        this.zzi = I2.f14048v;
    }

    public final void J() {
        this.zzl = I2.f14048v;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0828i2
    public final Object o(int i10) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new J2(zzu, "\u0004\u0011\u0000\u0001\u0001\u0013\u0011\u0000\u0005\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003င\u0002\u0004\u001b\u0005\u001b\u0006\u001b\u0007ဈ\u0003\bဇ\u0004\t\u001b\n\u001b\u000bဈ\u0005\u000eဈ\u0006\u000fဉ\u0007\u0010ဉ\b\u0011ဉ\t\u0012ဉ\n\u0013ဉ\u000b", new Object[]{"zzb", "zzd", "zze", "zzf", "zzg", L0.class, "zzh", F0.class, "zzi", C0856o0.class, "zzj", "zzk", "zzl", C0901x1.class, "zzm", D0.class, "zzn", "zzo", "zzp", "zzq", "zzr", "zzs", "zzt"});
        }
        if (i11 == 3) {
            return new H0();
        }
        if (i11 == 4) {
            return new G0(zzu);
        }
        if (i11 == 5) {
            return zzu;
        }
        throw null;
    }

    public final boolean p() {
        return (this.zzb & 1) != 0;
    }

    public final long q() {
        return this.zzd;
    }

    public final boolean r() {
        return (this.zzb & 2) != 0;
    }

    public final String s() {
        return this.zze;
    }

    public final InterfaceC0858o2 t() {
        return this.zzg;
    }

    public final int u() {
        return this.zzh.size();
    }

    public final F0 v(int i10) {
        return (F0) this.zzh.get(i10);
    }

    public final InterfaceC0858o2 w() {
        return this.zzi;
    }

    public final InterfaceC0858o2 x() {
        return this.zzl;
    }

    public final int y() {
        return this.zzl.size();
    }

    public final List z() {
        return this.zzm;
    }
}
