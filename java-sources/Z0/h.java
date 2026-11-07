package Z0;

import U0.C0515g;
import U0.K;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final W0.e f10923a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f10924b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f10925c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f10926d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f10927e;

    public h(C0515g c0515g, long j) {
        String str = c0515g.f8060s;
        W0.e eVar = new W0.e();
        eVar.f9492d = str;
        eVar.f9490b = -1;
        eVar.f9491c = -1;
        this.f10923a = eVar;
        this.f10924b = K.e(j);
        this.f10925c = K.d(j);
        this.f10926d = -1;
        this.f10927e = -1;
        int iE = K.e(j);
        int iD = K.d(j);
        if (iE < 0 || iE > str.length()) {
            StringBuilder sbW = p123m2.c.w(iE, "start (", ") offset is outside of text region ");
            sbW.append(str.length());
            throw new IndexOutOfBoundsException(sbW.toString());
        }
        if (iD < 0 || iD > str.length()) {
            StringBuilder sbW2 = p123m2.c.w(iD, "end (", ") offset is outside of text region ");
            sbW2.append(str.length());
            throw new IndexOutOfBoundsException(sbW2.toString());
        }
        if (iE > iD) {
            throw new IllegalArgumentException(android.support.v4.media.session.p.w(iE, iD, "Do not set reversed range: ", " > "));
        }
    }

    public final void a(int i10, int i11) {
        long jE = va.g.e(i10, i11);
        this.f10923a.k("", i10, i11);
        long jE0 = B9.a.e0(va.g.e(this.f10924b, this.f10925c), jE);
        h(K.e(jE0));
        g(K.d(jE0));
        int i12 = this.f10926d;
        if (i12 != -1) {
            long jE1 = B9.a.e0(va.g.e(i12, this.f10927e), jE);
            if (K.b(jE1)) {
                this.f10926d = -1;
                this.f10927e = -1;
            } else {
                this.f10926d = K.e(jE1);
                this.f10927e = K.d(jE1);
            }
        }
    }

    public final char b(int i10) {
        W0.e eVar = this.f10923a;
        E2.A a9 = (E2.A) eVar.f9493e;
        if (a9 == null) {
            return ((String) eVar.f9492d).charAt(i10);
        }
        if (i10 < eVar.f9490b) {
            return ((String) eVar.f9492d).charAt(i10);
        }
        int iF = a9.f1434b - a9.f();
        int i11 = eVar.f9490b;
        if (i10 >= iF + i11) {
            return ((String) eVar.f9492d).charAt(i10 - ((iF - eVar.f9491c) + i11));
        }
        int i12 = i10 - i11;
        int i13 = a9.f1435c;
        return i12 < i13 ? ((char[]) a9.f1437e)[i12] : ((char[]) a9.f1437e)[(i12 - i13) + a9.f1436d];
    }

    public final K c() {
        int i10 = this.f10926d;
        if (i10 != -1) {
            return new K(va.g.e(i10, this.f10927e));
        }
        return null;
    }

    public final void d(String str, int i10, int i11) {
        W0.e eVar = this.f10923a;
        if (i10 < 0 || i10 > eVar.b()) {
            StringBuilder sbW = p123m2.c.w(i10, "start (", ") offset is outside of text region ");
            sbW.append(eVar.b());
            throw new IndexOutOfBoundsException(sbW.toString());
        }
        if (i11 < 0 || i11 > eVar.b()) {
            StringBuilder sbW2 = p123m2.c.w(i11, "end (", ") offset is outside of text region ");
            sbW2.append(eVar.b());
            throw new IndexOutOfBoundsException(sbW2.toString());
        }
        if (i10 > i11) {
            throw new IllegalArgumentException(android.support.v4.media.session.p.w(i10, i11, "Do not set reversed range: ", " > "));
        }
        eVar.k(str, i10, i11);
        h(str.length() + i10);
        g(str.length() + i10);
        this.f10926d = -1;
        this.f10927e = -1;
    }

    public final void e(int i10, int i11) {
        W0.e eVar = this.f10923a;
        if (i10 < 0 || i10 > eVar.b()) {
            StringBuilder sbW = p123m2.c.w(i10, "start (", ") offset is outside of text region ");
            sbW.append(eVar.b());
            throw new IndexOutOfBoundsException(sbW.toString());
        }
        if (i11 < 0 || i11 > eVar.b()) {
            StringBuilder sbW2 = p123m2.c.w(i11, "end (", ") offset is outside of text region ");
            sbW2.append(eVar.b());
            throw new IndexOutOfBoundsException(sbW2.toString());
        }
        if (i10 >= i11) {
            throw new IllegalArgumentException(android.support.v4.media.session.p.w(i10, i11, "Do not set reversed or empty range: ", " > "));
        }
        this.f10926d = i10;
        this.f10927e = i11;
    }

    public final void f(int i10, int i11) {
        W0.e eVar = this.f10923a;
        if (i10 < 0 || i10 > eVar.b()) {
            StringBuilder sbW = p123m2.c.w(i10, "start (", ") offset is outside of text region ");
            sbW.append(eVar.b());
            throw new IndexOutOfBoundsException(sbW.toString());
        }
        if (i11 < 0 || i11 > eVar.b()) {
            StringBuilder sbW2 = p123m2.c.w(i11, "end (", ") offset is outside of text region ");
            sbW2.append(eVar.b());
            throw new IndexOutOfBoundsException(sbW2.toString());
        }
        if (i10 > i11) {
            throw new IllegalArgumentException(android.support.v4.media.session.p.w(i10, i11, "Do not set reversed range: ", " > "));
        }
        h(i10);
        g(i11);
    }

    public final void g(int i10) {
        if (!(i10 >= 0)) {
            p002a1.a.a("Cannot set selectionEnd to a negative value: " + i10);
        }
        this.f10925c = i10;
    }

    public final void h(int i10) {
        if (!(i10 >= 0)) {
            p002a1.a.a("Cannot set selectionStart to a negative value: " + i10);
        }
        this.f10924b = i10;
    }

    public final String toString() {
        return this.f10923a.toString();
    }
}
