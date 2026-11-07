package K0;

import android.graphics.Matrix;
import android.view.View;
import java.util.ArrayList;

/* JADX INFO: renamed from: K0.h0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0347h0 implements InterfaceC0345g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f5076a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float[] f5077b;

    public C0347h0(ArrayList arrayList, ArrayList arrayList2) {
        int size = arrayList.size();
        this.f5076a = new int[size];
        this.f5077b = new float[size];
        for (int i10 = 0; i10 < size; i10++) {
            this.f5076a[i10] = ((Integer) arrayList.get(i10)).intValue();
            this.f5077b[i10] = ((Float) arrayList2.get(i10)).floatValue();
        }
    }

    @Override // K0.InterfaceC0345g0
    public void a(View view, float[] fArr) {
        p180s0.A.d(fArr);
        b(view, fArr);
    }

    public void b(View view, float[] fArr) {
        Object parent = view.getParent();
        boolean z10 = parent instanceof View;
        float[] fArr2 = this.f5077b;
        if (z10) {
            b((View) parent, fArr);
            float f3 = -view.getScrollX();
            float f7 = -view.getScrollY();
            p180s0.A.d(fArr2);
            p180s0.A.f(fArr2, f3, f7);
            P.p(fArr, fArr2);
            float left = view.getLeft();
            float top = view.getTop();
            p180s0.A.d(fArr2);
            p180s0.A.f(fArr2, left, top);
            P.p(fArr, fArr2);
        } else {
            int[] iArr = this.f5076a;
            view.getLocationInWindow(iArr);
            float f10 = -view.getScrollX();
            float f11 = -view.getScrollY();
            p180s0.A.d(fArr2);
            p180s0.A.f(fArr2, f10, f11);
            P.p(fArr, fArr2);
            float f12 = iArr[0];
            float f13 = iArr[1];
            p180s0.A.d(fArr2);
            p180s0.A.f(fArr2, f12, f13);
            P.p(fArr, fArr2);
        }
        Matrix matrix = view.getMatrix();
        if (matrix.isIdentity()) {
            return;
        }
        p180s0.F.q(matrix, fArr2);
        P.p(fArr, fArr2);
    }

    public C0347h0(int i10, int i11) {
        this.f5076a = new int[]{i10, i11};
        this.f5077b = new float[]{0.0f, 1.0f};
    }

    public C0347h0(int i10, int i11, int i12) {
        this.f5076a = new int[]{i10, i11, i12};
        this.f5077b = new float[]{0.0f, 0.5f, 1.0f};
    }

    public C0347h0(float[] fArr) {
        this.f5077b = fArr;
        this.f5076a = new int[2];
    }
}
