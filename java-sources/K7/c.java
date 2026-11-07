package K7;

import android.animation.ValueAnimator;
import com.google.android.material.navigation.NavigationBarItemView;

/* JADX INFO: loaded from: classes.dex */
public final class c implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ float f5285a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ NavigationBarItemView f5286b;

    public c(NavigationBarItemView navigationBarItemView, float f3) {
        this.f5286b = navigationBarItemView;
        this.f5285a = f3;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        int[] iArr = NavigationBarItemView.f15011a0;
        this.f5286b.e(fFloatValue, this.f5285a);
    }
}
