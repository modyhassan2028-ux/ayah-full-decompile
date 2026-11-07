package O7;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Build;
import android.util.Log;
import android.util.StateSet;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f6500a = {R.attr.state_pressed};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f6501b = {R.attr.state_focused};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[] f6502c = {R.attr.state_selected, R.attr.state_pressed};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int[] f6503d = {R.attr.state_selected};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int[] f6504e = {R.attr.state_enabled, R.attr.state_pressed};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f6505f = a.class.getSimpleName();

    public static ColorStateList a(ColorStateList colorStateList) {
        int[] iArr = f6501b;
        return new ColorStateList(new int[][]{f6503d, iArr, StateSet.NOTHING}, new int[]{b(colorStateList, f6502c), b(colorStateList, iArr), b(colorStateList, f6500a)});
    }

    public static int b(ColorStateList colorStateList, int[] iArr) {
        int colorForState = colorStateList != null ? colorStateList.getColorForState(iArr, colorStateList.getDefaultColor()) : 0;
        return A1.a.e(colorForState, Math.min(Color.alpha(colorForState) * 2, 255));
    }

    public static ColorStateList c(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return ColorStateList.valueOf(0);
        }
        if (Build.VERSION.SDK_INT <= 27 && Color.alpha(colorStateList.getDefaultColor()) == 0 && Color.alpha(colorStateList.getColorForState(f6504e, 0)) != 0) {
            Log.w(f6505f, "Use a non-transparent color for the default color as it will be used to finish ripple animations.");
        }
        return colorStateList;
    }

    public static boolean d(int[] iArr) {
        boolean z10 = false;
        boolean z11 = false;
        for (int i10 : iArr) {
            if (i10 == 16842910) {
                z10 = true;
            } else if (i10 == 16842908 || i10 == 16842919 || i10 == 16843623) {
                z11 = true;
            }
        }
        return z10 && z11;
    }
}
