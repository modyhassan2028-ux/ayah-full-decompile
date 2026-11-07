package p042e0;

/* JADX INFO: loaded from: classes.dex */
public final class o extends n {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f15747u;

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f15747u) {
            case 0:
                int i10 = this.f15746t;
                this.f15746t = i10 + 2;
                Object[] objArr = this.f15744r;
                return new a(0, objArr[i10], objArr[i10 + 1]);
            case 1:
                int i11 = this.f15746t;
                this.f15746t = i11 + 2;
                return this.f15744r[i11];
            default:
                int i12 = this.f15746t;
                this.f15746t = i12 + 2;
                return this.f15744r[i12 + 1];
        }
    }
}
