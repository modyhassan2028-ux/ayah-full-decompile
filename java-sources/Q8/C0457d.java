package Q8;

import android.os.Build;

/* JADX INFO: renamed from: Q8.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0457d implements C8.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0457d f6961a = new C0457d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C8.c f6962b = C8.c.a("appId");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C8.c f6963c = C8.c.a("deviceModel");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C8.c f6964d = C8.c.a("sessionSdkVersion");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final C8.c f6965e = C8.c.a("osVersion");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final C8.c f6966f = C8.c.a("logEnvironment");
    public static final C8.c g = C8.c.a("androidAppInfo");

    @Override // C8.a
    public final void a(Object obj, Object obj2) {
        C0455b c0455b = (C0455b) obj;
        C8.e eVar = (C8.e) obj2;
        eVar.a(f6962b, c0455b.f6947a);
        eVar.a(f6963c, Build.MODEL);
        eVar.a(f6964d, "3.0.0");
        eVar.a(f6965e, Build.VERSION.RELEASE);
        eVar.a(f6966f, A.LOG_ENVIRONMENT_PROD);
        eVar.a(g, c0455b.f6948b);
    }
}
