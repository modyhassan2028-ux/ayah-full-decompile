package G5;

import K9.InterfaceC0402u;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p110k9.y;
import p120l9.m;
import p120l9.n;
import p124m3.k;

/* JADX INFO: loaded from: classes.dex */
public final class f extends q9.i implements p241y9.e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ p088i3.e f2880r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ p095j3.a f2881s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ j f2882t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ p124m3.d f2883u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f2884v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ boolean f2885w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(p088i3.e eVar, p095j3.a aVar, j jVar, p124m3.d dVar, int i10, boolean z10, p150o9.c cVar) {
        super(2, cVar);
        this.f2880r = eVar;
        this.f2881s = aVar;
        this.f2882t = jVar;
        this.f2883u = dVar;
        this.f2884v = i10;
        this.f2885w = z10;
    }

    @Override // q9.a
    public final p150o9.c create(Object obj, p150o9.c cVar) {
        return new f(this.f2880r, this.f2881s, this.f2882t, this.f2883u, this.f2884v, this.f2885w, cVar);
    }

    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) {
        return ((f) create((InterfaceC0402u) obj, (p150o9.c) obj2)).invokeSuspend(y.f19095a);
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        p095j3.b bVar;
        Object next;
        p050e8.b aVar;
        p095j3.c cVar;
        f fVar = this;
        p110k9.a.e(obj);
        p088i3.e eVar = fVar.f2880r;
        List list = eVar.f16741a;
        int i10 = eVar.f16744d;
        Object obj2 = null;
        p095j3.a aVar2 = fVar.f2881s;
        if (aVar2 == null || (cVar = aVar2.f18751a) == null) {
            bVar = null;
        } else {
            List list2 = fVar.f2882t.f2912n;
            if (list2 == null) {
                p251z9.j.k("quarters");
                throw null;
            }
            bVar = (p095j3.b) m.h0(aVar2.f18754d, cVar.a(list2));
        }
        int i11 = bVar != null ? bVar.f18758b : -1;
        int i12 = bVar != null ? bVar.f18759c : -1;
        List<p124m3.j> listA = fVar.f2883u.a();
        ArrayList arrayList = new ArrayList();
        for (p124m3.j jVar : listA) {
            int i13 = jVar.f19585a;
            boolean z10 = jVar.j % 2 == 0;
            Iterator it = list.iterator();
            do {
                if (!it.hasNext()) {
                    next = obj2;
                    break;
                }
                next = it.next();
            } while (((p077h3.a) next).f16440a != i13);
            p077h3.a aVar3 = (p077h3.a) next;
            List<k> listA2 = jVar.a();
            ArrayList arrayList2 = new ArrayList(n.a0(listA2, 10));
            for (k kVar : listA2) {
                int i14 = jVar.f19585a;
                if (fVar.f2884v == i14 || i10 == i14) {
                    aVar = Y3.f.f10394e;
                } else if (i12 == i13) {
                    aVar = Y3.b.f10390e;
                } else if (i11 == i13) {
                    aVar = Y3.c.f10391e;
                } else if (aVar3 != null) {
                    aVar = new Y3.a(p017b7.g.K(aVar3.f16442c).f5682s);
                } else {
                    aVar = (fVar.f2885w && z10) ? Y3.e.f10393e : Y3.d.f10392e;
                }
                p050e8.b bVar2 = aVar;
                p077h3.a aVar4 = aVar3;
                ArrayList arrayList3 = arrayList2;
                arrayList3.add(new Y3.i(i13, kVar.f19605a, kVar.f19607c, kVar.f19606b, bVar2));
                arrayList2 = arrayList3;
                aVar3 = aVar4;
                fVar = this;
            }
            m.d0(arrayList, arrayList2);
            obj2 = null;
            fVar = this;
        }
        return arrayList;
    }
}
