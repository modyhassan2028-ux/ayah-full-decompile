package p242z;

import C.a;
import p171r0.c;

/* JADX INFO: loaded from: classes.dex */
public final class h extends i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f24742a;

    public h(long j) {
        this.f24742a = j;
        if ((j & 9223372034707292159L) != 9205357640488583168L) {
            return;
        }
        a.c("ContextMenuState.Status should never be open with an unspecified offset. Use ContextMenuState.Status.Closed instead.");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        return c.b(this.f24742a, ((h) obj).f24742a);
    }

    public final int hashCode() {
        return c.f(this.f24742a);
    }

    public final String toString() {
        return "Open(offset=" + ((Object) c.j(this.f24742a)) + ')';
    }
}
