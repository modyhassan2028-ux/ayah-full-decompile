package D6;

/* JADX INFO: renamed from: D6.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0103f implements C8.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0103f f1266a = new C0103f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C8.c f1267b = C8.c.a("clearBlob");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C8.c f1268c = C8.c.a("encryptedBlob");

    @Override // C8.a
    public final void a(Object obj, Object obj2) {
        C8.e eVar = (C8.e) obj2;
        p pVar = (p) ((C) obj);
        eVar.a(f1267b, pVar.f1304a);
        eVar.a(f1268c, pVar.f1305b);
    }
}
