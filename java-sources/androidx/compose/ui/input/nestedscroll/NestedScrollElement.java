package androidx.compose.ui.input.nestedscroll;

import A.C0041r0;
import C0.d;
import C0.g;
import J0.AbstractC0274a0;
import l0.q;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
final class NestedScrollElement extends AbstractC0274a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0.a f11968a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f11969b;

    public NestedScrollElement(C0.a aVar, d dVar) {
        this.f11968a = aVar;
        this.f11969b = dVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof NestedScrollElement)) {
            return false;
        }
        NestedScrollElement nestedScrollElement = (NestedScrollElement) obj;
        return j.a(nestedScrollElement.f11968a, this.f11968a) && j.a(nestedScrollElement.f11969b, this.f11969b);
    }

    public final int hashCode() {
        int iHashCode = this.f11968a.hashCode() * 31;
        d dVar = this.f11969b;
        return iHashCode + (dVar != null ? dVar.hashCode() : 0);
    }

    @Override // J0.AbstractC0274a0
    public final q k() {
        return new g(this.f11968a, this.f11969b);
    }

    @Override // J0.AbstractC0274a0
    public final void l(q qVar) {
        g gVar = (g) qVar;
        gVar.f682F = this.f11968a;
        d dVar = gVar.f683G;
        if (dVar.f667a == gVar) {
            dVar.f667a = null;
        }
        d dVar2 = this.f11969b;
        if (dVar2 == null) {
            gVar.f683G = new d();
        } else if (!dVar2.equals(dVar)) {
            gVar.f683G = dVar2;
        }
        if (gVar.f19338E) {
            d dVar3 = gVar.f683G;
            dVar3.f667a = gVar;
            dVar3.f668b = null;
            gVar.f684H = null;
            dVar3.f669c = new C0041r0(3, gVar);
            dVar3.f670d = gVar.h0();
        }
    }
}
