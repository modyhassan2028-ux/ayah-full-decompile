package Y9;

/* JADX INFO: renamed from: Y9.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0665v implements U9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0665v f10553a = new C0665v();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final T f10554b = new T("kotlin.Float", W9.d.g);

    @Override // U9.a
    public final void b(p009aa.n nVar, Object obj) {
        nVar.g(((Number) obj).floatValue());
    }

    @Override // U9.a
    public final Object c(X9.b bVar) {
        return Float.valueOf(bVar.y());
    }

    @Override // U9.a
    public final W9.f d() {
        return f10554b;
    }
}
