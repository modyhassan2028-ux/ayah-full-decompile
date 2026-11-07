package com.google.android.gms.internal.measurement;

import android.os.Build;
import java.util.ArrayList;
import java.util.List;
import java.util.RandomAccess;
import java.util.Set;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.l1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0842l1 extends AbstractC0828i2 {
    private static final C0842l1 zzat;
    private int zzA;
    private String zzB;
    private String zzC;
    private boolean zzD;
    private InterfaceC0858o2 zzE;
    private String zzF;
    private int zzG;
    private int zzH;
    private int zzI;
    private String zzJ;
    private long zzK;
    private long zzL;
    private String zzM;
    private String zzN;
    private int zzO;
    private String zzP;
    private C0847m1 zzQ;
    private InterfaceC0848m2 zzR;
    private long zzS;
    private long zzT;
    private String zzU;
    private String zzV;
    private int zzW;
    private boolean zzX;
    private String zzY;
    private boolean zzZ;
    private C0822h1 zzaa;
    private String zzab;
    private InterfaceC0858o2 zzac;
    private String zzad;
    private long zzae;
    private boolean zzaf;
    private String zzag;
    private boolean zzah;
    private String zzai;
    private int zzaj;
    private String zzak;
    private T0 zzal;
    private int zzam;
    private Q0 zzan;
    private String zzao;
    private C0876s1 zzap;
    private long zzaq;
    private String zzar;
    private Z0 zzas;
    private int zzb;
    private int zzd;
    private int zze;
    private InterfaceC0858o2 zzf;
    private InterfaceC0858o2 zzg;
    private long zzh;
    private long zzi;
    private long zzj;
    private long zzk;
    private long zzl;
    private String zzm;
    private String zzn;
    private String zzo;
    private String zzp;
    private int zzq;
    private String zzr;
    private String zzs;
    private String zzt;
    private long zzu;
    private long zzv;
    private String zzw;
    private boolean zzx;
    private String zzy;
    private long zzz;

    static {
        C0842l1 c0842l1 = new C0842l1();
        zzat = c0842l1;
        AbstractC0828i2.m(C0842l1.class, c0842l1);
    }

    public C0842l1() {
        I2 i10 = I2.f14048v;
        this.zzf = i10;
        this.zzg = i10;
        this.zzm = "";
        this.zzn = "";
        this.zzo = "";
        this.zzp = "";
        this.zzr = "";
        this.zzs = "";
        this.zzt = "";
        this.zzw = "";
        this.zzy = "";
        this.zzB = "";
        this.zzC = "";
        this.zzE = i10;
        this.zzF = "";
        this.zzJ = "";
        this.zzM = "";
        this.zzN = "";
        this.zzP = "";
        this.zzR = C0833j2.f14340v;
        this.zzU = "";
        this.zzV = "";
        this.zzY = "";
        this.zzab = "";
        this.zzac = i10;
        this.zzad = "";
        this.zzag = "";
        this.zzai = "";
        this.zzak = "";
        this.zzao = "";
        this.zzar = "";
    }

    public static C0837k1 U() {
        return (C0837k1) zzat.h();
    }

    public static C0837k1 V(C0842l1 c0842l1) {
        AbstractC0823h2 abstractC0823h2H = zzat.h();
        abstractC0823h2H.f(c0842l1);
        return (C0837k1) abstractC0823h2H;
    }

    public final long A() {
        return this.zzz;
    }

    public final boolean A0() {
        return (this.zzd & 131072) != 0;
    }

    public final /* synthetic */ void A1(boolean z10) {
        this.zzb |= 131072;
        this.zzx = z10;
    }

    public final boolean B() {
        return (this.zzb & 1048576) != 0;
    }

    public final String B0() {
        return this.zzag;
    }

    public final /* synthetic */ void B1() {
        this.zzb &= -131073;
        this.zzx = false;
    }

    public final int C() {
        return this.zzA;
    }

    public final boolean C0() {
        return (this.zzd & 262144) != 0;
    }

    public final /* synthetic */ void C1(String str) {
        this.zzb |= 262144;
        this.zzy = str;
    }

    public final String D() {
        return this.zzB;
    }

    public final boolean D0() {
        return this.zzah;
    }

    public final /* synthetic */ void D1() {
        this.zzb &= -262145;
        this.zzy = zzat.zzy;
    }

    public final String E() {
        return this.zzC;
    }

    public final boolean E0() {
        return (this.zzd & 524288) != 0;
    }

    public final /* synthetic */ void E1(long j) {
        this.zzb |= 524288;
        this.zzz = j;
    }

    public final boolean F() {
        return (this.zzb & 8388608) != 0;
    }

    public final String F0() {
        return this.zzai;
    }

    public final /* synthetic */ void F1(int i10) {
        this.zzb |= 1048576;
        this.zzA = i10;
    }

    public final boolean G() {
        return this.zzD;
    }

    public final int G0() {
        return this.zzaj;
    }

    public final /* synthetic */ void G1(String str) {
        this.zzb |= 2097152;
        this.zzB = str;
    }

    public final InterfaceC0858o2 H() {
        return this.zzE;
    }

    public final boolean H0() {
        return (this.zzd & 4194304) != 0;
    }

    public final /* synthetic */ void H1() {
        this.zzb &= -2097153;
        this.zzB = zzat.zzB;
    }

    public final String I() {
        return this.zzF;
    }

    public final T0 I0() {
        T0 t2 = this.zzal;
        return t2 == null ? T0.x() : t2;
    }

    public final /* synthetic */ void I1(String str) {
        str.getClass();
        this.zzb |= 4194304;
        this.zzC = str;
    }

    public final boolean J() {
        return (this.zzb & 33554432) != 0;
    }

    public final boolean J0() {
        return (this.zzd & 8388608) != 0;
    }

    public final /* synthetic */ void J1() {
        this.zzb |= 8388608;
        this.zzD = false;
    }

    public final int K() {
        return this.zzG;
    }

    public final int K0() {
        return this.zzam;
    }

    public final void K1(ArrayList arrayList) {
        InterfaceC0858o2 interfaceC0858o2 = this.zzE;
        if (!((U1) interfaceC0858o2).f14141r) {
            int size = interfaceC0858o2.size();
            this.zzE = interfaceC0858o2.i(size + size);
        }
        T1.c(arrayList, this.zzE);
    }

    public final boolean L() {
        return (this.zzb & 536870912) != 0;
    }

    public final boolean L0() {
        return (this.zzd & 16777216) != 0;
    }

    public final void L1() {
        this.zzE = I2.f14048v;
    }

    public final long M() {
        return this.zzK;
    }

    public final Q0 M0() {
        Q0 q10 = this.zzan;
        return q10 == null ? Q0.P() : q10;
    }

    public final /* synthetic */ void M1(String str) {
        this.zzb |= 16777216;
        this.zzF = str;
    }

    public final boolean N() {
        return (this.zzb & Integer.MIN_VALUE) != 0;
    }

    public final boolean N0() {
        return (this.zzd & 67108864) != 0;
    }

    public final /* synthetic */ void N1(int i10) {
        this.zzb |= 33554432;
        this.zzG = i10;
    }

    public final String O() {
        return this.zzM;
    }

    public final C0876s1 O0() {
        C0876s1 c0876s1 = this.zzap;
        return c0876s1 == null ? C0876s1.r() : c0876s1;
    }

    public final /* synthetic */ void O1() {
        this.zzb &= -268435457;
        this.zzJ = zzat.zzJ;
    }

    public final boolean P() {
        return (this.zzb & 1) != 0;
    }

    public final int P0() {
        return this.zze;
    }

    public final List P1() {
        return this.zzf;
    }

    public final boolean Q() {
        return (this.zzd & 134217728) != 0;
    }

    public final /* synthetic */ void Q0(long j) {
        this.zzb |= 536870912;
        this.zzK = j;
    }

    public final void Q1() {
        InterfaceC0858o2 interfaceC0858o2 = this.zzf;
        if (((U1) interfaceC0858o2).f14141r) {
            return;
        }
        int size = interfaceC0858o2.size();
        this.zzf = interfaceC0858o2.i(size + size);
    }

    public final long R() {
        return this.zzaq;
    }

    public final /* synthetic */ void R0(String str) {
        str.getClass();
        this.zzb |= Integer.MIN_VALUE;
        this.zzM = str;
    }

    public final void R1() {
        InterfaceC0858o2 interfaceC0858o2 = this.zzg;
        if (((U1) interfaceC0858o2).f14141r) {
            return;
        }
        int size = interfaceC0858o2.size();
        this.zzg = interfaceC0858o2.i(size + size);
    }

    public final boolean S() {
        return (this.zzd & 536870912) != 0;
    }

    public final /* synthetic */ void S0() {
        this.zzb &= Integer.MAX_VALUE;
        this.zzM = zzat.zzM;
    }

    public final int S1() {
        return this.zzf.size();
    }

    public final Z0 T() {
        Z0 z10 = this.zzas;
        return z10 == null ? Z0.r() : z10;
    }

    public final /* synthetic */ void T0(int i10) {
        this.zzd |= 2;
        this.zzO = i10;
    }

    public final C0802d1 T1(int i10) {
        return (C0802d1) this.zzf.get(i10);
    }

    public final void U0(ArrayList arrayList) {
        RandomAccess randomAccess = this.zzR;
        if (!((U1) randomAccess).f14141r) {
            C0833j2 c0833j2 = (C0833j2) randomAccess;
            int i10 = c0833j2.f14342t;
            this.zzR = c0833j2.i(i10 + i10);
        }
        T1.c(arrayList, this.zzR);
    }

    public final InterfaceC0858o2 U1() {
        return this.zzg;
    }

    public final /* synthetic */ void V0(long j) {
        this.zzd |= 16;
        this.zzS = j;
    }

    public final int V1() {
        return this.zzg.size();
    }

    public final /* synthetic */ void W() {
        this.zzb |= 1;
        this.zze = 1;
    }

    public final /* synthetic */ void W0(long j) {
        this.zzd |= 32;
        this.zzT = j;
    }

    public final C0886u1 W1(int i10) {
        return (C0886u1) this.zzg.get(i10);
    }

    public final /* synthetic */ void X(int i10, C0802d1 c0802d1) {
        Q1();
        this.zzf.set(i10, c0802d1);
    }

    public final /* synthetic */ void X0(String str) {
        this.zzd |= 128;
        this.zzV = str;
    }

    public final boolean X1() {
        return (this.zzb & 2) != 0;
    }

    public final /* synthetic */ void Y(C0802d1 c0802d1) {
        Q1();
        this.zzf.add(c0802d1);
    }

    public final /* synthetic */ void Y0(String str) {
        str.getClass();
        this.zzd |= 8192;
        this.zzab = str;
    }

    public final long Y1() {
        return this.zzh;
    }

    public final /* synthetic */ void Z(Iterable iterable) {
        Q1();
        T1.c(iterable, this.zzf);
    }

    public final /* synthetic */ void Z0() {
        this.zzd &= -8193;
        this.zzab = zzat.zzab;
    }

    public final boolean Z1() {
        return (this.zzb & 4) != 0;
    }

    public final void a0() {
        this.zzf = I2.f14048v;
    }

    public final void a1(Set set) {
        InterfaceC0858o2 interfaceC0858o2 = this.zzac;
        if (!((U1) interfaceC0858o2).f14141r) {
            int size = interfaceC0858o2.size();
            this.zzac = interfaceC0858o2.i(size + size);
        }
        T1.c(set, this.zzac);
    }

    public final long a2() {
        return this.zzi;
    }

    public final /* synthetic */ void b0(int i10) {
        Q1();
        this.zzf.remove(i10);
    }

    public final /* synthetic */ void b1(String str) {
        str.getClass();
        this.zzd |= 16384;
        this.zzad = str;
    }

    public final boolean b2() {
        return (this.zzb & 8) != 0;
    }

    public final /* synthetic */ void c0(int i10, C0886u1 c0886u1) {
        R1();
        this.zzg.set(i10, c0886u1);
    }

    public final /* synthetic */ void c1(long j) {
        this.zzd |= 32768;
        this.zzae = j;
    }

    public final long c2() {
        return this.zzj;
    }

    public final /* synthetic */ void d0(C0886u1 c0886u1) {
        R1();
        this.zzg.add(c0886u1);
    }

    public final /* synthetic */ void d1(boolean z10) {
        this.zzd |= 65536;
        this.zzaf = z10;
    }

    public final boolean d2() {
        return (this.zzb & 16) != 0;
    }

    public final /* synthetic */ void e0(int i10) {
        R1();
        this.zzg.remove(i10);
    }

    public final /* synthetic */ void e1(String str) {
        this.zzd |= 131072;
        this.zzag = str;
    }

    public final long e2() {
        return this.zzk;
    }

    public final /* synthetic */ void f0(long j) {
        this.zzb |= 2;
        this.zzh = j;
    }

    public final /* synthetic */ void f1(boolean z10) {
        this.zzd |= 262144;
        this.zzah = z10;
    }

    public final boolean f2() {
        return (this.zzb & 32) != 0;
    }

    public final /* synthetic */ void g0() {
        this.zzb &= -3;
        this.zzh = 0L;
    }

    public final /* synthetic */ void g1(String str) {
        str.getClass();
        this.zzd |= 524288;
        this.zzai = str;
    }

    public final long g2() {
        return this.zzl;
    }

    public final /* synthetic */ void h0(long j) {
        this.zzb |= 4;
        this.zzi = j;
    }

    public final /* synthetic */ void h1(int i10) {
        this.zzd |= 1048576;
        this.zzaj = i10;
    }

    public final String h2() {
        return this.zzm;
    }

    public final /* synthetic */ void i0(long j) {
        this.zzb |= 8;
        this.zzj = j;
    }

    public final /* synthetic */ void i1(T0 t2) {
        this.zzal = t2;
        this.zzd |= 4194304;
    }

    public final String i2() {
        return this.zzn;
    }

    public final /* synthetic */ void j0(long j) {
        this.zzb |= 16;
        this.zzk = j;
    }

    public final /* synthetic */ void j1(int i10) {
        this.zzd |= 8388608;
        this.zzam = i10;
    }

    public final String j2() {
        return this.zzo;
    }

    public final /* synthetic */ void k0() {
        this.zzb &= -17;
        this.zzk = 0L;
    }

    public final /* synthetic */ void k1(Q0 q10) {
        this.zzan = q10;
        this.zzd |= 16777216;
    }

    public final String k2() {
        return this.zzp;
    }

    public final /* synthetic */ void l0(long j) {
        this.zzb |= 32;
        this.zzl = j;
    }

    public final /* synthetic */ void l1(C0876s1 c0876s1) {
        this.zzap = c0876s1;
        this.zzd |= 67108864;
    }

    public final boolean l2() {
        return (this.zzb & 1024) != 0;
    }

    public final /* synthetic */ void m0() {
        this.zzb &= -33;
        this.zzl = 0L;
    }

    public final /* synthetic */ void m1(long j) {
        this.zzd |= 134217728;
        this.zzaq = j;
    }

    public final int m2() {
        return this.zzq;
    }

    public final /* synthetic */ void n0() {
        this.zzb |= 64;
        this.zzm = "android";
    }

    public final /* synthetic */ void n1() {
        this.zzd |= 268435456;
        this.zzar = "";
    }

    public final String n2() {
        return this.zzr;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0828i2
    public final Object o(int i10) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new J2(zzat, "\u0004C\u0000\u0002\u0001VC\u0000\u0005\u0000\u0001င\u0000\u0002\u001b\u0003\u001b\u0004ဂ\u0001\u0005ဂ\u0002\u0006ဂ\u0003\u0007ဂ\u0005\bဈ\u0006\tဈ\u0007\nဈ\b\u000bဈ\t\fင\n\rဈ\u000b\u000eဈ\f\u0010ဈ\r\u0011ဂ\u000e\u0012ဂ\u000f\u0013ဈ\u0010\u0014ဇ\u0011\u0015ဈ\u0012\u0016ဂ\u0013\u0017င\u0014\u0018ဈ\u0015\u0019ဈ\u0016\u001aဂ\u0004\u001cဇ\u0017\u001d\u001b\u001eဈ\u0018\u001fင\u0019 င\u001a!င\u001b\"ဈ\u001c#ဂ\u001d$ဂ\u001e%ဈ\u001f&ဈ 'င!)ဈ\",ဉ#-\u001d.ဂ$/ဂ%2ဈ&4ဈ'5᠌(7ဇ)9ဈ*:ဇ+;ဉ,?ဈ-@\u001aAဈ.Cဂ/Dဇ0Gဈ1Hဇ2Iဈ3Jင4Kဈ5Lဉ6Mင7Oဉ8Pဈ9Qဉ:Rဂ;Sဈ<Vဉ=", new Object[]{"zzb", "zzd", "zze", "zzf", C0802d1.class, "zzg", C0886u1.class, "zzh", "zzi", "zzj", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq", "zzr", "zzs", "zzt", "zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzA", "zzB", "zzC", "zzk", "zzD", "zzE", V0.class, "zzF", "zzG", "zzH", "zzI", "zzJ", "zzK", "zzL", "zzM", "zzN", "zzO", "zzP", "zzQ", "zzR", "zzS", "zzT", "zzU", "zzV", "zzW", C0885u0.g, "zzX", "zzY", "zzZ", "zzaa", "zzab", "zzac", "zzad", "zzae", "zzaf", "zzag", "zzah", "zzai", "zzaj", "zzak", "zzal", "zzam", "zzan", "zzao", "zzap", "zzaq", "zzar", "zzas"});
        }
        if (i11 == 3) {
            return new C0842l1();
        }
        if (i11 == 4) {
            return new C0837k1(zzat);
        }
        if (i11 == 5) {
            return zzat;
        }
        throw null;
    }

    public final /* synthetic */ void o0(String str) {
        str.getClass();
        this.zzb |= 128;
        this.zzn = str;
    }

    public final /* synthetic */ void o1(Z0 z10) {
        this.zzas = z10;
        this.zzd |= 536870912;
    }

    public final String p() {
        return this.zzs;
    }

    public final boolean p0() {
        return (this.zzd & 2) != 0;
    }

    public final /* synthetic */ void p1() {
        String str = Build.MODEL;
        str.getClass();
        this.zzb |= 256;
        this.zzo = str;
    }

    public final String q() {
        return this.zzt;
    }

    public final int q0() {
        return this.zzO;
    }

    public final /* synthetic */ void q1() {
        this.zzb &= -257;
        this.zzo = zzat.zzo;
    }

    public final boolean r() {
        return (this.zzb & 16384) != 0;
    }

    public final boolean r0() {
        return (this.zzd & 16) != 0;
    }

    public final /* synthetic */ void r1(String str) {
        str.getClass();
        this.zzb |= 512;
        this.zzp = str;
    }

    public final long s() {
        return this.zzu;
    }

    public final long s0() {
        return this.zzS;
    }

    public final /* synthetic */ void s1(int i10) {
        this.zzb |= 1024;
        this.zzq = i10;
    }

    public final boolean t() {
        return (this.zzb & 32768) != 0;
    }

    public final boolean t0() {
        return (this.zzd & 128) != 0;
    }

    public final /* synthetic */ void t1(String str) {
        str.getClass();
        this.zzb |= 2048;
        this.zzr = str;
    }

    public final long u() {
        return this.zzv;
    }

    public final String u0() {
        return this.zzV;
    }

    public final /* synthetic */ void u1(String str) {
        str.getClass();
        this.zzb |= 4096;
        this.zzs = str;
    }

    public final String v() {
        return this.zzw;
    }

    public final boolean v0() {
        return (this.zzd & 8192) != 0;
    }

    public final /* synthetic */ void v1(String str) {
        str.getClass();
        this.zzb |= 8192;
        this.zzt = str;
    }

    public final boolean w() {
        return (this.zzb & 131072) != 0;
    }

    public final String w0() {
        return this.zzab;
    }

    public final /* synthetic */ void w1(long j) {
        this.zzb |= 16384;
        this.zzu = j;
    }

    public final boolean x() {
        return this.zzx;
    }

    public final boolean x0() {
        return (this.zzd & 32768) != 0;
    }

    public final /* synthetic */ void x1() {
        this.zzb |= 32768;
        this.zzv = 133005L;
    }

    public final String y() {
        return this.zzy;
    }

    public final long y0() {
        return this.zzae;
    }

    public final /* synthetic */ void y1(String str) {
        str.getClass();
        this.zzb |= 65536;
        this.zzw = str;
    }

    public final boolean z() {
        return (this.zzb & 524288) != 0;
    }

    public final boolean z0() {
        return this.zzaf;
    }

    public final /* synthetic */ void z1() {
        this.zzb &= -65537;
        this.zzw = zzat.zzw;
    }
}
