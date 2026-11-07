package K0;

import android.graphics.Matrix;
import android.view.View;
import android.view.ViewParent;

/* JADX INFO: renamed from: K0.i0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0349i0 implements InterfaceC0345g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Matrix f5079a = new Matrix();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f5080b = new int[2];

    @Override // K0.InterfaceC0345g0
    public void a(View view, float[] fArr) {
        Matrix matrix = this.f5079a;
        matrix.reset();
        view.transformMatrixToGlobal(matrix);
        ViewParent parent = view.getParent();
        while (parent instanceof View) {
            view = parent;
            parent = view.getParent();
        }
        int[] iArr = this.f5080b;
        view.getLocationOnScreen(iArr);
        int i10 = iArr[0];
        int i11 = iArr[1];
        view.getLocationInWindow(iArr);
        matrix.postTranslate(iArr[0] - i10, iArr[1] - i11);
        p180s0.F.q(matrix, fArr);
    }
}
