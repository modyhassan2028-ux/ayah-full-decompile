package Z0;

/* JADX INFO: loaded from: classes.dex */
public final class v implements InterfaceC0716g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f10947a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f10948b;

    public v(int i10, int i11) {
        this.f10947a = i10;
        this.f10948b = i11;
    }

    @Override // Z0.InterfaceC0716g
    public final void a(h hVar) {
        boolean z10 = hVar.f10926d != -1;
        W0.e eVar = hVar.f10923a;
        if (z10) {
            hVar.f10926d = -1;
            hVar.f10927e = -1;
        }
        int iL = B0.c.l(this.f10947a, 0, eVar.b());
        int iL2 = B0.c.l(this.f10948b, 0, eVar.b());
        if (iL != iL2) {
            if (iL < iL2) {
                hVar.e(iL, iL2);
            } else {
                hVar.e(iL2, iL);
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return this.f10947a == vVar.f10947a && this.f10948b == vVar.f10948b;
    }

    public final int hashCode() {
        return (this.f10947a * 31) + this.f10948b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SetComposingRegionCommand(start=");
        sb.append(this.f10947a);
        sb.append(", end=");
        return android.support.v4.media.session.p.A(sb, this.f10948b, ')');
    }
}
