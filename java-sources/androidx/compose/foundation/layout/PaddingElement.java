package androidx.compose.foundation.layout;

import D.O;
import J0.AbstractC0274a0;
import l0.q;
import p063g1.f;

/* JADX INFO: loaded from: classes.dex */
final class PaddingElement extends AbstractC0274a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f11810a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f11811b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f11812c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f11813d;

    public PaddingElement(float f3, float f7, float f10, float f11) {
        this.f11810a = f3;
        this.f11811b = f7;
        this.f11812c = f10;
        this.f11813d = f11;
        boolean z10 = true;
        boolean z11 = (f3 >= 0.0f || Float.isNaN(f3)) & (f7 >= 0.0f || Float.isNaN(f7)) & (f10 >= 0.0f || Float.isNaN(f10));
        if (f11 < 0.0f && !Float.isNaN(f11)) {
            z10 = false;
        }
        if (!z11 || !z10) {
            E.a.a("Padding must be non-negative");
        }
    }

    public final boolean equals(Object obj) {
        PaddingElement paddingElement = obj instanceof PaddingElement ? (PaddingElement) obj : null;
        return paddingElement != null && f.a(this.f11810a, paddingElement.f11810a) && f.a(this.f11811b, paddingElement.f11811b) && f.a(this.f11812c, paddingElement.f11812c) && f.a(this.f11813d, paddingElement.f11813d);
    }

    public final int hashCode() {
        return ((Float.floatToIntBits(this.f11813d) + p123m2.c.n(p123m2.c.n(Float.floatToIntBits(this.f11810a) * 31, this.f11811b, 31), this.f11812c, 31)) * 31) + 1231;
    }

    @Override // J0.AbstractC0274a0
    public final q k() {
        O o10 = new O();
        o10.f903F = this.f11810a;
        o10.f904G = this.f11811b;
        o10.f905H = this.f11812c;
        o10.f906I = this.f11813d;
        o10.f907J = true;
        return o10;
    }

    @Override // J0.AbstractC0274a0
    public final void l(q qVar) {
        O o10 = (O) qVar;
        o10.f903F = this.f11810a;
        o10.f904G = this.f11811b;
        o10.f905H = this.f11812c;
        o10.f906I = this.f11813d;
        o10.f907J = true;
    }
}
