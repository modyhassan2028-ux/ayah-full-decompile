package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
public abstract class C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final B f12374a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final B f12375b;

    static {
        T t2 = T.f12406c;
        B b5 = null;
        try {
            b5 = (B) Class.forName("androidx.datastore.preferences.protobuf.ListFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        f12374a = b5;
        f12375b = new B();
    }
}
