package p223x;

import p123m2.c;

/* JADX INFO: renamed from: x.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1426o extends AbstractC1427p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f24059a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f24060b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f24061c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f24062d;

    public C1426o(float f3, float f7, float f10, float f11) {
        this.f24059a = f3;
        this.f24060b = f7;
        this.f24061c = f10;
        this.f24062d = f11;
    }

    @Override // p223x.AbstractC1427p
    public final float a(int i10) {
        if (i10 == 0) {
            return this.f24059a;
        }
        if (i10 == 1) {
            return this.f24060b;
        }
        if (i10 == 2) {
            return this.f24061c;
        }
        if (i10 != 3) {
            return 0.0f;
        }
        return this.f24062d;
    }

    @Override // p223x.AbstractC1427p
    public final int b() {
        return 4;
    }

    @Override // p223x.AbstractC1427p
    public final AbstractC1427p c() {
        return new C1426o(0.0f, 0.0f, 0.0f, 0.0f);
    }

    @Override // p223x.AbstractC1427p
    public final void d() {
        this.f24059a = 0.0f;
        this.f24060b = 0.0f;
        this.f24061c = 0.0f;
        this.f24062d = 0.0f;
    }

    @Override // p223x.AbstractC1427p
    public final void e(int i10, float f3) {
        if (i10 == 0) {
            this.f24059a = f3;
            return;
        }
        if (i10 == 1) {
            this.f24060b = f3;
        } else if (i10 == 2) {
            this.f24061c = f3;
        } else {
            if (i10 != 3) {
                return;
            }
            this.f24062d = f3;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1426o)) {
            return false;
        }
        C1426o c1426o = (C1426o) obj;
        return c1426o.f24059a == this.f24059a && c1426o.f24060b == this.f24060b && c1426o.f24061c == this.f24061c && c1426o.f24062d == this.f24062d;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f24062d) + c.n(c.n(Float.floatToIntBits(this.f24059a) * 31, this.f24060b, 31), this.f24061c, 31);
    }

    public final String toString() {
        return "AnimationVector4D: v1 = " + this.f24059a + ", v2 = " + this.f24060b + ", v3 = " + this.f24061c + ", v4 = " + this.f24062d;
    }
}
