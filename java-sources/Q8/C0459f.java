package Q8;

/* JADX INFO: renamed from: Q8.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0459f implements C8.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0459f f6979a = new C0459f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C8.c f6980b = C8.c.a("processName");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C8.c f6981c = C8.c.a("pid");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C8.c f6982d = C8.c.a("importance");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final C8.c f6983e = C8.c.a("defaultProcess");

    @Override // C8.a
    public final void a(Object obj, Object obj2) {
        G g = (G) obj;
        C8.e eVar = (C8.e) obj2;
        eVar.a(f6980b, g.f6893a);
        eVar.e(f6981c, g.f6894b);
        eVar.e(f6982d, g.f6895c);
        eVar.g(f6983e, g.f6896d);
    }
}
