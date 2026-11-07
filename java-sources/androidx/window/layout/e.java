package androidx.window.layout;

import android.app.Activity;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.Display;
import androidx.window.extensions.layout.FoldingFeature;
import androidx.window.extensions.layout.WindowLayoutInfo;
import com.google.android.gms.internal.measurement.K1;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class e {
    public static g a(Activity activity, FoldingFeature foldingFeature) {
        f fVar;
        f fVar2;
        Rect rectA;
        int i10;
        int type = foldingFeature.getType();
        if (type != 1) {
            if (type == 2) {
                fVar = f.f13079h;
            }
            return null;
        }
        fVar = f.g;
        int state = foldingFeature.getState();
        if (state != 1) {
            if (state == 2) {
                fVar2 = f.f13078f;
            }
            return null;
        }
        fVar2 = f.f13077e;
        Rect bounds = foldingFeature.getBounds();
        p251z9.j.d(bounds, "oemFeature.bounds");
        int i11 = bounds.left;
        int i12 = bounds.top;
        int i13 = bounds.right;
        int i14 = bounds.bottom;
        int i15 = Build.VERSION.SDK_INT;
        if (i15 >= 30) {
            rectA = B1.b.b(activity);
        } else if (i15 >= 29) {
            Configuration configuration = activity.getResources().getConfiguration();
            try {
                Field declaredField = Configuration.class.getDeclaredField("windowConfiguration");
                declaredField.setAccessible(true);
                Object obj = declaredField.get(configuration);
                Object objInvoke = obj.getClass().getDeclaredMethod("getBounds", null).invoke(obj, null);
                if (objInvoke == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.graphics.Rect");
                }
                rectA = new Rect((Rect) objInvoke);
            } catch (IllegalAccessException e10) {
                Log.w("B", e10);
                rectA = B.a(activity);
            } catch (NoSuchFieldException e11) {
                Log.w("B", e11);
                rectA = B.a(activity);
            } catch (NoSuchMethodException e12) {
                Log.w("B", e12);
                rectA = B.a(activity);
            } catch (InvocationTargetException e13) {
                Log.w("B", e13);
                rectA = B.a(activity);
            }
        } else if (i15 >= 28) {
            rectA = B.a(activity);
        } else if (i15 >= 24) {
            Rect rect = new Rect();
            Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
            defaultDisplay.getRectSize(rect);
            if (!K1.i(activity)) {
                Point point = new Point();
                defaultDisplay.getRealSize(point);
                Resources resources = activity.getResources();
                int identifier = resources.getIdentifier("navigation_bar_height", "dimen", "android");
                int dimensionPixelSize = identifier > 0 ? resources.getDimensionPixelSize(identifier) : 0;
                int i16 = rect.bottom + dimensionPixelSize;
                if (i16 == point.y) {
                    rect.bottom = i16;
                } else {
                    int i17 = rect.right + dimensionPixelSize;
                    if (i17 == point.x) {
                        rect.right = i17;
                    }
                }
            }
            rectA = rect;
        } else {
            Display defaultDisplay2 = activity.getWindowManager().getDefaultDisplay();
            p251z9.j.d(defaultDisplay2, "defaultDisplay");
            Point point2 = new Point();
            defaultDisplay2.getRealSize(point2);
            Rect rect2 = new Rect();
            int i18 = point2.x;
            if (i18 == 0 || (i10 = point2.y) == 0) {
                defaultDisplay2.getRectSize(rect2);
            } else {
                rect2.right = i18;
                rect2.bottom = i10;
            }
            rectA = rect2;
        }
        Rect rect3 = new Rect(rectA.left, rectA.top, rectA.right, rectA.bottom);
        int i19 = i14 - i12;
        if (i19 == 0 && i13 - i11 == 0) {
            return null;
        }
        int i20 = i13 - i11;
        if (i20 != rect3.width() && i19 != rect3.height()) {
            return null;
        }
        if (i20 < rect3.width() && i19 < rect3.height()) {
            return null;
        }
        if (i20 == rect3.width() && i19 == rect3.height()) {
            return null;
        }
        Rect bounds2 = foldingFeature.getBounds();
        p251z9.j.d(bounds2, "oemFeature.bounds");
        return new g(new p024c3.b(bounds2), fVar, fVar2);
    }

    public static A b(Activity activity, WindowLayoutInfo windowLayoutInfo) {
        g gVarA;
        p251z9.j.e(windowLayoutInfo, "info");
        List<FoldingFeature> displayFeatures = windowLayoutInfo.getDisplayFeatures();
        p251z9.j.d(displayFeatures, "info.displayFeatures");
        ArrayList arrayList = new ArrayList();
        for (FoldingFeature foldingFeature : displayFeatures) {
            if (foldingFeature instanceof FoldingFeature) {
                p251z9.j.d(foldingFeature, "feature");
                gVarA = a(activity, foldingFeature);
            } else {
                gVarA = null;
            }
            if (gVarA != null) {
                arrayList.add(gVarA);
            }
        }
        return new A(arrayList);
    }
}
