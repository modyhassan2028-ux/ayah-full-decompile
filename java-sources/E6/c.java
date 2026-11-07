package E6;

import j$.util.DesugarCollections;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class c implements C8.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f1908a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C8.c f1909b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C8.c f1910c;

    static {
        F8.a aVar = new F8.a(1);
        HashMap map = new HashMap();
        map.put(F8.d.class, aVar);
        f1909b = new C8.c("eventsDroppedCount", DesugarCollections.unmodifiableMap(new HashMap(map)));
        F8.a aVar2 = new F8.a(3);
        HashMap map2 = new HashMap();
        map2.put(F8.d.class, aVar2);
        f1910c = new C8.c("reason", DesugarCollections.unmodifiableMap(new HashMap(map2)));
    }

    @Override // C8.a
    public final void a(Object obj, Object obj2) {
        H6.d dVar = (H6.d) obj;
        C8.e eVar = (C8.e) obj2;
        eVar.d(f1909b, dVar.f3420a);
        eVar.a(f1910c, dVar.f3421b);
    }
}
