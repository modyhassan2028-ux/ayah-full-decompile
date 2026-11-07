package androidx.compose.ui.graphics;

import J0.AbstractC0274a0;
import J0.AbstractC0283f;
import J0.j0;
import p085i0.f;
import p123m2.c;
import p180s0.J;
import p180s0.K;
import p180s0.M;
import p180s0.q;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
final class GraphicsLayerElement extends AbstractC0274a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f11946a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f11947b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f11948c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f11949d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f11950e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f11951f;
    public final J g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f11952h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f11953i;
    public final long j;

    public GraphicsLayerElement(float f3, float f7, float f10, float f11, float f12, long j, J j10, boolean z10, long j11, long j12) {
        this.f11946a = f3;
        this.f11947b = f7;
        this.f11948c = f10;
        this.f11949d = f11;
        this.f11950e = f12;
        this.f11951f = j;
        this.g = j10;
        this.f11952h = z10;
        this.f11953i = j11;
        this.j = j12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GraphicsLayerElement)) {
            return false;
        }
        GraphicsLayerElement graphicsLayerElement = (GraphicsLayerElement) obj;
        return Float.compare(this.f11946a, graphicsLayerElement.f11946a) == 0 && Float.compare(this.f11947b, graphicsLayerElement.f11947b) == 0 && Float.compare(this.f11948c, graphicsLayerElement.f11948c) == 0 && Float.compare(0.0f, 0.0f) == 0 && Float.compare(0.0f, 0.0f) == 0 && Float.compare(this.f11949d, graphicsLayerElement.f11949d) == 0 && Float.compare(0.0f, 0.0f) == 0 && Float.compare(0.0f, 0.0f) == 0 && Float.compare(this.f11950e, graphicsLayerElement.f11950e) == 0 && Float.compare(8.0f, 8.0f) == 0 && M.a(this.f11951f, graphicsLayerElement.f11951f) && j.a(this.g, graphicsLayerElement.g) && this.f11952h == graphicsLayerElement.f11952h && q.c(this.f11953i, graphicsLayerElement.f11953i) && q.c(this.j, graphicsLayerElement.j);
    }

    public final int hashCode() {
        int iN = c.n(c.n(c.n(c.n(c.n(c.n(c.n(c.n(c.n(Float.floatToIntBits(this.f11946a) * 31, this.f11947b, 31), this.f11948c, 31), 0.0f, 31), 0.0f, 31), this.f11949d, 31), 0.0f, 31), 0.0f, 31), this.f11950e, 31), 8.0f, 31);
        int i10 = M.f21815c;
        long j = this.f11951f;
        int iHashCode = (((this.g.hashCode() + ((((int) (j ^ (j >>> 32))) + iN) * 31)) * 31) + (this.f11952h ? 1231 : 1237)) * 961;
        int i11 = q.f21844h;
        return c.o(c.o(iHashCode, 31, this.f11953i), 31, this.j);
    }

    @Override // J0.AbstractC0274a0
    public final l0.q k() {
        K k7 = new K();
        k7.f21802F = this.f11946a;
        k7.f21803G = this.f11947b;
        k7.f21804H = this.f11948c;
        k7.f21805I = this.f11949d;
        k7.f21806J = this.f11950e;
        k7.f21807K = 8.0f;
        k7.f21808L = this.f11951f;
        k7.f21809M = this.g;
        k7.f21810N = this.f11952h;
        k7.f21811O = this.f11953i;
        k7.f21812P = this.j;
        k7.Q = new f(6, k7);
        return k7;
    }

    @Override // J0.AbstractC0274a0
    public final void l(l0.q qVar) {
        K k7 = (K) qVar;
        k7.f21802F = this.f11946a;
        k7.f21803G = this.f11947b;
        k7.f21804H = this.f11948c;
        k7.f21805I = this.f11949d;
        k7.f21806J = this.f11950e;
        k7.f21807K = 8.0f;
        k7.f21808L = this.f11951f;
        k7.f21809M = this.g;
        k7.f21810N = this.f11952h;
        k7.f21811O = this.f11953i;
        k7.f21812P = this.j;
        j0 j0Var = AbstractC0283f.v(k7, 2).f4126D;
        if (j0Var != null) {
            j0Var.a1(k7.Q, true);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GraphicsLayerElement(scaleX=");
        sb.append(this.f11946a);
        sb.append(", scaleY=");
        sb.append(this.f11947b);
        sb.append(", alpha=");
        sb.append(this.f11948c);
        sb.append(", translationX=0.0, translationY=0.0, shadowElevation=");
        sb.append(this.f11949d);
        sb.append(", rotationX=0.0, rotationY=0.0, rotationZ=");
        sb.append(this.f11950e);
        sb.append(", cameraDistance=8.0, transformOrigin=");
        sb.append((Object) M.d(this.f11951f));
        sb.append(", shape=");
        sb.append(this.g);
        sb.append(", clip=");
        sb.append(this.f11952h);
        sb.append(", renderEffect=null, ambientShadowColor=");
        c.A(this.f11953i, ", spotShadowColor=", sb);
        sb.append((Object) q.i(this.j));
        sb.append(", compositingStrategy=CompositingStrategy(value=0))");
        return sb.toString();
    }
}
