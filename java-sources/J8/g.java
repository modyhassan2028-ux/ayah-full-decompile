package J8;

/* JADX INFO: loaded from: classes.dex */
public final class g implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f4405a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p118l7.i f4406b;

    public g(k kVar, p118l7.i iVar) {
        this.f4405a = kVar;
        this.f4406b = iVar;
    }

    @Override // J8.j
    public final boolean a(K8.b bVar) {
        if (bVar.f5308b != 4 || this.f4405a.a(bVar)) {
            return false;
        }
        String str = bVar.f5309c;
        if (str == null) {
            throw new NullPointerException("Null token");
        }
        this.f4406b.f19402a.j(new a(str, bVar.f5311e, bVar.f5312f));
        return true;
    }

    @Override // J8.j
    public final boolean b(Exception exc) {
        this.f4406b.a(exc);
        return true;
    }
}
