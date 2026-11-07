package p042e0;

/* JADX INFO: loaded from: classes.dex */
public final class p extends n {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final h f15748u;

    public p(h hVar) {
        this.f15748u = hVar;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i10 = this.f15746t;
        this.f15746t = i10 + 2;
        Object[] objArr = this.f15744r;
        return new b(this.f15748u, objArr[i10], objArr[i10 + 1]);
    }
}
