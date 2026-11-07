package androidx.compose.foundation.text.input.internal;

import J0.AbstractC0274a0;
import K.W;
import M.c;
import M.l;
import O.N;
import l0.q;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
final class LegacyAdaptingPlatformTextInputModifier extends AbstractC0274a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f11881a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final W f11882b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final N f11883c;

    public LegacyAdaptingPlatformTextInputModifier(c cVar, W w9, N n6) {
        this.f11881a = cVar;
        this.f11882b = w9;
        this.f11883c = n6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LegacyAdaptingPlatformTextInputModifier)) {
            return false;
        }
        LegacyAdaptingPlatformTextInputModifier legacyAdaptingPlatformTextInputModifier = (LegacyAdaptingPlatformTextInputModifier) obj;
        return j.a(this.f11881a, legacyAdaptingPlatformTextInputModifier.f11881a) && j.a(this.f11882b, legacyAdaptingPlatformTextInputModifier.f11882b) && j.a(this.f11883c, legacyAdaptingPlatformTextInputModifier.f11883c);
    }

    public final int hashCode() {
        return this.f11883c.hashCode() + ((this.f11882b.hashCode() + (this.f11881a.hashCode() * 31)) * 31);
    }

    @Override // J0.AbstractC0274a0
    public final q k() {
        return new l(this.f11881a, this.f11882b, this.f11883c);
    }

    @Override // J0.AbstractC0274a0
    public final void l(q qVar) throws Throwable {
        l lVar = (l) qVar;
        if (lVar.f19338E) {
            lVar.f5620F.g();
            lVar.f5620F.k(lVar);
        }
        c cVar = this.f11881a;
        lVar.f5620F = cVar;
        if (lVar.f19338E) {
            if (cVar.f5592a != null) {
                C.a.c("Expected textInputModifierNode to be null");
            }
            cVar.f5592a = lVar;
        }
        lVar.f5621G = this.f11882b;
        lVar.f5622H = this.f11883c;
    }

    public final String toString() {
        return "LegacyAdaptingPlatformTextInputModifier(serviceAdapter=" + this.f11881a + ", legacyTextFieldState=" + this.f11882b + ", textFieldSelectionManager=" + this.f11883c + ')';
    }
}
