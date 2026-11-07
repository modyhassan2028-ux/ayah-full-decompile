package E6;

import j$.util.DesugarCollections;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class a implements C8.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f1901a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C8.c f1902b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C8.c f1903c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C8.c f1904d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final C8.c f1905e;

    static {
        F8.a aVar = new F8.a(1);
        HashMap map = new HashMap();
        map.put(F8.d.class, aVar);
        f1902b = new C8.c("window", DesugarCollections.unmodifiableMap(new HashMap(map)));
        F8.a aVar2 = new F8.a(2);
        HashMap map2 = new HashMap();
        map2.put(F8.d.class, aVar2);
        f1903c = new C8.c("logSourceMetrics", DesugarCollections.unmodifiableMap(new HashMap(map2)));
        F8.a aVar3 = new F8.a(3);
        HashMap map3 = new HashMap();
        map3.put(F8.d.class, aVar3);
        f1904d = new C8.c("globalMetrics", DesugarCollections.unmodifiableMap(new HashMap(map3)));
        F8.a aVar4 = new F8.a(4);
        HashMap map4 = new HashMap();
        map4.put(F8.d.class, aVar4);
        f1905e = new C8.c("appNamespace", DesugarCollections.unmodifiableMap(new HashMap(map4)));
    }

    @Override // C8.a
    public final void a(Object obj, Object obj2) {
        H6.a aVar = (H6.a) obj;
        C8.e eVar = (C8.e) obj2;
        eVar.a(f1902b, aVar.f3406a);
        eVar.a(f1903c, aVar.f3407b);
        eVar.a(f1904d, aVar.f3408c);
        eVar.a(f1905e, aVar.f3409d);
    }
}
