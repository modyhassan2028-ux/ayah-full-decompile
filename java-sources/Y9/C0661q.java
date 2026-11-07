package Y9;

/* JADX INFO: renamed from: Y9.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0661q implements U9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0661q f10541a = new C0661q();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final T f10542b = new T("kotlin.Double", W9.d.f9664f);

    @Override // U9.a
    public final void b(p009aa.n nVar, Object obj) {
        nVar.e(((Number) obj).doubleValue());
    }

    @Override // U9.a
    public final Object c(X9.b bVar) {
        return Double.valueOf(bVar.B());
    }

    @Override // U9.a
    public final W9.f d() {
        return f10542b;
    }
}
