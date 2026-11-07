package A;

import G.C0191z;
import J0.AbstractC0283f;
import K.C0317k;
import U0.C0513e;
import U0.C0515g;
import W.H1;
import W.I1;
import X.C0629a;
import Z0.C0710a;
import android.graphics.Canvas;
import android.os.Build;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.viewinterop.ViewFactoryHolder;
import androidx.lifecycle.InterfaceC0771u;
import com.google.android.gms.internal.measurement.AbstractC0813f2;
import io.realm.RealmFieldTypeConstants;
import io.realm.internal.ObjectServerFacade;
import java.util.List;
import java.util.concurrent.CancellationException;
import p180s0.AbstractC1295d;
import p207v2.C1363a;
import p207v2.C1374l;
import p214w.C1401n;

/* JADX INFO: renamed from: A.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0023i extends p251z9.k implements p241y9.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f255r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f256s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f257t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f258u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0023i(Object obj, Object obj2, Object obj3, int i10) {
        super(1);
        this.f255r = i10;
        this.f256s = obj;
        this.f257t = obj2;
        this.f258u = obj3;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:371:0x080d  */
    /* JADX WARN: Type inference failed for: r7v31, types: [y9.c, z9.k] */
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
    @Override // p241y9.c
    public final Object e(Object obj) throws Throwable {
        p180s0.o oVar;
        C0513e c0513e;
        Integer numE;
        Integer numD;
        Integer numD2;
        Integer numE2;
        U0.I i10;
        U0.I i11;
        K.t0 t0Var;
        K.t0 t0Var2;
        U0.I i12;
        U0.I i13;
        K.t0 t0Var3;
        K.t0 t0Var4;
        Integer numD3;
        Integer numE3;
        Integer numE4;
        Integer numD4;
        M.k kVar;
        K.W w9;
        int i14 = this.f255r;
        int i15 = 4;
        int i16 = 3;
        int i17 = 2;
        Z0.y yVar = null;
        m = null;
        p180s0.M m10 = null;
        Z0.y yVar2 = null;
        yVar = null;
        int i18 = 0;
        boolean zBooleanValue = false;
        i18 = 0;
        i18 = 0;
        i18 = 0;
        int i19 = 1;
        p110k9.y yVar3 = p110k9.y.f19095a;
        Object obj2 = this.f257t;
        Object obj3 = this.f256s;
        Object obj4 = this.f258u;
        switch (i14) {
            case 0:
                float fFloatValue = ((Number) obj).floatValue();
                C0031m c0031m = (C0031m) obj3;
                float f3 = c0031m.f317H ? 1.0f : -1.0f;
                b1 b1Var = c0031m.f316G;
                long jE = b1Var.e(b1Var.h(f3 * fFloatValue));
                b1 b1Var2 = ((Z0) obj4).f178a;
                float fG = b1Var.g(b1Var.e(b1.a(b1Var2, b1Var2.j, jE, 1))) * f3;
                if (Math.abs(fG) < Math.abs(fFloatValue)) {
                    CancellationException cancellationException = new CancellationException("Scroll animation cancelled because scroll was not consumed (" + fG + " < " + fFloatValue + ')');
                    cancellationException.initCause(null);
                    ((K9.a0) obj2).e(cancellationException);
                }
                return yVar3;
            case 1:
                E0.d dVar = (E0.d) obj3;
                E0.c cVar = (E0.c) dVar.f1420c;
                E0.c cVar2 = (E0.c) dVar.f1419b;
                p017b7.g.H(dVar, (D0.v) obj);
                D0.O o10 = (D0.O) ((D0.z) obj2);
                o10.getClass();
                float fA = AbstractC0283f.x(o10).R.a();
                long jE2 = Y2.a.e(fA, fA);
                if (p063g1.q.b(jE2) <= 0.0f || p063g1.q.c(jE2) <= 0.0f) {
                    G0.a.b("maximumVelocity should be a positive value. You specified=" + ((Object) p063g1.q.g(jE2)));
                }
                long jE3 = Y2.a.e(cVar2.b(p063g1.q.b(jE2)), cVar.b(p063g1.q.c(jE2)));
                E0.a[] aVarArr = cVar2.f1414d;
                p120l9.l.e0(0, aVarArr.length, null, aVarArr);
                cVar2.f1415e = 0;
                E0.a[] aVarArr2 = cVar.f1414d;
                p120l9.l.e0(0, aVarArr2.length, null, aVarArr2);
                cVar.f1415e = 0;
                dVar.f1418a = 0L;
                M9.e eVar = ((T) obj4).f145L;
                if (eVar != null) {
                    U u8 = V.f152a;
                    eVar.k(new C0050w(Y2.a.e(Float.isNaN(p063g1.q.b(jE3)) ? 0.0f : p063g1.q.b(jE3), Float.isNaN(p063g1.q.c(jE3)) ? 0.0f : p063g1.q.c(jE3))));
                }
                return yVar3;
            case 2:
                H0.U u10 = (H0.U) obj2;
                H0.T t2 = (H0.T) obj;
                H0.K k7 = (H0.K) obj4;
                D.N n6 = (D.N) obj3;
                if (n6.f902H) {
                    H0.T.g(t2, u10, k7.E(n6.f900F), k7.E(n6.f901G));
                } else {
                    t2.d(u10, k7.E(n6.f900F), k7.E(n6.f901G), 0.0f);
                }
                return yVar3;
            case 3:
                H0.U u11 = (H0.U) obj2;
                H0.T t10 = (H0.T) obj;
                H0.K k10 = (H0.K) obj4;
                D.O o11 = (D.O) obj3;
                if (o11.f907J) {
                    H0.T.g(t10, u11, k10.E(o11.f903F), k10.E(o11.f904G));
                } else {
                    t10.d(u11, k10.E(o11.f903F), k10.E(o11.f904G), 0.0f);
                }
                return yVar3;
            case 4:
                Ga.z zVar = (Ga.z) obj;
                p251z9.j.e(zVar, "item");
                long jB = zVar.b();
                Ga.A a9 = (Ga.A) obj3;
                return Boolean.valueOf(((Boolean) a9.f2959h.invoke((p171r0.e) obj2, p171r0.f.d(p171r0.d.a((float) ((int) (jB >> 32)), (float) ((int) (jB & 4294967295L))), B9.a.d0(zVar.c())))).booleanValue() && a9.f2967q.contains(zVar.f3106a.f2117i) && ((Boolean) ((p241y9.c) obj4).e(zVar)).booleanValue());
            case 5:
                Z0.y yVar4 = (Z0.y) obj;
                ((Z.X) obj2).setValue(yVar4);
                Z.X x9 = (Z.X) obj4;
                boolean zA = p251z9.j.a((String) x9.getValue(), yVar4.f10953a.f8060s);
                C0515g c0515g = yVar4.f10953a;
                x9.setValue(c0515g.f8060s);
                if (!zA) {
                    ((p241y9.c) obj3).e(c0515g.f8060s);
                }
                return yVar3;
            case 6:
                p196u0.d dVar2 = (p196u0.d) obj;
                K.W w10 = (K.W) obj3;
                K.t0 t0VarD = w10.d();
                if (t0VarD != null) {
                    Z0.y yVar5 = (Z0.y) obj2;
                    Z0.s sVar = (Z0.s) obj4;
                    p180s0.o oVarP = dVar2.y().p();
                    long j = ((U0.K) w10.f4576z.getValue()).f8035a;
                    long j10 = ((U0.K) w10.f4552A.getValue()).f8035a;
                    U0.I i20 = t0VarD.f4794a;
                    U0.H h7 = i20.f8023a;
                    U0.p pVar = i20.f8024b;
                    N9.b0 b0Var = w10.f4574x;
                    long j11 = w10.f4575y;
                    if (!U0.K.b(j)) {
                        b0Var.e(j11);
                        int iB = sVar.b(U0.K.e(j));
                        int iB2 = sVar.b(U0.K.d(j));
                        if (iB != iB2) {
                            oVarP.d(i20.h(iB, iB2), b0Var);
                        }
                    } else if (!U0.K.b(j10)) {
                        long jB2 = h7.f8016b.b();
                        p180s0.q qVar = new p180s0.q(jB2);
                        if (jB2 == 16) {
                            qVar = null;
                        }
                        long j12 = qVar != null ? qVar.f21845a : p180s0.q.f21839b;
                        b0Var.e(p180s0.q.b(j12, p180s0.q.d(j12) * 0.2f));
                        int iB3 = sVar.b(U0.K.e(j10));
                        int iB4 = sVar.b(U0.K.d(j10));
                        if (iB3 != iB4) {
                            oVarP.d(i20.h(iB3, iB4), b0Var);
                        }
                    } else if (!U0.K.b(yVar5.f10954b)) {
                        b0Var.e(j11);
                        long j13 = yVar5.f10954b;
                        int iB5 = sVar.b(U0.K.e(j13));
                        int iB6 = sVar.b(U0.K.d(j13));
                        if (iB5 != iB6) {
                            oVarP.d(i20.h(iB5, iB6), b0Var);
                        }
                    }
                    long j14 = i20.f8025c;
                    boolean z10 = ((((float) ((int) (j14 >> 32))) > pVar.f8109d ? 1 : (((float) ((int) (j14 >> 32))) == pVar.f8109d ? 0 : -1)) < 0 || pVar.f8108c || (((float) ((int) (j14 & 4294967295L))) > pVar.f8110e ? 1 : (((float) ((int) (j14 & 4294967295L))) == pVar.f8110e ? 0 : -1)) < 0) && h7.f8020f != 3;
                    if (z10) {
                        p171r0.e eVarD = p171r0.f.d(0L, (((long) Float.floatToRawIntBits((int) (j14 >> 32))) << 32) | (((long) Float.floatToRawIntBits((int) (j14 & 4294967295L))) & 4294967295L));
                        oVarP.q();
                        oVarP.a(eVarD);
                    }
                    U0.C c10 = h7.f8016b.f8037a;
                    p055f1.l lVar = c10.f8004m;
                    p055f1.p pVar2 = c10.f7994a;
                    if (lVar == null) {
                        lVar = p055f1.l.f15913b;
                    }
                    p055f1.l lVar2 = lVar;
                    p180s0.I i21 = c10.f8005n;
                    if (i21 == null) {
                        i21 = p180s0.I.f21798d;
                    }
                    p180s0.I i22 = i21;
                    p196u0.c cVar3 = c10.f8006o;
                    if (cVar3 == null) {
                        cVar3 = p196u0.f.f22800b;
                    }
                    p196u0.c cVar4 = cVar3;
                    try {
                        p180s0.F fE = pVar2.e();
                        p055f1.n nVar = p055f1.n.f15918a;
                        try {
                            if (fE != null) {
                                oVar = oVarP;
                                U0.p.j(pVar, oVar, fE, pVar2 != nVar ? pVar2.c() : 1.0f, i22, lVar2, cVar4);
                            } else {
                                oVar = oVarP;
                                U0.p.i(pVar, oVar, pVar2 != nVar ? pVar2.b() : p180s0.q.f21839b, i22, lVar2, cVar4);
                            }
                            if (z10) {
                                oVar.n();
                            }
                        } catch (Throwable th) {
                            th = th;
                            if (z10) {
                                oVarP.n();
                            }
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
                return yVar3;
            case 7:
                C0513e c0513e2 = (C0513e) obj;
                C0513e c0513e3 = (C0513e) obj2;
                p251z9.r rVar = (p251z9.r) obj3;
                if (rVar.f24882r) {
                    Object obj5 = c0513e2.f8054a;
                    int i23 = c0513e2.f8056c;
                    int i24 = c0513e2.f8055b;
                    if ((obj5 instanceof U0.C) && i24 == c0513e3.f8055b && i23 == c0513e3.f8056c) {
                        U0.C c11 = (U0.C) obj4;
                        if (c11 == null) {
                            c11 = new U0.C(0L, 0L, (Y0.l) null, (Y0.j) null, (Y0.k) null, (Y0.e) null, (String) null, 0L, (p055f1.a) null, (p055f1.q) null, (p012b1.c) null, 0L, (p055f1.l) null, (p180s0.I) null, 65535);
                        }
                        c0513e = new C0513e(i24, i23, c11);
                    } else {
                        c0513e = c0513e2;
                    }
                } else {
                    c0513e = c0513e2;
                }
                rVar.f24882r = c0513e3.equals(c0513e2);
                return c0513e;
            case 8:
                p241y9.c cVar5 = (p241y9.c) obj2;
                Z0.E e10 = (Z0.E) ((p251z9.v) obj4).f24886r;
                Z0.y yVarL = ((L5.c) obj3).l((List) obj);
                if (e10 != null) {
                    e10.a(null, yVarL);
                }
                cVar5.e(yVarL);
                return yVar3;
            case 9:
                O.G g = (O.G) obj;
                K.j0 j0Var = (K.j0) obj2;
                int i25 = 27;
                switch (((K.O) obj3).ordinal()) {
                    case 0:
                        g.f6289e.f6339a = null;
                        if (g.g.f8060s.length() > 0) {
                            if (U0.K.b(g.f6290f)) {
                                g.i();
                            } else if (g.f()) {
                                int iE = U0.K.e(g.f6290f);
                                g.p(iE, iE);
                            } else {
                                int iD = U0.K.d(g.f6290f);
                                g.p(iD, iD);
                            }
                        }
                        return yVar3;
                    case 1:
                        g.f6289e.f6339a = null;
                        if (g.g.f8060s.length() > 0) {
                            if (U0.K.b(g.f6290f)) {
                                g.l();
                            } else if (g.f()) {
                                int iD2 = U0.K.d(g.f6290f);
                                g.p(iD2, iD2);
                            } else {
                                int iE2 = U0.K.e(g.f6290f);
                                g.p(iE2, iE2);
                            }
                        }
                        return yVar3;
                    case 2:
                        O.T t11 = g.f6289e;
                        t11.f6339a = null;
                        C0515g c0515g2 = g.g;
                        String str = c0515g2.f8060s;
                        String str2 = c0515g2.f8060s;
                        if (str.length() > 0) {
                            if (g.f()) {
                                t11.f6339a = null;
                                if (str2.length() > 0 && (numD = g.d()) != null) {
                                    int iIntValue = numD.intValue();
                                    g.p(iIntValue, iIntValue);
                                }
                            } else {
                                t11.f6339a = null;
                                if (str2.length() > 0 && (numE = g.e()) != null) {
                                    int iIntValue2 = numE.intValue();
                                    g.p(iIntValue2, iIntValue2);
                                }
                            }
                        }
                        return yVar3;
                    case 3:
                        O.T t12 = g.f6289e;
                        t12.f6339a = null;
                        C0515g c0515g3 = g.g;
                        String str3 = c0515g3.f8060s;
                        String str4 = c0515g3.f8060s;
                        if (str3.length() > 0) {
                            if (g.f()) {
                                t12.f6339a = null;
                                if (str4.length() > 0 && (numE2 = g.e()) != null) {
                                    int iIntValue3 = numE2.intValue();
                                    g.p(iIntValue3, iIntValue3);
                                }
                            } else {
                                t12.f6339a = null;
                                if (str4.length() > 0 && (numD2 = g.d()) != null) {
                                    int iIntValue4 = numD2.intValue();
                                    g.p(iIntValue4, iIntValue4);
                                }
                            }
                        }
                        return yVar3;
                    case 4:
                        g.j();
                        return yVar3;
                    case 5:
                        g.k();
                        return yVar3;
                    case 6:
                        g.n();
                        return yVar3;
                    case 7:
                        g.m();
                        return yVar3;
                    case 8:
                        g.f6289e.f6339a = null;
                        if (g.g.f8060s.length() > 0) {
                            if (g.f()) {
                                g.n();
                            } else {
                                g.m();
                            }
                        }
                        return yVar3;
                    case 9:
                        g.f6289e.f6339a = null;
                        if (g.g.f8060s.length() > 0) {
                            if (g.f()) {
                                g.m();
                            } else {
                                g.n();
                            }
                        }
                        return yVar3;
                    case 10:
                        if (g.g.f8060s.length() > 0 && (i10 = g.f6287c) != null) {
                            int iG = g.g(i10, -1);
                            g.p(iG, iG);
                        }
                        return yVar3;
                    case 11:
                        if (g.g.f8060s.length() > 0 && (i11 = g.f6287c) != null) {
                            int iG2 = g.g(i11, 1);
                            g.p(iG2, iG2);
                        }
                        return yVar3;
                    case 12:
                        if (g.g.f8060s.length() > 0 && (t0Var = g.f6292i) != null) {
                            int iH = g.h(t0Var, -1);
                            g.p(iH, iH);
                        }
                        return yVar3;
                    case RealmFieldTypeConstants.CORE_TYPE_VALUE_LIST /* 13 */:
                        if (g.g.f8060s.length() > 0 && (t0Var2 = g.f6292i) != null) {
                            int iH2 = g.h(t0Var2, 1);
                            g.p(iH2, iH2);
                        }
                        return yVar3;
                    case RealmFieldTypeConstants.CORE_TYPE_VALUE_LINKING_OBJECTS /* 14 */:
                        g.f6289e.f6339a = null;
                        if (g.g.f8060s.length() > 0) {
                            g.p(0, 0);
                        }
                        return yVar3;
                    case RealmFieldTypeConstants.CORE_TYPE_VALUE_OBJECTID /* 15 */:
                        g.f6289e.f6339a = null;
                        C0515g c0515g4 = g.g;
                        if (c0515g4.f8060s.length() > 0) {
                            int length = c0515g4.f8060s.length();
                            g.p(length, length);
                        }
                        return yVar3;
                    case RealmFieldTypeConstants.CORE_TYPE_VALUE_TYPED_LINK /* 16 */:
                        j0Var.f4653b.b(false);
                        return yVar3;
                    case 17:
                        j0Var.f4653b.m();
                        return yVar3;
                    case 18:
                        j0Var.f4653b.d();
                        return yVar3;
                    case ObjectServerFacade.SYNC_CONFIG_OPTIONS /* 19 */:
                        List listA = g.a(C0317k.f4673x);
                        if (listA != null) {
                            j0Var.a(listA);
                        }
                        return yVar3;
                    case 20:
                        List listA2 = g.a(C0317k.f4674y);
                        if (listA2 != null) {
                            j0Var.a(listA2);
                        }
                        return yVar3;
                    case 21:
                        List listA3 = g.a(C0317k.f4675z);
                        if (listA3 != null) {
                            j0Var.a(listA3);
                        }
                        return yVar3;
                    case 22:
                        List listA4 = g.a(C0317k.f4662A);
                        if (listA4 != null) {
                            j0Var.a(listA4);
                        }
                        return yVar3;
                    case 23:
                        List listA5 = g.a(C0317k.f4663B);
                        if (listA5 != null) {
                            j0Var.a(listA5);
                        }
                        return yVar3;
                    case 24:
                        List listA6 = g.a(C0317k.f4664C);
                        if (listA6 != null) {
                            j0Var.a(listA6);
                        }
                        return yVar3;
                    case 25:
                        g.f6289e.f6339a = null;
                        C0515g c0515g5 = g.g;
                        if (c0515g5.f8060s.length() > 0) {
                            g.p(0, c0515g5.f8060s.length());
                        }
                        return yVar3;
                    case 26:
                        g.i();
                        g.o();
                        return yVar3;
                    case 27:
                        g.l();
                        g.o();
                        return yVar3;
                    case 28:
                        if (g.g.f8060s.length() > 0 && (i12 = g.f6287c) != null) {
                            int iG3 = g.g(i12, -1);
                            g.p(iG3, iG3);
                        }
                        g.o();
                        return yVar3;
                    case 29:
                        if (g.g.f8060s.length() > 0 && (i13 = g.f6287c) != null) {
                            int iG4 = g.g(i13, 1);
                            g.p(iG4, iG4);
                        }
                        g.o();
                        return yVar3;
                    case 30:
                        if (g.g.f8060s.length() > 0 && (t0Var3 = g.f6292i) != null) {
                            int iH3 = g.h(t0Var3, -1);
                            g.p(iH3, iH3);
                        }
                        g.o();
                        return yVar3;
                    case 31:
                        if (g.g.f8060s.length() > 0 && (t0Var4 = g.f6292i) != null) {
                            int iH4 = g.h(t0Var4, 1);
                            g.p(iH4, iH4);
                        }
                        g.o();
                        return yVar3;
                    case 32:
                        g.f6289e.f6339a = null;
                        if (g.g.f8060s.length() > 0) {
                            g.p(0, 0);
                        }
                        g.o();
                        return yVar3;
                    case 33:
                        g.f6289e.f6339a = null;
                        C0515g c0515g6 = g.g;
                        if (c0515g6.f8060s.length() > 0) {
                            int length2 = c0515g6.f8060s.length();
                            g.p(length2, length2);
                        }
                        g.o();
                        return yVar3;
                    case 34:
                        O.T t13 = g.f6289e;
                        t13.f6339a = null;
                        C0515g c0515g7 = g.g;
                        String str5 = c0515g7.f8060s;
                        String str6 = c0515g7.f8060s;
                        if (str5.length() > 0) {
                            if (g.f()) {
                                t13.f6339a = null;
                                if (str6.length() > 0 && (numE3 = g.e()) != null) {
                                    int iIntValue5 = numE3.intValue();
                                    g.p(iIntValue5, iIntValue5);
                                }
                            } else {
                                t13.f6339a = null;
                                if (str6.length() > 0 && (numD3 = g.d()) != null) {
                                    int iIntValue6 = numD3.intValue();
                                    g.p(iIntValue6, iIntValue6);
                                }
                            }
                        }
                        g.o();
                        return yVar3;
                    case 35:
                        O.T t14 = g.f6289e;
                        t14.f6339a = null;
                        C0515g c0515g8 = g.g;
                        String str7 = c0515g8.f8060s;
                        String str8 = c0515g8.f8060s;
                        if (str7.length() > 0) {
                            if (g.f()) {
                                t14.f6339a = null;
                                if (str8.length() > 0 && (numD4 = g.d()) != null) {
                                    int iIntValue7 = numD4.intValue();
                                    g.p(iIntValue7, iIntValue7);
                                }
                            } else {
                                t14.f6339a = null;
                                if (str8.length() > 0 && (numE4 = g.e()) != null) {
                                    int iIntValue8 = numE4.intValue();
                                    g.p(iIntValue8, iIntValue8);
                                }
                            }
                        }
                        g.o();
                        return yVar3;
                    case 36:
                        g.j();
                        g.o();
                        return yVar3;
                    case 37:
                        g.k();
                        g.o();
                        return yVar3;
                    case 38:
                        g.n();
                        g.o();
                        return yVar3;
                    case 39:
                        g.m();
                        g.o();
                        return yVar3;
                    case 40:
                        g.f6289e.f6339a = null;
                        if (g.g.f8060s.length() > 0) {
                            if (g.f()) {
                                g.n();
                            } else {
                                g.m();
                            }
                        }
                        g.o();
                        return yVar3;
                    case 41:
                        g.f6289e.f6339a = null;
                        if (g.g.f8060s.length() > 0) {
                            if (g.f()) {
                                g.m();
                            } else {
                                g.n();
                            }
                        }
                        g.o();
                        return yVar3;
                    case 42:
                        g.f6289e.f6339a = null;
                        if (g.g.f8060s.length() > 0) {
                            long j15 = g.f6290f;
                            int i26 = U0.K.f8034c;
                            int i27 = (int) (j15 & 4294967295L);
                            g.p(i27, i27);
                        }
                        return yVar3;
                    case 43:
                        if (j0Var.f4656e) {
                            j0Var.f4652a.f4573w.e(new Z0.j(j0Var.f4661l));
                        } else {
                            j0Var.a(AbstractC0813f2.K(new C0710a("\n", 1)));
                        }
                        return yVar3;
                    case 44:
                        if (j0Var.f4656e) {
                            ((p251z9.r) obj4).f24882r = false;
                        } else {
                            j0Var.a(AbstractC0813f2.K(new C0710a("\t", 1)));
                        }
                        return yVar3;
                    case 45:
                        K.A0 a10 = j0Var.f4658h;
                        if (a10 != null) {
                            a10.a(Z0.y.a(g.f6291h, g.g, g.f6290f, 4));
                        }
                        K.A0 a11 = j0Var.f4658h;
                        if (a11 != null) {
                            M.k kVar2 = a11.f4434a;
                            if (kVar2 != null && (kVar = (M.k) kVar2.f5618s) != null) {
                                a11.f4434a = kVar;
                                a11.f4436c -= ((Z0.y) kVar2.f5619t).f10953a.f8060s.length();
                                a11.f4435b = new M.k(i25, a11.f4435b, (Z0.y) kVar2.f5619t);
                                yVar = (Z0.y) kVar.f5619t;
                            }
                            if (yVar != null) {
                                j0Var.f4660k.e(yVar);
                            }
                        }
                        return yVar3;
                    case 46:
                        K.A0 a12 = j0Var.f4658h;
                        if (a12 != null) {
                            M.k kVar3 = a12.f4435b;
                            if (kVar3 != null) {
                                a12.f4435b = (M.k) kVar3.f5618s;
                                Z0.y yVar6 = (Z0.y) kVar3.f5619t;
                                a12.f4434a = new M.k(i25, a12.f4434a, yVar6);
                                a12.f4436c = yVar6.f10953a.f8060s.length() + a12.f4436c;
                                yVar2 = (Z0.y) kVar3.f5619t;
                            }
                            if (yVar2 != null) {
                                j0Var.f4660k.e(yVar2);
                            }
                        }
                        return yVar3;
                    default:
                        return yVar3;
                }
            case 10:
                D0.v vVar = (D0.v) obj;
                O8.c cVar6 = (O8.c) obj3;
                long j16 = vVar.f1134c;
                J1.c cVar7 = (J1.c) obj2;
                O.N n10 = (O.N) cVar6.f6511r;
                if (n10.i() && n10.k().f10953a.f8060s.length() != 0 && (w9 = n10.f6311d) != null && w9.d() != null) {
                    cVar6.F(n10.k(), j16, false, cVar7);
                    i18 = 1;
                }
                if (i18 != 0) {
                    vVar.a();
                    ((p251z9.r) obj4).f24882r = true;
                }
                return yVar3;
            case 11:
                p242z.e eVar2 = (p242z.e) obj;
                O.N n11 = (O.N) obj4;
                int i28 = ((K.c0) ((Z.L0) obj3).getValue()).f4617a;
                p242z.j jVar = (p242z.j) obj2;
                K.e0 e0Var = K.e0.Cut;
                int i29 = 6;
                if ((i28 & 4) == 4) {
                    p242z.e.b(eVar2, new R0(i29, e0Var), new O.Q(jVar, n11, i18));
                }
                K.e0 e0Var2 = K.e0.Copy;
                if ((i28 & 1) == 1) {
                    p242z.e.b(eVar2, new R0(i29, e0Var2), new O.Q(jVar, n11, i19));
                }
                K.e0 e0Var3 = K.e0.Paste;
                if ((i28 & 2) == 2) {
                    p242z.e.b(eVar2, new R0(i29, e0Var3), new O.Q(jVar, n11, i17));
                }
                K.e0 e0Var4 = K.e0.SelectAll;
                if ((i28 & 8) == 8) {
                    p242z.e.b(eVar2, new R0(i29, e0Var4), new O.Q(jVar, n11, i16));
                }
                if (Build.VERSION.SDK_INT >= 26) {
                    K.e0 e0Var5 = K.e0.Autofill;
                    if (n11.h() && U0.K.b(n11.k().f10954b)) {
                        p242z.e.b(eVar2, new R0(i29, e0Var5), new O.Q(jVar, n11, i15));
                    }
                }
                return yVar3;
            case 12:
                return new H1((I1) obj, (p063g1.c) obj3, (p241y9.c) obj2, (p241y9.c) obj4);
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_LIST /* 13 */:
                O2.a aVar = new O2.a(i19, (p241y9.c) obj2);
                InterfaceC0771u interfaceC0771u = (InterfaceC0771u) obj3;
                interfaceC0771u.h().a(aVar);
                return new C0629a((p241y9.a) obj4, interfaceC0771u, aVar, i18);
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_LINKING_OBJECTS /* 14 */:
                H0.T t15 = (H0.T) obj;
                X.v vVar2 = (X.v) obj2;
                float fD = ((H0.K) obj3).t() ? vVar2.f9788F.d().d(vVar2.f9788F.f9781h.getValue()) : vVar2.f9788F.f();
                EnumC0047u0 enumC0047u0 = vVar2.f9790H;
                t15.d((H0.U) obj4, B9.a.V(enumC0047u0 == EnumC0047u0.f425s ? fD : 0.0f), B9.a.V(enumC0047u0 == EnumC0047u0.f424r ? fD : 0.0f), 0.0f);
                return yVar3;
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_OBJECTID /* 15 */:
                p032d.d dVar3 = (p032d.d) obj4;
                ((p020c.D) obj3).a((InterfaceC0771u) obj2, dVar3);
                return new C0191z(5, dVar3);
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_TYPED_LINK /* 16 */:
                p085i0.j jVar2 = (p085i0.j) obj4;
                p085i0.g gVar = (p085i0.g) obj3;
                u.E e11 = gVar.f16722b;
                if (!e11.b(obj2)) {
                    gVar.f16721a.remove(obj2);
                    e11.l(obj2, jVar2);
                    return new C0629a(gVar, obj2, jVar2, i19);
                }
                throw new IllegalArgumentException(("Key " + obj2 + " was used multiple times ").toString());
            case 17:
                ViewFactoryHolder viewFactoryHolder = (ViewFactoryHolder) obj3;
                J0.I i30 = (J0.I) obj2;
                ViewFactoryHolder viewFactoryHolder2 = (ViewFactoryHolder) obj4;
                p180s0.o oVarP2 = ((p196u0.d) obj).y().p();
                if (viewFactoryHolder.getView().getVisibility() != 8) {
                    viewFactoryHolder.f12111O = true;
                    J0.r0 r0Var = i30.f3901E;
                    AndroidComposeView androidComposeView = r0Var instanceof AndroidComposeView ? (AndroidComposeView) r0Var : null;
                    if (androidComposeView != null) {
                        Canvas canvasA = AbstractC1295d.a(oVarP2);
                        androidComposeView.getAndroidViewsHandler$ui_release().getClass();
                        viewFactoryHolder2.draw(canvasA);
                    }
                    viewFactoryHolder.f12111O = false;
                }
                return yVar3;
            case 18:
                J0.C0 c12 = (J0.C0) obj;
                p141o0.d dVar4 = (p141o0.d) c12;
                if (!((p141o0.a) AbstractC0283f.y((p141o0.d) obj2).getDragAndDropManager()).f20208b.contains(dVar4) || !B0.c.b(dVar4, B9.a.E((Z0.B) obj4))) {
                    return J0.B0.f3878r;
                }
                ((p251z9.v) obj3).f24886r = c12;
                return J0.B0.f3880t;
            case ObjectServerFacade.SYNC_CONFIG_OPTIONS /* 19 */:
                p162q0.t tVar = (p162q0.t) obj;
                if (!p251z9.j.a(tVar, (p162q0.t) obj3)) {
                    if (p251z9.j.a(tVar, ((p162q0.k) obj2).f21205f)) {
                        throw new IllegalStateException("Focus search landed at the root.");
                    }
                    zBooleanValue = ((Boolean) ((p251z9.k) obj4).e(tVar)).booleanValue();
                }
                return Boolean.valueOf(zBooleanValue);
            case 20:
                return p074h0.i.e((p074h0.i) obj3, (C1363a) obj, (C1374l) obj2, (C1374l) obj4);
            case 21:
                return new C0629a((p093j0.r) obj3, obj2, (C1401n) obj4, i16);
            case 22:
                p180s0.G g10 = (p180s0.G) obj;
                Z.L0 l10 = (Z.L0) obj2;
                Z.L0 l11 = (Z.L0) obj3;
                g10.a(l11 != null ? ((Number) l11.getValue()).floatValue() : 1.0f);
                g10.e(l10 != null ? ((Number) l10.getValue()).floatValue() : 1.0f);
                g10.f(l10 != null ? ((Number) l10.getValue()).floatValue() : 1.0f);
                Z.L0 l12 = (Z.L0) obj4;
                g10.l(l12 != null ? ((p180s0.M) l12.getValue()).f21816a : p180s0.M.f21814b);
                return yVar3;
            default:
                p214w.H h10 = (p214w.H) obj4;
                int iOrdinal = ((p214w.x) obj).ordinal();
                if (iOrdinal == 0) {
                    p214w.T t16 = h10.f23443a;
                } else if (iOrdinal == 1) {
                    m10 = (p180s0.M) obj3;
                } else {
                    if (iOrdinal != 2) {
                        throw new A6.a();
                    }
                    p214w.T t17 = h10.f23443a;
                }
                return new p180s0.M(m10 != null ? m10.f21816a : p180s0.M.f21814b);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0023i(p162q0.t tVar, p162q0.k kVar, p241y9.c cVar) {
        super(1);
        this.f255r = 19;
        this.f256s = tVar;
        this.f257t = kVar;
        this.f258u = (p251z9.k) cVar;
    }
}
