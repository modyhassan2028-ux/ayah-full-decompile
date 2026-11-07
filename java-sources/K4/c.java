package K4;

import J4.e;
import com.google.android.gms.internal.measurement.AbstractC0813f2;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import p110k9.j;
import p110k9.y;
import p120l9.n;
import p241y9.f;
import q9.i;

/* JADX INFO: loaded from: classes.dex */
public final class c extends i implements f {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f5234r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public /* synthetic */ List f5235s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public /* synthetic */ int f5236t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i10, p150o9.c cVar, int i11) {
        super(i10, cVar);
        this.f5234r = i11;
    }

    @Override // p241y9.f
    public final Object d(Object obj, Object obj2, Object obj3) {
        int i10 = this.f5234r;
        List list = (List) obj;
        int iIntValue = ((Number) obj2).intValue();
        p150o9.c cVar = (p150o9.c) obj3;
        switch (i10) {
            case 0:
                c cVar2 = new c(3, cVar, 0);
                cVar2.f5235s = list;
                cVar2.f5236t = iIntValue;
                return cVar2.invokeSuspend(y.f19095a);
            default:
                c cVar3 = new c(3, cVar, 1);
                cVar3.f5235s = list;
                cVar3.f5236t = iIntValue;
                return cVar3.invokeSuspend(y.f19095a);
        }
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        int iNextIndex;
        int iNextIndex2;
        switch (this.f5234r) {
            case 0:
                List list = this.f5235s;
                int i10 = this.f5236t;
                p110k9.a.e(obj);
                ListIterator listIterator = list.listIterator(list.size());
                while (listIterator.hasPrevious()) {
                    e eVar = (e) listIterator.previous();
                    if ((eVar instanceof J4.c) && ((J4.c) eVar).f4325a.g.c() <= i10) {
                        iNextIndex = listIterator.nextIndex();
                        return AbstractC0813f2.K(new Integer(iNextIndex));
                    }
                }
                iNextIndex = -1;
                return AbstractC0813f2.K(new Integer(iNextIndex));
            default:
                List list2 = this.f5235s;
                int i11 = this.f5236t;
                p110k9.a.e(obj);
                ArrayList arrayList = new ArrayList(n.a0(list2, 10));
                int i12 = 0;
                int i13 = 0;
                for (Object obj2 : list2) {
                    int i14 = i13 + 1;
                    if (i13 < 0) {
                        AbstractC0813f2.T();
                        throw null;
                    }
                    arrayList.add(new j(new Integer(i13), (e) obj2));
                    i13 = i14;
                }
                ArrayList arrayList2 = new ArrayList();
                int size = arrayList.size();
                int i15 = 0;
                while (i15 < size) {
                    Object obj3 = arrayList.get(i15);
                    i15++;
                    e eVar2 = (e) ((j) obj3).f19078s;
                    if ((eVar2 instanceof J4.d) && ((J4.d) eVar2).f4326a.a().f19541b == i11) {
                        arrayList2.add(obj3);
                    }
                }
                ArrayList arrayList3 = new ArrayList(n.a0(arrayList2, 10));
                int size2 = arrayList2.size();
                while (i12 < size2) {
                    Object obj4 = arrayList2.get(i12);
                    i12++;
                    arrayList3.add(new Integer(((Number) ((j) obj4).f19077r).intValue()));
                }
                if (!arrayList3.isEmpty()) {
                    return arrayList3;
                }
                ListIterator listIterator2 = list2.listIterator(list2.size());
                while (listIterator2.hasPrevious()) {
                    e eVar3 = (e) listIterator2.previous();
                    if ((eVar3 instanceof J4.d) && ((J4.d) eVar3).f4326a.a().f19541b <= i11) {
                        iNextIndex2 = listIterator2.nextIndex();
                        return AbstractC0813f2.K(new Integer(iNextIndex2));
                    }
                }
                iNextIndex2 = -1;
                return AbstractC0813f2.K(new Integer(iNextIndex2));
        }
    }
}
