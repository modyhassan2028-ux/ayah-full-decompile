package Y9;

import java.util.Iterator;

/* JADX INFO: renamed from: Y9.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0658n extends AbstractC0645a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final U9.a f10535a;

    public AbstractC0658n(U9.a aVar) {
        this.f10535a = aVar;
    }

    @Override // U9.a
    public void b(p009aa.n nVar, Object obj) {
        int iH = h(obj);
        W9.f fVarD = d();
        p251z9.j.e(fVarD, "descriptor");
        p009aa.n nVarA = nVar.a(fVarD);
        Iterator itG = g(obj);
        for (int i10 = 0; i10 < iH; i10++) {
            nVarA.o(d(), i10, this.f10535a, itG.next());
        }
        nVarA.t(fVarD);
    }

    @Override // Y9.AbstractC0645a
    public void j(X9.a aVar, int i10, Object obj) {
        m(i10, obj, aVar.f(d(), i10, this.f10535a, null));
    }

    public abstract void m(int i10, Object obj, Object obj2);
}
