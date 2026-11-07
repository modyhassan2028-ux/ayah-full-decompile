package p132n1;

import Y2.a;
import android.view.View;
import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public abstract class F {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a f19836a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f19837b = new int[10];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float[] f19838c = new float[10];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f19839d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f19840e;

    public final float a(float f3) {
        return (float) this.f19836a.I(f3);
    }

    public void b(int i10, float f3) {
        int[] iArr = this.f19837b;
        if (iArr.length < this.f19839d + 1) {
            this.f19837b = Arrays.copyOf(iArr, iArr.length * 2);
            float[] fArr = this.f19838c;
            this.f19838c = Arrays.copyOf(fArr, fArr.length * 2);
        }
        int[] iArr2 = this.f19837b;
        int i11 = this.f19839d;
        iArr2[i11] = i10;
        this.f19838c[i11] = f3;
        this.f19839d = i11 + 1;
    }

    public abstract void c(View view, float f3);

    /* JADX WARN: Code duplicated, block: B:31:0x009d  */
    public void d(int i10) {
        int i11 = this.f19839d;
        if (i11 == 0) {
            return;
        }
        int[] iArr = this.f19837b;
        float[] fArr = this.f19838c;
        int[] iArr2 = new int[iArr.length + 10];
        iArr2[0] = i11 - 1;
        iArr2[1] = 0;
        int i12 = 2;
        while (i12 > 0) {
            int i13 = i12 - 1;
            int i14 = iArr2[i13];
            int i15 = i12 - 2;
            int i16 = iArr2[i15];
            if (i14 < i16) {
                int i17 = iArr[i16];
                int i18 = i14;
                int i19 = i18;
                while (i18 < i16) {
                    int i20 = iArr[i18];
                    if (i20 <= i17) {
                        int i21 = iArr[i19];
                        iArr[i19] = i20;
                        iArr[i18] = i21;
                        float f3 = fArr[i19];
                        fArr[i19] = fArr[i18];
                        fArr[i18] = f3;
                        i19++;
                    }
                    i18++;
                }
                int i22 = iArr[i19];
                iArr[i19] = iArr[i16];
                iArr[i16] = i22;
                float f7 = fArr[i19];
                fArr[i19] = fArr[i16];
                fArr[i16] = f7;
                iArr2[i15] = i19 - 1;
                iArr2[i13] = i14;
                int i23 = i12 + 1;
                iArr2[i12] = i16;
                i12 += 2;
                iArr2[i23] = i19 + 1;
            } else {
                i12 = i15;
            }
        }
        int i24 = 1;
        for (int i25 = 1; i25 < this.f19839d; i25++) {
            int[] iArr3 = this.f19837b;
            if (iArr3[i25 - 1] != iArr3[i25]) {
                i24++;
            }
        }
        double[] dArr = new double[i24];
        double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, i24, 1);
        int i26 = 0;
        for (int i27 = 0; i27 < this.f19839d; i27++) {
            if (i27 > 0) {
                int[] iArr4 = this.f19837b;
                if (iArr4[i27] != iArr4[i27 - 1]) {
                    dArr[i26] = ((double) this.f19837b[i27]) * 0.01d;
                    dArr2[i26][0] = this.f19838c[i27];
                    i26++;
                }
            } else {
                dArr[i26] = ((double) this.f19837b[i27]) * 0.01d;
                dArr2[i26][0] = this.f19838c[i27];
                i26++;
            }
        }
        this.f19836a = a.x(i10, dArr, dArr2);
    }

    public final String toString() {
        String str = this.f19840e;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        for (int i10 = 0; i10 < this.f19839d; i10++) {
            str = str + "[" + this.f19837b[i10] + " , " + decimalFormat.format(this.f19838c[i10]) + "] ";
        }
        return str;
    }
}
