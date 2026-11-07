package androidx.compose.foundation;

import A.C0037p;
import A.EnumC0047u0;
import A.T0;
import B.j;
import J0.AbstractC0274a0;
import l0.q;
import p232y.C1452f;
import p232y.k0;

/* JADX INFO: loaded from: classes.dex */
final class ScrollingContainerElement extends AbstractC0274a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final T0 f11764a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final EnumC0047u0 f11765b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f11766c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C0037p f11767d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final j f11768e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f11769f;
    public final C1452f g;

    public ScrollingContainerElement(C0037p c0037p, EnumC0047u0 enumC0047u0, T0 t2, j jVar, C1452f c1452f, boolean z10, boolean z11) {
        this.f11764a = t2;
        this.f11765b = enumC0047u0;
        this.f11766c = z10;
        this.f11767d = c0037p;
        this.f11768e = jVar;
        this.f11769f = z11;
        this.g = c1452f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ScrollingContainerElement.class != obj.getClass()) {
            return false;
        }
        ScrollingContainerElement scrollingContainerElement = (ScrollingContainerElement) obj;
        return p251z9.j.a(this.f11764a, scrollingContainerElement.f11764a) && this.f11765b == scrollingContainerElement.f11765b && this.f11766c == scrollingContainerElement.f11766c && p251z9.j.a(this.f11767d, scrollingContainerElement.f11767d) && p251z9.j.a(this.f11768e, scrollingContainerElement.f11768e) && this.f11769f == scrollingContainerElement.f11769f && p251z9.j.a(this.g, scrollingContainerElement.g);
    }

    public final int hashCode() {
        int iHashCode = (((((this.f11765b.hashCode() + (this.f11764a.hashCode() * 31)) * 31) + (this.f11766c ? 1231 : 1237)) * 31) + 1237) * 31;
        C0037p c0037p = this.f11767d;
        int iHashCode2 = (iHashCode + (c0037p != null ? c0037p.hashCode() : 0)) * 31;
        j jVar = this.f11768e;
        int iHashCode3 = (((iHashCode2 + (jVar != null ? jVar.hashCode() : 0)) * 961) + (this.f11769f ? 1231 : 1237)) * 31;
        C1452f c1452f = this.g;
        return iHashCode3 + (c1452f != null ? c1452f.hashCode() : 0);
    }

    @Override // J0.AbstractC0274a0
    public final q k() {
        k0 k0Var = new k0();
        k0Var.f24549H = this.f11764a;
        k0Var.f24550I = this.f11765b;
        k0Var.f24551J = this.f11766c;
        k0Var.f24552K = this.f11767d;
        k0Var.f24553L = this.f11768e;
        k0Var.f24554M = this.f11769f;
        k0Var.f24555N = this.g;
        return k0Var;
    }

    @Override // J0.AbstractC0274a0
    public final void l(q qVar) {
        ((k0) qVar).A0(this.f11767d, this.f11765b, this.f11764a, this.f11768e, this.g, this.f11769f, this.f11766c);
    }
}
