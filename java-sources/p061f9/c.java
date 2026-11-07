package p061f9;

/* JADX INFO: loaded from: classes.dex */
public final class c implements b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f16241c = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile b f16242a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile Object f16243b;

    public static b a(b bVar) {
        if ((bVar instanceof c) || (bVar instanceof a)) {
            return bVar;
        }
        c cVar = new c();
        cVar.f16243b = f16241c;
        cVar.f16242a = bVar;
        return cVar;
    }

    @Override // p101j9.a
    public final Object get() {
        Object obj = this.f16243b;
        if (obj != f16241c) {
            return obj;
        }
        b bVar = this.f16242a;
        if (bVar == null) {
            return this.f16243b;
        }
        Object obj2 = bVar.get();
        this.f16243b = obj2;
        this.f16242a = null;
        return obj2;
    }
}
