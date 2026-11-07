package U0;

/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0509a f8115a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f8116b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f8117c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f8118d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f8119e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f8120f;
    public final float g;

    public r(C0509a c0509a, int i10, int i11, int i12, int i13, float f3, float f7) {
        this.f8115a = c0509a;
        this.f8116b = i10;
        this.f8117c = i11;
        this.f8118d = i12;
        this.f8119e = i13;
        this.f8120f = f3;
        this.g = f7;
    }

    public final p171r0.e a(p171r0.e eVar) {
        return eVar.h((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(this.f8120f)) & 4294967295L));
    }

    public final long b(long j, boolean z10) {
        if (z10) {
            long j10 = K.f8033b;
            if (K.a(j, j10)) {
                return j10;
            }
        }
        int i10 = K.f8034c;
        int i11 = (int) (j >> 32);
        int i12 = this.f8116b;
        return va.g.e(i11 + i12, ((int) (j & 4294967295L)) + i12);
    }

    public final p171r0.e c(p171r0.e eVar) {
        float f3 = -this.f8120f;
        return eVar.h((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(f3)) & 4294967295L));
    }

    public final int d(int i10) {
        int i11 = this.f8117c;
        int i12 = this.f8116b;
        return B0.c.l(i10, i12, i11) - i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return this.f8115a.equals(rVar.f8115a) && this.f8116b == rVar.f8116b && this.f8117c == rVar.f8117c && this.f8118d == rVar.f8118d && this.f8119e == rVar.f8119e && Float.compare(this.f8120f, rVar.f8120f) == 0 && Float.compare(this.g, rVar.g) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.g) + p123m2.c.n(((((((((this.f8115a.hashCode() * 31) + this.f8116b) * 31) + this.f8117c) * 31) + this.f8118d) * 31) + this.f8119e) * 31, this.f8120f, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ParagraphInfo(paragraph=");
        sb.append(this.f8115a);
        sb.append(", startIndex=");
        sb.append(this.f8116b);
        sb.append(", endIndex=");
        sb.append(this.f8117c);
        sb.append(", startLineIndex=");
        sb.append(this.f8118d);
        sb.append(", endLineIndex=");
        sb.append(this.f8119e);
        sb.append(", top=");
        sb.append(this.f8120f);
        sb.append(", bottom=");
        return p123m2.c.v(sb, this.g, ')');
    }
}
