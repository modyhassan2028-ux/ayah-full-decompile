package H;

import l0.q;

/* JADX INFO: loaded from: classes.dex */
public final class c extends q {

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public b f3116F;

    @Override // l0.q
    public final boolean i0() {
        return false;
    }

    @Override // l0.q
    public final void l0() {
        b bVar = this.f3116F;
        if (bVar != null) {
            bVar.f3115a.k(this);
        }
        if (bVar != null) {
            bVar.f3115a.b(this);
        }
        this.f3116F = bVar;
    }

    @Override // l0.q
    public final void n0() {
        b bVar = this.f3116F;
        if (bVar != null) {
            bVar.f3115a.k(this);
        }
    }
}
