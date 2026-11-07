package p207v2;

import K9.InterfaceC0402u;
import N9.AbstractC0419l;
import N9.C0424q;
import S9.c;
import p110k9.y;
import p161p9.a;
import p241y9.e;
import q9.i;

/* JADX INFO: loaded from: classes.dex */
public final class F extends i implements e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f23127r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public H f23128s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public c f23129t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public G f23130u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f23131v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ G f23132w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ F(G g, p150o9.c cVar, int i10) {
        super(2, cVar);
        this.f23127r = i10;
        this.f23132w = g;
    }

    @Override // q9.a
    public final p150o9.c create(Object obj, p150o9.c cVar) {
        switch (this.f23127r) {
            case 0:
                return new F(this.f23132w, cVar, 0);
            default:
                return new F(this.f23132w, cVar, 1);
        }
    }

    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC0402u interfaceC0402u = (InterfaceC0402u) obj;
        p150o9.c cVar = (p150o9.c) obj2;
        switch (this.f23127r) {
            case 0:
                break;
        }
        return ((F) create(interfaceC0402u, cVar)).invokeSuspend(y.f19095a);
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        G g;
        H h7;
        c cVar;
        p150o9.c cVar2;
        G g10;
        H h10;
        c cVar3;
        p150o9.c cVar4;
        switch (this.f23127r) {
            case 0:
                int i10 = this.f23131v;
                a aVar = a.f21156r;
                try {
                    if (i10 != 0) {
                        if (i10 == 1) {
                            g = this.f23130u;
                            cVar = this.f23129t;
                            h7 = this.f23128s;
                            p110k9.a.e(obj);
                        } else {
                            if (i10 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            p110k9.a.e(obj);
                        }
                        return y.f19095a;
                    }
                    p110k9.a.e(obj);
                    g = this.f23132w;
                    h7 = g.f23139h;
                    c cVar5 = h7.f23141a;
                    this.f23128s = h7;
                    this.f23129t = cVar5;
                    this.f23130u = g;
                    this.f23131v = 1;
                    if (cVar5.e(this) == aVar) {
                        return aVar;
                    }
                    cVar = cVar5;
                    J j = h7.f23142b;
                    C0424q c0424q = new C0424q(new I(j, cVar2, 1), AbstractC0419l.l(j.g));
                    cVar.b(null);
                    this.f23128s = null;
                    this.f23129t = null;
                    this.f23130u = null;
                    this.f23131v = 2;
                    if (G.a(g, c0424q, EnumC1375m.f23269s, this) == aVar) {
                        return aVar;
                    }
                    return y.f19095a;
                } catch (Throwable th) {
                    cVar.b(null);
                    throw th;
                }
                cVar2 = null;
            default:
                int i11 = this.f23131v;
                a aVar2 = a.f21156r;
                try {
                    if (i11 != 0) {
                        if (i11 == 1) {
                            g10 = this.f23130u;
                            cVar3 = this.f23129t;
                            h10 = this.f23128s;
                            p110k9.a.e(obj);
                        } else {
                            if (i11 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            p110k9.a.e(obj);
                        }
                        return y.f19095a;
                    }
                    p110k9.a.e(obj);
                    g10 = this.f23132w;
                    h10 = g10.f23139h;
                    c cVar6 = h10.f23141a;
                    this.f23128s = h10;
                    this.f23129t = cVar6;
                    this.f23130u = g10;
                    this.f23131v = 1;
                    if (cVar6.e(this) == aVar2) {
                        return aVar2;
                    }
                    cVar3 = cVar6;
                    J j10 = h10.f23142b;
                    C0424q c0424q2 = new C0424q(new I(j10, cVar4, 0), AbstractC0419l.l(j10.f23151h));
                    cVar3.b(null);
                    this.f23128s = null;
                    this.f23129t = null;
                    this.f23130u = null;
                    this.f23131v = 2;
                    if (G.a(g10, c0424q2, EnumC1375m.f23270t, this) == aVar2) {
                        return aVar2;
                    }
                    return y.f19095a;
                } catch (Throwable th2) {
                    cVar3.b(null);
                    throw th2;
                }
                cVar4 = null;
        }
    }
}
