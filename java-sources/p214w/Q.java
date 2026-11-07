package p214w;

import p223x.u0;
import p241y9.c;
import p251z9.k;

/* JADX INFO: loaded from: classes.dex */
public final class Q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f23462a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u0 f23463b;

    /* JADX WARN: Multi-variable type inference failed */
    public Q(c cVar, u0 u0Var) {
        this.f23462a = (k) cVar;
        this.f23463b = u0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Q)) {
            return false;
        }
        Q q10 = (Q) obj;
        return this.f23462a.equals(q10.f23462a) && this.f23463b.equals(q10.f23463b);
    }

    public final int hashCode() {
        return this.f23463b.hashCode() + (this.f23462a.hashCode() * 31);
    }

    public final String toString() {
        return "Slide(slideOffset=" + this.f23462a + ", animationSpec=" + this.f23463b + ')';
    }
}
