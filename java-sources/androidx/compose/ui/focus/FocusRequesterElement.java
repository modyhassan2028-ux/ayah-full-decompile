package androidx.compose.ui.focus;

import J0.AbstractC0274a0;
import l0.q;
import p162q0.p;
import p162q0.r;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
final class FocusRequesterElement extends AbstractC0274a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f11943a;

    public FocusRequesterElement(p pVar) {
        this.f11943a = pVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FocusRequesterElement) && j.a(this.f11943a, ((FocusRequesterElement) obj).f11943a);
    }

    public final int hashCode() {
        return this.f11943a.hashCode();
    }

    @Override // J0.AbstractC0274a0
    public final q k() {
        r rVar = new r();
        rVar.f21227F = this.f11943a;
        return rVar;
    }

    @Override // J0.AbstractC0274a0
    public final void l(q qVar) {
        r rVar = (r) qVar;
        rVar.f21227F.f21226a.k(rVar);
        p pVar = this.f11943a;
        rVar.f21227F = pVar;
        pVar.f21226a.b(rVar);
    }

    public final String toString() {
        return "FocusRequesterElement(focusRequester=" + this.f11943a + ')';
    }
}
