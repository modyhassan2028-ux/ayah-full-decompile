package W;

import com.google.android.gms.internal.measurement.AbstractC0813f2;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class H {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0561g1 f8570a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p241y9.a f8571b;

    public H(C0561g1 c0561g1, p241y9.a aVar) {
        this.f8570a = c0561g1;
        this.f8571b = aVar;
    }

    public final H0.J a(H0.K k7, ArrayList arrayList, long j) {
        Integer numValueOf;
        List list = (List) arrayList.get(0);
        int i10 = 1;
        List list2 = (List) arrayList.get(1);
        List list3 = (List) arrayList.get(2);
        List list4 = (List) arrayList.get(3);
        int iH = p063g1.a.h(j);
        int iG = p063g1.a.g(j);
        long jA = p063g1.a.a(j, 0, 0, 0, 0, 10);
        ArrayList arrayList2 = new ArrayList(list3.size());
        int size = list3.size();
        for (int i11 = 0; i11 < size; i11++) {
            arrayList2.add(((H0.H) list3.get(i11)).a(jA));
        }
        ArrayList arrayList3 = new ArrayList(list.size());
        int size2 = list.size();
        for (int i12 = 0; i12 < size2; i12++) {
            arrayList3.add(((H0.H) list.get(i12)).a(jA));
        }
        if (!arrayList3.isEmpty()) {
            numValueOf = Integer.valueOf(((H0.U) arrayList3.get(0)).f3169s);
            int iE = AbstractC0813f2.E(arrayList3);
            if (1 <= iE) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(((H0.U) arrayList3.get(i10)).f3169s);
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i10 == iE) {
                        break;
                    }
                    i10++;
                }
            }
        } else {
            numValueOf = null;
        }
        int iIntValue = numValueOf != null ? numValueOf.intValue() : 0;
        long jA2 = p063g1.a.a(jA, 0, 0, 0, iG - iIntValue, 7);
        ArrayList arrayList4 = new ArrayList(list2.size());
        int size3 = list2.size();
        for (int i13 = 0; i13 < size3; i13++) {
            arrayList4.add(((H0.H) list2.get(i13)).a(jA2));
        }
        ArrayList arrayList5 = new ArrayList(list4.size());
        int size4 = list4.size();
        for (int i14 = 0; i14 < size4; i14++) {
            arrayList5.add(((H0.H) list4.get(i14)).a(jA));
        }
        return k7.g0(iH, iG, p120l9.s.f19441r, new G(arrayList2, iH, arrayList5, this.f8570a, this.f8571b, iG, arrayList4, arrayList3, iIntValue));
    }
}
