package androidx.compose.foundation.text.handwriting;

import J0.AbstractC0274a0;
import L.b;
import l0.q;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
final class StylusHandwritingElement extends AbstractC0274a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p241y9.a f11872a;

    public StylusHandwritingElement(p241y9.a aVar) {
        this.f11872a = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof StylusHandwritingElement) && j.a(this.f11872a, ((StylusHandwritingElement) obj).f11872a);
    }

    public final int hashCode() {
        return this.f11872a.hashCode();
    }

    @Override // J0.AbstractC0274a0
    public final q k() {
        return new b(this.f11872a);
    }

    @Override // J0.AbstractC0274a0
    public final void l(q qVar) {
        ((b) qVar).f5426H = this.f11872a;
    }

    public final String toString() {
        return "StylusHandwritingElement(onHandwritingSlopExceeded=" + this.f11872a + ')';
    }
}
