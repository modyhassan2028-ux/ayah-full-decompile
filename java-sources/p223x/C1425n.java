package p223x;

import p123m2.c;

/* JADX INFO: renamed from: x.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1425n extends AbstractC1427p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f24041a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f24042b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f24043c;

    public C1425n(float f3, float f7, float f10) {
        this.f24041a = f3;
        this.f24042b = f7;
        this.f24043c = f10;
    }

    @Override // p223x.AbstractC1427p
    public final float a(int i10) {
        if (i10 == 0) {
            return this.f24041a;
        }
        if (i10 == 1) {
            return this.f24042b;
        }
        if (i10 != 2) {
            return 0.0f;
        }
        return this.f24043c;
    }

    @Override // p223x.AbstractC1427p
    public final int b() {
        return 3;
    }

    @Override // p223x.AbstractC1427p
    public final AbstractC1427p c() {
        return new C1425n(0.0f, 0.0f, 0.0f);
    }

    @Override // p223x.AbstractC1427p
    public final void d() {
        this.f24041a = 0.0f;
        this.f24042b = 0.0f;
        this.f24043c = 0.0f;
    }

    @Override // p223x.AbstractC1427p
    public final void e(int i10, float f3) {
        if (i10 == 0) {
            this.f24041a = f3;
        } else if (i10 == 1) {
            this.f24042b = f3;
        } else {
            if (i10 != 2) {
                return;
            }
            this.f24043c = f3;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1425n)) {
            return false;
        }
        C1425n c1425n = (C1425n) obj;
        return c1425n.f24041a == this.f24041a && c1425n.f24042b == this.f24042b && c1425n.f24043c == this.f24043c;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f24043c) + c.n(Float.floatToIntBits(this.f24041a) * 31, this.f24042b, 31);
    }

    public final String toString() {
        return "AnimationVector3D: v1 = " + this.f24041a + ", v2 = " + this.f24042b + ", v3 = " + this.f24043c;
    }
}
