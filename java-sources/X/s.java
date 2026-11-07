package X;

import K0.m1;
import K9.AbstractC0405x;
import T1.C0504v;
import Z.C0672b;
import Z.C0673b0;
import Z.C0681f0;
import Z.G0;
import java.util.Collection;
import java.util.Iterator;
import p223x.InterfaceC1421j;
import p223x.Q;
import p232y.T;

/* JADX INFO: loaded from: classes.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p241y9.c f9775a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p251z9.k f9776b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC1421j f9777c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p241y9.c f9778d;
    public final C0681f0 g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final C0673b0 f9782i;
    public final C0673b0 j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final C0681f0 f9783k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final C0681f0 f9784l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final q f9785m;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final A f9779e = new A();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final L5.c f9780f = new L5.c(this);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Z.C f9781h = C0672b.o(new C0643o(this, 3));

    /* JADX WARN: Multi-variable type inference failed */
    public s(Enum r10, p241y9.c cVar, p241y9.a aVar, InterfaceC1421j interfaceC1421j, p241y9.c cVar2) {
        this.f9775a = cVar;
        this.f9776b = (p251z9.k) aVar;
        this.f9777c = interfaceC1421j;
        this.f9778d = cVar2;
        this.g = C0672b.r(r10);
        C0672b.o(new C0643o(this, 2));
        this.f9782i = new C0673b0(Float.NaN);
        p074h0.i iVar = G0.f10597a;
        new p074h0.a(0);
        new Z.B(p093j0.n.k().g());
        this.j = new C0673b0(0.0f);
        this.f9783k = C0672b.r(null);
        this.f9784l = C0672b.r(new F(p120l9.s.f19441r));
        this.f9785m = new q(this);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(Object obj, T t2, C0638j c0638j, q9.c cVar) throws Throwable {
        C0644p c0644p;
        s sVar;
        Object objA;
        Object objA2;
        if (cVar instanceof C0644p) {
            c0644p = (C0644p) cVar;
            int i10 = c0644p.f9770u;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c0644p.f9770u = i10 - Integer.MIN_VALUE;
            } else {
                c0644p = new C0644p(this, cVar);
            }
        } else {
            c0644p = new C0644p(this, cVar);
        }
        Object obj2 = c0644p.f9768s;
        int i11 = c0644p.f9770u;
        if (i11 == 0) {
            p110k9.a.e(obj2);
            if (d().f9690a.containsKey(obj)) {
                try {
                    A a9 = this.f9779e;
                    Q q10 = new Q(this, obj, c0638j, (p150o9.c) null);
                    c0644p.f9767r = this;
                    c0644p.f9770u = 1;
                    try {
                        a9.getClass();
                        Object objJ = AbstractC0405x.j(new m1(t2, a9, q10, (p150o9.c) null), c0644p);
                        p161p9.a aVar = p161p9.a.f21156r;
                        if (objJ == aVar) {
                            return aVar;
                        }
                        sVar = this;
                        sVar.h(null);
                        C0673b0 c0673b0 = sVar.f9782i;
                        objA2 = sVar.d().a(c0673b0.g());
                        if (objA2 != null) {
                            sVar.g(objA2);
                        }
                    } catch (Throwable th) {
                        th = th;
                        sVar = this;
                        sVar.h(null);
                        C0673b0 c0673b1 = sVar.f9782i;
                        objA = sVar.d().a(c0673b1.g());
                        if (objA != null) {
                            sVar.g(objA);
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } else {
                g(obj);
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            sVar = c0644p.f9767r;
            try {
                p110k9.a.e(obj2);
                sVar.h(null);
                C0673b0 c0673b2 = sVar.f9782i;
                objA2 = sVar.d().a(c0673b2.g());
                if (objA2 != null && Math.abs(c0673b2.g() - sVar.d().d(objA2)) <= 0.5f && ((Boolean) sVar.f9778d.e(objA2)).booleanValue()) {
                    sVar.g(objA2);
                }
            } catch (Throwable th3) {
                th = th3;
                sVar.h(null);
                C0673b0 c0673b3 = sVar.f9782i;
                objA = sVar.d().a(c0673b3.g());
                if (objA != null && Math.abs(c0673b3.g() - sVar.d().d(objA)) <= 0.5f && ((Boolean) sVar.f9778d.e(objA)).booleanValue()) {
                    sVar.g(objA);
                }
                throw th;
            }
        }
        return p110k9.y.f19095a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(T t2, r rVar, q9.c cVar) {
        C0642n c0642n;
        s sVar;
        Object objA;
        Object objA2;
        if (cVar instanceof C0642n) {
            c0642n = (C0642n) cVar;
            int i10 = c0642n.f9764u;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c0642n.f9764u = i10 - Integer.MIN_VALUE;
            } else {
                c0642n = new C0642n(this, cVar);
            }
        } else {
            c0642n = new C0642n(this, cVar);
        }
        Object obj = c0642n.f9762s;
        int i11 = c0642n.f9764u;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            sVar = c0642n.f9761r;
            try {
                p110k9.a.e(obj);
                F fD = sVar.d();
                C0673b0 c0673b0 = sVar.f9782i;
                objA2 = fD.a(c0673b0.g());
                if (objA2 != null && Math.abs(c0673b0.g() - sVar.d().d(objA2)) <= 0.5f && ((Boolean) sVar.f9778d.e(objA2)).booleanValue()) {
                    sVar.g(objA2);
                }
                return p110k9.y.f19095a;
            } catch (Throwable th) {
                th = th;
                F fD2 = sVar.d();
                C0673b0 c0673b1 = sVar.f9782i;
                objA = fD2.a(c0673b1.g());
                if (objA != null) {
                    sVar.g(objA);
                }
                throw th;
            }
        }
        p110k9.a.e(obj);
        try {
            A a9 = this.f9779e;
            C0504v c0504v = new C0504v(this, rVar, null, 1);
            c0642n.f9761r = this;
            c0642n.f9764u = 1;
            try {
                a9.getClass();
                Object objJ = AbstractC0405x.j(new m1(t2, a9, c0504v, (p150o9.c) null), c0642n);
                p161p9.a aVar = p161p9.a.f21156r;
                if (objJ == aVar) {
                    return aVar;
                }
                sVar = this;
                F fD3 = sVar.d();
                C0673b0 c0673b2 = sVar.f9782i;
                objA2 = fD3.a(c0673b2.g());
                if (objA2 != null) {
                    sVar.g(objA2);
                }
                return p110k9.y.f19095a;
            } catch (Throwable th2) {
                th = th2;
                sVar = this;
                F fD4 = sVar.d();
                C0673b0 c0673b3 = sVar.f9782i;
                objA = fD4.a(c0673b3.g());
                if (objA != null && Math.abs(c0673b3.g() - sVar.d().d(objA)) <= 0.5f && ((Boolean) sVar.f9778d.e(objA)).booleanValue()) {
                    sVar.g(objA);
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [y9.a, z9.k] */
    public final Object c(float f3, float f7, Object obj) {
        F fD = d();
        float fD2 = fD.d(obj);
        float fFloatValue = ((Number) this.f9776b.invoke()).floatValue();
        if (fD2 != f3 && !Float.isNaN(fD2)) {
            p241y9.c cVar = this.f9775a;
            if (fD2 < f3) {
                if (f7 >= fFloatValue) {
                    Object objB = fD.b(f3, true);
                    p251z9.j.b(objB);
                    return objB;
                }
                Object objB2 = fD.b(f3, true);
                p251z9.j.b(objB2);
                if (f3 >= Math.abs(Math.abs(((Number) cVar.e(Float.valueOf(Math.abs(fD.d(objB2) - fD2)))).floatValue()) + fD2)) {
                    return objB2;
                }
            } else {
                if (f7 <= (-fFloatValue)) {
                    Object objB3 = fD.b(f3, false);
                    p251z9.j.b(objB3);
                    return objB3;
                }
                Object objB4 = fD.b(f3, false);
                p251z9.j.b(objB4);
                float fAbs = Math.abs(fD2 - Math.abs(((Number) cVar.e(Float.valueOf(Math.abs(fD2 - fD.d(objB4))))).floatValue()));
                if (f3 >= 0.0f ? f3 <= fAbs : Math.abs(f3) >= fAbs) {
                    return objB4;
                }
            }
        }
        return obj;
    }

    public final F d() {
        return (F) this.f9784l.getValue();
    }

    public final float e(float f3) {
        Float fValueOf;
        C0673b0 c0673b0 = this.f9782i;
        float fG = (Float.isNaN(c0673b0.g()) ? 0.0f : c0673b0.g()) + f3;
        float fC = d().c();
        Collection collectionValues = d().f9690a.values();
        p251z9.j.e(collectionValues, "<this>");
        Iterator it = collectionValues.iterator();
        if (it.hasNext()) {
            float fFloatValue = ((Number) it.next()).floatValue();
            while (it.hasNext()) {
                fFloatValue = Math.max(fFloatValue, ((Number) it.next()).floatValue());
            }
            fValueOf = Float.valueOf(fFloatValue);
        } else {
            fValueOf = null;
        }
        return B0.c.k(fG, fC, fValueOf != null ? fValueOf.floatValue() : Float.NaN);
    }

    public final float f() {
        C0673b0 c0673b0 = this.f9782i;
        if (Float.isNaN(c0673b0.g())) {
            throw new IllegalStateException("The offset was read before being initialized. Did you access the offset in a phase before layout, like effects or composition?");
        }
        return c0673b0.g();
    }

    public final void g(Object obj) {
        this.g.setValue(obj);
    }

    public final void h(Object obj) {
        this.f9783k.setValue(obj);
    }

    public final Object i(float f3, q9.i iVar) {
        Object value = this.g.getValue();
        Object objC = c(f(), f3, value);
        boolean zBooleanValue = ((Boolean) this.f9778d.e(objC)).booleanValue();
        p161p9.a aVar = p161p9.a.f21156r;
        if (zBooleanValue) {
            Object objC2 = androidx.compose.material3.internal.a.c(this, objC, f3, iVar);
            if (objC2 == aVar) {
                return objC2;
            }
        } else {
            Object objC3 = androidx.compose.material3.internal.a.c(this, value, f3, iVar);
            if (objC3 == aVar) {
                return objC3;
            }
        }
        return p110k9.y.f19095a;
    }
}
