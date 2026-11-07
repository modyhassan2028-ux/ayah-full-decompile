package p223x;

import B9.a;
import K9.InterfaceC0402u;
import X.L;
import Z.C;
import Z.C0672b;
import Z.C0677d0;
import Z.C0681f0;
import Z.C0690k;
import Z.C0698o;
import Z.C0699o0;
import Z.D0;
import Z.S;
import p056f2.AbstractC0939l;
import p093j0.n;
import p093j0.r;
import p214w.C1404q;
import p241y9.c;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractC0939l f24065a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q0 f24066b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f24067c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C0681f0 f24068d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C0681f0 f24069e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C0677d0 f24070f = new C0677d0(0);
    public final C0677d0 g = new C0677d0(Long.MIN_VALUE);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final C0681f0 f24071h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final r f24072i;
    public final r j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final C0681f0 f24073k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final C f24074l;

    public q0(AbstractC0939l abstractC0939l, q0 q0Var, String str) {
        this.f24065a = abstractC0939l;
        this.f24066b = q0Var;
        this.f24067c = str;
        this.f24068d = C0672b.r(abstractC0939l.i());
        this.f24069e = C0672b.r(new m0(abstractC0939l.i(), abstractC0939l.i()));
        Boolean bool = Boolean.FALSE;
        this.f24071h = C0672b.r(bool);
        this.f24072i = new r();
        this.j = new r();
        this.f24073k = C0672b.r(bool);
        this.f24074l = C0672b.o(new C1404q(this, 1));
        abstractC0939l.m(this);
    }

    /* JADX WARN: Code duplicated, block: B:39:0x008e  */
    /* JADX WARN: Code duplicated, block: B:41:0x009c  */
    /* JADX WARN: Code duplicated, block: B:45:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:49:0x00b9  */
    public final void a(Object obj, C0698o c0698o, int i10) {
        int i11;
        Object objH;
        S s10;
        InterfaceC0402u interfaceC0402u;
        boolean zI;
        Object objH2;
        c0698o.V(-1493585151);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? c0698o.g(obj) : c0698o.i(obj) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c0698o.g(this) ? 32 : 16;
        }
        if (!c0698o.K(i11 & 1, (i11 & 19) != 18)) {
            c0698o.N();
        } else if (g()) {
            c0698o.T(1824284987);
            c0698o.p(false);
        } else {
            c0698o.T(1822801203);
            p(obj);
            if (j.a(obj, this.f24065a.i())) {
                C0677d0 c0677d0 = this.g;
                if ((((D0) n.u(c0677d0.f10656s, c0677d0)).f10594c != Long.MIN_VALUE) || ((Boolean) this.f24071h.getValue()).booleanValue()) {
                    c0698o.T(1823032494);
                    objH = c0698o.H();
                    s10 = C0690k.f10683a;
                    if (objH == s10) {
                        objH = C0672b.m(c0698o);
                        c0698o.e0(objH);
                    }
                    interfaceC0402u = (InterfaceC0402u) objH;
                    zI = c0698o.i(interfaceC0402u) | ((i11 & 112) == 32);
                    objH2 = c0698o.H();
                    if (zI || objH2 == s10) {
                        objH2 = new L(18, interfaceC0402u, this);
                        c0698o.e0(objH2);
                    }
                    C0672b.c(interfaceC0402u, this, (c) objH2, c0698o);
                    c0698o.p(false);
                } else {
                    c0698o.T(1824275067);
                    c0698o.p(false);
                }
            } else {
                c0698o.T(1823032494);
                objH = c0698o.H();
                s10 = C0690k.f10683a;
                if (objH == s10) {
                    objH = C0672b.m(c0698o);
                    c0698o.e0(objH);
                }
                interfaceC0402u = (InterfaceC0402u) objH;
                zI = c0698o.i(interfaceC0402u) | ((i11 & 112) == 32);
                objH2 = c0698o.H();
                if (zI) {
                    objH2 = new L(18, interfaceC0402u, this);
                    c0698o.e0(objH2);
                } else {
                    objH2 = new L(18, interfaceC0402u, this);
                    c0698o.e0(objH2);
                }
                C0672b.c(interfaceC0402u, this, (c) objH2, c0698o);
                c0698o.p(false);
            }
            c0698o.p(false);
        }
        C0699o0 c0699o0R = c0698o.r();
        if (c0699o0R != null) {
            c0699o0R.f10749d = new G.C(i10, 8, this, obj);
        }
    }

    public final long b() {
        r rVar = this.f24072i;
        int size = rVar.size();
        long jMax = 0;
        for (int i10 = 0; i10 < size; i10++) {
            C0677d0 c0677d0 = ((n0) rVar.get(i10)).f24046C;
            jMax = Math.max(jMax, ((D0) n.u(c0677d0.f10656s, c0677d0)).f10594c);
        }
        r rVar2 = this.j;
        int size2 = rVar2.size();
        for (int i11 = 0; i11 < size2; i11++) {
            jMax = Math.max(jMax, ((q0) rVar2.get(i11)).b());
        }
        return jMax;
    }

    public final void c() {
        r rVar = this.f24072i;
        int size = rVar.size();
        for (int i10 = 0; i10 < size; i10++) {
            n0 n0Var = (n0) rVar.get(i10);
            n0Var.f24055w = null;
            n0Var.f24054v = null;
            n0Var.f24058z = false;
        }
        r rVar2 = this.j;
        int size2 = rVar2.size();
        for (int i11 = 0; i11 < size2; i11++) {
            ((q0) rVar2.get(i11)).c();
        }
    }

    public final boolean d() {
        r rVar = this.f24072i;
        int size = rVar.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (((n0) rVar.get(i10)).f24054v != null) {
                return true;
            }
        }
        r rVar2 = this.j;
        int size2 = rVar2.size();
        for (int i11 = 0; i11 < size2; i11++) {
            if (((q0) rVar2.get(i11)).d()) {
                return true;
            }
        }
        return false;
    }

    public final long e() {
        q0 q0Var = this.f24066b;
        if (q0Var != null) {
            return q0Var.e();
        }
        C0677d0 c0677d0 = this.f24070f;
        return ((D0) n.u(c0677d0.f10656s, c0677d0)).f10594c;
    }

    public final l0 f() {
        return (l0) this.f24069e.getValue();
    }

    public final boolean g() {
        return ((Boolean) this.f24073k.getValue()).booleanValue();
    }

    public final void h(long j, boolean z10) {
        C0677d0 c0677d0 = this.g;
        long j10 = ((D0) n.u(c0677d0.f10656s, c0677d0)).f10594c;
        AbstractC0939l abstractC0939l = this.f24065a;
        if (j10 == Long.MIN_VALUE) {
            c0677d0.g(j);
            ((C0681f0) abstractC0939l.f16104r).setValue(Boolean.TRUE);
        } else if (!((Boolean) ((C0681f0) abstractC0939l.f16104r).getValue()).booleanValue()) {
            ((C0681f0) abstractC0939l.f16104r).setValue(Boolean.TRUE);
        }
        this.f24071h.setValue(Boolean.FALSE);
        r rVar = this.f24072i;
        int size = rVar.size();
        boolean z11 = true;
        for (int i10 = 0; i10 < size; i10++) {
            n0 n0Var = (n0) rVar.get(i10);
            C0681f0 c0681f0 = n0Var.f24056x;
            C0681f0 c0681f1 = n0Var.f24056x;
            if (!((Boolean) c0681f0.getValue()).booleanValue()) {
                long jF = z10 ? n0Var.b().f() : j;
                n0Var.d(n0Var.b().e(jF));
                n0Var.f24045B = n0Var.b().i(jF);
                i0 i0VarB = n0Var.b();
                i0VarB.getClass();
                if (p123m2.c.a(i0VarB, jF)) {
                    c0681f1.setValue(Boolean.TRUE);
                }
            }
            if (!((Boolean) c0681f1.getValue()).booleanValue()) {
                z11 = false;
            }
        }
        r rVar2 = this.j;
        int size2 = rVar2.size();
        for (int i11 = 0; i11 < size2; i11++) {
            q0 q0Var = (q0) rVar2.get(i11);
            C0681f0 c0681f2 = q0Var.f24068d;
            AbstractC0939l abstractC0939l2 = q0Var.f24065a;
            if (!j.a(c0681f2.getValue(), abstractC0939l2.i())) {
                q0Var.h(j, z10);
            }
            if (!j.a(q0Var.f24068d.getValue(), abstractC0939l2.i())) {
                z11 = false;
            }
        }
        if (z11) {
            i();
        }
    }

    public final void i() {
        this.g.g(Long.MIN_VALUE);
        AbstractC0939l abstractC0939l = this.f24065a;
        if (abstractC0939l instanceof I) {
            abstractC0939l.l(this.f24068d.getValue());
        }
        n(0L);
        ((C0681f0) abstractC0939l.f16104r).setValue(Boolean.FALSE);
        r rVar = this.j;
        int size = rVar.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((q0) rVar.get(i10)).i();
        }
    }

    public final void j(float f3) {
        r rVar = this.f24072i;
        int size = rVar.size();
        for (int i10 = 0; i10 < size; i10++) {
            n0 n0Var = (n0) rVar.get(i10);
            n0Var.getClass();
            if (f3 == -4.0f || f3 == -5.0f) {
                i0 i0Var = n0Var.f24055w;
                if (i0Var != null) {
                    n0Var.b().a(i0Var.f24017c);
                    n0Var.f24054v = null;
                    n0Var.f24055w = null;
                }
                Object obj = f3 == -4.0f ? n0Var.b().f24018d : n0Var.b().f24017c;
                n0Var.b().a(obj);
                n0Var.b().b(obj);
                n0Var.d(obj);
                n0Var.f24046C.g(n0Var.b().f());
            } else {
                n0Var.f24057y.h(f3);
            }
        }
        r rVar2 = this.j;
        int size2 = rVar2.size();
        for (int i11 = 0; i11 < size2; i11++) {
            ((q0) rVar2.get(i11)).j(f3);
        }
    }

    public final void k(Object obj, Object obj2) {
        this.g.g(Long.MIN_VALUE);
        AbstractC0939l abstractC0939l = this.f24065a;
        ((C0681f0) abstractC0939l.f16104r).setValue(Boolean.FALSE);
        boolean zG = g();
        C0681f0 c0681f0 = this.f24068d;
        if (!zG || !j.a(abstractC0939l.i(), obj) || !j.a(c0681f0.getValue(), obj2)) {
            if (!j.a(abstractC0939l.i(), obj) && (abstractC0939l instanceof I)) {
                abstractC0939l.l(obj);
            }
            c0681f0.setValue(obj2);
            this.f24073k.setValue(Boolean.TRUE);
            this.f24069e.setValue(new m0(obj, obj2));
        }
        r rVar = this.j;
        int size = rVar.size();
        for (int i10 = 0; i10 < size; i10++) {
            q0 q0Var = (q0) rVar.get(i10);
            j.c(q0Var, "null cannot be cast to non-null type androidx.compose.animation.core.Transition<kotlin.Any>");
            if (q0Var.g()) {
                q0Var.k(q0Var.f24065a.i(), q0Var.f24068d.getValue());
            }
        }
        r rVar2 = this.f24072i;
        int size2 = rVar2.size();
        for (int i11 = 0; i11 < size2; i11++) {
            ((n0) rVar2.get(i11)).c(0L);
        }
    }

    public final void l(long j) {
        C0677d0 c0677d0 = this.g;
        if (((D0) n.u(c0677d0.f10656s, c0677d0)).f10594c == Long.MIN_VALUE) {
            c0677d0.g(j);
        }
        n(j);
        this.f24071h.setValue(Boolean.FALSE);
        r rVar = this.f24072i;
        int size = rVar.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((n0) rVar.get(i10)).c(j);
        }
        r rVar2 = this.j;
        int size2 = rVar2.size();
        for (int i11 = 0; i11 < size2; i11++) {
            q0 q0Var = (q0) rVar2.get(i11);
            if (!j.a(q0Var.f24068d.getValue(), q0Var.f24065a.i())) {
                q0Var.l(j);
            }
        }
    }

    public final void m(O o10) {
        r rVar = this.f24072i;
        int size = rVar.size();
        for (int i10 = 0; i10 < size; i10++) {
            n0 n0Var = (n0) rVar.get(i10);
            C0681f0 c0681f0 = n0Var.f24044A;
            if (!j.a(n0Var.b().f24017c, n0Var.b().f24018d)) {
                n0Var.f24055w = n0Var.b();
                n0Var.f24054v = o10;
            }
            n0Var.f24053u.setValue(new i0(n0Var.f24048E, n0Var.f24050r, c0681f0.getValue(), c0681f0.getValue(), n0Var.f24045B.c()));
            n0Var.f24046C.g(n0Var.b().f());
            n0Var.f24058z = true;
        }
        r rVar2 = this.j;
        int size2 = rVar2.size();
        for (int i11 = 0; i11 < size2; i11++) {
            ((q0) rVar2.get(i11)).m(o10);
        }
    }

    public final void n(long j) {
        if (this.f24066b == null) {
            this.f24070f.g(j);
        }
    }

    public final void o() {
        i0 i0Var;
        r rVar = this.f24072i;
        int size = rVar.size();
        for (int i10 = 0; i10 < size; i10++) {
            n0 n0Var = (n0) rVar.get(i10);
            O o10 = n0Var.f24054v;
            if (o10 != null && (i0Var = n0Var.f24055w) != null) {
                long jW = a.W(o10.g * ((double) o10.f23867d));
                Object objE = i0Var.e(jW);
                if (n0Var.f24058z) {
                    n0Var.b().b(objE);
                }
                n0Var.b().a(objE);
                n0Var.f24046C.g(n0Var.b().f());
                if (n0Var.f24057y.g() == -2.0f || n0Var.f24058z) {
                    n0Var.d(objE);
                } else {
                    n0Var.c(n0Var.f24049F.e());
                }
                if (jW >= o10.g) {
                    n0Var.f24054v = null;
                    n0Var.f24055w = null;
                } else {
                    o10.f23866c = false;
                }
            }
        }
        r rVar2 = this.j;
        int size2 = rVar2.size();
        for (int i11 = 0; i11 < size2; i11++) {
            ((q0) rVar2.get(i11)).o();
        }
    }

    public final void p(Object obj) {
        C0681f0 c0681f0 = this.f24068d;
        if (j.a(c0681f0.getValue(), obj)) {
            return;
        }
        this.f24069e.setValue(new m0(c0681f0.getValue(), obj));
        AbstractC0939l abstractC0939l = this.f24065a;
        if (!j.a(abstractC0939l.i(), c0681f0.getValue())) {
            abstractC0939l.l(c0681f0.getValue());
        }
        c0681f0.setValue(obj);
        C0677d0 c0677d0 = this.g;
        if (((D0) n.u(c0677d0.f10656s, c0677d0)).f10594c == Long.MIN_VALUE) {
            this.f24071h.setValue(Boolean.TRUE);
        }
        r rVar = this.f24072i;
        int size = rVar.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((n0) rVar.get(i10)).f24057y.h(-2.0f);
        }
    }

    public final String toString() {
        r rVar = this.f24072i;
        int size = rVar.size();
        String str = "Transition animation values: ";
        for (int i10 = 0; i10 < size; i10++) {
            str = str + ((n0) rVar.get(i10)) + ", ";
        }
        return str;
    }
}
