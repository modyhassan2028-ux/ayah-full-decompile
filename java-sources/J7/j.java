package J7;

import I1.S;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.util.Property;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import com.ayah.R;
import java.util.WeakHashMap;
import p020c.C0776a;

/* JADX INFO: loaded from: classes.dex */
public final class j extends a {
    public final float g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f4385h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float f4386i;

    public j(View view) {
        super(view);
        Resources resources = view.getResources();
        this.g = resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_x_distance_shrink);
        this.f4385h = resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_x_distance_grow);
        this.f4386i = resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_y_distance);
    }

    public final void b() {
        if (a() == null) {
            return;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        View view = this.f4367b;
        animatorSet.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_Y, 1.0f));
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                animatorSet.playTogether(ObjectAnimator.ofFloat(viewGroup.getChildAt(i10), (Property<View, Float>) View.SCALE_Y, 1.0f));
            }
        }
        animatorSet.setDuration(this.f4370e);
        animatorSet.start();
    }

    public final void c(C0776a c0776a, int i10, AnimatorListenerAdapter animatorListenerAdapter, ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        int i11;
        boolean z10 = c0776a.f13368d == 0;
        WeakHashMap weakHashMap = S.f3689a;
        View view = this.f4367b;
        boolean z11 = (Gravity.getAbsoluteGravity(i10, view.getLayoutDirection()) & 3) == 3;
        float scaleX = view.getScaleX() * view.getWidth();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            i11 = z11 ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
        } else {
            i11 = 0;
        }
        float f3 = scaleX + i11;
        Property property = View.TRANSLATION_X;
        if (z11) {
            f3 = -f3;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) property, f3);
        if (animatorUpdateListener != null) {
            objectAnimatorOfFloat.addUpdateListener(animatorUpdateListener);
        }
        objectAnimatorOfFloat.setInterpolator(new p076h2.a(1));
        objectAnimatorOfFloat.setDuration(p137n7.a.c(this.f4368c, c0776a.f13367c, this.f4369d));
        objectAnimatorOfFloat.addListener(new i(this, z10, i10));
        objectAnimatorOfFloat.addListener(animatorListenerAdapter);
        objectAnimatorOfFloat.start();
    }

    public final void d(int i10, float f3, boolean z10) {
        float interpolation = this.f4366a.getInterpolation(f3);
        WeakHashMap weakHashMap = S.f3689a;
        View view = this.f4367b;
        boolean z11 = (Gravity.getAbsoluteGravity(i10, view.getLayoutDirection()) & 3) == 3;
        boolean z12 = z10 == z11;
        int width = view.getWidth();
        int height = view.getHeight();
        float f7 = width;
        if (f7 > 0.0f) {
            float f10 = height;
            if (f10 <= 0.0f) {
                return;
            }
            float f11 = this.g / f7;
            float f12 = this.f4385h / f7;
            float f13 = this.f4386i / f10;
            if (z11) {
                f7 = 0.0f;
            }
            view.setPivotX(f7);
            if (!z12) {
                f12 = -f11;
            }
            float fA = p137n7.a.a(0.0f, f12, interpolation);
            float f14 = fA + 1.0f;
            view.setScaleX(f14);
            float fA2 = 1.0f - p137n7.a.a(0.0f, f13, interpolation);
            view.setScaleY(fA2);
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i11 = 0; i11 < viewGroup.getChildCount(); i11++) {
                    View childAt = viewGroup.getChildAt(i11);
                    childAt.setPivotX(z11 ? childAt.getWidth() + (width - childAt.getRight()) : -childAt.getLeft());
                    childAt.setPivotY(-childAt.getTop());
                    float f15 = z12 ? 1.0f - fA : 1.0f;
                    float f16 = fA2 != 0.0f ? (f14 / fA2) * f15 : 1.0f;
                    childAt.setScaleX(f15);
                    childAt.setScaleY(f16);
                }
            }
        }
    }
}
