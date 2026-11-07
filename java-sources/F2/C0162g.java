package F2;

import A.C0030l0;
import K9.AbstractC0405x;
import K9.C0401t;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.LinkedHashMap;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: F2.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0162g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u f2277a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final K f2278b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f2279c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ReentrantLock f2280d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C0161f f2281e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C0161f f2282f;
    public final Object g;

    public C0162g(u uVar, LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2, String... strArr) {
        this.f2277a = uVar;
        K k7 = new K(uVar, linkedHashMap, linkedHashMap2, strArr, uVar.f2328k, new E5.c(1, this, C0162g.class, "notifyInvalidatedObservers", "notifyInvalidatedObservers(Ljava/util/Set;)V", 0, 0, 1));
        this.f2278b = k7;
        this.f2279c = new LinkedHashMap();
        this.f2280d = new ReentrantLock();
        this.f2281e = new C0161f(this, 0);
        this.f2282f = new C0161f(this, 1);
        p251z9.j.d(Collections.newSetFromMap(new IdentityHashMap()), "newSetFromMap(...)");
        this.g = new Object();
        k7.f2250k = new C0161f(this, 2);
    }

    public final void a() {
        K k7 = this.f2278b;
        k7.getClass();
        C0161f c0161f = this.f2281e;
        p251z9.j.e(c0161f, "onRefreshScheduled");
        C0161f c0161f2 = this.f2282f;
        p251z9.j.e(c0161f2, "onRefreshCompleted");
        if (k7.j.compareAndSet(false, true)) {
            c0161f.invoke();
            P9.d dVar = k7.f2242a.f2320a;
            p150o9.c cVar = null;
            if (dVar != null) {
                AbstractC0405x.x(dVar, new C0401t("Room Invalidation Tracker Refresh"), new C0030l0(k7, c0161f2, cVar, 6), 2);
            } else {
                p251z9.j.k("coroutineScope");
                throw null;
            }
        }
    }
}
