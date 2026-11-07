package i7;

import android.text.TextUtils;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: i7.c0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0970c0 {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public Long f17276A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public long f17277B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public String f17278C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public int f17279D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public int f17280E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public long f17281F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public String f17282G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public byte[] f17283H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public int f17284I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public long f17285J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public long f17286K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public long f17287L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public long f17288M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public long f17289N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public long f17290O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public String f17291P;
    public boolean Q;
    public long R;
    public long S;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1023u0 f17292a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f17293b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f17294c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f17295d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f17296e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f17297f;
    public long g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f17298h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f17299i;
    public String j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f17300k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f17301l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f17302m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f17303n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f17304o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f17305p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Boolean f17306q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f17307r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public ArrayList f17308s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public String f17309t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f17310u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public long f17311v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public long f17312w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f17313x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f17314y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public Long f17315z;

    public C0970c0(C1023u0 c1023u0, String str) {
        U6.y.f(c1023u0);
        U6.y.c(str);
        this.f17292a = c1023u0;
        this.f17293b = str;
        C1014r0 c1014r0 = c1023u0.f17585x;
        C1023u0.m(c1014r0);
        c1014r0.o();
    }

    public final void A(long j) {
        C1014r0 c1014r0 = this.f17292a.f17585x;
        C1023u0.m(c1014r0);
        c1014r0.o();
        this.Q |= this.f17312w != j;
        this.f17312w = j;
    }

    public final void B(long j) {
        C1014r0 c1014r0 = this.f17292a.f17585x;
        C1023u0.m(c1014r0);
        c1014r0.o();
        this.Q |= this.f17277B != j;
        this.f17277B = j;
    }

    public final String C() {
        C1014r0 c1014r0 = this.f17292a.f17585x;
        C1023u0.m(c1014r0);
        c1014r0.o();
        return this.f17278C;
    }

    public final String D() {
        C1014r0 c1014r0 = this.f17292a.f17585x;
        C1023u0.m(c1014r0);
        c1014r0.o();
        return this.f17293b;
    }

    public final String E() {
        C1014r0 c1014r0 = this.f17292a.f17585x;
        C1023u0.m(c1014r0);
        c1014r0.o();
        return this.f17294c;
    }

    public final void F(String str) {
        C1014r0 c1014r0 = this.f17292a.f17585x;
        C1023u0.m(c1014r0);
        c1014r0.o();
        this.Q |= !Objects.equals(this.f17294c, str);
        this.f17294c = str;
    }

    public final String G() {
        C1014r0 c1014r0 = this.f17292a.f17585x;
        C1023u0.m(c1014r0);
        c1014r0.o();
        return this.f17295d;
    }

    public final void H(String str) {
        C1014r0 c1014r0 = this.f17292a.f17585x;
        C1023u0.m(c1014r0);
        c1014r0.o();
        if (true == TextUtils.isEmpty(str)) {
            str = null;
        }
        this.Q |= true ^ Objects.equals(this.f17295d, str);
        this.f17295d = str;
    }

    public final void I(String str) {
        C1014r0 c1014r0 = this.f17292a.f17585x;
        C1023u0.m(c1014r0);
        c1014r0.o();
        this.Q |= !Objects.equals(this.f17296e, str);
        this.f17296e = str;
    }

    public final String J() {
        C1014r0 c1014r0 = this.f17292a.f17585x;
        C1023u0.m(c1014r0);
        c1014r0.o();
        return this.f17297f;
    }

    public final void K(String str) {
        C1014r0 c1014r0 = this.f17292a.f17585x;
        C1023u0.m(c1014r0);
        c1014r0.o();
        this.Q |= !Objects.equals(this.f17297f, str);
        this.f17297f = str;
    }

    public final void L(long j) {
        C1014r0 c1014r0 = this.f17292a.f17585x;
        C1023u0.m(c1014r0);
        c1014r0.o();
        this.Q |= this.f17298h != j;
        this.f17298h = j;
    }

    public final void M(long j) {
        C1014r0 c1014r0 = this.f17292a.f17585x;
        C1023u0.m(c1014r0);
        c1014r0.o();
        this.Q |= this.f17299i != j;
        this.f17299i = j;
    }

    public final String N() {
        C1014r0 c1014r0 = this.f17292a.f17585x;
        C1023u0.m(c1014r0);
        c1014r0.o();
        return this.j;
    }

    public final void O(String str) {
        C1014r0 c1014r0 = this.f17292a.f17585x;
        C1023u0.m(c1014r0);
        c1014r0.o();
        this.Q |= !Objects.equals(this.j, str);
        this.j = str;
    }

    public final long P() {
        C1014r0 c1014r0 = this.f17292a.f17585x;
        C1023u0.m(c1014r0);
        c1014r0.o();
        return this.f17300k;
    }

    public final void Q(long j) {
        C1014r0 c1014r0 = this.f17292a.f17585x;
        C1023u0.m(c1014r0);
        c1014r0.o();
        this.Q |= this.f17300k != j;
        this.f17300k = j;
    }

    public final void R(String str) {
        C1014r0 c1014r0 = this.f17292a.f17585x;
        C1023u0.m(c1014r0);
        c1014r0.o();
        this.Q |= !Objects.equals(this.f17301l, str);
        this.f17301l = str;
    }

    public final void S(long j) {
        C1014r0 c1014r0 = this.f17292a.f17585x;
        C1023u0.m(c1014r0);
        c1014r0.o();
        this.Q |= this.f17302m != j;
        this.f17302m = j;
    }

    public final void a(long j) {
        C1014r0 c1014r0 = this.f17292a.f17585x;
        C1023u0.m(c1014r0);
        c1014r0.o();
        this.Q |= this.f17303n != j;
        this.f17303n = j;
    }

    public final long b() {
        C1014r0 c1014r0 = this.f17292a.f17585x;
        C1023u0.m(c1014r0);
        c1014r0.o();
        return this.f17307r;
    }

    public final void c(long j) {
        C1014r0 c1014r0 = this.f17292a.f17585x;
        C1023u0.m(c1014r0);
        c1014r0.o();
        this.Q |= this.f17307r != j;
        this.f17307r = j;
    }

    public final void d(boolean z10) {
        C1014r0 c1014r0 = this.f17292a.f17585x;
        C1023u0.m(c1014r0);
        c1014r0.o();
        this.Q |= this.f17304o != z10;
        this.f17304o = z10;
    }

    public final void e(long j) {
        U6.y.a(j >= 0);
        C1014r0 c1014r0 = this.f17292a.f17585x;
        C1023u0.m(c1014r0);
        c1014r0.o();
        this.Q |= this.g != j;
        this.g = j;
    }

    public final void f(long j) {
        C1014r0 c1014r0 = this.f17292a.f17585x;
        C1023u0.m(c1014r0);
        c1014r0.o();
        this.Q |= this.R != j;
        this.R = j;
    }

    public final void g(long j) {
        C1014r0 c1014r0 = this.f17292a.f17585x;
        C1023u0.m(c1014r0);
        c1014r0.o();
        this.Q |= this.S != j;
        this.S = j;
    }

    public final void h(long j) {
        C1023u0 c1023u0 = this.f17292a;
        C1014r0 c1014r0 = c1023u0.f17585x;
        X x9 = c1023u0.f17584w;
        C1023u0.m(c1014r0);
        c1014r0.o();
        long j10 = this.g + j;
        String str = this.f17293b;
        if (j10 > 2147483647L) {
            C1023u0.m(x9);
            x9.f17185z.b(X.w(str), "Bundle index overflow. appId");
            j10 = (-1) + j;
        }
        long j11 = this.f17281F + 1;
        if (j11 > 2147483647L) {
            C1023u0.m(x9);
            x9.f17185z.b(X.w(str), "Delivery index overflow. appId");
            j11 = 0;
        }
        this.Q = true;
        this.g = j10;
        this.f17281F = j11;
    }

    public final void i(long j) {
        C1014r0 c1014r0 = this.f17292a.f17585x;
        C1023u0.m(c1014r0);
        c1014r0.o();
        this.Q |= this.f17285J != j;
        this.f17285J = j;
    }

    public final void j(long j) {
        C1014r0 c1014r0 = this.f17292a.f17585x;
        C1023u0.m(c1014r0);
        c1014r0.o();
        this.Q |= this.f17286K != j;
        this.f17286K = j;
    }

    public final void k(long j) {
        C1014r0 c1014r0 = this.f17292a.f17585x;
        C1023u0.m(c1014r0);
        c1014r0.o();
        this.Q |= this.f17287L != j;
        this.f17287L = j;
    }

    public final void l(long j) {
        C1014r0 c1014r0 = this.f17292a.f17585x;
        C1023u0.m(c1014r0);
        c1014r0.o();
        this.Q |= this.f17288M != j;
        this.f17288M = j;
    }

    public final void m(long j) {
        C1014r0 c1014r0 = this.f17292a.f17585x;
        C1023u0.m(c1014r0);
        c1014r0.o();
        this.Q |= this.f17290O != j;
        this.f17290O = j;
    }

    public final void n(long j) {
        C1014r0 c1014r0 = this.f17292a.f17585x;
        C1023u0.m(c1014r0);
        c1014r0.o();
        this.Q |= this.f17289N != j;
        this.f17289N = j;
    }

    public final boolean o() {
        C1014r0 c1014r0 = this.f17292a.f17585x;
        C1023u0.m(c1014r0);
        c1014r0.o();
        return this.Q;
    }

    public final void p(int i10) {
        C1014r0 c1014r0 = this.f17292a.f17585x;
        C1023u0.m(c1014r0);
        c1014r0.o();
        this.Q |= this.f17279D != i10;
        this.f17279D = i10;
    }

    public final void q(int i10) {
        C1014r0 c1014r0 = this.f17292a.f17585x;
        C1023u0.m(c1014r0);
        c1014r0.o();
        this.Q |= this.f17280E != i10;
        this.f17280E = i10;
    }

    public final void r(long j) {
        C1014r0 c1014r0 = this.f17292a.f17585x;
        C1023u0.m(c1014r0);
        c1014r0.o();
        this.Q |= this.f17281F != j;
        this.f17281F = j;
    }

    public final String s() {
        C1014r0 c1014r0 = this.f17292a.f17585x;
        C1023u0.m(c1014r0);
        c1014r0.o();
        return this.f17282G;
    }

    public final int t() {
        C1014r0 c1014r0 = this.f17292a.f17585x;
        C1023u0.m(c1014r0);
        c1014r0.o();
        return this.f17284I;
    }

    public final String u() {
        C1014r0 c1014r0 = this.f17292a.f17585x;
        C1023u0.m(c1014r0);
        c1014r0.o();
        String str = this.f17291P;
        v(null);
        return str;
    }

    public final void v(String str) {
        C1014r0 c1014r0 = this.f17292a.f17585x;
        C1023u0.m(c1014r0);
        c1014r0.o();
        this.Q |= !Objects.equals(this.f17291P, str);
        this.f17291P = str;
    }

    public final Boolean w() {
        C1014r0 c1014r0 = this.f17292a.f17585x;
        C1023u0.m(c1014r0);
        c1014r0.o();
        return this.f17306q;
    }

    public final void x(List list) {
        C1014r0 c1014r0 = this.f17292a.f17585x;
        C1023u0.m(c1014r0);
        c1014r0.o();
        if (Objects.equals(this.f17308s, list)) {
            return;
        }
        this.Q = true;
        this.f17308s = list != null ? new ArrayList(list) : null;
    }

    public final boolean y() {
        C1014r0 c1014r0 = this.f17292a.f17585x;
        C1023u0.m(c1014r0);
        c1014r0.o();
        return this.f17310u;
    }

    public final void z(long j) {
        C1014r0 c1014r0 = this.f17292a.f17585x;
        C1023u0.m(c1014r0);
        c1014r0.o();
        this.Q |= this.f17311v != j;
        this.f17311v = j;
    }
}
