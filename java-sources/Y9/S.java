package Y9;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class S extends AbstractC0658n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Q f10483b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S(U9.a aVar) {
        super(aVar);
        p251z9.j.e(aVar, "primitiveSerializer");
        this.f10483b = new Q(aVar.d());
    }

    @Override // Y9.AbstractC0658n, U9.a
    public final void b(p009aa.n nVar, Object obj) {
        int iH = h(obj);
        Q q10 = this.f10483b;
        p251z9.j.e(q10, "descriptor");
        p009aa.n nVarA = nVar.a(q10);
        o(nVarA, obj, iH);
        nVarA.t(q10);
    }

    @Override // Y9.AbstractC0645a, U9.a
    public final Object c(X9.b bVar) {
        return i(bVar);
    }

    @Override // U9.a
    public final W9.f d() {
        return this.f10483b;
    }

    @Override // Y9.AbstractC0645a
    public final Object e() {
        return (P) k(n());
    }

    @Override // Y9.AbstractC0645a
    public final int f(Object obj) {
        P p10 = (P) obj;
        p251z9.j.e(p10, "<this>");
        return p10.d();
    }

    @Override // Y9.AbstractC0645a
    public final Iterator g(Object obj) {
        throw new IllegalStateException("This method lead to boxing and must not be used, use writeContents instead");
    }

    @Override // Y9.AbstractC0645a
    public final Object l(Object obj) {
        P p10 = (P) obj;
        p251z9.j.e(p10, "<this>");
        return p10.a();
    }

    @Override // Y9.AbstractC0658n
    public final void m(int i10, Object obj, Object obj2) {
        p251z9.j.e((P) obj, "<this>");
        throw new IllegalStateException("This method lead to boxing and must not be used, use Builder.append instead");
    }

    public abstract Object n();

    public abstract void o(p009aa.n nVar, Object obj, int i10);
}
