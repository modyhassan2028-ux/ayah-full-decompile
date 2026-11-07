package u;

/* JADX INFO: loaded from: classes.dex */
public final class Q extends p120l9.v {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f22708r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ P f22709s;

    public Q(P p10) {
        this.f22709s = p10;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f22708r < this.f22709s.g();
    }

    @Override // p120l9.v
    public final int nextInt() {
        int i10 = this.f22708r;
        this.f22708r = i10 + 1;
        return this.f22709s.e(i10);
    }
}
