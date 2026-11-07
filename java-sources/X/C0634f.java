package X;

/* JADX INFO: renamed from: X.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0634f implements H {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l0.i f9736a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l0.i f9737b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f9738c;

    public C0634f(l0.i iVar, l0.i iVar2, int i10) {
        this.f9736a = iVar;
        this.f9737b = iVar2;
        this.f9738c = i10;
    }

    @Override // X.H
    public final int a(p063g1.k kVar, long j, int i10) {
        int iA = this.f9737b.a(0, kVar.b());
        return kVar.f16257b + iA + (-this.f9736a.a(0, i10)) + this.f9738c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0634f)) {
            return false;
        }
        C0634f c0634f = (C0634f) obj;
        return this.f9736a.equals(c0634f.f9736a) && this.f9737b.equals(c0634f.f9737b) && this.f9738c == c0634f.f9738c;
    }

    public final int hashCode() {
        return p123m2.c.n(Float.floatToIntBits(this.f9736a.f19325a) * 31, this.f9737b.f19325a, 31) + this.f9738c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Vertical(menuAlignment=");
        sb.append(this.f9736a);
        sb.append(", anchorAlignment=");
        sb.append(this.f9737b);
        sb.append(", offset=");
        return android.support.v4.media.session.p.A(sb, this.f9738c, ')');
    }
}
