package Q8;

/* JADX INFO: renamed from: Q8.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0460g implements C8.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0460g f6992a = new C0460g();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C8.c f6993b = C8.c.a("eventType");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C8.c f6994c = C8.c.a("sessionData");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C8.c f6995d = C8.c.a("applicationInfo");

    @Override // C8.a
    public final void a(Object obj, Object obj2) {
        Q q10 = (Q) obj;
        C8.e eVar = (C8.e) obj2;
        q10.getClass();
        eVar.a(f6993b, EnumC0467n.SESSION_START);
        eVar.a(f6994c, q10.f6910a);
        eVar.a(f6995d, q10.f6911b);
    }
}
