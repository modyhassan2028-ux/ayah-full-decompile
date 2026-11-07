package androidx.compose.foundation;

import B.j;
import J0.AbstractC0274a0;
import l0.q;
import p232y.C1471z;

/* JADX INFO: loaded from: classes.dex */
final class FocusableElement extends AbstractC0274a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f11757a;

    public FocusableElement(j jVar) {
        this.f11757a = jVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FocusableElement) {
            return p251z9.j.a(this.f11757a, ((FocusableElement) obj).f11757a);
        }
        return false;
    }

    public final int hashCode() {
        j jVar = this.f11757a;
        if (jVar != null) {
            return jVar.hashCode();
        }
        return 0;
    }

    @Override // J0.AbstractC0274a0
    public final q k() {
        return new C1471z(this.f11757a, 1, null);
    }

    @Override // J0.AbstractC0274a0
    public final void l(q qVar) {
        ((C1471z) qVar).A0(this.f11757a);
    }
}
