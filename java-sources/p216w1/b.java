package p216w1;

import android.app.Activity;
import android.content.pm.PackageManager;
import android.os.Build;
import android.text.TextUtils;
import java.lang.reflect.InvocationTargetException;
import p181s2.s;

/* JADX INFO: loaded from: classes.dex */
public abstract class b extends s {
    public static boolean g(Activity activity) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 33 && TextUtils.equals("android.permission.POST_NOTIFICATIONS", "android.permission.POST_NOTIFICATIONS")) {
            return false;
        }
        if (i10 >= 32) {
            return activity.shouldShowRequestPermissionRationale("android.permission.POST_NOTIFICATIONS");
        }
        if (i10 != 31) {
            return activity.shouldShowRequestPermissionRationale("android.permission.POST_NOTIFICATIONS");
        }
        try {
            return ((Boolean) PackageManager.class.getMethod("shouldShowRequestPermissionRationale", String.class).invoke(activity.getApplication().getPackageManager(), "android.permission.POST_NOTIFICATIONS")).booleanValue();
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return activity.shouldShowRequestPermissionRationale("android.permission.POST_NOTIFICATIONS");
        }
    }
}
