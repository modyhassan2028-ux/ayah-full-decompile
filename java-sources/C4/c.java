package C4;

import N9.C0432z;
import N9.InterfaceC0415h;
import N9.InterfaceC0416i;
import io.realm.RealmFieldTypeConstants;
import p110k9.y;
import p251z9.t;

/* JADX INFO: loaded from: classes.dex */
public final class c implements InterfaceC0415h {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f730r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0415h f731s;

    public /* synthetic */ c(InterfaceC0415h interfaceC0415h, int i10) {
        this.f730r = i10;
        this.f731s = interfaceC0415h;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0096  */
    /* JADX WARN: Code duplicated, block: B:61:0x00e0  */
    @Override // N9.InterfaceC0415h
    public final Object d(InterfaceC0416i interfaceC0416i, p150o9.c cVar) {
        C0432z c0432z;
        O9.a e10;
        Object obj;
        switch (this.f730r) {
            case 0:
                Object objD = this.f731s.d(new b(interfaceC0416i, 0), cVar);
                return objD == p161p9.a.f21156r ? objD : y.f19095a;
            case 1:
                Object objD2 = this.f731s.d(new b(interfaceC0416i, 4), cVar);
                return objD2 == p161p9.a.f21156r ? objD2 : y.f19095a;
            case 2:
                Object objD3 = this.f731s.d(new b(interfaceC0416i, 5), cVar);
                return objD3 == p161p9.a.f21156r ? objD3 : y.f19095a;
            case 3:
                Object objD4 = this.f731s.d(new b(interfaceC0416i, 3), cVar);
                return objD4 == p161p9.a.f21156r ? objD4 : y.f19095a;
            case 4:
                Object objD5 = this.f731s.d(new b(interfaceC0416i, 7), cVar);
                return objD5 == p161p9.a.f21156r ? objD5 : y.f19095a;
            case 5:
                Object objD6 = this.f731s.d(new b(interfaceC0416i, 8), cVar);
                return objD6 == p161p9.a.f21156r ? objD6 : y.f19095a;
            case 6:
                Object objD7 = this.f731s.d(new b(interfaceC0416i, 9), cVar);
                return objD7 == p161p9.a.f21156r ? objD7 : y.f19095a;
            case 7:
                Object objD8 = this.f731s.d(new b(interfaceC0416i, 10), cVar);
                return objD8 == p161p9.a.f21156r ? objD8 : y.f19095a;
            case 8:
                Object objD9 = this.f731s.d(new b(interfaceC0416i, 12), cVar);
                return objD9 == p161p9.a.f21156r ? objD9 : y.f19095a;
            case 9:
                Object objD10 = this.f731s.d(new b(interfaceC0416i, 13), cVar);
                return objD10 == p161p9.a.f21156r ? objD10 : y.f19095a;
            case 10:
                if (cVar instanceof C0432z) {
                    c0432z = (C0432z) cVar;
                    int i10 = c0432z.f6268s;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        c0432z.f6268s = i10 - Integer.MIN_VALUE;
                    } else {
                        c0432z = new C0432z(this, cVar);
                    }
                } else {
                    c0432z = new C0432z(this, cVar);
                }
                Object obj2 = c0432z.f6267r;
                int i11 = c0432z.f6268s;
                if (i11 != 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    obj = c0432z.f6270u;
                    try {
                        p110k9.a.e(obj2);
                    } catch (O9.a e11) {
                        e10 = e11;
                        if (e10.f6512r != obj) {
                            throw e10;
                        }
                    }
                    break;
                } else {
                    p110k9.a.e(obj2);
                    Object obj3 = new Object();
                    t tVar = new t();
                    try {
                        InterfaceC0415h interfaceC0415h = this.f731s;
                        H2.i iVar = new H2.i(tVar, interfaceC0416i, obj3);
                        c0432z.f6270u = obj3;
                        c0432z.f6268s = 1;
                        Object objD11 = interfaceC0415h.d(iVar, c0432z);
                        p161p9.a aVar = p161p9.a.f21156r;
                        if (objD11 == aVar) {
                            return aVar;
                        }
                    } catch (O9.a e12) {
                        e10 = e12;
                        obj = obj3;
                        if (e10.f6512r != obj) {
                            throw e10;
                        }
                    }
                }
                return y.f19095a;
            case 11:
                Object objD12 = this.f731s.d(new b(interfaceC0416i, 16), cVar);
                return objD12 == p161p9.a.f21156r ? objD12 : y.f19095a;
            case 12:
                Object objD13 = this.f731s.d(new b(interfaceC0416i, 19), cVar);
                return objD13 == p161p9.a.f21156r ? objD13 : y.f19095a;
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_LIST /* 13 */:
                Object objD14 = this.f731s.d(new b(interfaceC0416i, 21), cVar);
                return objD14 == p161p9.a.f21156r ? objD14 : y.f19095a;
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_LINKING_OBJECTS /* 14 */:
                Object objD15 = this.f731s.d(new b(interfaceC0416i, 23), cVar);
                return objD15 == p161p9.a.f21156r ? objD15 : y.f19095a;
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_OBJECTID /* 15 */:
                Object objD16 = this.f731s.d(new b(interfaceC0416i, 27), cVar);
                return objD16 == p161p9.a.f21156r ? objD16 : y.f19095a;
            default:
                Object objD17 = this.f731s.d(new b(interfaceC0416i, 28), cVar);
                return objD17 == p161p9.a.f21156r ? objD17 : y.f19095a;
        }
    }
}
