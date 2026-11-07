package androidx.lifecycle;

import android.app.Activity;

/* JADX INFO: loaded from: classes.dex */
public abstract class B {
    public static final void a(Activity activity, C.a aVar) {
        activity.registerActivityLifecycleCallbacks(aVar);
    }
}
