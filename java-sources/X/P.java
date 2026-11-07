package X;

/* JADX INFO: loaded from: classes.dex */
public final class P implements H {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l0.i f9721a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f9722b;

    public P(l0.i iVar, int i10) {
        this.f9721a = iVar;
        this.f9722b = i10;
    }

    @Override // X.H
    public final int a(p063g1.k kVar, long j, int i10) {
        int i11 = (int) (j & 4294967295L);
        int i12 = this.f9722b;
        if (i10 < i11 - (i12 * 2)) {
            return B0.c.l(this.f9721a.a(i10, i11), i12, (i11 - i12) - i10);
        }
        return Math.round((1 + 0.0f) * ((i11 - i10) / 2.0f));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof P)) {
            return false;
        }
        P p10 = (P) obj;
        return this.f9721a.equals(p10.f9721a) && this.f9722b == p10.f9722b;
    }

    public final int hashCode() {
        return (Float.floatToIntBits(this.f9721a.f19325a) * 31) + this.f9722b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Vertical(alignment=");
        sb.append(this.f9721a);
        sb.append(", margin=");
        return android.support.v4.media.session.p.A(sb, this.f9722b, ')');
    }
}
