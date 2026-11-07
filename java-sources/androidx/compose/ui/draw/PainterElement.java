package androidx.compose.ui.draw;

import H0.C0211j;
import J0.AbstractC0274a0;
import J0.AbstractC0283f;
import l0.e;
import l0.q;
import p123m2.c;
import p152p0.g;
import p171r0.i;
import p180s0.C1303l;
import p215w0.b;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
final class PainterElement extends AbstractC0274a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f11933a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f11934b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f11935c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C1303l f11936d;

    public PainterElement(b bVar, e eVar, float f3, C1303l c1303l) {
        this.f11933a = bVar;
        this.f11934b = eVar;
        this.f11935c = f3;
        this.f11936d = c1303l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PainterElement)) {
            return false;
        }
        PainterElement painterElement = (PainterElement) obj;
        if (!j.a(this.f11933a, painterElement.f11933a) || !j.a(this.f11934b, painterElement.f11934b)) {
            return false;
        }
        Object obj2 = C0211j.f3203a;
        return obj2.equals(obj2) && Float.compare(this.f11935c, painterElement.f11935c) == 0 && j.a(this.f11936d, painterElement.f11936d);
    }

    public final int hashCode() {
        int iN = c.n((C0211j.f3203a.hashCode() + ((this.f11934b.hashCode() + (((this.f11933a.hashCode() * 31) + 1231) * 31)) * 31)) * 31, this.f11935c, 31);
        C1303l c1303l = this.f11936d;
        return iN + (c1303l == null ? 0 : c1303l.hashCode());
    }

    @Override // J0.AbstractC0274a0
    public final q k() {
        g gVar = new g();
        gVar.f20816F = this.f11933a;
        gVar.f20817G = true;
        gVar.f20818H = this.f11934b;
        gVar.f20819I = C0211j.f3203a;
        gVar.f20820J = this.f11935c;
        gVar.f20821K = this.f11936d;
        return gVar;
    }

    @Override // J0.AbstractC0274a0
    public final void l(q qVar) {
        g gVar = (g) qVar;
        boolean z10 = gVar.f20817G;
        b bVar = this.f11933a;
        boolean z11 = (z10 && i.a(gVar.f20816F.d(), bVar.d())) ? false : true;
        gVar.f20816F = bVar;
        gVar.f20817G = true;
        gVar.f20818H = this.f11934b;
        gVar.f20819I = C0211j.f3203a;
        gVar.f20820J = this.f11935c;
        gVar.f20821K = this.f11936d;
        if (z11) {
            AbstractC0283f.n(gVar);
        }
        AbstractC0283f.m(gVar);
    }

    public final String toString() {
        return "PainterElement(painter=" + this.f11933a + ", sizeToIntrinsics=true, alignment=" + this.f11934b + ", contentScale=" + C0211j.f3203a + ", alpha=" + this.f11935c + ", colorFilter=" + this.f11936d + ')';
    }
}
