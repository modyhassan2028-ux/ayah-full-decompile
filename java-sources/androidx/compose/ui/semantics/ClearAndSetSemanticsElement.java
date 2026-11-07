package androidx.compose.ui.semantics;

import J0.AbstractC0274a0;
import R0.l;
import l0.q;
import p241y9.c;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class ClearAndSetSemanticsElement extends AbstractC0274a0 implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f12095a;

    public ClearAndSetSemanticsElement(c cVar) {
        this.f12095a = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ClearAndSetSemanticsElement) && j.a(this.f12095a, ((ClearAndSetSemanticsElement) obj).f12095a);
    }

    public final int hashCode() {
        return this.f12095a.hashCode();
    }

    @Override // R0.l
    public final R0.j j() {
        R0.j jVar = new R0.j();
        jVar.f7110t = false;
        jVar.f7111u = true;
        this.f12095a.e(jVar);
        return jVar;
    }

    @Override // J0.AbstractC0274a0
    public final q k() {
        return new R0.c(false, true, this.f12095a);
    }

    @Override // J0.AbstractC0274a0
    public final void l(q qVar) {
        ((R0.c) qVar).f7074H = this.f12095a;
    }

    public final String toString() {
        return "ClearAndSetSemanticsElement(properties=" + this.f12095a + ')';
    }
}
