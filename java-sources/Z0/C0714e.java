package Z0;

/* JADX INFO: renamed from: Z0.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0714e implements InterfaceC0716g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f10919a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f10920b;

    public C0714e(int i10, int i11) {
        this.f10919a = i10;
        this.f10920b = i11;
        if (i10 >= 0 && i11 >= 0) {
            return;
        }
        p002a1.a.a("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i10 + " and " + i11 + " respectively.");
    }

    @Override // Z0.InterfaceC0716g
    public final void a(h hVar) {
        int i10 = hVar.f10925c;
        W0.e eVar = hVar.f10923a;
        int i11 = this.f10920b;
        int iB = i10 + i11;
        if (((i10 ^ iB) & (i11 ^ iB)) < 0) {
            iB = eVar.b();
        }
        hVar.a(hVar.f10925c, Math.min(iB, eVar.b()));
        int i12 = hVar.f10924b;
        int i13 = this.f10919a;
        int i14 = i12 - i13;
        if (((i12 ^ i14) & (i13 ^ i12)) < 0) {
            i14 = 0;
        }
        hVar.a(Math.max(0, i14), hVar.f10924b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0714e)) {
            return false;
        }
        C0714e c0714e = (C0714e) obj;
        return this.f10919a == c0714e.f10919a && this.f10920b == c0714e.f10920b;
    }

    public final int hashCode() {
        return (this.f10919a * 31) + this.f10920b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DeleteSurroundingTextCommand(lengthBeforeCursor=");
        sb.append(this.f10919a);
        sb.append(", lengthAfterCursor=");
        return android.support.v4.media.session.p.A(sb, this.f10920b, ')');
    }
}
