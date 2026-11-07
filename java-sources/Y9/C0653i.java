package Y9;

/* JADX INFO: renamed from: Y9.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0653i implements U9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0653i f10519a = new C0653i();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final T f10520b = new T("kotlin.Byte", W9.d.f9662d);

    @Override // U9.a
    public final void b(p009aa.n nVar, Object obj) {
        nVar.c(((Number) obj).byteValue());
    }

    @Override // U9.a
    public final Object c(X9.b bVar) {
        return Byte.valueOf(bVar.r());
    }

    @Override // U9.a
    public final W9.f d() {
        return f10520b;
    }
}
