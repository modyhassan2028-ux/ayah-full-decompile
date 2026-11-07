package androidx.compose.ui;

import J0.AbstractC0274a0;
import l0.q;
import l0.u;
import p123m2.c;

/* JADX INFO: loaded from: classes.dex */
public final class ZIndexElement extends AbstractC0274a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f11928a;

    public ZIndexElement(float f3) {
        this.f11928a = f3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ZIndexElement) && Float.compare(this.f11928a, ((ZIndexElement) obj).f11928a) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f11928a);
    }

    @Override // J0.AbstractC0274a0
    public final q k() {
        u uVar = new u();
        uVar.f19350F = this.f11928a;
        return uVar;
    }

    @Override // J0.AbstractC0274a0
    public final void l(q qVar) {
        ((u) qVar).f19350F = this.f11928a;
    }

    public final String toString() {
        return c.v(new StringBuilder("ZIndexElement(zIndex="), this.f11928a, ')');
    }
}
