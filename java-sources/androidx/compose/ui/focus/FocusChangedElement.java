package androidx.compose.ui.focus;

import J0.AbstractC0274a0;
import l0.q;
import p241y9.c;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
final class FocusChangedElement extends AbstractC0274a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f11941a;

    public FocusChangedElement(c cVar) {
        this.f11941a = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FocusChangedElement) && j.a(this.f11941a, ((FocusChangedElement) obj).f11941a);
    }

    public final int hashCode() {
        return this.f11941a.hashCode();
    }

    @Override // J0.AbstractC0274a0
    public final q k() {
        p162q0.c cVar = new p162q0.c();
        cVar.f21189F = this.f11941a;
        return cVar;
    }

    @Override // J0.AbstractC0274a0
    public final void l(q qVar) {
        ((p162q0.c) qVar).f21189F = this.f11941a;
    }

    public final String toString() {
        return "FocusChangedElement(onFocusChanged=" + this.f11941a + ')';
    }
}
