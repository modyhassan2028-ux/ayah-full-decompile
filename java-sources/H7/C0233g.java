package H7;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.appcompat.widget.ActionMenuView;

/* JADX INFO: renamed from: H7.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0233g implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3539a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f3540b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final View f3541c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f3542d;

    public C0233g(ActionMenuView actionMenuView, ActionMenuView actionMenuView2) {
        this.f3539a = 0;
        this.f3540b = actionMenuView;
        this.f3541c = actionMenuView2;
        this.f3542d = new float[2];
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f3539a) {
            case 0:
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float[] fArr = (float[]) this.f3542d;
                H.a(fFloatValue, fArr);
                View view = this.f3540b;
                if (view != null) {
                    view.setAlpha(fArr[0]);
                }
                View view2 = this.f3541c;
                if (view2 != null) {
                    view2.setAlpha(fArr[1]);
                }
                break;
            default:
                ((W7.e) this.f3542d).c(this.f3540b, this.f3541c, valueAnimator.getAnimatedFraction());
                break;
        }
    }

    public C0233g(W7.e eVar, View view, View view2) {
        this.f3539a = 1;
        this.f3542d = eVar;
        this.f3540b = view;
        this.f3541c = view2;
    }
}
