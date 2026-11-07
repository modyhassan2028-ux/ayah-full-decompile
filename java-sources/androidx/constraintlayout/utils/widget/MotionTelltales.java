package androidx.constraintlayout.utils.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.ViewParent;
import android.view.animation.Interpolator;
import androidx.constraintlayout.motion.widget.MotionLayout;
import java.util.HashMap;
import m1.b;
import m1.h;
import p132n1.AbstractC1222h;
import p132n1.F;
import p132n1.n;
import p132n1.o;
import p132n1.w;
import s1.p;

/* JADX INFO: loaded from: classes.dex */
public class MotionTelltales extends MockView {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final Paint f12250C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public MotionLayout f12251D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final float[] f12252E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final Matrix f12253F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public int f12254G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public int f12255H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public float f12256I;

    public MotionTelltales(Context context) {
        super(context);
        this.f12250C = new Paint();
        this.f12252E = new float[2];
        this.f12253F = new Matrix();
        this.f12254G = 0;
        this.f12255H = -65281;
        this.f12256I = 0.25f;
        b(context, null);
    }

    public final void b(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p.f22047m);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == 0) {
                    this.f12255H = typedArrayObtainStyledAttributes.getColor(index, this.f12255H);
                } else if (index == 2) {
                    this.f12254G = typedArrayObtainStyledAttributes.getInt(index, this.f12254G);
                } else if (index == 1) {
                    this.f12256I = typedArrayObtainStyledAttributes.getFloat(index, this.f12256I);
                }
            }
        }
        int i11 = this.f12255H;
        Paint paint = this.f12250C;
        paint.setColor(i11);
        paint.setStrokeWidth(5.0f);
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0212  */
    /* JADX WARN: Code duplicated, block: B:102:0x0220  */
    /* JADX WARN: Code duplicated, block: B:105:0x0240 A[LOOP:2: B:103:0x023b->B:105:0x0240, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:107:0x0266  */
    /* JADX WARN: Code duplicated, block: B:109:0x02b3  */
    /* JADX WARN: Code duplicated, block: B:110:0x02c8  */
    /* JADX WARN: Code duplicated, block: B:112:0x02ce  */
    /* JADX WARN: Code duplicated, block: B:114:0x02da  */
    /* JADX WARN: Code duplicated, block: B:116:0x02e6  */
    /* JADX WARN: Code duplicated, block: B:118:0x02f2  */
    /* JADX WARN: Code duplicated, block: B:120:0x02fe  */
    /* JADX WARN: Code duplicated, block: B:122:0x0306  */
    /* JADX WARN: Code duplicated, block: B:124:0x030e  */
    /* JADX WARN: Code duplicated, block: B:128:0x0322 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:129:0x0324  */
    /* JADX WARN: Code duplicated, block: B:131:0x032e  */
    /* JADX WARN: Code duplicated, block: B:144:0x0249 A[EDGE_INSN: B:144:0x0249->B:106:0x0249 BREAK  A[LOOP:2: B:103:0x023b->B:105:0x0240], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:94:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:96:0x01de  */
    /* JADX WARN: Code duplicated, block: B:98:0x0205  */
    @Override // androidx.constraintlayout.utils.widget.MockView, android.view.View
    public final void onDraw(Canvas canvas) {
        int i10;
        Matrix matrix;
        int i11;
        float f3;
        float[] fArr;
        int i12;
        int i13;
        int i14;
        char c10;
        AbstractC1222h abstractC1222h;
        AbstractC1222h abstractC1222h2;
        b bVar;
        AbstractC1222h abstractC1222h3;
        float f7;
        int i15;
        double[] dArr;
        double[] dArr2;
        h hVar;
        MotionTelltales motionTelltales = this;
        super.onDraw(canvas);
        Matrix matrix2 = motionTelltales.getMatrix();
        Matrix matrix3 = motionTelltales.f12253F;
        matrix2.invert(matrix3);
        if (motionTelltales.f12251D == null) {
            ViewParent parent = motionTelltales.getParent();
            if (parent instanceof MotionLayout) {
                motionTelltales.f12251D = (MotionLayout) parent;
                return;
            }
            return;
        }
        int width = motionTelltales.getWidth();
        int height = motionTelltales.getHeight();
        int i16 = 5;
        float[] fArr2 = {0.1f, 0.25f, 0.5f, 0.75f, 0.9f};
        int i17 = 0;
        while (i17 < i16) {
            float f10 = fArr2[i17];
            int i18 = 0;
            while (i18 < i16) {
                float f11 = fArr2[i18];
                MotionLayout motionLayout = motionTelltales.f12251D;
                int i19 = motionTelltales.f12254G;
                float fA = motionLayout.f12178J;
                float f12 = motionLayout.U;
                if (motionLayout.f12176I != null) {
                    float fSignum = Math.signum(motionLayout.f12192W - f12);
                    float interpolation = motionLayout.f12176I.getInterpolation(motionLayout.U + 1.0E-5f);
                    float interpolation2 = motionLayout.f12176I.getInterpolation(motionLayout.U);
                    fA = (((interpolation - interpolation2) / 1.0E-5f) * fSignum) / motionLayout.S;
                    f12 = interpolation2;
                }
                Interpolator interpolator = motionLayout.f12176I;
                if (interpolator instanceof o) {
                    fA = ((o) interpolator).a();
                }
                float f13 = fA;
                n nVar = (n) motionLayout.Q.get(motionTelltales);
                int i20 = i19 & 1;
                float[] fArr3 = motionTelltales.f12252E;
                if (i20 == 0) {
                    int width2 = motionTelltales.getWidth();
                    int height2 = motionTelltales.getHeight();
                    float[] fArr4 = nVar.f19912t;
                    c10 = 0;
                    w wVar = nVar.f19898d;
                    float fA2 = nVar.a(f12, fArr4);
                    f3 = f13;
                    HashMap map = nVar.f19915w;
                    fArr = fArr2;
                    F f14 = map == null ? null : (F) map.get("translationX");
                    i12 = i17;
                    HashMap map2 = nVar.f19915w;
                    F f15 = map2 == null ? null : (F) map2.get("translationY");
                    float f16 = f10;
                    HashMap map3 = nVar.f19915w;
                    F f17 = map3 == null ? null : (F) map3.get("rotation");
                    i13 = i18;
                    HashMap map4 = nVar.f19915w;
                    i11 = height;
                    F f18 = map4 == null ? null : (F) map4.get("scaleX");
                    i10 = width;
                    HashMap map5 = nVar.f19915w;
                    matrix = matrix3;
                    F f19 = map5 == null ? null : (F) map5.get("scaleY");
                    HashMap map6 = nVar.f19916x;
                    AbstractC1222h abstractC1222h4 = map6 == null ? null : (AbstractC1222h) map6.get("translationX");
                    HashMap map7 = nVar.f19916x;
                    AbstractC1222h abstractC1222h5 = map7 == null ? null : (AbstractC1222h) map7.get("translationY");
                    HashMap map8 = nVar.f19916x;
                    AbstractC1222h abstractC1222h6 = map8 == null ? null : (AbstractC1222h) map8.get("rotation");
                    HashMap map9 = nVar.f19916x;
                    AbstractC1222h abstractC1222h7 = map9 == null ? null : (AbstractC1222h) map9.get("scaleX");
                    HashMap map10 = nVar.f19916x;
                    AbstractC1222h abstractC1222h8 = map10 != null ? (AbstractC1222h) map10.get("scaleY") : null;
                    h hVar2 = new h();
                    i14 = i19;
                    hVar2.f19520e = 0.0f;
                    hVar2.f19519d = 0.0f;
                    hVar2.f19518c = 0.0f;
                    hVar2.f19517b = 0.0f;
                    hVar2.f19516a = 0.0f;
                    if (f17 != null) {
                        hVar2.f19520e = (float) f17.f19836a.M(fA2);
                        hVar2.f19521f = f17.a(fA2);
                    }
                    if (f14 != null) {
                        hVar2.f19518c = (float) f14.f19836a.M(fA2);
                    }
                    if (f15 != null) {
                        hVar2.f19519d = (float) f15.f19836a.M(fA2);
                    }
                    if (f18 != null) {
                        hVar2.f19516a = (float) f18.f19836a.M(fA2);
                    }
                    if (f19 != null) {
                        hVar2.f19517b = (float) f19.f19836a.M(fA2);
                    }
                    if (abstractC1222h6 != null) {
                        hVar2.f19520e = abstractC1222h6.b(fA2);
                    }
                    if (abstractC1222h4 != null) {
                        hVar2.f19518c = abstractC1222h4.b(fA2);
                    }
                    if (abstractC1222h5 != null) {
                        hVar2.f19519d = abstractC1222h5.b(fA2);
                    }
                    if (abstractC1222h7 == 0 && abstractC1222h8 == null) {
                        abstractC1222h = abstractC1222h7;
                    } else {
                        abstractC1222h = abstractC1222h7;
                        if (abstractC1222h7 == 0) {
                            hVar2.f19516a = abstractC1222h.b(fA2);
                        }
                        if (abstractC1222h8 == 0) {
                            abstractC1222h2 = abstractC1222h8;
                            hVar2.f19517b = abstractC1222h2.b(fA2);
                        }
                        bVar = nVar.f19902i;
                        if (bVar != null) {
                            dArr2 = nVar.f19906n;
                            if (dArr2.length > 0) {
                                double d5 = fA2;
                                bVar.J(d5, dArr2);
                                nVar.f19902i.N(d5, nVar.f19907o);
                                int[] iArr = nVar.f19905m;
                                double[] dArr3 = nVar.f19907o;
                                double[] dArr4 = nVar.f19906n;
                                wVar.getClass();
                                w.d(f11, f16, fArr3, iArr, dArr3, dArr4);
                                fArr3 = fArr3;
                                f10 = f16;
                                f11 = f11;
                                hVar = hVar2;
                            } else {
                                hVar = hVar2;
                                f11 = f11;
                                f10 = f16;
                                fArr3 = fArr3;
                            }
                            hVar.a(f11, f10, width2, height2, fArr3);
                        } else if (nVar.f19901h != null) {
                            fArr3 = fArr3;
                            double dA = nVar.a(fA2, fArr4);
                            nVar.f19901h[0].N(dA, nVar.f19907o);
                            nVar.f19901h[0].J(dA, nVar.f19906n);
                            f7 = fArr4[0];
                            i15 = 0;
                            while (true) {
                                dArr = nVar.f19907o;
                                if (i15 < dArr.length) {
                                    break;
                                }
                                dArr[i15] = dArr[i15] * ((double) f7);
                                i15++;
                            }
                            int[] iArr2 = nVar.f19905m;
                            double[] dArr5 = nVar.f19906n;
                            wVar.getClass();
                            w.d(f11, f16, fArr3, iArr2, dArr, dArr5);
                            fArr3 = fArr3;
                            f10 = f16;
                            f11 = f11;
                            hVar2.a(f11, f10, width2, height2, fArr3);
                        } else {
                            w wVar2 = nVar.f19899e;
                            float f20 = wVar2.f19956v - wVar.f19956v;
                            float f21 = wVar2.f19957w - wVar.f19957w;
                            float f22 = wVar2.f19958x - wVar.f19958x;
                            float f23 = f21 + (wVar2.f19959y - wVar.f19959y);
                            fArr3[0] = ((f20 + f22) * f11) + ((1.0f - f11) * f20);
                            fArr3[1] = (f23 * f16) + ((1.0f - f16) * f21);
                            hVar2.f19520e = 0.0f;
                            hVar2.f19519d = 0.0f;
                            hVar2.f19518c = 0.0f;
                            hVar2.f19517b = 0.0f;
                            hVar2.f19516a = 0.0f;
                            if (f17 != null) {
                                hVar2.f19520e = (float) f17.f19836a.M(fA2);
                                hVar2.f19521f = f17.a(fA2);
                            }
                            if (f14 != 0) {
                                fArr3 = fArr3;
                                fArr3 = fArr3;
                                hVar2.f19518c = (float) f14.f19836a.M(fA2);
                            }
                            if (f15 != null) {
                                hVar2.f19519d = (float) f15.f19836a.M(fA2);
                            }
                            if (f18 != null) {
                                hVar2.f19516a = (float) f18.f19836a.M(fA2);
                            }
                            if (f19 != null) {
                                hVar2.f19517b = (float) f19.f19836a.M(fA2);
                            }
                            if (abstractC1222h6 != null) {
                                hVar2.f19520e = abstractC1222h6.b(fA2);
                            }
                            if (abstractC1222h4 != null) {
                                hVar2.f19518c = abstractC1222h4.b(fA2);
                            }
                            if (abstractC1222h5 != null) {
                                hVar2.f19519d = abstractC1222h5.b(fA2);
                            }
                            if (abstractC1222h == 0 || abstractC1222h2 != null) {
                                if (abstractC1222h == 0) {
                                    hVar2.f19516a = abstractC1222h3.b(fA2);
                                }
                                if (abstractC1222h2 == 0) {
                                    abstractC1222h3 = abstractC1222h;
                                    hVar2.f19517b = abstractC1222h2.b(fA2);
                                }
                            }
                            abstractC1222h3 = abstractC1222h;
                            f11 = f11;
                            f10 = f16;
                            hVar2.a(f11, f10, width2, height2, fArr3);
                        }
                    }
                    abstractC1222h2 = abstractC1222h8;
                    bVar = nVar.f19902i;
                    if (bVar != null) {
                        dArr2 = nVar.f19906n;
                        if (dArr2.length > 0) {
                            double d9 = fA2;
                            bVar.J(d9, dArr2);
                            nVar.f19902i.N(d9, nVar.f19907o);
                            int[] iArr3 = nVar.f19905m;
                            double[] dArr6 = nVar.f19907o;
                            double[] dArr7 = nVar.f19906n;
                            wVar.getClass();
                            w.d(f11, f16, fArr3, iArr3, dArr6, dArr7);
                            fArr3 = fArr3;
                            f10 = f16;
                            f11 = f11;
                            hVar = hVar2;
                        } else {
                            hVar = hVar2;
                            f11 = f11;
                            f10 = f16;
                            fArr3 = fArr3;
                        }
                        hVar.a(f11, f10, width2, height2, fArr3);
                    } else if (nVar.f19901h != null) {
                        fArr3 = fArr3;
                        double dA2 = nVar.a(fA2, fArr4);
                        nVar.f19901h[0].N(dA2, nVar.f19907o);
                        nVar.f19901h[0].J(dA2, nVar.f19906n);
                        f7 = fArr4[0];
                        i15 = 0;
                        while (true) {
                            dArr = nVar.f19907o;
                            if (i15 < dArr.length) {
                                break;
                                break;
                            } else {
                                dArr[i15] = dArr[i15] * ((double) f7);
                                i15++;
                            }
                        }
                        int[] iArr4 = nVar.f19905m;
                        double[] dArr8 = nVar.f19906n;
                        wVar.getClass();
                        w.d(f11, f16, fArr3, iArr4, dArr, dArr8);
                        fArr3 = fArr3;
                        f10 = f16;
                        f11 = f11;
                        hVar2.a(f11, f10, width2, height2, fArr3);
                    } else {
                        w wVar3 = nVar.f19899e;
                        float f24 = wVar3.f19956v - wVar.f19956v;
                        float f25 = wVar3.f19957w - wVar.f19957w;
                        float f26 = wVar3.f19958x - wVar.f19958x;
                        float f27 = f25 + (wVar3.f19959y - wVar.f19959y);
                        fArr3[0] = ((f24 + f26) * f11) + ((1.0f - f11) * f24);
                        fArr3[1] = (f27 * f16) + ((1.0f - f16) * f25);
                        hVar2.f19520e = 0.0f;
                        hVar2.f19519d = 0.0f;
                        hVar2.f19518c = 0.0f;
                        hVar2.f19517b = 0.0f;
                        hVar2.f19516a = 0.0f;
                        if (f17 != null) {
                            hVar2.f19520e = (float) f17.f19836a.M(fA2);
                            hVar2.f19521f = f17.a(fA2);
                        }
                        if (f14 != 0) {
                            fArr3 = fArr3;
                            fArr3 = fArr3;
                            hVar2.f19518c = (float) f14.f19836a.M(fA2);
                        }
                        if (f15 != null) {
                            hVar2.f19519d = (float) f15.f19836a.M(fA2);
                        }
                        if (f18 != null) {
                            hVar2.f19516a = (float) f18.f19836a.M(fA2);
                        }
                        if (f19 != null) {
                            hVar2.f19517b = (float) f19.f19836a.M(fA2);
                        }
                        if (abstractC1222h6 != null) {
                            hVar2.f19520e = abstractC1222h6.b(fA2);
                        }
                        if (abstractC1222h4 != null) {
                            hVar2.f19518c = abstractC1222h4.b(fA2);
                        }
                        if (abstractC1222h5 != null) {
                            hVar2.f19519d = abstractC1222h5.b(fA2);
                        }
                        if (abstractC1222h == 0) {
                            if (abstractC1222h == 0) {
                                hVar2.f19516a = abstractC1222h3.b(fA2);
                            }
                            if (abstractC1222h2 == 0) {
                                abstractC1222h3 = abstractC1222h;
                                hVar2.f19517b = abstractC1222h2.b(fA2);
                            }
                        } else {
                            if (abstractC1222h == 0) {
                                hVar2.f19516a = abstractC1222h3.b(fA2);
                            }
                            if (abstractC1222h2 == 0) {
                                abstractC1222h3 = abstractC1222h;
                                hVar2.f19517b = abstractC1222h2.b(fA2);
                            }
                        }
                        abstractC1222h3 = abstractC1222h;
                        f11 = f11;
                        f10 = f16;
                        hVar2.a(f11, f10, width2, height2, fArr3);
                    }
                } else {
                    i10 = width;
                    matrix = matrix3;
                    i11 = height;
                    f3 = f13;
                    fArr = fArr2;
                    i12 = i17;
                    i13 = i18;
                    i14 = i19;
                    c10 = 0;
                    nVar.b(f12, f11, f10, fArr3);
                }
                if (i14 < 2) {
                    fArr3[c10] = fArr3[c10] * f3;
                    fArr3[1] = fArr3[1] * f3;
                }
                motionTelltales = this;
                float[] fArr5 = motionTelltales.f12252E;
                matrix3 = matrix;
                matrix3.mapVectors(fArr5);
                int i21 = i10;
                float f28 = i21 * f11;
                int i22 = i11;
                float f29 = i22 * f10;
                float f30 = fArr5[c10];
                float f31 = motionTelltales.f12256I;
                float f32 = f29 - (fArr5[1] * f31);
                matrix3.mapVectors(fArr5);
                canvas.drawLine(f28, f29, f28 - (f30 * f31), f32, motionTelltales.f12250C);
                i18 = i13 + 1;
                width = i21;
                height = i22;
                fArr2 = fArr;
                i17 = i12;
                i16 = 5;
            }
            i17++;
            height = height;
            i16 = 5;
        }
    }

    @Override // android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        postInvalidate();
    }

    public void setText(CharSequence charSequence) {
        this.f12246w = charSequence.toString();
        requestLayout();
    }

    public MotionTelltales(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f12250C = new Paint();
        this.f12252E = new float[2];
        this.f12253F = new Matrix();
        this.f12254G = 0;
        this.f12255H = -65281;
        this.f12256I = 0.25f;
        b(context, attributeSet);
    }

    public MotionTelltales(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f12250C = new Paint();
        this.f12252E = new float[2];
        this.f12253F = new Matrix();
        this.f12254G = 0;
        this.f12255H = -65281;
        this.f12256I = 0.25f;
        b(context, attributeSet);
    }
}
