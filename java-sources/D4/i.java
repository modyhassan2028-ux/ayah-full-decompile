package D4;

import F.A;
import K9.InterfaceC0402u;
import p110k9.y;

/* JADX INFO: loaded from: classes.dex */
public final class i extends q9.i implements p241y9.e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f1200r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f1201s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ A f1202t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f1203u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(A a9, int i10, p150o9.c cVar, int i11) {
        super(2, cVar);
        this.f1200r = i11;
        this.f1202t = a9;
        this.f1203u = i10;
    }

    @Override // q9.a
    public final p150o9.c create(Object obj, p150o9.c cVar) {
        switch (this.f1200r) {
            case 0:
                return new i(this.f1202t, this.f1203u, cVar, 0);
            default:
                return new i(this.f1202t, this.f1203u, cVar, 1);
        }
    }

    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC0402u interfaceC0402u = (InterfaceC0402u) obj;
        p150o9.c cVar = (p150o9.c) obj2;
        switch (this.f1200r) {
            case 0:
                break;
        }
        return ((i) create(interfaceC0402u, cVar)).invokeSuspend(y.f19095a);
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f1200r) {
            case 0:
                int i10 = this.f1201s;
                if (i10 == 0) {
                    p110k9.a.e(obj);
                    this.f1201s = 1;
                    Object objI = A.i(this.f1202t, this.f1203u, this);
                    p161p9.a aVar = p161p9.a.f21156r;
                    if (objI == aVar) {
                        return aVar;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p110k9.a.e(obj);
                }
                return y.f19095a;
            default:
                int i11 = this.f1201s;
                if (i11 == 0) {
                    p110k9.a.e(obj);
                    this.f1201s = 1;
                    Object objI2 = A.i(this.f1202t, this.f1203u, this);
                    p161p9.a aVar2 = p161p9.a.f21156r;
                    if (objI2 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p110k9.a.e(obj);
                }
                return y.f19095a;
        }
    }
}
