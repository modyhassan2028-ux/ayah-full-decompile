package androidx.compose.foundation.layout;

import D.I;
import D.K;
import J0.AbstractC0274a0;
import l0.q;

/* JADX INFO: loaded from: classes.dex */
final class IntrinsicWidthElement extends AbstractC0274a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final I f11805a;

    public IntrinsicWidthElement(I i10) {
        this.f11805a = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        IntrinsicWidthElement intrinsicWidthElement = obj instanceof IntrinsicWidthElement ? (IntrinsicWidthElement) obj : null;
        return intrinsicWidthElement != null && this.f11805a == intrinsicWidthElement.f11805a;
    }

    public final int hashCode() {
        return (this.f11805a.hashCode() * 31) + 1231;
    }

    @Override // J0.AbstractC0274a0
    public final q k() {
        K k7 = new K(0);
        k7.f894G = this.f11805a;
        k7.f895H = true;
        return k7;
    }

    @Override // J0.AbstractC0274a0
    public final void l(q qVar) {
        K k7 = (K) qVar;
        k7.f894G = this.f11805a;
        k7.f895H = true;
    }
}
