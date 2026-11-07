package J1;

import android.view.accessibility.AccessibilityNodeInfo;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f4215a;

    public /* synthetic */ e(Object obj) {
        this.f4215a = obj;
    }

    public static e a(int i10, int i11, int i12) {
        return new e(AccessibilityNodeInfo.CollectionInfo.obtain(i10, i11, false, i12));
    }
}
