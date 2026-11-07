package G4;

import p110k9.y;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j implements p241y9.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f2839r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ p241y9.c f2840s;

    public /* synthetic */ j(p241y9.c cVar, int i10) {
        this.f2839r = i10;
        this.f2840s = cVar;
    }

    @Override // p241y9.c
    public final Object e(Object obj) {
        switch (this.f2839r) {
            case 0:
                N3.a aVar = (N3.a) obj;
                p251z9.j.e(aVar, "bookmark");
                this.f2840s.e(aVar);
                break;
            case 1:
                N3.a aVar2 = (N3.a) obj;
                p251z9.j.e(aVar2, "bookmark");
                this.f2840s.e(aVar2);
                break;
            default:
                p058f5.d dVar = (p058f5.d) obj;
                p251z9.j.e(dVar, "editLibraryAction");
                this.f2840s.e(dVar);
                break;
        }
        return y.f19095a;
    }
}
