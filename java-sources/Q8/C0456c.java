package Q8;

import android.os.Build;

/* JADX INFO: renamed from: Q8.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0456c implements C8.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0456c f6952a = new C0456c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C8.c f6953b = C8.c.a("packageName");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C8.c f6954c = C8.c.a("versionName");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C8.c f6955d = C8.c.a("appBuildVersion");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final C8.c f6956e = C8.c.a("deviceManufacturer");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final C8.c f6957f = C8.c.a("currentProcessDetails");
    public static final C8.c g = C8.c.a("appProcessDetails");

    @Override // C8.a
    public final void a(Object obj, Object obj2) {
        C0454a c0454a = (C0454a) obj;
        C8.e eVar = (C8.e) obj2;
        eVar.a(f6953b, c0454a.f6941a);
        eVar.a(f6954c, c0454a.f6942b);
        eVar.a(f6955d, c0454a.f6943c);
        eVar.a(f6956e, Build.MANUFACTURER);
        eVar.a(f6957f, c0454a.f6944d);
        eVar.a(g, c0454a.f6945e);
    }
}
