package p182s5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p077h3.b;
import p110k9.y;
import p120l9.m;
import p120l9.n;
import p124m3.d;
import p150o9.c;
import p241y9.g;
import q9.i;

/* JADX INFO: loaded from: classes.dex */
public final class a extends i implements g {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public /* synthetic */ int f22135r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public /* synthetic */ List f22136s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public /* synthetic */ List f22137t;

    @Override // p241y9.g
    public final Object i(Object obj, Object obj2, Object obj3, Object obj4) {
        int iIntValue = ((Number) obj).intValue();
        a aVar = new a(4, (c) obj4);
        aVar.f22135r = iIntValue;
        aVar.f22136s = (List) obj2;
        aVar.f22137t = (List) obj3;
        return aVar.invokeSuspend(y.f19095a);
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        int i10 = this.f22135r;
        List<d> list = this.f22136s;
        List list2 = this.f22137t;
        p110k9.a.e(obj);
        d dVar = (d) m.g0(list);
        int i11 = dVar != null ? dVar.f19550b : -1;
        ArrayList arrayList = new ArrayList(n.a0(list, 10));
        for (d dVar2 : list) {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj3 : list2) {
                if (((b) obj3).f16445b == dVar2.f19550b) {
                    arrayList2.add(obj3);
                }
            }
            Iterator it = arrayList2.iterator();
            if (it.hasNext()) {
                Object next = it.next();
                if (it.hasNext()) {
                    long j = ((b) next).f16444a.f16443d;
                    do {
                        Object next2 = it.next();
                        long j10 = ((b) next2).f16444a.f16443d;
                        if (j < j10) {
                            next = next2;
                            j = j10;
                        }
                    } while (it.hasNext());
                }
                obj2 = next;
            } else {
                obj2 = null;
            }
            arrayList.add(new r5.a(dVar2.f19550b, dVar2, (b) obj2));
        }
        return new r5.b(i10, i11, m.v0(arrayList));
    }
}
