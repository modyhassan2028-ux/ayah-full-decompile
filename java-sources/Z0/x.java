package Z0;

/* JADX INFO: loaded from: classes.dex */
public final class x implements InterfaceC0716g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f10951a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f10952b;

    public x(int i10, int i11) {
        this.f10951a = i10;
        this.f10952b = i11;
    }

    @Override // Z0.InterfaceC0716g
    public final void a(h hVar) {
        int iL = B0.c.l(this.f10951a, 0, hVar.f10923a.b());
        int iL2 = B0.c.l(this.f10952b, 0, hVar.f10923a.b());
        if (iL < iL2) {
            hVar.f(iL, iL2);
        } else {
            hVar.f(iL2, iL);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return this.f10951a == xVar.f10951a && this.f10952b == xVar.f10952b;
    }

    public final int hashCode() {
        return (this.f10951a * 31) + this.f10952b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SetSelectionCommand(start=");
        sb.append(this.f10951a);
        sb.append(", end=");
        return android.support.v4.media.session.p.A(sb, this.f10952b, ')');
    }
}
