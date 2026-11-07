package D;

import J0.C0285h;
import J0.C0286i;
import J0.C0287j;
import J0.InterfaceC0288k;
import Z.C0672b;
import Z.C0698o;
import Z.C0699o0;
import Z.InterfaceC0687i0;

/* JADX INFO: renamed from: D.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0071n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final u.E f1002a = c(true);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final u.E f1003b = c(false);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C0070m f1004c = C0070m.f999b;

    public static final void a(l0.r rVar, C0698o c0698o, int i10) {
        int i11;
        c0698o.V(-211209833);
        if ((i10 & 6) == 0) {
            i11 = (c0698o.g(rVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if (c0698o.K(i11 & 1, (i11 & 3) != 2)) {
            int i12 = c0698o.f10721P;
            l0.r rVarC = l0.a.c(c0698o, rVar);
            InterfaceC0687i0 interfaceC0687i0M = c0698o.m();
            InterfaceC0288k.f4142a.getClass();
            C0286i c0286i = C0287j.f4115b;
            c0698o.X();
            if (c0698o.f10720O) {
                c0698o.l(c0286i);
            } else {
                c0698o.h0();
            }
            C0672b.v(c0698o, f1004c, C0287j.f4119f);
            C0672b.v(c0698o, interfaceC0687i0M, C0287j.f4118e);
            C0672b.v(c0698o, rVarC, C0287j.f4117d);
            C0285h c0285h = C0287j.g;
            if (c0698o.f10720O || !p251z9.j.a(c0698o.H(), Integer.valueOf(i12))) {
                p123m2.c.y(i12, c0698o, i12, c0285h);
            }
            c0698o.p(true);
        } else {
            c0698o.N();
        }
        C0699o0 c0699o0R = c0698o.r();
        if (c0699o0R != null) {
            c0699o0R.f10749d = new C0068k(i10, 0, rVar);
        }
    }

    public static final void b(H0.T t2, H0.U u8, H0.H h7, p063g1.m mVar, int i10, int i11, l0.j jVar) {
        l0.j jVar2;
        Object objI = h7.i();
        C0067j c0067j = objI instanceof C0067j ? (C0067j) objI : null;
        H0.T.f(t2, u8, ((c0067j == null || (jVar2 = c0067j.f988F) == null) ? jVar : jVar2).a((((long) u8.f3168r) << 32) | (((long) u8.f3169s) & 4294967295L), (((long) i10) << 32) | (((long) i11) & 4294967295L), mVar));
    }

    public static final u.E c(boolean z10) {
        u.E e10 = new u.E(9);
        l0.j jVar = l0.c.f19313r;
        e10.l(jVar, new C0074q(jVar, z10));
        l0.j jVar2 = l0.c.f19314s;
        e10.l(jVar2, new C0074q(jVar2, z10));
        l0.j jVar3 = l0.c.f19315t;
        e10.l(jVar3, new C0074q(jVar3, z10));
        l0.j jVar4 = l0.c.f19316u;
        e10.l(jVar4, new C0074q(jVar4, z10));
        l0.j jVar5 = l0.c.f19317v;
        e10.l(jVar5, new C0074q(jVar5, z10));
        l0.j jVar6 = l0.c.f19318w;
        e10.l(jVar6, new C0074q(jVar6, z10));
        l0.j jVar7 = l0.c.f19319x;
        e10.l(jVar7, new C0074q(jVar7, z10));
        l0.j jVar8 = l0.c.f19320y;
        e10.l(jVar8, new C0074q(jVar8, z10));
        l0.j jVar9 = l0.c.f19321z;
        e10.l(jVar9, new C0074q(jVar9, z10));
        return e10;
    }

    public static final H0.I d(l0.j jVar, boolean z10) {
        H0.I i10 = (H0.I) (z10 ? f1002a : f1003b).g(jVar);
        return i10 == null ? new C0074q(jVar, z10) : i10;
    }
}
