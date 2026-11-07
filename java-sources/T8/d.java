package T8;

import Q8.C0454a;
import Q8.C0455b;
import android.net.Uri;
import java.net.URL;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0455b f7944a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p150o9.h f7945b;

    public d(C0455b c0455b, p150o9.h hVar) {
        p251z9.j.e(c0455b, "appInfo");
        p251z9.j.e(hVar, "blockingDispatcher");
        this.f7944a = c0455b;
        this.f7945b = hVar;
    }

    public static final URL a(d dVar) {
        dVar.getClass();
        Uri.Builder builderAppendPath = new Uri.Builder().scheme("https").authority("firebase-settings.crashlytics.com").appendPath("spi").appendPath("v2").appendPath("platforms").appendPath("android").appendPath("gmp");
        C0455b c0455b = dVar.f7944a;
        Uri.Builder builderAppendPath2 = builderAppendPath.appendPath(c0455b.f6947a).appendPath("settings");
        C0454a c0454a = c0455b.f6948b;
        return new URL(builderAppendPath2.appendQueryParameter("build_version", c0454a.f6943c).appendQueryParameter("display_version", c0454a.f6942b).build().toString());
    }
}
