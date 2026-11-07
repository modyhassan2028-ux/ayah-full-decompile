package Ga;

/* JADX INFO: loaded from: classes.dex */
public final class u extends q9.i implements p241y9.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f3082r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f3083s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ A f3084t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(A a9, p150o9.c cVar, int i10) {
        super(1, cVar);
        this.f3082r = i10;
        this.f3084t = a9;
    }

    @Override // q9.a
    public final p150o9.c create(p150o9.c cVar) {
        switch (this.f3082r) {
            case 0:
                return new u(this.f3084t, cVar, 0);
            default:
                return new u(this.f3084t, cVar, 1);
        }
    }

    @Override // p241y9.c
    public final Object e(Object obj) {
        p150o9.c cVar = (p150o9.c) obj;
        switch (this.f3082r) {
            case 0:
                break;
        }
        return ((u) create(cVar)).invokeSuspend(p110k9.y.f19095a);
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f3082r) {
            case 0:
                int i10 = this.f3083s;
                if (i10 == 0) {
                    p110k9.a.e(obj);
                    this.f3083s = 1;
                    Object objA = A.a(this.f3084t, C.f2973r, this);
                    p161p9.a aVar = p161p9.a.f21156r;
                    if (objA == aVar) {
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
                int i11 = this.f3083s;
                if (i11 == 0) {
                    p110k9.a.e(obj);
                    this.f3083s = 1;
                    Object objA2 = A.a(this.f3084t, C.f2974s, this);
                    p161p9.a aVar2 = p161p9.a.f21156r;
                    if (objA2 == aVar2) {
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
