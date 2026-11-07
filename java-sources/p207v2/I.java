package p207v2;

import N9.InterfaceC0416i;
import p110k9.a;
import p110k9.y;
import p150o9.c;
import p241y9.e;
import q9.i;

/* JADX INFO: loaded from: classes.dex */
public final class I extends i implements e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f23143r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ J f23144s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ I(J j, c cVar, int i10) {
        super(2, cVar);
        this.f23143r = i10;
        this.f23144s = j;
    }

    @Override // q9.a
    public final c create(Object obj, c cVar) {
        switch (this.f23143r) {
            case 0:
                return new I(this.f23144s, cVar, 0);
            default:
                return new I(this.f23144s, cVar, 1);
        }
    }

    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC0416i interfaceC0416i = (InterfaceC0416i) obj;
        c cVar = (c) obj2;
        switch (this.f23143r) {
            case 0:
                I i10 = (I) create(interfaceC0416i, cVar);
                y yVar = y.f19095a;
                i10.invokeSuspend(yVar);
                return yVar;
            default:
                I i11 = (I) create(interfaceC0416i, cVar);
                y yVar2 = y.f19095a;
                i11.invokeSuspend(yVar2);
                return yVar2;
        }
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f23143r) {
            case 0:
                a.e(obj);
                this.f23144s.f23151h.k(new Integer(0));
                break;
            default:
                a.e(obj);
                this.f23144s.g.k(new Integer(0));
                break;
        }
        return y.f19095a;
    }
}
