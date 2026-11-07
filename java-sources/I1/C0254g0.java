package I1;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.PathInterpolator;
import com.ayah.R;
import java.util.List;

/* JADX INFO: renamed from: I1.g0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0254g0 extends k0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final PathInterpolator f3738e = new PathInterpolator(0.0f, 1.1f, 0.0f, 1.0f);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final p076h2.a f3739f = new p076h2.a(0);
    public static final DecelerateInterpolator g = new DecelerateInterpolator(1.5f);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final AccelerateInterpolator f3740h = new AccelerateInterpolator(1.5f);

    public static void f(View view, l0 l0Var) {
        AbstractC0244b0 abstractC0244b0K = k(view);
        if (abstractC0244b0K != null) {
            abstractC0244b0K.d(l0Var);
            if (abstractC0244b0K.f3712r == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                f(viewGroup.getChildAt(i10), l0Var);
            }
        }
    }

    public static void g(View view, l0 l0Var, B0 b5, boolean z10) {
        AbstractC0244b0 abstractC0244b0K = k(view);
        if (abstractC0244b0K != null) {
            abstractC0244b0K.f3713s = b5;
            if (!z10) {
                abstractC0244b0K.e(l0Var);
                z10 = abstractC0244b0K.f3712r == 0;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                g(viewGroup.getChildAt(i10), l0Var, b5, z10);
            }
        }
    }

    public static void h(View view, B0 b5, List list) {
        AbstractC0244b0 abstractC0244b0K = k(view);
        if (abstractC0244b0K != null) {
            b5 = abstractC0244b0K.f(b5, list);
            if (abstractC0244b0K.f3712r == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                h(viewGroup.getChildAt(i10), b5, list);
            }
        }
    }

    public static void i(View view, l0 l0Var, M.k kVar) {
        AbstractC0244b0 abstractC0244b0K = k(view);
        if (abstractC0244b0K != null) {
            abstractC0244b0K.g(l0Var, kVar);
            if (abstractC0244b0K.f3712r == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                i(viewGroup.getChildAt(i10), l0Var, kVar);
            }
        }
    }

    public static WindowInsets j(View view, WindowInsets windowInsets) {
        return view.getTag(R.id.tag_on_apply_window_listener) != null ? windowInsets : view.onApplyWindowInsets(windowInsets);
    }

    public static AbstractC0244b0 k(View view) {
        Object tag = view.getTag(R.id.tag_window_insets_animation_callback);
        if (tag instanceof ViewOnApplyWindowInsetsListenerC0252f0) {
            return ((ViewOnApplyWindowInsetsListenerC0252f0) tag).f3730a;
        }
        return null;
    }
}
