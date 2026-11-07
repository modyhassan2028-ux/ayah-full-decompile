package androidx.compose.ui.layout;

import H0.O;
import J0.AbstractC0274a0;
import l0.q;
import p241y9.c;

/* JADX INFO: loaded from: classes.dex */
final class OnGloballyPositionedElement extends AbstractC0274a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f11977a;

    public OnGloballyPositionedElement(c cVar) {
        this.f11977a = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OnGloballyPositionedElement) {
            return this.f11977a == ((OnGloballyPositionedElement) obj).f11977a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f11977a.hashCode();
    }

    @Override // J0.AbstractC0274a0
    public final q k() {
        O o10 = new O();
        o10.f3163F = this.f11977a;
        return o10;
    }

    @Override // J0.AbstractC0274a0
    public final void l(q qVar) {
        ((O) qVar).f3163F = this.f11977a;
    }
}
