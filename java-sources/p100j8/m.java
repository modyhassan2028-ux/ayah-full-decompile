package p100j8;

import I8.b;
import j$.util.DesugarCollections;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class m implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile Set f18813a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile Set f18814b;

    public final synchronized void a() {
        try {
            Iterator it = this.f18813a.iterator();
            while (it.hasNext()) {
                this.f18814b.add(((b) it.next()).get());
            }
            this.f18813a = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // I8.b
    public final Object get() {
        if (this.f18814b == null) {
            synchronized (this) {
                try {
                    if (this.f18814b == null) {
                        this.f18814b = Collections.newSetFromMap(new ConcurrentHashMap());
                        a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return DesugarCollections.unmodifiableSet(this.f18814b);
    }
}
