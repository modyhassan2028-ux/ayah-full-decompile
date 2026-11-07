package R7;

import android.graphics.Matrix;
import android.graphics.Path;

/* JADX INFO: loaded from: classes.dex */
public final class v extends w {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f7381b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f7382c;

    @Override // R7.w
    public final void a(Matrix matrix, Path path) {
        Matrix matrix2 = this.f7383a;
        matrix.invert(matrix2);
        path.transform(matrix2);
        path.lineTo(this.f7381b, this.f7382c);
        path.transform(matrix);
    }
}
