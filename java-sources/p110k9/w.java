package p110k9;

import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class w implements Comparable {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final short f19093r;

    public /* synthetic */ w(short s10) {
        this.f19093r = s10;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return j.f(this.f19093r & 65535, ((w) obj).f19093r & 65535);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof w) {
            return this.f19093r == ((w) obj).f19093r;
        }
        return false;
    }

    public final int hashCode() {
        return this.f19093r;
    }

    public final String toString() {
        return String.valueOf(this.f19093r & 65535);
    }
}
