package p084i;

import E1.e;
import F2.y;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.AppLocalesMetadataHolderService;
import java.lang.ref.WeakReference;
import p070g8.c;
import u.C1346a;
import u.C1351f;

/* JADX INFO: loaded from: classes.dex */
public abstract class k {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final y f16608r = new y(new c(1));

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static int f16609s = -100;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static e f16610t = null;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static e f16611u = null;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static Boolean f16612v = null;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static boolean f16613w = false;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final C1351f f16614x = new C1351f(0);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final Object f16615y = new Object();

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final Object f16616z = new Object();

    public static boolean c(Context context) {
        if (f16612v == null) {
            try {
                int i10 = AppLocalesMetadataHolderService.f11388r;
                Bundle bundle = context.getPackageManager().getServiceInfo(new ComponentName(context, (Class<?>) AppLocalesMetadataHolderService.class), Build.VERSION.SDK_INT >= 24 ? C.a() | 128 : 640).metaData;
                if (bundle != null) {
                    f16612v = Boolean.valueOf(bundle.getBoolean("autoStoreLocales"));
                }
            } catch (PackageManager.NameNotFoundException unused) {
                Log.d("AppCompatDelegate", "Checking for metadata for AppLocalesMetadataHolderService : Service not found");
                f16612v = Boolean.FALSE;
            }
        }
        return f16612v.booleanValue();
    }

    public static void f(x xVar) {
        synchronized (f16615y) {
            try {
                C1351f c1351f = f16614x;
                c1351f.getClass();
                C1346a c1346a = new C1346a(c1351f);
                while (c1346a.hasNext()) {
                    k kVar = (k) ((WeakReference) c1346a.next()).get();
                    if (kVar == xVar || kVar == null) {
                        c1346a.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void k(int i10) {
        if (i10 != -1 && i10 != 0 && i10 != 1 && i10 != 2 && i10 != 3) {
            Log.d("AppCompatDelegate", "setDefaultNightMode() called with an unknown mode");
            return;
        }
        if (f16609s != i10) {
            f16609s = i10;
            synchronized (f16615y) {
                try {
                    C1351f c1351f = f16614x;
                    c1351f.getClass();
                    C1346a c1346a = new C1346a(c1351f);
                    while (c1346a.hasNext()) {
                        k kVar = (k) ((WeakReference) c1346a.next()).get();
                        if (kVar != null) {
                            ((x) kVar).m(true, true);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public abstract void a();

    public abstract void b();

    public abstract void d();

    public abstract void e();

    public abstract boolean g(int i10);

    public abstract void h(int i10);

    public abstract void i(View view);

    public abstract void j(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void l(CharSequence charSequence);
}
