package X;

import A.C0039q;
import W.C0601t1;

/* JADX INFO: loaded from: classes.dex */
public final class r extends q9.i implements p241y9.f {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f9772r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ L5.c f9773s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C0039q f9774t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(L5.c cVar, C0039q c0039q, p150o9.c cVar2) {
        super(3, cVar2);
        this.f9773s = cVar;
        this.f9774t = c0039q;
    }

    @Override // p241y9.f
    public final Object d(Object obj, Object obj2, Object obj3) {
        return new r(this.f9773s, this.f9774t, (p150o9.c) obj3).invokeSuspend(p110k9.y.f19095a);
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i10 = this.f9772r;
        if (i10 == 0) {
            p110k9.a.e(obj);
            C0601t1 c0601t1 = (C0601t1) this.f9773s.f5532s;
            this.f9772r = 1;
            Object objInvoke = this.f9774t.invoke(c0601t1, this);
            p161p9.a aVar = p161p9.a.f21156r;
            if (objInvoke == aVar) {
                return aVar;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p110k9.a.e(obj);
        }
        return p110k9.y.f19095a;
    }
}
