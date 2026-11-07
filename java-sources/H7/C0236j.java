package H7;

import android.animation.ValueAnimator;
import android.view.View;

/* JADX INFO: renamed from: H7.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0236j implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final A8.c f3543a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View[] f3544b;

    public C0236j(A8.c cVar, View... viewArr) {
        this.f3543a = cVar;
        this.f3544b = viewArr;
    }

    public static C0236j a(View... viewArr) {
        return new C0236j(new A8.c(11), viewArr);
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        for (View view : this.f3544b) {
            switch (this.f3543a.f553r) {
                case 10:
                    view.setTranslationX(((Float) valueAnimator.getAnimatedValue()).floatValue());
                    break;
                case 11:
                    view.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                    break;
                case 12:
                    Float f3 = (Float) valueAnimator.getAnimatedValue();
                    view.setScaleX(f3.floatValue());
                    view.setScaleY(f3.floatValue());
                    break;
                default:
                    view.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                    break;
            }
        }
    }
}
