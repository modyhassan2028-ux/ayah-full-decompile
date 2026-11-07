package p172r1;

import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float[] f21405a = new float[20];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ColorMatrix f21406b = new ColorMatrix();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ColorMatrix f21407c = new ColorMatrix();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f21408d = 1.0f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f21409e = 1.0f;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f21410f = 1.0f;
    public float g = 1.0f;

    public final void a(ImageView imageView) {
        boolean z10;
        float f3;
        char c10;
        float fLog;
        float fPow;
        float f7;
        float fLog2;
        ColorMatrix colorMatrix = this.f21406b;
        colorMatrix.reset();
        float f10 = this.f21409e;
        char c11 = 16;
        char c12 = 15;
        char c13 = 14;
        char c14 = '\r';
        char c15 = 11;
        float[] fArr = this.f21405a;
        boolean z11 = true;
        if (f10 != 1.0f) {
            float f11 = 1.0f - f10;
            float f12 = 0.2999f * f11;
            float f13 = 0.587f * f11;
            float f14 = f11 * 0.114f;
            fArr[0] = f12 + f10;
            fArr[1] = f13;
            fArr[2] = f14;
            fArr[3] = 0.0f;
            fArr[4] = 0.0f;
            fArr[5] = f12;
            fArr[6] = f13 + f10;
            fArr[7] = f14;
            fArr[8] = 0.0f;
            fArr[9] = 0.0f;
            fArr[10] = f12;
            fArr[11] = f13;
            fArr[12] = f14 + f10;
            fArr[13] = 0.0f;
            fArr[14] = 0.0f;
            fArr[15] = 0.0f;
            fArr[16] = 0.0f;
            fArr[17] = 0.0f;
            fArr[18] = 1.0f;
            fArr[19] = 0.0f;
            colorMatrix.set(fArr);
            z10 = true;
        } else {
            z10 = false;
        }
        float f15 = this.f21410f;
        ColorMatrix colorMatrix2 = this.f21407c;
        if (f15 != 1.0f) {
            colorMatrix2.setScale(f15, f15, f15, 1.0f);
            colorMatrix.postConcat(colorMatrix2);
            z10 = true;
        }
        float f16 = this.g;
        if (f16 != 1.0f) {
            if (f16 <= 0.0f) {
                f16 = 0.01f;
            }
            float f17 = (5000.0f / f16) / 100.0f;
            f3 = 1.0f;
            if (f17 > 66.0f) {
                double d5 = f17 - 60.0f;
                fPow = ((float) Math.pow(d5, -0.13320475816726685d)) * 329.69873f;
                fLog = ((float) Math.pow(d5, 0.07551484555006027d)) * 288.12216f;
            } else {
                fLog = (((float) Math.log(f17)) * 99.4708f) - 161.11957f;
                fPow = 255.0f;
            }
            if (f17 >= 1115947008) {
                f7 = 305.0448f;
                fLog2 = 255.0f;
            } else if (f17 > 19.0f) {
                f7 = 305.0448f;
                fLog2 = (((float) Math.log(f17 - 10.0f)) * 138.51773f) - 305.0448f;
            } else {
                f7 = 305.0448f;
                fLog2 = 0.0f;
            }
            float fMin = Math.min(255.0f, Math.max(fPow, 0.0f));
            float fMin2 = Math.min(255.0f, Math.max(fLog, 0.0f));
            float fMin3 = Math.min(255.0f, Math.max(fLog2, 0.0f));
            float fLog3 = (((float) Math.log(50.0f)) * 99.4708f) - 161.11957f;
            c10 = '\f';
            float fLog4 = (((float) Math.log(40.0f)) * 138.51773f) - f7;
            float fMin4 = Math.min(255.0f, Math.max(255.0f, 0.0f));
            float fMin5 = Math.min(255.0f, Math.max(fLog3, 0.0f));
            float fMin6 = fMin3 / Math.min(255.0f, Math.max(fLog4, 0.0f));
            fArr[0] = fMin / fMin4;
            fArr[1] = 0.0f;
            fArr[2] = 0.0f;
            fArr[3] = 0.0f;
            fArr[4] = 0.0f;
            fArr[5] = 0.0f;
            fArr[6] = fMin2 / fMin5;
            fArr[7] = 0.0f;
            fArr[8] = 0.0f;
            fArr[9] = 0.0f;
            fArr[10] = 0.0f;
            fArr[c15] = 0.0f;
            fArr[12] = fMin6;
            fArr[c14] = 0.0f;
            fArr[c13] = 0.0f;
            fArr[c12] = 0.0f;
            fArr[c11] = 0.0f;
            fArr[17] = 0.0f;
            fArr[18] = 1.0f;
            fArr[19] = 0.0f;
            colorMatrix2.set(fArr);
            colorMatrix.postConcat(colorMatrix2);
            z10 = true;
        } else {
            f3 = 1.0f;
            c11 = 16;
            c12 = 15;
            c13 = 14;
            c14 = '\r';
            c10 = '\f';
            c15 = 11;
        }
        float f18 = this.f21408d;
        if (f18 != f3) {
            fArr[0] = f18;
            fArr[1] = 0.0f;
            fArr[2] = 0.0f;
            fArr[3] = 0.0f;
            fArr[4] = 0.0f;
            fArr[5] = 0.0f;
            fArr[6] = f18;
            fArr[7] = 0.0f;
            fArr[8] = 0.0f;
            fArr[9] = 0.0f;
            fArr[10] = 0.0f;
            fArr[c15] = 0.0f;
            fArr[c10] = f18;
            fArr[c14] = 0.0f;
            fArr[c13] = 0.0f;
            fArr[c12] = 0.0f;
            fArr[c11] = 0.0f;
            fArr[17] = 0.0f;
            fArr[18] = f3;
            fArr[19] = 0.0f;
            colorMatrix2.set(fArr);
            colorMatrix.postConcat(colorMatrix2);
        } else {
            z11 = z10;
        }
        if (z11) {
            imageView.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
        } else {
            imageView.clearColorFilter();
        }
    }
}
