package p132n1;

import J0.C0280d0;
import Y2.a;
import android.view.View;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import p074h0.i;

/* JADX INFO: renamed from: n1.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1222h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C0280d0 f19873a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f19874b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f19875c = new ArrayList();

    public final float a(float f3) {
        C0280d0 c0280d0 = this.f19873a;
        a aVar = (a) c0280d0.g;
        if (aVar != null) {
            aVar.J(f3, (double[]) c0280d0.f4068h);
        } else {
            double[] dArr = (double[]) c0280d0.f4068h;
            dArr[0] = ((float[]) c0280d0.f4067f)[0];
            dArr[1] = ((float[]) c0280d0.f4064c)[0];
        }
        return (float) ((((i) c0280d0.f4063b).w(f3) * ((double[]) c0280d0.f4068h)[1]) + ((double[]) c0280d0.f4068h)[0]);
    }

    public final float b(float f3) {
        double d5;
        C0280d0 c0280d0 = this.f19873a;
        i iVar = (i) c0280d0.f4063b;
        a aVar = (a) c0280d0.g;
        if (aVar != null) {
            double d9 = f3;
            aVar.N(d9, (double[]) c0280d0.f4069i);
            ((a) c0280d0.g).J(d9, (double[]) c0280d0.f4068h);
        } else {
            double[] dArr = (double[]) c0280d0.f4069i;
            dArr[0] = 0.0d;
            dArr[1] = 0.0d;
        }
        double d10 = f3;
        double dW = iVar.w(d10);
        iVar.getClass();
        double d11 = 0.0d;
        if (d10 <= 0.0d) {
            d5 = 1.0E-5d;
        } else {
            d5 = d10 >= 1.0d ? 0.999999d : d10;
        }
        int iBinarySearch = Arrays.binarySearch((double[]) iVar.f16423t, d5);
        if (iBinarySearch <= 0 && iBinarySearch != 0) {
            int i10 = -iBinarySearch;
            int i11 = i10 - 1;
            float[] fArr = (float[]) iVar.f16422s;
            float f7 = fArr[i11];
            int i12 = i10 - 2;
            float f10 = fArr[i12];
            double d12 = f7 - f10;
            double[] dArr2 = (double[]) iVar.f16423t;
            double d13 = dArr2[i11];
            double d14 = dArr2[i12];
            double d15 = d12 / (d13 - d14);
            d11 = (((double) f10) - (d15 * d14)) + (d5 * d15);
        }
        double dCos = Math.cos(iVar.u(d10) * 6.283185307179586d);
        double[] dArr3 = (double[]) c0280d0.f4069i;
        return (float) ((dCos * d11 * 6.283185307179586d * ((double[]) c0280d0.f4068h)[1]) + (dW * dArr3[r6]) + dArr3[0]);
    }

    public abstract void c(View view, float f3);

    public final String toString() {
        String str = this.f19874b;
        new DecimalFormat("##.##");
        Iterator it = this.f19875c.iterator();
        if (it.hasNext()) {
            throw p245z2.a.z(it);
        }
        return str;
    }
}
