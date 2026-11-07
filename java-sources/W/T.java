package W;

import N9.InterfaceC0416i;

/* JADX INFO: loaded from: classes.dex */
public final class T implements InterfaceC0416i {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f8820r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ p093j0.r f8821s;

    public /* synthetic */ T(p093j0.r rVar, int i10) {
        this.f8820r = i10;
        this.f8821s = rVar;
    }

    @Override // N9.InterfaceC0416i
    public final Object b(Object obj, p150o9.c cVar) {
        switch (this.f8820r) {
            case 0:
                B.i iVar = (B.i) obj;
                boolean z10 = iVar instanceof B.g;
                p093j0.r rVar = this.f8821s;
                if (z10) {
                    rVar.add(iVar);
                } else if (iVar instanceof B.h) {
                    rVar.remove(((B.h) iVar).f568a);
                } else if (iVar instanceof B.d) {
                    rVar.add(iVar);
                } else if (iVar instanceof B.e) {
                    rVar.remove(((B.e) iVar).f564a);
                } else if (iVar instanceof B.l) {
                    rVar.add(iVar);
                } else if (iVar instanceof B.m) {
                    rVar.remove(((B.m) iVar).f572a);
                } else if (iVar instanceof B.k) {
                    rVar.remove(((B.k) iVar).f570a);
                }
                break;
            default:
                B.i iVar2 = (B.i) obj;
                boolean z11 = iVar2 instanceof B.l;
                p093j0.r rVar2 = this.f8821s;
                if (z11) {
                    rVar2.add(iVar2);
                } else if (iVar2 instanceof B.m) {
                    rVar2.remove(((B.m) iVar2).f572a);
                } else if (iVar2 instanceof B.k) {
                    rVar2.remove(((B.k) iVar2).f570a);
                } else if (iVar2 instanceof B.b) {
                    rVar2.add(iVar2);
                } else if (iVar2 instanceof B.c) {
                    rVar2.remove(((B.c) iVar2).f563a);
                } else if (iVar2 instanceof B.a) {
                    rVar2.remove(((B.a) iVar2).f562a);
                }
                break;
        }
        return p110k9.y.f19095a;
    }
}
