package androidx.compose.foundation.layout;

import D.C0067j;
import J0.AbstractC0274a0;
import l0.j;
import l0.q;

/* JADX INFO: loaded from: classes.dex */
final class BoxChildDataElement extends AbstractC0274a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f11800a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f11801b;

    public BoxChildDataElement(j jVar, boolean z10) {
        this.f11800a = jVar;
        this.f11801b = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        BoxChildDataElement boxChildDataElement = obj instanceof BoxChildDataElement ? (BoxChildDataElement) obj : null;
        return boxChildDataElement != null && this.f11800a.equals(boxChildDataElement.f11800a) && this.f11801b == boxChildDataElement.f11801b;
    }

    public final int hashCode() {
        return (this.f11800a.hashCode() * 31) + (this.f11801b ? 1231 : 1237);
    }

    @Override // J0.AbstractC0274a0
    public final q k() {
        C0067j c0067j = new C0067j();
        c0067j.f988F = this.f11800a;
        c0067j.f989G = this.f11801b;
        return c0067j;
    }

    @Override // J0.AbstractC0274a0
    public final void l(q qVar) {
        C0067j c0067j = (C0067j) qVar;
        c0067j.f988F = this.f11800a;
        c0067j.f989G = this.f11801b;
    }
}
