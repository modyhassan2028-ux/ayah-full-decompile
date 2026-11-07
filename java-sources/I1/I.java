package I1;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import com.ayah.R;

/* JADX INFO: loaded from: classes.dex */
public abstract class I {
    public static void a(WindowInsets windowInsets, View view) {
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback);
        if (onApplyWindowInsetsListener != null) {
            onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
        }
    }

    public static B0 b(View view, B0 b5, Rect rect) {
        WindowInsets windowInsetsG = b5.g();
        if (windowInsetsG != null) {
            return B0.h(view, view.computeSystemWindowInsets(windowInsetsG, rect));
        }
        rect.setEmpty();
        return b5;
    }

    public static ColorStateList c(View view) {
        return view.getBackgroundTintList();
    }

    public static PorterDuff.Mode d(View view) {
        return view.getBackgroundTintMode();
    }

    public static float e(View view) {
        return view.getElevation();
    }

    public static String f(View view) {
        return view.getTransitionName();
    }

    public static float g(View view) {
        return view.getZ();
    }

    public static boolean h(View view) {
        return view.isNestedScrollingEnabled();
    }

    public static void i(View view, ColorStateList colorStateList) {
        view.setBackgroundTintList(colorStateList);
    }

    public static void j(View view, PorterDuff.Mode mode) {
        view.setBackgroundTintMode(mode);
    }

    public static void k(View view, float f3) {
        view.setElevation(f3);
    }

    public static void l(View view, boolean z10) {
        view.setNestedScrollingEnabled(z10);
    }

    public static void m(View view, r rVar) {
        H h7 = rVar != null ? new H(view, rVar) : null;
        if (Build.VERSION.SDK_INT < 30) {
            view.setTag(R.id.tag_on_apply_window_listener, h7);
        }
        if (view.getTag(R.id.tag_compat_insets_dispatch) != null) {
            return;
        }
        if (h7 != null) {
            view.setOnApplyWindowInsetsListener(h7);
        } else {
            view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback));
        }
    }

    public static void n(View view) {
        view.stopNestedScroll();
    }
}
