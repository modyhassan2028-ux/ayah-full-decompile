package ia;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f17718a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f17719b;

    public e(float f3, float f7) {
        this.f17718a = f3;
        this.f17719b = f7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Float.compare(this.f17718a, eVar.f17718a) == 0 && Float.compare(this.f17719b, eVar.f17719b) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f17719b) + (Float.floatToIntBits(this.f17718a) * 31);
    }

    public final String toString() {
        return "Vector(x=" + this.f17718a + ", y=" + this.f17719b + ")";
    }
}
