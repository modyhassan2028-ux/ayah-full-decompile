package T1;

/* JADX INFO: renamed from: T1.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0498o extends q9.i implements p241y9.f {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f7712r = 1;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f7713s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f7714t;

    public /* synthetic */ C0498o(int i10, p150o9.c cVar) {
        super(i10, cVar);
    }

    @Override // p241y9.f
    public final Object d(Object obj, Object obj2, Object obj3) {
        switch (this.f7712r) {
            case 0:
                return new C0498o((B) this.f7714t, (p150o9.c) obj3).invokeSuspend(p110k9.y.f19095a);
            default:
                ((Boolean) obj2).getClass();
                C0498o c0498o = new C0498o(3, (p150o9.c) obj3);
                c0498o.f7714t = (D) obj;
                return c0498o.invokeSuspend(p110k9.y.f19095a);
        }
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f7712r) {
            case 0:
                int i10 = this.f7713s;
                if (i10 == 0) {
                    p110k9.a.e(obj);
                    B b5 = (B) this.f7714t;
                    this.f7713s = 1;
                    Object objC = B.c(b5, this);
                    p161p9.a aVar = p161p9.a.f21156r;
                    if (objC == aVar) {
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
                int i11 = this.f7713s;
                if (i11 != 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p110k9.a.e(obj);
                    return obj;
                }
                p110k9.a.e(obj);
                D d5 = (D) this.f7714t;
                this.f7713s = 1;
                d5.getClass();
                Object objA = D.a(d5, this);
                p161p9.a aVar2 = p161p9.a.f21156r;
                return objA == aVar2 ? aVar2 : objA;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0498o(B b5, p150o9.c cVar) {
        super(3, cVar);
        this.f7714t = b5;
    }
}
