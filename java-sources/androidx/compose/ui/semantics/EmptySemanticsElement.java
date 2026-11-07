package androidx.compose.ui.semantics;

import J0.AbstractC0274a0;
import R0.d;
import l0.q;

/* JADX INFO: loaded from: classes.dex */
public final class EmptySemanticsElement extends AbstractC0274a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f12096a;

    public EmptySemanticsElement(d dVar) {
        this.f12096a = dVar;
    }

    public final boolean equals(Object obj) {
        return obj == this;
    }

    public final int hashCode() {
        return System.identityHashCode(this);
    }

    @Override // J0.AbstractC0274a0
    public final q k() {
        return this.f12096a;
    }

    @Override // J0.AbstractC0274a0
    public final /* bridge */ /* synthetic */ void l(q qVar) {
    }
}
