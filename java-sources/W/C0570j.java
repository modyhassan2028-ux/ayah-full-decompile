package W;

import p223x.AbstractC1413d;
import p223x.C1408a0;
import p223x.C1411c;

/* JADX INFO: renamed from: W.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0570j extends q9.i implements p241y9.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f9186r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f9187s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C0576l f9188t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ float f9189u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0570j(C0576l c0576l, float f3, p150o9.c cVar, int i10) {
        super(1, cVar);
        this.f9186r = i10;
        this.f9188t = c0576l;
        this.f9189u = f3;
    }

    @Override // q9.a
    public final p150o9.c create(p150o9.c cVar) {
        switch (this.f9186r) {
            case 0:
                return new C0570j(this.f9188t, this.f9189u, cVar, 0);
            default:
                return new C0570j(this.f9188t, this.f9189u, cVar, 1);
        }
    }

    @Override // p241y9.c
    public final Object e(Object obj) {
        p150o9.c cVar = (p150o9.c) obj;
        switch (this.f9186r) {
            case 0:
                break;
        }
        return ((C0570j) create(cVar)).invokeSuspend(p110k9.y.f19095a);
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f9186r) {
            case 0:
                int i10 = this.f9187s;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p110k9.a.e(obj);
                    return obj;
                }
                p110k9.a.e(obj);
                C1411c c1411c = this.f9188t.f9225d;
                Float f3 = new Float(this.f9189u);
                C1408a0 c1408a0P = AbstractC1413d.p(700.0f, 4, null);
                this.f9187s = 1;
                Object objC = C1411c.c(c1411c, f3, c1408a0P, null, this, 12);
                p161p9.a aVar = p161p9.a.f21156r;
                return objC == aVar ? aVar : objC;
            default:
                int i11 = this.f9187s;
                if (i11 != 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p110k9.a.e(obj);
                    return obj;
                }
                p110k9.a.e(obj);
                C1411c c1411c2 = this.f9188t.f9225d;
                Float f7 = new Float(this.f9189u);
                C1408a0 c1408a0P2 = AbstractC1413d.p(0.0f, 7, null);
                this.f9187s = 1;
                Object objC2 = C1411c.c(c1411c2, f7, c1408a0P2, null, this, 12);
                p161p9.a aVar2 = p161p9.a.f21156r;
                return objC2 == aVar2 ? aVar2 : objC2;
        }
    }
}
