package K9;

/* JADX INFO: renamed from: K9.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0407z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final B f5419a;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [L9.d] */
    /* JADX WARN: Type inference failed for: r0v7, types: [K9.y] */
    /* JADX WARN: Type inference failed for: r0v8, types: [K9.B] */
    /* JADX WARN: Type inference failed for: r0v9, types: [K9.y] */
    static {
        String property;
        ?? r10;
        int i10 = P9.u.f6806a;
        try {
            property = System.getProperty("kotlinx.coroutines.main.delay");
        } catch (SecurityException unused) {
            property = null;
        }
        if (property != null ? Boolean.parseBoolean(property) : false) {
            R9.e eVar = H.f5322a;
            r10 = P9.n.f6798a;
            L9.d dVar = r10.f5585w;
            if (!(r10 != 0)) {
                r10 = RunnableC0406y.f5416A;
            }
        } else {
            r10 = RunnableC0406y.f5416A;
        }
        f5419a = r10;
    }
}
