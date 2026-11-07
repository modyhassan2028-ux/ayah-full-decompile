package W4;

import ka.k;
import p110k9.y;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements p241y9.a {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f9616r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f9617s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f9618t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f9619u;

    public /* synthetic */ d(Object obj, Object obj2, Object obj3, int i10) {
        this.f9616r = i10;
        this.f9617s = obj;
        this.f9618t = obj2;
        this.f9619u = obj3;
    }

    @Override // p241y9.a
    public final Object invoke() {
        switch (this.f9616r) {
            case 0:
                ((p241y9.e) this.f9617s).invoke((p095j3.c) this.f9618t, ((T4.b) this.f9619u).f7783a);
                return y.f19095a;
            case 1:
                ka.d dVar = (ka.d) this.f9617s;
                k kVar = (k) this.f9618t;
                ka.a aVar = (ka.a) this.f9619u;
                p186s9.b bVar = dVar.f19123b;
                j.b(bVar);
                return bVar.a(aVar.f19104h.f19189d, kVar.a());
            default:
                p241y9.a aVar2 = (p241y9.a) this.f9617s;
                p241y9.c cVar = (p241y9.c) this.f9618t;
                r5.a aVar3 = (r5.a) this.f9619u;
                aVar2.invoke();
                cVar.e(Integer.valueOf(aVar3.f21567a));
                return y.f19095a;
        }
    }
}
