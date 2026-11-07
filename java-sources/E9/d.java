package E9;

/* JADX INFO: loaded from: classes.dex */
public final class d extends b {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final d f2002u = new d(1, 0, 1);

    public final boolean b(int i10) {
        return this.f1995r <= i10 && i10 <= this.f1996s;
    }

    @Override // E9.b
    public final boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        if (isEmpty() && ((d) obj).isEmpty()) {
            return true;
        }
        d dVar = (d) obj;
        return this.f1995r == dVar.f1995r && this.f1996s == dVar.f1996s;
    }

    @Override // E9.b
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.f1995r * 31) + this.f1996s;
    }

    @Override // E9.b
    public final boolean isEmpty() {
        return this.f1995r > this.f1996s;
    }

    @Override // E9.b
    public final String toString() {
        return this.f1995r + ".." + this.f1996s;
    }
}
