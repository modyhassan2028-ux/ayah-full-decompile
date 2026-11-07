package p177r7;

import R7.f;
import R7.y;
import android.support.v4.media.session.p;

/* JADX INFO: loaded from: classes.dex */
public final class g extends f implements Cloneable {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public float f21591t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public float f21592u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public float f21593v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public float f21594w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public float f21595x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public float f21596y;

    @Override // R7.f
    public final void p(float f3, float f7, float f10, y yVar) {
        float f11;
        float f12;
        float f13 = this.f21593v;
        if (f13 == 0.0f) {
            yVar.d(f3, 0.0f);
            return;
        }
        float f14 = ((this.f21592u * 2.0f) + f13) / 2.0f;
        float f15 = f10 * this.f21591t;
        float f16 = f7 + this.f21595x;
        float fN = p.n(1.0f, f10, f14, this.f21594w * f10);
        if (fN / f14 >= 1.0f) {
            yVar.d(f3, 0.0f);
            return;
        }
        float f17 = this.f21596y;
        float f18 = f17 * f10;
        boolean z10 = f17 == -1.0f || Math.abs((f17 * 2.0f) - f13) < 0.1f;
        if (z10) {
            f11 = fN;
            f12 = 0.0f;
        } else {
            f12 = 1.75f;
            f11 = 0.0f;
        }
        float f19 = f14 + f15;
        float f20 = f11 + f15;
        float fSqrt = (float) Math.sqrt((f19 * f19) - (f20 * f20));
        float f21 = f16 - fSqrt;
        float f22 = f16 + fSqrt;
        float degrees = (float) Math.toDegrees(Math.atan(fSqrt / f20));
        float f23 = (90.0f - degrees) + f12;
        yVar.d(f21, 0.0f);
        float f24 = f21 - f15;
        float f25 = f21 + f15;
        float f26 = f15 * 2.0f;
        yVar.a(f24, 0.0f, f25, f26, 270.0f, degrees);
        if (z10) {
            yVar.a(f16 - f14, (-f14) - f11, f16 + f14, f14 - f11, 180.0f - f23, (f23 * 2.0f) - 180.0f);
        } else {
            float f27 = this.f21592u;
            float f28 = f18 * 2.0f;
            float f29 = f27 + f28;
            float f30 = f16 - f14;
            yVar.a(f30, -(f18 + f27), f29 + f30, f27 + f18, 180.0f - f23, ((f23 * 2.0f) - 180.0f) / 2.0f);
            float f31 = f16 + f14;
            float f32 = this.f21592u;
            yVar.d(f31 - ((f32 / 2.0f) + f18), f32 + f18);
            float f33 = this.f21592u;
            yVar.a(f31 - (f28 + f33), -(f18 + f33), f31, f33 + f18, 90.0f, f23 - 90.0f);
        }
        yVar.a(f22 - f15, 0.0f, f22 + f15, f26, 270.0f - degrees, degrees);
        yVar.d(f3, 0.0f);
    }

    public final void u(float f3) {
        if (f3 < 0.0f) {
            throw new IllegalArgumentException("cradleVerticalOffset must be positive.");
        }
        this.f21594w = f3;
    }
}
