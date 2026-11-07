package D0;

/* JADX INFO: renamed from: D0.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0083a implements s {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f1085b;

    public C0083a(int i10) {
        this.f1085b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C0083a.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        p251z9.j.c(obj, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.AndroidPointerIconType");
        return this.f1085b == ((C0083a) obj).f1085b;
    }

    public final int hashCode() {
        return this.f1085b;
    }

    public final String toString() {
        return android.support.v4.media.session.p.A(new StringBuilder("AndroidPointerIcon(type="), this.f1085b, ')');
    }
}
