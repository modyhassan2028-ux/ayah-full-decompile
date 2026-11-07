package E2;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.TextView;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.textfield.TextInputLayout;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: E2.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0150y implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1794a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1795b;

    public /* synthetic */ C0150y(int i10, Object obj) {
        this.f1794a = i10;
        this.f1795b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10 = this.f1794a;
        int i11 = 0;
        Object obj = this.f1795b;
        switch (i10) {
            case 0:
                int iFloatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
                C0151z c0151z = (C0151z) obj;
                c0151z.f1803c.setAlpha(iFloatValue);
                c0151z.f1804d.setAlpha(iFloatValue);
                c0151z.f1817s.invalidate();
                break;
            case 1:
                ((F) obj).f1481m = valueAnimator.getAnimatedFraction();
                break;
            case 2:
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                TextView textView = (TextView) obj;
                textView.setScaleX(fFloatValue);
                textView.setScaleY(fFloatValue);
                break;
            case 3:
                int iFloatValue2 = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
                P4.a aVar = (P4.a) obj;
                aVar.f6649c.setAlpha(iFloatValue2);
                aVar.f6650d.setAlpha(iFloatValue2);
                aVar.f6663s.invalidate();
                break;
            case 4:
                float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                T7.c cVar = (T7.c) obj;
                ArrayList arrayList = cVar.f7869C;
                int size = arrayList.size();
                while (i11 < size) {
                    Object obj2 = arrayList.get(i11);
                    i11++;
                    Z7.a aVar2 = (Z7.a) obj2;
                    aVar2.f11037e0 = 1.2f;
                    aVar2.f11035c0 = fFloatValue2;
                    aVar2.f11036d0 = fFloatValue2;
                    aVar2.f11038f0 = p137n7.a.b(0.0f, 1.0f, 0.19f, 1.0f, fFloatValue2);
                    aVar2.invalidateSelf();
                }
                WeakHashMap weakHashMap = I1.S.f3689a;
                cVar.postInvalidateOnAnimation();
                break;
            case 5:
                ((TabLayout) obj).scrollTo(((Integer) valueAnimator.getAnimatedValue()).intValue(), 0);
                break;
            case 6:
                ((TextInputLayout) obj).f15299M0.p(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 7:
                ((View) obj).invalidate();
                break;
            case 8:
                ((CollapsingToolbarLayout) obj).setScrimAlpha(((Integer) valueAnimator.getAnimatedValue()).intValue());
                break;
            default:
                float fFloatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                R7.i iVar = ((BottomSheetBehavior) obj).f14703z;
                if (iVar != null) {
                    iVar.n(fFloatValue3);
                }
                break;
        }
    }
}
