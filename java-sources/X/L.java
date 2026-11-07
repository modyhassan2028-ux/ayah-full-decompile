package X;

import A.C0007a;
import D.e0;
import E2.N0;
import H0.T;
import H0.U;
import K9.AbstractC0405x;
import K9.C0389g;
import K9.InterfaceC0402u;
import N9.k0;
import W.O1;
import Z.C0676d;
import Z.C0678e;
import Z.C0704u;
import Z.X;
import Z.p0;
import Z.s0;
import android.graphics.Typeface;
import androidx.compose.ui.window.PopupLayout;
import io.realm.RealmFieldTypeConstants;
import io.realm.internal.ObjectServerFacade;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import p151p.V;
import p180s0.C1300i;
import p180s0.C1304m;
import p207v2.C1363a;
import p207v2.C1374l;
import p207v2.EnumC1375m;
import p223x.n0;
import p223x.q0;

/* JADX INFO: loaded from: classes.dex */
public final class L extends p251z9.k implements p241y9.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f9707r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f9708s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f9709t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ L(int i10, Object obj, Object obj2) {
        super(1);
        this.f9707r = i10;
        this.f9708s = obj;
        this.f9709t = obj2;
    }

    private final Object b(Object obj) {
        C0678e c0678e = (C0678e) this.f9708s;
        Object obj2 = c0678e.f10658s;
        C0676d c0676d = (C0676d) this.f9709t;
        synchronized (obj2) {
            c0678e.f10660u.remove(c0676d);
            if (c0678e.f10660u.isEmpty()) {
                c0678e.f10662w.set(0);
            }
        }
        return p110k9.y.f19095a;
    }

    private final Object c(Object obj) {
        Ca.r rVar = (Ca.r) this.f9708s;
        Object obj2 = rVar.f851e;
        C0389g c0389g = (C0389g) this.f9709t;
        synchronized (obj2) {
            ((ArrayList) rVar.f849c).remove(c0389g);
        }
        return p110k9.y.f19095a;
    }

    private final Object f(Object obj) {
        Throwable th = (Throwable) obj;
        s0 s0Var = (s0) this.f9708s;
        Object obj2 = s0Var.f10789b;
        Throwable th2 = (Throwable) this.f9709t;
        synchronized (obj2) {
            if (th2 == null) {
                th2 = null;
            } else if (th != null) {
                try {
                    if (th instanceof CancellationException) {
                        th = null;
                    }
                    if (th != null) {
                        p110k9.a.a(th2, th);
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            s0Var.f10791d = th2;
            k0 k0Var = s0Var.f10805t;
            p0 p0Var = p0.f10758r;
            k0Var.getClass();
            k0Var.n(null, p0Var);
        }
        return p110k9.y.f19095a;
    }

    /* JADX WARN: Code duplicated, block: B:131:0x0379 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:132:0x037a  */
    @Override // p241y9.c
    public final Object e(Object obj) throws Throwable {
        Y0.t tVar;
        Typeface typefaceA;
        C1374l c1374l;
        C1374l c1374lA;
        switch (this.f9707r) {
            case 0:
                p152p0.c cVar = (p152p0.c) obj;
                return cVar.a(new p085i0.f(4, new C0007a(29, ((p180s0.J) this.f9708s).c(cVar.f20809r.b(), cVar.f20809r.getLayoutDirection(), cVar), (O1) this.f9709t)));
            case 1:
                Y0.f fVar = (Y0.f) this.f9708s;
                Y0.i iVar = fVar.f10352d;
                Y0.s sVar = (Y0.s) this.f9709t;
                iVar.getClass();
                Y0.e eVar = sVar.f10367a;
                Y0.p pVar = (Y0.p) fVar.f10353e.f24847s;
                int i10 = sVar.f10369c;
                Y0.l lVar = sVar.f10368b;
                if (eVar == null ? true : eVar instanceof Y0.b) {
                    typefaceA = pVar.b(lVar, i10);
                } else {
                    if (!(eVar instanceof Y0.n)) {
                        if (eVar instanceof Y0.o) {
                            typefaceA = (Typeface) ((Y0.o) eVar).f10366c.f9953r;
                        } else {
                            tVar = null;
                        }
                        if (tVar != null) {
                            return tVar;
                        }
                        throw new IllegalStateException("Could not load font");
                    }
                    typefaceA = pVar.a((Y0.n) eVar, lVar, i10);
                }
                tVar = new Y0.t(typefaceA);
                if (tVar != null) {
                    return tVar;
                }
                throw new IllegalStateException("Could not load font");
            case 2:
                Y0.t tVar2 = (Y0.t) obj;
                L5.c cVar2 = (L5.c) this.f9708s;
                R7.f fVar2 = (R7.f) cVar2.f5532s;
                Y0.s sVar2 = (Y0.s) this.f9709t;
                synchronized (fVar2) {
                    try {
                        if (tVar2.f10373s) {
                            ((N0) cVar2.f5533t).k(sVar2, tVar2);
                        } else {
                            ((N0) cVar2.f5533t).l(sVar2);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return p110k9.y.f19095a;
            case 3:
                return b(obj);
            case 4:
                return c(obj);
            case 5:
                return f(obj);
            case 6:
                ((C0704u) this.f9708s).y(obj);
                u.F f3 = (u.F) this.f9709t;
                if (f3 != null) {
                    f3.a(obj);
                }
                return p110k9.y.f19095a;
            case 7:
                int iIntValue = ((Number) obj).intValue();
                return ((p026c5.a) this.f9708s).invoke(Integer.valueOf(iIntValue), ((List) this.f9709t).get(iIntValue));
            case 8:
                p196u0.d dVar = (p196u0.d) obj;
                p251z9.j.e(dVar, "$this$Canvas");
                Iterable<p072ga.a> iterable = (Iterable) ((X) this.f9708s).getValue();
                ja.a aVar = (ja.a) this.f9709t;
                for (p072ga.a aVar2 : iterable) {
                    p074h0.i iVarY = dVar.y();
                    long jV = iVarY.v();
                    iVarY.p().q();
                    V v10 = (V) iVarY.f16422s;
                    float f7 = aVar2.f16356f;
                    float f10 = aVar2.f16352b;
                    float f11 = 2;
                    float f12 = (aVar2.f16353c / f11) + aVar2.f16351a;
                    v10.v(p171r0.d.a(f12, (aVar2.f16354d / f11) + f10), f7);
                    v10.w(aVar2.g, 1.0f, p171r0.d.a(f12, f10));
                    ia.c cVar3 = aVar2.f16357h;
                    p251z9.j.e(cVar3, "<this>");
                    p251z9.j.e(dVar, "drawScope");
                    float f13 = aVar2.f16352b;
                    float f14 = aVar2.f16351a;
                    int i11 = aVar2.f16355e;
                    float f15 = aVar2.f16353c;
                    p251z9.j.e(aVar, "imageStore");
                    if (cVar3.equals(ia.b.f17712a)) {
                        float f16 = f15 / 2;
                        p123m2.c.e(dVar, p180s0.F.c(i11), f16, p171r0.d.a(f14 + f16, f13 + f16), 0, 120);
                    } else if (cVar3.equals(ia.b.f17713b)) {
                        p123m2.c.k(dVar, p180s0.F.c(i11), p171r0.d.a(f14, f13), p171r0.j.a(f15, aVar2.f16354d), 120);
                    }
                    iVarY.p().n();
                    iVarY.J(jV);
                }
                return p110k9.y.f19095a;
            case 9:
                return ((G9.m) this.f9708s).e(((List) this.f9709t).get(((Number) obj).intValue()));
            case 10:
                ((J0.I) this.f9708s).c0(((l0.r) obj).b((l0.r) this.f9709t));
                return p110k9.y.f19095a;
            case 11:
                PopupLayout popupLayout = (PopupLayout) this.f9708s;
                popupLayout.setPositionProvider((p104k1.s) this.f9709t);
                popupLayout.l();
                return new p104k1.f();
            case 12:
                ((T) obj).d((U) this.f9708s, 0, 0, ((l0.u) this.f9709t).f19350F);
                return p110k9.y.f19095a;
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_LIST /* 13 */:
                T.i((T) obj, (U) this.f9708s, ((C1304m) this.f9709t).f21837F);
                return p110k9.y.f19095a;
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_LINKING_OBJECTS /* 14 */:
                T.i((T) obj, (U) this.f9708s, ((p180s0.K) this.f9709t).Q);
                return p110k9.y.f19095a;
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_OBJECTID /* 15 */:
                C1363a c1363a = (C1363a) obj;
                EnumC1375m enumC1375m = (EnumC1375m) this.f9708s;
                if (c1363a == null || (c1374l = c1363a.f23202d) == null) {
                    c1374l = C1374l.f23262d;
                }
                C1374l c1374l2 = c1363a != null ? c1363a.f23203e : null;
                c1374l.getClass();
                p251z9.j.e(enumC1375m, "loadType");
                int iOrdinal = enumC1375m.ordinal();
                if (iOrdinal == 0) {
                    c1374lA = C1374l.a(c1374l, 6);
                } else if (iOrdinal == 1) {
                    c1374lA = C1374l.a(c1374l, 5);
                } else {
                    if (iOrdinal != 2) {
                        throw new A6.a();
                    }
                    c1374lA = C1374l.a(c1374l, 3);
                }
                return p074h0.i.e((p074h0.i) this.f9709t, c1363a, c1374lA, c1374l2);
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_TYPED_LINK /* 16 */:
                ((T) obj).d((U) this.f9708s, 0, 0, ((p214w.u) this.f9709t).f23540c.g());
                return p110k9.y.f19095a;
            case 17:
                p223x.F f17 = (p223x.F) this.f9708s;
                p223x.D d5 = (p223x.D) this.f9709t;
                f17.f23848a.b(d5);
                f17.f23849b.setValue(Boolean.TRUE);
                return new e0(9, f17, d5);
            case 18:
                AbstractC0405x.x((InterfaceC0402u) this.f9708s, null, new V.l((q0) this.f9709t, null), 1);
                return new p223x.p0();
            case ObjectServerFacade.SYNC_CONFIG_OPTIONS /* 19 */:
                q0 q0Var = (q0) this.f9708s;
                q0 q0Var2 = (q0) this.f9709t;
                q0Var.j.add(q0Var2);
                return new e0(10, q0Var, q0Var2);
            case 20:
                return new e0(11, (q0) this.f9708s, (p223x.k0) this.f9709t);
            case 21:
                q0 q0Var3 = (q0) this.f9708s;
                n0 n0Var = (n0) this.f9709t;
                q0Var3.f24072i.add(n0Var);
                return new e0(12, q0Var3, n0Var);
            case 22:
                J0.K k7 = (J0.K) obj;
                k7.a();
                p123m2.c.i(k7, ((p180s0.B) this.f9708s).f21770e, (p180s0.F) this.f9709t, 0.0f, null, 60);
                return p110k9.y.f19095a;
            case 23:
                J0.K k10 = (J0.K) obj;
                k10.a();
                p123m2.c.i(k10, (C1300i) this.f9708s, (p180s0.F) this.f9709t, 0.0f, null, 60);
                return p110k9.y.f19095a;
            case 24:
                ((B.j) this.f9708s).b((B.i) this.f9709t);
                return p110k9.y.f19095a;
            case 25:
                long j = ((p171r0.c) obj).f21387a;
                ((p241y9.a) this.f9708s).invoke();
                ((p242z.j) this.f9709t).f24743a.setValue(new p242z.h(j));
                return p110k9.y.f19095a;
            default:
                Throwable th2 = (Throwable) obj;
                p112l1.i iVar2 = (p112l1.i) this.f9708s;
                if (th2 == null) {
                    Object objB = ((K9.A) this.f9709t).B();
                    iVar2.f19377d = true;
                    p112l1.k kVar = iVar2.f19375b;
                    if (kVar != null && kVar.f19380s.j(objB)) {
                        iVar2.f19374a = null;
                        iVar2.f19375b = null;
                        iVar2.f19376c = null;
                    }
                } else if (th2 instanceof CancellationException) {
                    iVar2.f19377d = true;
                    p112l1.k kVar2 = iVar2.f19375b;
                    if (kVar2 != null && kVar2.f19380s.cancel(true)) {
                        iVar2.f19374a = null;
                        iVar2.f19375b = null;
                        iVar2.f19376c = null;
                    }
                } else {
                    iVar2.f19377d = true;
                    p112l1.k kVar3 = iVar2.f19375b;
                    if (kVar3 != null && kVar3.f19380s.k(th2)) {
                        iVar2.f19374a = null;
                        iVar2.f19375b = null;
                        iVar2.f19376c = null;
                    }
                }
                return p110k9.y.f19095a;
        }
    }
}
