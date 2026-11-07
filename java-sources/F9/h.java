package F9;

import p251z9.A;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f2540c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f2541a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final A f2542b;

    static {
        new h(null, null);
    }

    public h(i iVar, A a9) {
        String str;
        this.f2541a = iVar;
        this.f2542b = a9;
        if ((iVar == null) == (a9 == null)) {
            return;
        }
        if (iVar == null) {
            str = "Star projection must have no type specified.";
        } else {
            str = "The projection variance " + iVar + " requires type to be specified.";
        }
        throw new IllegalArgumentException(str.toString());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f2541a == hVar.f2541a && p251z9.j.a(this.f2542b, hVar.f2542b);
    }

    public final int hashCode() {
        i iVar = this.f2541a;
        int iHashCode = (iVar == null ? 0 : iVar.hashCode()) * 31;
        A a9 = this.f2542b;
        return iHashCode + (a9 != null ? a9.hashCode() : 0);
    }

    public final String toString() {
        i iVar = this.f2541a;
        int i10 = iVar == null ? -1 : g.f2539a[iVar.ordinal()];
        if (i10 == -1) {
            return "*";
        }
        A a9 = this.f2542b;
        if (i10 == 1) {
            return String.valueOf(a9);
        }
        if (i10 == 2) {
            return "in " + a9;
        }
        if (i10 != 3) {
            throw new A6.a();
        }
        return "out " + a9;
    }
}
