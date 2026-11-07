package androidx.compose.foundation.layout;

import D.H;
import D.I;
import J0.AbstractC0274a0;
import l0.q;

/* JADX INFO: loaded from: classes.dex */
final class IntrinsicHeightElement extends AbstractC0274a0 {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof IntrinsicHeightElement ? (IntrinsicHeightElement) obj : null) != null;
    }

    public final int hashCode() {
        return (I.f890r.hashCode() * 31) + 1231;
    }

    @Override // J0.AbstractC0274a0
    public final q k() {
        H h7 = new H(0);
        h7.f888G = I.f890r;
        h7.f889H = true;
        return h7;
    }

    @Override // J0.AbstractC0274a0
    public final void l(q qVar) {
        H h7 = (H) qVar;
        h7.f888G = I.f890r;
        h7.f889H = true;
    }
}
