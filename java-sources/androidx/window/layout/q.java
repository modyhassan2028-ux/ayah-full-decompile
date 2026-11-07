package androidx.window.layout;

import android.content.Context;
import android.text.TextUtils;
import androidx.window.sidecar.SidecarInterface;
import androidx.window.sidecar.SidecarProvider;

/* JADX INFO: loaded from: classes.dex */
public abstract class q {
    public static SidecarInterface a(Context context) {
        return SidecarProvider.getSidecarImpl(context.getApplicationContext());
    }

    public static p024c3.e b() {
        try {
            String apiVersion = SidecarProvider.getApiVersion();
            if (TextUtils.isEmpty(apiVersion)) {
                return null;
            }
            p024c3.e eVar = p024c3.e.f13454w;
            return B9.a.P(apiVersion);
        } catch (NoClassDefFoundError | UnsupportedOperationException unused) {
            return null;
        }
    }
}
