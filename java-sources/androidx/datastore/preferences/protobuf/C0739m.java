package androidx.datastore.preferences.protobuf;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0739m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile C0739m f12485a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0739m f12486b;

    static {
        C0739m c0739m = new C0739m();
        Map map = Collections.EMPTY_MAP;
        f12486b = c0739m;
    }

    public static C0739m a() {
        C0739m c0739m;
        T t2 = T.f12406c;
        C0739m c0739m2 = f12485a;
        if (c0739m2 != null) {
            return c0739m2;
        }
        synchronized (C0739m.class) {
            try {
                c0739m = f12485a;
                if (c0739m == null) {
                    Class cls = AbstractC0738l.f12484a;
                    C0739m c0739m3 = null;
                    if (cls != null) {
                        try {
                            c0739m3 = (C0739m) cls.getDeclaredMethod("getEmptyRegistry", null).invoke(null, null);
                        } catch (Exception unused) {
                        }
                    }
                    c0739m = c0739m3 != null ? c0739m3 : f12486b;
                    f12485a = c0739m;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c0739m;
    }
}
