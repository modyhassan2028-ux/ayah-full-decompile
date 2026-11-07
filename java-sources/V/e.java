package V;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f8347a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f8348b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f8349c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f8350d;

    public e(float f3, float f7, float f10, float f11) {
        this.f8347a = f3;
        this.f8348b = f7;
        this.f8349c = f10;
        this.f8350d = f11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f8347a == eVar.f8347a && this.f8348b == eVar.f8348b && this.f8349c == eVar.f8349c && this.f8350d == eVar.f8350d;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f8350d) + p123m2.c.n(p123m2.c.n(Float.floatToIntBits(this.f8347a) * 31, this.f8348b, 31), this.f8349c, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RippleAlpha(draggedAlpha=");
        sb.append(this.f8347a);
        sb.append(", focusedAlpha=");
        sb.append(this.f8348b);
        sb.append(", hoveredAlpha=");
        sb.append(this.f8349c);
        sb.append(", pressedAlpha=");
        return p123m2.c.v(sb, this.f8350d, ')');
    }
}
