package D4;

import p110k9.y;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h implements p241y9.a {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f1197r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ p241y9.c f1198s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ p124m3.j f1199t;

    public /* synthetic */ h(int i10, p124m3.j jVar, p241y9.c cVar) {
        this.f1197r = i10;
        this.f1198s = cVar;
        this.f1199t = jVar;
    }

    @Override // p241y9.a
    public final Object invoke() {
        switch (this.f1197r) {
            case 0:
                this.f1198s.e(this.f1199t);
                break;
            case 1:
                this.f1198s.e(H4.a.c(this.f1199t, p165q3.j.f21298r));
                break;
            case 2:
                this.f1198s.e(H4.a.c(this.f1199t, p165q3.j.f21299s));
                break;
            default:
                this.f1198s.e(H4.a.c(this.f1199t, p165q3.j.f21301u));
                break;
        }
        return y.f19095a;
    }
}
