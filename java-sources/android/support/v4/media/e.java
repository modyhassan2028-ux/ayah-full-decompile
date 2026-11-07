package android.support.v4.media;

import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.util.Log;
import p151p.C1271v;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final boolean f11305b = Log.isLoggable("MediaBrowserCompat", 3);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f11306a;

    public e(Context context, ComponentName componentName, C1271v c1271v) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f11306a = new d(context, componentName, c1271v);
        } else {
            this.f11306a = new c(context, componentName, c1271v);
        }
    }
}
