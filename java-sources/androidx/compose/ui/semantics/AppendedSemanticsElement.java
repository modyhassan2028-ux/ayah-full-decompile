package androidx.compose.ui.semantics;

import J0.AbstractC0274a0;
import R0.l;
import l0.q;
import p241y9.c;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class AppendedSemanticsElement extends AbstractC0274a0 implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f12093a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f12094b;

    public AppendedSemanticsElement(c cVar, boolean z10) {
        this.f12093a = z10;
        this.f12094b = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppendedSemanticsElement)) {
            return false;
        }
        AppendedSemanticsElement appendedSemanticsElement = (AppendedSemanticsElement) obj;
        return this.f12093a == appendedSemanticsElement.f12093a && j.a(this.f12094b, appendedSemanticsElement.f12094b);
    }

    public final int hashCode() {
        return this.f12094b.hashCode() + ((this.f12093a ? 1231 : 1237) * 31);
    }

    @Override // R0.l
    public final R0.j j() {
        R0.j jVar = new R0.j();
        jVar.f7110t = this.f12093a;
        this.f12094b.e(jVar);
        return jVar;
    }

    @Override // J0.AbstractC0274a0
    public final q k() {
        return new R0.c(this.f12093a, false, this.f12094b);
    }

    @Override // J0.AbstractC0274a0
    public final void l(q qVar) {
        R0.c cVar = (R0.c) qVar;
        cVar.f7072F = this.f12093a;
        cVar.f7074H = this.f12094b;
    }

    public final String toString() {
        return "AppendedSemanticsElement(mergeDescendants=" + this.f12093a + ", properties=" + this.f12094b + ')';
    }
}
