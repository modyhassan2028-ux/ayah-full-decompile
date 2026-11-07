package H7;

import E2.C0150y;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class F extends W2.p {
    @Override // W2.p
    public final void d(W2.x xVar) {
        View view = xVar.f9590b;
        if (view instanceof TextView) {
            xVar.f9589a.put("android:textscale:scale", Float.valueOf(((TextView) view).getScaleX()));
        }
    }

    @Override // W2.p
    public final void g(W2.x xVar) {
        View view = xVar.f9590b;
        if (view instanceof TextView) {
            xVar.f9589a.put("android:textscale:scale", Float.valueOf(((TextView) view).getScaleX()));
        }
    }

    @Override // W2.p
    public final Animator k(ViewGroup viewGroup, W2.x xVar, W2.x xVar2) {
        if (xVar == null || xVar2 == null || !(xVar.f9590b instanceof TextView)) {
            return null;
        }
        View view = xVar2.f9590b;
        if (!(view instanceof TextView)) {
            return null;
        }
        TextView textView = (TextView) view;
        HashMap map = xVar.f9589a;
        HashMap map2 = xVar2.f9589a;
        float fFloatValue = map.get("android:textscale:scale") != null ? ((Float) map.get("android:textscale:scale")).floatValue() : 1.0f;
        float fFloatValue2 = map2.get("android:textscale:scale") != null ? ((Float) map2.get("android:textscale:scale")).floatValue() : 1.0f;
        if (fFloatValue == fFloatValue2) {
            return null;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fFloatValue, fFloatValue2);
        valueAnimatorOfFloat.addUpdateListener(new C0150y(2, textView));
        return valueAnimatorOfFloat;
    }
}
