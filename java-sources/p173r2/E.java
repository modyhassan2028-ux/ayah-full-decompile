package p173r2;

import android.os.Bundle;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public abstract class E {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1284d f21427a = new C1284d(1, false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C1284d f21428b = new C1284d(2, false);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C1284d f21429c = new C1284d(0, false);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C1284d f21430d = new C1284d(3, true);

    public abstract Object a(String str, Bundle bundle);

    public abstract String b();

    public Object c(Object obj, String str) {
        return d(str);
    }

    public abstract Object d(String str);

    public abstract void e(Bundle bundle, String str, Object obj);

    public boolean f(Object obj, Object obj2) {
        return j.a(obj, obj2);
    }

    public final String toString() {
        return b();
    }
}
