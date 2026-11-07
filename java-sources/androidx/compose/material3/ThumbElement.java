package androidx.compose.material3;

import B.j;
import J0.AbstractC0274a0;
import J0.AbstractC0283f;
import W.C0550d2;
import l0.q;
import p223x.AbstractC1413d;

/* JADX INFO: loaded from: classes.dex */
final class ThumbElement extends AbstractC0274a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f11917a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f11918b;

    public ThumbElement(j jVar, boolean z10) {
        this.f11917a = jVar;
        this.f11918b = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ThumbElement)) {
            return false;
        }
        ThumbElement thumbElement = (ThumbElement) obj;
        return p251z9.j.a(this.f11917a, thumbElement.f11917a) && this.f11918b == thumbElement.f11918b;
    }

    public final int hashCode() {
        return (this.f11917a.hashCode() * 31) + (this.f11918b ? 1231 : 1237);
    }

    @Override // J0.AbstractC0274a0
    public final q k() {
        C0550d2 c0550d2 = new C0550d2();
        c0550d2.f9027F = this.f11917a;
        c0550d2.f9028G = this.f11918b;
        c0550d2.f9032K = Float.NaN;
        c0550d2.f9033L = Float.NaN;
        return c0550d2;
    }

    @Override // J0.AbstractC0274a0
    public final void l(q qVar) {
        C0550d2 c0550d2 = (C0550d2) qVar;
        c0550d2.f9027F = this.f11917a;
        boolean z10 = c0550d2.f9028G;
        boolean z11 = this.f11918b;
        if (z10 != z11) {
            AbstractC0283f.n(c0550d2);
        }
        c0550d2.f9028G = z11;
        if (c0550d2.f9031J == null && !Float.isNaN(c0550d2.f9033L)) {
            c0550d2.f9031J = AbstractC1413d.a(c0550d2.f9033L);
        }
        if (c0550d2.f9030I != null || Float.isNaN(c0550d2.f9032K)) {
            return;
        }
        c0550d2.f9030I = AbstractC1413d.a(c0550d2.f9032K);
    }

    public final String toString() {
        return "ThumbElement(interactionSource=" + this.f11917a + ", checked=" + this.f11918b + ')';
    }
}
