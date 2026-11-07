package p110k9;

import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class r implements Comparable {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f19088r;

    public /* synthetic */ r(int i10) {
        this.f19088r = i10;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return j.f(this.f19088r ^ Integer.MIN_VALUE, ((r) obj).f19088r ^ Integer.MIN_VALUE);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof r) {
            return this.f19088r == ((r) obj).f19088r;
        }
        return false;
    }

    public final int hashCode() {
        return this.f19088r;
    }

    public final String toString() {
        return String.valueOf(((long) this.f19088r) & 4294967295L);
    }
}
