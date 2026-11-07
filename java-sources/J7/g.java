package J7;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.res.Resources;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import com.ayah.R;

/* JADX INFO: loaded from: classes.dex */
public final class g extends a {
    public final float g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f4377h;

    public g(View view) {
        super(view);
        Resources resources = view.getResources();
        this.g = resources.getDimension(R.dimen.m3_back_progress_bottom_container_max_scale_x_distance);
        this.f4377h = resources.getDimension(R.dimen.m3_back_progress_bottom_container_max_scale_y_distance);
    }

    public final AnimatorSet b() {
        AnimatorSet animatorSet = new AnimatorSet();
        View view = this.f4367b;
        animatorSet.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_Y, 1.0f));
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                animatorSet.playTogether(ObjectAnimator.ofFloat(viewGroup.getChildAt(i10), (Property<View, Float>) View.SCALE_Y, 1.0f));
            }
        }
        animatorSet.setInterpolator(new p076h2.a(1));
        return animatorSet;
    }

    public final void c(float f3) {
        float interpolation = this.f4366a.getInterpolation(f3);
        View view = this.f4367b;
        float width = view.getWidth();
        float height = view.getHeight();
        if (width <= 0.0f || height <= 0.0f) {
            return;
        }
        float f7 = this.g / width;
        float f10 = this.f4377h / height;
        float fA = 1.0f - p137n7.a.a(0.0f, f7, interpolation);
        float fA2 = 1.0f - p137n7.a.a(0.0f, f10, interpolation);
        view.setScaleX(fA);
        view.setPivotY(height);
        view.setScaleY(fA2);
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                View childAt = viewGroup.getChildAt(i10);
                childAt.setPivotY(-childAt.getTop());
                childAt.setScaleY(fA2 != 0.0f ? fA / fA2 : 1.0f);
            }
        }
    }
}
