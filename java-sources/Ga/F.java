package Ga;

/* JADX INFO: loaded from: classes.dex */
public final class F {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final F f2977e = new F(C.f2974s, 0.0f, D.f2976r, new E(1, null));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C f2978a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f2979b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p251z9.k f2980c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final q9.i f2981d;

    /* JADX WARN: Multi-variable type inference failed */
    public F(C c10, float f3, p241y9.a aVar, p241y9.c cVar) {
        this.f2978a = c10;
        this.f2979b = f3;
        this.f2980c = (p251z9.k) aVar;
        this.f2981d = (q9.i) cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof F)) {
            return false;
        }
        F f3 = (F) obj;
        return this.f2978a == f3.f2978a && Float.compare(this.f2979b, f3.f2979b) == 0 && this.f2980c.equals(f3.f2980c) && this.f2981d.equals(f3.f2981d);
    }

    public final int hashCode() {
        return this.f2981d.hashCode() + ((this.f2980c.hashCode() + p123m2.c.n(this.f2978a.hashCode() * 31, this.f2979b, 31)) * 31);
    }

    public final String toString() {
        return "ScrollInfo(direction=" + this.f2978a + ", speedMultiplier=" + this.f2979b + ", maxScrollDistanceProvider=" + this.f2980c + ", onScroll=" + this.f2981d + ')';
    }
}
