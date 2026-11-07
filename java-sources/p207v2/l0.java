package p207v2;

import H9.p;

/* JADX INFO: loaded from: classes.dex */
public final class l0 extends n0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f23266e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f23267f;

    public l0(int i10, int i11, int i12, int i13, int i14, int i15) {
        super(i12, i13, i14, i15);
        this.f23266e = i10;
        this.f23267f = i11;
    }

    @Override // p207v2.n0
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l0)) {
            return false;
        }
        l0 l0Var = (l0) obj;
        return this.f23266e == l0Var.f23266e && this.f23267f == l0Var.f23267f && this.f23272a == l0Var.f23272a && this.f23273b == l0Var.f23273b && this.f23274c == l0Var.f23274c && this.f23275d == l0Var.f23275d;
    }

    @Override // p207v2.n0
    public final int hashCode() {
        return super.hashCode() + this.f23266e + this.f23267f;
    }

    public final String toString() {
        return p.J0("ViewportHint.Access(\n            |    pageOffset=" + this.f23266e + ",\n            |    indexInPage=" + this.f23267f + ",\n            |    presentedItemsBefore=" + this.f23272a + ",\n            |    presentedItemsAfter=" + this.f23273b + ",\n            |    originalPageOffsetFirst=" + this.f23274c + ",\n            |    originalPageOffsetLast=" + this.f23275d + ",\n            |)");
    }
}
