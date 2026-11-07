package O;

/* JADX INFO: renamed from: O.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0445m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p055f1.j f6383a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f6384b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f6385c;

    public C0445m(p055f1.j jVar, int i10, long j) {
        this.f6383a = jVar;
        this.f6384b = i10;
        this.f6385c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0445m)) {
            return false;
        }
        C0445m c0445m = (C0445m) obj;
        return this.f6383a == c0445m.f6383a && this.f6384b == c0445m.f6384b && this.f6385c == c0445m.f6385c;
    }

    public final int hashCode() {
        int iHashCode = ((this.f6383a.hashCode() * 31) + this.f6384b) * 31;
        long j = this.f6385c;
        return iHashCode + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        return "AnchorInfo(direction=" + this.f6383a + ", offset=" + this.f6384b + ", selectableId=" + this.f6385c + ')';
    }
}
