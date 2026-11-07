package M4;

import A.V0;
import F.A;
import K9.InterfaceC0402u;
import p110k9.y;

/* JADX INFO: loaded from: classes.dex */
public final class j extends q9.i implements p241y9.e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f5738r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ A f5739s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ float f5740t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f5741u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(A a9, float f3, int i10, p150o9.c cVar) {
        super(2, cVar);
        this.f5739s = a9;
        this.f5740t = f3;
        this.f5741u = i10;
    }

    @Override // q9.a
    public final p150o9.c create(Object obj, p150o9.c cVar) {
        return new j(this.f5739s, this.f5740t, this.f5741u, cVar);
    }

    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) {
        return ((j) create((InterfaceC0402u) obj, (p150o9.c) obj2)).invokeSuspend(y.f19095a);
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        int i10 = this.f5738r;
        if (i10 == 0) {
            p110k9.a.e(obj);
            float f3 = this.f5740t * this.f5741u;
            this.f5738r = 1;
            Object objE = V0.e(this.f5739s, f3, this);
            p161p9.a aVar = p161p9.a.f21156r;
            if (objE == aVar) {
                return aVar;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p110k9.a.e(obj);
        }
        return y.f19095a;
    }
}
