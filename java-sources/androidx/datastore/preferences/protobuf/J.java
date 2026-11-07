package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
public abstract class J {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final I f12385a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final I f12386b;

    static {
        T t2 = T.f12406c;
        I i10 = null;
        try {
            i10 = (I) Class.forName("androidx.datastore.preferences.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        f12385a = i10;
        f12386b = new I();
    }
}
