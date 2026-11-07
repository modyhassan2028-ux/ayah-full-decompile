package Q8;

/* JADX INFO: renamed from: Q8.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0461h implements C8.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0461h f7002a = new C0461h();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C8.c f7003b = C8.c.a("sessionId");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C8.c f7004c = C8.c.a("firstSessionId");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C8.c f7005d = C8.c.a("sessionIndex");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final C8.c f7006e = C8.c.a("eventTimestampUs");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final C8.c f7007f = C8.c.a("dataCollectionStatus");
    public static final C8.c g = C8.c.a("firebaseInstallationId");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final C8.c f7008h = C8.c.a("firebaseAuthenticationToken");

    @Override // C8.a
    public final void a(Object obj, Object obj2) {
        Z z10 = (Z) obj;
        C8.e eVar = (C8.e) obj2;
        eVar.a(f7003b, z10.f6935a);
        eVar.a(f7004c, z10.f6936b);
        eVar.e(f7005d, z10.f6937c);
        eVar.d(f7006e, z10.f6938d);
        eVar.a(f7007f, z10.f6939e);
        eVar.a(g, z10.f6940f);
        eVar.a(f7008h, z10.g);
    }
}
