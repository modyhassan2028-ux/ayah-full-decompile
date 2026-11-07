package L2;

import F2.u;
import K9.InterfaceC0402u;
import p110k9.y;

/* JADX INFO: loaded from: classes.dex */
public final class c extends q9.i implements p241y9.e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f5455r = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f5456s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ u f5457t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ boolean f5458u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ boolean f5459v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ p241y9.c f5460w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(u uVar, boolean z10, boolean z11, p241y9.c cVar, p150o9.c cVar2) {
        super(2, cVar2);
        this.f5457t = uVar;
        this.f5458u = z10;
        this.f5459v = z11;
        this.f5460w = cVar;
    }

    @Override // q9.a
    public final p150o9.c create(Object obj, p150o9.c cVar) {
        switch (this.f5455r) {
            case 0:
                return new c(this.f5457t, this.f5458u, this.f5459v, this.f5460w, cVar);
            default:
                return new c(cVar, this.f5457t, this.f5458u, this.f5459v, this.f5460w);
        }
    }

    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC0402u interfaceC0402u = (InterfaceC0402u) obj;
        p150o9.c cVar = (p150o9.c) obj2;
        switch (this.f5455r) {
            case 0:
                break;
        }
        return ((c) create(interfaceC0402u, cVar)).invokeSuspend(y.f19095a);
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f5455r) {
            case 0:
                int i10 = this.f5456s;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p110k9.a.e(obj);
                    return obj;
                }
                p110k9.a.e(obj);
                u uVar = this.f5457t;
                boolean z10 = !(uVar.g() && uVar.h()) && this.f5458u;
                boolean z11 = this.f5459v;
                b bVar = new b(z10, z11, uVar, null, this.f5460w, 0);
                this.f5456s = 1;
                Object objK = uVar.k(z11, bVar, this);
                p161p9.a aVar = p161p9.a.f21156r;
                return objK == aVar ? aVar : objK;
            default:
                int i11 = this.f5456s;
                if (i11 != 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p110k9.a.e(obj);
                    return obj;
                }
                p110k9.a.e(obj);
                p241y9.c cVar = this.f5460w;
                boolean z12 = this.f5459v;
                boolean z13 = this.f5458u;
                u uVar2 = this.f5457t;
                b bVar2 = new b(z12, z13, uVar2, null, cVar, 1);
                this.f5456s = 1;
                Object objK2 = uVar2.k(z13, bVar2, this);
                p161p9.a aVar2 = p161p9.a.f21156r;
                return objK2 == aVar2 ? aVar2 : objK2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(p150o9.c cVar, u uVar, boolean z10, boolean z11, p241y9.c cVar2) {
        super(2, cVar);
        this.f5457t = uVar;
        this.f5458u = z10;
        this.f5459v = z11;
        this.f5460w = cVar2;
    }
}
