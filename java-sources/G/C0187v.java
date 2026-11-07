package G;

import J0.InterfaceC0293p;
import java.util.ArrayList;

/* JADX INFO: renamed from: G.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0187v extends l0.q implements InterfaceC0293p {

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public androidx.compose.foundation.lazy.layout.b f2751F;

    @Override // J0.InterfaceC0293p
    public final /* synthetic */ void Y() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0187v) && p251z9.j.a(this.f2751F, ((C0187v) obj).f2751F);
    }

    public final int hashCode() {
        return this.f2751F.hashCode();
    }

    @Override // l0.q
    public final void l0() {
        this.f2751F.j = this;
    }

    @Override // l0.q
    public final void n0() {
        androidx.compose.foundation.lazy.layout.b bVar = this.f2751F;
        bVar.d();
        bVar.f11847b = null;
        bVar.f11848c = -1;
    }

    @Override // J0.InterfaceC0293p
    public final void r(J0.K k7) {
        p196u0.b bVar = k7.f3942r;
        ArrayList arrayList = this.f2751F.f11853i;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            C0185t c0185t = (C0185t) arrayList.get(i10);
            p205v0.b bVar2 = c0185t.f2745n;
            if (bVar2 != null) {
                long j = c0185t.f2744m;
                long j10 = bVar2.f23021t;
                float f3 = ((int) (j >> 32)) - ((int) (j10 >> 32));
                float f7 = ((int) (j & 4294967295L)) - ((int) (j10 & 4294967295L));
                ((p151p.V) bVar.f22795s.f16422s).x(f3, f7);
                try {
                    p171r0.h.d(k7, bVar2);
                    ((p151p.V) bVar.f22795s.f16422s).x(-f3, -f7);
                } catch (Throwable th) {
                    ((p151p.V) bVar.f22795s.f16422s).x(-f3, -f7);
                    throw th;
                }
            }
        }
        k7.a();
    }

    public final String toString() {
        return "DisplayingDisappearingItemsNode(animator=" + this.f2751F + ')';
    }
}
