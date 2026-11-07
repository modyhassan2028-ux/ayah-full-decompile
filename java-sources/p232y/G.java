package p232y;

import K9.InterfaceC0402u;
import p110k9.a;
import p110k9.y;
import p150o9.c;
import p241y9.e;
import q9.i;

/* JADX INFO: loaded from: classes.dex */
public final class G extends i implements e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f24429r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f24430s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ H f24431t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ G(H h7, c cVar, int i10) {
        super(2, cVar);
        this.f24429r = i10;
        this.f24431t = h7;
    }

    @Override // q9.a
    public final c create(Object obj, c cVar) {
        switch (this.f24429r) {
            case 0:
                return new G(this.f24431t, cVar, 0);
            default:
                return new G(this.f24431t, cVar, 1);
        }
    }

    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC0402u interfaceC0402u = (InterfaceC0402u) obj;
        c cVar = (c) obj2;
        switch (this.f24429r) {
            case 0:
                break;
        }
        return ((G) create(interfaceC0402u, cVar)).invokeSuspend(y.f19095a);
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f24429r) {
            case 0:
                int i10 = this.f24430s;
                if (i10 == 0) {
                    a.e(obj);
                    this.f24430s = 1;
                    Object objV0 = H.v0(this.f24431t, this);
                    p161p9.a aVar = p161p9.a.f21156r;
                    if (objV0 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    a.e(obj);
                }
                return y.f19095a;
            default:
                int i11 = this.f24430s;
                if (i11 == 0) {
                    a.e(obj);
                    this.f24430s = 1;
                    Object objW0 = H.w0(this.f24431t, this);
                    p161p9.a aVar2 = p161p9.a.f21156r;
                    if (objW0 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    a.e(obj);
                }
                return y.f19095a;
        }
    }
}
