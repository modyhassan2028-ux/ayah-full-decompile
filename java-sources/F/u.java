package F;

import A.C0;
import A.C0040q0;
import A.X0;
import G.S;
import G.V;
import K9.AbstractC0405x;
import K9.H;
import K9.InterfaceC0402u;
import N9.k0;
import p151p.C1256n;
import p207v2.Y;

/* JADX INFO: loaded from: classes.dex */
public final class u extends q9.i implements p241y9.e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f2130r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f2131s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f2132t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Object f2133u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f2134v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(int i10, int i11, Object obj, p150o9.c cVar) {
        super(2, cVar);
        this.f2130r = i11;
        this.f2134v = obj;
        this.f2132t = i10;
    }

    @Override // q9.a
    public final p150o9.c create(Object obj, p150o9.c cVar) {
        switch (this.f2130r) {
            case 0:
                u uVar = new u(this.f2132t, 0, (A) this.f2134v, cVar);
                uVar.f2133u = obj;
                return uVar;
            case 1:
                return new u((F4.f) this.f2133u, this.f2132t, (Y) this.f2134v, cVar, 1);
            case 2:
                return new u((F4.f) this.f2133u, this.f2132t, (Y) this.f2134v, cVar, 2);
            case 3:
                return new u(this.f2132t, 3, (G5.j) this.f2134v, cVar);
            case 4:
                return new u(this.f2132t, 4, (p027c6.f) this.f2134v, cVar);
            default:
                return new u((p237y4.e) this.f2133u, this.f2132t, (String) this.f2134v, cVar, 5);
        }
    }

    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f2130r) {
            case 0:
                return ((u) create((C0) obj, (p150o9.c) obj2)).invokeSuspend(p110k9.y.f19095a);
            case 1:
                return ((u) create((InterfaceC0402u) obj, (p150o9.c) obj2)).invokeSuspend(p110k9.y.f19095a);
            case 2:
                return ((u) create((InterfaceC0402u) obj, (p150o9.c) obj2)).invokeSuspend(p110k9.y.f19095a);
            case 3:
                return ((u) create((InterfaceC0402u) obj, (p150o9.c) obj2)).invokeSuspend(p110k9.y.f19095a);
            case 4:
                return ((u) create((InterfaceC0402u) obj, (p150o9.c) obj2)).invokeSuspend(p110k9.y.f19095a);
            default:
                return ((u) create((InterfaceC0402u) obj, (p150o9.c) obj2)).invokeSuspend(p110k9.y.f19095a);
        }
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        k0 k0Var;
        k0 k0Var2;
        int i10 = this.f2130r;
        p110k9.y yVar = p110k9.y.f19095a;
        int i11 = this.f2132t;
        Object obj2 = this.f2134v;
        p161p9.a aVar = p161p9.a.f21156r;
        int i12 = 1;
        switch (i10) {
            case 0:
                int i13 = this.f2131s;
                if (i13 != 0) {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p110k9.a.e(obj);
                    return yVar;
                }
                p110k9.a.e(obj);
                A a9 = (A) obj2;
                X0 x9 = new X0(i12, (C0) this.f2133u, a9);
                p063g1.c cVar = ((r) a9.f2013e.getValue()).f2102i;
                this.f2131s = 1;
                return S.b(x9, i11, 100, cVar, this) == aVar ? aVar : yVar;
            case 1:
                int i14 = this.f2131s;
                if (i14 != 0) {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p110k9.a.e(obj);
                    return obj;
                }
                p110k9.a.e(obj);
                C1256n c1256n = (C1256n) ((F4.f) this.f2133u).f2395c;
                int i15 = ((Y) obj2).f23194a;
                this.f2131s = 1;
                int i16 = this.f2132t;
                int i17 = i16 + i15;
                c1256n.getClass();
                R9.e eVar = H.f5322a;
                Object objI = AbstractC0405x.I(R9.d.f7436t, new V(i16, i17, c1256n, null, 5), this);
                return objI == aVar ? aVar : objI;
            case 2:
                int i18 = this.f2131s;
                if (i18 != 0) {
                    if (i18 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p110k9.a.e(obj);
                    return obj;
                }
                p110k9.a.e(obj);
                p218w3.f fVar = (p218w3.f) ((F4.f) this.f2133u).f2395c;
                int i19 = ((Y) obj2).f23194a;
                this.f2131s = 1;
                fVar.getClass();
                R9.e eVar2 = H.f5322a;
                Object objI2 = AbstractC0405x.I(R9.d.f7436t, new V(this.f2132t, i19, fVar, null, 6), this);
                return objI2 == aVar ? aVar : objI2;
            case 3:
                int i20 = this.f2131s;
                if (i20 == 0) {
                    p110k9.a.e(obj);
                    G5.j jVar = (G5.j) obj2;
                    k0Var = jVar.f2907h;
                    p218w3.f fVar2 = jVar.f2902b;
                    this.f2133u = k0Var;
                    this.f2131s = 1;
                    obj = fVar2.a(i11, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i20 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    k0Var = (k0) this.f2133u;
                    p110k9.a.e(obj);
                }
                k0Var.m(obj);
                return yVar;
            case 4:
                int i21 = this.f2131s;
                if (i21 == 0) {
                    p110k9.a.e(obj);
                    p027c6.f fVar3 = (p027c6.f) obj2;
                    k0Var2 = fVar3.f13529i;
                    p218w3.f fVar4 = fVar3.f13524c;
                    this.f2133u = k0Var2;
                    this.f2131s = 1;
                    obj = fVar4.a(i11, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i21 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    k0Var2 = (k0) this.f2133u;
                    p110k9.a.e(obj);
                }
                k0Var2.m(obj);
                return yVar;
            default:
                int i22 = this.f2131s;
                if (i22 != 0) {
                    if (i22 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p110k9.a.e(obj);
                    return obj;
                }
                p110k9.a.e(obj);
                this.f2131s = 1;
                R9.e eVar3 = H.f5322a;
                Object objI3 = AbstractC0405x.I(R9.d.f7436t, new C0040q0(i11, 17, (String) obj2, null), this);
                return objI3 == aVar ? aVar : objI3;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(Object obj, int i10, Object obj2, p150o9.c cVar, int i11) {
        super(2, cVar);
        this.f2130r = i11;
        this.f2133u = obj;
        this.f2132t = i10;
        this.f2134v = obj2;
    }
}
