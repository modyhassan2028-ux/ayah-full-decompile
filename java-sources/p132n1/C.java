package p132n1;

import android.util.SparseArray;
import android.view.View;
import java.lang.reflect.Array;
import s1.a;

/* JADX INFO: loaded from: classes.dex */
public final class C extends F {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public SparseArray f19834f;
    public float[] g;

    @Override // p132n1.F
    public final void b(int i10, float f3) {
        throw new RuntimeException("don't call for custom attribute call setPoint(pos, ConstraintAttribute)");
    }

    @Override // p132n1.F
    public final void c(View view, float f3) {
        this.f19836a.K(f3, this.g);
        ((a) this.f19834f.valueAt(0)).g(view, this.g);
    }

    @Override // p132n1.F
    public final void d(int i10) {
        SparseArray sparseArray = this.f19834f;
        int size = sparseArray.size();
        int iD = ((a) sparseArray.valueAt(0)).d();
        double[] dArr = new double[size];
        this.g = new float[iD];
        double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, size, iD);
        for (int i11 = 0; i11 < size; i11++) {
            int iKeyAt = sparseArray.keyAt(i11);
            a aVar = (a) sparseArray.valueAt(i11);
            dArr[i11] = ((double) iKeyAt) * 0.01d;
            aVar.c(this.g);
            int i12 = 0;
            while (true) {
                float[] fArr = this.g;
                if (i12 < fArr.length) {
                    dArr2[i11][i12] = fArr[i12];
                    i12++;
                }
            }
        }
        this.f19836a = Y2.a.x(i10, dArr, dArr2);
    }
}
