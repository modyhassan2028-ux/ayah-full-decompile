package p100j8;

import I8.b;

/* JADX INFO: loaded from: classes.dex */
public final class l implements b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f18810c = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile Object f18811a = f18810c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile b f18812b;

    public l(b bVar) {
        this.f18812b = bVar;
    }

    @Override // I8.b
    public final Object get() {
        Object obj;
        Object obj2 = this.f18811a;
        Object obj3 = f18810c;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            try {
                obj = this.f18811a;
                if (obj == obj3) {
                    obj = this.f18812b.get();
                    this.f18811a = obj;
                    this.f18812b = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }
}
