package D;

import Z.C0672b;
import Z.C0681f0;

/* JADX INFO: loaded from: classes.dex */
public final class b0 implements d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f939a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0681f0 f940b;

    public b0(G g, String str) {
        this.f939a = str;
        this.f940b = C0672b.r(g);
    }

    @Override // D.d0
    public final int a(H0.K k7) {
        return e().f885b;
    }

    @Override // D.d0
    public final int b(H0.K k7) {
        return e().f887d;
    }

    @Override // D.d0
    public final int c(H0.K k7, p063g1.m mVar) {
        return e().f886c;
    }

    @Override // D.d0
    public final int d(H0.K k7, p063g1.m mVar) {
        return e().f884a;
    }

    public final G e() {
        return (G) this.f940b.getValue();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b0) {
            return p251z9.j.a(e(), ((b0) obj).e());
        }
        return false;
    }

    public final void f(G g) {
        this.f940b.setValue(g);
    }

    public final int hashCode() {
        return this.f939a.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f939a);
        sb.append("(left=");
        sb.append(e().f884a);
        sb.append(", top=");
        sb.append(e().f885b);
        sb.append(", right=");
        sb.append(e().f886c);
        sb.append(", bottom=");
        return android.support.v4.media.session.p.A(sb, e().f887d, ')');
    }
}
