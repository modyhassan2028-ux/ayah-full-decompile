package p151p;

import android.R;
import android.graphics.Insets;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import com.google.android.gms.internal.measurement.B1;
import io.realm.RealmFieldTypeConstants;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: renamed from: p.j0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1249j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f20688a = {R.attr.state_checked};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f20689b = new int[0];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Rect f20690c = new Rect();

    public static void a(Drawable drawable) {
        String name = drawable.getClass().getName();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 29 || i10 >= 31 || !"android.graphics.drawable.ColorStateListDrawable".equals(name)) {
            return;
        }
        int[] state = drawable.getState();
        if (state == null || state.length == 0) {
            drawable.setState(f20688a);
        } else {
            drawable.setState(f20689b);
        }
        drawable.setState(state);
    }

    public static Rect b(Drawable drawable) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 29) {
            Insets insetsA = AbstractC1247i0.a(drawable);
            return new Rect(insetsA.left, insetsA.top, insetsA.right, insetsA.bottom);
        }
        Drawable drawableN = B1.N(drawable);
        if (i10 >= 29) {
            boolean z10 = AbstractC1245h0.f20665a;
        } else if (AbstractC1245h0.f20665a) {
            try {
                Object objInvoke = AbstractC1245h0.f20666b.invoke(drawableN, null);
                if (objInvoke != null) {
                    return new Rect(AbstractC1245h0.f20667c.getInt(objInvoke), AbstractC1245h0.f20668d.getInt(objInvoke), AbstractC1245h0.f20669e.getInt(objInvoke), AbstractC1245h0.f20670f.getInt(objInvoke));
                }
            } catch (IllegalAccessException | InvocationTargetException unused) {
            }
        }
        return f20690c;
    }

    public static PorterDuff.Mode c(int i10, PorterDuff.Mode mode) {
        if (i10 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i10 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i10 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i10) {
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_LINKING_OBJECTS /* 14 */:
                return PorterDuff.Mode.MULTIPLY;
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_OBJECTID /* 15 */:
                return PorterDuff.Mode.SCREEN;
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_TYPED_LINK /* 16 */:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }
}
