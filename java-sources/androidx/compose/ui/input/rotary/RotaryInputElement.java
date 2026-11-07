package androidx.compose.ui.input.rotary;

import J0.AbstractC0274a0;
import K0.C0360o;
import l0.q;

/* JADX INFO: loaded from: classes.dex */
final class RotaryInputElement extends AbstractC0274a0 {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RotaryInputElement)) {
            return false;
        }
        Object obj2 = C0360o.f5137u;
        return obj2.equals(obj2);
    }

    public final int hashCode() {
        return C0360o.f5137u.hashCode() * 31;
    }

    @Override // J0.AbstractC0274a0
    public final q k() {
        C0360o c0360o = C0360o.f5137u;
        F0.a aVar = new F0.a();
        aVar.f2148F = c0360o;
        return aVar;
    }

    @Override // J0.AbstractC0274a0
    public final void l(q qVar) {
        ((F0.a) qVar).f2148F = C0360o.f5137u;
    }

    public final String toString() {
        return "RotaryInputElement(onRotaryScrollEvent=" + C0360o.f5137u + ", onPreRotaryScrollEvent=null)";
    }
}
