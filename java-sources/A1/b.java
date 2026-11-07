package A1;

import android.content.res.ColorStateList;
import android.graphics.Insets;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.ColorStateListDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.os.Trace;
import android.view.View;
import android.view.contentcapture.ContentCaptureSession;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    public static Drawable a(Drawable drawable, Drawable drawable2, int i10, int i11) {
        if (drawable == null) {
            return drawable2;
        }
        if (drawable2 == null) {
            return drawable;
        }
        if (i10 == -1 && (i10 = drawable2.getIntrinsicWidth()) == -1) {
            i10 = drawable.getIntrinsicWidth();
        }
        if (i11 == -1 && (i11 = drawable2.getIntrinsicHeight()) == -1) {
            i11 = drawable.getIntrinsicHeight();
        }
        if (i10 > drawable.getIntrinsicWidth() || i11 > drawable.getIntrinsicHeight()) {
            float f3 = i10 / i11;
            if (f3 >= drawable.getIntrinsicWidth() / drawable.getIntrinsicHeight()) {
                int intrinsicWidth = drawable.getIntrinsicWidth();
                i11 = (int) (intrinsicWidth / f3);
                i10 = intrinsicWidth;
            } else {
                i11 = drawable.getIntrinsicHeight();
                i10 = (int) (f3 * i11);
            }
        }
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{drawable, drawable2});
        layerDrawable.setLayerSize(1, i10, i11);
        layerDrawable.setLayerGravity(1, 17);
        return layerDrawable;
    }

    public static Drawable b(Drawable drawable, ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (drawable == null) {
            return null;
        }
        if (colorStateList != null) {
            drawable = drawable.mutate();
            if (mode != null) {
                drawable.setTintMode(mode);
            }
        }
        return drawable;
    }

    public static int[] c(int[] iArr) {
        for (int i10 = 0; i10 < iArr.length; i10++) {
            int i11 = iArr[i10];
            if (i11 == 16842912) {
                return iArr;
            }
            if (i11 == 0) {
                int[] iArr2 = (int[]) iArr.clone();
                iArr2[i10] = 16842912;
                return iArr2;
            }
        }
        int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length + 1);
        iArrCopyOf[iArr.length] = 16842912;
        return iArrCopyOf;
    }

    public static ColorStateList d(Drawable drawable) {
        if (drawable instanceof ColorDrawable) {
            return ColorStateList.valueOf(((ColorDrawable) drawable).getColor());
        }
        if (Build.VERSION.SDK_INT < 29 || !(drawable instanceof ColorStateListDrawable)) {
            return null;
        }
        return ((ColorStateListDrawable) drawable).getColorStateList();
    }

    public static ContentCaptureSession e(View view) {
        return view.getContentCaptureSession();
    }

    public static boolean f() {
        return Trace.isEnabled();
    }

    public static Insets g(int i10, int i11, int i12, int i13) {
        return Insets.of(i10, i11, i12, i13);
    }

    public static void h(Outline outline, Path path) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 30) {
            C7.b.a(outline, path);
            return;
        }
        if (i10 >= 29) {
            try {
                C7.a.a(outline, path);
            } catch (IllegalArgumentException unused) {
            }
        } else if (path.isConvex()) {
            C7.a.a(outline, path);
        }
    }
}
