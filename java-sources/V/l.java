package V;

import D0.y;
import K9.AbstractC0405x;
import K9.InterfaceC0402u;
import Z.C0672b;
import p223x.AbstractC1413d;
import p223x.C1411c;
import p223x.InterfaceC1421j;
import p223x.L;
import p223x.Q;
import p223x.X;
import p223x.o0;
import p223x.q0;

/* JADX INFO: loaded from: classes.dex */
public final class l extends q9.i implements p241y9.e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f8357r = 1;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f8358s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public float f8359t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f8360u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f8361v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(float f3, X x9, p173r2.j jVar, p150o9.c cVar) {
        super(2, cVar);
        this.f8359t = f3;
        this.f8360u = x9;
        this.f8361v = jVar;
    }

    @Override // q9.a
    public final p150o9.c create(Object obj, p150o9.c cVar) {
        switch (this.f8357r) {
            case 0:
                return new l((y) this.f8360u, this.f8359t, (InterfaceC1421j) this.f8361v, cVar);
            case 1:
                return new l(this.f8359t, (X) this.f8360u, (p173r2.j) this.f8361v, cVar);
            default:
                l lVar = new l((q0) this.f8361v, cVar);
                lVar.f8360u = obj;
                return lVar;
        }
    }

    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC0402u interfaceC0402u = (InterfaceC0402u) obj;
        p150o9.c cVar = (p150o9.c) obj2;
        switch (this.f8357r) {
            case 0:
                break;
            case 1:
                break;
        }
        return ((l) create(interfaceC0402u, cVar)).invokeSuspend(p110k9.y.f19095a);
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        Object objA;
        float fM;
        InterfaceC0402u interfaceC0402u;
        switch (this.f8357r) {
            case 0:
                int i10 = this.f8358s;
                if (i10 == 0) {
                    p110k9.a.e(obj);
                    C1411c c1411c = (C1411c) ((y) this.f8360u).f1159t;
                    Float f3 = new Float(this.f8359t);
                    InterfaceC1421j interfaceC1421j = (InterfaceC1421j) this.f8361v;
                    this.f8358s = 1;
                    Object objC = C1411c.c(c1411c, f3, interfaceC1421j, null, this, 12);
                    p161p9.a aVar = p161p9.a.f21156r;
                    if (objC == aVar) {
                        return aVar;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p110k9.a.e(obj);
                }
                return p110k9.y.f19095a;
            case 1:
                X x9 = (X) this.f8360u;
                float f7 = this.f8359t;
                int i11 = this.f8358s;
                p110k9.y yVar = p110k9.y.f19095a;
                p161p9.a aVar2 = p161p9.a.f21156r;
                if (i11 == 0) {
                    p110k9.a.e(obj);
                    if (f7 > 0.0f) {
                        this.f8358s = 1;
                        if (x9.w(f7, x9.f23915s.getValue(), this) != aVar2) {
                        }
                    }
                    return aVar2;
                }
                if (i11 != 1) {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p110k9.a.e(obj);
                    return yVar;
                }
                p110k9.a.e(obj);
                if (f7 != 0.0f) {
                    return yVar;
                }
                p173r2.j jVar = (p173r2.j) this.f8361v;
                this.f8358s = 2;
                q0 q0Var = x9.f23918v;
                if (q0Var == null || ((p251z9.j.a(x9.f23916t.getValue(), jVar) && p251z9.j.a(x9.f23915s.getValue(), jVar)) || (objA = L.a(x9.f23908B, new Q(x9, jVar, q0Var, (p150o9.c) null), this)) != aVar2)) {
                    objA = yVar;
                }
                if (objA != aVar2) {
                    return yVar;
                }
                return aVar2;
            default:
                int i12 = this.f8358s;
                if (i12 == 0) {
                    p110k9.a.e(obj);
                    InterfaceC0402u interfaceC0402u2 = (InterfaceC0402u) this.f8360u;
                    fM = AbstractC1413d.m(interfaceC0402u2.getCoroutineContext());
                    interfaceC0402u = interfaceC0402u2;
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    fM = this.f8359t;
                    interfaceC0402u = (InterfaceC0402u) this.f8360u;
                    p110k9.a.e(obj);
                }
                while (AbstractC0405x.u(interfaceC0402u)) {
                    o0 o0Var = new o0((q0) this.f8361v, fM);
                    this.f8360u = interfaceC0402u;
                    this.f8359t = fM;
                    this.f8358s = 1;
                    Object objB0 = C0672b.p(getContext()).b0(o0Var, this);
                    p161p9.a aVar3 = p161p9.a.f21156r;
                    if (objB0 == aVar3) {
                        return aVar3;
                    }
                }
                return p110k9.y.f19095a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(y yVar, float f3, InterfaceC1421j interfaceC1421j, p150o9.c cVar) {
        super(2, cVar);
        this.f8360u = yVar;
        this.f8359t = f3;
        this.f8361v = interfaceC1421j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(q0 q0Var, p150o9.c cVar) {
        super(2, cVar);
        this.f8361v = q0Var;
    }
}
