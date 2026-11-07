package p223x;

import android.support.v4.media.session.p;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f24075a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f24076b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f24077c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f24078d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f24079e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f24080f;
    public final float g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f24081h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f24082i;
    public final float[] j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final float f24083k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final float f24084l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final float f24085m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final float f24086n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final float f24087o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f24088p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final float f24089q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final float f24090r;

    public r(int i10, float f3, float f7, float f10, float f11, float f12, float f13) {
        boolean z10;
        int i11;
        float f14;
        float f15;
        this.f24075a = f3;
        this.f24076b = f7;
        this.f24077c = f10;
        this.f24078d = f11;
        this.f24079e = f12;
        this.f24080f = f13;
        float f16 = f12 - f10;
        float f17 = f13 - f11;
        float f18 = 0.0f;
        int i12 = 1;
        boolean z11 = i10 == 1 || (i10 == 4 ? f17 > 0.0f : !(i10 != 5 || f17 >= 0.0f));
        float f19 = z11 ? -1.0f : 1.0f;
        this.f24085m = f19;
        float f20 = 1 / (f7 - f3);
        this.f24083k = f20;
        float[] fArr = new float[101];
        this.j = fArr;
        boolean z12 = i10 == 3;
        if (z12 || Math.abs(f16) < 0.001f || Math.abs(f17) < 0.001f) {
            float fHypot = (float) Math.hypot(f17, f16);
            this.g = fHypot;
            this.f24084l = fHypot * f20;
            this.f24089q = f16 * f20;
            this.f24090r = f17 * f20;
            this.f24086n = Float.NaN;
            this.f24087o = Float.NaN;
            z10 = true;
        } else {
            this.f24086n = f16 * f19;
            this.f24087o = f17 * (-f19);
            this.f24089q = z11 ? f12 : f10;
            this.f24090r = z11 ? f11 : f13;
            float f21 = f12 - f10;
            float f22 = f11 - f13;
            float[] fArr2 = AbstractC1413d.f23958i;
            int i13 = 90;
            float f23 = 90;
            float f24 = f22;
            float fHypot2 = 0.0f;
            float f25 = 0.0f;
            int i14 = 1;
            while (true) {
                i11 = i12;
                f14 = f18;
                double radians = (float) Math.toRadians((((double) i14) * 90.0d) / ((double) i13));
                float fSin = ((float) Math.sin(radians)) * f21;
                float fCos = ((float) Math.cos(radians)) * f22;
                float f26 = fSin - f25;
                f15 = f23;
                fHypot2 += (float) Math.hypot(f26, fCos - f24);
                fArr2[i14] = fHypot2;
                i13 = 90;
                if (i14 == 90) {
                    break;
                }
                i14++;
                f24 = fCos;
                f23 = f15;
                f18 = f14;
                f25 = fSin;
                i12 = i11;
            }
            this.g = fHypot2;
            int i15 = i11;
            while (true) {
                fArr2[i15] = fArr2[i15] / fHypot2;
                if (i15 == 90) {
                    break;
                } else {
                    i15++;
                }
            }
            int length = fArr.length;
            for (int i16 = 0; i16 < length; i16++) {
                float f27 = i16 / 100.0f;
                int iBinarySearch = Arrays.binarySearch(fArr2, 0, 91, f27);
                if (iBinarySearch >= 0) {
                    fArr[i16] = iBinarySearch / f15;
                } else if (iBinarySearch == -1) {
                    fArr[i16] = f14;
                } else {
                    int i17 = -iBinarySearch;
                    int i18 = i17 - 2;
                    float f28 = i18;
                    float f29 = fArr2[i18];
                    fArr[i16] = (((f27 - f29) / (fArr2[i17 - 1] - f29)) + f28) / f15;
                }
            }
            this.f24084l = this.g * this.f24083k;
            z10 = z12;
        }
        this.f24088p = z10;
    }

    public final float a() {
        float f3 = this.f24086n * this.f24082i;
        return f3 * this.f24085m * (this.f24084l / ((float) Math.hypot(f3, (-this.f24087o) * this.f24081h)));
    }

    public final float b() {
        float f3 = this.f24086n * this.f24082i;
        float f7 = (-this.f24087o) * this.f24081h;
        return f7 * this.f24085m * (this.f24084l / ((float) Math.hypot(f3, f7)));
    }

    public final void c(float f3) {
        float f7 = (this.f24085m == -1.0f ? this.f24076b - f3 : f3 - this.f24075a) * this.f24083k;
        float fN = 0.0f;
        if (f7 > 0.0f) {
            fN = 1.0f;
            if (f7 < 1.0f) {
                float f10 = f7 * 100;
                int i10 = (int) f10;
                float[] fArr = this.j;
                float f11 = fArr[i10];
                fN = p.n(fArr[i10 + 1], f11, f10 - i10, f11);
            }
        }
        double d5 = fN * 1.5707964f;
        this.f24081h = (float) Math.sin(d5);
        this.f24082i = (float) Math.cos(d5);
    }
}
