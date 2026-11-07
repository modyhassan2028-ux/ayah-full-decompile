package p160p8;

import J8.a;
import J8.d;
import J8.e;
import P9.t;
import T6.k;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Looper;
import android.util.Log;
import j$.util.Objects;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import m8.b;
import p118l7.o;

/* JADX INFO: loaded from: classes.dex */
public final class x {
    public static final Pattern g = Pattern.compile("[^\\p{Alnum}]");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f21144h = Pattern.quote("/");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f21145a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f21146b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f21147c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e f21148d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final k f21149e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public c f21150f;

    public x(Context context, String str, e eVar, k kVar) {
        if (context == null) {
            throw new IllegalArgumentException("appContext must not be null");
        }
        if (str == null) {
            throw new IllegalArgumentException("appIdentifier must not be null");
        }
        this.f21146b = context;
        this.f21147c = str;
        this.f21148d = eVar;
        this.f21149e = kVar;
        this.f21145a = new t();
    }

    public final synchronized String a(SharedPreferences sharedPreferences, String str) {
        String lowerCase;
        lowerCase = g.matcher(UUID.randomUUID().toString()).replaceAll("").toLowerCase(Locale.US);
        String str2 = "Created new Crashlytics installation ID: " + lowerCase + " for FID: " + str;
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", str2, null);
        }
        sharedPreferences.edit().putString("crashlytics.installation.id", lowerCase).putString("firebase.installation.id", str).apply();
        return lowerCase;
    }

    public final w b(boolean z10) {
        String str;
        String str2 = null;
        if (Looper.getMainLooper().isCurrentThread()) {
            String str3 = "Must not be called on a main thread, was called on " + Thread.currentThread().getName() + '.';
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", str3, null);
            }
        }
        e eVar = this.f21148d;
        if (z10) {
            try {
                o oVarF = ((d) eVar).f();
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                str = ((a) p000a.a.m(oVarF, 10000L)).f4387a;
            } catch (Exception e10) {
                Log.w("FirebaseCrashlytics", "Error getting Firebase authentication token.", e10);
                str = null;
            }
        } else {
            str = null;
        }
        try {
            o oVarD = ((d) eVar).d();
            TimeUnit timeUnit2 = TimeUnit.MILLISECONDS;
            str2 = (String) p000a.a.m(oVarD, 10000L);
        } catch (Exception e11) {
            Log.w("FirebaseCrashlytics", "Error getting Firebase installation id.", e11);
        }
        return new w(str2, str);
    }

    public final synchronized c c() {
        String str;
        c cVar = this.f21150f;
        if (cVar != null && (cVar.f21060b != null || !this.f21149e.a())) {
            return this.f21150f;
        }
        b bVar = b.f19690a;
        bVar.c("Determining Crashlytics installation ID...");
        SharedPreferences sharedPreferences = this.f21146b.getSharedPreferences("com.google.firebase.crashlytics", 0);
        String string = sharedPreferences.getString("firebase.installation.id", null);
        bVar.c("Cached Firebase Installation ID: " + string);
        if (this.f21149e.a()) {
            w wVarB = b(false);
            bVar.c("Fetched Firebase Installation ID: " + wVarB.f21142a);
            if (wVarB.f21142a == null) {
                if (string == null) {
                    str = "SYN_" + UUID.randomUUID().toString();
                } else {
                    str = string;
                }
                wVarB = new w(str, null);
            }
            if (Objects.equals(wVarB.f21142a, string)) {
                this.f21150f = new c(sharedPreferences.getString("crashlytics.installation.id", null), wVarB.f21142a, wVarB.f21143b);
            } else {
                this.f21150f = new c(a(sharedPreferences, wVarB.f21142a), wVarB.f21142a, wVarB.f21143b);
            }
        } else if (string == null || !string.startsWith("SYN_")) {
            this.f21150f = new c(a(sharedPreferences, "SYN_" + UUID.randomUUID().toString()), null, null);
        } else {
            this.f21150f = new c(sharedPreferences.getString("crashlytics.installation.id", null), null, null);
        }
        bVar.c("Install IDs: " + this.f21150f);
        return this.f21150f;
    }

    public final String d() {
        String str;
        t tVar = this.f21145a;
        Context context = this.f21146b;
        synchronized (tVar) {
            try {
                if (tVar.f6805s == null) {
                    String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
                    if (installerPackageName == null) {
                        installerPackageName = "";
                    }
                    tVar.f6805s = installerPackageName;
                }
                str = "".equals(tVar.f6805s) ? null : tVar.f6805s;
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }
}
