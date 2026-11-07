package Y9;

/* JADX INFO: renamed from: Y9.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0657m implements U9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0657m f10531a = new C0657m();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final T f10532b = new T("kotlin.Char", W9.d.f9663e);

    @Override // U9.a
    public final void b(p009aa.n nVar, Object obj) {
        nVar.d(((Character) obj).charValue());
    }

    @Override // U9.a
    public final Object c(X9.b bVar) {
        return Character.valueOf(bVar.i());
    }

    @Override // U9.a
    public final W9.f d() {
        return f10532b;
    }
}
