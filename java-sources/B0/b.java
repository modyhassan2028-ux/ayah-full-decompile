package B0;

import android.view.KeyEvent;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final KeyEvent f585a;

    public final boolean equals(Object obj) {
        if (obj instanceof b) {
            return j.a(this.f585a, ((b) obj).f585a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f585a.hashCode();
    }

    public final String toString() {
        return "KeyEvent(nativeKeyEvent=" + this.f585a + ')';
    }
}
