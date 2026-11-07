package androidx.compose.foundation;

import J0.AbstractC0274a0;
import l0.q;
import p180s0.J;
import p180s0.L;
import p232y.C1459m;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class BorderModifierNodeElement extends AbstractC0274a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f11744a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final L f11745b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final J f11746c;

    public BorderModifierNodeElement(float f3, L l10, J j) {
        this.f11744a = f3;
        this.f11745b = l10;
        this.f11746c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BorderModifierNodeElement)) {
            return false;
        }
        BorderModifierNodeElement borderModifierNodeElement = (BorderModifierNodeElement) obj;
        return p063g1.f.a(this.f11744a, borderModifierNodeElement.f11744a) && this.f11745b.equals(borderModifierNodeElement.f11745b) && j.a(this.f11746c, borderModifierNodeElement.f11746c);
    }

    public final int hashCode() {
        return this.f11746c.hashCode() + ((this.f11745b.hashCode() + (Float.floatToIntBits(this.f11744a) * 31)) * 31);
    }

    @Override // J0.AbstractC0274a0
    public final q k() {
        return new C1459m(this.f11744a, this.f11745b, this.f11746c);
    }

    @Override // J0.AbstractC0274a0
    public final void l(q qVar) {
        C1459m c1459m = (C1459m) qVar;
        float f3 = c1459m.f24570I;
        p152p0.b bVar = c1459m.f24573L;
        float f7 = this.f11744a;
        if (!p063g1.f.a(f3, f7)) {
            c1459m.f24570I = f7;
            bVar.v0();
        }
        L l10 = c1459m.f24571J;
        L l11 = this.f11745b;
        if (!j.a(l10, l11)) {
            c1459m.f24571J = l11;
            bVar.v0();
        }
        J j = c1459m.f24572K;
        J j10 = this.f11746c;
        if (j.a(j, j10)) {
            return;
        }
        c1459m.f24572K = j10;
        bVar.v0();
    }

    public final String toString() {
        return "BorderModifierNodeElement(width=" + ((Object) p063g1.f.b(this.f11744a)) + ", brush=" + this.f11745b + ", shape=" + this.f11746c + ')';
    }
}
