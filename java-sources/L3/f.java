package L3;

import java.util.Iterator;
import java.util.List;
import p110k9.y;
import p120l9.m;
import p207v2.AbstractC1367e;
import p207v2.C1368f;
import p207v2.EnumC1375m;
import p251z9.j;
import q9.i;

/* JADX INFO: loaded from: classes.dex */
public final class f extends i implements p241y9.f {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f5507r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f5508s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f5509t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f5510u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(Object obj, p150o9.c cVar, int i10) {
        super(3, cVar);
        this.f5507r = i10;
        this.f5510u = obj;
    }

    @Override // p241y9.f
    public final Object d(Object obj, Object obj2, Object obj3) {
        switch (this.f5507r) {
            case 0:
                f fVar = new f((g) this.f5510u, (p150o9.c) obj3, 0);
                fVar.f5508s = (List) obj;
                fVar.f5509t = (List) obj2;
                return fVar.invokeSuspend(y.f19095a);
            default:
                f fVar2 = new f((EnumC1375m) this.f5510u, (p150o9.c) obj3, 1);
                fVar2.f5508s = (C1368f) obj;
                fVar2.f5509t = (C1368f) obj2;
                return fVar2.invokeSuspend(y.f19095a);
        }
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        boolean zA;
        switch (this.f5507r) {
            case 0:
                List list = (List) this.f5508s;
                List list2 = (List) this.f5509t;
                p110k9.a.e(obj);
                List listP0 = m.p0(list2, m.G0(list));
                g gVar = (g) this.f5510u;
                Iterator it = listP0.iterator();
                while (it.hasNext()) {
                    g.a(gVar, (k3.b) it.next());
                }
                return list2;
            default:
                p110k9.a.e(obj);
                C1368f c1368f = (C1368f) this.f5508s;
                C1368f c1368f2 = (C1368f) this.f5509t;
                EnumC1375m enumC1375m = (EnumC1375m) this.f5510u;
                j.e(c1368f2, "<this>");
                j.e(c1368f, "previous");
                int i10 = c1368f2.f23230a;
                int i11 = c1368f.f23230a;
                if (i10 > i11) {
                    zA = true;
                } else {
                    zA = i10 < i11 ? false : AbstractC1367e.a(c1368f2.f23231b, c1368f.f23231b, enumC1375m);
                }
                return zA ? c1368f2 : c1368f;
        }
    }
}
