package m1;

import p132n1.o;

/* JADX INFO: loaded from: classes.dex */
public final class g extends o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f19505a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f19506b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f19507c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f19508d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f19509e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f19510f;
    public float g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f19511h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f19512i;
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f19513k = false;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f19514l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f19515m;

    @Override // p132n1.o
    public final float a() {
        return this.f19513k ? -b(this.f19515m) : b(this.f19515m);
    }

    public final float b(float f3) {
        float f7;
        float f10;
        float f11 = this.f19508d;
        if (f3 <= f11) {
            f7 = this.f19505a;
            f10 = this.f19506b;
        } else {
            int i10 = this.j;
            if (i10 == 1) {
                return 0.0f;
            }
            f3 -= f11;
            f11 = this.f19509e;
            if (f3 >= f11) {
                if (i10 == 2) {
                    return this.f19511h;
                }
                float f12 = f3 - f11;
                float f13 = this.f19510f;
                if (f12 >= f13) {
                    return this.f19512i;
                }
                float f14 = this.f19507c;
                return f14 - ((f12 * f14) / f13);
            }
            f7 = this.f19506b;
            f10 = this.f19507c;
        }
        return (((f10 - f7) * f3) / f11) + f7;
    }

    public final void c(float f3, float f7, float f10, float f11, float f12) {
        if (f3 == 0.0f) {
            f3 = 1.0E-4f;
        }
        this.f19505a = f3;
        float f13 = f3 / f10;
        float f14 = (f13 * f3) / 2.0f;
        if (f3 < 0.0f) {
            float fSqrt = (float) Math.sqrt((f7 - ((((-f3) / f10) * f3) / 2.0f)) * f10);
            if (fSqrt < f11) {
                this.j = 2;
                this.f19505a = f3;
                this.f19506b = fSqrt;
                this.f19507c = 0.0f;
                float f15 = (fSqrt - f3) / f10;
                this.f19508d = f15;
                this.f19509e = fSqrt / f10;
                this.g = ((f3 + fSqrt) * f15) / 2.0f;
                this.f19511h = f7;
                this.f19512i = f7;
                return;
            }
            this.j = 3;
            this.f19505a = f3;
            this.f19506b = f11;
            this.f19507c = f11;
            float f16 = (f11 - f3) / f10;
            this.f19508d = f16;
            float f17 = f11 / f10;
            this.f19510f = f17;
            float f18 = ((f3 + f11) * f16) / 2.0f;
            float f19 = (f17 * f11) / 2.0f;
            this.f19509e = ((f7 - f18) - f19) / f11;
            this.g = f18;
            this.f19511h = f7 - f19;
            this.f19512i = f7;
            return;
        }
        if (f14 >= f7) {
            this.j = 1;
            this.f19505a = f3;
            this.f19506b = 0.0f;
            this.g = f7;
            this.f19508d = (2.0f * f7) / f3;
            return;
        }
        float f20 = f7 - f14;
        float f21 = f20 / f3;
        if (f21 + f13 < f12) {
            this.j = 2;
            this.f19505a = f3;
            this.f19506b = f3;
            this.f19507c = 0.0f;
            this.g = f20;
            this.f19511h = f7;
            this.f19508d = f21;
            this.f19509e = f13;
            return;
        }
        float fSqrt2 = (float) Math.sqrt(((f3 * f3) / 2.0f) + (f10 * f7));
        float f22 = (fSqrt2 - f3) / f10;
        this.f19508d = f22;
        float f23 = fSqrt2 / f10;
        this.f19509e = f23;
        if (fSqrt2 < f11) {
            this.j = 2;
            this.f19505a = f3;
            this.f19506b = fSqrt2;
            this.f19507c = 0.0f;
            this.f19508d = f22;
            this.f19509e = f23;
            this.g = ((f3 + fSqrt2) * f22) / 2.0f;
            this.f19511h = f7;
            return;
        }
        this.j = 3;
        this.f19505a = f3;
        this.f19506b = f11;
        this.f19507c = f11;
        float f24 = (f11 - f3) / f10;
        this.f19508d = f24;
        float f25 = f11 / f10;
        this.f19510f = f25;
        float f26 = ((f3 + f11) * f24) / 2.0f;
        float f27 = (f25 * f11) / 2.0f;
        this.f19509e = ((f7 - f26) - f27) / f11;
        this.g = f26;
        this.f19511h = f7 - f27;
        this.f19512i = f7;
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f3) {
        float f7;
        float f10 = this.f19508d;
        if (f3 <= f10) {
            float f11 = this.f19505a;
            f7 = ((((this.f19506b - f11) * f3) * f3) / (f10 * 2.0f)) + (f11 * f3);
        } else {
            int i10 = this.j;
            if (i10 == 1) {
                f7 = this.g;
            } else {
                float f12 = f3 - f10;
                float f13 = this.f19509e;
                if (f12 < f13) {
                    float f14 = this.g;
                    float f15 = this.f19506b;
                    f7 = ((((this.f19507c - f15) * f12) * f12) / (f13 * 2.0f)) + (f15 * f12) + f14;
                } else if (i10 == 2) {
                    f7 = this.f19511h;
                } else {
                    float f16 = f12 - f13;
                    float f17 = this.f19510f;
                    if (f16 < f17) {
                        float f18 = this.f19511h;
                        float f19 = this.f19507c * f16;
                        f7 = (f18 + f19) - ((f19 * f16) / (f17 * 2.0f));
                    } else {
                        f7 = this.f19512i;
                    }
                }
            }
        }
        this.f19515m = f3;
        return this.f19513k ? this.f19514l - f7 : this.f19514l + f7;
    }
}
