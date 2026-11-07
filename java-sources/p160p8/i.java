package p160p8;

import F1.b;
import android.util.Log;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final h f21073d = new h(0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b f21074e = new b(5);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p213v8.b f21075a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f21076b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f21077c = null;

    public i(p213v8.b bVar) {
        this.f21075a = bVar;
    }

    public static void a(p213v8.b bVar, String str, String str2) {
        if (str == null || str2 == null) {
            return;
        }
        try {
            bVar.b(str, "aqs.".concat(str2)).createNewFile();
        } catch (IOException e10) {
            Log.w("FirebaseCrashlytics", "Failed to persist App Quality Sessions session id.", e10);
        }
    }
}
