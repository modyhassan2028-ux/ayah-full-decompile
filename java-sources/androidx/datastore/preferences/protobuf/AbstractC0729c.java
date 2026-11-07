package androidx.datastore.preferences.protobuf;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0729c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Class f12436a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final boolean f12437b;

    static {
        Class<?> cls;
        Class<?> cls2 = null;
        try {
            cls = Class.forName("libcore.io.Memory");
        } catch (Throwable unused) {
            cls = null;
        }
        f12436a = cls;
        try {
            cls2 = Class.forName("org.robolectric.Robolectric");
        } catch (Throwable unused2) {
        }
        f12437b = cls2 != null;
    }

    public static boolean a() {
        return (f12436a == null || f12437b) ? false : true;
    }
}
