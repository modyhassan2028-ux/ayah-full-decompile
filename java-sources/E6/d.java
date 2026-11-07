package E6;

import j$.util.DesugarCollections;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class d implements C8.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f1911a = new d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C8.c f1912b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C8.c f1913c;

    static {
        F8.a aVar = new F8.a(1);
        HashMap map = new HashMap();
        map.put(F8.d.class, aVar);
        f1912b = new C8.c("logSource", DesugarCollections.unmodifiableMap(new HashMap(map)));
        F8.a aVar2 = new F8.a(2);
        HashMap map2 = new HashMap();
        map2.put(F8.d.class, aVar2);
        f1913c = new C8.c("logEventDropped", DesugarCollections.unmodifiableMap(new HashMap(map2)));
    }

    @Override // C8.a
    public final void a(Object obj, Object obj2) {
        H6.e eVar = (H6.e) obj;
        C8.e eVar2 = (C8.e) obj2;
        eVar2.a(f1912b, eVar.f3423a);
        eVar2.a(f1913c, eVar.f3424b);
    }
}
