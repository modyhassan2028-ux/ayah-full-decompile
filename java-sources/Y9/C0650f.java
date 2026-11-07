package Y9;

/* JADX INFO: renamed from: Y9.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0650f implements U9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0650f f10509a = new C0650f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final T f10510b = new T("kotlin.Boolean", W9.d.f9661c);

    @Override // U9.a
    public final void b(p009aa.n nVar, Object obj) {
        nVar.b(((Boolean) obj).booleanValue());
    }

    @Override // U9.a
    public final Object c(X9.b bVar) {
        return Boolean.valueOf(bVar.e());
    }

    @Override // U9.a
    public final W9.f d() {
        return f10510b;
    }
}
