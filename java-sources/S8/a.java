package S8;

/* JADX INFO: loaded from: classes.dex */
public final class a implements c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f7528c = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile b f7529a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile Object f7530b;

    public static c a(b bVar) {
        if (bVar instanceof a) {
            return bVar;
        }
        a aVar = new a();
        aVar.f7530b = f7528c;
        aVar.f7529a = bVar;
        return aVar;
    }

    @Override // p101j9.a
    public final Object get() {
        Object obj;
        Object obj2 = this.f7530b;
        Object obj3 = f7528c;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            try {
                obj = this.f7530b;
                if (obj == obj3) {
                    obj = this.f7529a.get();
                    Object obj4 = this.f7530b;
                    if (obj4 != obj3 && obj4 != obj) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + obj + ". This is likely due to a circular dependency.");
                    }
                    this.f7530b = obj;
                    this.f7529a = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }
}
