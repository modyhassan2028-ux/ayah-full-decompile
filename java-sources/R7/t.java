package R7;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;

/* JADX INFO: loaded from: classes.dex */
public final class t extends x {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v f7372c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f7373d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f7374e;

    public t(v vVar, float f3, float f7) {
        this.f7372c = vVar;
        this.f7373d = f3;
        this.f7374e = f7;
    }

    @Override // R7.x
    public final void a(Matrix matrix, Q7.a aVar, int i10, Canvas canvas) {
        v vVar = this.f7372c;
        float f3 = vVar.f7382c;
        float f7 = this.f7374e;
        float f10 = vVar.f7381b;
        float f11 = this.f7373d;
        RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot(f3 - f7, f10 - f11), 0.0f);
        Matrix matrix2 = this.f7385a;
        matrix2.set(matrix);
        matrix2.preTranslate(f11, f7);
        matrix2.preRotate(b());
        aVar.getClass();
        rectF.bottom += i10;
        rectF.offset(0.0f, -i10);
        int i11 = aVar.f6877f;
        int[] iArr = Q7.a.f6869i;
        iArr[0] = i11;
        iArr[1] = aVar.f6876e;
        iArr[2] = aVar.f6875d;
        Paint paint = aVar.f6874c;
        float f12 = rectF.left;
        paint.setShader(new LinearGradient(f12, rectF.top, f12, rectF.bottom, iArr, Q7.a.j, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix2);
        canvas.drawRect(rectF, paint);
        canvas.restore();
    }

    public final float b() {
        v vVar = this.f7372c;
        return (float) Math.toDegrees(Math.atan((vVar.f7382c - this.f7374e) / (vVar.f7381b - this.f7373d)));
    }
}
