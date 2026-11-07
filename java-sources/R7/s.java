package R7;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;

/* JADX INFO: loaded from: classes.dex */
public final class s extends x {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u f7371c;

    public s(u uVar) {
        this.f7371c = uVar;
    }

    @Override // R7.x
    public final void a(Matrix matrix, Q7.a aVar, int i10, Canvas canvas) {
        u uVar = this.f7371c;
        float f3 = uVar.f7380f;
        float f7 = uVar.g;
        RectF rectF = new RectF(uVar.f7376b, uVar.f7377c, uVar.f7378d, uVar.f7379e);
        Paint paint = aVar.f6873b;
        boolean z10 = f7 < 0.0f;
        Path path = aVar.g;
        int[] iArr = Q7.a.f6870k;
        if (z10) {
            iArr[0] = 0;
            iArr[1] = aVar.f6877f;
            iArr[2] = aVar.f6876e;
            iArr[3] = aVar.f6875d;
        } else {
            path.rewind();
            path.moveTo(rectF.centerX(), rectF.centerY());
            path.arcTo(rectF, f3, f7);
            path.close();
            float f10 = -i10;
            rectF.inset(f10, f10);
            iArr[0] = 0;
            iArr[1] = aVar.f6875d;
            iArr[2] = aVar.f6876e;
            iArr[3] = aVar.f6877f;
        }
        float fWidth = rectF.width() / 2.0f;
        if (fWidth <= 0) {
            return;
        }
        float f11 = 1.0f - (i10 / fWidth);
        float[] fArr = Q7.a.f6871l;
        fArr[1] = f11;
        fArr[2] = ((1.0f - f11) / 2.0f) + f11;
        paint.setShader(new RadialGradient(rectF.centerX(), rectF.centerY(), fWidth, iArr, fArr, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.scale(1.0f, rectF.height() / rectF.width());
        if (!z10) {
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            canvas.drawPath(path, aVar.f6878h);
        }
        canvas.drawArc(rectF, f3, f7, true, paint);
        canvas.restore();
    }
}
