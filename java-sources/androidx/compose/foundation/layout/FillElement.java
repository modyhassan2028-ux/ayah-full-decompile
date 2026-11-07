package androidx.compose.foundation.layout;

import D.A;
import D.EnumC0080x;
import J0.AbstractC0274a0;
import l0.q;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes.dex */
public final class FillElement extends AbstractC0274a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EnumC0080x f11802a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f11803b;

    public FillElement(EnumC0080x enumC0080x, float f3) {
        this.f11802a = enumC0080x;
        this.f11803b = f3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FillElement)) {
            return false;
        }
        FillElement fillElement = (FillElement) obj;
        return this.f11802a == fillElement.f11802a && this.f11803b == fillElement.f11803b;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f11803b) + (this.f11802a.hashCode() * 31);
    }

    @Override // J0.AbstractC0274a0
    public final q k() {
        A a9 = new A();
        a9.f870F = this.f11802a;
        a9.f871G = this.f11803b;
        return a9;
    }

    @Override // J0.AbstractC0274a0
    public final void l(q qVar) {
        A a9 = (A) qVar;
        a9.f870F = this.f11802a;
        a9.f871G = this.f11803b;
    }
}
