package androidx.compose.ui.input.key;

import B0.e;
import J0.AbstractC0274a0;
import l0.q;
import p241y9.c;

/* JADX INFO: loaded from: classes.dex */
final class KeyInputElement extends AbstractC0274a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f11966a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f11967b;

    public KeyInputElement(c cVar, c cVar2) {
        this.f11966a = cVar;
        this.f11967b = cVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KeyInputElement)) {
            return false;
        }
        KeyInputElement keyInputElement = (KeyInputElement) obj;
        return this.f11966a == keyInputElement.f11966a && this.f11967b == keyInputElement.f11967b;
    }

    public final int hashCode() {
        c cVar = this.f11966a;
        int iHashCode = (cVar != null ? cVar.hashCode() : 0) * 31;
        c cVar2 = this.f11967b;
        return iHashCode + (cVar2 != null ? cVar2.hashCode() : 0);
    }

    @Override // J0.AbstractC0274a0
    public final q k() {
        e eVar = new e();
        eVar.f589F = this.f11966a;
        eVar.f590G = this.f11967b;
        return eVar;
    }

    @Override // J0.AbstractC0274a0
    public final void l(q qVar) {
        e eVar = (e) qVar;
        eVar.f589F = this.f11966a;
        eVar.f590G = this.f11967b;
    }
}
