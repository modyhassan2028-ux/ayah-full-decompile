package A;

import K.C0324s;
import K0.C0333a0;
import K0.C0356m;
import K0.C0363p0;
import K0.C0380y0;
import K9.AbstractC0405x;
import K9.C0395m;
import K9.C0397o;
import K9.InterfaceC0402u;
import U0.AbstractC0522n;
import U0.C0511c;
import U0.C0512d;
import U0.C0513e;
import U0.C0515g;
import W.A2;
import W.C0554e2;
import W.C0561g1;
import W.C0576l;
import W.C0601t1;
import W.C0604u1;
import W.O1;
import Z.C0675c0;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Path;
import android.os.Build;
import android.view.Choreographer;
import android.view.InputDevice;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import androidx.lifecycle.EnumC0766o;
import androidx.lifecycle.EnumC0767p;
import io.realm.RealmFieldTypeConstants;
import io.realm.internal.ObjectServerFacade;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.CancellationException;
import p180s0.C1300i;

/* JADX INFO: renamed from: A.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0007a extends p251z9.k implements p241y9.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f179r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f180s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f181t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0007a(int i10, Object obj, Object obj2) {
        super(1);
        this.f179r = i10;
        this.f180s = obj;
        this.f181t = obj2;
    }

    private final Object b(Object obj) {
        K0.Y y10 = (K0.Y) this.f180s;
        K0.Z z10 = (K0.Z) this.f181t;
        synchronized (y10.f5042v) {
            y10.f5044x.remove(z10);
        }
        return p110k9.y.f19095a;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x035a  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [o9.c] */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v8 */
    @Override // p241y9.c
    public final Object e(Object obj) {
        U0.C c10;
        U0.C c11;
        U0.J jA;
        U0.C c12;
        U0.J jA2;
        U0.C c13;
        U0.J jA3;
        U0.C c14;
        U0.I i10;
        C1300i c1300iH;
        M.q qVar;
        p110k9.y yVar;
        X.C c15;
        int i11 = 5;
        int i12 = 4;
        int i13 = 2;
        U0.C c16 = 0;
        c16 = 0;
        boolean z10 = false;
        zE = false;
        zE = false;
        zE = false;
        zE = false;
        zE = false;
        boolean zE = false;
        z10 = false;
        z10 = false;
        int i14 = 1;
        switch (this.f179r) {
            case 0:
                ((C0009b) this.f180s).f188a.k((C0021h) this.f181t);
                return p110k9.y.f19095a;
            case 1:
                C0601t1 c0601t1 = (C0601t1) this.f180s;
                X x9 = (X) this.f181t;
                long jI = p171r0.c.i(((C0046u) obj).f423a, x9.U ? -1.0f : 1.0f);
                EnumC0047u0 enumC0047u0 = x9.Q;
                U u8 = V.f152a;
                float fIntBitsToFloat = Float.intBitsToFloat(enumC0047u0 == EnumC0047u0.f424r ? (int) (jI & 4294967295L) : (int) (jI >> 32));
                switch (c0601t1.f9373a) {
                    case 0:
                        ((C0604u1) c0601t1.f9374b).a(fIntBitsToFloat);
                        break;
                    default:
                        X.s sVar = (X.s) c0601t1.f9374b;
                        X.q qVar2 = sVar.f9785m;
                        float fE = sVar.e(fIntBitsToFloat);
                        X.s sVar2 = qVar2.f9771a;
                        sVar2.f9782i.h(fE);
                        sVar2.j.h(0.0f);
                        break;
                }
                return p110k9.y.f19095a;
            case 2:
                Z0 z11 = (Z0) this.f180s;
                b1 b1Var = (b1) this.f181t;
                long j = ((C0046u) obj).f423a;
                z11.a(b1Var.f196d == EnumC0047u0.f425s ? p171r0.c.a(j, 0.0f, 1) : p171r0.c.a(j, 0.0f, 2), 1);
                return p110k9.y.f19095a;
            case 3:
                ((Number) obj).longValue();
                r1 r1Var = (r1) this.f180s;
                float f3 = r1Var.f404e;
                r1Var.f404e = 0.0f;
                ((p241y9.c) this.f181t).e(Float.valueOf(f3));
                return p110k9.y.f19095a;
            case 4:
                D.f0 f0Var = (D.f0) this.f180s;
                View view = (View) this.f181t;
                D.D d5 = f0Var.f973t;
                if (f0Var.f972s == 0) {
                    WeakHashMap weakHashMap = I1.S.f3689a;
                    I1.I.m(view, d5);
                    if (view.isAttachedToWindow()) {
                        view.requestApplyInsets();
                    }
                    view.addOnAttachStateChangeListener(d5);
                    I1.S.r(view, d5);
                }
                f0Var.f972s++;
                return new D.e0(z10 ? 1 : 0, f0Var, view);
            case 5:
                MotionEvent motionEvent = (MotionEvent) obj;
                D0.C c17 = (D0.C) this.f181t;
                if (motionEvent.getActionMasked() == 0) {
                    android.support.v4.media.session.r rVar = (android.support.v4.media.session.r) this.f180s;
                    D0.D d9 = c17.f1045a;
                    if (d9 == null) {
                        p251z9.j.k("onTouchEvent");
                        throw null;
                    }
                    rVar.f11365t = ((Boolean) d9.e(motionEvent)).booleanValue() ? D0.A.f1040s : D0.A.f1041t;
                } else {
                    D0.D d10 = c17.f1045a;
                    if (d10 == null) {
                        p251z9.j.k("onTouchEvent");
                        throw null;
                    }
                    d10.e(motionEvent);
                }
                return p110k9.y.f19095a;
            case 6:
                return new G.Y((p085i0.j) this.f180s, (Map) obj, (p085i0.c) this.f181t);
            case 7:
                G.Y y10 = (G.Y) this.f180s;
                u.F f7 = y10.f2649c;
                Object obj2 = this.f181t;
                f7.i(obj2);
                return new D.e0(i14, y10, obj2);
            case 8:
                Z0.y yVar2 = (Z0.y) obj;
                if (!p251z9.j.a((Z0.y) this.f180s, yVar2)) {
                    ((p241y9.c) this.f181t).e(yVar2);
                }
                return p110k9.y.f19095a;
            case 9:
                KeyEvent keyEvent = ((B0.b) obj).f585a;
                if (((K.W) this.f180s).a() == K.L.f4485s && keyEvent.getKeyCode() == 4 && B0.c.O(keyEvent) == 1) {
                    ((O.N) this.f181t).e(null);
                    z10 = true;
                }
                return Boolean.valueOf(z10);
            case 10:
                H0.T t2 = (H0.T) obj;
                ArrayList arrayListN = K.T.n((List) this.f180s, (p241y9.a) ((K.Y) this.f181t).f4580b);
                if (arrayListN != null) {
                    int size = arrayListN.size();
                    for (int i15 = 0; i15 < size; i15++) {
                        p110k9.j jVar = (p110k9.j) arrayListN.get(i15);
                        H0.U u10 = (H0.U) jVar.f19077r;
                        p241y9.a aVar = (p241y9.a) jVar.f19078s;
                        H0.T.f(t2, u10, aVar != null ? ((p063g1.j) aVar.invoke()).f16254a : 0L);
                    }
                }
                return p110k9.y.f19095a;
            case 11:
                KeyEvent keyEvent2 = ((B0.b) obj).f585a;
                p162q0.j jVar2 = (p162q0.j) this.f180s;
                InputDevice device = keyEvent2.getDevice();
                if (device != null && device.supportsSource(513) && !device.isVirtual() && B0.c.O(keyEvent2) == 2 && keyEvent2.getSource() != 257) {
                    if (K.T.m(19, keyEvent2)) {
                        zE = ((p162q0.k) jVar2).e(5);
                    } else if (K.T.m(20, keyEvent2)) {
                        zE = ((p162q0.k) jVar2).e(6);
                    } else if (K.T.m(21, keyEvent2)) {
                        zE = ((p162q0.k) jVar2).e(3);
                    } else if (K.T.m(22, keyEvent2)) {
                        zE = ((p162q0.k) jVar2).e(4);
                    } else if (K.T.m(23, keyEvent2)) {
                        K0.X0 x10 = ((K.W) this.f181t).f4555c;
                        if (x10 != null) {
                            ((C0363p0) x10).b();
                        }
                        zE = true;
                    }
                }
                return Boolean.valueOf(zE);
            case 12:
                return new D.e0(i13, (Z.X) this.f180s, (B.j) this.f181t);
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_LIST /* 13 */:
                K.d0 d0Var = (K.d0) obj;
                C0675c0 c0675c0 = ((K.X) this.f181t).f4578b;
                C0513e c0513e = (C0513e) this.f180s;
                Object obj3 = c0513e.f8054a;
                U0.J jA4 = ((AbstractC0522n) obj3).a();
                U0.C c18 = jA4 != null ? jA4.f8029a : null;
                if ((c0675c0.g() & 1) == 0 || (jA3 = ((AbstractC0522n) obj3).a()) == null) {
                    c10 = null;
                } else {
                    c14 = jA3.f8030b;
                }
                if (c18 != null) {
                    c10 = c14;
                    c10 = c18.c(c10);
                }
                c10 = c14;
                if ((c0675c0.g() & 2) == 0 || (jA2 = ((AbstractC0522n) obj3).a()) == null) {
                    c11 = null;
                } else {
                    c13 = jA2.f8031c;
                }
                if (c10 != null) {
                    c11 = c13;
                    c11 = c10.c(c11);
                }
                c11 = c13;
                if ((c0675c0.g() & 4) != 0 && (jA = ((AbstractC0522n) obj3).a()) != null) {
                    c12 = jA.f8032d;
                }
                if (c11 != null) {
                    c16 = c12;
                    c16 = c11.c(c16);
                }
                c16 = c12;
                p251z9.r rVar2 = new p251z9.r();
                C0515g c0515g = d0Var.f4620a;
                C0023i c0023i = new C0023i(rVar2, c0513e, c16, 7);
                c0515g.getClass();
                C0512d c0512d = new C0512d(c0515g);
                ArrayList arrayList = c0512d.f8053s;
                int size2 = arrayList.size();
                for (int i16 = 0; i16 < size2; i16++) {
                    C0513e c0513e2 = (C0513e) c0023i.e(((C0511c) arrayList.get(i16)).a(Integer.MIN_VALUE));
                    arrayList.set(i16, new C0511c(c0513e2.f8054a, c0513e2.f8055b, c0513e2.f8056c, c0513e2.f8057d));
                }
                d0Var.f4621b = c0512d.b();
                return p110k9.y.f19095a;
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_LINKING_OBJECTS /* 14 */:
                p180s0.G g = (p180s0.G) obj;
                K.w0 w0Var = (K.w0) this.f180s;
                C0513e c0513e3 = (C0513e) this.f181t;
                if (((Boolean) new C0324s(w0Var, i13).invoke()).booleanValue() && (i10 = (U0.I) w0Var.f4812a.getValue()) != null) {
                    U0.p pVar = i10.f8024b;
                    C0513e c0513eC = K.w0.c(c0513e3, i10);
                    if (c0513eC == null) {
                        c1300iH = null;
                    } else {
                        int i17 = c0513eC.f8056c;
                        int i18 = c0513eC.f8055b;
                        c1300iH = i10.h(i18, i17);
                        p171r0.e eVarB = i10.b(i18);
                        int i19 = i17 - 1;
                        long jFloatToRawIntBits = ((((long) Float.floatToRawIntBits(pVar.d(i18) == pVar.d(i19) ? Math.min(i10.b(i19).f21389a, eVarB.f21389a) : 0.0f)) << 32) | (((long) Float.floatToRawIntBits(eVarB.f21390b)) & 4294967295L)) ^ (-9223372034707292160L);
                        Matrix matrix = c1300iH.f21832d;
                        if (matrix == null) {
                            c1300iH.f21832d = new Matrix();
                        } else {
                            matrix.reset();
                        }
                        Matrix matrix2 = c1300iH.f21832d;
                        p251z9.j.b(matrix2);
                        matrix2.setTranslate(Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)), Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)));
                        Path path = c1300iH.f21829a;
                        Matrix matrix3 = c1300iH.f21832d;
                        p251z9.j.b(matrix3);
                        path.transform(matrix3);
                    }
                } else {
                    c1300iH = null;
                }
                O8.c cVar = c1300iH != null ? new O8.c(c1300iH) : null;
                if (cVar != null) {
                    g.i(cVar);
                    g.d(true);
                }
                return p110k9.y.f19095a;
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_OBJECTID /* 15 */:
                H0.T t10 = (H0.T) obj;
                List list = (List) this.f180s;
                if (list != null) {
                    int size3 = list.size();
                    for (int i20 = 0; i20 < size3; i20++) {
                        p110k9.j jVar3 = (p110k9.j) list.get(i20);
                        H0.T.f(t10, (H0.U) jVar3.f19077r, ((p063g1.j) jVar3.f19078s).f16254a);
                    }
                }
                List list2 = (List) this.f181t;
                if (list2 != null) {
                    int size4 = list2.size();
                    for (int i21 = 0; i21 < size4; i21++) {
                        p110k9.j jVar4 = (p110k9.j) list2.get(i21);
                        H0.U u11 = (H0.U) jVar4.f19077r;
                        p241y9.a aVar2 = (p241y9.a) jVar4.f19078s;
                        H0.T.f(t10, u11, aVar2 != null ? ((p063g1.j) aVar2.invoke()).f16254a : 0L);
                    }
                }
                return p110k9.y.f19095a;
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_TYPED_LINK /* 16 */:
                Context context = (Context) this.f180s;
                Context applicationContext = context.getApplicationContext();
                K0.S s10 = (K0.S) this.f181t;
                applicationContext.registerComponentCallbacks(s10);
                return new D.e0(i12, context, s10);
            case 17:
                Context context2 = (Context) this.f180s;
                Context applicationContext2 = context2.getApplicationContext();
                K0.T t11 = (K0.T) this.f181t;
                applicationContext2.registerComponentCallbacks(t11);
                return new D.e0(i11, context2, t11);
            case 18:
                return new C0380y0((M.p) this.f180s, new C0041r0(16, (K0.V) this.f181t));
            case ObjectServerFacade.SYNC_CONFIG_OPTIONS /* 19 */:
                C0380y0 c0380y0 = (C0380y0) this.f180s;
                synchronized (c0380y0.f5207c) {
                    try {
                        c0380y0.f5209e = true;
                        p011b0.e eVar = c0380y0.f5208d;
                        Object[] objArr = eVar.f13125r;
                        int i22 = eVar.f13127t;
                        for (int i23 = 0; i23 < i22; i23++) {
                            Z0.n nVar = (Z0.n) ((J0.E0) objArr[i23]).get();
                            if (nVar != null && (qVar = nVar.f10938b) != null) {
                                nVar.a(qVar);
                                nVar.f10938b = null;
                            }
                        }
                        c0380y0.f5208d.g();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                Z0.z zVar = ((K0.V) this.f181t).f5023s;
                zVar.f10957b.set(null);
                zVar.f10956a.g();
                return p110k9.y.f19095a;
            case 20:
                return b(obj);
            case 21:
                ((Choreographer) ((C0333a0) this.f180s).f5055s).removeFrameCallback((K0.Z) this.f181t);
                return p110k9.y.f19095a;
            case 22:
                C0356m c0356m = (C0356m) obj;
                p241y9.e eVar2 = (p241y9.e) this.f181t;
                K0.r1 r1Var2 = (K0.r1) this.f180s;
                if (!r1Var2.f5158t) {
                    androidx.lifecycle.w wVarH = c0356m.f5097a.h();
                    r1Var2.f5160v = eVar2;
                    if (r1Var2.f5159u == null) {
                        r1Var2.f5159u = wVarH;
                        wVarH.a(r1Var2);
                    } else if (wVarH.f12672c.compareTo(EnumC0767p.f12663t) >= 0) {
                        r1Var2.f5157s.j(new p074h0.d(-2000640158, new K0.q1(r1Var2, eVar2, i14), true));
                    }
                }
                return p110k9.y.f19095a;
            case 23:
                H9.k kVar = (H9.k) obj;
                p251z9.t tVar = (p251z9.t) this.f180s;
                if (tVar.f24884r == -1) {
                    tVar.f24884r = kVar.a().f1995r;
                }
                ((p251z9.t) this.f181t).f24884r = kVar.a().f1996s + 1;
                return "";
            case 24:
                p110k9.y yVar3 = p110k9.y.f19095a;
                if (p251z9.j.a((String) obj, ((File) this.f180s).getName())) {
                    M9.r rVar3 = (M9.r) ((M9.s) this.f181t);
                    Object objK = rVar3.f5883u.k(yVar3);
                    if (objK instanceof M9.k) {
                        Object obj4 = ((M9.l) AbstractC0405x.C(p150o9.i.f20380r, new C0030l0(rVar3, (p150o9.c) c16, 25))).f5876a;
                    }
                }
                return yVar3;
            case 25:
                p110k9.y yVar4 = p110k9.y.f19095a;
                Throwable th2 = (Throwable) obj;
                ((M0) this.f180s).e(th2);
                M9.e eVar3 = (M9.e) ((Aa.a) this.f181t).f556t;
                eVar3.l(th2, false);
                do {
                    Object objA = M9.l.a(eVar3.g());
                    if (objA != null) {
                        C0395m c0395m = ((T1.N) objA).f7611b;
                        Throwable cancellationException = th2 == null ? new CancellationException("DataStore scope was cancelled before updateData could complete") : th2;
                        c0395m.getClass();
                        c0395m.Q(new C0397o(cancellationException, false));
                        yVar = yVar4;
                    } else {
                        yVar = null;
                    }
                } while (yVar != null);
                return yVar4;
            case 26:
                AbstractC0405x.x((InterfaceC0402u) this.f180s, null, new Q0.c((C0561g1) this.f181t, ((Number) obj).floatValue(), c16, i14), 3);
                return p110k9.y.f19095a;
            case 27:
                J0.K k7 = (J0.K) obj;
                C0576l c0576l = (C0576l) this.f180s;
                long jA5 = p171r0.d.a(k7.w(Float.intBitsToFloat((int) (A2.q(c0576l) >> 32))), k7.w(Float.intBitsToFloat((int) (A2.q(c0576l) & 4294967295L))));
                float f10 = 2;
                float fW = k7.w(Y.s.f10236c) / f10;
                C0554e2 c0554e2 = (C0554e2) this.f181t;
                long j10 = c0554e2.f9043b;
                p123m2.c.e(k7, p180s0.q.f21839b, fW, jA5, 0, 56);
                k7.a();
                p123m2.c.e(k7, j10, fW, jA5, 11, 56);
                float fW2 = k7.w(Y.s.f10237d);
                long jG = p171r0.c.g(jA5, p171r0.d.a(((float) Math.cos(((Number) c0576l.f9225d.d()).floatValue())) * fW, ((float) Math.sin(((Number) c0576l.f9225d.d()).floatValue())) * fW));
                p196u0.b bVar = k7.f3942r;
                k7.W(j10, p171r0.j.d(bVar.f22795s.v()), jG, (240 & 8) != 0 ? 0.0f : fW2, (240 & 16) != 0 ? 0 : 0, 3);
                p123m2.c.e(k7, j10, k7.w(Y.s.f10235b) / f10, p171r0.j.d(bVar.f22795s.v()), 0, 120);
                p123m2.c.e(k7, c0554e2.f9046e, fW, jA5, 4, 56);
                return p110k9.y.f19095a;
            case 28:
                if (((EnumC0766o) obj) == EnumC0766o.ON_RESUME) {
                    X.E e10 = (X.E) this.f180s;
                    AccessibilityManager accessibilityManager = (AccessibilityManager) this.f181t;
                    e10.getClass();
                    e10.f9687r.setValue(Boolean.valueOf(accessibilityManager.isEnabled()));
                    accessibilityManager.addAccessibilityStateChangeListener(e10);
                    X.D d11 = e10.f9688s;
                    if (d11 != null) {
                        d11.f9686a.setValue(Boolean.valueOf(accessibilityManager.isTouchExplorationEnabled()));
                        accessibilityManager.addTouchExplorationStateChangeListener(d11);
                    }
                    if (Build.VERSION.SDK_INT >= 33 && (c15 = e10.f9689t) != null) {
                        c15.f9685a.setValue(Boolean.valueOf(X.E.b(accessibilityManager)));
                        X.B.a(accessibilityManager, c15);
                    }
                }
                return p110k9.y.f19095a;
            default:
                p180s0.F.l((p196u0.d) obj, (p180s0.F) this.f180s, ((O1) this.f181t).a());
                return p110k9.y.f19095a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0007a(K.w0 w0Var, C0513e c0513e, K.X x9) {
        super(1);
        this.f179r = 13;
        this.f180s = c0513e;
        this.f181t = x9;
    }
}
