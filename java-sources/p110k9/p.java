package p110k9;

import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class p implements Comparable {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final byte f19086r;

    public /* synthetic */ p(byte b5) {
        this.f19086r = b5;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return j.f(this.f19086r & 255, ((p) obj).f19086r & 255);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof p) {
            return this.f19086r == ((p) obj).f19086r;
        }
        return false;
    }

    public final int hashCode() {
        return this.f19086r;
    }

    public final String toString() {
        return String.valueOf(this.f19086r & 255);
    }
}
