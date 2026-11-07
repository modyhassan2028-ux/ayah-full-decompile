package X2;

import G.a0;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import java.util.ArrayList;
import u.C1350e;

/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final Matrix f9898p = new Matrix();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Path f9899a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Path f9900b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Matrix f9901c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Paint f9902d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Paint f9903e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public PathMeasure f9904f;
    public final j g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f9905h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f9906i;
    public float j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f9907k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f9908l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f9909m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Boolean f9910n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final C1350e f9911o;

    public m() {
        this.f9901c = new Matrix();
        this.f9905h = 0.0f;
        this.f9906i = 0.0f;
        this.j = 0.0f;
        this.f9907k = 0.0f;
        this.f9908l = 255;
        this.f9909m = null;
        this.f9910n = null;
        this.f9911o = new C1350e(0);
        this.g = new j();
        this.f9899a = new Path();
        this.f9900b = new Path();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(j jVar, Matrix matrix, Canvas canvas, int i10, int i11) {
        int i12;
        float f3;
        int i13;
        Matrix matrix2 = jVar.f9886a;
        ArrayList arrayList = jVar.f9887b;
        matrix2.set(matrix);
        Matrix matrix3 = jVar.f9886a;
        matrix3.preConcat(jVar.j);
        canvas.save();
        char c10 = 0;
        int i14 = 0;
        while (i14 < arrayList.size()) {
            k kVar = (k) arrayList.get(i14);
            if (kVar instanceof j) {
                a((j) kVar, matrix3, canvas, i10, i11);
            } else {
                if (kVar instanceof l) {
                    l lVar = (l) kVar;
                    float f7 = i10 / this.j;
                    float f10 = i11 / this.f9907k;
                    float fMin = Math.min(f7, f10);
                    Matrix matrix4 = this.f9901c;
                    matrix4.set(matrix3);
                    matrix4.postScale(f7, f10);
                    float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
                    matrix3.mapVectors(fArr);
                    float fHypot = (float) Math.hypot(fArr[c10], fArr[1]);
                    boolean z10 = c10;
                    i12 = i14;
                    float fHypot2 = (float) Math.hypot(fArr[2], fArr[3]);
                    float f11 = (fArr[z10 ? 1 : 0] * fArr[3]) - (fArr[1] * fArr[2]);
                    float fMax = Math.max(fHypot, fHypot2);
                    float fAbs = fMax > 0.0f ? Math.abs(f11) / fMax : 0.0f;
                    if (fAbs != 0.0f) {
                        Path path = this.f9899a;
                        path.reset();
                        A1.e[] eVarArr = lVar.f9895a;
                        if (eVarArr != null) {
                            A1.e.b(eVarArr, path);
                        }
                        Path path2 = this.f9900b;
                        path2.reset();
                        if (lVar instanceof h) {
                            path2.setFillType(lVar.f9897c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                            path2.addPath(path, matrix4);
                            canvas.clipPath(path2);
                        } else {
                            i iVar = (i) lVar;
                            float f12 = iVar.f9881i;
                            if (f12 != 0.0f || iVar.j != 1.0f) {
                                float f13 = iVar.f9882k;
                                float f14 = (f12 + f13) % 1.0f;
                                float f15 = (iVar.j + f13) % 1.0f;
                                if (this.f9904f == null) {
                                    this.f9904f = new PathMeasure();
                                }
                                this.f9904f.setPath(path, z10);
                                float length = this.f9904f.getLength();
                                float f16 = f14 * length;
                                float f17 = f15 * length;
                                path.reset();
                                if (f16 > f17) {
                                    this.f9904f.getSegment(f16, length, path, true);
                                    f3 = 0.0f;
                                    this.f9904f.getSegment(0.0f, f17, path, true);
                                } else {
                                    f3 = 0.0f;
                                    this.f9904f.getSegment(f16, f17, path, true);
                                }
                                path.rLineTo(f3, f3);
                            }
                            path2.addPath(path, matrix4);
                            a0 a0Var = iVar.f9879f;
                            float f18 = 255.0f;
                            if (((Shader) a0Var.f2655c) == null && a0Var.f2654b == 0) {
                                f18 = 255.0f;
                                i13 = 16777215;
                            } else {
                                if (this.f9903e == null) {
                                    i13 = 16777215;
                                    Paint paint = new Paint(1);
                                    this.f9903e = paint;
                                    paint.setStyle(Paint.Style.FILL);
                                } else {
                                    i13 = 16777215;
                                }
                                Paint paint2 = this.f9903e;
                                Shader shader = (Shader) a0Var.f2655c;
                                if (shader != null) {
                                    shader.setLocalMatrix(matrix4);
                                    paint2.setShader(shader);
                                    paint2.setAlpha(Math.round(iVar.f9880h * 255.0f));
                                } else {
                                    paint2.setShader(null);
                                    paint2.setAlpha(255);
                                    int i15 = a0Var.f2654b;
                                    float f19 = iVar.f9880h;
                                    PorterDuff.Mode mode = p.f9923A;
                                    paint2.setColor((i15 & i13) | (((int) (Color.alpha(i15) * f19)) << 24));
                                }
                                paint2.setColorFilter(null);
                                path2.setFillType(iVar.f9897c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                                canvas.drawPath(path2, paint2);
                            }
                            a0 a0Var2 = iVar.f9877d;
                            if (((Shader) a0Var2.f2655c) != null || a0Var2.f2654b != 0) {
                                if (this.f9902d == null) {
                                    Paint paint3 = new Paint(1);
                                    this.f9902d = paint3;
                                    paint3.setStyle(Paint.Style.STROKE);
                                }
                                Paint paint4 = this.f9902d;
                                Paint.Join join = iVar.f9884m;
                                if (join != null) {
                                    paint4.setStrokeJoin(join);
                                }
                                Paint.Cap cap = iVar.f9883l;
                                if (cap != null) {
                                    paint4.setStrokeCap(cap);
                                }
                                paint4.setStrokeMiter(iVar.f9885n);
                                Shader shader2 = (Shader) a0Var2.f2655c;
                                if (shader2 != null) {
                                    shader2.setLocalMatrix(matrix4);
                                    paint4.setShader(shader2);
                                    paint4.setAlpha(Math.round(iVar.g * f18));
                                } else {
                                    paint4.setShader(null);
                                    paint4.setAlpha(255);
                                    int i16 = a0Var2.f2654b;
                                    float f20 = iVar.g;
                                    PorterDuff.Mode mode2 = p.f9923A;
                                    paint4.setColor((i16 & i13) | (((int) (Color.alpha(i16) * f20)) << 24));
                                }
                                paint4.setColorFilter(null);
                                paint4.setStrokeWidth(iVar.f9878e * fMin * fAbs);
                                canvas.drawPath(path2, paint4);
                            }
                        }
                    }
                }
                i14 = i12 + 1;
                c10 = 0;
            }
            i12 = i14;
            i14 = i12 + 1;
            c10 = 0;
        }
        canvas.restore();
    }

    public float getAlpha() {
        return getRootAlpha() / 255.0f;
    }

    public int getRootAlpha() {
        return this.f9908l;
    }

    public void setAlpha(float f3) {
        setRootAlpha((int) (f3 * 255.0f));
    }

    public void setRootAlpha(int i10) {
        this.f9908l = i10;
    }

    public m(m mVar) {
        this.f9901c = new Matrix();
        this.f9905h = 0.0f;
        this.f9906i = 0.0f;
        this.j = 0.0f;
        this.f9907k = 0.0f;
        this.f9908l = 255;
        this.f9909m = null;
        this.f9910n = null;
        C1350e c1350e = new C1350e(0);
        this.f9911o = c1350e;
        this.g = new j(mVar.g, c1350e);
        this.f9899a = new Path(mVar.f9899a);
        this.f9900b = new Path(mVar.f9900b);
        this.f9905h = mVar.f9905h;
        this.f9906i = mVar.f9906i;
        this.j = mVar.j;
        this.f9907k = mVar.f9907k;
        this.f9908l = mVar.f9908l;
        this.f9909m = mVar.f9909m;
        String str = mVar.f9909m;
        if (str != null) {
            c1350e.put(str, this);
        }
        this.f9910n = mVar.f9910n;
    }
}
