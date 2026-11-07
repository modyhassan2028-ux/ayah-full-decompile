package A;

import D0.EnumC0097o;

/* JADX INFO: renamed from: A.a0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0008a0 extends q9.h implements p241y9.e {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f182s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f183t;

    @Override // q9.a
    public final p150o9.c create(Object obj, p150o9.c cVar) {
        C0008a0 c0008a0 = new C0008a0(2, cVar);
        c0008a0.f183t = obj;
        return c0008a0;
    }

    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C0008a0) create((D0.N) obj, (p150o9.c) obj2)).invokeSuspend(p110k9.y.f19095a);
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        int i10 = this.f182s;
        if (i10 == 0) {
            p110k9.a.e(obj);
            D0.N n6 = (D0.N) this.f183t;
            this.f182s = 1;
            Object objB = V0.b(n6, EnumC0097o.f1125t, this);
            p161p9.a aVar = p161p9.a.f21156r;
            if (objB == aVar) {
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
