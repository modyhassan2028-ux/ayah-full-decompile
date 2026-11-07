package androidx.compose.foundation.lazy.layout;

import A.EnumC0047u0;
import F.C0154c;
import G.W;
import J0.AbstractC0274a0;
import J0.AbstractC0283f;
import l0.q;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
final class LazyLayoutSemanticsModifier extends AbstractC0274a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p241y9.a f11841a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0154c f11842b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final EnumC0047u0 f11843c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f11844d;

    public LazyLayoutSemanticsModifier(p241y9.a aVar, C0154c c0154c, EnumC0047u0 enumC0047u0, boolean z10) {
        this.f11841a = aVar;
        this.f11842b = c0154c;
        this.f11843c = enumC0047u0;
        this.f11844d = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LazyLayoutSemanticsModifier)) {
            return false;
        }
        LazyLayoutSemanticsModifier lazyLayoutSemanticsModifier = (LazyLayoutSemanticsModifier) obj;
        return this.f11841a == lazyLayoutSemanticsModifier.f11841a && j.a(this.f11842b, lazyLayoutSemanticsModifier.f11842b) && this.f11843c == lazyLayoutSemanticsModifier.f11843c && this.f11844d == lazyLayoutSemanticsModifier.f11844d;
    }

    public final int hashCode() {
        return ((((this.f11843c.hashCode() + ((this.f11842b.hashCode() + (this.f11841a.hashCode() * 31)) * 31)) * 31) + (this.f11844d ? 1231 : 1237)) * 31) + 1237;
    }

    @Override // J0.AbstractC0274a0
    public final q k() {
        return new W(this.f11841a, this.f11842b, this.f11843c, this.f11844d);
    }

    @Override // J0.AbstractC0274a0
    public final void l(q qVar) {
        W w9 = (W) qVar;
        w9.f2639F = this.f11841a;
        w9.f2640G = this.f11842b;
        EnumC0047u0 enumC0047u0 = w9.f2641H;
        EnumC0047u0 enumC0047u1 = this.f11843c;
        if (enumC0047u0 != enumC0047u1) {
            w9.f2641H = enumC0047u1;
            AbstractC0283f.o(w9);
        }
        boolean z10 = w9.f2642I;
        boolean z11 = this.f11844d;
        if (z10 == z11) {
            return;
        }
        w9.f2642I = z11;
        w9.v0();
        AbstractC0283f.o(w9);
    }
}
