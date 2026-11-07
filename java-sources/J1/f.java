package J1;

import android.os.Handler;
import android.os.Looper;
import android.view.accessibility.AccessibilityNodeInfo;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static f f4216b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f4217a;

    public f() {
        this.f4217a = new Object();
        new Handler(Looper.getMainLooper(), new U7.d(this));
    }

    public static f a(int i10, int i11, int i12, int i13, boolean z10, boolean z11) {
        return new f(AccessibilityNodeInfo.CollectionItemInfo.obtain(i10, i11, i12, i13, z10, z11));
    }

    public void b() {
        synchronized (this.f4217a) {
        }
    }

    public f(AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo) {
        this.f4217a = collectionItemInfo;
    }
}
