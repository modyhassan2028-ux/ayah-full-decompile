package androidx.compose.foundation.layout;

import D.N;
import J0.AbstractC0274a0;
import J0.AbstractC0283f;
import l0.q;
import p063g1.f;

/* JADX INFO: loaded from: classes.dex */
final class OffsetElement extends AbstractC0274a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f11808a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f11809b;

    public OffsetElement(float f3, float f7) {
        this.f11808a = f3;
        this.f11809b = f7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        OffsetElement offsetElement = obj instanceof OffsetElement ? (OffsetElement) obj : null;
        return offsetElement != null && f.a(this.f11808a, offsetElement.f11808a) && f.a(this.f11809b, offsetElement.f11809b);
    }

    public final int hashCode() {
        return ((Float.floatToIntBits(this.f11809b) + (Float.floatToIntBits(this.f11808a) * 31)) * 31) + 1231;
    }

    @Override // J0.AbstractC0274a0
    public final q k() {
        N n6 = new N();
        n6.f900F = this.f11808a;
        n6.f901G = this.f11809b;
        n6.f902H = true;
        return n6;
    }

    @Override // J0.AbstractC0274a0
    public final void l(q qVar) {
        N n6 = (N) qVar;
        float f3 = n6.f900F;
        float f7 = this.f11808a;
        boolean zA = f.a(f3, f7);
        float f10 = this.f11809b;
        if (!zA || !f.a(n6.f901G, f10) || !n6.f902H) {
            AbstractC0283f.x(n6).V(false);
        }
        n6.f900F = f7;
        n6.f901G = f10;
        n6.f902H = true;
    }

    public final String toString() {
        return "OffsetModifierElement(x=" + ((Object) f.b(this.f11808a)) + ", y=" + ((Object) f.b(this.f11809b)) + ", rtlAware=true)";
    }
}
