package P9;

/* JADX INFO: loaded from: classes.dex */
public final class v implements p150o9.f {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Object f6807r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ThreadLocal f6808s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final w f6809t;

    public v(H2.u uVar, ThreadLocal threadLocal) {
        this.f6807r = uVar;
        this.f6808s = threadLocal;
        this.f6809t = new w(threadLocal);
    }

    @Override // p150o9.h
    public final p150o9.h A(p150o9.g gVar) {
        return this.f6809t.equals(gVar) ? p150o9.i.f20380r : this;
    }

    @Override // p150o9.h
    public final Object F(Object obj, p241y9.e eVar) {
        return eVar.invoke(obj, this);
    }

    @Override // p150o9.h
    public final p150o9.h L(p150o9.h hVar) {
        return Y2.a.Z(this, hVar);
    }

    public final void a(Object obj) {
        this.f6808s.set(obj);
    }

    public final Object c(p150o9.h hVar) {
        ThreadLocal threadLocal = this.f6808s;
        Object obj = threadLocal.get();
        threadLocal.set(this.f6807r);
        return obj;
    }

    @Override // p150o9.f
    public final p150o9.g getKey() {
        return this.f6809t;
    }

    @Override // p150o9.h
    public final p150o9.f i(p150o9.g gVar) {
        if (this.f6809t.equals(gVar)) {
            return this;
        }
        return null;
    }

    public final String toString() {
        return "ThreadLocal(value=" + this.f6807r + ", threadLocal = " + this.f6808s + ')';
    }
}
