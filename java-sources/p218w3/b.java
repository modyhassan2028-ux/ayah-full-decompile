package p218w3;

import J3.x;
import K9.InterfaceC0402u;
import p110k9.a;
import p110k9.y;
import p124m3.j;
import p150o9.c;
import p151p.C1256n;
import p241y9.e;
import q9.i;

/* JADX INFO: loaded from: classes.dex */
public final class b extends i implements e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f23648r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f23649s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ c f23650t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f23651u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(c cVar, int i10, c cVar2, int i11) {
        super(2, cVar2);
        this.f23648r = i11;
        this.f23650t = cVar;
        this.f23651u = i10;
    }

    @Override // q9.a
    public final c create(Object obj, c cVar) {
        switch (this.f23648r) {
            case 0:
                return new b(this.f23650t, this.f23651u, cVar, 0);
            default:
                return new b(this.f23650t, this.f23651u, cVar, 1);
        }
    }

    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC0402u interfaceC0402u = (InterfaceC0402u) obj;
        c cVar = (c) obj2;
        switch (this.f23648r) {
            case 0:
                break;
        }
        return ((b) create(interfaceC0402u, cVar)).invokeSuspend(y.f19095a);
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f23648r) {
            case 0:
                int i10 = this.f23649s;
                if (i10 == 0) {
                    a.e(obj);
                    C1256n c1256n = this.f23650t.f23652a;
                    this.f23649s = 1;
                    obj = c1256n.g(this.f23651u, this);
                    p161p9.a aVar = p161p9.a.f21156r;
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    a.e(obj);
                }
                return new Integer(((j) obj).c());
            default:
                int i11 = this.f23649s;
                if (i11 == 0) {
                    a.e(obj);
                    x xVar = this.f23650t.f23654c;
                    this.f23649s = 1;
                    Object objA = xVar.a(this.f23651u, this);
                    p161p9.a aVar2 = p161p9.a.f21156r;
                    if (objA == aVar2) {
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
