package Y9;

/* JADX INFO: loaded from: classes.dex */
public final class Y implements U9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Y f10493a = new Y();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final T f10494b = new T("kotlin.Short", W9.d.j);

    @Override // U9.a
    public final void b(p009aa.n nVar, Object obj) {
        nVar.q(((Number) obj).shortValue());
    }

    @Override // U9.a
    public final Object c(X9.b bVar) {
        return Short.valueOf(bVar.v());
    }

    @Override // U9.a
    public final W9.f d() {
        return f10494b;
    }
}
