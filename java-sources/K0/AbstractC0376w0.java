package K0;

import android.content.Context;
import android.os.Build;
import android.os.Vibrator;

/* JADX INFO: renamed from: K0.w0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0376w0 {
    public static boolean a(Context context) {
        return Build.VERSION.SDK_INT >= 31 && ((Vibrator) context.getSystemService(Vibrator.class)).areAllPrimitivesSupported(1, 7, 2);
    }
}
