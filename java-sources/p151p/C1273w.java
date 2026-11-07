package p151p;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.Log;
import ka.h;

/* JADX INFO: renamed from: p.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1273w {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final PorterDuff.Mode f20796b = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static C1273w f20797c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public H0 f20798a;

    public static synchronized C1273w a() {
        try {
            if (f20797c == null) {
                d();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f20797c;
    }

    public static synchronized PorterDuffColorFilter c(int i10, PorterDuff.Mode mode) {
        return H0.h(i10, mode);
    }

    public static synchronized void d() {
        if (f20797c == null) {
            C1273w c1273w = new C1273w();
            f20797c = c1273w;
            c1273w.f20798a = H0.d();
            f20797c.f20798a.m(new C1271v());
        }
    }

    public static void e(Drawable drawable, h hVar, int[] iArr) {
        PorterDuff.Mode mode = H0.f20549h;
        int[] state = drawable.getState();
        if (drawable.mutate() != drawable) {
            Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
            return;
        }
        if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
            drawable.setState(new int[0]);
            drawable.setState(state);
        }
        boolean z10 = hVar.f19151b;
        if (z10 || hVar.f19150a) {
            PorterDuffColorFilter porterDuffColorFilterH = null;
            ColorStateList colorStateList = z10 ? (ColorStateList) hVar.f19152c : null;
            PorterDuff.Mode mode2 = hVar.f19150a ? (PorterDuff.Mode) hVar.f19153d : H0.f20549h;
            if (colorStateList != null && mode2 != null) {
                porterDuffColorFilterH = H0.h(colorStateList.getColorForState(iArr, 0), mode2);
            }
            drawable.setColorFilter(porterDuffColorFilterH);
        } else {
            drawable.clearColorFilter();
        }
        if (Build.VERSION.SDK_INT <= 23) {
            drawable.invalidateSelf();
        }
    }

    public final synchronized Drawable b(Context context, int i10) {
        return this.f20798a.f(context, i10);
    }
}
