package K;

import J0.C0285h;
import J0.C0286i;
import J0.C0287j;
import J0.InterfaceC0288k;
import U0.C0513e;
import U0.C0515g;
import Z.C0672b;
import Z.C0698o;
import Z.C0699o0;
import Z.InterfaceC0687i0;
import java.util.List;

/* JADX INFO: renamed from: K.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0314h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p110k9.j f4644a;

    static {
        p120l9.r rVar = p120l9.r.f19440r;
        f4644a = new p110k9.j(rVar, rVar);
    }

    public static final void a(C0515g c0515g, List list, C0698o c0698o, int i10) {
        c0698o.V(-1794596951);
        int i11 = (i10 & 6) == 0 ? (c0698o.g(c0515g) ? 4 : 2) | i10 : i10;
        if ((i10 & 48) == 0) {
            i11 |= c0698o.i(list) ? 32 : 16;
        }
        if (c0698o.K(i11 & 1, (i11 & 19) != 18)) {
            int size = list.size();
            for (int i12 = 0; i12 < size; i12++) {
                C0513e c0513e = (C0513e) list.get(i12);
                p241y9.f fVar = (p241y9.f) c0513e.f8054a;
                int i13 = c0513e.f8055b;
                int i14 = c0513e.f8056c;
                C0313g c0313g = C0313g.f4641b;
                int i15 = c0698o.f10721P;
                InterfaceC0687i0 interfaceC0687i0M = c0698o.m();
                l0.r rVarC = l0.a.c(c0698o, l0.o.f19333a);
                InterfaceC0288k.f4142a.getClass();
                C0286i c0286i = C0287j.f4115b;
                c0698o.X();
                if (c0698o.f10720O) {
                    c0698o.l(c0286i);
                } else {
                    c0698o.h0();
                }
                C0672b.v(c0698o, c0313g, C0287j.f4119f);
                C0672b.v(c0698o, interfaceC0687i0M, C0287j.f4118e);
                C0285h c0285h = C0287j.g;
                if (c0698o.f10720O || !p251z9.j.a(c0698o.H(), Integer.valueOf(i15))) {
                    p123m2.c.y(i15, c0698o, i15, c0285h);
                }
                C0672b.v(c0698o, rVarC, C0287j.f4117d);
                fVar.d(c0515g.subSequence(i13, i14).f8060s, c0698o, 0);
                c0698o.p(true);
            }
        } else {
            c0698o.N();
        }
        C0699o0 c0699o0R = c0698o.r();
        if (c0699o0R != null) {
            c0699o0R.f10749d = new G.C(i10, 1, c0515g, list);
        }
    }
}
