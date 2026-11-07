package p151p;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import p073h.a;
import p074h0.i;

/* JADX INFO: loaded from: classes.dex */
public abstract class Y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f20629a = new ThreadLocal();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f20630b = {-16842910};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[] f20631c = {R.attr.state_focused};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int[] f20632d = {R.attr.state_pressed};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int[] f20633e = {R.attr.state_checked};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int[] f20634f = new int[0];
    public static final int[] g = new int[1];

    public static void a(View view, Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(a.f16388k);
        try {
            if (!typedArrayObtainStyledAttributes.hasValue(117)) {
                Log.e("ThemeUtils", "View " + view.getClass() + " is an AppCompat widget that can only be used with a Theme.AppCompat theme (or descendant).");
            }
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static int b(Context context, int i10) {
        ColorStateList colorStateListD = d(context, i10);
        if (colorStateListD != null && colorStateListD.isStateful()) {
            return colorStateListD.getColorForState(f20630b, colorStateListD.getDefaultColor());
        }
        ThreadLocal threadLocal = f20629a;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        context.getTheme().resolveAttribute(R.attr.disabledAlpha, typedValue, true);
        float f3 = typedValue.getFloat();
        int iC = c(context, i10);
        return A1.a.e(iC, Math.round(Color.alpha(iC) * f3));
    }

    public static int c(Context context, int i10) {
        int[] iArr = g;
        iArr[0] = i10;
        i iVarA = i.A(context, null, iArr);
        try {
            return ((TypedArray) iVarA.f16423t).getColor(0, 0);
        } finally {
            iVarA.C();
        }
    }

    public static ColorStateList d(Context context, int i10) {
        int[] iArr = g;
        iArr[0] = i10;
        i iVarA = i.A(context, null, iArr);
        try {
            return iVarA.q(0);
        } finally {
            iVarA.C();
        }
    }
}
