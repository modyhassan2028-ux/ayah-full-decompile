package androidx.compose.animation;

import J0.AbstractC0274a0;
import J0.C0285h;
import J0.C0286i;
import J0.C0287j;
import J0.InterfaceC0288k;
import K0.AbstractC0359n0;
import W.t2;
import Z.C0672b;
import Z.C0681f0;
import Z.C0690k;
import Z.C0698o;
import Z.C0699o0;
import Z.InterfaceC0687i0;
import Z.S;
import Z.X;
import com.google.android.gms.internal.measurement.B1;
import java.util.ListIterator;
import l0.e;
import l0.j;
import l0.o;
import l0.q;
import l0.r;
import p056f2.AbstractC0939l;
import p063g1.m;
import p074h0.d;
import p120l9.l;
import p214w.C1390c;
import p214w.C1391d;
import p214w.C1392e;
import p214w.C1393f;
import p214w.C1394g;
import p214w.C1399l;
import p214w.C1401n;
import p214w.G;
import p214w.H;
import p214w.P;
import p214w.u;
import p223x.k0;
import p223x.q0;
import p223x.t0;
import p223x.w0;
import u.E;
import u.M;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long f11739a;

    static {
        long j = Integer.MIN_VALUE;
        f11739a = (j & 4294967295L) | (j << 32);
    }

    public static final void a(Boolean bool, r rVar, p241y9.c cVar, e eVar, String str, p241y9.c cVar2, d dVar, C0698o c0698o, int i10) {
        r rVar2;
        e eVar2;
        p241y9.c cVar3;
        c0698o.V(2132720749);
        int i11 = i10 | (c0698o.g(bool) ? 4 : 2) | 199728;
        if (c0698o.K(i11 & 1, (599187 & i11) != 599186)) {
            j jVar = l0.c.f19313r;
            cVar3 = C1390c.f23477s;
            q0 q0VarE = t0.e(bool, str, c0698o, (i11 & 14) | 48);
            o oVar = o.f19333a;
            b(q0VarE, oVar, cVar, jVar, cVar3, dVar, c0698o, 224688);
            rVar2 = oVar;
            eVar2 = jVar;
        } else {
            c0698o.N();
            rVar2 = rVar;
            eVar2 = eVar;
            cVar3 = cVar2;
        }
        C0699o0 c0699o0R = c0698o.r();
        if (c0699o0R != null) {
            c0699o0R.f10749d = new C1391d(bool, rVar2, cVar, eVar2, str, cVar3, dVar, i10);
        }
    }

    public static final void b(q0 q0Var, r rVar, p241y9.c cVar, e eVar, p241y9.c cVar2, d dVar, C0698o c0698o, int i10) {
        int i11;
        p241y9.c cVar3;
        C0698o c0698o2;
        AbstractC0939l abstractC0939l;
        p093j0.r rVar2;
        final C1401n c1401n;
        final k0 k0VarB;
        boolean z10;
        p241y9.c cVar4 = cVar;
        c0698o.V(-114689412);
        if ((i10 & 6) == 0) {
            i11 = (c0698o.g(q0Var) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c0698o.g(rVar) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c0698o.i(cVar4) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= c0698o.g(eVar) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= c0698o.i(cVar2) ? 16384 : 8192;
        }
        d dVar2 = dVar;
        if ((196608 & i10) == 0) {
            i11 |= c0698o.i(dVar2) ? 131072 : 65536;
        }
        if (c0698o.K(i11 & 1, (74899 & i11) != 74898)) {
            m mVar = (m) c0698o.k(AbstractC0359n0.f5123n);
            int i12 = i11 & 14;
            boolean z11 = i12 == 4;
            Object objH = c0698o.H();
            S s10 = C0690k.f10683a;
            if (z11 || objH == s10) {
                objH = new C1401n(q0Var, eVar, mVar);
                c0698o.e0(objH);
            }
            C1401n c1401n2 = (C1401n) objH;
            boolean z12 = i12 == 4;
            Object objH2 = c0698o.H();
            if (z12 || objH2 == s10) {
                Object[] objArr = {q0Var.f24065a.i()};
                p093j0.r rVar3 = new p093j0.r();
                rVar3.addAll(l.o0(objArr));
                c0698o.e0(rVar3);
                objH2 = rVar3;
            }
            p093j0.r rVar4 = (p093j0.r) objH2;
            boolean z13 = i12 == 4;
            Object objH3 = c0698o.H();
            if (z13 || objH3 == s10) {
                long[] jArr = M.f22699a;
                objH3 = new E();
                c0698o.e0(objH3);
            }
            E e10 = (E) objH3;
            AbstractC0939l abstractC0939l2 = q0Var.f24065a;
            C0681f0 c0681f0 = q0Var.f24068d;
            if (!rVar4.contains(abstractC0939l2.i())) {
                rVar4.clear();
                rVar4.add(abstractC0939l2.i());
            }
            if (p251z9.j.a(abstractC0939l2.i(), c0681f0.getValue())) {
                if (rVar4.size() != 1 || !p251z9.j.a(rVar4.get(0), abstractC0939l2.i())) {
                    rVar4.clear();
                    rVar4.add(abstractC0939l2.i());
                }
                if (e10.f22673e != 1 || e10.c(abstractC0939l2.i())) {
                    e10.a();
                }
                c1401n2.f23518b = eVar;
            }
            if (p251z9.j.a(abstractC0939l2.i(), c0681f0.getValue()) || rVar4.contains(c0681f0.getValue())) {
                abstractC0939l = abstractC0939l2;
            } else {
                ListIterator listIterator = rVar4.listIterator();
                int i13 = 0;
                while (true) {
                    J0.r rVar5 = (J0.r) listIterator;
                    abstractC0939l = abstractC0939l2;
                    if (!rVar5.hasNext()) {
                        i13 = -1;
                        break;
                    } else {
                        if (p251z9.j.a(cVar2.e(rVar5.next()), cVar2.e(c0681f0.getValue()))) {
                            break;
                        }
                        i13++;
                        abstractC0939l2 = abstractC0939l;
                    }
                }
                if (i13 == -1) {
                    rVar4.add(c0681f0.getValue());
                } else {
                    rVar4.set(i13, c0681f0.getValue());
                }
            }
            if (e10.c(c0681f0.getValue()) && e10.c(abstractC0939l.i())) {
                c0698o.T(919489879);
                c0698o.p(false);
                cVar3 = cVar4;
            } else {
                c0698o.T(916905750);
                e10.a();
                int size = rVar4.size();
                int i14 = 0;
                while (i14 < size) {
                    Object obj = rVar4.get(i14);
                    e10.l(obj, p074h0.j.d(885640742, new C1392e(q0Var, obj, cVar4, c1401n2, rVar4, dVar2), c0698o));
                    i14++;
                    cVar4 = cVar4;
                    dVar2 = dVar;
                }
                cVar3 = cVar4;
                c0698o.p(false);
            }
            boolean zG = c0698o.g(q0Var.f()) | c0698o.g(c1401n2);
            Object objH4 = c0698o.H();
            if (zG || objH4 == s10) {
                objH4 = (u) cVar3.e(c1401n2);
                c0698o.e0(objH4);
            }
            u uVar = (u) objH4;
            q0 q0Var2 = c1401n2.f23517a;
            boolean zG2 = c0698o.g(c1401n2);
            Object objH5 = c0698o.H();
            if (zG2 || objH5 == s10) {
                objH5 = C0672b.r(Boolean.FALSE);
                c0698o.e0(objH5);
            }
            X x9 = (X) objH5;
            final X xU = C0672b.u(uVar.f23541d, c0698o);
            if (p251z9.j.a(q0Var2.f24065a.i(), q0Var2.f24068d.getValue())) {
                x9.setValue(Boolean.FALSE);
            } else if (xU.getValue() != null) {
                x9.setValue(Boolean.TRUE);
            }
            boolean zBooleanValue = ((Boolean) x9.getValue()).booleanValue();
            r rVar6 = o.f19333a;
            if (zBooleanValue) {
                c0698o.T(249676467);
                rVar2 = rVar4;
                c0698o2 = c0698o;
                c1401n = c1401n2;
                k0VarB = t0.b(c1401n2.f23517a, w0.f24119h, null, c0698o2, 0, 2);
                boolean zG3 = c0698o2.g(k0VarB);
                Object objH6 = c0698o2.H();
                if (zG3 || objH6 == s10) {
                    objH6 = B1.n(rVar6);
                    c0698o2.e0(objH6);
                }
                rVar6 = (r) objH6;
                c0698o2.p(false);
            } else {
                rVar2 = rVar4;
                c0698o2 = c0698o;
                c1401n = c1401n2;
                c0698o2.T(249942509);
                c0698o2.p(false);
                k0VarB = null;
                c1401n.f23521e = null;
            }
            r rVarB = rVar.b(rVar6.b(new AbstractC0274a0(k0VarB, xU, c1401n) { // from class: androidx.compose.animation.AnimatedContentTransitionScopeImpl$SizeModifierElement

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final k0 f11728a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final X f11729b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final C1401n f11730c;

                {
                    this.f11728a = k0VarB;
                    this.f11729b = xU;
                    this.f11730c = c1401n;
                }

                public final boolean equals(Object obj2) {
                    if (!(obj2 instanceof AnimatedContentTransitionScopeImpl$SizeModifierElement)) {
                        return false;
                    }
                    AnimatedContentTransitionScopeImpl$SizeModifierElement animatedContentTransitionScopeImpl$SizeModifierElement = (AnimatedContentTransitionScopeImpl$SizeModifierElement) obj2;
                    return p251z9.j.a(animatedContentTransitionScopeImpl$SizeModifierElement.f11728a, this.f11728a) && animatedContentTransitionScopeImpl$SizeModifierElement.f11729b.equals(this.f11729b);
                }

                public final int hashCode() {
                    int iHashCode = this.f11730c.hashCode() * 31;
                    k0 k0Var = this.f11728a;
                    return this.f11729b.hashCode() + ((iHashCode + (k0Var != null ? k0Var.hashCode() : 0)) * 31);
                }

                @Override // J0.AbstractC0274a0
                public final q k() {
                    C1399l c1399l = new C1399l(1);
                    c1399l.f23510G = this.f11728a;
                    c1399l.f23511H = this.f11729b;
                    c1399l.f23512I = this.f11730c;
                    c1399l.f23513J = a.f11739a;
                    return c1399l;
                }

                @Override // J0.AbstractC0274a0
                public final void l(q qVar) {
                    C1399l c1399l = (C1399l) qVar;
                    c1399l.f23510G = this.f11728a;
                    c1399l.f23511H = this.f11729b;
                    c1399l.f23512I = this.f11730c;
                }
            }));
            Object objH7 = c0698o2.H();
            if (objH7 == s10) {
                objH7 = new C1394g(c1401n);
                c0698o2.e0(objH7);
            }
            C1394g c1394g = (C1394g) objH7;
            int i15 = c0698o2.f10721P;
            InterfaceC0687i0 interfaceC0687i0M = c0698o2.m();
            r rVarC = l0.a.c(c0698o2, rVarB);
            InterfaceC0288k.f4142a.getClass();
            C0286i c0286i = C0287j.f4115b;
            c0698o2.X();
            if (c0698o2.f10720O) {
                c0698o2.l(c0286i);
            } else {
                c0698o2.h0();
            }
            C0672b.v(c0698o2, c1394g, C0287j.f4119f);
            C0672b.v(c0698o2, interfaceC0687i0M, C0287j.f4118e);
            C0285h c0285h = C0287j.g;
            if (c0698o2.f10720O || !p251z9.j.a(c0698o2.H(), Integer.valueOf(i15))) {
                p123m2.c.y(i15, c0698o2, i15, c0285h);
            }
            C0672b.v(c0698o2, rVarC, C0287j.f4117d);
            c0698o2.T(-1490874326);
            int size2 = rVar2.size();
            int i16 = 0;
            while (i16 < size2) {
                p093j0.r rVar7 = rVar2;
                Object obj2 = rVar7.get(i16);
                c0698o2.R(1908442329, cVar2.e(obj2));
                p241y9.e eVar2 = (p241y9.e) e10.g(obj2);
                if (eVar2 == null) {
                    c0698o2.T(-967793488);
                    z10 = false;
                } else {
                    z10 = false;
                    c0698o2.T(1908443505);
                    eVar2.invoke(c0698o2, 0);
                }
                c0698o2.p(z10);
                c0698o2.p(z10);
                i16++;
                rVar2 = rVar7;
            }
            c0698o2.p(false);
            c0698o2.p(true);
        } else {
            cVar3 = cVar4;
            c0698o2 = c0698o;
            c0698o2.N();
        }
        C0699o0 c0699o0R = c0698o2.r();
        if (c0699o0R != null) {
            c0699o0R.f10749d = new t2(q0Var, rVar, cVar3, eVar, cVar2, dVar, i10);
        }
    }

    public static final u c(G g, H h7) {
        return new u(g, h7, 0.0f, new P(C1393f.f23499s));
    }
}
