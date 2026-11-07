package Y3;

import p185s8.u0;

/* JADX INFO: loaded from: classes.dex */
public final class u extends va.g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u0 f10428c;

    public u(u0 u0Var) {
        super(16);
        this.f10428c = u0Var;
    }

    @Override // va.g
    public final u0 B() {
        return this.f10428c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u) && p251z9.j.a(this.f10428c, ((u) obj).f10428c);
    }

    @Override // va.g
    public final int hashCode() {
        return this.f10428c.hashCode();
    }

    @Override // va.g
    public final String toString() {
        return "Unfilled(verseMarkerBadge=" + this.f10428c + ")";
    }
}
