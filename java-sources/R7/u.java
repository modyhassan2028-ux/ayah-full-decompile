package R7;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;

/* JADX INFO: loaded from: classes.dex */
public final class u extends w {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final RectF f7375h = new RectF();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f7376b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f7377c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f7378d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f7379e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f7380f;
    public float g;

    public u(float f3, float f7, float f10, float f11) {
        this.f7376b = f3;
        this.f7377c = f7;
        this.f7378d = f10;
        this.f7379e = f11;
    }

    @Override // R7.w
    public final void a(Matrix matrix, Path path) {
        Matrix matrix2 = this.f7383a;
        matrix.invert(matrix2);
        path.transform(matrix2);
        float f3 = this.f7378d;
        float f7 = this.f7379e;
        RectF rectF = f7375h;
        rectF.set(this.f7376b, this.f7377c, f3, f7);
        path.arcTo(rectF, this.f7380f, this.g, false);
        path.transform(matrix);
    }
}
