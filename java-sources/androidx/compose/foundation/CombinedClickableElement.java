package androidx.compose.foundation;

import B.j;
import J0.AbstractC0274a0;
import J0.AbstractC0283f;
import l0.q;
import p232y.C1466u;
import p232y.O;

/* JADX INFO: loaded from: classes.dex */
final class CombinedClickableElement extends AbstractC0274a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f11753a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final O f11754b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p241y9.a f11755c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p241y9.a f11756d;

    public CombinedClickableElement(j jVar, O o10, p241y9.a aVar, p241y9.a aVar2) {
        this.f11753a = jVar;
        this.f11754b = o10;
        this.f11755c = aVar;
        this.f11756d = aVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || CombinedClickableElement.class != obj.getClass()) {
            return false;
        }
        CombinedClickableElement combinedClickableElement = (CombinedClickableElement) obj;
        return p251z9.j.a(this.f11753a, combinedClickableElement.f11753a) && p251z9.j.a(this.f11754b, combinedClickableElement.f11754b) && this.f11755c == combinedClickableElement.f11755c && this.f11756d == combinedClickableElement.f11756d;
    }

    public final int hashCode() {
        j jVar = this.f11753a;
        int iHashCode = (jVar != null ? jVar.hashCode() : 0) * 31;
        O o10 = this.f11754b;
        int iHashCode2 = (this.f11755c.hashCode() + ((((iHashCode + (o10 != null ? o10.hashCode() : 0)) * 31) + 1231) * 29791)) * 961;
        p241y9.a aVar = this.f11756d;
        return ((iHashCode2 + (aVar != null ? aVar.hashCode() : 0)) * 961) + 1231;
    }

    @Override // J0.AbstractC0274a0
    public final q k() {
        return new C1466u(this.f11753a, this.f11754b, this.f11755c, this.f11756d);
    }

    @Override // J0.AbstractC0274a0
    public final void l(q qVar) {
        D0.O o10;
        C1466u c1466u = (C1466u) qVar;
        c1466u.f24587Z = true;
        boolean z10 = false;
        boolean z11 = c1466u.f24586Y == null;
        p241y9.a aVar = this.f11756d;
        if (z11 != (aVar == null)) {
            c1466u.A0();
            AbstractC0283f.o(c1466u);
            z10 = true;
        }
        c1466u.f24586Y = aVar;
        boolean z12 = c1466u.f24488L ? z10 : true;
        c1466u.F0(this.f11753a, this.f11754b, true, null, null, this.f11755c);
        if (!z12 || (o10 = c1466u.f24491O) == null) {
            return;
        }
        o10.x0();
    }
}
