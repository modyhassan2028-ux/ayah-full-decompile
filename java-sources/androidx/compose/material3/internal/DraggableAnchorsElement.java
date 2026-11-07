package androidx.compose.material3.internal;

import A.EnumC0047u0;
import J0.AbstractC0274a0;
import X.s;
import X.v;
import l0.q;
import p241y9.e;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
final class DraggableAnchorsElement<T> extends AbstractC0274a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s f11925a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f11926b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final EnumC0047u0 f11927c;

    public DraggableAnchorsElement(s sVar, e eVar, EnumC0047u0 enumC0047u0) {
        this.f11925a = sVar;
        this.f11926b = eVar;
        this.f11927c = enumC0047u0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DraggableAnchorsElement)) {
            return false;
        }
        DraggableAnchorsElement draggableAnchorsElement = (DraggableAnchorsElement) obj;
        return j.a(this.f11925a, draggableAnchorsElement.f11925a) && this.f11926b == draggableAnchorsElement.f11926b && this.f11927c == draggableAnchorsElement.f11927c;
    }

    public final int hashCode() {
        return this.f11927c.hashCode() + ((this.f11926b.hashCode() + (this.f11925a.hashCode() * 31)) * 31);
    }

    @Override // J0.AbstractC0274a0
    public final q k() {
        v vVar = new v();
        vVar.f9788F = this.f11925a;
        vVar.f9789G = this.f11926b;
        vVar.f9790H = this.f11927c;
        return vVar;
    }

    @Override // J0.AbstractC0274a0
    public final void l(q qVar) {
        v vVar = (v) qVar;
        vVar.f9788F = this.f11925a;
        vVar.f9789G = this.f11926b;
        vVar.f9790H = this.f11927c;
    }
}
