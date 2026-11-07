package androidx.compose.foundation.layout;

import D.P;
import D.Q;
import J0.AbstractC0274a0;
import l0.q;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
final class PaddingValuesElement extends AbstractC0274a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final P f11814a;

    public PaddingValuesElement(P p10) {
        this.f11814a = p10;
    }

    public final boolean equals(Object obj) {
        PaddingValuesElement paddingValuesElement = obj instanceof PaddingValuesElement ? (PaddingValuesElement) obj : null;
        if (paddingValuesElement == null) {
            return false;
        }
        return j.a(this.f11814a, paddingValuesElement.f11814a);
    }

    public final int hashCode() {
        return this.f11814a.hashCode();
    }

    @Override // J0.AbstractC0274a0
    public final q k() {
        Q q10 = new Q();
        q10.f912F = this.f11814a;
        return q10;
    }

    @Override // J0.AbstractC0274a0
    public final void l(q qVar) {
        ((Q) qVar).f912F = this.f11814a;
    }
}
