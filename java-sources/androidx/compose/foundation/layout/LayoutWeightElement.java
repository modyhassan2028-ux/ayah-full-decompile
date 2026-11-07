package androidx.compose.foundation.layout;

import D.L;
import J0.AbstractC0274a0;
import l0.q;

/* JADX INFO: loaded from: classes.dex */
public final class LayoutWeightElement extends AbstractC0274a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f11806a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f11807b;

    public LayoutWeightElement(float f3, boolean z10) {
        this.f11806a = f3;
        this.f11807b = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        LayoutWeightElement layoutWeightElement = obj instanceof LayoutWeightElement ? (LayoutWeightElement) obj : null;
        return layoutWeightElement != null && this.f11806a == layoutWeightElement.f11806a && this.f11807b == layoutWeightElement.f11807b;
    }

    public final int hashCode() {
        return (Float.floatToIntBits(this.f11806a) * 31) + (this.f11807b ? 1231 : 1237);
    }

    @Override // J0.AbstractC0274a0
    public final q k() {
        L l10 = new L();
        l10.f896F = this.f11806a;
        l10.f897G = this.f11807b;
        return l10;
    }

    @Override // J0.AbstractC0274a0
    public final void l(q qVar) {
        L l10 = (L) qVar;
        l10.f896F = this.f11806a;
        l10.f897G = this.f11807b;
    }
}
