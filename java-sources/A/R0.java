package A;

import D.AbstractC0066i;
import D.C0059b;
import Ga.C0192a;
import Ga.C0193b;
import J0.AbstractC0283f;
import J0.C0285h;
import J0.C0286i;
import J0.C0287j;
import J0.InterfaceC0288k;
import K9.AbstractC0405x;
import K9.C0389g;
import K9.InterfaceC0388f;
import W.A2;
import W.C0544c0;
import W.C0556f0;
import W.C0557f1;
import Z.AbstractC0700p;
import Z.C0672b;
import Z.C0681f0;
import Z.C0698o;
import Z.InterfaceC0687i0;
import android.graphics.RectF;
import androidx.compose.ui.platform.AbstractComposeView;
import com.google.android.gms.internal.measurement.AbstractC0813f2;
import io.realm.RealmFieldTypeConstants;
import io.realm.internal.ObjectServerFacade;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import p207v2.AbstractC1367e;
import p207v2.C1369g;
import p207v2.EnumC1375m;

/* JADX INFO: loaded from: classes.dex */
public final class R0 extends p251z9.k implements p241y9.e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f127r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f128s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ R0(int i10, int i11, Object obj) {
        super(2);
        this.f127r = i11;
        this.f128s = obj;
    }

    /* JADX WARN: Code duplicated, block: B:129:0x0262 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:130:0x0264 A[Catch: all -> 0x0257, LOOP:6: B:113:0x021f->B:130:0x0264, LOOP_END, TryCatch #0 {all -> 0x0257, blocks: (B:106:0x01fa, B:108:0x020a, B:110:0x0211, B:113:0x021f, B:115:0x022f, B:117:0x023b, B:119:0x0244, B:121:0x024d, B:126:0x0259, B:127:0x025c, B:130:0x0264, B:140:0x0289, B:131:0x0267, B:132:0x026d, B:134:0x0273, B:136:0x027b, B:139:0x0285), top: B:298:0x01fa }] */
    /* JADX WARN: Code duplicated, block: B:313:0x01ea A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:322:0x0289 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:0x01b3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:88:0x01b5 A[LOOP:3: B:74:0x0176->B:88:0x01b5, LOOP_END] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v149, types: [java.lang.Object, y9.f, z9.k] */
    /* JADX WARN: Type inference failed for: r2v57, types: [y9.c, z9.k] */
    /* JADX WARN: Type inference failed for: r3v45, types: [y9.e, z9.k] */
    /* JADX WARN: Type inference failed for: r5v30, types: [java.lang.Object[], java.util.Set[]] */
    /* JADX WARN: Type inference failed for: r9v13, types: [o9.c] */
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
    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) {
        C0193b c0193b;
        long jH;
        p150o9.h hVar;
        boolean zB;
        Ga.z zVarC;
        boolean zF;
        InterfaceC0388f interfaceC0388fY;
        p085i0.j jVar;
        Object objQ0;
        switch (this.f127r) {
            case 0:
                float fFloatValue = ((Number) obj).floatValue();
                float fFloatValue2 = ((Number) obj2).floatValue();
                S0 s10 = (S0) this.f128s;
                AbstractC0405x.x(s10.h0(), null, new Q0(s10, fFloatValue, fFloatValue2, null), 3);
                return Boolean.TRUE;
            case 1:
                return new p063g1.j((((long) 0) << 32) | (4294967295L & ((long) ((l0.i) this.f128s).a(0, (int) (((p063g1.l) obj).f16260a & 4294967295L)))));
            case 2:
                return new p063g1.j(((l0.j) this.f128s).a(0L, ((p063g1.l) obj).f16260a, (p063g1.m) obj2));
            case 3:
                return new p063g1.j((((long) ((l0.d) this.f128s).a(0, (int) (((p063g1.l) obj).f16260a >> 32), (p063g1.m) obj2)) << 32) | (((long) 0) & 4294967295L));
            case 4:
                D0.v vVar = (D0.v) obj;
                long j = ((p171r0.c) obj2).f21387a;
                p251z9.j.e(vVar, "change");
                vVar.a();
                Ga.A a9 = ((Ga.k) this.f128s).f3045a;
                S9.c cVar = a9.f2960i;
                Ga.J j10 = a9.f2958f;
                p248z6.c cVar2 = a9.f2953a;
                C0681f0 c0681f0 = a9.f2962l;
                c0681f0.setValue(new p171r0.c(p171r0.c.h(((p171r0.c) c0681f0.getValue()).f21387a, j)));
                Ga.z zVarD = a9.d();
                if (zVarD != null) {
                    long jH2 = a9.h(a9.e());
                    a9.i(jH2);
                    long jB = zVarD.b();
                    long jH3 = p171r0.c.h(p171r0.d.a((int) (jB >> 32), (int) (jB & 4294967295L)), jH2);
                    long jD0 = B9.a.d0(zVarD.c());
                    long jA = p171r0.d.a(p171r0.i.d(jD0) + p171r0.c.d(jH3), p171r0.i.b(jD0) + p171r0.c.e(jH3));
                    O8.c cVarH = cVar2.H();
                    C0192a c0192a = a9.f2957e;
                    EnumC0047u0 enumC0047u0S = cVarH.s();
                    ((F.r) cVarH.f6511r).getClass();
                    p251z9.j.e(enumC0047u0S, "orientation");
                    int iOrdinal = enumC0047u0S.ordinal();
                    if (iOrdinal == 0) {
                        c0193b = new C0193b(c0192a.f3004c, c0192a.f3005d);
                    } else {
                        if (iOrdinal != 1) {
                            throw new A6.a();
                        }
                        c0193b = new C0193b(c0192a.f3002a, c0192a.f3003b);
                    }
                    Ga.B bX = cVarH.x(c0193b);
                    float f3 = bX.f2971a;
                    float f7 = bX.f2972b;
                    ((F.r) cVar2.H().f6511r).getClass();
                    boolean z10 = a9.g == p063g1.m.f16262s && a9.f() == EnumC0047u0.f425s;
                    if (z10) {
                        jH = p171r0.c.g(jA, a9.f2966p);
                    } else {
                        if (z10) {
                            throw new A6.a();
                        }
                        jH = p171r0.c.h(jH3, a9.f2966p);
                    }
                    long jR = va.g.r(a9.f(), -((F.r) cVar2.H().f6511r).f2104l);
                    long jH4 = p171r0.c.h(jH, p171r0.d.a((int) (jR >> 32), (int) (jR & 4294967295L)));
                    float fV = va.g.v(jH4, a9.f()) - f3;
                    if (fV < 0.0f) {
                        fV = 0.0f;
                    }
                    float fV2 = f7 - va.g.v(jH4, a9.f());
                    if (fV2 < 0.0f) {
                        fV2 = 0.0f;
                    }
                    float f10 = a9.f2956d;
                    if (fV < f10) {
                        zB = j10.b(Ga.C.f2973r, (1 - B0.c.k((fV + f10) / (f10 * 2), 0.0f, 1.0f)) * 10, new Ga.p(a9, 2), new Ga.u(a9, null, 0));
                        hVar = null;
                    } else if (fV2 < f10) {
                        hVar = null;
                        zB = j10.b(Ga.C.f2974s, (1 - B0.c.k((fV2 + f10) / (f10 * 2), 0.0f, 1.0f)) * 10, new Ga.p(a9, 3), new Ga.u(a9, false ? 1 : 0, 1));
                    } else {
                        hVar = null;
                        AbstractC0405x.x(j10.f2998b, null, new Ga.H(j10, false ? 1 : 0, 1), 3);
                        zB = false;
                    }
                    if (cVar.g()) {
                        K9.A a10 = j10.f3000d;
                        if ((a10 == null || !a10.b()) && !zB && (zVarC = Ga.A.c(a9, p171r0.f.c(jH3, jA), cVar2.H().A(), null, new M0(9, zVarD), 4)) != null) {
                            AbstractC0405x.x(a9.f2954b, hVar, new Ga.r(a9, zVarD, zVarC, hVar, 1), 3);
                        }
                        cVar.b(hVar);
                    }
                }
                return p110k9.y.f19095a;
            case 5:
                C0698o c0698o = (C0698o) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (c0698o.K(iIntValue & 1, (iIntValue & 3) != 2)) {
                    List list = (List) this.f128s;
                    int size = list.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        p241y9.e eVar = (p241y9.e) list.get(i10);
                        int i11 = c0698o.f10721P;
                        InterfaceC0288k.f4142a.getClass();
                        C0286i c0286i = C0287j.f4116c;
                        c0698o.X();
                        if (c0698o.f10720O) {
                            c0698o.l(c0286i);
                        } else {
                            c0698o.h0();
                        }
                        C0285h c0285h = C0287j.g;
                        if (c0698o.f10720O || !p251z9.j.a(c0698o.H(), Integer.valueOf(i11))) {
                            p123m2.c.y(i11, c0698o, i11, c0285h);
                        }
                        eVar.invoke(c0698o, 0);
                        c0698o.p(true);
                    }
                } else {
                    c0698o.N();
                }
                return p110k9.y.f19095a;
            case 6:
                C0698o c0698o2 = (C0698o) obj;
                ((Number) obj2).intValue();
                c0698o2.T(-1744780674);
                String strM0 = p000a.a.m0(((K.e0) this.f128s).f4629r, c0698o2);
                c0698o2.p(false);
                return strM0;
            case 7:
                ((Number) obj2).intValue();
                K.T.i((O.N) this.f128s, (C0698o) obj, C0672b.y(1));
                return p110k9.y.f19095a;
            case 8:
                ((K.g0) this.f128s).e(((p171r0.c) obj2).f21387a);
                return p110k9.y.f19095a;
            case 9:
                ((Number) obj2).intValue();
                ((K.w0) this.f128s).a(C0672b.y(1), (C0698o) obj);
                return p110k9.y.f19095a;
            case 10:
                C0698o c0698o3 = (C0698o) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                if (c0698o3.K(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    ((AbstractComposeView) this.f128s).a(c0698o3);
                } else {
                    c0698o3.N();
                }
                return p110k9.y.f19095a;
            case 11:
                J1.c cVar3 = (J1.c) this.f128s;
                p171r0.e eVarV = p180s0.F.v((RectF) obj);
                p171r0.e eVarV2 = p180s0.F.v((RectF) obj2);
                switch (cVar3.f4195r) {
                    case 24:
                        zF = eVarV.f(eVarV2);
                        break;
                    default:
                        long jB2 = eVarV.b();
                        eVarV2.getClass();
                        float fIntBitsToFloat = Float.intBitsToFloat((int) (jB2 >> 32));
                        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jB2 & 4294967295L));
                        zF = (fIntBitsToFloat >= eVarV2.f21389a) & (fIntBitsToFloat < eVarV2.f21391c) & (fIntBitsToFloat2 >= eVarV2.f21390b) & (fIntBitsToFloat2 < eVarV2.f21392d);
                        break;
                }
                return Boolean.valueOf(zF);
            case 12:
                C0698o c0698o4 = (C0698o) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0698o4.x()) {
                    c0698o4.N();
                } else {
                    C0059b c0059b = AbstractC0066i.f978b;
                    l0.i iVar = l0.c.f19307B;
                    p241y9.f fVar = (p241y9.f) this.f128s;
                    l0.o oVar = l0.o.f19333a;
                    D.W wA = D.U.a(c0059b, iVar, c0698o4, 54);
                    int i12 = c0698o4.f10721P;
                    InterfaceC0687i0 interfaceC0687i0M = c0698o4.m();
                    l0.r rVarC = l0.a.c(c0698o4, oVar);
                    InterfaceC0288k.f4142a.getClass();
                    C0286i c0286i2 = C0287j.f4115b;
                    c0698o4.X();
                    if (c0698o4.f10720O) {
                        c0698o4.l(c0286i2);
                    } else {
                        c0698o4.h0();
                    }
                    C0672b.v(c0698o4, wA, C0287j.f4119f);
                    C0672b.v(c0698o4, interfaceC0687i0M, C0287j.f4118e);
                    C0285h c0285h2 = C0287j.g;
                    if (c0698o4.f10720O || !p251z9.j.a(c0698o4.H(), Integer.valueOf(i12))) {
                        p123m2.c.y(i12, c0698o4, i12, c0285h2);
                    }
                    C0672b.v(c0698o4, rVarC, C0287j.f4117d);
                    fVar.d(D.X.f924a, c0698o4, 6);
                    c0698o4.p(true);
                }
                return p110k9.y.f19095a;
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_LIST /* 13 */:
                long j11 = ((p171r0.c) obj2).f21387a;
                C0556f0 c0556f0 = (C0556f0) this.f128s;
                AbstractC0405x.x(c0556f0.h0(), null, new C0544c0(c0556f0, j11, null, 0), 3);
                A2.r(c0556f0.f9064H, c0556f0.f9067K, c0556f0.f9068L, AbstractC0283f.x(c0556f0).f3912P.w(A2.f8457f), c0556f0.f9069M);
                return p110k9.y.f19095a;
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_LINKING_OBJECTS /* 14 */:
                C0698o c0698o5 = (C0698o) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                if (c0698o5.K(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    throw null;
                }
                c0698o5.N();
                return p110k9.y.f19095a;
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_OBJECTID /* 15 */:
                Set set = (Set) obj;
                Z.s0 s0Var = (Z.s0) this.f128s;
                synchronized (s0Var.f10789b) {
                    try {
                        if (((Z.p0) s0Var.f10805t.getValue()).compareTo(Z.p0.f10762v) >= 0) {
                            u.F f11 = s0Var.g;
                            if (set instanceof p011b0.h) {
                                u.F f12 = ((p011b0.h) set).f13139r;
                                Object[] objArr = f12.f22676b;
                                long[] jArr = f12.f22675a;
                                int length = jArr.length - 2;
                                if (length >= 0) {
                                    int i13 = 0;
                                    while (true) {
                                        long j12 = jArr[i13];
                                        if ((((~j12) << 7) & j12 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i14 = 8 - ((~(i13 - length)) >>> 31);
                                            for (int i15 = 0; i15 < i14; i15++) {
                                                if ((255 & j12) < 128) {
                                                    Object obj3 = objArr[(i13 << 3) + i15];
                                                    if (!(obj3 instanceof p093j0.w) || ((p093j0.w) obj3).e(1)) {
                                                        f11.a(obj3);
                                                    }
                                                }
                                                j12 >>= 8;
                                            }
                                            if (i14 == 8) {
                                                if (i13 != length) {
                                                    i13++;
                                                }
                                            }
                                        } else if (i13 != length) {
                                            i13++;
                                        }
                                    }
                                }
                            } else {
                                for (Object obj4 : set) {
                                    if (!(obj4 instanceof p093j0.w) || ((p093j0.w) obj4).e(1)) {
                                        f11.a(obj4);
                                    }
                                }
                            }
                            interfaceC0388fY = s0Var.y();
                        } else {
                            interfaceC0388fY = null;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                if (interfaceC0388fY != null) {
                    ((C0389g) interfaceC0388fY).resumeWith(p110k9.y.f19095a);
                }
                return p110k9.y.f19095a;
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_TYPED_LINK /* 16 */:
                Set set2 = (Set) obj;
                if (set2 instanceof p011b0.h) {
                    u.F f13 = ((p011b0.h) set2).f13139r;
                    Object[] objArr2 = f13.f22676b;
                    long[] jArr2 = f13.f22675a;
                    int length2 = jArr2.length - 2;
                    if (length2 >= 0) {
                        int i16 = 0;
                        while (true) {
                            long j13 = jArr2[i16];
                            if ((((~j13) << 7) & j13 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i17 = 8 - ((~(i16 - length2)) >>> 31);
                                int i18 = 0;
                                while (true) {
                                    if (i18 < i17) {
                                        if ((255 & j13) < 128) {
                                            Object obj5 = objArr2[(i16 << 3) + i18];
                                            if (!(obj5 instanceof p093j0.w) || ((p093j0.w) obj5).e(4)) {
                                            }
                                        }
                                        j13 >>= 8;
                                        i18++;
                                    } else if (i17 == 8) {
                                        if (i16 != length2) {
                                            i16++;
                                        }
                                    }
                                }
                            } else if (i16 != length2) {
                                i16++;
                            }
                        }
                        ((M9.e) this.f128s).k(set2);
                    }
                } else {
                    Set set3 = set2;
                    if (!(set3 instanceof Collection) || !set3.isEmpty()) {
                        for (Object obj6 : set3) {
                            if (!(obj6 instanceof p093j0.w) || ((p093j0.w) obj6).e(4)) {
                                ((M9.e) this.f128s).k(set2);
                            }
                        }
                    }
                }
                return p110k9.y.f19095a;
            case 17:
                p085i0.b bVar = (p085i0.b) obj;
                List list2 = (List) ((p251z9.k) this.f128s).invoke(bVar, obj2);
                int size2 = list2.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    Object obj7 = list2.get(i19);
                    if (obj7 != null && (jVar = bVar.f16706s) != null && !jVar.b(obj7)) {
                        throw new IllegalArgumentException("item can't be saved");
                    }
                }
                if (list2.isEmpty()) {
                    return null;
                }
                return new ArrayList(list2);
            case 18:
                Set set4 = (Set) obj;
                p093j0.u uVar = (p093j0.u) this.f128s;
                AtomicReference atomicReference = uVar.f18687b;
                while (true) {
                    Object obj8 = atomicReference.get();
                    if (obj8 == null) {
                        objQ0 = set4;
                    } else if (obj8 instanceof Set) {
                        objQ0 = p120l9.l.S(new Set[]{obj8, set4});
                    } else {
                        if (!(obj8 instanceof List)) {
                            AbstractC0700p.d("Unexpected notification");
                            throw new A6.a();
                        }
                        objQ0 = p120l9.m.q0((Collection) obj8, AbstractC0813f2.K(set4));
                    }
                    do {
                        if (atomicReference.compareAndSet(obj8, objQ0)) {
                            if (p093j0.u.a(uVar)) {
                                uVar.f18686a.e(new C0557f1(13, uVar));
                            }
                            return p110k9.y.f19095a;
                        }
                    } while (atomicReference.get() == obj8);
                }
                break;
            case ObjectServerFacade.SYNC_CONFIG_OPTIONS /* 19 */:
                l0.r rVar = (l0.r) obj;
                l0.r rVarB = (l0.p) obj2;
                C0698o c0698o6 = (C0698o) this.f128s;
                if (rVarB instanceof l0.m) {
                    ?? r10 = ((l0.m) rVarB).f19331a;
                    p251z9.y.b(3, r10);
                    rVarB = l0.a.b(c0698o6, (l0.r) r10.d(l0.o.f19333a, c0698o6, 0));
                }
                return rVar.b(rVarB);
            case 20:
                ((p131n0.c) this.f128s).k(((Number) obj).intValue(), (R0.p) obj2);
                return p110k9.y.f19095a;
            case 21:
                C1369g c1369g = (C1369g) obj;
                C1369g c1369g2 = (C1369g) obj2;
                p251z9.j.e(c1369g, "prependHint");
                p251z9.j.e(c1369g2, "appendHint");
                p207v2.n0 n0Var = (p207v2.n0) this.f128s;
                if (AbstractC1367e.a(n0Var, c1369g.f23233a, EnumC1375m.f23269s)) {
                    c1369g.f23233a = n0Var;
                    c1369g.f23234b.g(n0Var);
                }
                if (AbstractC1367e.a(n0Var, c1369g2.f23233a, EnumC1375m.f23270t)) {
                    c1369g2.f23233a = n0Var;
                    c1369g2.f23234b.g(n0Var);
                }
                return p110k9.y.f19095a;
            case 22:
                p214w.x xVar = (p214w.x) obj;
                p214w.x xVar2 = (p214w.x) obj2;
                p214w.x xVar3 = p214w.x.f23551t;
                return Boolean.valueOf(xVar == xVar3 && xVar2 == xVar3 && !((p214w.H) this.f128s).f23443a.f23468d);
            default:
                ((Number) obj2).intValue();
                ((p223x.F) this.f128s).a(C0672b.y(1), (C0698o) obj);
                return p110k9.y.f19095a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ R0(int i10, Object obj) {
        super(2);
        this.f127r = i10;
        this.f128s = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public R0(p241y9.e eVar) {
        super(2);
        this.f127r = 17;
        this.f128s = (p251z9.k) eVar;
    }
}
