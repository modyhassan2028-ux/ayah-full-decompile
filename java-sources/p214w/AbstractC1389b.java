package p214w;

import B0.c;
import android.support.v4.media.session.p;

/* JADX INFO: renamed from: w.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1389b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float[] f23472a;

    static {
        float f3;
        float f7;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float[] fArr = new float[101];
        f23472a = fArr;
        float[] fArr2 = new float[101];
        float f17 = 0.0f;
        int i10 = 0;
        float f18 = 0.0f;
        while (true) {
            float f19 = 1.0f;
            if (i10 >= 100) {
                fArr2[100] = 1.0f;
                fArr[100] = 1.0f;
                return;
            }
            float f20 = i10 / 100;
            float f21 = 1.0f;
            while (true) {
                f3 = ((f21 - f17) / 2.0f) + f17;
                f7 = f19 - f3;
                f10 = f3 * 3.0f * f7;
                f11 = f3 * f3 * f3;
                float f22 = (((f3 * 0.35000002f) + (f7 * 0.175f)) * f10) + f11;
                f12 = f19;
                if (Math.abs(f22 - f20) < 1.0E-5d) {
                    break;
                }
                if (f22 > f20) {
                    f21 = f3;
                } else {
                    f17 = f3;
                }
                f19 = f12;
            }
            float f23 = 0.5f;
            fArr[i10] = (((f7 * 0.5f) + f3) * f10) + f11;
            float f24 = f12;
            while (true) {
                f13 = ((f24 - f18) / 2.0f) + f18;
                f14 = f12 - f13;
                f15 = f13 * 3.0f * f14;
                f16 = f13 * f13 * f13;
                float f25 = (((f14 * f23) + f13) * f15) + f16;
                float f26 = f24;
                if (Math.abs(f25 - f20) >= 1.0E-5d) {
                    if (f25 > f20) {
                        f24 = f13;
                    } else {
                        f18 = f13;
                        f24 = f26;
                    }
                    f23 = 0.5f;
                }
            }
            fArr2[i10] = (((f13 * 0.35000002f) + (f14 * 0.175f)) * f15) + f16;
            i10++;
        }
    }

    public static C1388a a(float f3) {
        float f7 = 0.0f;
        float f10 = 1.0f;
        float fK = c.k(f3, 0.0f, 1.0f);
        float f11 = 100;
        int i10 = (int) (f11 * fK);
        if (i10 < 100) {
            float f12 = i10 / f11;
            int i11 = i10 + 1;
            float f13 = i11 / f11;
            float[] fArr = f23472a;
            float f14 = fArr[i10];
            float f15 = (fArr[i11] - f14) / (f13 - f12);
            float fN = p.n(fK, f12, f15, f14);
            f7 = f15;
            f10 = fN;
        }
        return new C1388a(f10, f7);
    }
}
