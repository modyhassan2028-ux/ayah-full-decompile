package androidx.compose.foundation;

import J0.AbstractC0274a0;
import l0.q;
import p232y.g0;
import p232y.j0;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class ScrollingLayoutElement extends AbstractC0274a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j0 f11770a;

    public ScrollingLayoutElement(j0 j0Var) {
        this.f11770a = j0Var;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ScrollingLayoutElement) {
            return j.a(this.f11770a, ((ScrollingLayoutElement) obj).f11770a);
        }
        return false;
    }

    public final int hashCode() {
        return (((this.f11770a.hashCode() * 31) + 1237) * 31) + 1231;
    }

    @Override // J0.AbstractC0274a0
    public final q k() {
        g0 g0Var = new g0();
        g0Var.f24517F = this.f11770a;
        g0Var.f24518G = true;
        return g0Var;
    }

    @Override // J0.AbstractC0274a0
    public final void l(q qVar) {
        g0 g0Var = (g0) qVar;
        g0Var.f24517F = this.f11770a;
        g0Var.f24518G = true;
    }
}
