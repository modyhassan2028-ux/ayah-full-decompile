package p065g3;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f16282a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f16283b;

    public b(int i10, float f3) {
        this.f16282a = i10;
        this.f16283b = f3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f16282a == bVar.f16282a && Float.compare(this.f16283b, bVar.f16283b) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f16283b) + (this.f16282a * 31);
    }

    public final String toString() {
        return "TimingDao(verseId=" + this.f16282a + ", startTime=" + this.f16283b + ")";
    }
}
