package K;

import A.C0053x0;
import A.J0;
import K9.AbstractC0405x;
import K9.InterfaceC0402u;

/* JADX INFO: loaded from: classes.dex */
public final class l0 extends q9.i implements p241y9.f {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f4701r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public /* synthetic */ C0053x0 f4702s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public /* synthetic */ long f4703t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0402u f4704u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Z.X f4705v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ B.j f4706w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(InterfaceC0402u interfaceC0402u, Z.X x9, B.j jVar, p150o9.c cVar) {
        super(3, cVar);
        this.f4704u = interfaceC0402u;
        this.f4705v = x9;
        this.f4706w = jVar;
    }

    @Override // p241y9.f
    public final Object d(Object obj, Object obj2, Object obj3) {
        long j = ((p171r0.c) obj2).f21387a;
        Z.X x9 = this.f4705v;
        B.j jVar = this.f4706w;
        l0 l0Var = new l0(this.f4704u, x9, jVar, (p150o9.c) obj3);
        l0Var.f4702s = (C0053x0) obj;
        l0Var.f4703t = j;
        return l0Var.invokeSuspend(p110k9.y.f19095a);
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        int i10 = this.f4701r;
        InterfaceC0402u interfaceC0402u = this.f4704u;
        if (i10 == 0) {
            p110k9.a.e(obj);
            C0053x0 c0053x0 = this.f4702s;
            AbstractC0405x.x(interfaceC0402u, null, new J0(this.f4705v, this.f4703t, this.f4706w, null, 2), 3);
            this.f4701r = 1;
            obj = c0053x0.e(this);
            p161p9.a aVar = p161p9.a.f21156r;
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p110k9.a.e(obj);
        }
        AbstractC0405x.x(interfaceC0402u, null, new G.r(this.f4705v, ((Boolean) obj).booleanValue(), this.f4706w, null), 3);
        return p110k9.y.f19095a;
    }
}
