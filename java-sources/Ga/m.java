package Ga;

import K9.InterfaceC0402u;

/* JADX INFO: loaded from: classes.dex */
public final class m extends q9.i implements p241y9.e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ boolean f3049r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ A f3050s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f3051t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(boolean z10, A a9, Object obj, p150o9.c cVar) {
        super(2, cVar);
        this.f3049r = z10;
        this.f3050s = a9;
        this.f3051t = obj;
    }

    @Override // q9.a
    public final p150o9.c create(Object obj, p150o9.c cVar) {
        return new m(this.f3049r, this.f3050s, this.f3051t, cVar);
    }

    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) {
        m mVar = (m) create((InterfaceC0402u) obj, (p150o9.c) obj2);
        p110k9.y yVar = p110k9.y.f19095a;
        mVar.invokeSuspend(yVar);
        return yVar;
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        p110k9.a.e(obj);
        boolean z10 = this.f3049r;
        Object obj2 = this.f3051t;
        A a9 = this.f3050s;
        if (z10) {
            a9.f2967q.add(obj2);
        } else {
            a9.f2967q.remove(obj2);
        }
        return p110k9.y.f19095a;
    }
}
