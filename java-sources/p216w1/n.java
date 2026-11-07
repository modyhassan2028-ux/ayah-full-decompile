package p216w1;

import B1.a;
import android.app.PendingIntent;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import androidx.core.graphics.drawable.IconCompat;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Bundle f23596a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public IconCompat f23597b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f23598c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f23599d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f23600e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final CharSequence f23601f;
    public final PendingIntent g;

    public n(int i10, CharSequence charSequence, PendingIntent pendingIntent) {
        IconCompat iconCompatD = i10 == 0 ? null : IconCompat.d(null, "", i10);
        Bundle bundle = new Bundle();
        this.f23599d = true;
        this.f23597b = iconCompatD;
        if (iconCompatD != null) {
            int iIntValue = iconCompatD.f12334a;
            if (iIntValue == -1) {
                int i11 = Build.VERSION.SDK_INT;
                Object obj = iconCompatD.f12335b;
                if (i11 >= 28) {
                    iIntValue = a.l(obj);
                } else {
                    try {
                        iIntValue = ((Integer) obj.getClass().getMethod("getType", null).invoke(obj, null)).intValue();
                    } catch (IllegalAccessException e10) {
                        Log.e("IconCompat", "Unable to get icon type " + obj, e10);
                        iIntValue = -1;
                    } catch (NoSuchMethodException e11) {
                        Log.e("IconCompat", "Unable to get icon type " + obj, e11);
                        iIntValue = -1;
                    } catch (InvocationTargetException e12) {
                        Log.e("IconCompat", "Unable to get icon type " + obj, e12);
                        iIntValue = -1;
                    }
                }
            }
            if (iIntValue == 2) {
                this.f23600e = iconCompatD.e();
            }
        }
        this.f23601f = p.b(charSequence);
        this.g = pendingIntent;
        this.f23596a = bundle;
        this.f23598c = true;
        this.f23599d = true;
    }
}
