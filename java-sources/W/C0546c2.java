package W;

import K9.InterfaceC0402u;
import p223x.C1411c;
import p223x.InterfaceC1421j;

/* JADX INFO: renamed from: W.c2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0546c2 extends q9.i implements p241y9.e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f9006r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f9007s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C0550d2 f9008t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ float f9009u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0546c2(C0550d2 c0550d2, float f3, p150o9.c cVar, int i10) {
        super(2, cVar);
        this.f9006r = i10;
        this.f9008t = c0550d2;
        this.f9009u = f3;
    }

    @Override // q9.a
    public final p150o9.c create(Object obj, p150o9.c cVar) {
        switch (this.f9006r) {
            case 0:
                return new C0546c2(this.f9008t, this.f9009u, cVar, 0);
            default:
                return new C0546c2(this.f9008t, this.f9009u, cVar, 1);
        }
    }

    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC0402u interfaceC0402u = (InterfaceC0402u) obj;
        p150o9.c cVar = (p150o9.c) obj2;
        switch (this.f9006r) {
            case 0:
                break;
        }
        return ((C0546c2) create(interfaceC0402u, cVar)).invokeSuspend(p110k9.y.f19095a);
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f9006r) {
            case 0:
                int i10 = this.f9007s;
                if (i10 == 0) {
                    p110k9.a.e(obj);
                    C0550d2 c0550d2 = this.f9008t;
                    C1411c c1411c = c0550d2.f9031J;
                    if (c1411c != null) {
                        Float f3 = new Float(this.f9009u);
                        InterfaceC1421j interfaceC1421j = c0550d2.f9029H ? androidx.compose.material3.a.f11924f : androidx.compose.material3.a.g;
                        this.f9007s = 1;
                        obj = C1411c.c(c1411c, f3, interfaceC1421j, null, this, 12);
                        p161p9.a aVar = p161p9.a.f21156r;
                        if (obj == aVar) {
                            return aVar;
                        }
                    }
                    return p110k9.y.f19095a;
                }
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p110k9.a.e(obj);
                return p110k9.y.f19095a;
            default:
                int i11 = this.f9007s;
                if (i11 == 0) {
                    p110k9.a.e(obj);
                    C0550d2 c0550d3 = this.f9008t;
                    C1411c c1411c2 = c0550d3.f9030I;
                    if (c1411c2 != null) {
                        Float f7 = new Float(this.f9009u);
                        InterfaceC1421j interfaceC1421j2 = c0550d3.f9029H ? androidx.compose.material3.a.f11924f : androidx.compose.material3.a.g;
                        this.f9007s = 1;
                        obj = C1411c.c(c1411c2, f7, interfaceC1421j2, null, this, 12);
                        p161p9.a aVar2 = p161p9.a.f21156r;
                        if (obj == aVar2) {
                            return aVar2;
                        }
                    }
                    return p110k9.y.f19095a;
                }
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p110k9.a.e(obj);
                return p110k9.y.f19095a;
        }
    }
}
