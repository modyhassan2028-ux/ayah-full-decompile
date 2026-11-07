package androidx.compose.ui.draw;

import J0.AbstractC0274a0;
import l0.q;
import p152p0.d;
import p241y9.c;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
final class DrawBehindElement extends AbstractC0274a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f11930a;

    public DrawBehindElement(c cVar) {
        this.f11930a = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DrawBehindElement) && j.a(this.f11930a, ((DrawBehindElement) obj).f11930a);
    }

    public final int hashCode() {
        return this.f11930a.hashCode();
    }

    @Override // J0.AbstractC0274a0
    public final q k() {
        d dVar = new d();
        dVar.f20811F = this.f11930a;
        return dVar;
    }

    @Override // J0.AbstractC0274a0
    public final void l(q qVar) {
        ((d) qVar).f20811F = this.f11930a;
    }

    public final String toString() {
        return "DrawBehindElement(onDraw=" + this.f11930a + ')';
    }
}
