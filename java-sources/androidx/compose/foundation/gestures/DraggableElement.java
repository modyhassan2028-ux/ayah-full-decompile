package androidx.compose.foundation.gestures;

import A.C0017f;
import A.EnumC0047u0;
import A.U;
import A.X;
import A.Y;
import B.j;
import J0.AbstractC0274a0;
import l0.q;
import p241y9.f;

/* JADX INFO: loaded from: classes.dex */
public final class DraggableElement extends AbstractC0274a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Y f11785a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final EnumC0047u0 f11786b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f11787c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final j f11788d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f11789e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final f f11790f;
    public final f g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f11791h;

    public DraggableElement(Y y10, EnumC0047u0 enumC0047u0, boolean z10, j jVar, boolean z11, U u8, f fVar, boolean z12) {
        this.f11785a = y10;
        this.f11786b = enumC0047u0;
        this.f11787c = z10;
        this.f11788d = jVar;
        this.f11789e = z11;
        this.f11790f = u8;
        this.g = fVar;
        this.f11791h = z12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || DraggableElement.class != obj.getClass()) {
            return false;
        }
        DraggableElement draggableElement = (DraggableElement) obj;
        return p251z9.j.a(this.f11785a, draggableElement.f11785a) && this.f11786b == draggableElement.f11786b && this.f11787c == draggableElement.f11787c && p251z9.j.a(this.f11788d, draggableElement.f11788d) && this.f11789e == draggableElement.f11789e && p251z9.j.a(this.f11790f, draggableElement.f11790f) && p251z9.j.a(this.g, draggableElement.g) && this.f11791h == draggableElement.f11791h;
    }

    public final int hashCode() {
        int iHashCode = (((this.f11786b.hashCode() + (this.f11785a.hashCode() * 31)) * 31) + (this.f11787c ? 1231 : 1237)) * 31;
        j jVar = this.f11788d;
        return ((this.g.hashCode() + ((this.f11790f.hashCode() + ((((iHashCode + (jVar != null ? jVar.hashCode() : 0)) * 31) + (this.f11789e ? 1231 : 1237)) * 31)) * 31)) * 31) + (this.f11791h ? 1231 : 1237);
    }

    @Override // J0.AbstractC0274a0
    public final q k() {
        C0017f c0017f = C0017f.f233u;
        boolean z10 = this.f11787c;
        j jVar = this.f11788d;
        EnumC0047u0 enumC0047u0 = this.f11786b;
        X x9 = new X(c0017f, z10, jVar, enumC0047u0);
        x9.f165P = this.f11785a;
        x9.Q = enumC0047u0;
        x9.R = this.f11789e;
        x9.S = this.f11790f;
        x9.T = this.g;
        x9.U = this.f11791h;
        return x9;
    }

    @Override // J0.AbstractC0274a0
    public final void l(q qVar) {
        boolean z10;
        boolean z11;
        X x9 = (X) qVar;
        C0017f c0017f = C0017f.f233u;
        Y y10 = x9.f165P;
        Y y11 = this.f11785a;
        if (p251z9.j.a(y10, y11)) {
            z10 = false;
        } else {
            x9.f165P = y11;
            z10 = true;
        }
        EnumC0047u0 enumC0047u0 = x9.Q;
        EnumC0047u0 enumC0047u1 = this.f11786b;
        if (enumC0047u0 != enumC0047u1) {
            x9.Q = enumC0047u1;
            z10 = true;
        }
        boolean z12 = x9.U;
        boolean z13 = this.f11791h;
        if (z12 != z13) {
            x9.U = z13;
            z11 = true;
        } else {
            z11 = z10;
        }
        x9.S = this.f11790f;
        x9.T = this.g;
        x9.R = this.f11789e;
        x9.G0(c0017f, this.f11787c, this.f11788d, enumC0047u1, z11);
    }
}
