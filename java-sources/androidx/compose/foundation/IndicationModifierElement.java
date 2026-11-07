package androidx.compose.foundation;

import B.j;
import J0.AbstractC0274a0;
import J0.InterfaceC0290m;
import l0.q;
import p232y.N;
import p232y.O;

/* JADX INFO: loaded from: classes.dex */
final class IndicationModifierElement extends AbstractC0274a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f11759a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final O f11760b;

    public IndicationModifierElement(j jVar, O o10) {
        this.f11759a = jVar;
        this.f11760b = o10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IndicationModifierElement)) {
            return false;
        }
        IndicationModifierElement indicationModifierElement = (IndicationModifierElement) obj;
        return p251z9.j.a(this.f11759a, indicationModifierElement.f11759a) && p251z9.j.a(this.f11760b, indicationModifierElement.f11760b);
    }

    public final int hashCode() {
        return this.f11760b.hashCode() + (this.f11759a.hashCode() * 31);
    }

    @Override // J0.AbstractC0274a0
    public final q k() {
        InterfaceC0290m interfaceC0290mB = this.f11760b.b(this.f11759a);
        N n6 = new N();
        n6.f24439H = interfaceC0290mB;
        n6.v0(interfaceC0290mB);
        return n6;
    }

    @Override // J0.AbstractC0274a0
    public final void l(q qVar) {
        N n6 = (N) qVar;
        InterfaceC0290m interfaceC0290mB = this.f11760b.b(this.f11759a);
        n6.w0(n6.f24439H);
        n6.f24439H = interfaceC0290mB;
        n6.v0(interfaceC0290mB);
    }
}
