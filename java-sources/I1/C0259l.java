package I1;

import android.view.DisplayCutout;
import j$.util.Objects;

/* JADX INFO: renamed from: I1.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0259l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DisplayCutout f3758a;

    public C0259l(DisplayCutout displayCutout) {
        this.f3758a = displayCutout;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0259l.class != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.f3758a, ((C0259l) obj).f3758a);
    }

    public final int hashCode() {
        DisplayCutout displayCutout = this.f3758a;
        if (displayCutout == null) {
            return 0;
        }
        return displayCutout.hashCode();
    }

    public final String toString() {
        return "DisplayCutoutCompat{" + this.f3758a + "}";
    }
}
