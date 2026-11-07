package androidx.compose.foundation.selection;

import B.j;
import I.d;
import J0.AbstractC0274a0;
import J0.AbstractC0283f;
import R0.g;
import l0.q;
import p241y9.c;

/* JADX INFO: loaded from: classes.dex */
final class ToggleableElement extends AbstractC0274a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f11864a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f11865b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f11866c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final g f11867d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c f11868e;

    public ToggleableElement(boolean z10, j jVar, boolean z11, g gVar, c cVar) {
        this.f11864a = z10;
        this.f11865b = jVar;
        this.f11866c = z11;
        this.f11867d = gVar;
        this.f11868e = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ToggleableElement.class != obj.getClass()) {
            return false;
        }
        ToggleableElement toggleableElement = (ToggleableElement) obj;
        return this.f11864a == toggleableElement.f11864a && p251z9.j.a(this.f11865b, toggleableElement.f11865b) && this.f11866c == toggleableElement.f11866c && this.f11867d.equals(toggleableElement.f11867d) && this.f11868e == toggleableElement.f11868e;
    }

    public final int hashCode() {
        int i10 = (this.f11864a ? 1231 : 1237) * 31;
        j jVar = this.f11865b;
        return this.f11868e.hashCode() + ((((((i10 + (jVar != null ? jVar.hashCode() : 0)) * 961) + (this.f11866c ? 1231 : 1237)) * 31) + this.f11867d.f7079a) * 31);
    }

    @Override // J0.AbstractC0274a0
    public final q k() {
        return new d(this.f11864a, this.f11865b, this.f11866c, this.f11867d, this.f11868e);
    }

    @Override // J0.AbstractC0274a0
    public final void l(q qVar) {
        d dVar = (d) qVar;
        boolean z10 = dVar.f3650Y;
        boolean z11 = this.f11864a;
        if (z10 != z11) {
            dVar.f3650Y = z11;
            AbstractC0283f.o(dVar);
        }
        dVar.f3651Z = this.f11868e;
        dVar.F0(this.f11865b, null, this.f11866c, null, this.f11867d, dVar.f3652a0);
    }
}
