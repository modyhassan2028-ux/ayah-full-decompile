package androidx.compose.ui.layout;

import H0.C0222v;
import J0.AbstractC0274a0;
import l0.q;
import p241y9.f;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
final class LayoutElement extends AbstractC0274a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f11975a;

    public LayoutElement(f fVar) {
        this.f11975a = fVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LayoutElement) && j.a(this.f11975a, ((LayoutElement) obj).f11975a);
    }

    public final int hashCode() {
        return this.f11975a.hashCode();
    }

    @Override // J0.AbstractC0274a0
    public final q k() {
        C0222v c0222v = new C0222v();
        c0222v.f3222F = this.f11975a;
        return c0222v;
    }

    @Override // J0.AbstractC0274a0
    public final void l(q qVar) {
        ((C0222v) qVar).f3222F = this.f11975a;
    }

    public final String toString() {
        return "LayoutElement(measure=" + this.f11975a + ')';
    }
}
