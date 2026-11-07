package p035d3;

import D3.b;
import J3.x;
import K9.AbstractC0405x;
import K9.H;
import K9.InterfaceC0402u;
import N9.AbstractC0419l;
import N9.InterfaceC0415h;
import R9.d;
import com.ayah.AyahApplication;
import com.ayah.dao.realm.factory.RealmUtils;
import p110k9.y;
import p150o9.c;
import p161p9.a;
import p241y9.e;
import p251z9.j;
import q9.i;

/* JADX INFO: renamed from: d3.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0922d extends i implements e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f15600r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f15601s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ AyahApplication f15602t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0922d(AyahApplication ayahApplication, c cVar, int i10) {
        super(2, cVar);
        this.f15600r = i10;
        this.f15602t = ayahApplication;
    }

    @Override // q9.a
    public final c create(Object obj, c cVar) {
        switch (this.f15600r) {
            case 0:
                return new C0922d(this.f15602t, cVar, 0);
            case 1:
                return new C0922d(this.f15602t, cVar, 1);
            case 2:
                return new C0922d(this.f15602t, cVar, 2);
            case 3:
                return new C0922d(this.f15602t, cVar, 3);
            case 4:
                return new C0922d(this.f15602t, cVar, 4);
            case 5:
                return new C0922d(this.f15602t, cVar, 5);
            default:
                return new C0922d(this.f15602t, cVar, 6);
        }
    }

    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC0402u interfaceC0402u = (InterfaceC0402u) obj;
        c cVar = (c) obj2;
        switch (this.f15600r) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
        }
        return ((C0922d) create(interfaceC0402u, cVar)).invokeSuspend(y.f19095a);
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        int i10 = this.f15600r;
        c cVar = null;
        y yVar = y.f19095a;
        AyahApplication ayahApplication = this.f15602t;
        a aVar = a.f21156r;
        switch (i10) {
            case 0:
                int i11 = this.f15601s;
                if (i11 != 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p110k9.a.e(obj);
                    return yVar;
                }
                p110k9.a.e(obj);
                x xVar = ayahApplication.f13609y;
                if (xVar == null) {
                    j.k("preferencesStore");
                    throw null;
                }
                InterfaceC0415h interfaceC0415h = xVar.g;
                this.f15601s = 1;
                return AbstractC0419l.p(interfaceC0415h, this) == aVar ? aVar : yVar;
            case 1:
                int i12 = this.f15601s;
                if (i12 != 0) {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p110k9.a.e(obj);
                    return yVar;
                }
                p110k9.a.e(obj);
                R9.e eVar = H.f5322a;
                d dVar = d.f7436t;
                C0922d c0922d = new C0922d(ayahApplication, cVar, 0);
                this.f15601s = 1;
                return AbstractC0405x.I(dVar, c0922d, this) == aVar ? aVar : yVar;
            case 2:
                int i13 = this.f15601s;
                if (i13 != 0) {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p110k9.a.e(obj);
                    return yVar;
                }
                p110k9.a.e(obj);
                RealmUtils realmUtils = RealmUtils.INSTANCE;
                this.f15601s = 1;
                return realmUtils.clearRealmsForV18(ayahApplication, this) == aVar ? aVar : yVar;
            case 3:
                int i14 = this.f15601s;
                if (i14 != 0) {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p110k9.a.e(obj);
                    return yVar;
                }
                p110k9.a.e(obj);
                RealmUtils realmUtils2 = RealmUtils.INSTANCE;
                this.f15601s = 1;
                return realmUtils2.clearRealmsForV22(ayahApplication, this) == aVar ? aVar : yVar;
            case 4:
                int i15 = this.f15601s;
                if (i15 != 0) {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p110k9.a.e(obj);
                    return yVar;
                }
                p110k9.a.e(obj);
                p074h0.i iVar = ayahApplication.f13607w;
                if (iVar != null) {
                    this.f15601s = 1;
                    return iVar.g(this) == aVar ? aVar : yVar;
                }
                j.k("bookCleanup");
                throw null;
            case 5:
                int i16 = this.f15601s;
                if (i16 != 0) {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p110k9.a.e(obj);
                    return obj;
                }
                p110k9.a.e(obj);
                x xVar2 = ayahApplication.f13609y;
                if (xVar2 == null) {
                    j.k("preferencesStore");
                    throw null;
                }
                InterfaceC0415h interfaceC0415h2 = xVar2.f4308b;
                this.f15601s = 1;
                Object objP = AbstractC0419l.p(interfaceC0415h2, this);
                return objP == aVar ? aVar : objP;
            default:
                int i17 = this.f15601s;
                if (i17 != 0) {
                    if (i17 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p110k9.a.e(obj);
                    return yVar;
                }
                p110k9.a.e(obj);
                R9.e eVar2 = H.f5322a;
                d dVar2 = d.f7436t;
                b bVar = new b(ayahApplication, cVar, 5);
                this.f15601s = 1;
                return AbstractC0405x.I(dVar2, bVar, this) == aVar ? aVar : yVar;
        }
    }
}
