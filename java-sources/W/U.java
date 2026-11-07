package W;

import K9.InterfaceC0402u;

/* JADX INFO: loaded from: classes.dex */
public final class U extends q9.i implements p241y9.e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f8844r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f8845s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ B.j f8846t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ p093j0.r f8847u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ U(B.j jVar, p093j0.r rVar, p150o9.c cVar, int i10) {
        super(2, cVar);
        this.f8844r = i10;
        this.f8846t = jVar;
        this.f8847u = rVar;
    }

    @Override // q9.a
    public final p150o9.c create(Object obj, p150o9.c cVar) {
        switch (this.f8844r) {
            case 0:
                return new U(this.f8846t, this.f8847u, cVar, 0);
            default:
                return new U(this.f8846t, this.f8847u, cVar, 1);
        }
    }

    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC0402u interfaceC0402u = (InterfaceC0402u) obj;
        p150o9.c cVar = (p150o9.c) obj2;
        switch (this.f8844r) {
            case 0:
                break;
        }
        return ((U) create(interfaceC0402u, cVar)).invokeSuspend(p110k9.y.f19095a);
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        switch (this.f8844r) {
            case 0:
                int i10 = this.f8845s;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p110k9.a.e(obj);
                    return p110k9.y.f19095a;
                }
                p110k9.a.e(obj);
                N9.Y y10 = this.f8846t.f569a;
                T t2 = new T(this.f8847u, 0);
                this.f8845s = 1;
                y10.d(t2, this);
                return p161p9.a.f21156r;
            default:
                int i11 = this.f8845s;
                if (i11 != 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p110k9.a.e(obj);
                    return p110k9.y.f19095a;
                }
                p110k9.a.e(obj);
                N9.Y y11 = this.f8846t.f569a;
                T t10 = new T(this.f8847u, 1);
                this.f8845s = 1;
                y11.d(t10, this);
                return p161p9.a.f21156r;
        }
    }
}
