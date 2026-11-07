package androidx.compose.ui.layout;

import H0.P;
import J0.AbstractC0274a0;
import l0.q;
import p241y9.c;

/* JADX INFO: loaded from: classes.dex */
final class OnSizeChangedModifier extends AbstractC0274a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f11978a;

    public OnSizeChangedModifier(c cVar) {
        this.f11978a = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OnSizeChangedModifier) {
            return this.f11978a == ((OnSizeChangedModifier) obj).f11978a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f11978a.hashCode();
    }

    @Override // J0.AbstractC0274a0
    public final q k() {
        P p10 = new P();
        p10.f3164F = this.f11978a;
        long j = Integer.MIN_VALUE;
        p10.f3165G = (j & 4294967295L) | (j << 32);
        return p10;
    }

    @Override // J0.AbstractC0274a0
    public final void l(q qVar) {
        P p10 = (P) qVar;
        p10.f3164F = this.f11978a;
        long j = Integer.MIN_VALUE;
        p10.f3165G = (j & 4294967295L) | (j << 32);
    }
}
