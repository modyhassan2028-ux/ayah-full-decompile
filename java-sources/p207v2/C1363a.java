package p207v2;

import p251z9.j;

/* JADX INFO: renamed from: v2.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1363a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractC1373k f23199a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AbstractC1373k f23200b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AbstractC1373k f23201c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C1374l f23202d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C1374l f23203e;

    public C1363a(AbstractC1373k abstractC1373k, AbstractC1373k abstractC1373k2, AbstractC1373k abstractC1373k3, C1374l c1374l, C1374l c1374l2) {
        j.e(abstractC1373k, "refresh");
        j.e(abstractC1373k2, "prepend");
        j.e(abstractC1373k3, "append");
        j.e(c1374l, "source");
        this.f23199a = abstractC1373k;
        this.f23200b = abstractC1373k2;
        this.f23201c = abstractC1373k3;
        this.f23202d = c1374l;
        this.f23203e = c1374l2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1363a.class != obj.getClass()) {
            return false;
        }
        C1363a c1363a = (C1363a) obj;
        return j.a(this.f23199a, c1363a.f23199a) && j.a(this.f23200b, c1363a.f23200b) && j.a(this.f23201c, c1363a.f23201c) && j.a(this.f23202d, c1363a.f23202d) && j.a(this.f23203e, c1363a.f23203e);
    }

    public final int hashCode() {
        int iHashCode = (this.f23202d.hashCode() + ((this.f23201c.hashCode() + ((this.f23200b.hashCode() + (this.f23199a.hashCode() * 31)) * 31)) * 31)) * 31;
        C1374l c1374l = this.f23203e;
        return iHashCode + (c1374l != null ? c1374l.hashCode() : 0);
    }

    public final String toString() {
        return "CombinedLoadStates(refresh=" + this.f23199a + ", prepend=" + this.f23200b + ", append=" + this.f23201c + ", source=" + this.f23202d + ", mediator=" + this.f23203e + ')';
    }
}
