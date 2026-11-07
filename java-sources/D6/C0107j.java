package D6;

/* JADX INFO: renamed from: D6.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0107j implements C8.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0107j f1281a = new C0107j();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C8.c f1282b = C8.c.a("requestTimeMs");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C8.c f1283c = C8.c.a("requestUptimeMs");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C8.c f1284d = C8.c.a("clientInfo");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final C8.c f1285e = C8.c.a("logSource");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final C8.c f1286f = C8.c.a("logSourceName");
    public static final C8.c g = C8.c.a("logEvent");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final C8.c f1287h = C8.c.a("qosTier");

    @Override // C8.a
    public final void a(Object obj, Object obj2) {
        C8.e eVar = (C8.e) obj2;
        u uVar = (u) ((G) obj);
        eVar.d(f1282b, uVar.f1324a);
        eVar.d(f1283c, uVar.f1325b);
        eVar.a(f1284d, uVar.f1326c);
        eVar.a(f1285e, uVar.f1327d);
        eVar.a(f1286f, uVar.f1328e);
        eVar.a(g, uVar.f1329f);
        eVar.a(f1287h, K.f1245r);
    }
}
