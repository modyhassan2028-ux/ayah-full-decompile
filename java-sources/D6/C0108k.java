package D6;

/* JADX INFO: renamed from: D6.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0108k implements C8.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0108k f1288a = new C0108k();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C8.c f1289b = C8.c.a("networkType");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C8.c f1290c = C8.c.a("mobileSubtype");

    @Override // C8.a
    public final void a(Object obj, Object obj2) {
        C8.e eVar = (C8.e) obj2;
        w wVar = (w) ((J) obj);
        eVar.a(f1289b, wVar.f1331a);
        eVar.a(f1290c, wVar.f1332b);
    }
}
