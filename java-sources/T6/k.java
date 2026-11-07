package T6;

import U6.InterfaceC0526d;
import U6.y;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public final class k implements InterfaceC0526d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f7842a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f7843b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f7844c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f7845d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f7846e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f7847f;

    public k(d dVar, S6.a aVar, a aVar2) {
        this.f7847f = dVar;
        this.f7845d = null;
        this.f7846e = null;
        this.f7842a = false;
        this.f7843b = aVar;
        this.f7844c = aVar2;
    }

    public synchronized boolean a() {
        boolean zG;
        Boolean bool = (Boolean) this.f7846e;
        if (bool != null) {
            zG = bool.booleanValue();
        } else {
            try {
                zG = ((p050e8.f) this.f7843b).g();
            } catch (IllegalStateException unused) {
                zG = false;
            }
        }
        c(zG);
        return zG;
    }

    @Override // U6.InterfaceC0526d
    public void b(R6.b bVar) {
        ((d) this.f7847f).f7828m.post(new p039d8.a(7, this, bVar, false));
    }

    public void c(boolean z10) {
        String str;
        String str2 = z10 ? "ENABLED" : "DISABLED";
        if (((Boolean) this.f7846e) == null) {
            str = "global Firebase setting";
        } else {
            str = this.f7842a ? "firebase_crashlytics_collection_enabled manifest flag" : "API";
        }
        String strT = p123m2.c.t("Crashlytics automatic data collection ", str2, " by ", str, ".");
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", strT, null);
        }
    }

    public void d(R6.b bVar) {
        i iVar = (i) ((d) this.f7847f).j.get((a) this.f7844c);
        if (iVar != null) {
            y.b(iVar.f7839p.f7828m);
            S6.a aVar = iVar.g;
            aVar.e("onSignInFailed for " + aVar.getClass().getName() + " with " + String.valueOf(bVar));
            iVar.o(bVar, null);
        }
    }

    public k(p050e8.f fVar) {
        Boolean boolValueOf;
        Boolean boolValueOf2;
        ApplicationInfo applicationInfo;
        Bundle bundle;
        this.f7844c = new Object();
        this.f7845d = new p118l7.i();
        this.f7842a = false;
        this.f7847f = new p118l7.i();
        fVar.a();
        Context context = fVar.f15843a;
        this.f7843b = fVar;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.firebase.crashlytics", 0);
        if (sharedPreferences.contains("firebase_crashlytics_collection_enabled")) {
            this.f7842a = false;
            boolValueOf = Boolean.valueOf(sharedPreferences.getBoolean("firebase_crashlytics_collection_enabled", true));
        } else {
            boolValueOf = null;
        }
        if (boolValueOf == null) {
            try {
                PackageManager packageManager = context.getPackageManager();
                boolValueOf2 = (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_crashlytics_collection_enabled")) ? null : Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_crashlytics_collection_enabled"));
            } catch (PackageManager.NameNotFoundException e10) {
                Log.e("FirebaseCrashlytics", "Could not read data collection permission from manifest", e10);
            }
            if (boolValueOf2 == null) {
                this.f7842a = false;
                boolValueOf = null;
            } else {
                this.f7842a = true;
                boolValueOf = Boolean.valueOf(Boolean.TRUE.equals(boolValueOf2));
            }
        }
        this.f7846e = boolValueOf;
        synchronized (this.f7844c) {
            try {
                if (a()) {
                    ((p118l7.i) this.f7845d).b(null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
