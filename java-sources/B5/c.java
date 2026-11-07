package B5;

import E2.AbstractC0114c;
import p007a6.i;
import p251z9.j;
import va.g;

/* JADX INFO: loaded from: classes.dex */
public final class c extends AbstractC0114c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f631d;

    public /* synthetic */ c(int i10) {
        this.f631d = i10;
    }

    @Override // E2.AbstractC0114c
    public final boolean b(Object obj, Object obj2) {
        switch (this.f631d) {
            case 0:
                return ((C5.c) obj).equals((C5.c) obj2);
            default:
                return ((i) obj).equals((i) obj2);
        }
    }

    @Override // E2.AbstractC0114c
    public final boolean d(Object obj, Object obj2) {
        switch (this.f631d) {
            case 0:
                C5.c cVar = (C5.c) obj;
                C5.c cVar2 = (C5.c) obj2;
                if (cVar instanceof C5.a) {
                    if (cVar2 instanceof C5.a) {
                        return ((C5.a) cVar).f756a.equals(((C5.a) cVar2).f756a);
                    }
                } else {
                    if (!(cVar instanceof C5.b)) {
                        throw new A6.a();
                    }
                    if (cVar2 instanceof C5.b) {
                        return j.a(((C5.b) cVar).f757a.f13685a, ((C5.b) cVar2).f757a.f13685a);
                    }
                }
                return false;
            default:
                return j.a(((i) obj).a(), ((i) obj2).a());
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0033  */
    /* JADX WARN: Code duplicated, block: B:22:0x0043  */
    @Override // E2.AbstractC0114c
    public final Object j(Object obj, Object obj2) {
        C5.e eVar;
        C5.e eVar2;
        switch (this.f631d) {
            case 0:
                C5.c cVar = (C5.c) obj;
                C5.c cVar2 = (C5.c) obj2;
                if (cVar instanceof C5.b) {
                    g gVar = ((C5.b) cVar).f759c;
                    if (gVar instanceof C5.e) {
                        eVar = (C5.e) gVar;
                    } else {
                        eVar = null;
                    }
                } else {
                    eVar = null;
                }
                if (cVar2 instanceof C5.b) {
                    g gVar2 = ((C5.b) cVar2).f759c;
                    if (gVar2 instanceof C5.e) {
                        eVar2 = (C5.e) gVar2;
                    } else {
                        eVar2 = null;
                    }
                } else {
                    eVar2 = null;
                }
                if (eVar == null || eVar2 == null) {
                    return null;
                }
                return Integer.valueOf(eVar2.f761c);
            default:
                i iVar = (i) obj2;
                if (!(((i) obj) instanceof p007a6.c) || !(iVar instanceof p007a6.c)) {
                    return null;
                }
                p007a6.c cVar3 = (p007a6.c) iVar;
                return new Z5.a(cVar3.f11209c, cVar3.f11210d);
        }
    }
}
