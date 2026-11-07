package androidx.compose.ui.layout;

import H0.C0220t;
import J0.AbstractC0274a0;
import l0.q;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
final class LayoutIdElement extends AbstractC0274a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f11976a;

    public LayoutIdElement(Object obj) {
        this.f11976a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LayoutIdElement) && j.a(this.f11976a, ((LayoutIdElement) obj).f11976a);
    }

    public final int hashCode() {
        return this.f11976a.hashCode();
    }

    @Override // J0.AbstractC0274a0
    public final q k() {
        C0220t c0220t = new C0220t();
        c0220t.f3221F = this.f11976a;
        return c0220t;
    }

    @Override // J0.AbstractC0274a0
    public final void l(q qVar) {
        ((C0220t) qVar).f3221F = this.f11976a;
    }

    public final String toString() {
        return "LayoutIdElement(layoutId=" + this.f11976a + ')';
    }
}
