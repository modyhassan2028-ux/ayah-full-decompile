package G;

/* JADX INFO: loaded from: classes.dex */
public final class B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p085i0.c f2564a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final F.k f2565b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u.E f2566c;

    public B(p085i0.c cVar, F.k kVar) {
        this.f2564a = cVar;
        this.f2565b = kVar;
        long[] jArr = u.M.f22699a;
        this.f2566c = new u.E();
    }

    public final p241y9.e a(int i10, Object obj, Object obj2) {
        u.E e10 = this.f2566c;
        A a9 = (A) e10.g(obj);
        if (a9 != null && a9.f2561c == i10 && p251z9.j.a(a9.f2560b, obj2)) {
            p074h0.d dVar = a9.f2562d;
            if (dVar != null) {
                return dVar;
            }
            p074h0.d dVar2 = new p074h0.d(1403994769, new A.K(2, a9.f2563e, a9), true);
            a9.f2562d = dVar2;
            return dVar2;
        }
        A a10 = new A(this, i10, obj, obj2);
        e10.l(obj, a10);
        p074h0.d dVar3 = a10.f2562d;
        if (dVar3 != null) {
            return dVar3;
        }
        p074h0.d dVar4 = new p074h0.d(1403994769, new A.K(2, this, a10), true);
        a10.f2562d = dVar4;
        return dVar4;
    }

    public final Object b(Object obj) {
        if (obj == null) {
            return null;
        }
        A a9 = (A) this.f2566c.g(obj);
        if (a9 != null) {
            return a9.f2560b;
        }
        F.i iVar = (F.i) this.f2565b.invoke();
        int iF = iVar.f2057d.f(obj);
        if (iF != -1) {
            return iVar.a(iF);
        }
        return null;
    }
}
