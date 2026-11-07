package F7;

import I1.S;
import K0.AbstractC0332a;
import W2.C0623d;
import W2.z;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;
import android.view.animation.Interpolator;
import androidx.appcompat.widget.SwitchCompat;
import io.realm.RealmFieldTypeConstants;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class f extends Property {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2447a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(Class cls, String str, int i10) {
        super(cls, str);
        this.f2447a = i10;
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        switch (this.f2447a) {
            case 0:
                return Float.valueOf(((View) obj).getLayoutParams().width);
            case 1:
                return Float.valueOf(((View) obj).getLayoutParams().height);
            case 2:
                WeakHashMap weakHashMap = S.f3689a;
                return Float.valueOf(((View) obj).getPaddingStart());
            case 3:
                WeakHashMap weakHashMap2 = S.f3689a;
                return Float.valueOf(((View) obj).getPaddingEnd());
            case 4:
                return Float.valueOf(((M7.g) obj).f5774h);
            case 5:
                return Float.valueOf(((M7.g) obj).f5775i);
            case 6:
                return Float.valueOf(((M7.l) obj).b());
            case 7:
                return Float.valueOf(((M7.q) obj).f5815h);
            case 8:
                return Float.valueOf(((M7.s) obj).f5826i);
            case 9:
                return null;
            case 10:
                return null;
            case 11:
                return null;
            case 12:
                return null;
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_LIST /* 13 */:
                return null;
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_LINKING_OBJECTS /* 14 */:
                return Float.valueOf(z.f9592a.H((View) obj));
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_OBJECTID /* 15 */:
                return ((View) obj).getClipBounds();
            default:
                return Float.valueOf(((SwitchCompat) obj).Q);
        }
    }

    @Override // android.util.Property
    public final void set(Object obj, Object obj2) {
        switch (this.f2447a) {
            case 0:
                View view = (View) obj;
                view.getLayoutParams().width = ((Float) obj2).intValue();
                view.requestLayout();
                break;
            case 1:
                View view2 = (View) obj;
                view2.getLayoutParams().height = ((Float) obj2).intValue();
                view2.requestLayout();
                break;
            case 2:
                View view3 = (View) obj;
                int iIntValue = ((Float) obj2).intValue();
                int paddingTop = view3.getPaddingTop();
                WeakHashMap weakHashMap = S.f3689a;
                view3.setPaddingRelative(iIntValue, paddingTop, view3.getPaddingEnd(), view3.getPaddingBottom());
                break;
            case 3:
                View view4 = (View) obj;
                WeakHashMap weakHashMap2 = S.f3689a;
                view4.setPaddingRelative(view4.getPaddingStart(), view4.getPaddingTop(), ((Float) obj2).intValue(), view4.getPaddingBottom());
                break;
            case 4:
                M7.g gVar = (M7.g) obj;
                float fFloatValue = ((Float) obj2).floatValue();
                gVar.f5774h = fFloatValue;
                int i10 = (int) (fFloatValue * 5400.0f);
                p076h2.a aVar = gVar.f5772e;
                ArrayList arrayList = (ArrayList) gVar.f5053b;
                M7.m mVar = (M7.m) arrayList.get(0);
                float f3 = gVar.f5774h * 1520.0f;
                mVar.f5797a = (-20.0f) + f3;
                mVar.f5798b = f3;
                for (int i11 = 0; i11 < 4; i11++) {
                    mVar.f5798b = (aVar.getInterpolation(AbstractC0332a.h(i10, M7.g.f5765k[i11], 667)) * 250.0f) + mVar.f5798b;
                    mVar.f5797a = (aVar.getInterpolation(AbstractC0332a.h(i10, M7.g.f5766l[i11], 667)) * 250.0f) + mVar.f5797a;
                }
                float f7 = mVar.f5797a;
                float f10 = mVar.f5798b;
                mVar.f5797a = (((f10 - f7) * gVar.f5775i) + f7) / 360.0f;
                mVar.f5798b = f10 / 360.0f;
                for (int i12 = 0; i12 < 4; i12++) {
                    float fH = AbstractC0332a.h(i10, M7.g.f5767m[i12], 333);
                    if (fH >= 0.0f && fH <= 1.0f) {
                        int i13 = i12 + gVar.g;
                        int[] iArr = gVar.f5773f.f5754c;
                        int length = i13 % iArr.length;
                        int length2 = (length + 1) % iArr.length;
                        int i14 = iArr[length];
                        int i15 = iArr[length2];
                        ((M7.m) arrayList.get(0)).f5799c = p137n7.b.a(aVar.getInterpolation(fH), Integer.valueOf(i14), Integer.valueOf(i15)).intValue();
                        ((M7.o) gVar.f5052a).invalidateSelf();
                    }
                    break;
                }
                ((M7.o) gVar.f5052a).invalidateSelf();
                break;
            case 5:
                ((M7.g) obj).f5775i = ((Float) obj2).floatValue();
                break;
            case 6:
                M7.l lVar = (M7.l) obj;
                float fFloatValue2 = ((Float) obj2).floatValue();
                if (lVar.f5795y != fFloatValue2) {
                    lVar.f5795y = fFloatValue2;
                    lVar.invalidateSelf();
                }
                break;
            case 7:
                M7.q qVar = (M7.q) obj;
                float fFloatValue3 = ((Float) obj2).floatValue();
                qVar.f5815h = fFloatValue3;
                ArrayList arrayList2 = (ArrayList) qVar.f5053b;
                ((M7.m) arrayList2.get(0)).f5797a = 0.0f;
                float fH2 = AbstractC0332a.h((int) (fFloatValue3 * 333.0f), 0, 667);
                M7.m mVar2 = (M7.m) arrayList2.get(0);
                M7.m mVar3 = (M7.m) arrayList2.get(1);
                p076h2.a aVar2 = qVar.f5812d;
                float interpolation = aVar2.getInterpolation(fH2);
                mVar3.f5797a = interpolation;
                mVar2.f5798b = interpolation;
                M7.m mVar4 = (M7.m) arrayList2.get(1);
                M7.m mVar5 = (M7.m) arrayList2.get(2);
                float interpolation2 = aVar2.getInterpolation(fH2 + 0.49925038f);
                mVar5.f5797a = interpolation2;
                mVar4.f5798b = interpolation2;
                ((M7.m) arrayList2.get(2)).f5798b = 1.0f;
                if (qVar.g && ((M7.m) arrayList2.get(1)).f5798b < 1.0f) {
                    ((M7.m) arrayList2.get(2)).f5799c = ((M7.m) arrayList2.get(1)).f5799c;
                    ((M7.m) arrayList2.get(1)).f5799c = ((M7.m) arrayList2.get(0)).f5799c;
                    ((M7.m) arrayList2.get(0)).f5799c = qVar.f5813e.f5754c[qVar.f5814f];
                    qVar.g = false;
                }
                ((M7.o) qVar.f5052a).invalidateSelf();
                break;
            case 8:
                M7.s sVar = (M7.s) obj;
                float fFloatValue4 = ((Float) obj2).floatValue();
                sVar.f5826i = fFloatValue4;
                int i16 = (int) (fFloatValue4 * 1800.0f);
                Interpolator[] interpolatorArr = sVar.f5823e;
                ArrayList arrayList3 = (ArrayList) sVar.f5053b;
                for (int i17 = 0; i17 < arrayList3.size(); i17++) {
                    M7.m mVar6 = (M7.m) arrayList3.get(i17);
                    int[] iArr2 = M7.s.f5819l;
                    int i18 = i17 * 2;
                    int i19 = iArr2[i18];
                    int[] iArr3 = M7.s.f5818k;
                    mVar6.f5797a = B9.a.h(interpolatorArr[i18].getInterpolation(AbstractC0332a.h(i16, i19, iArr3[i18])), 0.0f, 1.0f);
                    int i20 = i18 + 1;
                    mVar6.f5798b = B9.a.h(interpolatorArr[i20].getInterpolation(AbstractC0332a.h(i16, iArr2[i20], iArr3[i20])), 0.0f, 1.0f);
                }
                if (sVar.f5825h) {
                    int size = arrayList3.size();
                    int i21 = 0;
                    while (i21 < size) {
                        Object obj3 = arrayList3.get(i21);
                        i21++;
                        ((M7.m) obj3).f5799c = sVar.f5824f.f5754c[sVar.g];
                    }
                    sVar.f5825h = false;
                }
                ((M7.o) sVar.f5052a).invalidateSelf();
                break;
            case 9:
                C0623d c0623d = (C0623d) obj;
                PointF pointF = (PointF) obj2;
                c0623d.getClass();
                c0623d.f9530a = Math.round(pointF.x);
                int iRound = Math.round(pointF.y);
                c0623d.f9531b = iRound;
                int i22 = c0623d.f9535f + 1;
                c0623d.f9535f = i22;
                if (i22 == c0623d.g) {
                    z.a(c0623d.f9534e, c0623d.f9530a, iRound, c0623d.f9532c, c0623d.f9533d);
                    c0623d.f9535f = 0;
                    c0623d.g = 0;
                }
                break;
            case 10:
                C0623d c0623d2 = (C0623d) obj;
                PointF pointF2 = (PointF) obj2;
                c0623d2.getClass();
                c0623d2.f9532c = Math.round(pointF2.x);
                int iRound2 = Math.round(pointF2.y);
                c0623d2.f9533d = iRound2;
                int i23 = c0623d2.g + 1;
                c0623d2.g = i23;
                if (c0623d2.f9535f == i23) {
                    z.a(c0623d2.f9534e, c0623d2.f9530a, c0623d2.f9531b, c0623d2.f9532c, iRound2);
                    c0623d2.f9535f = 0;
                    c0623d2.g = 0;
                }
                break;
            case 11:
                View view5 = (View) obj;
                PointF pointF3 = (PointF) obj2;
                z.a(view5, view5.getLeft(), view5.getTop(), Math.round(pointF3.x), Math.round(pointF3.y));
                break;
            case 12:
                View view6 = (View) obj;
                PointF pointF4 = (PointF) obj2;
                z.a(view6, Math.round(pointF4.x), Math.round(pointF4.y), view6.getRight(), view6.getBottom());
                break;
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_LIST /* 13 */:
                View view7 = (View) obj;
                PointF pointF5 = (PointF) obj2;
                int iRound3 = Math.round(pointF5.x);
                int iRound4 = Math.round(pointF5.y);
                z.a(view7, iRound3, iRound4, view7.getWidth() + iRound3, view7.getHeight() + iRound4);
                break;
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_LINKING_OBJECTS /* 14 */:
                z.f9592a.X((View) obj, ((Float) obj2).floatValue());
                break;
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_OBJECTID /* 15 */:
                ((View) obj).setClipBounds((Rect) obj2);
                break;
            default:
                ((SwitchCompat) obj).setThumbPosition(((Float) obj2).floatValue());
                break;
        }
    }
}
