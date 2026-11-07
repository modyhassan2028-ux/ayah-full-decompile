package p207v2;

import p251z9.j;

/* JADX INFO: renamed from: v2.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1374l {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C1374l f23262d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractC1373k f23263a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AbstractC1373k f23264b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AbstractC1373k f23265c;

    static {
        C1372j c1372j = C1372j.f23256c;
        f23262d = new C1374l(c1372j, c1372j, c1372j);
    }

    public C1374l(AbstractC1373k abstractC1373k, AbstractC1373k abstractC1373k2, AbstractC1373k abstractC1373k3) {
        this.f23263a = abstractC1373k;
        this.f23264b = abstractC1373k2;
        this.f23265c = abstractC1373k3;
    }

    public static C1374l a(C1374l c1374l, int i10) {
        int i11 = i10 & 1;
        AbstractC1373k abstractC1373k = C1372j.f23256c;
        AbstractC1373k abstractC1373k2 = i11 != 0 ? c1374l.f23263a : abstractC1373k;
        AbstractC1373k abstractC1373k3 = (i10 & 2) != 0 ? c1374l.f23264b : abstractC1373k;
        if ((i10 & 4) != 0) {
            abstractC1373k = c1374l.f23265c;
        }
        return new C1374l(abstractC1373k2, abstractC1373k3, abstractC1373k);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1374l)) {
            return false;
        }
        C1374l c1374l = (C1374l) obj;
        return j.a(this.f23263a, c1374l.f23263a) && j.a(this.f23264b, c1374l.f23264b) && j.a(this.f23265c, c1374l.f23265c);
    }

    public final int hashCode() {
        return this.f23265c.hashCode() + ((this.f23264b.hashCode() + (this.f23263a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "LoadStates(refresh=" + this.f23263a + ", prepend=" + this.f23264b + ", append=" + this.f23265c + ')';
    }
}
