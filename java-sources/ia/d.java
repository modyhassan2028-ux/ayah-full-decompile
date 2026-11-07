package ia;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d f17714c = new d(6, 4.0f, 4);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final d f17715d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f17716a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f17717b;

    static {
        new d(8, 0.0f, 6);
        f17715d = new d(10, 6.0f, 4);
    }

    public d(int i10, float f3, int i11) {
        f3 = (i11 & 2) != 0 ? 5.0f : f3;
        this.f17716a = i10;
        this.f17717b = f3;
        if (f3 != 0.0f) {
            return;
        }
        throw new IllegalArgumentException(("mass=" + f3 + " must be != 0").toString());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f17716a == dVar.f17716a && Float.compare(this.f17717b, dVar.f17717b) == 0 && Float.compare(0.2f, 0.2f) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(0.2f) + p123m2.c.n(this.f17716a * 31, this.f17717b, 31);
    }

    public final String toString() {
        return "Size(sizeInDp=" + this.f17716a + ", mass=" + this.f17717b + ", massVariance=0.2)";
    }
}
