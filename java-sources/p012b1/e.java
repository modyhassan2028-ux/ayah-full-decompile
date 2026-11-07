package p012b1;

import R7.f;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f13147a;

    static {
        f13147a = Build.VERSION.SDK_INT >= 24 ? new a() : new f(20);
    }
}
