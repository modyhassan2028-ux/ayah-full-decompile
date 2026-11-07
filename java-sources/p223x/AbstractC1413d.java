package p223x;

import K0.C0378x0;
import K0.P0;
import W.F1;
import X.L;
import Z.C0672b;
import Z.C0690k;
import Z.C0698o;
import Z.S;
import Z.U;
import java.util.concurrent.CancellationException;
import l0.s;
import p110k9.y;
import p150o9.h;
import p161p9.a;
import p241y9.c;
import p241y9.e;
import p251z9.j;
import p251z9.v;
import q9.i;

/* JADX INFO: renamed from: x.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1413d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1423l f23951a = new C1423l(Float.POSITIVE_INFINITY);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C1424m f23952b = new C1424m(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C1425n f23953c = new C1425n(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C1426o f23954d = new C1426o(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final C1423l f23955e = new C1423l(Float.NEGATIVE_INFINITY);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final C1424m f23956f = new C1424m(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);
    public static final C1425n g = new C1425n(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final C1426o f23957h = new C1426o(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final float[] f23958i = new float[91];

    public static C1411c a(float f3) {
        return new C1411c(Float.valueOf(f3), w0.f24113a, Float.valueOf(0.01f), 8);
    }

    public static C1422k b(int i10, float f3) {
        if ((i10 & 2) != 0) {
            f3 = 0.0f;
        }
        return new C1422k(w0.f24113a, Float.valueOf(0.0f), new C1423l(f3), Long.MIN_VALUE, Long.MIN_VALUE, false);
    }

    public static final Object c(float f3, float f7, float f10, InterfaceC1421j interfaceC1421j, e eVar, i iVar) {
        v0 v0Var = w0.f24113a;
        Float f11 = new Float(f3);
        Float f12 = new Float(f7);
        C1423l c1423l = new C1423l(new Float(f10).floatValue());
        Object objD = d(new C1422k(v0Var, f11, c1423l, 56), new i0(interfaceC1421j, v0Var, f11, f12, c1423l), Long.MIN_VALUE, new P0(eVar, 1), iVar);
        y yVar = y.f19095a;
        a aVar = a.f21156r;
        if (objD != aVar) {
            objD = yVar;
        }
        return objD == aVar ? objD : yVar;
    }

    /* JADX WARN: Code duplicated, block: B:66:0x015e  */
    /* JADX WARN: Code duplicated, block: B:69:0x016b  */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    public static final Object d(C1422k c1422k, InterfaceC1417f interfaceC1417f, long j, c cVar, q9.c cVar2) {
        C1414d0 c1414d0;
        v vVar;
        C1422k c1422k2;
        C1422k c1422k3;
        v vVar2;
        Object objB0;
        c cVar3;
        C1420i c1420i;
        C1420i c1420i2;
        Object objB1;
        InterfaceC1417f interfaceC1417f2 = interfaceC1417f;
        if (cVar2 instanceof C1414d0) {
            c1414d0 = (C1414d0) cVar2;
            int i10 = c1414d0.f23964w;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c1414d0.f23964w = i10 - Integer.MIN_VALUE;
            } else {
                c1414d0 = new C1414d0(cVar2);
            }
        } else {
            c1414d0 = new C1414d0(cVar2);
        }
        C1414d0 c1414d1 = c1414d0;
        Object obj = c1414d1.f23963v;
        int i11 = c1414d1.f23964w;
        a aVar = a.f21156r;
        if (i11 == 0) {
            p110k9.a.e(obj);
            Object objE = interfaceC1417f2.e(0L);
            AbstractC1427p abstractC1427pI = interfaceC1417f2.i(0L);
            vVar = new v();
            if (j == Long.MIN_VALUE) {
                try {
                    c1422k2 = c1422k;
                    try {
                        f0 f0Var = new f0(vVar, objE, interfaceC1417f2, abstractC1427pI, c1422k2, m(c1414d1.getContext()), cVar);
                        vVar2 = vVar;
                        try {
                            c1414d1.f23959r = c1422k2;
                            c1414d1.f23960s = interfaceC1417f2;
                            c1414d1.f23961t = cVar;
                            c1414d1.f23962u = vVar2;
                            c1414d1.f23964w = 1;
                            if (interfaceC1417f2.d()) {
                                objB0 = s(f0Var, c1414d1);
                            } else {
                                objB0 = C0672b.p(c1414d1.getContext()).b0(new U(f0Var, 4), c1414d1);
                            }
                            if (objB0 != aVar) {
                                c1422k3 = c1422k2;
                                cVar3 = cVar;
                                vVar = vVar2;
                            }
                            return aVar;
                        } catch (CancellationException e10) {
                            e = e10;
                            c1422k3 = c1422k2;
                            vVar = vVar2;
                            c1420i = (C1420i) vVar.f24886r;
                            if (c1420i != null) {
                                c1420i.f24014i.setValue(Boolean.FALSE);
                            }
                            c1420i2 = (C1420i) vVar.f24886r;
                            if (c1420i2 != null) {
                                c1422k3.f24032w = false;
                            }
                            throw e;
                        }
                    } catch (CancellationException e11) {
                        e = e11;
                        c1422k3 = c1422k2;
                        c1420i = (C1420i) vVar.f24886r;
                        if (c1420i != null) {
                            c1420i.f24014i.setValue(Boolean.FALSE);
                        }
                        c1420i2 = (C1420i) vVar.f24886r;
                        if (c1420i2 != null) {
                            c1422k3.f24032w = false;
                        }
                        throw e;
                    }
                } catch (CancellationException e12) {
                    e = e12;
                    c1422k2 = c1422k;
                }
            } else {
                vVar2 = vVar;
                try {
                    C1420i c1420i3 = new C1420i(objE, interfaceC1417f2.g(), abstractC1427pI, j, interfaceC1417f2.h(), j, new C1416e0(1, c1422k));
                    l(c1420i3, j, m(c1414d1.getContext()), interfaceC1417f2, c1422k, cVar);
                    vVar2.f24886r = c1420i3;
                    c1422k3 = c1422k;
                    interfaceC1417f2 = interfaceC1417f;
                    cVar3 = cVar;
                    vVar = vVar2;
                } catch (CancellationException e13) {
                    e = e13;
                    c1422k3 = c1422k;
                    vVar = vVar2;
                    c1420i = (C1420i) vVar.f24886r;
                    if (c1420i != null) {
                        c1420i.f24014i.setValue(Boolean.FALSE);
                    }
                    c1420i2 = (C1420i) vVar.f24886r;
                    if (c1420i2 != null && c1420i2.g == c1422k3.f24030u) {
                        c1422k3.f24032w = false;
                    }
                    throw e;
                }
            }
        } else {
            if (i11 != 1 && i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            vVar = c1414d1.f23962u;
            cVar3 = c1414d1.f23961t;
            interfaceC1417f2 = c1414d1.f23960s;
            c1422k3 = c1414d1.f23959r;
            try {
                p110k9.a.e(obj);
            } catch (CancellationException e14) {
                e = e14;
                c1420i = (C1420i) vVar.f24886r;
                if (c1420i != null) {
                    c1420i.f24014i.setValue(Boolean.FALSE);
                }
                c1420i2 = (C1420i) vVar.f24886r;
                if (c1420i2 != null) {
                    c1422k3.f24032w = false;
                }
                throw e;
            }
        }
        do {
            Object obj2 = vVar.f24886r;
            j.b(obj2);
            if (!((Boolean) ((C1420i) obj2).f24014i.getValue()).booleanValue()) {
                return y.f19095a;
            }
            v vVar3 = vVar;
            c cVar4 = cVar3;
            InterfaceC1417f interfaceC1417f3 = interfaceC1417f2;
            C1422k c1422k4 = c1422k3;
            try {
                g0 g0Var = new g0(vVar3, m(c1414d1.getContext()), interfaceC1417f3, c1422k4, cVar4);
                vVar = vVar3;
                interfaceC1417f2 = interfaceC1417f3;
                c1422k3 = c1422k4;
                cVar3 = cVar4;
                c1414d1.f23959r = c1422k3;
                c1414d1.f23960s = interfaceC1417f2;
                c1414d1.f23961t = cVar3;
                c1414d1.f23962u = vVar;
                c1414d1.f23964w = 2;
                if (interfaceC1417f2.d()) {
                    objB1 = s(g0Var, c1414d1);
                } else {
                    objB1 = C0672b.p(c1414d1.getContext()).b0(new U(g0Var, 4), c1414d1);
                }
            } catch (CancellationException e15) {
                e = e15;
                vVar = vVar3;
                c1422k3 = c1422k4;
                c1420i = (C1420i) vVar.f24886r;
                if (c1420i != null) {
                    c1420i.f24014i.setValue(Boolean.FALSE);
                }
                c1420i2 = (C1420i) vVar.f24886r;
                if (c1420i2 != null) {
                    c1422k3.f24032w = false;
                }
                throw e;
            }
        } while (objB1 != aVar);
        return aVar;
    }

    public static /* synthetic */ Object e(float f3, float f7, InterfaceC1421j interfaceC1421j, e eVar, i iVar, int i10) {
        if ((i10 & 8) != 0) {
            interfaceC1421j = p(0.0f, 7, null);
        }
        return c(f3, f7, 0.0f, interfaceC1421j, eVar, iVar);
    }

    public static final D f(F f3, float f7, C c10, C0698o c0698o) {
        return i(f3, Float.valueOf(0.0f), Float.valueOf(f7), w0.f24113a, c10, c0698o, 33208, 0);
    }

    public static final Object g(C1422k c1422k, Float f3, InterfaceC1421j interfaceC1421j, boolean z10, c cVar, q9.c cVar2) {
        Object objD = d(c1422k, new i0(interfaceC1421j, c1422k.f24027r, c1422k.f24028s.getValue(), f3, c1422k.f24029t), z10 ? c1422k.f24030u : Long.MIN_VALUE, cVar, cVar2);
        return objD == a.f21156r ? objD : y.f19095a;
    }

    public static /* synthetic */ Object h(C1422k c1422k, Float f3, C1408a0 c1408a0, boolean z10, c cVar, q9.c cVar2, int i10) {
        if ((i10 & 2) != 0) {
            c1408a0 = p(0.0f, 7, null);
        }
        C1408a0 c1408a1 = c1408a0;
        if ((i10 & 8) != 0) {
            cVar = h0.f23998s;
        }
        return g(c1422k, f3, c1408a1, z10, cVar, cVar2);
    }

    public static final D i(F f3, Number number, Number number2, v0 v0Var, C c10, C0698o c0698o, int i10, int i11) {
        Object objH = c0698o.H();
        S s10 = C0690k.f10683a;
        if (objH == s10) {
            D d5 = new D(f3, number, number2, v0Var, c10);
            c0698o.e0(d5);
            objH = d5;
        }
        D d9 = (D) objH;
        boolean z10 = (((57344 & i10) ^ 24576) > 16384 && c0698o.i(c10)) || (i10 & 24576) == 16384;
        Object objH2 = c0698o.H();
        if (z10 || objH2 == s10) {
            F1 f7 = new F1(number, d9, number2, c10, 2);
            c0698o.e0(f7);
            objH2 = f7;
        }
        C0672b.h((p241y9.a) objH2, c0698o);
        boolean zI = c0698o.i(f3);
        Object objH3 = c0698o.H();
        if (zI || objH3 == s10) {
            objH3 = new L(17, f3, d9);
            c0698o.e0(objH3);
        }
        C0672b.d(d9, (c) objH3, c0698o);
        return d9;
    }

    public static final AbstractC1427p j(AbstractC1427p abstractC1427p) {
        AbstractC1427p abstractC1427pC = abstractC1427p.c();
        int iB = abstractC1427pC.b();
        for (int i10 = 0; i10 < iB; i10++) {
            abstractC1427pC.e(i10, abstractC1427p.a(i10));
        }
        return abstractC1427pC;
    }

    public static C1422k k(C1422k c1422k, float f3) {
        float f7 = ((C1423l) c1422k.f24029t).f24036a;
        return new C1422k(c1422k.f24027r, Float.valueOf(f3), new C1423l(f7), c1422k.f24030u, c1422k.f24031v, c1422k.f24032w);
    }

    public static final void l(C1420i c1420i, long j, float f3, InterfaceC1417f interfaceC1417f, C1422k c1422k, c cVar) {
        long jF = f3 == 0.0f ? interfaceC1417f.f() : (long) ((j - c1420i.f24009c) / f3);
        c1420i.g = j;
        c1420i.f24011e.setValue(interfaceC1417f.e(jF));
        c1420i.f24012f = interfaceC1417f.i(jF);
        if (interfaceC1417f.j(jF)) {
            c1420i.f24013h = c1420i.g;
            c1420i.f24014i.setValue(Boolean.FALSE);
        }
        r(c1420i, c1422k);
        cVar.e(c1420i);
    }

    public static final float m(h hVar) {
        s sVar = (s) hVar.i(l0.c.f19312G);
        float fO = sVar != null ? sVar.O() : 1.0f;
        if (fO >= 0.0f) {
            return fO;
        }
        M.b("negative scale factor");
        return fO;
    }

    public static C n(InterfaceC1432v interfaceC1432v) {
        return new C(interfaceC1432v, 0);
    }

    public static final F o(C0698o c0698o) {
        Object objH = c0698o.H();
        if (objH == C0690k.f10683a) {
            objH = new F();
            c0698o.e0(objH);
        }
        F f3 = (F) objH;
        f3.a(0, c0698o);
        return f3;
    }

    public static C1408a0 p(float f3, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            f3 = 1500.0f;
        }
        if ((i10 & 4) != 0) {
            obj = null;
        }
        return new C1408a0(1.0f, f3, obj);
    }

    public static u0 q(int i10, int i11, InterfaceC1433w interfaceC1433w, int i12) {
        if ((i12 & 1) != 0) {
            i10 = 300;
        }
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        if ((i12 & 4) != 0) {
            interfaceC1433w = AbstractC1434x.f24121a;
        }
        return new u0(i10, i11, interfaceC1433w);
    }

    public static final void r(C1420i c1420i, C1422k c1422k) {
        c1422k.f24028s.setValue(c1420i.f24011e.getValue());
        AbstractC1427p abstractC1427p = c1422k.f24029t;
        AbstractC1427p abstractC1427p2 = c1420i.f24012f;
        int iB = abstractC1427p.b();
        for (int i10 = 0; i10 < iB; i10++) {
            abstractC1427p.e(i10, abstractC1427p2.a(i10));
        }
        c1422k.f24031v = c1420i.f24013h;
        c1422k.f24030u = c1420i.g;
        c1422k.f24032w = ((Boolean) c1420i.f24014i.getValue()).booleanValue();
    }

    public static final Object s(c cVar, q9.c cVar2) {
        if (cVar2.getContext().i(C0378x0.f5202r) == null) {
            return C0672b.p(cVar2.getContext()).b0(cVar, cVar2);
        }
        throw new ClassCastException();
    }
}
