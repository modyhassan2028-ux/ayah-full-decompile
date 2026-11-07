package androidx.compose.foundation.relocation;

import H.b;
import H.c;
import J0.AbstractC0274a0;
import l0.q;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
final class BringIntoViewRequesterElement extends AbstractC0274a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f11859a;

    public BringIntoViewRequesterElement(b bVar) {
        this.f11859a = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BringIntoViewRequesterElement) {
            return j.a(this.f11859a, ((BringIntoViewRequesterElement) obj).f11859a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f11859a.hashCode();
    }

    @Override // J0.AbstractC0274a0
    public final q k() {
        c cVar = new c();
        cVar.f3116F = this.f11859a;
        return cVar;
    }

    @Override // J0.AbstractC0274a0
    public final void l(q qVar) {
        c cVar = (c) qVar;
        b bVar = cVar.f3116F;
        if (bVar != null) {
            bVar.f3115a.k(cVar);
        }
        b bVar2 = this.f11859a;
        if (bVar2 != null) {
            bVar2.f3115a.b(cVar);
        }
        cVar.f3116F = bVar2;
    }
}
