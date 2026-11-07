package androidx.compose.foundation.layout;

import D.C;
import J0.AbstractC0274a0;
import l0.h;
import l0.q;

/* JADX INFO: loaded from: classes.dex */
public final class HorizontalAlignElement extends AbstractC0274a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f11804a;

    public HorizontalAlignElement(h hVar) {
        this.f11804a = hVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        HorizontalAlignElement horizontalAlignElement = obj instanceof HorizontalAlignElement ? (HorizontalAlignElement) obj : null;
        if (horizontalAlignElement == null) {
            return false;
        }
        return this.f11804a.equals(horizontalAlignElement.f11804a);
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f11804a.f19324a);
    }

    @Override // J0.AbstractC0274a0
    public final q k() {
        C c10 = new C();
        c10.f872F = this.f11804a;
        return c10;
    }

    @Override // J0.AbstractC0274a0
    public final void l(q qVar) {
        ((C) qVar).f872F = this.f11804a;
    }
}
