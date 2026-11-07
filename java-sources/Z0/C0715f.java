package Z0;

/* JADX INFO: renamed from: Z0.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0715f implements InterfaceC0716g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f10921a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f10922b;

    public C0715f(int i10, int i11) {
        this.f10921a = i10;
        this.f10922b = i11;
        if (i10 >= 0 && i11 >= 0) {
            return;
        }
        p002a1.a.a("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i10 + " and " + i11 + " respectively.");
    }

    @Override // Z0.InterfaceC0716g
    public final void a(h hVar) {
        int i10 = 0;
        for (int i11 = 0; i11 < this.f10921a; i11++) {
            int i12 = i10 + 1;
            int i13 = hVar.f10924b;
            if (i13 <= i12) {
                i10 = i13;
                break;
            }
            i10 = (Character.isHighSurrogate(hVar.b((i13 - i12) + (-1))) && Character.isLowSurrogate(hVar.b(hVar.f10924b - i12))) ? i10 + 2 : i12;
        }
        int iB = 0;
        for (int i14 = 0; i14 < this.f10922b; i14++) {
            int i15 = iB + 1;
            int i16 = hVar.f10925c;
            W0.e eVar = hVar.f10923a;
            if (i16 + i15 >= eVar.b()) {
                iB = eVar.b() - hVar.f10925c;
                break;
            }
            iB = (Character.isHighSurrogate(hVar.b((hVar.f10925c + i15) + (-1))) && Character.isLowSurrogate(hVar.b(hVar.f10925c + i15))) ? iB + 2 : i15;
        }
        int i17 = hVar.f10925c;
        hVar.a(i17, iB + i17);
        int i18 = hVar.f10924b;
        hVar.a(i18 - i10, i18);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0715f)) {
            return false;
        }
        C0715f c0715f = (C0715f) obj;
        return this.f10921a == c0715f.f10921a && this.f10922b == c0715f.f10922b;
    }

    public final int hashCode() {
        return (this.f10921a * 31) + this.f10922b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DeleteSurroundingTextInCodePointsCommand(lengthBeforeCursor=");
        sb.append(this.f10921a);
        sb.append(", lengthAfterCursor=");
        return android.support.v4.media.session.p.A(sb, this.f10922b, ')');
    }
}
