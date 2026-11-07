package D0;

import G.Y;
import H0.S;
import J0.AbstractC0283f;
import J0.AbstractC0291n;
import J0.C0280d0;
import J0.C0297u;
import J0.P;
import J0.Q;
import J0.V;
import J0.j0;
import J0.v0;
import J0.y0;
import J0.z0;
import K.W;
import K.d0;
import K.t0;
import K.w0;
import K0.C0335b0;
import K0.U0;
import K0.W0;
import K9.AbstractC0405x;
import U0.AbstractC0522n;
import U0.C0513e;
import U0.C0515g;
import U0.C0521m;
import Z.C0704u;
import Z.X;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.accessibility.AccessibilityManager;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.viewinterop.ViewFactoryHolder;
import com.google.android.gms.internal.measurement.AbstractC0813f2;
import io.realm.RealmFieldTypeConstants;
import io.realm.internal.ObjectServerFacade;
import p232y.C1455i;
import p232y.C1471z;

/* JADX INFO: renamed from: D0.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0086d extends p251z9.k implements p241y9.a {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f1090r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f1091s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f1092t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0086d(int i10, Object obj, Object obj2) {
        super(0);
        this.f1090r = i10;
        this.f1091s = obj;
        this.f1092t = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0096 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:27:0x0098 A[LOOP:0: B:17:0x0065->B:27:0x0098, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:293:0x009b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:99:0x0216  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v56, types: [y9.a, z9.k] */
    /* JADX WARN: Type inference failed for: r0v59, types: [y9.a, z9.k] */
    /* JADX WARN: Type inference failed for: r0v7, types: [Z.f0] */
    /* JADX WARN: Type inference failed for: r0v8, types: [Z.f0] */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16, types: [l0.q] */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19, types: [l0.q] */
    /* JADX WARN: Type inference failed for: r2v2, types: [Z.f0] */
    /* JADX WARN: Type inference failed for: r2v20, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v74 */
    /* JADX WARN: Type inference failed for: r2v75 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15, types: [b0.e] */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18, types: [b0.e] */
    /* JADX WARN: Type inference failed for: r3v45 */
    /* JADX WARN: Type inference failed for: r3v46 */
    /* JADX WARN: Type inference failed for: r3v47 */
    /* JADX WARN: Type inference failed for: r3v48 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, o9.c, o9.h] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v42, types: [y9.a, z9.k] */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r6v28, types: [y9.a, z9.k] */
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
    @Override // p241y9.a
    public final Object invoke() {
        ?? r10;
        C0515g c0515g;
        R0.p pVar;
        J0.I i10;
        long jFloatToRawIntBits;
        long j;
        t0 t0VarD;
        W w9;
        C0515g c0515g2;
        p171r0.e eVar;
        X.C c10;
        int i11 = this.f1090r;
        int i12 = 1;
        int i13 = 0;
        p110k9.y yVar = p110k9.y.f19095a;
        Object obj = this.f1092t;
        Object obj2 = this.f1091s;
        switch (i11) {
            case 0:
                ((C0087e) obj2).g((l0.q) obj);
                return yVar;
            case 1:
                return new Y((p085i0.j) obj2, p120l9.s.f19441r, (p085i0.c) obj);
            case 2:
                Ga.A a9 = ((Ga.k) obj2).f3045a;
                Ga.z zVarD = a9.d();
                ?? r11 = a9.j;
                p150o9.c cVar = null;
                p063g1.j jVar = zVarD != null ? new p063g1.j(zVarD.b()) : null;
                Ga.z zVarD2 = a9.d();
                if ((zVarD2 != null ? Integer.valueOf(zVarD2.a()) : null) != null) {
                    a9.f2968r.setValue(r11.getValue());
                    r10 = 0;
                    AbstractC0405x.x(a9.f2954b, null, new L(a9, a9.e(), cVar, 1), 3);
                } else {
                    r10 = 0;
                }
                a9.f2962l.setValue(new p171r0.c(0L));
                r11.setValue(r10);
                a9.f2963m.setValue(new p063g1.j(jVar != null ? jVar.f16254a : 0L));
                Ga.J j10 = a9.f2958f;
                AbstractC0405x.x(j10.f2998b, r10, new Ga.H(j10, r10, i12), 3);
                a9.f2964n.setValue(r10);
                a9.f2965o.setValue(r10);
                ((p241y9.a) obj).invoke();
                return yVar;
            case 3:
                return Boolean.valueOf(p251z9.j.a(obj2, ((Ga.A) obj).j.getValue()));
            case 4:
                return Float.valueOf(((Number) ((p241y9.a) ((X) obj2).getValue()).invoke()).floatValue() / (((Number) ((X) obj).getValue()).floatValue() / 1000.0f));
            case 5:
                C0280d0 c0280d0 = ((J0.I) obj2).f3914W;
                p251z9.v vVar = (p251z9.v) obj;
                if ((((l0.q) c0280d0.f4067f).f19342u & 8) != 0) {
                    for (l0.q qVar = (z0) c0280d0.f4066e; qVar != null; qVar = qVar.f19343v) {
                        if ((qVar.f19341t & 8) != 0) {
                            ?? F10 = qVar;
                            ?? eVar2 = 0;
                            while (F10 != 0) {
                                if (F10 instanceof y0) {
                                    y0 y0Var = (y0) F10;
                                    if (y0Var.S()) {
                                        R0.j jVar2 = new R0.j();
                                        vVar.f24886r = jVar2;
                                        jVar2.f7111u = true;
                                    }
                                    if (y0Var.V()) {
                                        ((R0.j) vVar.f24886r).f7110t = true;
                                    }
                                    y0Var.L((R0.j) vVar.f24886r);
                                } else if ((F10.f19341t & 8) != 0 && (F10 instanceof AbstractC0291n)) {
                                    l0.q qVar2 = ((AbstractC0291n) F10).f4151G;
                                    int i14 = 0;
                                    while (qVar2 != null) {
                                        if ((qVar2.f19341t & 8) != 0) {
                                            i14++;
                                            if (i14 == 1) {
                                                F10 = F10;
                                                eVar2 = eVar2;
                                                eVar2 = eVar2;
                                                F10 = qVar2;
                                            } else {
                                                if (eVar2 == 0) {
                                                    eVar2 = new p011b0.e(new l0.q[16]);
                                                }
                                                if (F10 != 0) {
                                                    eVar2.b(F10);
                                                    F10 = 0;
                                                }
                                                eVar2.b(qVar2);
                                            }
                                        } else {
                                            F10 = F10;
                                            eVar2 = eVar2;
                                        }
                                        qVar2 = qVar2.f19344w;
                                        F10 = F10;
                                        eVar2 = eVar2;
                                    }
                                    if (i14 == 1) {
                                        F10 = F10;
                                        eVar2 = eVar2;
                                    } else {
                                        F10 = F10;
                                        eVar2 = eVar2;
                                    }
                                }
                                F10 = AbstractC0283f.f(eVar2);
                            }
                        }
                    }
                }
                return yVar;
            case 6:
                p241y9.c cVarE = ((v0) obj2).f4180r.e();
                if (cVarE != null) {
                    cVarE.e(new J0.O((P) obj));
                }
                return yVar;
            case 7:
                V v10 = (V) obj2;
                J0.M m10 = v10.f4004w;
                m10.f3951h = 0;
                p011b0.e eVarZ = m10.f3945a.z();
                Object[] objArr = eVarZ.f13125r;
                int i15 = eVarZ.f13127t;
                for (int i16 = 0; i16 < i15; i16++) {
                    V v11 = ((J0.I) objArr[i16]).f3915X.f3959q;
                    p251z9.j.b(v11);
                    v11.f4006y = v11.f4007z;
                    v11.f4007z = Integer.MAX_VALUE;
                    if (v11.f3988A == J0.G.f3890s) {
                        v11.f3988A = J0.G.f3891t;
                    }
                }
                J0.I i17 = m10.f3945a;
                J0.I i18 = m10.f3945a;
                p011b0.e eVarZ2 = i17.z();
                Object[] objArr2 = eVarZ2.f13125r;
                int i19 = eVarZ2.f13127t;
                for (int i20 = 0; i20 < i19; i20++) {
                    V v12 = ((J0.I) objArr2[i20]).f3915X.f3959q;
                    p251z9.j.b(v12);
                    v12.f3997J.f3937d = false;
                }
                C0297u c0297u = v10.o().f4179e0;
                if (c0297u != null) {
                    boolean z10 = c0297u.f3970y;
                    p011b0.b bVar = (p011b0.b) i18.o();
                    int i21 = bVar.f13119r.f13127t;
                    for (int i22 = 0; i22 < i21; i22++) {
                        Q qC0 = ((j0) ((J0.I) bVar.get(i22)).f3914W.f4065d).C0();
                        if (qC0 != null) {
                            qC0.f3970y = z10;
                        }
                    }
                }
                ((Q) obj).n0().d();
                if (v10.o().f4179e0 != null) {
                    p011b0.b bVar2 = (p011b0.b) i18.o();
                    int i23 = bVar2.f13119r.f13127t;
                    for (int i24 = 0; i24 < i23; i24++) {
                        Q qC1 = ((j0) ((J0.I) bVar2.get(i24)).f3914W.f4065d).C0();
                        if (qC1 != null) {
                            qC1.f3970y = false;
                        }
                    }
                }
                p011b0.e eVarZ3 = i18.z();
                Object[] objArr3 = eVarZ3.f13125r;
                int i25 = eVarZ3.f13127t;
                for (int i26 = 0; i26 < i25; i26++) {
                    V v13 = ((J0.I) objArr3[i26]).f3915X.f3959q;
                    p251z9.j.b(v13);
                    int i27 = v13.f4006y;
                    int i28 = v13.f4007z;
                    if (i27 != i28 && i28 == Integer.MAX_VALUE) {
                        v13.h0(true);
                    }
                }
                p011b0.e eVarZ4 = i18.z();
                Object[] objArr4 = eVarZ4.f13125r;
                int i29 = eVarZ4.f13127t;
                while (i13 < i29) {
                    V v14 = ((J0.I) objArr4[i13]).f3915X.f3959q;
                    p251z9.j.b(v14);
                    J0.J j11 = v14.f3997J;
                    j11.f3938e = j11.f3937d;
                    i13++;
                }
                return yVar;
            case 8:
                Z0.y yVar2 = (Z0.y) obj2;
                X x9 = (X) obj;
                if (!U0.K.a(yVar2.f10954b, ((Z0.y) x9.getValue()).f10954b) || !p251z9.j.a(yVar2.f10955c, ((Z0.y) x9.getValue()).f10955c)) {
                    x9.setValue(yVar2);
                }
                return yVar;
            case 9:
                w0 w0Var = (w0) obj2;
                if (w0Var != null) {
                    p093j0.r rVar = w0Var.f4814c;
                    if (rVar.isEmpty()) {
                        c0515g = w0Var.f4813b;
                    } else {
                        d0 d0Var = new d0(w0Var.f4813b);
                        int size = rVar.size();
                        while (i13 < size) {
                            ((p241y9.c) rVar.get(i13)).e(d0Var);
                            i13++;
                        }
                        c0515g = d0Var.f4621b;
                    }
                    w0Var.f4813b = c0515g;
                    if (c0515g != null) {
                        return c0515g;
                    }
                }
                return (C0515g) obj;
            case 10:
                AbstractC0522n abstractC0522n = (AbstractC0522n) ((C0513e) obj2).f8054a;
                C0335b0 c0335b0 = (C0335b0) obj;
                if (abstractC0522n instanceof C0521m) {
                    try {
                        String str = ((C0521m) abstractC0522n).f8099a;
                        c0335b0.getClass();
                        try {
                            c0335b0.f5064a.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
                        } catch (ActivityNotFoundException e10) {
                            throw new IllegalArgumentException(p245z2.a.A('.', "Can't open ", str), e10);
                        }
                        break;
                    } catch (IllegalArgumentException unused) {
                    }
                }
                return yVar;
            case 11:
                return Boolean.valueOf(super/*android.view.ViewGroup*/.dispatchKeyEvent((KeyEvent) obj));
            case 12:
                return Boolean.valueOf(super/*android.view.ViewGroup*/.dispatchGenericMotionEvent((MotionEvent) obj));
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_LIST /* 13 */:
                AndroidComposeView androidComposeView = (AndroidComposeView) obj2;
                ViewFactoryHolder viewFactoryHolder = (ViewFactoryHolder) obj;
                androidComposeView.getAndroidViewsHandler$ui_release().removeViewInLayout(viewFactoryHolder);
                androidComposeView.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().remove(androidComposeView.getAndroidViewsHandler$ui_release().getHolderToLayoutNode().remove(viewFactoryHolder));
                viewFactoryHolder.setImportantForAccessibility(0);
                return yVar;
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_LINKING_OBJECTS /* 14 */:
                K0.E e11 = (K0.E) obj;
                U0 u8 = (U0) obj2;
                R0.h hVar = u8.f5020v;
                R0.h hVar2 = u8.f5021w;
                Float f3 = u8.f5018t;
                Float f7 = u8.f5019u;
                float fFloatValue = (hVar == null || f3 == null) ? 0.0f : ((Number) hVar.f7080a.invoke()).floatValue() - f3.floatValue();
                float fFloatValue2 = (hVar2 == null || f7 == null) ? 0.0f : ((Number) hVar2.f7080a.invoke()).floatValue() - f7.floatValue();
                if (fFloatValue != 0.0f || fFloatValue2 != 0.0f) {
                    int iZ = e11.z(u8.f5016r);
                    W0 w10 = (W0) e11.s().b(e11.f4910n);
                    if (w10 != null) {
                        try {
                            J1.g gVar = e11.f4912p;
                            if (gVar != null) {
                                gVar.l(e11.k(w10));
                            }
                            break;
                        } catch (IllegalStateException unused2) {
                        }
                    }
                    W0 w11 = (W0) e11.s().b(e11.f4911o);
                    if (w11 != null) {
                        try {
                            J1.g gVar2 = e11.f4913q;
                            if (gVar2 != null) {
                                gVar2.l(e11.k(w11));
                            }
                            break;
                        } catch (IllegalStateException unused3) {
                        }
                    }
                    e11.f4902d.invalidate();
                    W0 w12 = (W0) e11.s().b(iZ);
                    if (w12 != null && (pVar = w12.f5032a) != null && (i10 = pVar.f7118c) != null) {
                        if (hVar != null) {
                            e11.f4915s.h(iZ, hVar);
                        }
                        if (hVar2 != null) {
                            e11.f4916t.h(iZ, hVar2);
                        }
                        e11.v(i10);
                    }
                }
                if (hVar != null) {
                    u8.f5018t = (Float) hVar.f7080a.invoke();
                }
                if (hVar2 != null) {
                    u8.f5019u = (Float) hVar2.f7080a.invoke();
                }
                return yVar;
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_OBJECTID /* 15 */:
                O.N n6 = (O.N) obj2;
                long j12 = ((p063g1.l) ((X) obj).getValue()).f16260a;
                p171r0.c cVarG = n6.g();
                if (cVarG != null) {
                    long j13 = cVarG.f21387a;
                    W w13 = n6.f6311d;
                    C0515g c0515g3 = w13 != null ? w13.f4553a.f4632a : null;
                    if (c0515g3 == null || c0515g3.f8060s.length() == 0) {
                        jFloatToRawIntBits = 9205357640488583168L;
                    } else {
                        K.K k7 = (K.K) n6.f6323r.getValue();
                        int i30 = k7 == null ? -1 : O.P.f6332a[k7.ordinal()];
                        if (i30 == -1) {
                            jFloatToRawIntBits = 9205357640488583168L;
                        } else {
                            if (i30 == 1 || i30 == 2) {
                                long j14 = n6.k().f10954b;
                                int i31 = U0.K.f8034c;
                                j = j14 >> 32;
                            } else {
                                if (i30 != 3) {
                                    throw new A6.a();
                                }
                                long j15 = n6.k().f10954b;
                                int i32 = U0.K.f8034c;
                                j = j15 & 4294967295L;
                            }
                            int i33 = (int) j;
                            W w14 = n6.f6311d;
                            if (w14 == null || (t0VarD = w14.d()) == null || (w9 = n6.f6311d) == null || (c0515g2 = w9.f4553a.f4632a) == null) {
                                jFloatToRawIntBits = 9205357640488583168L;
                            } else {
                                int iL = B0.c.l(n6.f6309b.b(i33), 0, c0515g2.f8060s.length());
                                float fIntBitsToFloat = Float.intBitsToFloat((int) (t0VarD.d(j13) >> 32));
                                U0.I i34 = t0VarD.f4794a;
                                U0.p pVar2 = i34.f8024b;
                                int iD = pVar2.d(iL);
                                float fD = i34.d(iD);
                                float fE = i34.e(iD);
                                float fK = B0.c.k(fIntBitsToFloat, Math.min(fD, fE), Math.max(fD, fE));
                                if (p063g1.l.a(j12, 0L) || Math.abs(fIntBitsToFloat - fK) <= ((int) (j12 >> 32)) / 2) {
                                    float f10 = pVar2.f(iD);
                                    jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fK)) << 32) | (((long) Float.floatToRawIntBits(((pVar2.b(iD) - f10) / 2) + f10)) & 4294967295L);
                                } else {
                                    jFloatToRawIntBits = 9205357640488583168L;
                                }
                            }
                        }
                    }
                } else {
                    jFloatToRawIntBits = 9205357640488583168L;
                }
                return new p171r0.c(jFloatToRawIntBits);
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_TYPED_LINK /* 16 */:
                p241y9.a aVar = (p241y9.a) obj2;
                if (aVar != null && (eVar = (p171r0.e) aVar.invoke()) != null) {
                    return eVar;
                }
                j0 j0Var = (j0) obj;
                if (!j0Var.E0().f19338E) {
                    j0Var = null;
                }
                if (j0Var != null) {
                    return p171r0.f.d(0L, B9.a.d0(j0Var.f3170t));
                }
                return null;
            case 17:
                SharedPreferences sharedPreferences = ((Context) obj2).getSharedPreferences((String) obj, 0);
                p251z9.j.d(sharedPreferences, "context.getSharedPrefere…me, Context.MODE_PRIVATE)");
                return sharedPreferences;
            case 18:
                Context context = (Context) obj2;
                p251z9.j.d(context, "applicationContext");
                String str2 = ((W1.a) obj).f9494a;
                p251z9.j.e(str2, "name");
                return AbstractC0813f2.t(context, str2.concat(".preferences_pb"));
            case ObjectServerFacade.SYNC_CONFIG_OPTIONS /* 19 */:
                X.E e12 = (X.E) obj2;
                AccessibilityManager accessibilityManager = (AccessibilityManager) obj;
                e12.getClass();
                accessibilityManager.removeAccessibilityStateChangeListener(e12);
                X.D d5 = e12.f9688s;
                if (d5 != null) {
                    accessibilityManager.removeTouchExplorationStateChangeListener(d5);
                }
                if (Build.VERSION.SDK_INT >= 33 && (c10 = e12.f9689t) != null) {
                    X.B.b(accessibilityManager, c10);
                }
                return yVar;
            case 20:
                X.s sVar = (X.s) obj2;
                X.q qVar3 = sVar.f9785m;
                float fD2 = sVar.d().d(obj);
                if (!Float.isNaN(fD2)) {
                    X.s sVar2 = qVar3.f9771a;
                    sVar2.f9782i.h(fD2);
                    sVar2.j.h(0.0f);
                    sVar.h(null);
                }
                sVar.g(obj);
                return yVar;
            case 21:
                u.F f11 = (u.F) obj2;
                C0704u c0704u = (C0704u) obj;
                Object[] objArr5 = f11.f22676b;
                long[] jArr = f11.f22675a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i35 = 0;
                    while (true) {
                        long j16 = jArr[i35];
                        if ((((~j16) << 7) & j16 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i36 = 8 - ((~(i35 - length)) >>> 31);
                            for (int i37 = 0; i37 < i36; i37++) {
                                if ((255 & j16) < 128) {
                                    c0704u.y(objArr5[(i35 << 3) + i37]);
                                }
                                j16 >>= 8;
                            }
                            if (i36 == 8) {
                                if (i35 != length) {
                                    i35++;
                                }
                            }
                        } else if (i35 != length) {
                            i35++;
                        }
                    }
                }
                return yVar;
            case 22:
                ((p152p0.b) obj2).f20808H.e((p152p0.c) obj);
                return yVar;
            case 23:
                ((p251z9.v) obj2).f24886r = ((p162q0.t) obj).w0();
                return yVar;
            case 24:
                ((M9.i) obj2).k(obj);
                return yVar;
            case 25:
                C1455i c1455i = (C1455i) obj2;
                J0.K k10 = (J0.K) obj;
                c1455i.f24527L = c1455i.f24522G.c(k10.f3942r.f22795s.v(), k10.getLayoutDirection(), k10);
                return yVar;
            default:
                ((p251z9.v) obj2).f24886r = AbstractC0283f.i((C1471z) obj, S.f3166a);
                return yVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0086d(w0 w0Var, C0513e c0513e, C0335b0 c0335b0) {
        super(0);
        this.f1090r = 10;
        this.f1091s = c0513e;
        this.f1092t = c0335b0;
    }
}
