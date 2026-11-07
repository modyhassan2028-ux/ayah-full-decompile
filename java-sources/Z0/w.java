package Z0;

import U0.C0515g;

/* JADX INFO: loaded from: classes.dex */
public final class w implements InterfaceC0716g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0515g f10949a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f10950b;

    public w(String str, int i10) {
        this.f10949a = new C0515g(str);
        this.f10950b = i10;
    }

    @Override // Z0.InterfaceC0716g
    public final void a(h hVar) {
        int i10 = hVar.f10926d;
        C0515g c0515g = this.f10949a;
        if (i10 != -1) {
            int i11 = hVar.f10927e;
            String str = c0515g.f8060s;
            String str2 = c0515g.f8060s;
            hVar.d(str, i10, i11);
            if (str2.length() > 0) {
                hVar.e(i10, str2.length() + i10);
            }
        } else {
            int i12 = hVar.f10924b;
            int i13 = hVar.f10925c;
            String str3 = c0515g.f8060s;
            String str4 = c0515g.f8060s;
            hVar.d(str3, i12, i13);
            if (str4.length() > 0) {
                hVar.e(i12, str4.length() + i12);
            }
        }
        int i14 = hVar.f10924b;
        int i15 = hVar.f10925c;
        int i16 = i14 == i15 ? i15 : -1;
        int i17 = this.f10950b;
        int iL = B0.c.l(i17 > 0 ? (i16 + i17) - 1 : (i16 + i17) - c0515g.f8060s.length(), 0, hVar.f10923a.b());
        hVar.f(iL, iL);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return p251z9.j.a(this.f10949a.f8060s, wVar.f10949a.f8060s) && this.f10950b == wVar.f10950b;
    }

    public final int hashCode() {
        return (this.f10949a.f8060s.hashCode() * 31) + this.f10950b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SetComposingTextCommand(text='");
        sb.append(this.f10949a.f8060s);
        sb.append("', newCursorPosition=");
        return android.support.v4.media.session.p.A(sb, this.f10950b, ')');
    }
}
