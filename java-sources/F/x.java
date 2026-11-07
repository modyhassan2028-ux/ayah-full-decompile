package F;

import A.C0;
import K9.InterfaceC0402u;
import N9.InterfaceC0416i;
import android.view.Choreographer;

/* JADX INFO: loaded from: classes.dex */
public final class x extends q9.i implements p241y9.e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f2138r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x(int i10, p150o9.c cVar, int i11) {
        super(i10, cVar);
        this.f2138r = i11;
    }

    @Override // q9.a
    public final p150o9.c create(Object obj, p150o9.c cVar) {
        switch (this.f2138r) {
            case 0:
                return new x(2, cVar, 0);
            case 1:
                return new x(2, cVar, 1);
            case 2:
                return new x(2, cVar, 2);
            default:
                return new x(2, cVar, 3);
        }
    }

    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f2138r) {
            case 0:
                x xVar = (x) create((C0) obj, (p150o9.c) obj2);
                p110k9.y yVar = p110k9.y.f19095a;
                xVar.invokeSuspend(yVar);
                return yVar;
            case 1:
                return ((x) create((InterfaceC0402u) obj, (p150o9.c) obj2)).invokeSuspend(p110k9.y.f19095a);
            case 2:
                x xVar2 = (x) create((InterfaceC0416i) obj, (p150o9.c) obj2);
                p110k9.y yVar2 = p110k9.y.f19095a;
                xVar2.invokeSuspend(yVar2);
                return yVar2;
            default:
                x xVar3 = (x) create((D0.z) obj, (p150o9.c) obj2);
                p110k9.y yVar3 = p110k9.y.f19095a;
                xVar3.invokeSuspend(yVar3);
                return yVar3;
        }
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        int i10 = this.f2138r;
        p110k9.y yVar = p110k9.y.f19095a;
        switch (i10) {
            case 0:
                p110k9.a.e(obj);
                return yVar;
            case 1:
                p110k9.a.e(obj);
                return Choreographer.getInstance();
            case 2:
                p110k9.a.e(obj);
                return yVar;
            default:
                p110k9.a.e(obj);
                return yVar;
        }
    }
}
