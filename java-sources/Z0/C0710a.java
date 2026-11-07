package Z0;

import U0.C0515g;

/* JADX INFO: renamed from: Z0.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0710a implements InterfaceC0716g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0515g f10894a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f10895b;

    public C0710a(C0515g c0515g, int i10) {
        this.f10894a = c0515g;
        this.f10895b = i10;
    }

    @Override // Z0.InterfaceC0716g
    public final void a(h hVar) {
        int i10 = hVar.f10926d;
        C0515g c0515g = this.f10894a;
        if (i10 != -1) {
            hVar.d(c0515g.f8060s, i10, hVar.f10927e);
        } else {
            hVar.d(c0515g.f8060s, hVar.f10924b, hVar.f10925c);
        }
        int i11 = hVar.f10924b;
        int i12 = hVar.f10925c;
        int i13 = i11 == i12 ? i12 : -1;
        int i14 = this.f10895b;
        int iL = B0.c.l(i14 > 0 ? (i13 + i14) - 1 : (i13 + i14) - c0515g.f8060s.length(), 0, hVar.f10923a.b());
        hVar.f(iL, iL);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0710a)) {
            return false;
        }
        C0710a c0710a = (C0710a) obj;
        return p251z9.j.a(this.f10894a.f8060s, c0710a.f10894a.f8060s) && this.f10895b == c0710a.f10895b;
    }

    public final int hashCode() {
        return (this.f10894a.f8060s.hashCode() * 31) + this.f10895b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CommitTextCommand(text='");
        sb.append(this.f10894a.f8060s);
        sb.append("', newCursorPosition=");
        return android.support.v4.media.session.p.A(sb, this.f10895b, ')');
    }

    public C0710a(String str, int i10) {
        this(new C0515g(str), i10);
    }
}
