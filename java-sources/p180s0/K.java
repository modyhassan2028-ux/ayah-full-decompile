package p180s0;

import H0.H;
import H0.J;
import H0.U;
import J0.InterfaceC0302z;
import J0.P;
import X.L;
import l0.q;
import p085i0.f;
import p120l9.s;
import p123m2.c;
import p245z2.a;

/* JADX INFO: loaded from: classes.dex */
public final class K extends q implements InterfaceC0302z {

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public float f21802F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public float f21803G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public float f21804H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public float f21805I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public float f21806J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public float f21807K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public long f21808L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public J f21809M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public boolean f21810N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public long f21811O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public long f21812P;
    public f Q;

    @Override // J0.InterfaceC0302z
    public final /* synthetic */ int a(P p10, H h7, int i10) {
        return a.h(this, p10, h7, i10);
    }

    @Override // J0.InterfaceC0302z
    public final /* synthetic */ int c(P p10, H h7, int i10) {
        return a.e(this, p10, h7, i10);
    }

    @Override // J0.InterfaceC0302z
    public final /* synthetic */ int d(P p10, H h7, int i10) {
        return a.n(this, p10, h7, i10);
    }

    @Override // J0.InterfaceC0302z
    public final J e(H0.K k7, H h7, long j) {
        U uA = h7.a(j);
        return k7.g0(uA.f3168r, uA.f3169s, s.f19441r, new L(14, uA, this));
    }

    @Override // J0.InterfaceC0302z
    public final /* synthetic */ int f(P p10, H h7, int i10) {
        return a.k(this, p10, h7, i10);
    }

    @Override // l0.q
    public final boolean i0() {
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SimpleGraphicsLayerModifier(scaleX=");
        sb.append(this.f21802F);
        sb.append(", scaleY=");
        sb.append(this.f21803G);
        sb.append(", alpha = ");
        sb.append(this.f21804H);
        sb.append(", translationX=0.0, translationY=0.0, shadowElevation=");
        sb.append(this.f21805I);
        sb.append(", rotationX=0.0, rotationY=0.0, rotationZ=");
        sb.append(this.f21806J);
        sb.append(", cameraDistance=");
        sb.append(this.f21807K);
        sb.append(", transformOrigin=");
        sb.append((Object) M.d(this.f21808L));
        sb.append(", shape=");
        sb.append(this.f21809M);
        sb.append(", clip=");
        sb.append(this.f21810N);
        sb.append(", renderEffect=null, ambientShadowColor=");
        c.A(this.f21811O, ", spotShadowColor=", sb);
        sb.append((Object) q.i(this.f21812P));
        sb.append(", compositingStrategy=CompositingStrategy(value=0))");
        return sb.toString();
    }
}
