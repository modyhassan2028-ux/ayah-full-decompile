package androidx.compose.foundation.lazy.layout;

import A.C0009b;
import A.EnumC0047u0;
import F.C0155d;
import G.C0181o;
import J0.AbstractC0274a0;
import l0.q;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
final class LazyLayoutBeyondBoundsModifierElement extends AbstractC0274a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0155d f11837a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0009b f11838b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final EnumC0047u0 f11839c;

    public LazyLayoutBeyondBoundsModifierElement(C0155d c0155d, C0009b c0009b, EnumC0047u0 enumC0047u0) {
        this.f11837a = c0155d;
        this.f11838b = c0009b;
        this.f11839c = enumC0047u0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LazyLayoutBeyondBoundsModifierElement)) {
            return false;
        }
        LazyLayoutBeyondBoundsModifierElement lazyLayoutBeyondBoundsModifierElement = (LazyLayoutBeyondBoundsModifierElement) obj;
        return j.a(this.f11837a, lazyLayoutBeyondBoundsModifierElement.f11837a) && j.a(this.f11838b, lazyLayoutBeyondBoundsModifierElement.f11838b) && this.f11839c == lazyLayoutBeyondBoundsModifierElement.f11839c;
    }

    public final int hashCode() {
        return this.f11839c.hashCode() + ((((this.f11838b.hashCode() + (this.f11837a.hashCode() * 31)) * 31) + 1237) * 31);
    }

    @Override // J0.AbstractC0274a0
    public final q k() {
        C0181o c0181o = new C0181o();
        c0181o.f2714F = this.f11837a;
        c0181o.f2715G = this.f11838b;
        c0181o.f2716H = this.f11839c;
        return c0181o;
    }

    @Override // J0.AbstractC0274a0
    public final void l(q qVar) {
        C0181o c0181o = (C0181o) qVar;
        c0181o.f2714F = this.f11837a;
        c0181o.f2715G = this.f11838b;
        c0181o.f2716H = this.f11839c;
    }
}
