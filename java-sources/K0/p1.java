package K0;

import K9.InterfaceC0402u;
import androidx.compose.ui.platform.AndroidComposeView;

/* JADX INFO: loaded from: classes.dex */
public final class p1 extends q9.i implements p241y9.e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f5145r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f5146s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ r1 f5147t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p1(r1 r1Var, p150o9.c cVar, int i10) {
        super(2, cVar);
        this.f5145r = i10;
        this.f5147t = r1Var;
    }

    @Override // q9.a
    public final p150o9.c create(Object obj, p150o9.c cVar) {
        switch (this.f5145r) {
            case 0:
                return new p1(this.f5147t, cVar, 0);
            default:
                return new p1(this.f5147t, cVar, 1);
        }
    }

    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC0402u interfaceC0402u = (InterfaceC0402u) obj;
        p150o9.c cVar = (p150o9.c) obj2;
        switch (this.f5145r) {
            case 0:
                break;
        }
        return ((p1) create(interfaceC0402u, cVar)).invokeSuspend(p110k9.y.f19095a);
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        switch (this.f5145r) {
            case 0:
                int i10 = this.f5146s;
                p110k9.y yVar = p110k9.y.f19095a;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p110k9.a.e(obj);
                    return yVar;
                }
                p110k9.a.e(obj);
                AndroidComposeView androidComposeView = this.f5147t.f5156r;
                this.f5146s = 1;
                Object objL = androidComposeView.f12001G.l(this);
                p161p9.a aVar = p161p9.a.f21156r;
                if (objL != aVar) {
                    objL = yVar;
                }
                return objL == aVar ? aVar : yVar;
            default:
                int i11 = this.f5146s;
                p110k9.y yVar2 = p110k9.y.f19095a;
                if (i11 != 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p110k9.a.e(obj);
                    return yVar2;
                }
                p110k9.a.e(obj);
                AndroidComposeView androidComposeView2 = this.f5147t.f5156r;
                this.f5146s = 1;
                Object objA = androidComposeView2.f12003H.a(this);
                p161p9.a aVar2 = p161p9.a.f21156r;
                if (objA != aVar2) {
                    objA = yVar2;
                }
                return objA == aVar2 ? aVar2 : yVar2;
        }
    }
}
