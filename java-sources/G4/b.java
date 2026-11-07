package G4;

import p110k9.y;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements p241y9.a {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f2797r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ p241y9.c f2798s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ E4.a f2799t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f2800u;

    public /* synthetic */ b(p241y9.c cVar, int i10, E4.a aVar, int i11) {
        this.f2797r = i11;
        this.f2798s = cVar;
        this.f2800u = i10;
        this.f2799t = aVar;
    }

    @Override // p241y9.a
    public final Object invoke() {
        switch (this.f2797r) {
            case 0:
                N3.b bVar = (N3.b) this.f2799t.f1852i;
                this.f2798s.e(new E4.b(this.f2800u, bVar.f6001a, bVar.f6005e, bVar.f6006f));
                break;
            case 1:
                N3.c cVar = (N3.c) this.f2799t.f1852i;
                this.f2798s.e(new E4.b(this.f2800u, -1, cVar.f6007a, cVar.f6008b));
                break;
            case 2:
                E4.a aVar = this.f2799t;
                this.f2798s.e(new E4.f(this.f2800u, aVar.f1846b, aVar.f1847c, aVar.f1849e, aVar.f1848d, p165q3.j.f21299s));
                break;
            case 3:
                this.f2798s.e(new E4.d(this.f2800u, !this.f2799t.f1850f));
                break;
            default:
                E4.a aVar2 = this.f2799t;
                this.f2798s.e(new E4.h(this.f2800u, aVar2.f1846b, aVar2.f1847c));
                break;
        }
        return y.f19095a;
    }

    public /* synthetic */ b(p241y9.c cVar, E4.a aVar, int i10, int i11) {
        this.f2797r = i11;
        this.f2798s = cVar;
        this.f2799t = aVar;
        this.f2800u = i10;
    }
}
