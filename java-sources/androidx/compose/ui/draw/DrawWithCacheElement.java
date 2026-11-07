package androidx.compose.ui.draw;

import J0.AbstractC0274a0;
import l0.q;
import p152p0.b;
import p241y9.c;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
final class DrawWithCacheElement extends AbstractC0274a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f11931a;

    public DrawWithCacheElement(c cVar) {
        this.f11931a = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DrawWithCacheElement) && j.a(this.f11931a, ((DrawWithCacheElement) obj).f11931a);
    }

    public final int hashCode() {
        return this.f11931a.hashCode();
    }

    @Override // J0.AbstractC0274a0
    public final q k() {
        return new b(new p152p0.c(), this.f11931a);
    }

    @Override // J0.AbstractC0274a0
    public final void l(q qVar) {
        b bVar = (b) qVar;
        bVar.f20808H = this.f11931a;
        bVar.v0();
    }

    public final String toString() {
        return "DrawWithCacheElement(onBuildDrawCache=" + this.f11931a + ')';
    }
}
