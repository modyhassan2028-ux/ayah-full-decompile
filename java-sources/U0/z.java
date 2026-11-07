package U0;

/* JADX INFO: loaded from: classes.dex */
public final class z implements p085i0.m {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ p251z9.k f8161r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ p251z9.k f8162s;

    /* JADX WARN: Multi-variable type inference failed */
    public z(p241y9.e eVar, p241y9.c cVar) {
        this.f8161r = (p251z9.k) eVar;
        this.f8162s = (p251z9.k) cVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [y9.e, z9.k] */
    @Override // p085i0.m
    public final Object a(p085i0.b bVar, Object obj) {
        return this.f8161r.invoke(bVar, obj);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [y9.c, z9.k] */
    @Override // p085i0.m
    public final Object c(Object obj) {
        return this.f8162s.e(obj);
    }
}
