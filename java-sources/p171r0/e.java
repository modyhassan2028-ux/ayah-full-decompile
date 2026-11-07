package p171r0;

import p123m2.c;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final e f21388e = new e(0.0f, 0.0f, 0.0f, 0.0f);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f21389a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f21390b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f21391c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f21392d;

    public e(float f3, float f7, float f10, float f11) {
        this.f21389a = f3;
        this.f21390b = f7;
        this.f21391c = f10;
        this.f21392d = f11;
    }

    public static e a(e eVar, float f3, float f7, int i10) {
        if ((i10 & 1) != 0) {
            f3 = eVar.f21389a;
        }
        float f10 = (i10 & 2) != 0 ? eVar.f21390b : Float.NEGATIVE_INFINITY;
        if ((i10 & 4) != 0) {
            f7 = eVar.f21391c;
        }
        return new e(f3, f10, f7, (i10 & 8) != 0 ? eVar.f21392d : Float.POSITIVE_INFINITY);
    }

    public final long b() {
        float f3 = this.f21391c;
        float f7 = this.f21389a;
        float f10 = ((f3 - f7) / 2.0f) + f7;
        float f11 = this.f21392d;
        float f12 = this.f21390b;
        return (((long) Float.floatToRawIntBits(((f11 - f12) / 2.0f) + f12)) & 4294967295L) | (Float.floatToRawIntBits(f10) << 32);
    }

    public final long c() {
        float f3 = this.f21391c - this.f21389a;
        return (((long) Float.floatToRawIntBits(this.f21392d - this.f21390b)) & 4294967295L) | (Float.floatToRawIntBits(f3) << 32);
    }

    public final e d(e eVar) {
        return new e(Math.max(this.f21389a, eVar.f21389a), Math.max(this.f21390b, eVar.f21390b), Math.min(this.f21391c, eVar.f21391c), Math.min(this.f21392d, eVar.f21392d));
    }

    public final boolean e() {
        return (this.f21389a >= this.f21391c) | (this.f21390b >= this.f21392d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Float.compare(this.f21389a, eVar.f21389a) == 0 && Float.compare(this.f21390b, eVar.f21390b) == 0 && Float.compare(this.f21391c, eVar.f21391c) == 0 && Float.compare(this.f21392d, eVar.f21392d) == 0;
    }

    public final boolean f(e eVar) {
        return (this.f21389a < eVar.f21391c) & (eVar.f21389a < this.f21391c) & (this.f21390b < eVar.f21392d) & (eVar.f21390b < this.f21392d);
    }

    public final e g(float f3, float f7) {
        return new e(this.f21389a + f3, this.f21390b + f7, this.f21391c + f3, this.f21392d + f7);
    }

    public final e h(long j) {
        int i10 = (int) (j >> 32);
        int i11 = (int) (j & 4294967295L);
        return new e(Float.intBitsToFloat(i10) + this.f21389a, Float.intBitsToFloat(i11) + this.f21390b, Float.intBitsToFloat(i10) + this.f21391c, Float.intBitsToFloat(i11) + this.f21392d);
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f21392d) + c.n(c.n(Float.floatToIntBits(this.f21389a) * 31, this.f21390b, 31), this.f21391c, 31);
    }

    public final String toString() {
        return "Rect.fromLTRB(" + a.f(this.f21389a) + ", " + a.f(this.f21390b) + ", " + a.f(this.f21391c) + ", " + a.f(this.f21392d) + ')';
    }
}
