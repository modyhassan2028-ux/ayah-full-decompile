package X;

/* JADX INFO: renamed from: X.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0633e implements G {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l0.h f9733a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l0.h f9734b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f9735c;

    public C0633e(l0.h hVar, l0.h hVar2, int i10) {
        this.f9733a = hVar;
        this.f9734b = hVar2;
        this.f9735c = i10;
    }

    @Override // X.G
    public final int a(p063g1.k kVar, long j, int i10, p063g1.m mVar) {
        int iA = this.f9734b.a(0, kVar.d(), mVar);
        int i11 = -this.f9733a.a(0, i10, mVar);
        p063g1.m mVar2 = p063g1.m.f16261r;
        int i12 = this.f9735c;
        if (mVar != mVar2) {
            i12 = -i12;
        }
        return kVar.f16256a + iA + i11 + i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0633e)) {
            return false;
        }
        C0633e c0633e = (C0633e) obj;
        return this.f9733a.equals(c0633e.f9733a) && this.f9734b.equals(c0633e.f9734b) && this.f9735c == c0633e.f9735c;
    }

    public final int hashCode() {
        return p123m2.c.n(Float.floatToIntBits(this.f9733a.f19324a) * 31, this.f9734b.f19324a, 31) + this.f9735c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Horizontal(menuAlignment=");
        sb.append(this.f9733a);
        sb.append(", anchorAlignment=");
        sb.append(this.f9734b);
        sb.append(", offset=");
        return android.support.v4.media.session.p.A(sb, this.f9735c, ')');
    }
}
