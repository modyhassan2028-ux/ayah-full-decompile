package A;

import G.C0191z;
import Ga.C0195d;
import Ga.C0196e;
import K.C0328w;
import K9.AbstractC0405x;
import K9.InterfaceC0402u;
import Z.C0681f0;
import p223x.AbstractC1413d;
import p223x.C1411c;
import p223x.C1420i;
import p223x.C1422k;

/* JADX INFO: renamed from: A.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0033n extends p251z9.k implements p241y9.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f335r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f336s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f337t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f338u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f339v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0033n(Z.X x9, p223x.F f3, p251z9.s sVar, InterfaceC0402u interfaceC0402u) {
        super(1);
        this.f335r = 7;
        this.f337t = x9;
        this.f338u = f3;
        this.f336s = sVar;
        this.f339v = interfaceC0402u;
    }

    /* JADX WARN: Code duplicated, block: B:66:0x022e  */
    @Override // p241y9.c
    public final Object e(Object obj) {
        switch (this.f335r) {
            case 0:
                C1420i c1420i = (C1420i) obj;
                float fFloatValue = ((Number) c1420i.f24011e.getValue()).floatValue();
                p251z9.s sVar = (p251z9.s) this.f336s;
                float f3 = fFloatValue - sVar.f24883r;
                float fA = ((X0) this.f338u).a(f3);
                sVar.f24883r = ((Number) c1420i.f24011e.getValue()).floatValue();
                ((p251z9.s) this.f337t).f24883r = ((Number) c1420i.f24007a.f24112b.e(c1420i.f24012f)).floatValue();
                if (Math.abs(f3 - fA) > 0.5f) {
                    c1420i.a();
                }
                ((C0037p) this.f339v).getClass();
                return p110k9.y.f19095a;
            case 1:
                C1420i c1420i2 = (C1420i) obj;
                float fFloatValue2 = ((Number) c1420i2.f24011e.getValue()).floatValue();
                p251z9.s sVar2 = (p251z9.s) this.f336s;
                float f7 = fFloatValue2 - sVar2.f24883r;
                if (AbstractC0024i0.a(f7)) {
                    if (((Boolean) ((C0034n0) this.f339v).e(Float.valueOf(sVar2.f24883r))).booleanValue()) {
                        c1420i2.a();
                    }
                } else if (AbstractC0024i0.a(f7 - C0045t0.a((C0045t0) this.f337t, (Z0) this.f338u, f7))) {
                    sVar2.f24883r += f7;
                    if (((Boolean) ((C0034n0) this.f339v).e(Float.valueOf(sVar2.f24883r))).booleanValue()) {
                        c1420i2.a();
                    }
                } else {
                    c1420i2.a();
                }
                return p110k9.y.f19095a;
            case 2:
                G.L l10 = (G.L) this.f336s;
                l10.f2599c = new android.support.v4.media.session.r((G.B) this.f337t, (H0.d0) this.f338u, (G.e0) this.f339v, 10);
                return new C0191z(1, l10);
            case 3:
                p251z9.j.e((Z.F) obj, "$this$DisposableEffect");
                return new C0196e((p241y9.a) this.f336s, (Z.X) this.f337t, (Z.X) this.f338u, (InterfaceC0402u) this.f339v);
            case 4:
                long j = ((p171r0.c) obj).f21387a;
                ((Z.X) this.f337t).setValue(Boolean.TRUE);
                Z.X x9 = (Z.X) this.f339v;
                B.b bVar = new B.b();
                AbstractC0405x.x((InterfaceC0402u) this.f338u, null, new C0195d(bVar, null, 1), 3);
                x9.setValue(bVar);
                ((p241y9.c) this.f336s).e(new p171r0.c(j));
                return p110k9.y.f19095a;
            case 5:
                K.W w9 = (K.W) this.f336s;
                if (w9.b()) {
                    Z0.z zVar = (Z0.z) this.f337t;
                    Z0.y yVar = (Z0.y) this.f338u;
                    L5.c cVar = w9.f4556d;
                    Z0.k kVar = (Z0.k) this.f339v;
                    K.B b5 = w9.f4572v;
                    K.B b10 = w9.f4573w;
                    p251z9.v vVar = new p251z9.v();
                    C0023i c0023i = new C0023i(cVar, b5, vVar, 8);
                    Z0.t tVar = zVar.f10956a;
                    tVar.h(yVar, kVar, c0023i, b10);
                    Z0.E e10 = new Z0.E(zVar, tVar);
                    zVar.f10957b.set(e10);
                    vVar.f24886r = e10;
                    w9.f4557e = e10;
                }
                return new C0328w();
            case 6:
                C1420i c1420i3 = (C1420i) obj;
                p241y9.c cVar2 = (p241y9.c) this.f338u;
                C1411c c1411c = (C1411c) this.f336s;
                AbstractC1413d.r(c1420i3, c1411c.f23943c);
                C0681f0 c0681f0 = c1420i3.f24011e;
                Object objA = C1411c.a(c1411c, c0681f0.getValue());
                if (!p251z9.j.a(objA, c0681f0.getValue())) {
                    c1411c.f23943c.f24028s.setValue(objA);
                    ((C1422k) this.f337t).f24028s.setValue(objA);
                    if (cVar2 != null) {
                        cVar2.e(c1411c);
                    }
                    c1420i3.a();
                    ((p251z9.r) this.f339v).f24882r = true;
                } else if (cVar2 != null) {
                    cVar2.e(c1411c);
                }
                return p110k9.y.f19095a;
            default:
                long jLongValue = ((Number) obj).longValue();
                InterfaceC0402u interfaceC0402u = (InterfaceC0402u) this.f339v;
                p251z9.s sVar3 = (p251z9.s) this.f336s;
                p223x.F f10 = (p223x.F) this.f338u;
                Z.L0 l11 = (Z.L0) ((Z.X) this.f337t).getValue();
                long jLongValue2 = l11 != null ? ((Number) l11.getValue()).longValue() : jLongValue;
                long j10 = f10.f23850c;
                p011b0.e eVar = f10.f23848a;
                if (j10 == Long.MIN_VALUE || sVar3.f24883r != AbstractC1413d.m(interfaceC0402u.getCoroutineContext())) {
                    f10.f23850c = jLongValue;
                    Object[] objArr = eVar.f13125r;
                    int i10 = eVar.f13127t;
                    for (int i11 = 0; i11 < i10; i11++) {
                        ((p223x.D) objArr[i11]).f23830x = true;
                    }
                    sVar3.f24883r = AbstractC1413d.m(interfaceC0402u.getCoroutineContext());
                }
                float f11 = sVar3.f24883r;
                if (f11 == 0.0f) {
                    Object[] objArr2 = eVar.f13125r;
                    int i12 = eVar.f13127t;
                    for (int i13 = 0; i13 < i12; i13++) {
                        p223x.D d5 = (p223x.D) objArr2[i13];
                        d5.f23827u.setValue(d5.f23828v.f24017c);
                        d5.f23830x = true;
                    }
                } else {
                    long j11 = (long) ((jLongValue2 - f10.f23850c) / f11);
                    Object[] objArr3 = eVar.f13125r;
                    int i14 = eVar.f13127t;
                    boolean z10 = true;
                    for (int i15 = 0; i15 < i14; i15++) {
                        p223x.D d9 = (p223x.D) objArr3[i15];
                        if (!d9.f23829w) {
                            d9.f23832z.f23849b.setValue(Boolean.FALSE);
                            if (d9.f23830x) {
                                d9.f23830x = false;
                                d9.f23831y = j11;
                            }
                            long j12 = j11 - d9.f23831y;
                            d9.f23827u.setValue(d9.f23828v.e(j12));
                            p223x.i0 i0Var = d9.f23828v;
                            i0Var.getClass();
                            d9.f23829w = p123m2.c.a(i0Var, j12);
                        }
                        if (!d9.f23829w) {
                            z10 = false;
                        }
                    }
                    f10.f23851d.setValue(Boolean.valueOf(!z10));
                }
                return p110k9.y.f19095a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0033n(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        super(1);
        this.f335r = i10;
        this.f336s = obj;
        this.f337t = obj2;
        this.f338u = obj3;
        this.f339v = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0033n(p251z9.s sVar, X0 x9, p251z9.s sVar2, C0037p c0037p) {
        super(1);
        this.f335r = 0;
        this.f336s = sVar;
        this.f338u = x9;
        this.f337t = sVar2;
        this.f339v = c0037p;
    }
}
