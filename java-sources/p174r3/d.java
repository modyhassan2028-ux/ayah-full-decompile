package p174r3;

import K9.AbstractC0405x;
import K9.H;
import K9.InterfaceC0402u;
import i6.g;
import p110k9.y;
import p150o9.c;
import p161p9.a;
import p241y9.e;
import q9.i;

/* JADX INFO: loaded from: classes.dex */
public final class d extends i implements e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f21518r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f21519s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ l f21520t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(l lVar, c cVar, int i10) {
        super(2, cVar);
        this.f21518r = i10;
        this.f21520t = lVar;
    }

    @Override // q9.a
    public final c create(Object obj, c cVar) {
        switch (this.f21518r) {
            case 0:
                return new d(this.f21520t, cVar, 0);
            case 1:
                return new d(this.f21520t, cVar, 1);
            case 2:
                return new d(this.f21520t, cVar, 2);
            default:
                return new d(this.f21520t, cVar, 3);
        }
    }

    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f21518r) {
            case 0:
                return ((d) create((InterfaceC0402u) obj, (c) obj2)).invokeSuspend(y.f19095a);
            case 1:
                return ((d) create((g) obj, (c) obj2)).invokeSuspend(y.f19095a);
            case 2:
                return ((d) create((InterfaceC0402u) obj, (c) obj2)).invokeSuspend(y.f19095a);
            default:
                return ((d) create((InterfaceC0402u) obj, (c) obj2)).invokeSuspend(y.f19095a);
        }
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        int i10 = this.f21518r;
        int i11 = 2;
        y yVar = y.f19095a;
        l lVar = this.f21520t;
        a aVar = a.f21156r;
        switch (i10) {
            case 0:
                int i12 = this.f21519s;
                if (i12 == 0) {
                    p110k9.a.e(obj);
                    this.f21519s = 1;
                    return lVar.g(this) == aVar ? aVar : yVar;
                }
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p110k9.a.e(obj);
                return yVar;
            case 1:
                int i13 = this.f21519s;
                if (i13 == 0) {
                    p110k9.a.e(obj);
                    this.f21519s = 1;
                    return lVar.g(this) == aVar ? aVar : yVar;
                }
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p110k9.a.e(obj);
                return yVar;
            case 2:
                int i14 = this.f21519s;
                if (i14 == 0) {
                    p110k9.a.e(obj);
                    this.f21519s = 1;
                    if (lVar.f21547b.b(this) != aVar) {
                    }
                    return aVar;
                }
                if (i14 != 1) {
                    if (i14 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p110k9.a.e(obj);
                    return yVar;
                }
                p110k9.a.e(obj);
                this.f21519s = 2;
                if (l.a(lVar, this) != aVar) {
                    return yVar;
                }
                return aVar;
            default:
                int i15 = this.f21519s;
                if (i15 != 0) {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p110k9.a.e(obj);
                    return yVar;
                }
                p110k9.a.e(obj);
                R9.e eVar = H.f5322a;
                R9.d dVar = R9.d.f7436t;
                d dVar2 = new d(lVar, null, i11);
                this.f21519s = 1;
                return AbstractC0405x.I(dVar, dVar2, this) == aVar ? aVar : yVar;
        }
    }
}
