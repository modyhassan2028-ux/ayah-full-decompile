package Y9;

/* JADX INFO: loaded from: classes.dex */
public final class K implements U9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final U9.a f10466a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final V f10467b;

    public K(U9.a aVar) {
        p251z9.j.e(aVar, "serializer");
        this.f10466a = aVar;
        this.f10467b = new V(aVar.d());
    }

    @Override // U9.a
    public final void b(p009aa.n nVar, Object obj) {
        if (obj != null) {
            nVar.p(this.f10466a, obj);
        } else {
            nVar.m();
        }
    }

    @Override // U9.a
    public final Object c(X9.b bVar) {
        if (bVar.g()) {
            return bVar.c(this.f10466a);
        }
        return null;
    }

    @Override // U9.a
    public final W9.f d() {
        return this.f10467b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && K.class == obj.getClass() && p251z9.j.a(this.f10466a, ((K) obj).f10466a);
    }

    public final int hashCode() {
        return this.f10466a.hashCode();
    }
}
