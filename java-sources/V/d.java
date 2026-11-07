package V;

import A.C0039q;
import F9.n;
import Z.C0672b;
import Z.C0690k;
import Z.C0698o;
import Z.X;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import p180s0.q;
import p232y.J;
import p232y.K;

/* JADX INFO: loaded from: classes.dex */
public final class d implements J {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f8344a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f8345b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final X f8346c;

    public d(boolean z10, float f3, X x9) {
        this.f8344a = z10;
        this.f8345b = f3;
        this.f8346c = x9;
    }

    @Override // p232y.J
    public final K a(B.j jVar, C0698o c0698o) {
        long jB;
        c0698o.T(988743187);
        i iVar = (i) c0698o.k(k.f8354a);
        X x9 = this.f8346c;
        if (((q) x9.getValue()).f21845a != 16) {
            c0698o.T(-303557454);
            c0698o.p(false);
            jB = ((q) x9.getValue()).f21845a;
        } else {
            c0698o.T(-303499670);
            jB = iVar.b(c0698o);
            c0698o.p(false);
        }
        X xU = C0672b.u(new q(jB), c0698o);
        X xU2 = C0672b.u(iVar.a(c0698o), c0698o);
        c0698o.T(331259447);
        ViewGroup viewGroupD = n.d((View) c0698o.k(AndroidCompositionLocals_androidKt.f12067f));
        boolean zG = c0698o.g(jVar) | c0698o.g(this) | c0698o.g(viewGroupD);
        Object objH = c0698o.H();
        Object obj = C0690k.f10683a;
        if (zG || objH == obj) {
            Object aVar = new a(this.f8344a, this.f8345b, xU, xU2, viewGroupD);
            c0698o.e0(aVar);
            objH = aVar;
        }
        a aVar2 = (a) objH;
        c0698o.p(false);
        boolean zG2 = c0698o.g(jVar) | c0698o.i(aVar2);
        Object objH2 = c0698o.H();
        if (zG2 || objH2 == obj) {
            objH2 = new C0039q(jVar, aVar2, (p150o9.c) null, 26);
            c0698o.e0(objH2);
        }
        C0672b.g(aVar2, jVar, (p241y9.e) objH2, c0698o);
        c0698o.p(false);
        return aVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f8344a == dVar.f8344a && p063g1.f.a(this.f8345b, dVar.f8345b) && this.f8346c.equals(dVar.f8346c);
    }

    public final int hashCode() {
        return this.f8346c.hashCode() + p123m2.c.n((this.f8344a ? 1231 : 1237) * 31, this.f8345b, 31);
    }
}
