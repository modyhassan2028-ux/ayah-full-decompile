package A;

import G.C0191z;
import H0.C0214m;
import H0.InterfaceC0219s;
import J0.InterfaceC0273a;
import K0.AbstractC0372u0;
import K0.C0366r0;
import K0.C0374v0;
import K0.C0380y0;
import K9.AbstractC0405x;
import K9.C0389g;
import O.InterfaceC0444l;
import W.C0544c0;
import W.C0556f0;
import Z.C0673b0;
import Z.C0704u;
import Z0.C0710a;
import Z0.C0713d;
import Z0.C0714e;
import Z0.C0715f;
import Z0.InterfaceC0716g;
import android.content.Context;
import android.os.CancellationSignal;
import io.realm.RealmFieldTypeConstants;
import io.realm.internal.ObjectServerFacade;
import java.io.File;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public final class M0 extends p251z9.k implements p241y9.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f97r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f98s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ M0(int i10, Object obj) {
        super(1);
        this.f97r = i10;
        this.f98s = obj;
    }

    /* JADX WARN: Type inference failed for: r1v14, types: [H0.U, J0.a] */
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
    public final Object e(Object obj) {
        p171r0.e eVarW0;
        F.r rVar;
        String strConcat;
        float f3 = 0.0f;
        F.r rVar2 = null;
        int i10 = 0;
        switch (this.f97r) {
            case 0:
                C0031m c0031m = ((S0) this.f98s).f137W;
                c0031m.f319J = (InterfaceC0219s) obj;
                if (c0031m.f321L && (eVarW0 = c0031m.w0()) != null && !c0031m.x0(eVarW0, c0031m.f322M)) {
                    c0031m.f320K = true;
                    c0031m.y0();
                }
                c0031m.f321L = false;
                return p110k9.y.f19095a;
            case 1:
                long j = ((p171r0.c) obj).f21387a;
                b1 b1Var = (b1) this.f98s;
                return new p171r0.c(b1.a(b1Var, b1Var.j, j, b1Var.f200i));
            case 2:
                p251z9.j.e((Context) obj, "it");
                return new B2.b((Context) this.f98s, 0);
            case 3:
                Throwable th = (Throwable) obj;
                D0.N n6 = (D0.N) this.f98s;
                C0389g c0389g = n6.f1070t;
                if (c0389g != null) {
                    c0389g.h(th);
                }
                n6.f1070t = null;
                return p110k9.y.f19095a;
            case 4:
                int iIntValue = ((Number) obj).intValue();
                F.m mVar = (F.m) this.f98s;
                return mVar.a(mVar.f2067c, iIntValue);
            case 5:
                float fFloatValue = ((Number) obj).floatValue();
                F.A a9 = (F.A) this.f98s;
                float f7 = -fFloatValue;
                if ((f7 >= 0.0f || a9.d()) && (f7 <= 0.0f || a9.b())) {
                    if (Math.abs(a9.g) > 0.5f) {
                        C.a.c("entered drag with non-zero pending scroll");
                    }
                    float f10 = a9.g + f7;
                    a9.g = f10;
                    if (Math.abs(f10) > 0.5f) {
                        float f11 = a9.g;
                        int iRound = Math.round(f11);
                        F.r rVarF = ((F.r) a9.f2013e.getValue()).f(iRound, !a9.f2010b);
                        if (rVarF == null || (rVar = a9.f2011c) == null) {
                            rVar2 = rVarF;
                        } else {
                            F.r rVarF2 = rVar.f(iRound, true);
                            if (rVarF2 != null) {
                                a9.f2011c = rVarF2;
                                rVar2 = rVarF;
                            }
                        }
                        if (rVar2 != null) {
                            a9.f(rVar2, a9.f2010b, true);
                            a9.f2027u.setValue(p110k9.y.f19095a);
                            a9.h(f11 - a9.g, rVar2);
                        } else {
                            J0.I i11 = a9.j;
                            if (i11 != null) {
                                i11.l();
                            }
                            a9.h(f11 - a9.g, a9.g());
                        }
                    }
                    if (Math.abs(a9.g) > 0.5f) {
                        f7 -= a9.g;
                        a9.g = 0.0f;
                    }
                    f3 = f7;
                }
                return Float.valueOf(-f3);
            case 6:
                return new C0191z(false ? 1 : 0, (G.A) this.f98s);
            case 7:
                return new C0191z(2, (G.H) this.f98s);
            case 8:
                p085i0.j jVar = (p085i0.j) this.f98s;
                return Boolean.valueOf(jVar != null ? jVar.b(obj) : true);
            case 9:
                Ga.z zVar = (Ga.z) obj;
                p251z9.j.e(zVar, "it");
                return Boolean.valueOf(zVar.a() != ((Ga.z) this.f98s).a());
            case 10:
                InterfaceC0273a interfaceC0273a = (InterfaceC0273a) obj;
                J0.J j10 = (J0.J) this.f98s;
                if (interfaceC0273a.s()) {
                    if (interfaceC0273a.c().f3935b) {
                        interfaceC0273a.r();
                    }
                    for (Map.Entry entry : interfaceC0273a.c().f3941i.entrySet()) {
                        J0.J.a(j10, (C0214m) entry.getKey(), ((Number) entry.getValue()).intValue(), interfaceC0273a.o());
                    }
                    J0.j0 j0Var = interfaceC0273a.o().f4127E;
                    p251z9.j.b(j0Var);
                    while (!j0Var.equals(j10.f3934a.o())) {
                        for (C0214m c0214m : j10.b(j0Var).keySet()) {
                            J0.J.a(j10, c0214m, j10.c(j0Var, c0214m), j0Var);
                        }
                        j0Var = j0Var.f4127E;
                        p251z9.j.b(j0Var);
                    }
                }
                return p110k9.y.f19095a;
            case 11:
                ((p011b0.e) this.f98s).b((l0.p) obj);
                return Boolean.TRUE;
            case 12:
                ((R0.j) obj).e(O.y.f6432c, new O.x(K.K.f4480r, ((InterfaceC0444l) this.f98s).a(), O.w.f6423s, true));
                return p110k9.y.f19095a;
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_LIST /* 13 */:
                float[] fArr = ((p180s0.A) obj).f21769a;
                InterfaceC0219s interfaceC0219s = (InterfaceC0219s) this.f98s;
                if (interfaceC0219s.C()) {
                    H0.a0.d(interfaceC0219s).m(interfaceC0219s, fArr);
                }
                return p110k9.y.f19095a;
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_LINKING_OBJECTS /* 14 */:
                float fFloatValue2 = ((Number) obj).floatValue();
                K.r0 r0Var = (K.r0) this.f98s;
                C0673b0 c0673b0 = r0Var.f4766a;
                float fG = c0673b0.g() + fFloatValue2;
                C0673b0 c0673b1 = r0Var.f4767b;
                if (fG > c0673b1.g()) {
                    fFloatValue2 = c0673b1.g() - c0673b0.g();
                } else if (fG < 0.0f) {
                    fFloatValue2 = -c0673b0.g();
                }
                c0673b0.h(c0673b0.g() + fFloatValue2);
                return Float.valueOf(fFloatValue2);
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_OBJECTID /* 15 */:
                return new C0191z(4, (C0366r0) this.f98s);
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_TYPED_LINK /* 16 */:
                p110k9.y yVar = p110k9.y.f19095a;
                if (AbstractC0372u0.f5174b.compareAndSet(false, true)) {
                    ((M9.e) this.f98s).k(yVar);
                }
                return yVar;
            case 17:
                p196u0.d dVar = (p196u0.d) obj;
                C0374v0 c0374v0 = (C0374v0) this.f98s;
                p180s0.o oVarP = dVar.y().p();
                p241y9.e eVar = c0374v0.f5192u;
                if (eVar != null) {
                    eVar.invoke(oVarP, (p205v0.b) dVar.y().f16423t);
                }
                return p110k9.y.f19095a;
            case 18:
                Z0.n nVar = (Z0.n) obj;
                M.q qVar = nVar.f10938b;
                if (qVar != null) {
                    nVar.a(qVar);
                    nVar.f10938b = null;
                }
                C0380y0 c0380y0 = (C0380y0) this.f98s;
                p011b0.e eVar2 = c0380y0.f5208d;
                Object[] objArr = eVar2.f13125r;
                int i12 = eVar2.f13127t;
                while (true) {
                    if (i10 >= i12) {
                        i10 = -1;
                    } else if (!p251z9.j.a((J0.E0) objArr[i10], nVar)) {
                        i10++;
                    }
                }
                if (i10 >= 0) {
                    eVar2.l(i10);
                }
                if (eVar2.f13127t == 0) {
                    c0380y0.f5206b.invoke();
                }
                return p110k9.y.f19095a;
            case ObjectServerFacade.SYNC_CONFIG_OPTIONS /* 19 */:
                ((M.q) this.f98s).a((InterfaceC0716g) obj);
                return p110k9.y.f19095a;
            case 20:
                if (((Throwable) obj) != null) {
                    ((CancellationSignal) this.f98s).cancel();
                }
                return p110k9.y.f19095a;
            case 21:
                R0.u.e((R0.j) obj, ((R0.g) this.f98s).f7079a);
                return p110k9.y.f19095a;
            case 22:
                ((List) obj).add((Float) ((G.T) this.f98s).invoke());
                return true;
            case 23:
                Throwable th2 = (Throwable) obj;
                T1.B b5 = (T1.B) this.f98s;
                p110k9.o oVar = b5.j;
                if (th2 != null) {
                    b5.f7567h.E(new T1.L(th2));
                }
                if (oVar.a()) {
                    ((T1.I) oVar.getValue()).close();
                }
                return p110k9.y.f19095a;
            case 24:
                File file = (File) obj;
                p251z9.j.e(file, "it");
                return new T1.U(((P9.d) this.f98s).f6772r, file);
            case 25:
                long j11 = ((p171r0.c) obj).f21387a;
                C0556f0 c0556f0 = (C0556f0) this.f98s;
                AbstractC0405x.x(c0556f0.h0(), null, new C0544c0(c0556f0, j11, null, 1), 3);
                return p110k9.y.f19095a;
            case 26:
                Y0.s sVar = (Y0.s) obj;
                return ((Y0.f) this.f98s).a(new Y0.s(null, sVar.f10368b, sVar.f10369c, sVar.f10370d, sVar.f10371e)).f10372r;
            case 27:
                Throwable th3 = (Throwable) obj;
                CancellationException cancellationException = new CancellationException("Recomposer effect job completed");
                cancellationException.initCause(th3);
                Z.s0 s0Var = (Z.s0) this.f98s;
                synchronized (s0Var.f10789b) {
                    try {
                        K9.a0 a0Var = s0Var.f10790c;
                        if (a0Var != null) {
                            N9.k0 k0Var = s0Var.f10805t;
                            Z.p0 p0Var = Z.p0.f10759s;
                            k0Var.getClass();
                            k0Var.n(null, p0Var);
                            N9.k0 k0Var2 = Z.s0.f10786x;
                            a0Var.e(cancellationException);
                            s0Var.f10802q = null;
                            a0Var.s(new X.L(5, s0Var, th3));
                        } else {
                            s0Var.f10791d = cancellationException;
                            N9.k0 k0Var3 = s0Var.f10805t;
                            Z.p0 p0Var2 = Z.p0.f10758r;
                            k0Var3.getClass();
                            k0Var3.n(null, p0Var2);
                        }
                    } catch (Throwable th4) {
                        throw th4;
                    }
                }
                return p110k9.y.f19095a;
            case 28:
                ((C0704u) this.f98s).x(obj);
                return p110k9.y.f19095a;
            default:
                InterfaceC0716g interfaceC0716g = (InterfaceC0716g) obj;
                StringBuilder sbC = android.support.v4.media.session.p.C(((InterfaceC0716g) this.f98s) == interfaceC0716g ? " > " : "   ");
                if (interfaceC0716g instanceof C0710a) {
                    StringBuilder sb = new StringBuilder("CommitTextCommand(text.length=");
                    C0710a c0710a = (C0710a) interfaceC0716g;
                    sb.append(c0710a.f10894a.f8060s.length());
                    sb.append(", newCursorPosition=");
                    strConcat = android.support.v4.media.session.p.A(sb, c0710a.f10895b, ')');
                } else if (interfaceC0716g instanceof Z0.w) {
                    StringBuilder sb2 = new StringBuilder("SetComposingTextCommand(text.length=");
                    Z0.w wVar = (Z0.w) interfaceC0716g;
                    sb2.append(wVar.f10949a.f8060s.length());
                    sb2.append(", newCursorPosition=");
                    strConcat = android.support.v4.media.session.p.A(sb2, wVar.f10950b, ')');
                } else if ((interfaceC0716g instanceof Z0.v) || (interfaceC0716g instanceof C0714e) || (interfaceC0716g instanceof C0715f) || (interfaceC0716g instanceof Z0.x)) {
                    strConcat = interfaceC0716g.toString();
                } else if (interfaceC0716g instanceof Z0.i) {
                    strConcat = "FinishComposingTextCommand()";
                } else if (interfaceC0716g instanceof C0713d) {
                    strConcat = "DeleteAllCommand()";
                } else {
                    String strC = p251z9.w.a(interfaceC0716g.getClass()).c();
                    if (strC == null) {
                        strC = "{anonymous EditCommand}";
                    }
                    strConcat = "Unknown EditCommand: ".concat(strC);
                }
                sbC.append(strConcat);
                return sbC.toString();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M0(InterfaceC0716g interfaceC0716g, L5.c cVar) {
        super(1);
        this.f97r = 29;
        this.f98s = interfaceC0716g;
    }
}
