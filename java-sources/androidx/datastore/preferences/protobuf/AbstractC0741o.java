package androidx.datastore.preferences.protobuf;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0741o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0740n f12488a = new C0740n();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0740n f12489b;

    static {
        T t2 = T.f12406c;
        C0740n c0740n = null;
        try {
            c0740n = (C0740n) Class.forName("androidx.datastore.preferences.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        f12489b = c0740n;
    }
}
