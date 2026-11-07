package D;

import I1.B0;
import Z.C0672b;
import Z.C0681f0;

/* JADX INFO: renamed from: D.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0058a implements d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f932a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f933b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0681f0 f934c = C0672b.r(A1.c.f461e);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C0681f0 f935d = C0672b.r(Boolean.TRUE);

    public C0058a(int i10, String str) {
        this.f932a = i10;
        this.f933b = str;
    }

    @Override // D.d0
    public final int a(H0.K k7) {
        return e().f463b;
    }

    @Override // D.d0
    public final int b(H0.K k7) {
        return e().f465d;
    }

    @Override // D.d0
    public final int c(H0.K k7, p063g1.m mVar) {
        return e().f464c;
    }

    @Override // D.d0
    public final int d(H0.K k7, p063g1.m mVar) {
        return e().f462a;
    }

    public final A1.c e() {
        return (A1.c) this.f934c.getValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0058a) {
            return this.f932a == ((C0058a) obj).f932a;
        }
        return false;
    }

    public final void f(B0 b5, int i10) {
        int i11 = this.f932a;
        if (i10 == 0 || (i10 & i11) != 0) {
            this.f934c.setValue(b5.f3671a.g(i11));
            this.f935d.setValue(Boolean.valueOf(b5.f3671a.q(i11)));
        }
    }

    public final int hashCode() {
        return this.f932a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f933b);
        sb.append('(');
        sb.append(e().f462a);
        sb.append(", ");
        sb.append(e().f463b);
        sb.append(", ");
        sb.append(e().f464c);
        sb.append(", ");
        return android.support.v4.media.session.p.A(sb, e().f465d, ')');
    }
}
