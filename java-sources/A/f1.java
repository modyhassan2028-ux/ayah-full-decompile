package A;

import K9.InterfaceC0402u;

/* JADX INFO: loaded from: classes.dex */
public final class f1 extends q9.i implements p241y9.e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f238r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C0053x0 f239s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f1(C0053x0 c0053x0, p150o9.c cVar, int i10) {
        super(2, cVar);
        this.f238r = i10;
        this.f239s = c0053x0;
    }

    @Override // q9.a
    public final p150o9.c create(Object obj, p150o9.c cVar) {
        switch (this.f238r) {
            case 0:
                return new f1(this.f239s, cVar, 0);
            case 1:
                return new f1(this.f239s, cVar, 1);
            case 2:
                return new f1(this.f239s, cVar, 2);
            case 3:
                return new f1(this.f239s, cVar, 3);
            case 4:
                return new f1(this.f239s, cVar, 4);
            case 5:
                return new f1(this.f239s, cVar, 5);
            case 6:
                return new f1(this.f239s, cVar, 6);
            default:
                return new f1(this.f239s, cVar, 7);
        }
    }

    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC0402u interfaceC0402u = (InterfaceC0402u) obj;
        p150o9.c cVar = (p150o9.c) obj2;
        switch (this.f238r) {
            case 0:
                f1 f1Var = (f1) create(interfaceC0402u, cVar);
                p110k9.y yVar = p110k9.y.f19095a;
                f1Var.invokeSuspend(yVar);
                return yVar;
            case 1:
                f1 f1Var2 = (f1) create(interfaceC0402u, cVar);
                p110k9.y yVar2 = p110k9.y.f19095a;
                f1Var2.invokeSuspend(yVar2);
                return yVar2;
            case 2:
                f1 f1Var3 = (f1) create(interfaceC0402u, cVar);
                p110k9.y yVar3 = p110k9.y.f19095a;
                f1Var3.invokeSuspend(yVar3);
                return yVar3;
            case 3:
                f1 f1Var4 = (f1) create(interfaceC0402u, cVar);
                p110k9.y yVar4 = p110k9.y.f19095a;
                f1Var4.invokeSuspend(yVar4);
                return yVar4;
            case 4:
                f1 f1Var5 = (f1) create(interfaceC0402u, cVar);
                p110k9.y yVar5 = p110k9.y.f19095a;
                f1Var5.invokeSuspend(yVar5);
                return yVar5;
            case 5:
                f1 f1Var6 = (f1) create(interfaceC0402u, cVar);
                p110k9.y yVar6 = p110k9.y.f19095a;
                f1Var6.invokeSuspend(yVar6);
                return yVar6;
            case 6:
                f1 f1Var7 = (f1) create(interfaceC0402u, cVar);
                p110k9.y yVar7 = p110k9.y.f19095a;
                f1Var7.invokeSuspend(yVar7);
                return yVar7;
            default:
                f1 f1Var8 = (f1) create(interfaceC0402u, cVar);
                p110k9.y yVar8 = p110k9.y.f19095a;
                f1Var8.invokeSuspend(yVar8);
                return yVar8;
        }
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        int i10 = this.f238r;
        p110k9.y yVar = p110k9.y.f19095a;
        C0053x0 c0053x0 = this.f239s;
        switch (i10) {
            case 0:
                p110k9.a.e(obj);
                c0053x0.a();
                break;
            case 1:
                p110k9.a.e(obj);
                c0053x0.c();
                break;
            case 2:
                p110k9.a.e(obj);
                c0053x0.c();
                break;
            case 3:
                p110k9.a.e(obj);
                c0053x0.a();
                break;
            case 4:
                p110k9.a.e(obj);
                c0053x0.c();
                break;
            case 5:
                p110k9.a.e(obj);
                c0053x0.c();
                break;
            case 6:
                p110k9.a.e(obj);
                c0053x0.a();
                break;
            default:
                p110k9.a.e(obj);
                c0053x0.c();
                break;
        }
        return yVar;
    }
}
