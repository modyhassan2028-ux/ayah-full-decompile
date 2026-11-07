package androidx.compose.ui.input.pointer;

import D0.C0083a;
import J0.AbstractC0274a0;
import l0.q;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class PointerHoverIconModifierElement extends AbstractC0274a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0083a f11970a;

    public PointerHoverIconModifierElement(C0083a c0083a) {
        this.f11970a = c0083a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PointerHoverIconModifierElement) && this.f11970a.equals(((PointerHoverIconModifierElement) obj).f11970a);
    }

    public final int hashCode() {
        return (this.f11970a.f1085b * 31) + 1237;
    }

    @Override // J0.AbstractC0274a0
    public final q k() {
        return new D0.q(this.f11970a, null);
    }

    @Override // J0.AbstractC0274a0
    public final void l(q qVar) {
        D0.q qVar2 = (D0.q) qVar;
        C0083a c0083a = qVar2.f1103G;
        C0083a c0083a2 = this.f11970a;
        if (j.a(c0083a, c0083a2)) {
            return;
        }
        qVar2.f1103G = c0083a2;
        if (qVar2.f1104H) {
            qVar2.x0();
        }
    }

    public final String toString() {
        return "PointerHoverIconModifierElement(icon=" + this.f11970a + ", overrideDescendants=false)";
    }
}
