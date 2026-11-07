package E6;

import j$.util.DesugarCollections;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class f implements C8.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f1915a = new f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C8.c f1916b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C8.c f1917c;

    static {
        F8.a aVar = new F8.a(1);
        HashMap map = new HashMap();
        map.put(F8.d.class, aVar);
        f1916b = new C8.c("currentCacheSizeBytes", DesugarCollections.unmodifiableMap(new HashMap(map)));
        F8.a aVar2 = new F8.a(2);
        HashMap map2 = new HashMap();
        map2.put(F8.d.class, aVar2);
        f1917c = new C8.c("maxCacheSizeBytes", DesugarCollections.unmodifiableMap(new HashMap(map2)));
    }

    @Override // C8.a
    public final void a(Object obj, Object obj2) {
        H6.f fVar = (H6.f) obj;
        C8.e eVar = (C8.e) obj2;
        eVar.d(f1916b, fVar.f3425a);
        eVar.d(f1917c, fVar.f3426b);
    }
}
