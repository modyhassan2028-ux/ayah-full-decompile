package Q8;

/* JADX INFO: renamed from: Q8.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0458e implements C8.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0458e f6970a = new C0458e();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C8.c f6971b = C8.c.a("performance");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C8.c f6972c = C8.c.a("crashlytics");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C8.c f6973d = C8.c.a("sessionSamplingRate");

    @Override // C8.a
    public final void a(Object obj, Object obj2) {
        C0464k c0464k = (C0464k) obj;
        C8.e eVar = (C8.e) obj2;
        eVar.a(f6971b, c0464k.f7032a);
        eVar.a(f6972c, c0464k.f7033b);
        eVar.f(f6973d, c0464k.f7034c);
    }
}
