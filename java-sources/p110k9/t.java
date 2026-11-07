package p110k9;

import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class t implements Comparable {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final long f19090r;

    public /* synthetic */ t(long j) {
        this.f19090r = j;
    }

    public static int a(long j) {
        return (int) (j ^ (j >>> 32));
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return j.g(this.f19090r ^ Long.MIN_VALUE, ((t) obj).f19090r ^ Long.MIN_VALUE);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof t) {
            return this.f19090r == ((t) obj).f19090r;
        }
        return false;
    }

    public final int hashCode() {
        return a(this.f19090r);
    }

    public final String toString() {
        return a.g(this.f19090r, 10);
    }
}
