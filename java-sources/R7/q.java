package R7;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.BitSet;

/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y[] f7359a = new y[4];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Matrix[] f7360b = new Matrix[4];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Matrix[] f7361c = new Matrix[4];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final PointF f7362d = new PointF();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Path f7363e = new Path();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Path f7364f = new Path();
    public final y g = new y();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float[] f7365h = new float[2];

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float[] f7366i = new float[2];
    public final Path j = new Path();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Path f7367k = new Path();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f7368l = true;

    public q() {
        for (int i10 = 0; i10 < 4; i10++) {
            this.f7359a[i10] = new y();
            this.f7360b[i10] = new Matrix();
            this.f7361c[i10] = new Matrix();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(o oVar, float f3, RectF rectF, p248z6.c cVar, Path path) {
        Matrix[] matrixArr;
        float[] fArr;
        int i10;
        y[] yVarArr;
        char c10;
        Matrix[] matrixArr2;
        f fVar;
        char c11;
        InterfaceC0482d interfaceC0482d;
        p050e8.b bVar;
        path.rewind();
        Path path2 = this.f7363e;
        path2.rewind();
        Path path3 = this.f7364f;
        path3.rewind();
        path3.addRect(rectF, Path.Direction.CW);
        int i11 = 0;
        while (true) {
            matrixArr = this.f7361c;
            fArr = this.f7365h;
            yVarArr = this.f7359a;
            c10 = 0;
            matrixArr2 = this.f7360b;
            if (i11 >= 4) {
                break;
            }
            if (i11 == 1) {
                interfaceC0482d = oVar.g;
            } else if (i11 != 2) {
                interfaceC0482d = i11 != 3 ? oVar.f7353f : oVar.f7352e;
            } else {
                interfaceC0482d = oVar.f7354h;
            }
            if (i11 == 1) {
                bVar = oVar.f7350c;
            } else if (i11 != 2) {
                bVar = i11 != 3 ? oVar.f7349b : oVar.f7348a;
            } else {
                bVar = oVar.f7351d;
            }
            y yVar = yVarArr[i11];
            bVar.getClass();
            bVar.v(yVar, f3, interfaceC0482d.a(rectF));
            int i12 = i11 + 1;
            float f7 = (i12 % 4) * 90;
            matrixArr2[i11].reset();
            PointF pointF = this.f7362d;
            if (i11 == 1) {
                pointF.set(rectF.right, rectF.bottom);
            } else if (i11 == 2) {
                pointF.set(rectF.left, rectF.bottom);
            } else if (i11 != 3) {
                pointF.set(rectF.right, rectF.top);
            } else {
                pointF.set(rectF.left, rectF.top);
            }
            matrixArr2[i11].setTranslate(pointF.x, pointF.y);
            matrixArr2[i11].preRotate(f7);
            y yVar2 = yVarArr[i11];
            fArr[0] = yVar2.f7388c;
            fArr[1] = yVar2.f7389d;
            matrixArr2[i11].mapPoints(fArr);
            matrixArr[i11].reset();
            matrixArr[i11].setTranslate(fArr[0], fArr[1]);
            matrixArr[i11].preRotate(f7);
            i11 = i12;
        }
        char c12 = 1;
        int i13 = 0;
        for (i10 = 4; i13 < i10; i10 = 4) {
            y yVar3 = yVarArr[i13];
            fArr[c10] = yVar3.f7386a;
            fArr[c12] = yVar3.f7387b;
            matrixArr2[i13].mapPoints(fArr);
            if (i13 == 0) {
                path.moveTo(fArr[c10], fArr[c12]);
            } else {
                path.lineTo(fArr[c10], fArr[c12]);
            }
            yVarArr[i13].c(matrixArr2[i13], path);
            if (cVar != null) {
                y yVar4 = yVarArr[i13];
                Matrix matrix = matrixArr2[i13];
                i iVar = (i) cVar.f24847s;
                BitSet bitSet = iVar.f7328u;
                yVar4.getClass();
                bitSet.set(i13, (boolean) c10);
                x[] xVarArr = iVar.f7326s;
                yVar4.b(yVar4.f7391f);
                xVarArr[i13] = new r(new ArrayList(yVar4.f7392h), new Matrix(matrix));
            }
            int i14 = i13 + 1;
            int i15 = i14 % 4;
            y yVar5 = yVarArr[i13];
            fArr[0] = yVar5.f7388c;
            fArr[1] = yVar5.f7389d;
            matrixArr2[i13].mapPoints(fArr);
            y yVar6 = yVarArr[i15];
            float f10 = yVar6.f7386a;
            float[] fArr2 = this.f7366i;
            fArr2[0] = f10;
            fArr2[1] = yVar6.f7387b;
            matrixArr2[i15].mapPoints(fArr2);
            y[] yVarArr2 = yVarArr;
            float fMax = Math.max(((float) Math.hypot(fArr[0] - fArr2[0], fArr[1] - fArr2[1])) - 0.001f, 0.0f);
            y yVar7 = yVarArr2[i13];
            fArr[0] = yVar7.f7388c;
            fArr[1] = yVar7.f7389d;
            matrixArr2[i13].mapPoints(fArr);
            float fAbs = (i13 == 1 || i13 == 3) ? Math.abs(rectF.centerX() - fArr[0]) : Math.abs(rectF.centerY() - fArr[1]);
            y yVar8 = this.g;
            yVar8.e(0.0f, 0.0f, 270.0f, 0.0f);
            if (i13 == 1) {
                fVar = oVar.f7356k;
            } else if (i13 != 2) {
                fVar = i13 != 3 ? oVar.j : oVar.f7355i;
            } else {
                fVar = oVar.f7357l;
            }
            fVar.p(fMax, fAbs, f3, yVar8);
            Path path4 = this.j;
            path4.reset();
            yVar8.c(matrixArr[i13], path4);
            if (this.f7368l && (fVar.n() || b(path4, i13) || b(path4, i15))) {
                path4.op(path4, path3, Path.Op.DIFFERENCE);
                fArr[0] = yVar8.f7386a;
                c12 = 1;
                fArr[1] = yVar8.f7387b;
                matrixArr[i13].mapPoints(fArr);
                path2.moveTo(fArr[0], fArr[1]);
                yVar8.c(matrixArr[i13], path2);
            } else {
                c12 = 1;
                yVar8.c(matrixArr[i13], path);
            }
            if (cVar != null) {
                Matrix matrix2 = matrixArr[i13];
                i iVar2 = (i) cVar.f24847s;
                c11 = 0;
                iVar2.f7328u.set(i13 + 4, false);
                x[] xVarArr2 = iVar2.f7327t;
                yVar8.b(yVar8.f7391f);
                xVarArr2[i13] = new r(new ArrayList(yVar8.f7392h), new Matrix(matrix2));
            } else {
                c11 = 0;
            }
            c10 = c11;
            yVarArr = yVarArr2;
            i13 = i14;
        }
        path.close();
        path2.close();
        if (path2.isEmpty()) {
            return;
        }
        path.op(path2, Path.Op.UNION);
    }

    public final boolean b(Path path, int i10) {
        Path path2 = this.f7367k;
        path2.reset();
        this.f7359a[i10].c(this.f7360b[i10], path2);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        path2.computeBounds(rectF, true);
        path.op(path2, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        return !rectF.isEmpty() || (rectF.width() > 1.0f && rectF.height() > 1.0f);
    }
}
