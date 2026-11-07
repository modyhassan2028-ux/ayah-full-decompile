package H0;

import J0.l0;
import J0.m0;

/* JADX INFO: renamed from: H0.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0212k implements H {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f3204r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final H f3205s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Enum f3206t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Enum f3207u;

    public /* synthetic */ C0212k(H h7, Enum r10, Enum r11, int i10) {
        this.f3204r = i10;
        this.f3205s = h7;
        this.f3206t = r10;
        this.f3207u = r11;
    }

    @Override // H0.H
    public final int H(int i10) {
        switch (this.f3204r) {
            case 0:
                break;
            case 1:
                break;
        }
        return this.f3205s.H(i10);
    }

    @Override // H0.H
    public final int N(int i10) {
        switch (this.f3204r) {
            case 0:
                break;
            case 1:
                break;
        }
        return this.f3205s.N(i10);
    }

    @Override // H0.H
    public final int P(int i10) {
        switch (this.f3204r) {
            case 0:
                break;
            case 1:
                break;
        }
        return this.f3205s.P(i10);
    }

    @Override // H0.H
    public final U a(long j) {
        switch (this.f3204r) {
            case 0:
                EnumC0216o enumC0216o = (EnumC0216o) this.f3206t;
                EnumC0217p enumC0217p = (EnumC0217p) this.f3207u;
                EnumC0217p enumC0217p2 = EnumC0217p.f3213r;
                EnumC0216o enumC0216o2 = EnumC0216o.f3211s;
                H h7 = this.f3205s;
                if (enumC0217p == enumC0217p2) {
                    return new C0213l(enumC0216o == enumC0216o2 ? h7.N(p063g1.a.g(j)) : h7.H(p063g1.a.g(j)), p063g1.a.c(j) ? p063g1.a.g(j) : 32767, 0);
                }
                return new C0213l(p063g1.a.d(j) ? p063g1.a.h(j) : 32767, enumC0216o == enumC0216o2 ? h7.d(p063g1.a.h(j)) : h7.P(p063g1.a.h(j)), 0);
            case 1:
                L l10 = (L) this.f3206t;
                M m10 = (M) this.f3207u;
                M m11 = M.f3159r;
                L l11 = L.f3157s;
                H h10 = this.f3205s;
                if (m10 == m11) {
                    return new C0213l(l10 == l11 ? h10.N(p063g1.a.g(j)) : h10.H(p063g1.a.g(j)), p063g1.a.c(j) ? p063g1.a.g(j) : 32767, 1);
                }
                return new C0213l(p063g1.a.d(j) ? p063g1.a.h(j) : 32767, l10 == l11 ? h10.d(p063g1.a.h(j)) : h10.P(p063g1.a.h(j)), 1);
            default:
                l0 l0Var = (l0) this.f3206t;
                m0 m0Var = (m0) this.f3207u;
                m0 m0Var2 = m0.f4147r;
                l0 l0Var2 = l0.f4145s;
                H h11 = this.f3205s;
                if (m0Var == m0Var2) {
                    return new C0213l(l0Var == l0Var2 ? h11.N(p063g1.a.g(j)) : h11.H(p063g1.a.g(j)), p063g1.a.c(j) ? p063g1.a.g(j) : 32767, 2);
                }
                return new C0213l(p063g1.a.d(j) ? p063g1.a.h(j) : 32767, l0Var == l0Var2 ? h11.d(p063g1.a.h(j)) : h11.P(p063g1.a.h(j)), 2);
        }
    }

    @Override // H0.H
    public final int d(int i10) {
        switch (this.f3204r) {
            case 0:
                break;
            case 1:
                break;
        }
        return this.f3205s.d(i10);
    }

    @Override // H0.H
    public final Object i() {
        switch (this.f3204r) {
            case 0:
                break;
            case 1:
                break;
        }
        return this.f3205s.i();
    }
}
