package p100j8;

import G8.a;
import G8.b;
import H8.e;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayDeque;
import java.util.HashMap;
import p070g8.c;

/* JADX INFO: loaded from: classes.dex */
public final class j implements b, a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f18808a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ArrayDeque f18809b;

    public j() {
        p109k8.j jVar = p109k8.j.f19063r;
        this.f18808a = new HashMap();
        this.f18809b = new ArrayDeque();
    }

    public final synchronized void a() {
        c cVar = c.f16333s;
        e eVar = e.f3597s;
        synchronized (this) {
            try {
                if (!this.f18808a.containsKey(p050e8.b.class)) {
                    this.f18808a.put(p050e8.b.class, new ConcurrentHashMap());
                }
                ((ConcurrentHashMap) this.f18808a.get(p050e8.b.class)).put(eVar, cVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
