package H4;

import E4.t;
import p110k9.y;
import p124m3.j;
import p181s2.o;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements p241y9.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f3365r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ p241y9.c f3366s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ t f3367t;

    public /* synthetic */ d(p241y9.c cVar, t tVar, int i10) {
        this.f3365r = i10;
        this.f3366s = cVar;
        this.f3367t = tVar;
    }

    @Override // p241y9.c
    public final Object e(Object obj) {
        switch (this.f3365r) {
            case 0:
                j jVar = (j) obj;
                p251z9.j.e(jVar, "it");
                j jVar2 = this.f3367t.f1884a;
                this.f3366s.e(new E4.g(jVar2.f19585a, o.d(jVar2), o.d(jVar)));
                break;
            case 1:
                p124m3.d dVar = (p124m3.d) obj;
                p251z9.j.e(dVar, "it");
                j jVar3 = this.f3367t.f1884a;
                this.f3366s.e(new E4.g(jVar3.f19585a, o.d(jVar3), o.d((j) dVar.f19562p.getValue())));
                break;
            default:
                j jVar4 = (j) obj;
                p251z9.j.e(jVar4, "it");
                j jVar5 = this.f3367t.f1884a;
                this.f3366s.e(new E4.g(jVar5.f19585a, o.d(jVar5), o.d(jVar4)));
                break;
        }
        return y.f19095a;
    }
}
