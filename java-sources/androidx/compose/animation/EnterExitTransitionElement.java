package androidx.compose.animation;

import J0.AbstractC0274a0;
import l0.q;
import p214w.F;
import p214w.G;
import p214w.H;
import p214w.y;
import p223x.k0;
import p223x.q0;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
final class EnterExitTransitionElement extends AbstractC0274a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q0 f11731a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k0 f11732b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k0 f11733c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final k0 f11734d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final G f11735e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final H f11736f;
    public final p241y9.a g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final y f11737h;

    public EnterExitTransitionElement(q0 q0Var, k0 k0Var, k0 k0Var2, k0 k0Var3, G g, H h7, p241y9.a aVar, y yVar) {
        this.f11731a = q0Var;
        this.f11732b = k0Var;
        this.f11733c = k0Var2;
        this.f11734d = k0Var3;
        this.f11735e = g;
        this.f11736f = h7;
        this.g = aVar;
        this.f11737h = yVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EnterExitTransitionElement)) {
            return false;
        }
        EnterExitTransitionElement enterExitTransitionElement = (EnterExitTransitionElement) obj;
        return j.a(this.f11731a, enterExitTransitionElement.f11731a) && j.a(this.f11732b, enterExitTransitionElement.f11732b) && j.a(this.f11733c, enterExitTransitionElement.f11733c) && j.a(this.f11734d, enterExitTransitionElement.f11734d) && j.a(this.f11735e, enterExitTransitionElement.f11735e) && j.a(this.f11736f, enterExitTransitionElement.f11736f) && j.a(this.g, enterExitTransitionElement.g) && j.a(this.f11737h, enterExitTransitionElement.f11737h);
    }

    public final int hashCode() {
        int iHashCode = this.f11731a.hashCode() * 31;
        k0 k0Var = this.f11732b;
        int iHashCode2 = (iHashCode + (k0Var == null ? 0 : k0Var.hashCode())) * 31;
        k0 k0Var2 = this.f11733c;
        int iHashCode3 = (iHashCode2 + (k0Var2 == null ? 0 : k0Var2.hashCode())) * 31;
        k0 k0Var3 = this.f11734d;
        return this.f11737h.hashCode() + ((this.g.hashCode() + ((this.f11736f.f23443a.hashCode() + ((this.f11735e.f23440a.hashCode() + ((iHashCode3 + (k0Var3 != null ? k0Var3.hashCode() : 0)) * 31)) * 31)) * 31)) * 31);
    }

    @Override // J0.AbstractC0274a0
    public final q k() {
        return new F(this.f11731a, this.f11732b, this.f11733c, this.f11734d, this.f11735e, this.f11736f, this.g, this.f11737h);
    }

    @Override // J0.AbstractC0274a0
    public final void l(q qVar) {
        F f3 = (F) qVar;
        f3.f23429G = this.f11731a;
        f3.f23430H = this.f11732b;
        f3.f23431I = this.f11733c;
        f3.f23432J = this.f11734d;
        f3.f23433K = this.f11735e;
        f3.f23434L = this.f11736f;
        f3.f23435M = this.g;
        f3.f23436N = this.f11737h;
    }

    public final String toString() {
        return "EnterExitTransitionElement(transition=" + this.f11731a + ", sizeAnimation=" + this.f11732b + ", offsetAnimation=" + this.f11733c + ", slideAnimation=" + this.f11734d + ", enter=" + this.f11735e + ", exit=" + this.f11736f + ", isEnabled=" + this.g + ", graphicsLayerBlock=" + this.f11737h + ')';
    }
}
