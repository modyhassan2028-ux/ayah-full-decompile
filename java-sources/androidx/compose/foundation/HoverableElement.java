package androidx.compose.foundation;

import B.j;
import J0.AbstractC0274a0;
import l0.q;
import p232y.H;

/* JADX INFO: loaded from: classes.dex */
final class HoverableElement extends AbstractC0274a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f11758a;

    public HoverableElement(j jVar) {
        this.f11758a = jVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof HoverableElement) && p251z9.j.a(((HoverableElement) obj).f11758a, this.f11758a);
    }

    public final int hashCode() {
        return this.f11758a.hashCode() * 31;
    }

    @Override // J0.AbstractC0274a0
    public final q k() {
        H h7 = new H();
        h7.f24432F = this.f11758a;
        return h7;
    }

    @Override // J0.AbstractC0274a0
    public final void l(q qVar) {
        H h7 = (H) qVar;
        j jVar = h7.f24432F;
        j jVar2 = this.f11758a;
        if (p251z9.j.a(jVar, jVar2)) {
            return;
        }
        h7.x0();
        h7.f24432F = jVar2;
    }
}
