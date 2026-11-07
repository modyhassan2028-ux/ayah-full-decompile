package androidx.compose.animation;

import A.D;
import J0.C0285h;
import J0.C0287j;
import J0.InterfaceC0288k;
import W.C0588p;
import W.C0595r1;
import X.C0641m;
import X.L;
import Z.C0672b;
import Z.C0681f0;
import Z.C0690k;
import Z.C0698o;
import Z.C0699o0;
import Z.H0;
import Z.InterfaceC0687i0;
import Z.X;
import android.support.v4.media.session.p;
import java.util.LinkedHashMap;
import l0.h;
import l0.o;
import l0.r;
import p056f2.AbstractC0939l;
import p063g1.l;
import p074h0.d;
import p110k9.y;
import p181s2.t;
import p214w.A;
import p214w.B;
import p214w.C1390c;
import p214w.C1393f;
import p214w.C1402o;
import p214w.C1403p;
import p214w.C1405s;
import p214w.C1406t;
import p214w.G;
import p214w.H;
import p214w.Q;
import p214w.T;
import p214w.x;
import p223x.AbstractC1413d;
import p223x.C1408a0;
import p223x.I;
import p223x.k0;
import p223x.q0;
import p223x.t0;
import p223x.v0;
import p223x.w0;
import p241y9.e;
import p241y9.f;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    public static final void a(q0 q0Var, p241y9.c cVar, r rVar, G g, H h7, e eVar, d dVar, C0698o c0698o, int i10) {
        int i11;
        d dVar2;
        q0 q0Var2;
        Object obj;
        int i12;
        k0 k0Var;
        k0 k0Var2;
        k0 k0Var3;
        boolean z10;
        k0 k0VarB;
        G g10;
        H h10;
        boolean z11;
        c0698o.V(-891967166);
        if ((i10 & 6) == 0) {
            i11 = (c0698o.g(q0Var) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c0698o.i(cVar) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c0698o.g(rVar) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= c0698o.g(g) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= c0698o.g(h7) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i11 |= c0698o.i(eVar) ? 131072 : 65536;
        }
        int i13 = i11 | 1572864;
        if ((12582912 & i10) == 0) {
            i13 |= c0698o.i(dVar) ? 8388608 : 4194304;
        }
        int i14 = i13;
        if (c0698o.K(i14 & 1, (4793491 & i14) != 4793490)) {
            C0681f0 c0681f0 = q0Var.f24068d;
            AbstractC0939l abstractC0939l = q0Var.f24065a;
            if (((Boolean) cVar.e(c0681f0.getValue())).booleanValue() || ((Boolean) cVar.e(abstractC0939l.i())).booleanValue() || q0Var.g() || q0Var.d()) {
                c0698o.T(1788522886);
                int i15 = i14 & 14;
                int i16 = i15 | 48;
                int i17 = i16 & 14;
                boolean z12 = ((i17 ^ 6) > 4 && c0698o.g(q0Var)) || (i16 & 6) == 4;
                Object objH = c0698o.H();
                boolean z13 = z12;
                Object obj2 = C0690k.f10683a;
                if (z13 || objH == obj2) {
                    objH = abstractC0939l.i();
                    c0698o.e0(objH);
                }
                if (q0Var.g()) {
                    objH = abstractC0939l.i();
                }
                c0698o.T(-466616829);
                x xVarD = d(q0Var, cVar, objH, c0698o);
                c0698o.p(false);
                Object value = q0Var.f24068d.getValue();
                c0698o.T(-466616829);
                x xVarD2 = d(q0Var, cVar, value, c0698o);
                c0698o.p(false);
                int i18 = i17 | 3072;
                Object obj3 = t0.f24106a;
                int i19 = (i18 & 14) ^ 6;
                boolean z14 = (i19 > 4 && c0698o.g(q0Var)) || (i18 & 6) == 4;
                Object objH2 = c0698o.H();
                if (z14 || objH2 == obj2) {
                    objH2 = new q0(new I(xVarD), q0Var, p.B(new StringBuilder(), q0Var.f24067c, " > EnterExitTransition"));
                    c0698o.e0(objH2);
                }
                q0 q0Var3 = (q0) objH2;
                boolean zG = ((i19 > 4 && c0698o.g(q0Var)) || (i18 & 6) == 4) | c0698o.g(q0Var3);
                Object objH3 = c0698o.H();
                if (zG || objH3 == obj2) {
                    objH3 = new L(19, q0Var, q0Var3);
                    c0698o.e0(objH3);
                }
                C0672b.d(q0Var3, (p241y9.c) objH3, c0698o);
                if (q0Var.g()) {
                    q0Var3.k(xVarD, xVarD2);
                } else {
                    q0Var3.p(xVarD2);
                    q0Var3.f24073k.setValue(Boolean.FALSE);
                }
                Object objU = C0672b.u(eVar, c0698o);
                AbstractC0939l abstractC0939l2 = q0Var3.f24065a;
                AbstractC0939l abstractC0939l3 = q0Var3.f24065a;
                C0681f0 c0681f1 = q0Var3.f24068d;
                Object objInvoke = eVar.invoke(abstractC0939l2.i(), c0681f1.getValue());
                boolean zG2 = c0698o.g(q0Var3) | c0698o.g(objU);
                Object objH4 = c0698o.H();
                p150o9.c cVar2 = null;
                if (zG2 || objH4 == obj2) {
                    objH4 = new C0641m(q0Var3, objU, cVar2, 17);
                    c0698o.e0(objH4);
                }
                e eVar2 = (e) objH4;
                Object objH5 = c0698o.H();
                if (objH5 == obj2) {
                    objH5 = C0672b.r(objInvoke);
                    c0698o.e0(objH5);
                }
                X x9 = (X) objH5;
                boolean zI = c0698o.i(eVar2);
                Object objH6 = c0698o.H();
                if (zI || objH6 == obj2) {
                    objH6 = new H0(eVar2, x9, null, 0);
                    c0698o.e0(objH6);
                }
                C0672b.f(c0698o, y.f19095a, (e) objH6);
                Object objI = abstractC0939l3.i();
                x xVar = x.f23551t;
                if (objI == xVar && c0681f1.getValue() == xVar && ((Boolean) x9.getValue()).booleanValue()) {
                    c0698o.T(1790688794);
                    c0698o.p(false);
                    dVar2 = dVar;
                    z11 = false;
                } else {
                    c0698o.T(1789551931);
                    boolean z15 = i15 == 4;
                    Object objH7 = c0698o.H();
                    if (z15 || objH7 == obj2) {
                        objH7 = new C1405s();
                        c0698o.e0(objH7);
                    }
                    C1405s c1405s = (C1405s) objH7;
                    v0 v0Var = B.f23415a;
                    boolean zG3 = c0698o.g(q0Var3);
                    Object objH8 = c0698o.H();
                    if (zG3 || objH8 == obj2) {
                        objH8 = C0672b.r(g);
                        c0698o.e0(objH8);
                    }
                    X x10 = (X) objH8;
                    Object objI2 = abstractC0939l3.i();
                    Object value2 = c0681f1.getValue();
                    x xVar2 = x.f23550s;
                    if (objI2 == value2 && abstractC0939l3.i() == xVar2) {
                        if (q0Var3.g()) {
                            x10.setValue(g);
                        } else {
                            x10.setValue(G.f23439b);
                        }
                    } else if (c0681f1.getValue() == xVar2) {
                        x10.setValue(((G) x10.getValue()).a(g));
                    }
                    G g11 = (G) x10.getValue();
                    boolean zG4 = c0698o.g(q0Var3);
                    Object objH9 = c0698o.H();
                    if (zG4 || objH9 == obj2) {
                        objH9 = C0672b.r(h7);
                        c0698o.e0(objH9);
                    }
                    X x11 = (X) objH9;
                    if (abstractC0939l3.i() == c0681f1.getValue() && abstractC0939l3.i() == xVar2) {
                        if (q0Var3.g()) {
                            x11.setValue(h7);
                        } else {
                            x11.setValue(H.f23441b);
                        }
                    } else if (c0681f1.getValue() != xVar2) {
                        x11.setValue(((H) x11.getValue()).a(h7));
                    }
                    H h11 = (H) x11.getValue();
                    T t2 = g11.f23440a;
                    boolean z16 = (t2.f23466b == null && h11.f23443a.f23466b == null) ? false : true;
                    boolean z17 = (t2.f23467c == null && h11.f23443a.f23467c == null) ? false : true;
                    if (z16) {
                        c0698o.T(-821159459);
                        v0 v0Var2 = w0.g;
                        Object objH10 = c0698o.H();
                        if (objH10 == obj2) {
                            objH10 = "Built-in slide";
                            c0698o.e0("Built-in slide");
                        }
                        String str = (String) objH10;
                        q0Var2 = q0Var3;
                        obj = obj2;
                        i12 = 1;
                        k0 k0VarB2 = t0.b(q0Var2, v0Var2, str, c0698o, 384, 0);
                        c0698o.p(false);
                        k0Var = k0VarB2;
                    } else {
                        q0Var2 = q0Var3;
                        obj = obj2;
                        i12 = 1;
                        c0698o.T(-821053656);
                        c0698o.p(false);
                        k0Var = null;
                    }
                    if (z17) {
                        c0698o.T(-820961865);
                        v0 v0Var3 = w0.f24119h;
                        Object objH11 = c0698o.H();
                        if (objH11 == obj) {
                            objH11 = "Built-in shrink/expand";
                            c0698o.e0("Built-in shrink/expand");
                        }
                        k0 k0VarB3 = t0.b(q0Var2, v0Var3, (String) objH11, c0698o, 384, 0);
                        c0698o.p(false);
                        k0Var2 = k0VarB3;
                    } else {
                        c0698o.T(-820851041);
                        c0698o.p(false);
                        k0Var2 = null;
                    }
                    if (z17) {
                        c0698o.T(-820777446);
                        v0 v0Var4 = w0.g;
                        Object objH12 = c0698o.H();
                        if (objH12 == obj) {
                            objH12 = "Built-in InterruptionHandlingOffset";
                            c0698o.e0("Built-in InterruptionHandlingOffset");
                        }
                        k0 k0VarB4 = t0.b(q0Var2, v0Var4, (String) objH12, c0698o, 384, 0);
                        c0698o.p(false);
                        k0Var3 = k0VarB4;
                    } else {
                        c0698o.T(-820608001);
                        c0698o.p(false);
                        k0Var3 = null;
                    }
                    boolean z18 = !z17;
                    if (((g11.f23440a.f23465a == null && h11.f23443a.f23465a == null) ? 0 : i12) != 0) {
                        c0698o.T(-675026101);
                        v0 v0Var5 = w0.f24113a;
                        Object objH13 = c0698o.H();
                        if (objH13 == obj) {
                            objH13 = "Built-in alpha";
                            c0698o.e0("Built-in alpha");
                        }
                        k0VarB = t0.b(q0Var2, v0Var5, (String) objH13, c0698o, 384, 0);
                        z10 = false;
                        c0698o.p(false);
                    } else {
                        z10 = false;
                        c0698o.T(-674857617);
                        c0698o.p(false);
                        k0VarB = null;
                    }
                    c0698o.T(-674621521);
                    c0698o.p(z10);
                    c0698o.T(-674372529);
                    c0698o.p(z10);
                    boolean zI2 = c0698o.i(k0VarB) | c0698o.g(g11) | c0698o.g(h11) | c0698o.i(null) | c0698o.g(q0Var2) | c0698o.i(null);
                    Object objH14 = c0698o.H();
                    if (zI2 || objH14 == obj) {
                        g10 = g11;
                        h10 = h11;
                        objH14 = new p214w.y(k0VarB, null, q0Var2, g10, h10, null);
                        c0698o.e0(objH14);
                    } else {
                        g10 = g11;
                        h10 = h11;
                    }
                    p214w.y yVar = (p214w.y) objH14;
                    boolean zH = c0698o.h(z18);
                    A a9 = A.f23414r;
                    boolean zG5 = zH | c0698o.g(a9);
                    Object objH15 = c0698o.H();
                    if (zG5 || objH15 == obj) {
                        objH15 = new C0595r1(i12, a9, z18);
                        c0698o.e0(objH15);
                    }
                    o oVar = o.f19333a;
                    r rVarB = androidx.compose.ui.graphics.a.a(oVar, (p241y9.c) objH15).b(new EnterExitTransitionElement(q0Var2, k0Var2, k0Var3, k0Var, g10, h10, a9, yVar));
                    c0698o.T(1581779440);
                    c0698o.p(false);
                    r rVarB2 = rVar.b(rVarB.b(oVar));
                    Object objH16 = c0698o.H();
                    if (objH16 == obj) {
                        objH16 = new C1402o(c1405s);
                        c0698o.e0(objH16);
                    }
                    C1402o c1402o = (C1402o) objH16;
                    int i20 = c0698o.f10721P;
                    InterfaceC0687i0 interfaceC0687i0M = c0698o.m();
                    r rVarC = l0.a.c(c0698o, rVarB2);
                    InterfaceC0288k.f4142a.getClass();
                    p241y9.a aVar = C0287j.f4115b;
                    c0698o.X();
                    if (c0698o.f10720O) {
                        c0698o.l(aVar);
                    } else {
                        c0698o.h0();
                    }
                    C0672b.v(c0698o, c1402o, C0287j.f4119f);
                    C0672b.v(c0698o, interfaceC0687i0M, C0287j.f4118e);
                    C0285h c0285h = C0287j.g;
                    if (c0698o.f10720O || !j.a(c0698o.H(), Integer.valueOf(i20))) {
                        p123m2.c.y(i20, c0698o, i20, c0285h);
                    }
                    C0672b.v(c0698o, rVarC, C0287j.f4117d);
                    dVar2 = dVar;
                    dVar2.d(c1405s, c0698o, Integer.valueOf((i14 >> 18) & 112));
                    c0698o.p(true);
                    z11 = false;
                    c0698o.p(false);
                }
                c0698o.p(z11);
            } else {
                c0698o.T(1790694746);
                c0698o.p(false);
                dVar2 = dVar;
            }
        } else {
            dVar2 = dVar;
            c0698o.N();
        }
        C0699o0 c0699o0R = c0698o.r();
        if (c0699o0R != null) {
            c0699o0R.f10749d = new C1403p(q0Var, cVar, rVar, g, h7, eVar, dVar2, i10);
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x004a  */
    /* JADX WARN: Code duplicated, block: B:25:0x0052  */
    /* JADX WARN: Code duplicated, block: B:26:0x0055  */
    /* JADX WARN: Code duplicated, block: B:28:0x0059  */
    /* JADX WARN: Code duplicated, block: B:31:0x0065  */
    /* JADX WARN: Code duplicated, block: B:32:0x0067  */
    /* JADX WARN: Code duplicated, block: B:35:0x0070 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:36:0x0072  */
    /* JADX WARN: Code duplicated, block: B:37:0x007a  */
    /* JADX WARN: Code duplicated, block: B:40:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:41:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:43:0x00af  */
    /* JADX WARN: Code duplicated, block: B:44:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:47:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:48:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:50:0x0101  */
    /* JADX WARN: Code duplicated, block: B:52:0x0153  */
    /* JADX WARN: Code duplicated, block: B:55:0x0163  */
    /* JADX WARN: Code duplicated, block: B:57:? A[RETURN, SYNTHETIC] */
    public static final void b(D.X x9, boolean z10, r rVar, G g, H h7, String str, d dVar, C0698o c0698o, int i10, int i11) {
        int i12;
        r rVar2;
        int i13;
        d dVar2;
        boolean z11;
        G g10;
        H h10;
        String str2;
        r rVar3;
        C0699o0 c0699o0R;
        r rVar4;
        h hVar;
        l0.j jVar;
        int i14;
        l0.j jVar2 = l0.c.f19317v;
        l0.j jVar3 = l0.c.f19318w;
        l0.j jVar4 = l0.c.f19316u;
        h hVar2 = l0.c.f19311F;
        c0698o.V(-1741346906);
        if ((i10 & 48) == 0) {
            i12 = (c0698o.h(z10) ? 32 : 16) | i10;
        } else {
            i12 = i10;
        }
        int i15 = i11 & 2;
        if (i15 == 0) {
            if ((i10 & 384) == 0) {
                rVar2 = rVar;
                i12 |= c0698o.g(rVar2) ? 256 : 128;
            }
            i13 = i12 | 224256;
            if ((1572864 & i10) == 0) {
                dVar2 = dVar;
                if (c0698o.i(dVar2)) {
                    i14 = 1048576;
                } else {
                    i14 = 524288;
                }
                i13 |= i14;
            } else {
                dVar2 = dVar;
            }
            if ((599185 & i13) != 599184) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (c0698o.K(i13 & 1, z11)) {
                if (i15 != 0) {
                    rVar4 = o.f19333a;
                } else {
                    rVar4 = rVar2;
                }
                G gA = B.a(null, 3);
                long j = 1;
                C1408a0 c1408a0P = AbstractC1413d.p(400.0f, 1, new l((j << 32) | (j & 4294967295L)));
                C1390c c1390c = C1390c.f23474B;
                hVar = l0.c.f19309D;
                if (j.a(hVar2, hVar)) {
                    jVar = jVar4;
                } else if (j.a(hVar2, hVar2)) {
                    jVar = jVar3;
                } else {
                    jVar = jVar2;
                }
                G gA2 = gA.a(new G(new T((p214w.I) null, (Q) null, new C1406t(jVar, new p093j0.c(c1390c, 1), c1408a0P), (t) null, (LinkedHashMap) null, 59)));
                H hB = B.b(null, 3);
                long j10 = 1;
                C1408a0 c1408a0P2 = AbstractC1413d.p(400.0f, 1, new l((j10 & 4294967295L) | (j10 << 32)));
                C1390c c1390c2 = C1390c.f23475C;
                if (j.a(hVar2, hVar)) {
                    jVar2 = jVar4;
                } else if (j.a(hVar2, hVar2)) {
                    jVar2 = jVar3;
                }
                H hA = hB.a(new H(new T((p214w.I) null, (Q) null, new C1406t(jVar2, new p093j0.c(c1390c2, 2), c1408a0P2), (t) null, (LinkedHashMap) null, 59)));
                int i16 = i13 >> 3;
                c(t0.e(Boolean.valueOf(z10), "AnimatedVisibility", c0698o, (i16 & 14) | ((i13 >> 12) & 112)), rVar4, gA2, hA, dVar2, c0698o, (i13 & 57344) | (i13 & 896) | 48 | (i13 & 7168) | (i16 & 458752));
                g10 = gA2;
                h10 = hA;
                str2 = "AnimatedVisibility";
                rVar3 = rVar4;
            } else {
                c0698o.N();
                g10 = g;
                h10 = h7;
                str2 = str;
                rVar3 = rVar2;
            }
            c0699o0R = c0698o.r();
            if (c0699o0R != null) {
                c0699o0R.f10749d = new C0588p(x9, z10, rVar3, g10, h10, str2, dVar, i10, i11);
            }
        }
        i12 |= 384;
        rVar2 = rVar;
        i13 = i12 | 224256;
        if ((1572864 & i10) == 0) {
            dVar2 = dVar;
            if (c0698o.i(dVar2)) {
                i14 = 1048576;
            } else {
                i14 = 524288;
            }
            i13 |= i14;
        } else {
            dVar2 = dVar;
        }
        if ((599185 & i13) != 599184) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (c0698o.K(i13 & 1, z11)) {
            if (i15 != 0) {
                rVar4 = o.f19333a;
            } else {
                rVar4 = rVar2;
            }
            G gA3 = B.a(null, 3);
            long j11 = 1;
            C1408a0 c1408a0P3 = AbstractC1413d.p(400.0f, 1, new l((j11 << 32) | (j11 & 4294967295L)));
            C1390c c1390c3 = C1390c.f23474B;
            hVar = l0.c.f19309D;
            if (j.a(hVar2, hVar)) {
                jVar = jVar4;
            } else if (j.a(hVar2, hVar2)) {
                jVar = jVar3;
            } else {
                jVar = jVar2;
            }
            G gA4 = gA3.a(new G(new T((p214w.I) null, (Q) null, new C1406t(jVar, new p093j0.c(c1390c3, 1), c1408a0P3), (t) null, (LinkedHashMap) null, 59)));
            H hB2 = B.b(null, 3);
            long j12 = 1;
            C1408a0 c1408a0P4 = AbstractC1413d.p(400.0f, 1, new l((j12 & 4294967295L) | (j12 << 32)));
            C1390c c1390c4 = C1390c.f23475C;
            if (j.a(hVar2, hVar)) {
                jVar2 = jVar4;
            } else if (j.a(hVar2, hVar2)) {
                jVar2 = jVar3;
            }
            H hA2 = hB2.a(new H(new T((p214w.I) null, (Q) null, new C1406t(jVar2, new p093j0.c(c1390c4, 2), c1408a0P4), (t) null, (LinkedHashMap) null, 59)));
            int i17 = i13 >> 3;
            c(t0.e(Boolean.valueOf(z10), "AnimatedVisibility", c0698o, (i17 & 14) | ((i13 >> 12) & 112)), rVar4, gA4, hA2, dVar2, c0698o, (i13 & 57344) | (i13 & 896) | 48 | (i13 & 7168) | (i17 & 458752));
            g10 = gA4;
            h10 = hA2;
            str2 = "AnimatedVisibility";
            rVar3 = rVar4;
        } else {
            c0698o.N();
            g10 = g;
            h10 = h7;
            str2 = str;
            rVar3 = rVar2;
        }
        c0699o0R = c0698o.r();
        if (c0699o0R != null) {
            c0699o0R.f10749d = new C0588p(x9, z10, rVar3, g10, h10, str2, dVar, i10, i11);
        }
    }

    public static final void c(q0 q0Var, r rVar, G g, H h7, d dVar, C0698o c0698o, int i10) {
        int i11;
        G g10;
        H h10;
        d dVar2;
        C1390c c1390c = C1390c.f23480v;
        c0698o.V(429978603);
        if ((i10 & 6) == 0) {
            i11 = (c0698o.g(q0Var) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c0698o.i(c1390c) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c0698o.g(rVar) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            g10 = g;
            i11 |= c0698o.g(g10) ? 2048 : 1024;
        } else {
            g10 = g;
        }
        if ((i10 & 24576) == 0) {
            h10 = h7;
            i11 |= c0698o.g(h10) ? 16384 : 8192;
        } else {
            h10 = h7;
        }
        if ((i10 & 196608) == 0) {
            dVar2 = dVar;
            i11 |= c0698o.i(dVar2) ? 131072 : 65536;
        } else {
            dVar2 = dVar;
        }
        if (c0698o.K(i11 & 1, (74899 & i11) != 74898)) {
            int i12 = i11 & 112;
            int i13 = i11 & 14;
            boolean z10 = (i12 == 32) | (i13 == 4);
            Object objH = c0698o.H();
            if (z10 || objH == C0690k.f10683a) {
                objH = new D(7, q0Var);
                c0698o.e0(objH);
            }
            a(q0Var, c1390c, androidx.compose.ui.layout.a.b(rVar, (f) objH), g10, h10, C1393f.f23500t, dVar2, c0698o, 196608 | i13 | i12 | (i11 & 7168) | (57344 & i11) | ((i11 << 6) & 29360128));
        } else {
            c0698o.N();
        }
        C0699o0 c0699o0R = c0698o.r();
        if (c0699o0R != null) {
            c0699o0R.f10749d = new p074h0.c(q0Var, rVar, g, h7, dVar, i10, 1);
        }
    }

    public static final x d(q0 q0Var, p241y9.c cVar, Object obj, C0698o c0698o) {
        c0698o.R(-902032957, q0Var);
        boolean zG = q0Var.g();
        AbstractC0939l abstractC0939l = q0Var.f24065a;
        x xVar = x.f23549r;
        x xVar2 = x.f23551t;
        x xVar3 = x.f23550s;
        if (zG) {
            c0698o.T(2101770115);
            c0698o.p(false);
            if (((Boolean) cVar.e(obj)).booleanValue()) {
                xVar = xVar3;
            } else if (((Boolean) cVar.e(abstractC0939l.i())).booleanValue()) {
                xVar = xVar2;
            }
        } else {
            c0698o.T(2102044248);
            Object objH = c0698o.H();
            if (objH == C0690k.f10683a) {
                objH = C0672b.r(Boolean.FALSE);
                c0698o.e0(objH);
            }
            X x9 = (X) objH;
            if (((Boolean) cVar.e(abstractC0939l.i())).booleanValue()) {
                x9.setValue(Boolean.TRUE);
            }
            if (((Boolean) cVar.e(obj)).booleanValue()) {
                xVar = xVar3;
            } else if (((Boolean) x9.getValue()).booleanValue()) {
                xVar = xVar2;
            }
            c0698o.p(false);
        }
        c0698o.p(false);
        return xVar;
    }
}
