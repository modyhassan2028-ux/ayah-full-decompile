package Z;

import J0.C0299w;
import K0.m1;
import K9.InterfaceC0402u;
import N9.InterfaceC0415h;
import X.C0641m;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: renamed from: Z.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0672b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f10650a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final F f10651b = new F();

    /* JADX WARN: Code duplicated, block: B:36:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:52:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:55:0x0103  */
    /* JADX WARN: Code duplicated, block: B:57:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final void a(C0695m0 c0695m0, p241y9.e eVar, C0698o c0698o, int i10) {
        O0 o10;
        InterfaceC0687i0 hVar;
        boolean z10;
        InterfaceC0687i0 interfaceC0687i0;
        C0699o0 c0699o0R;
        InterfaceC0687i0 interfaceC0687i1;
        InterfaceC0687i0 hVar2;
        c0698o.V(-1350970552);
        C0299w c0299w = c0698o.f10742w;
        InterfaceC0687i0 interfaceC0687i0M = c0698o.m();
        c0698o.Q(201, AbstractC0700p.f10753b);
        Object objH = c0698o.H();
        if (p251z9.j.a(objH, C0690k.f10683a)) {
            o10 = null;
        } else {
            p251z9.j.c(objH, "null cannot be cast to non-null type androidx.compose.runtime.ValueHolder<kotlin.Any?>");
            o10 = (O0) objH;
        }
        AbstractC0693l0 abstractC0693l0 = c0695m0.f10694a;
        Object objC = abstractC0693l0.c(c0695m0, o10);
        boolean zEquals = objC.equals(o10);
        if (!zEquals) {
            c0698o.e0(objC);
        }
        if (!c0698o.f10720O) {
            w0 w0Var = c0698o.f10711F;
            Object objB = w0Var.b(w0Var.f10840b, w0Var.g);
            p251z9.j.c(objB, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
            InterfaceC0687i0 interfaceC0687i2 = (InterfaceC0687i0) objB;
            if (!(c0698o.x() && zEquals) && (c0695m0.f10699f || !((p074h0.h) interfaceC0687i0M).containsKey(abstractC0693l0))) {
                p074h0.h hVar3 = (p074h0.h) interfaceC0687i0M;
                Da.r rVarU = hVar3.f15717r.u(abstractC0693l0.hashCode(), 0, abstractC0693l0, objC);
                hVar = hVar3;
                if (rVarU != null) {
                    hVar = new p074h0.h((p042e0.m) rVarU.f1388t, hVar3.f15718s + rVarU.f1387s);
                }
            } else if (!zEquals || c0698o.f10741v) {
                hVar = interfaceC0687i0M;
                if (!c0698o.f10741v) {
                    hVar = interfaceC0687i2;
                }
            } else {
                hVar = interfaceC0687i2;
            }
            interfaceC0687i1 = hVar;
            if (c0698o.f10743x || interfaceC0687i2 != hVar) {
                z10 = true;
                interfaceC0687i0 = hVar;
            }
            if (z10 && !c0698o.f10720O) {
                c0698o.F(interfaceC0687i0);
            }
            c0299w.c(c0698o.f10741v ? 1 : 0);
            c0698o.f10741v = z10;
            c0698o.f10715J = interfaceC0687i0;
            c0698o.O(202, 0, AbstractC0700p.f10754c, interfaceC0687i0);
            eVar.invoke(c0698o, Integer.valueOf((i10 >> 3) & 14));
            c0698o.p(false);
            c0698o.p(false);
            c0698o.f10741v = c0299w.b() != 0;
            c0698o.f10715J = null;
            c0699o0R = c0698o.r();
            if (c0699o0R != null) {
                c0699o0R.f10749d = new G.C(i10, 5, c0695m0, eVar);
            }
        }
        if (c0695m0.f10699f || !((p074h0.h) interfaceC0687i0M).containsKey(abstractC0693l0)) {
            hVar2 = interfaceC0687i0M;
            p074h0.h hVar4 = (p074h0.h) interfaceC0687i0M;
            Da.r rVarU2 = hVar4.f15717r.u(abstractC0693l0.hashCode(), 0, abstractC0693l0, objC);
            hVar2 = hVar4;
            if (rVarU2 != null) {
                hVar2 = new p074h0.h((p042e0.m) rVarU2.f1388t, hVar4.f15718s + rVarU2.f1387s);
            }
        }
        hVar2 = interfaceC0687i0M;
        c0698o.f10714I = true;
        interfaceC0687i1 = hVar2;
        z10 = false;
        interfaceC0687i0 = interfaceC0687i1;
        if (z10) {
            c0698o.F(interfaceC0687i0);
        }
        c0299w.c(c0698o.f10741v ? 1 : 0);
        c0698o.f10741v = z10;
        c0698o.f10715J = interfaceC0687i0;
        c0698o.O(202, 0, AbstractC0700p.f10754c, interfaceC0687i0);
        eVar.invoke(c0698o, Integer.valueOf((i10 >> 3) & 14));
        c0698o.p(false);
        c0698o.p(false);
        c0698o.f10741v = c0299w.b() != 0;
        c0698o.f10715J = null;
        c0699o0R = c0698o.r();
        if (c0699o0R != null) {
            c0699o0R.f10749d = new G.C(i10, 5, c0695m0, eVar);
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:29:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:31:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final void b(C0695m0[] c0695m0Arr, p241y9.e eVar, C0698o c0698o, int i10) {
        InterfaceC0687i0 interfaceC0687i0D0;
        boolean z10;
        C0699o0 c0699o0R;
        c0698o.V(-1390796515);
        C0299w c0299w = c0698o.f10742w;
        InterfaceC0687i0 interfaceC0687i0M = c0698o.m();
        c0698o.Q(201, AbstractC0700p.f10753b);
        if (c0698o.f10720O) {
            interfaceC0687i0D0 = c0698o.d0(interfaceC0687i0M, z(c0695m0Arr, interfaceC0687i0M, p074h0.h.f16418u));
            c0698o.f10714I = true;
        } else {
            w0 w0Var = c0698o.f10711F;
            Object objG = w0Var.g(w0Var.g, 0);
            p251z9.j.c(objG, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
            InterfaceC0687i0 interfaceC0687i0 = (InterfaceC0687i0) objG;
            w0 w0Var2 = c0698o.f10711F;
            Object objG2 = w0Var2.g(w0Var2.g, 1);
            p251z9.j.c(objG2, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
            InterfaceC0687i0 interfaceC0687i1 = (InterfaceC0687i0) objG2;
            p074h0.h hVarZ = z(c0695m0Arr, interfaceC0687i0M, interfaceC0687i1);
            if (!c0698o.x() || c0698o.f10743x || !interfaceC0687i1.equals(hVarZ)) {
                interfaceC0687i0D0 = c0698o.d0(interfaceC0687i0M, hVarZ);
                if (c0698o.f10743x || !p251z9.j.a(interfaceC0687i0D0, interfaceC0687i0)) {
                    z10 = true;
                }
                if (z10 && !c0698o.f10720O) {
                    c0698o.F(interfaceC0687i0D0);
                }
                c0299w.c(c0698o.f10741v ? 1 : 0);
                c0698o.f10741v = z10;
                c0698o.f10715J = interfaceC0687i0D0;
                c0698o.O(202, 0, AbstractC0700p.f10754c, interfaceC0687i0D0);
                eVar.invoke(c0698o, Integer.valueOf((i10 >> 3) & 14));
                c0698o.p(false);
                c0698o.p(false);
                c0698o.f10741v = c0299w.b() != 0;
                c0698o.f10715J = null;
                c0699o0R = c0698o.r();
                if (c0699o0R != null) {
                    c0699o0R.f10749d = new G.C(i10, 4, c0695m0Arr, eVar);
                }
            }
            c0698o.f10730k = c0698o.f10711F.p() + c0698o.f10730k;
            interfaceC0687i0D0 = interfaceC0687i0;
        }
        z10 = false;
        if (z10) {
            c0698o.F(interfaceC0687i0D0);
        }
        c0299w.c(c0698o.f10741v ? 1 : 0);
        c0698o.f10741v = z10;
        c0698o.f10715J = interfaceC0687i0D0;
        c0698o.O(202, 0, AbstractC0700p.f10754c, interfaceC0687i0D0);
        eVar.invoke(c0698o, Integer.valueOf((i10 >> 3) & 14));
        c0698o.p(false);
        c0698o.p(false);
        c0698o.f10741v = c0299w.b() != 0;
        c0698o.f10715J = null;
        c0699o0R = c0698o.r();
        if (c0699o0R != null) {
            c0699o0R.f10749d = new G.C(i10, 4, c0695m0Arr, eVar);
        }
    }

    public static final void c(Object obj, Object obj2, p241y9.c cVar, C0698o c0698o) {
        boolean zG = c0698o.g(obj) | c0698o.g(obj2);
        Object objH = c0698o.H();
        if (zG || objH == C0690k.f10683a) {
            objH = new D(cVar);
            c0698o.e0(objH);
        }
    }

    public static final void d(Object obj, p241y9.c cVar, C0698o c0698o) {
        boolean zG = c0698o.g(obj);
        Object objH = c0698o.H();
        if (zG || objH == C0690k.f10683a) {
            objH = new D(cVar);
            c0698o.e0(objH);
        }
    }

    public static final void e(Object[] objArr, p241y9.c cVar, C0698o c0698o) {
        boolean zG = false;
        for (Object obj : Arrays.copyOf(objArr, objArr.length)) {
            zG |= c0698o.g(obj);
        }
        Object objH = c0698o.H();
        if (zG || objH == C0690k.f10683a) {
            c0698o.e0(new D(cVar));
        }
    }

    public static final void f(C0698o c0698o, Object obj, p241y9.e eVar) {
        p150o9.h hVarH = c0698o.f10723b.h();
        boolean zG = c0698o.g(obj);
        Object objH = c0698o.H();
        if (zG || objH == C0690k.f10683a) {
            objH = new P(hVarH, eVar);
            c0698o.e0(objH);
        }
    }

    public static final void g(Object obj, Object obj2, p241y9.e eVar, C0698o c0698o) {
        p150o9.h hVarH = c0698o.f10723b.h();
        boolean zG = c0698o.g(obj) | c0698o.g(obj2);
        Object objH = c0698o.H();
        if (zG || objH == C0690k.f10683a) {
            objH = new P(hVarH, eVar);
            c0698o.e0(objH);
        }
    }

    public static final void h(p241y9.a aVar, C0698o c0698o) {
        p001a0.J j = c0698o.f10717L.f11088b.f11086i;
        j.W(p001a0.A.f11071c);
        p050e8.b.Y(j, 0, aVar);
    }

    public static final void i(u.s sVar, int i10) {
        if (sVar.f22758b == 0 || !(sVar.c(0) == i10 || sVar.c(sVar.f22758b - 1) == i10)) {
            int i11 = sVar.f22758b;
            sVar.a(i10);
            while (i11 > 0) {
                int i12 = ((i11 + 1) >>> 1) - 1;
                int iC = sVar.c(i12);
                if (i10 <= iC) {
                    break;
                }
                sVar.e(i11, iC);
                i11 = i12;
            }
            sVar.e(i11, i10);
        }
    }

    public static void j(A0 a9, List list, C0704u c0704u) {
        if (list.isEmpty()) {
            return;
        }
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            int iC = a9.c((C0670a) list.get(i10));
            int iK = a9.K(a9.f10561b, a9.q(iC));
            Object obj = iK < a9.f(a9.f10561b, a9.q(iC + 1)) ? a9.f10562c[a9.g(iK)] : C0690k.f10683a;
            C0699o0 c0699o0 = obj instanceof C0699o0 ? (C0699o0) obj : null;
            if (c0699o0 != null) {
                c0699o0.f10747b = c0704u;
            }
        }
    }

    public static final X k(InterfaceC0415h interfaceC0415h, Object obj, p150o9.h hVar, C0698o c0698o, int i10, int i11) {
        if ((i11 & 2) != 0) {
            hVar = p150o9.i.f20380r;
        }
        boolean zI = c0698o.i(hVar) | c0698o.i(interfaceC0415h);
        Object objH = c0698o.H();
        p150o9.c cVar = null;
        Object obj2 = C0690k.f10683a;
        if (zI || objH == obj2) {
            objH = new C0641m(hVar, interfaceC0415h, cVar, 4);
            c0698o.e0(objH);
        }
        p241y9.e eVar = (p241y9.e) objH;
        Object objH2 = c0698o.H();
        if (objH2 == obj2) {
            objH2 = r(obj);
            c0698o.e0(objH2);
        }
        X x9 = (X) objH2;
        boolean zI2 = c0698o.i(eVar);
        Object objH3 = c0698o.H();
        if (zI2 || objH3 == obj2) {
            objH3 = new H0(eVar, x9, cVar, 2);
            c0698o.e0(objH3);
        }
        g(interfaceC0415h, hVar, (p241y9.e) objH3, c0698o);
        return x9;
    }

    public static final X l(N9.i0 i0Var, C0698o c0698o) {
        return k(i0Var, i0Var.getValue(), p150o9.i.f20380r, c0698o, 0, 0);
    }

    public static final InterfaceC0402u m(C0698o c0698o) {
        return new v0(c0698o.f10723b.h());
    }

    public static final p011b0.e n() {
        p074h0.i iVar = G0.f10598b;
        p011b0.e eVar = (p011b0.e) iVar.n();
        if (eVar != null) {
            return eVar;
        }
        p011b0.e eVar2 = new p011b0.e(new C0696n[0]);
        iVar.D(eVar2);
        return eVar2;
    }

    public static final C o(p241y9.a aVar) {
        p074h0.i iVar = G0.f10597a;
        return new C(aVar, null);
    }

    public static final T p(p150o9.h hVar) {
        T t2 = (T) hVar.i(S.f10639s);
        if (t2 != null) {
            return t2;
        }
        throw new IllegalStateException("A MonotonicFrameClock is not available in this CoroutineContext. Callers should supply an appropriate MonotonicFrameClock using withContext.");
    }

    public static List q(A0 a9, int i10, A0 a10, boolean z10, boolean z11, boolean z12) {
        List list;
        boolean z13;
        C0670a c0670aP;
        int iS = a9.s(i10);
        int i11 = i10 + iS;
        int iF = a9.f(a9.f10561b, a9.q(i10));
        int iF2 = a9.f(a9.f10561b, a9.q(i11));
        int i12 = iF2 - iF;
        boolean z14 = i10 >= 0 && (a9.f10561b[(a9.q(i10) * 5) + 1] & 201326592) != 0;
        a10.u(iS);
        a10.v(i12, a10.f10577t);
        if (a9.g < i11) {
            a9.z(i11);
        }
        if (a9.f10568k < iF2) {
            a9.A(iF2, i11);
        }
        int[] iArr = a10.f10561b;
        int i13 = a10.f10577t;
        int i14 = i13 * 5;
        p120l9.l.W(i14, i10 * 5, i11 * 5, a9.f10561b, iArr);
        Object[] objArr = a10.f10562c;
        int i15 = a10.f10567i;
        System.arraycopy(a9.f10562c, iF, objArr, i15, i12);
        int i16 = a10.f10579v;
        iArr[i14 + 2] = i16;
        int i17 = i13 - i10;
        int i18 = i13 + iS;
        int iF3 = i15 - a10.f(iArr, i13);
        int i19 = a10.f10570m;
        int i20 = a10.f10569l;
        int length = objArr.length;
        boolean z15 = z14;
        int i21 = i19;
        int i22 = i13;
        while (i22 < i18) {
            if (i22 != i13) {
                int i23 = (i22 * 5) + 2;
                iArr[i23] = iArr[i23] + i17;
            }
            int[] iArr2 = iArr;
            iArr2[(i22 * 5) + 4] = A0.h(a10.f(iArr, i22) + iF3, i21 < i22 ? 0 : a10.f10568k, i20, length);
            if (i22 == i21) {
                i21++;
            }
            i22++;
            i13 = i13;
            iArr = iArr2;
        }
        int[] iArr3 = iArr;
        a10.f10570m = i21;
        int iB = z0.b(a9.f10563d, i10, a9.n());
        int iB2 = z0.b(a9.f10563d, i11, a9.n());
        if (iB < iB2) {
            ArrayList arrayList = a9.f10563d;
            ArrayList arrayList2 = new ArrayList(iB2 - iB);
            for (int i24 = iB; i24 < iB2; i24++) {
                C0670a c0670a = (C0670a) arrayList.get(i24);
                c0670a.f10648a += i17;
                arrayList2.add(c0670a);
            }
            a10.f10563d.addAll(z0.b(a10.f10563d, a10.f10577t, a10.n()), arrayList2);
            arrayList.subList(iB, iB2).clear();
            list = arrayList2;
        } else {
            list = p120l9.r.f19440r;
        }
        if (!list.isEmpty()) {
            HashMap map = a9.f10564e;
            HashMap map2 = a10.f10564e;
            if (map != null && map2 != null) {
                int size = list.size();
                for (int i25 = 0; i25 < size; i25++) {
                }
            }
        }
        int i26 = a10.f10579v;
        HashMap map3 = a10.f10564e;
        if (map3 != null && (c0670aP = a10.P(i16)) != null) {
        }
        int iC = a9.C(a9.f10561b, i10);
        if (!z12) {
            z13 = false;
        } else if (z10) {
            boolean z16 = iC >= 0;
            if (z16) {
                a9.N();
                a9.a(iC - a9.f10577t);
                a9.N();
            }
            a9.a(i10 - a9.f10577t);
            boolean zF = a9.F();
            if (z16) {
                a9.J();
                a9.i();
                a9.J();
                a9.i();
            }
            z13 = zF;
        } else {
            boolean zG = a9.G(i10, iS);
            a9.H(iF, i12, i10 - 1);
            z13 = zG;
        }
        if (z13) {
            AbstractC0700p.c("Unexpectedly removed anchors");
        }
        int i27 = a10.f10572o;
        int i28 = iArr3[i14 + 1];
        a10.f10572o = i27 + ((1073741824 & i28) != 0 ? 1 : i28 & 67108863);
        if (z11) {
            a10.f10577t = i18;
            a10.f10567i = i15 + i12;
        }
        if (z15) {
            a10.R(i16);
        }
        return list;
    }

    public static C0681f0 r(Object obj) {
        return new C0681f0(obj, S.f10643w);
    }

    public static final Object s(InterfaceC0687i0 interfaceC0687i0, AbstractC0693l0 abstractC0693l0) {
        p251z9.j.c(abstractC0693l0, "null cannot be cast to non-null type androidx.compose.runtime.CompositionLocal<kotlin.Any?>");
        p074h0.h hVar = (p074h0.h) interfaceC0687i0;
        Object objB = hVar.get(abstractC0693l0);
        if (objB == null) {
            objB = abstractC0693l0.b();
        }
        return ((O0) objB).a(hVar);
    }

    public static final C0694m t(C0698o c0698o) {
        C0698o c0698o2;
        c0698o.Q(206, AbstractC0700p.f10756e);
        if (c0698o.f10720O) {
            A0.x(c0698o.f10713H);
        }
        Object objZ = c0698o.z();
        C0692l c0692l = objZ instanceof C0692l ? (C0692l) objZ : null;
        if (c0692l == null) {
            c0698o2 = c0698o;
            c0692l = new C0692l(new C0694m(c0698o2, c0698o.f10721P, c0698o.f10735p, c0698o.f10707B, c0698o.g.f10818I));
            c0698o2.f0(c0692l);
        } else {
            c0698o2 = c0698o;
        }
        C0694m c0694m = c0692l.f10686r;
        c0694m.f10693f.setValue(c0698o2.m());
        c0698o2.p(false);
        return c0694m;
    }

    public static final X u(Object obj, C0698o c0698o) {
        Object objH = c0698o.H();
        if (objH == C0690k.f10683a) {
            objH = r(obj);
            c0698o.e0(objH);
        }
        X x9 = (X) objH;
        x9.setValue(obj);
        return x9;
    }

    public static final void v(C0698o c0698o, Object obj, p241y9.e eVar) {
        if (c0698o.f10720O || !p251z9.j.a(c0698o.H(), obj)) {
            c0698o.e0(obj);
            c0698o.c(obj, eVar);
        }
    }

    public static final C4.e w(p241y9.a aVar) {
        return new C4.e(new m1(aVar, null));
    }

    public static final int x(u.s sVar) {
        int iC;
        int i10 = sVar.f22758b;
        int iC2 = sVar.c(0);
        while (sVar.f22758b != 0 && sVar.c(0) == iC2) {
            int i11 = sVar.f22758b;
            if (i11 == 0) {
                p204v.a.e("IntList is empty.");
                throw null;
            }
            sVar.e(0, sVar.f22757a[i11 - 1]);
            sVar.d(sVar.f22758b - 1);
            int i12 = sVar.f22758b;
            int i13 = i12 >>> 1;
            int i14 = 0;
            while (i14 < i13) {
                int iC3 = sVar.c(i14);
                int i15 = (i14 + 1) * 2;
                int i16 = i15 - 1;
                int iC4 = sVar.c(i16);
                if (i15 < i12 && (iC = sVar.c(i15)) > iC4) {
                    if (iC <= iC3) {
                        break;
                    }
                    sVar.e(i14, iC);
                    sVar.e(i15, iC3);
                    i14 = i15;
                } else {
                    if (iC4 <= iC3) {
                        break;
                    }
                    sVar.e(i14, iC4);
                    sVar.e(i16, iC3);
                    i14 = i16;
                }
            }
        }
        return iC2;
    }

    public static final int y(int i10) {
        int i11 = 306783378 & i10;
        int i12 = 613566756 & i10;
        return (i10 & (-920350135)) | (i12 >> 1) | i11 | ((i11 << 1) & i12);
    }

    public static final p074h0.h z(C0695m0[] c0695m0Arr, InterfaceC0687i0 interfaceC0687i0, InterfaceC0687i0 interfaceC0687i1) {
        p074h0.g gVar = new p074h0.g(p074h0.h.f16418u);
        for (C0695m0 c0695m0 : c0695m0Arr) {
            AbstractC0693l0 abstractC0693l0 = c0695m0.f10694a;
            if (c0695m0.f10699f || !((p074h0.h) interfaceC0687i0).containsKey(abstractC0693l0)) {
                gVar.put(abstractC0693l0, abstractC0693l0.c(c0695m0, (O0) ((p074h0.h) interfaceC0687i1).get(abstractC0693l0)));
            }
        }
        return gVar.b();
    }
}
