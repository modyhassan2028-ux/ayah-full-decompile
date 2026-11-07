package p038d7;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import com.google.android.gms.common.api.internal.zabx;
import p181s2.s;

/* JADX INFO: loaded from: classes.dex */
public abstract class d extends s {
    public static void g(Context context, zabx zabxVar, IntentFilter intentFilter) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 33) {
            context.registerReceiver(zabxVar, intentFilter, i10 >= 33 ? 2 : 0);
        } else {
            context.registerReceiver(zabxVar, intentFilter);
        }
    }
}
