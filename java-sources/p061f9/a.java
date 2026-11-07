package p061f9;

/* JADX INFO: loaded from: classes.dex */
public final class a implements b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f16238c = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile b f16239a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile Object f16240b;

    public static b a(b bVar) {
        if (bVar instanceof a) {
            return bVar;
        }
        a aVar = new a();
        aVar.f16240b = f16238c;
        aVar.f16239a = bVar;
        return aVar;
    }

    @Override // p101j9.a
    public final Object get() {
        Object obj;
        Object obj2 = this.f16240b;
        Object obj3 = f16238c;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            obj = this.f16240b;
            if (obj == obj3) {
                obj = this.f16239a.get();
                Object obj4 = this.f16240b;
                if (obj4 != obj3 && obj4 != obj) {
                    throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + obj + ". This is likely due to a circular dependency.");
                }
                this.f16240b = obj;
                this.f16239a = null;
            }
        }
        return obj;
    }
}
