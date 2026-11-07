package androidx.compose.ui.draw;

import J0.AbstractC0274a0;
import l0.q;
import p152p0.e;
import p241y9.c;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
final class DrawWithContentElement extends AbstractC0274a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f11932a;

    public DrawWithContentElement(c cVar) {
        this.f11932a = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DrawWithContentElement) && j.a(this.f11932a, ((DrawWithContentElement) obj).f11932a);
    }

    public final int hashCode() {
        return this.f11932a.hashCode();
    }

    @Override // J0.AbstractC0274a0
    public final q k() {
        e eVar = new e();
        eVar.f20812F = this.f11932a;
        return eVar;
    }

    @Override // J0.AbstractC0274a0
    public final void l(q qVar) {
        ((e) qVar).f20812F = this.f11932a;
    }

    public final String toString() {
        return "DrawWithContentElement(onDraw=" + this.f11932a + ')';
    }
}
