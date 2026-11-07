package E6;

import j$.util.DesugarCollections;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class b implements C8.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f1906a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C8.c f1907b;

    static {
        F8.a aVar = new F8.a(1);
        HashMap map = new HashMap();
        map.put(F8.d.class, aVar);
        f1907b = new C8.c("storageMetrics", DesugarCollections.unmodifiableMap(new HashMap(map)));
    }

    @Override // C8.a
    public final void a(Object obj, Object obj2) {
        ((C8.e) obj2).a(f1907b, ((H6.b) obj).f3410a);
    }
}
