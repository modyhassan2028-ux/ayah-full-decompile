package Y6;

import R6.h;
import R6.i;
import android.app.AppOpsManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final char[] f10438a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final char[] f10439b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Boolean f10440c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static Boolean f10441d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static Boolean f10442e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static Boolean f10443f;

    public static boolean a() {
        return Build.VERSION.SDK_INT >= 26;
    }

    public static boolean b(Context context, int i10) {
        if (e(i10, context, "com.google.android.gms")) {
            try {
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.google.android.gms", 64);
                i iVarA = i.a(context);
                iVarA.getClass();
                if (packageInfo != null) {
                    if (!i.d(packageInfo, false)) {
                        if (i.d(packageInfo, true)) {
                            if (!h.a((Context) iVarA.f7253a)) {
                                Log.w("GoogleSignatureVerifier", "Test-keys aren't accepted on this build.");
                            }
                        }
                    }
                    return true;
                }
                return false;
            } catch (PackageManager.NameNotFoundException unused) {
                if (Log.isLoggable("UidVerifier", 3)) {
                    Log.d("UidVerifier", "Package manager can't find google play services package, defaulting to false");
                }
            }
        }
        return false;
    }

    public static boolean c(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (f10440c == null) {
            f10440c = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        return f10440c.booleanValue();
    }

    public static boolean d(Context context) {
        if (c(context) && Build.VERSION.SDK_INT < 24) {
            return true;
        }
        if (f10441d == null) {
            f10441d = Boolean.valueOf(context.getPackageManager().hasSystemFeature("cn.google"));
        }
        if (f10441d.booleanValue()) {
            return !a() || Build.VERSION.SDK_INT >= 30;
        }
        return false;
    }

    public static boolean e(int i10, Context context, String str) {
        N0.a aVarA = Z6.b.a(context);
        aVarA.getClass();
        try {
            AppOpsManager appOpsManager = (AppOpsManager) ((Context) aVarA.f5961a).getSystemService("appops");
            if (appOpsManager == null) {
                throw new NullPointerException("context.getSystemService(Context.APP_OPS_SERVICE) is null");
            }
            appOpsManager.checkPackage(i10, str);
            return true;
        } catch (SecurityException unused) {
            return false;
        }
    }
}
