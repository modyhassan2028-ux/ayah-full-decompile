package G6;

/* JADX INFO: loaded from: classes.dex */
public final class a implements p101j9.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f2913c = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile b f2914a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile Object f2915b;

    public static p101j9.a a(b bVar) {
        if (bVar instanceof a) {
            return bVar;
        }
        a aVar = new a();
        aVar.f2915b = f2913c;
        aVar.f2914a = bVar;
        return aVar;
    }

    @Override // p101j9.a
    public final Object get() {
        Object obj;
        Object obj2 = this.f2915b;
        Object obj3 = f2913c;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            try {
                obj = this.f2915b;
                if (obj == obj3) {
                    obj = this.f2914a.get();
                    Object obj4 = this.f2915b;
                    if (obj4 != obj3 && obj4 != obj) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + obj + ". This is likely due to a circular dependency.");
                    }
                    this.f2915b = obj;
                    this.f2914a = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }
}
