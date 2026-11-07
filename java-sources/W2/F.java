package W2;

import android.graphics.Matrix;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class F extends E {
    @Override // B9.a
    public final float H(View view) {
        return view.getTransitionAlpha();
    }

    @Override // B9.a
    public final void X(View view, float f3) {
        view.setTransitionAlpha(f3);
    }

    @Override // W2.E, B9.a
    public final void Y(View view, int i10) {
        view.setTransitionVisibility(i10);
    }

    @Override // W2.E
    public final void f0(View view, int i10, int i11, int i12, int i13) {
        view.setLeftTopRightBottom(i10, i11, i12, i13);
    }

    @Override // W2.E
    public final void g0(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // W2.E
    public final void h0(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }
}
