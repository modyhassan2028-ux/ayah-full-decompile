package p223x;

import X.C0641m;
import X.L;
import Z.C0672b;
import Z.C0690k;
import Z.C0698o;
import Z.C0699o0;
import Z.S;
import p056f2.AbstractC0939l;
import p074h0.c;
import p110k9.a;
import p110k9.h;
import p214w.w;
import p241y9.e;

/* JADX INFO: loaded from: classes.dex */
public abstract class t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f24106a = a.c(h.f19075s, r0.f24091r);

    public static final void a(q0 q0Var, n0 n0Var, Object obj, Object obj2, InterfaceC1435y interfaceC1435y, C0698o c0698o, int i10) {
        int i11;
        c0698o.V(867041821);
        if ((i10 & 6) == 0) {
            i11 = (c0698o.g(q0Var) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c0698o.g(n0Var) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= (i10 & 512) == 0 ? c0698o.g(obj) : c0698o.i(obj) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= (i10 & 4096) == 0 ? c0698o.g(obj2) : c0698o.i(obj2) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= (32768 & i10) == 0 ? c0698o.g(interfaceC1435y) : c0698o.i(interfaceC1435y) ? 16384 : 8192;
        }
        if (!c0698o.K(i11 & 1, (i11 & 9363) != 9362)) {
            c0698o.N();
        } else if (q0Var.g()) {
            n0Var.f(obj, obj2, interfaceC1435y);
        } else {
            n0Var.g(obj2, interfaceC1435y);
        }
        C0699o0 c0699o0R = c0698o.r();
        if (c0699o0R != null) {
            c0699o0R.f10749d = new c(q0Var, n0Var, obj, obj2, interfaceC1435y, i10);
        }
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [y9.c, z9.k] */
    /* JADX WARN: Type inference failed for: r5v5, types: [y9.c, z9.k] */
    public static final k0 b(q0 q0Var, v0 v0Var, String str, C0698o c0698o, int i10, int i11) {
        j0 j0Var;
        if ((i11 & 2) != 0) {
            str = "DeferredAnimation";
        }
        boolean zG = c0698o.g(q0Var);
        Object objH = c0698o.H();
        Object obj = C0690k.f10683a;
        if (zG || objH == obj) {
            objH = new k0(q0Var, v0Var, str);
            c0698o.e0(objH);
        }
        k0 k0Var = (k0) objH;
        boolean zG2 = c0698o.g(q0Var) | c0698o.i(k0Var);
        Object objH2 = c0698o.H();
        if (zG2 || objH2 == obj) {
            objH2 = new L(20, q0Var, k0Var);
            c0698o.e0(objH2);
        }
        C0672b.d(k0Var, (p241y9.c) objH2, c0698o);
        if (q0Var.g() && (j0Var = (j0) k0Var.f24034b.getValue()) != null) {
            q0 q0Var2 = k0Var.f24035c;
            j0Var.f24023r.f(j0Var.f24025t.e(q0Var2.f().a()), j0Var.f24025t.e(q0Var2.f().c()), (InterfaceC1435y) j0Var.f24024s.e(q0Var2.f()));
        }
        return k0Var;
    }

    public static final n0 c(q0 q0Var, Object obj, Object obj2, InterfaceC1435y interfaceC1435y, v0 v0Var, C0698o c0698o, int i10) {
        boolean zG = c0698o.g(q0Var);
        Object objH = c0698o.H();
        Object obj3 = C0690k.f10683a;
        if (zG || objH == obj3) {
            AbstractC1427p abstractC1427p = (AbstractC1427p) v0Var.f24111a.e(obj2);
            abstractC1427p.d();
            objH = new n0(q0Var, obj, abstractC1427p, v0Var);
            c0698o.e0(objH);
        }
        n0 n0Var = (n0) objH;
        a(q0Var, n0Var, obj, obj2, interfaceC1435y, c0698o, 0);
        boolean zG2 = c0698o.g(q0Var) | c0698o.g(n0Var);
        Object objH2 = c0698o.H();
        if (zG2 || objH2 == obj3) {
            objH2 = new L(21, q0Var, n0Var);
            c0698o.e0(objH2);
        }
        C0672b.d(n0Var, (p241y9.c) objH2, c0698o);
        return n0Var;
    }

    public static final q0 d(AbstractC0939l abstractC0939l, String str, C0698o c0698o, int i10) {
        int i11 = (i10 & 14) ^ 6;
        boolean z10 = true;
        boolean z11 = (i11 > 4 && c0698o.g(abstractC0939l)) || (i10 & 6) == 4;
        Object objH = c0698o.H();
        Object obj = C0690k.f10683a;
        if (z11 || objH == obj) {
            objH = new q0(abstractC0939l, null, str);
            c0698o.e0(objH);
        }
        q0 q0Var = (q0) objH;
        if (abstractC0939l instanceof X) {
            c0698o.T(1030829284);
            X x9 = (X) abstractC0939l;
            Object value = x9.f23916t.getValue();
            Object value2 = x9.f23915s.getValue();
            if ((i11 <= 4 || !c0698o.g(abstractC0939l)) && (i10 & 6) != 4) {
                z10 = false;
            }
            Object objH2 = c0698o.H();
            if (z10 || objH2 == obj) {
                objH2 = new C0641m(abstractC0939l, null);
                c0698o.e0(objH2);
            }
            C0672b.g(value, value2, (e) objH2, c0698o);
            c0698o.p(false);
        } else {
            c0698o.T(1031290843);
            q0Var.a(abstractC0939l.j(), c0698o, 0);
            c0698o.p(false);
        }
        boolean zG = c0698o.g(q0Var);
        Object objH3 = c0698o.H();
        if (zG || objH3 == obj) {
            objH3 = new w(q0Var, 1);
            c0698o.e0(objH3);
        }
        C0672b.d(q0Var, (p241y9.c) objH3, c0698o);
        return q0Var;
    }

    public static final q0 e(Object obj, String str, C0698o c0698o, int i10) {
        Object objH = c0698o.H();
        S s10 = C0690k.f10683a;
        if (objH == s10) {
            objH = new q0(new I(obj), null, str);
            c0698o.e0(objH);
        }
        q0 q0Var = (q0) objH;
        q0Var.a(obj, c0698o, (i10 & 8) | 48 | (i10 & 14));
        Object objH2 = c0698o.H();
        if (objH2 == s10) {
            objH2 = new w(q0Var, 2);
            c0698o.e0(objH2);
        }
        C0672b.d(q0Var, (p241y9.c) objH2, c0698o);
        return q0Var;
    }
}
