package p070g8;

import U6.C0532j;
import U6.y;
import X4.c;
import Z0.B;
import j$.util.concurrent.ConcurrentHashMap;
import p081h8.a;
import p085i0.n;

/* JADX INFO: loaded from: classes.dex */
public final class b implements a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile b f16330c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final B f16331a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f16332b;

    public b(B b5) {
        y.f(b5);
        this.f16331a = b5;
        this.f16332b = new ConcurrentHashMap();
    }

    public final C0532j a(String str, n nVar) {
        Object obj;
        c cVar;
        L5.c cVar2;
        if (!a.f16466c.contains(str)) {
            boolean zIsEmpty = str.isEmpty();
            ConcurrentHashMap concurrentHashMap = this.f16332b;
            if (zIsEmpty || !concurrentHashMap.containsKey(str) || concurrentHashMap.get(str) == null) {
                boolean zEquals = "fiam".equals(str);
                B b5 = this.f16331a;
                if (zEquals) {
                    cVar2 = new L5.c(b5, nVar);
                } else if ("clx".equals(str)) {
                    cVar = new c();
                    cVar.f9953r = nVar;
                    b5.k(new p081h8.b(1, cVar));
                } else {
                    obj = null;
                }
                if (obj != null) {
                    obj = cVar;
                    obj = cVar2;
                    concurrentHashMap.put(str, obj);
                    return new C0532j(27);
                }
            }
        }
        obj = cVar;
        obj = cVar2;
        return null;
    }
}
