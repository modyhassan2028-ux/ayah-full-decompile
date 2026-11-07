package D6;

/* JADX INFO: renamed from: D6.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0106i implements C8.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0106i f1273a = new C0106i();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C8.c f1274b = C8.c.a("eventTimeMs");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C8.c f1275c = C8.c.a("eventCode");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C8.c f1276d = C8.c.a("complianceData");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final C8.c f1277e = C8.c.a("eventUptimeMs");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final C8.c f1278f = C8.c.a("sourceExtension");
    public static final C8.c g = C8.c.a("sourceExtensionJsonProto3");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final C8.c f1279h = C8.c.a("timezoneOffsetSeconds");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final C8.c f1280i = C8.c.a("networkConnectionInfo");
    public static final C8.c j = C8.c.a("experimentIds");

    @Override // C8.a
    public final void a(Object obj, Object obj2) {
        C8.e eVar = (C8.e) obj2;
        t tVar = (t) ((F) obj);
        eVar.d(f1274b, tVar.f1316a);
        eVar.a(f1275c, tVar.f1317b);
        eVar.a(f1276d, tVar.f1318c);
        eVar.d(f1277e, tVar.f1319d);
        eVar.a(f1278f, tVar.f1320e);
        eVar.a(g, tVar.f1321f);
        eVar.d(f1279h, tVar.g);
        eVar.a(f1280i, tVar.f1322h);
        eVar.a(j, tVar.f1323i);
    }
}
