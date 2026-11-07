package p143o2;

import android.os.Build;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public q f20295a;

    public n(String str, int i10, int i11) {
        if (str == null) {
            throw new NullPointerException("package shouldn't be null");
        }
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("packageName should be nonempty");
        }
        if (Build.VERSION.SDK_INT < 28) {
            this.f20295a = new q(str, i10, i11);
            return;
        }
        p pVar = new p(str, i10, i11);
        o.a(str, i10, i11);
        this.f20295a = pVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof n) {
            return this.f20295a.equals(((n) obj).f20295a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f20295a.hashCode();
    }
}
