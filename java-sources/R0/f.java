package R0;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final f f7075d = new f(0.0f, new E9.a(0.0f, 0.0f), 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f7076a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final E9.a f7077b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f7078c;

    public f(float f3, E9.a aVar, int i10) {
        this.f7076a = f3;
        this.f7077b = aVar;
        this.f7078c = i10;
        if (Float.isNaN(f3)) {
            throw new IllegalArgumentException("current must not be NaN");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f7076a == fVar.f7076a && p251z9.j.a(this.f7077b, fVar.f7077b) && this.f7078c == fVar.f7078c;
    }

    public final int hashCode() {
        return ((this.f7077b.hashCode() + (Float.floatToIntBits(this.f7076a) * 31)) * 31) + this.f7078c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProgressBarRangeInfo(current=");
        sb.append(this.f7076a);
        sb.append(", range=");
        sb.append(this.f7077b);
        sb.append(", steps=");
        return android.support.v4.media.session.p.A(sb, this.f7078c, ')');
    }
}
