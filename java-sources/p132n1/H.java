package p132n1;

import android.util.SparseArray;
import android.view.View;
import java.lang.reflect.Array;
import s1.a;

/* JADX INFO: loaded from: classes.dex */
public final class H extends K {
    public SparseArray g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public SparseArray f19841h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float[] f19842i;
    public float[] j;

    @Override // p132n1.K
    public final boolean b(float f3, long j, View view, s sVar) {
        this.f19843a.K(f3, this.f19842i);
        float[] fArr = this.f19842i;
        float f7 = fArr[fArr.length - 2];
        float f10 = fArr[fArr.length - 1];
        float f11 = (float) (((((j - this.f19847e) * 1.0E-9d) * ((double) f7)) + ((double) this.f19848f)) % 1.0d);
        this.f19848f = f11;
        this.f19847e = j;
        float fSin = (float) Math.sin(f11 * 6.2831855f);
        this.f19846d = false;
        int i10 = 0;
        while (true) {
            float[] fArr2 = this.j;
            if (i10 >= fArr2.length) {
                break;
            }
            boolean z10 = this.f19846d;
            float f12 = this.f19842i[i10];
            this.f19846d = z10 | (((double) f12) != 0.0d);
            fArr2[i10] = (f12 * fSin) + f10;
            i10++;
        }
        ((a) this.g.valueAt(0)).g(view, this.j);
        if (f7 != 0.0f) {
            this.f19846d = true;
        }
        return this.f19846d;
    }

    @Override // p132n1.K
    public final void c(int i10) {
        SparseArray sparseArray = this.g;
        int size = sparseArray.size();
        int iD = ((a) sparseArray.valueAt(0)).d();
        double[] dArr = new double[size];
        int i11 = iD + 2;
        this.f19842i = new float[i11];
        this.j = new float[iD];
        double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, size, i11);
        for (int i12 = 0; i12 < size; i12++) {
            int iKeyAt = sparseArray.keyAt(i12);
            a aVar = (a) sparseArray.valueAt(i12);
            float[] fArr = (float[]) this.f19841h.valueAt(i12);
            dArr[i12] = ((double) iKeyAt) * 0.01d;
            aVar.c(this.f19842i);
            int i13 = 0;
            while (true) {
                float[] fArr2 = this.f19842i;
                if (i13 < fArr2.length) {
                    dArr2[i12][i13] = fArr2[i13];
                    i13++;
                }
            }
            double[] dArr3 = dArr2[i12];
            dArr3[iD] = fArr[0];
            dArr3[iD + 1] = fArr[1];
        }
        this.f19843a = Y2.a.x(i10, dArr, dArr2);
    }
}
