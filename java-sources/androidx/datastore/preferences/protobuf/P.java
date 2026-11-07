package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
public abstract class P {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final O f12404a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final O f12405b;

    static {
        T t2 = T.f12406c;
        O o10 = null;
        try {
            o10 = (O) Class.forName("androidx.datastore.preferences.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        f12404a = o10;
        f12405b = new O();
    }
}
