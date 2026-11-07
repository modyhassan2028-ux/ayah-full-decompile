package R6;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Log;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public abstract class h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f7248b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f7249c = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f7251e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AtomicBoolean f7247a = new AtomicBoolean();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final AtomicBoolean f7250d = new AtomicBoolean();

    public static boolean a(Context context) {
        try {
            if (!f7249c) {
                PackageInfo packageInfoB = Z6.b.a(context).b(64, "com.google.android.gms");
                i.a(context);
                if (packageInfoB == null || i.d(packageInfoB, false) || !i.d(packageInfoB, true)) {
                    f7248b = false;
                } else {
                    f7248b = true;
                }
            }
        } catch (PackageManager.NameNotFoundException e10) {
            Log.w("GooglePlayServicesUtil", "Cannot find Google Play services package name.", e10);
        } finally {
            f7249c = true;
        }
        return f7248b || !"user".equals(Build.TYPE);
    }
}
