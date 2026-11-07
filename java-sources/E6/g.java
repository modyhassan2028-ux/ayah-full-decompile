package E6;

import j$.util.DesugarCollections;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class g implements C8.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f1918a = new g();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C8.c f1919b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C8.c f1920c;

    static {
        F8.a aVar = new F8.a(1);
        HashMap map = new HashMap();
        map.put(F8.d.class, aVar);
        f1919b = new C8.c("startMs", DesugarCollections.unmodifiableMap(new HashMap(map)));
        F8.a aVar2 = new F8.a(2);
        HashMap map2 = new HashMap();
        map2.put(F8.d.class, aVar2);
        f1920c = new C8.c("endMs", DesugarCollections.unmodifiableMap(new HashMap(map2)));
    }

    @Override // C8.a
    public final void a(Object obj, Object obj2) {
        H6.g gVar = (H6.g) obj;
        C8.e eVar = (C8.e) obj2;
        eVar.d(f1919b, gVar.f3427a);
        eVar.d(f1920c, gVar.f3428b);
    }
}
