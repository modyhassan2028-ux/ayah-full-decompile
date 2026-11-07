package p242z;

import Z.C0672b;
import Z.C0681f0;

/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0681f0 f24743a = C0672b.r(g.f24741a);

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof j) {
            return p251z9.j.a((i) ((j) obj).f24743a.getValue(), (i) this.f24743a.getValue());
        }
        return false;
    }

    public final int hashCode() {
        return ((i) this.f24743a.getValue()).hashCode();
    }

    public final String toString() {
        return "ContextMenuState(status=" + ((i) this.f24743a.getValue()) + ')';
    }
}
