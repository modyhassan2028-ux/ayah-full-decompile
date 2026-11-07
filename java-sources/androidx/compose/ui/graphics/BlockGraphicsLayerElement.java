package androidx.compose.ui.graphics;

import J0.AbstractC0274a0;
import J0.AbstractC0283f;
import J0.j0;
import l0.q;
import p180s0.C1304m;
import p241y9.c;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
final class BlockGraphicsLayerElement extends AbstractC0274a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f11945a;

    public BlockGraphicsLayerElement(c cVar) {
        this.f11945a = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BlockGraphicsLayerElement) && j.a(this.f11945a, ((BlockGraphicsLayerElement) obj).f11945a);
    }

    public final int hashCode() {
        return this.f11945a.hashCode();
    }

    @Override // J0.AbstractC0274a0
    public final q k() {
        return new C1304m(this.f11945a);
    }

    @Override // J0.AbstractC0274a0
    public final void l(q qVar) {
        C1304m c1304m = (C1304m) qVar;
        c1304m.f21837F = this.f11945a;
        j0 j0Var = AbstractC0283f.v(c1304m, 2).f4126D;
        if (j0Var != null) {
            j0Var.a1(c1304m.f21837F, true);
        }
    }

    public final String toString() {
        return "BlockGraphicsLayerElement(block=" + this.f11945a + ')';
    }
}
