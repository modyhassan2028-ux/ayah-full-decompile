package p223x;

import A.C0040q0;
import K9.AbstractC0405x;
import K9.InterfaceC0402u;
import p110k9.a;
import p110k9.y;
import p150o9.c;
import p241y9.e;
import p251z9.j;
import q9.i;

/* JADX INFO: loaded from: classes.dex */
public final class T extends i implements e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f23882r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f23883s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f23884t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f23885u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ X f23886v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ q0 f23887w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ float f23888x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T(Object obj, Object obj2, X x9, q0 q0Var, float f3, c cVar) {
        super(2, cVar);
        this.f23884t = obj;
        this.f23885u = obj2;
        this.f23886v = x9;
        this.f23887w = q0Var;
        this.f23888x = f3;
    }

    @Override // q9.a
    public final c create(Object obj, c cVar) {
        T t2 = new T(this.f23884t, this.f23885u, this.f23886v, this.f23887w, this.f23888x, cVar);
        t2.f23883s = obj;
        return t2;
    }

    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) {
        return ((T) create((InterfaceC0402u) obj, (c) obj2)).invokeSuspend(y.f19095a);
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        int i10 = this.f23882r;
        y yVar = y.f19095a;
        X x9 = this.f23886v;
        if (i10 == 0) {
            a.e(obj);
            InterfaceC0402u interfaceC0402u = (InterfaceC0402u) this.f23883s;
            Object obj2 = this.f23884t;
            Object obj3 = this.f23885u;
            c cVar = null;
            if (j.a(obj2, obj3)) {
                x9.f23911E = null;
                if (j.a(x9.f23916t.getValue(), obj2)) {
                    return yVar;
                }
            } else {
                X.p(x9);
            }
            boolean zA = j.a(obj2, obj3);
            float f3 = this.f23888x;
            if (!zA) {
                q0 q0Var = this.f23887w;
                q0Var.p(obj2);
                q0Var.n(0L);
                x9.f23915s.setValue(obj2);
                q0Var.j(f3);
            }
            x9.y(f3);
            if (x9.f23910D.h()) {
                AbstractC0405x.x(interfaceC0402u, null, new C0040q0(x9, cVar, 21), 3);
            } else {
                x9.f23909C = Long.MIN_VALUE;
            }
            this.f23882r = 1;
            Object objT = X.t(x9, this);
            p161p9.a aVar = p161p9.a.f21156r;
            if (objT == aVar) {
                return aVar;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a.e(obj);
        }
        x9.x();
        return yVar;
    }
}
