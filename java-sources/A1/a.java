package A1;

import android.graphics.Color;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f460a = new ThreadLocal();

    public static int a(double d5, double d9, double d10) {
        double d11 = (((-0.4986d) * d10) + (((-1.5372d) * d9) + (3.2406d * d5))) / 100.0d;
        double d12 = ((0.0415d * d10) + ((1.8758d * d9) + ((-0.9689d) * d5))) / 100.0d;
        double d13 = ((1.057d * d10) + (((-0.204d) * d9) + (0.0557d * d5))) / 100.0d;
        double dPow = d11 > 0.0031308d ? (Math.pow(d11, 0.4166666666666667d) * 1.055d) - 0.055d : d11 * 12.92d;
        double dPow2 = d12 > 0.0031308d ? (Math.pow(d12, 0.4166666666666667d) * 1.055d) - 0.055d : d12 * 12.92d;
        double dPow3 = d13 > 0.0031308d ? (Math.pow(d13, 0.4166666666666667d) * 1.055d) - 0.055d : d13 * 12.92d;
        int iRound = (int) Math.round(dPow * 255.0d);
        int iMin = iRound < 0 ? 0 : Math.min(iRound, 255);
        int iRound2 = (int) Math.round(dPow2 * 255.0d);
        int iMin2 = iRound2 < 0 ? 0 : Math.min(iRound2, 255);
        int iRound3 = (int) Math.round(dPow3 * 255.0d);
        return Color.rgb(iMin, iMin2, iRound3 >= 0 ? Math.min(iRound3, 255) : 0);
    }

    public static int b(int i10, float f3, int i11) {
        float f7 = 1.0f - f3;
        return Color.argb((int) ((Color.alpha(i11) * f3) + (Color.alpha(i10) * f7)), (int) ((Color.red(i11) * f3) + (Color.red(i10) * f7)), (int) ((Color.green(i11) * f3) + (Color.green(i10) * f7)), (int) ((Color.blue(i11) * f3) + (Color.blue(i10) * f7)));
    }

    public static int c(int i10, int i11) {
        int iAlpha = Color.alpha(i11);
        int iAlpha2 = Color.alpha(i10);
        int i12 = 255 - (((255 - iAlpha2) * (255 - iAlpha)) / 255);
        return Color.argb(i12, d(Color.red(i10), iAlpha2, Color.red(i11), iAlpha, i12), d(Color.green(i10), iAlpha2, Color.green(i11), iAlpha, i12), d(Color.blue(i10), iAlpha2, Color.blue(i11), iAlpha, i12));
    }

    public static int d(int i10, int i11, int i12, int i13, int i14) {
        if (i14 == 0) {
            return 0;
        }
        return (((255 - i11) * (i12 * i13)) + ((i10 * 255) * i11)) / (i14 * 255);
    }

    public static int e(int i10, int i11) {
        if (i11 < 0 || i11 > 255) {
            throw new IllegalArgumentException("alpha must be between 0 and 255.");
        }
        return (i10 & 16777215) | (i11 << 24);
    }
}
