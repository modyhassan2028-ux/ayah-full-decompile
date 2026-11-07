package U6;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
public abstract class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f8311a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f8312b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f8313c;

    public static void a(boolean z10) {
        if (!z10) {
            throw new IllegalArgumentException();
        }
    }

    public static void b(Handler handler) {
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper != handler.getLooper()) {
            throw new IllegalStateException(p123m2.c.t("Must be called on ", handler.getLooper().getThread().getName(), " thread, but got ", looperMyLooper != null ? looperMyLooper.getThread().getName() : "null current looper", "."));
        }
    }

    public static void c(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Given String is empty or null");
        }
    }

    public static void d(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException(str2);
        }
    }

    public static void e(String str) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            throw new IllegalStateException(str);
        }
    }

    public static void f(Object obj) {
        if (obj == null) {
            throw new NullPointerException("null reference");
        }
    }

    public static void g(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static void h(String str, boolean z10) {
        if (!z10) {
            throw new IllegalStateException(String.valueOf(str));
        }
    }

    public static boolean i(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }
}
