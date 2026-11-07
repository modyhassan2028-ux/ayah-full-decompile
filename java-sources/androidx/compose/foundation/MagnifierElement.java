package androidx.compose.foundation;

import A.E;
import J0.AbstractC0274a0;
import J0.AbstractC0283f;
import O.S;
import R0.v;
import android.view.View;
import l0.q;
import p232y.Q;
import p232y.a0;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class MagnifierElement extends AbstractC0274a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final E f11761a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final S f11762b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a0 f11763c;

    public MagnifierElement(E e10, S s10, a0 a0Var) {
        this.f11761a = e10;
        this.f11762b = s10;
        this.f11763c = a0Var;
    }

    public final boolean equals(Object obj) {
        return this == obj;
    }

    public final int hashCode() {
        int i10 = (int) 9205357638345293824L;
        return this.f11763c.hashCode() + ((this.f11762b.hashCode() + ((((Float.floatToIntBits(Float.NaN) + p123m2.c.n((i10 + ((((Float.floatToIntBits(Float.NaN) + (this.f11761a.hashCode() * 961)) * 31) + 1231) * 31)) * 31, Float.NaN, 31)) * 31) + 1231) * 31)) * 31);
    }

    @Override // J0.AbstractC0274a0
    public final q k() {
        return new Q(this.f11761a, this.f11762b, this.f11763c);
    }

    @Override // J0.AbstractC0274a0
    public final void l(q qVar) {
        Q q10 = (Q) qVar;
        q10.getClass();
        a0 a0Var = q10.f24444H;
        View view = q10.f24445I;
        p063g1.c cVar = q10.f24446J;
        q10.f24442F = this.f11761a;
        q10.f24443G = this.f11762b;
        a0 a0Var2 = this.f11763c;
        q10.f24444H = a0Var2;
        View viewZ = AbstractC0283f.z(q10);
        p063g1.c cVar2 = AbstractC0283f.x(q10).f3912P;
        if (q10.f24447K != null) {
            v vVar = p232y.S.f24453a;
            if (((!Float.isNaN(Float.NaN) || !Float.isNaN(Float.NaN)) && !a0Var2.a()) || !p063g1.f.a(Float.NaN, Float.NaN) || !p063g1.f.a(Float.NaN, Float.NaN) || !a0Var2.equals(a0Var) || !viewZ.equals(view) || !j.a(cVar2, cVar)) {
                q10.w0();
            }
        }
        q10.x0();
    }
}
