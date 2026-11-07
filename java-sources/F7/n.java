package F7;

import android.animation.TypeEvaluator;
import android.graphics.Matrix;

/* JADX INFO: loaded from: classes.dex */
public final class n implements TypeEvaluator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float[] f2461a = new float[9];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float[] f2462b = new float[9];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Matrix f2463c = new Matrix();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u f2464d;

    public n(u uVar) {
        this.f2464d = uVar;
    }

    @Override // android.animation.TypeEvaluator
    public final Object evaluate(float f3, Object obj, Object obj2) {
        this.f2464d.f2509p = f3;
        float[] fArr = this.f2461a;
        ((Matrix) obj).getValues(fArr);
        float[] fArr2 = this.f2462b;
        ((Matrix) obj2).getValues(fArr2);
        for (int i10 = 0; i10 < 9; i10++) {
            float f7 = fArr2[i10];
            float f10 = fArr[i10];
            fArr2[i10] = android.support.v4.media.session.p.n(f7, f10, f3, f10);
        }
        Matrix matrix = this.f2463c;
        matrix.setValues(fArr2);
        return matrix;
    }
}
