package androidx.compose.foundation.selection;

import B.j;
import J0.AbstractC0274a0;
import J0.AbstractC0283f;
import l0.q;
import p232y.O;

/* JADX INFO: loaded from: classes.dex */
final class SelectableElement extends AbstractC0274a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f11860a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f11861b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final O f11862c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p241y9.a f11863d;

    public SelectableElement(boolean z10, j jVar, O o10, p241y9.a aVar) {
        this.f11860a = z10;
        this.f11861b = jVar;
        this.f11862c = o10;
        this.f11863d = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || SelectableElement.class != obj.getClass()) {
            return false;
        }
        SelectableElement selectableElement = (SelectableElement) obj;
        return this.f11860a == selectableElement.f11860a && p251z9.j.a(this.f11861b, selectableElement.f11861b) && p251z9.j.a(this.f11862c, selectableElement.f11862c) && this.f11863d == selectableElement.f11863d;
    }

    public final int hashCode() {
        int i10 = (this.f11860a ? 1231 : 1237) * 31;
        j jVar = this.f11861b;
        int iHashCode = (i10 + (jVar != null ? jVar.hashCode() : 0)) * 31;
        O o10 = this.f11862c;
        return this.f11863d.hashCode() + ((((iHashCode + (o10 != null ? o10.hashCode() : 0)) * 31) + 1231) * 961);
    }

    @Override // J0.AbstractC0274a0
    public final q k() {
        I.b bVar = new I.b(this.f11861b, this.f11862c, true, null, null, this.f11863d);
        bVar.f3646Y = this.f11860a;
        return bVar;
    }

    @Override // J0.AbstractC0274a0
    public final void l(q qVar) {
        I.b bVar = (I.b) qVar;
        boolean z10 = bVar.f3646Y;
        boolean z11 = this.f11860a;
        if (z10 != z11) {
            bVar.f3646Y = z11;
            AbstractC0283f.o(bVar);
        }
        bVar.F0(this.f11861b, this.f11862c, true, null, null, this.f11863d);
    }
}
