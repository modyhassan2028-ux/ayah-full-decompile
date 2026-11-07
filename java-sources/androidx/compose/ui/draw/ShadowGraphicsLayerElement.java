package androidx.compose.ui.draw;

import J0.AbstractC0274a0;
import J0.AbstractC0283f;
import J0.j0;
import p110k9.t;
import p123m2.c;
import p180s0.C1304m;
import p180s0.J;
import p180s0.q;
import p242z.f;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class ShadowGraphicsLayerElement extends AbstractC0274a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final J f11937a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f11938b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f11939c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f11940d;

    public ShadowGraphicsLayerElement(J j, boolean z10, long j10, long j11) {
        float f3 = f.f24730a;
        this.f11937a = j;
        this.f11938b = z10;
        this.f11939c = j10;
        this.f11940d = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShadowGraphicsLayerElement)) {
            return false;
        }
        ShadowGraphicsLayerElement shadowGraphicsLayerElement = (ShadowGraphicsLayerElement) obj;
        float f3 = f.f24733d;
        return p063g1.f.a(f3, f3) && j.a(this.f11937a, shadowGraphicsLayerElement.f11937a) && this.f11938b == shadowGraphicsLayerElement.f11938b && q.c(this.f11939c, shadowGraphicsLayerElement.f11939c) && q.c(this.f11940d, shadowGraphicsLayerElement.f11940d);
    }

    public final int hashCode() {
        int iHashCode = (((this.f11937a.hashCode() + (Float.floatToIntBits(f.f24733d) * 31)) * 31) + (this.f11938b ? 1231 : 1237)) * 31;
        int i10 = q.f21844h;
        return t.a(this.f11940d) + c.o(iHashCode, 31, this.f11939c);
    }

    @Override // J0.AbstractC0274a0
    public final l0.q k() {
        return new C1304m(new p085i0.f(5, this));
    }

    @Override // J0.AbstractC0274a0
    public final void l(l0.q qVar) {
        C1304m c1304m = (C1304m) qVar;
        c1304m.f21837F = new p085i0.f(5, this);
        j0 j0Var = AbstractC0283f.v(c1304m, 2).f4126D;
        if (j0Var != null) {
            j0Var.a1(c1304m.f21837F, true);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShadowGraphicsLayerElement(elevation=");
        sb.append((Object) p063g1.f.b(f.f24733d));
        sb.append(", shape=");
        sb.append(this.f11937a);
        sb.append(", clip=");
        sb.append(this.f11938b);
        sb.append(", ambientColor=");
        c.A(this.f11939c, ", spotColor=", sb);
        sb.append((Object) q.i(this.f11940d));
        sb.append(')');
        return sb.toString();
    }
}
