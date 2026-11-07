package F7;

import android.animation.FloatEvaluator;
import android.animation.TypeEvaluator;
import android.graphics.Rect;

/* JADX INFO: loaded from: classes.dex */
public final class p implements TypeEvaluator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2473a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f2474b;

    public /* synthetic */ p(int i10) {
        this.f2473a = i10;
    }

    @Override // android.animation.TypeEvaluator
    public final Object evaluate(float f3, Object obj, Object obj2) {
        switch (this.f2473a) {
            case 0:
                float fFloatValue = ((FloatEvaluator) this.f2474b).evaluate(f3, (Number) obj, (Number) obj2).floatValue();
                if (fFloatValue < 0.1f) {
                    fFloatValue = 0.0f;
                }
                return Float.valueOf(fFloatValue);
            case 1:
                Rect rect = (Rect) obj;
                Rect rect2 = (Rect) obj2;
                int i10 = rect.left;
                int i11 = i10 + ((int) ((rect2.left - i10) * f3));
                int i12 = rect.top;
                int i13 = i12 + ((int) ((rect2.top - i12) * f3));
                int i14 = rect.right;
                int i15 = i14 + ((int) ((rect2.right - i14) * f3));
                int i16 = rect.bottom;
                int i17 = i16 + ((int) ((rect2.bottom - i16) * f3));
                Rect rect3 = (Rect) this.f2474b;
                rect3.set(i11, i13, i15, i17);
                return rect3;
            default:
                A1.e[] eVarArr = (A1.e[]) obj;
                A1.e[] eVarArr2 = (A1.e[]) obj2;
                if (!B0.c.f(eVarArr, eVarArr2)) {
                    throw new IllegalArgumentException("Can't interpolate between two incompatible pathData");
                }
                if (!B0.c.f((A1.e[]) this.f2474b, eVarArr)) {
                    this.f2474b = B0.c.w(eVarArr);
                }
                for (int i18 = 0; i18 < eVarArr.length; i18++) {
                    A1.e eVar = ((A1.e[]) this.f2474b)[i18];
                    A1.e eVar2 = eVarArr[i18];
                    A1.e eVar3 = eVarArr2[i18];
                    eVar.getClass();
                    eVar.f467a = eVar2.f467a;
                    int i19 = 0;
                    while (true) {
                        float[] fArr = eVar2.f468b;
                        if (i19 < fArr.length) {
                            eVar.f468b[i19] = (eVar3.f468b[i19] * f3) + ((1.0f - f3) * fArr[i19]);
                            i19++;
                        }
                    }
                }
                return (A1.e[]) this.f2474b;
        }
    }

    public p(Rect rect) {
        this.f2473a = 1;
        this.f2474b = rect;
    }
}
