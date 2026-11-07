package p207v2;

import p251z9.j;

/* JADX INFO: renamed from: v2.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1368f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f23230a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n0 f23231b;

    public C1368f(int i10, n0 n0Var) {
        j.e(n0Var, "hint");
        this.f23230a = i10;
        this.f23231b = n0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1368f)) {
            return false;
        }
        C1368f c1368f = (C1368f) obj;
        return this.f23230a == c1368f.f23230a && j.a(this.f23231b, c1368f.f23231b);
    }

    public final int hashCode() {
        return this.f23231b.hashCode() + (this.f23230a * 31);
    }

    public final String toString() {
        return "GenerationalViewportHint(generationId=" + this.f23230a + ", hint=" + this.f23231b + ')';
    }
}
