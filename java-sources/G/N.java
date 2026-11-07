package G;

import K9.InterfaceC0402u;
import p223x.AbstractC1413d;
import p223x.C1408a0;
import p223x.C1422k;

/* JADX INFO: loaded from: classes.dex */
public final class N extends q9.i implements p241y9.e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f2602r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f2603s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ O8.c f2604t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ N(O8.c cVar, p150o9.c cVar2, int i10) {
        super(2, cVar2);
        this.f2602r = i10;
        this.f2604t = cVar;
    }

    @Override // q9.a
    public final p150o9.c create(Object obj, p150o9.c cVar) {
        switch (this.f2602r) {
            case 0:
                return new N(this.f2604t, cVar, 0);
            default:
                return new N(this.f2604t, cVar, 1);
        }
    }

    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC0402u interfaceC0402u = (InterfaceC0402u) obj;
        p150o9.c cVar = (p150o9.c) obj2;
        switch (this.f2602r) {
            case 0:
                break;
        }
        return ((N) create(interfaceC0402u, cVar)).invokeSuspend(p110k9.y.f19095a);
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f2602r) {
            case 0:
                int i10 = this.f2603s;
                if (i10 == 0) {
                    p110k9.a.e(obj);
                    C1422k c1422k = (C1422k) this.f2604t.f6511r;
                    Float f3 = new Float(0.0f);
                    C1408a0 c1408a0P = AbstractC1413d.p(400.0f, 1, new Float(0.5f));
                    this.f2603s = 1;
                    Object objH = AbstractC1413d.h(c1422k, f3, c1408a0P, true, null, this, 8);
                    p161p9.a aVar = p161p9.a.f21156r;
                    if (objH == aVar) {
                        return aVar;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p110k9.a.e(obj);
                }
                return p110k9.y.f19095a;
            default:
                int i11 = this.f2603s;
                if (i11 == 0) {
                    p110k9.a.e(obj);
                    C1422k c1422k2 = (C1422k) this.f2604t.f6511r;
                    Float f7 = new Float(0.0f);
                    C1408a0 c1408a0P2 = AbstractC1413d.p(400.0f, 1, new Float(0.5f));
                    this.f2603s = 1;
                    Object objH2 = AbstractC1413d.h(c1422k2, f7, c1408a0P2, true, null, this, 8);
                    p161p9.a aVar2 = p161p9.a.f21156r;
                    if (objH2 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p110k9.a.e(obj);
                }
                return p110k9.y.f19095a;
        }
    }
}
