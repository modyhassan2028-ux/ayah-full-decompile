package p223x;

import A.C0027k;
import K9.AbstractC0405x;
import X.C0641m;
import X.C0643o;
import X.s;
import Z.C0681f0;
import p110k9.a;
import p110k9.y;
import p241y9.c;
import p241y9.g;
import q9.i;

/* JADX INFO: loaded from: classes.dex */
public final class Q extends i implements c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f23873r = 2;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f23874s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f23875t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f23876u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f23877v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q(s sVar, Object obj, g gVar, p150o9.c cVar) {
        super(1, cVar);
        this.f23877v = sVar;
        this.f23876u = obj;
        this.f23875t = gVar;
    }

    @Override // q9.a
    public final p150o9.c create(p150o9.c cVar) {
        switch (this.f23873r) {
            case 0:
                return new Q((q0) this.f23877v, (X) this.f23875t, this.f23876u, cVar);
            case 1:
                return new Q((X) this.f23875t, this.f23876u, (q0) this.f23877v, cVar);
            default:
                return new Q((s) this.f23877v, this.f23876u, (g) this.f23875t, cVar);
        }
    }

    @Override // p241y9.c
    public final Object e(Object obj) {
        p150o9.c cVar = (p150o9.c) obj;
        switch (this.f23873r) {
            case 0:
                break;
            case 1:
                break;
        }
        return ((Q) create(cVar)).invokeSuspend(y.f19095a);
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        float f3;
        switch (this.f23873r) {
            case 0:
                q0 q0Var = (q0) this.f23877v;
                int i10 = this.f23874s;
                if (i10 == 0) {
                    a.e(obj);
                    C0027k c0027k = new C0027k((X) this.f23875t, this.f23876u, q0Var, (p150o9.c) null);
                    this.f23874s = 1;
                    Object objJ = AbstractC0405x.j(c0027k, this);
                    p161p9.a aVar = p161p9.a.f21156r;
                    if (objJ == aVar) {
                        return aVar;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    a.e(obj);
                }
                q0Var.i();
                return y.f19095a;
            case 1:
                q0 q0Var2 = (q0) this.f23877v;
                X x9 = (X) this.f23875t;
                int i11 = this.f23874s;
                if (i11 == 0) {
                    a.e(obj);
                    x9.v();
                    C0681f0 c0681f0 = x9.f23915s;
                    x9.f23909C = Long.MIN_VALUE;
                    x9.y(0.0f);
                    Object value = x9.f23916t.getValue();
                    Object obj2 = this.f23876u;
                    if (obj2.equals(value)) {
                        f3 = -4.0f;
                    } else {
                        f3 = obj2.equals(c0681f0.getValue()) ? -5.0f : -3.0f;
                    }
                    q0Var2.p(obj2);
                    q0Var2.n(0L);
                    c0681f0.setValue(obj2);
                    x9.y(0.0f);
                    x9.l(obj2);
                    q0Var2.j(f3);
                    if (f3 == -3.0f) {
                        this.f23874s = 1;
                        Object objT = X.t(x9, this);
                        p161p9.a aVar2 = p161p9.a.f21156r;
                        if (objT == aVar2) {
                            return aVar2;
                        }
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    a.e(obj);
                }
                q0Var2.i();
                return y.f19095a;
            default:
                s sVar = (s) this.f23877v;
                int i12 = this.f23874s;
                if (i12 == 0) {
                    a.e(obj);
                    sVar.h(this.f23876u);
                    C0643o c0643o = new C0643o(sVar, 1);
                    C0641m c0641m = new C0641m((g) this.f23875t, sVar, null, 2);
                    this.f23874s = 1;
                    Object objA = androidx.compose.material3.internal.a.a(c0643o, c0641m, this);
                    p161p9.a aVar3 = p161p9.a.f21156r;
                    if (objA == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    a.e(obj);
                }
                return y.f19095a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q(X x9, Object obj, q0 q0Var, p150o9.c cVar) {
        super(1, cVar);
        this.f23875t = x9;
        this.f23876u = obj;
        this.f23877v = q0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q(q0 q0Var, X x9, Object obj, p150o9.c cVar) {
        super(1, cVar);
        this.f23877v = q0Var;
        this.f23875t = x9;
        this.f23876u = obj;
    }
}
