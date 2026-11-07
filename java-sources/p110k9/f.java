package p110k9;

import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class f implements Comparable {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final f f19072s = new f();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f19073r = 131584;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        f fVar = (f) obj;
        j.e(fVar, "other");
        return this.f19073r - fVar.f19073r;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        f fVar = obj instanceof f ? (f) obj : null;
        return fVar != null && this.f19073r == fVar.f19073r;
    }

    public final int hashCode() {
        return this.f19073r;
    }

    public final String toString() {
        return "2.2.0";
    }
}
