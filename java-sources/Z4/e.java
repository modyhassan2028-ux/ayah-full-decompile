package Z4;

import K9.InterfaceC0402u;
import p110k9.y;
import q9.i;

/* JADX INFO: loaded from: classes.dex */
public final class e extends i implements p241y9.e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f10994r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f10995s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ p241y9.c f10996t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(int i10, p150o9.c cVar, p241y9.c cVar2) {
        super(2, cVar);
        this.f10994r = i10;
        this.f10996t = cVar2;
    }

    @Override // q9.a
    public final p150o9.c create(Object obj, p150o9.c cVar) {
        switch (this.f10994r) {
            case 0:
                return new e(0, cVar, this.f10996t);
            default:
                return new e(1, cVar, this.f10996t);
        }
    }

    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC0402u interfaceC0402u = (InterfaceC0402u) obj;
        p150o9.c cVar = (p150o9.c) obj2;
        switch (this.f10994r) {
            case 0:
                break;
        }
        return ((e) create(interfaceC0402u, cVar)).invokeSuspend(y.f19095a);
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f10994r) {
            case 0:
                int i10 = this.f10995s;
                if (i10 == 0) {
                    p110k9.a.e(obj);
                    this.f10995s = 1;
                    Object objE = this.f10996t.e(this);
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
            default:
                int i11 = this.f10995s;
                if (i11 == 0) {
                    p110k9.a.e(obj);
                    this.f10995s = 1;
                    Object objE2 = this.f10996t.e(this);
                    p161p9.a aVar2 = p161p9.a.f21156r;
                    if (objE2 == aVar2) {
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
