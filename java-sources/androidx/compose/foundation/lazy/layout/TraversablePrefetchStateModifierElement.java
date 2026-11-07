package androidx.compose.foundation.lazy.layout;

import G.L;
import G.h0;
import J0.AbstractC0274a0;
import l0.q;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
final class TraversablePrefetchStateModifierElement extends AbstractC0274a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final L f11845a;

    public TraversablePrefetchStateModifierElement(L l10) {
        this.f11845a = l10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TraversablePrefetchStateModifierElement) && j.a(this.f11845a, ((TraversablePrefetchStateModifierElement) obj).f11845a);
    }

    public final int hashCode() {
        return this.f11845a.hashCode();
    }

    @Override // J0.AbstractC0274a0
    public final q k() {
        h0 h0Var = new h0();
        h0Var.f2699F = this.f11845a;
        return h0Var;
    }

    @Override // J0.AbstractC0274a0
    public final void l(q qVar) {
        ((h0) qVar).f2699F = this.f11845a;
    }

    public final String toString() {
        return "TraversablePrefetchStateModifierElement(prefetchState=" + this.f11845a + ')';
    }
}
