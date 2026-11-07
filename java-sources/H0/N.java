package H0;

import J0.AbstractC0283f;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class N implements I {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final W.H f3162a;

    public N(W.H h7) {
        this.f3162a = h7;
    }

    @Override // H0.I
    public final J a(K k7, List list, long j) {
        return this.f3162a.a(k7, AbstractC0283f.k(k7), j);
    }

    @Override // H0.I
    public final int b(InterfaceC0215n interfaceC0215n, List list, int i10) {
        ArrayList arrayListK = AbstractC0283f.k(interfaceC0215n);
        W.H h7 = this.f3162a;
        h7.getClass();
        ArrayList arrayList = new ArrayList(arrayListK.size());
        int size = arrayListK.size();
        for (int i11 = 0; i11 < size; i11++) {
            List list2 = (List) arrayListK.get(i11);
            ArrayList arrayList2 = new ArrayList(list2.size());
            int size2 = list2.size();
            for (int i12 = 0; i12 < size2; i12++) {
                arrayList2.add(new C0212k((H) list2.get(i12), EnumC0216o.f3210r, EnumC0217p.f3213r, 0));
            }
            arrayList.add(arrayList2);
        }
        return h7.a(new r(interfaceC0215n, interfaceC0215n.getLayoutDirection()), arrayList, p063g1.b.b(0, i10, 7)).b();
    }

    @Override // H0.I
    public final int c(InterfaceC0215n interfaceC0215n, List list, int i10) {
        ArrayList arrayListK = AbstractC0283f.k(interfaceC0215n);
        W.H h7 = this.f3162a;
        h7.getClass();
        ArrayList arrayList = new ArrayList(arrayListK.size());
        int size = arrayListK.size();
        for (int i11 = 0; i11 < size; i11++) {
            List list2 = (List) arrayListK.get(i11);
            ArrayList arrayList2 = new ArrayList(list2.size());
            int size2 = list2.size();
            for (int i12 = 0; i12 < size2; i12++) {
                arrayList2.add(new C0212k((H) list2.get(i12), EnumC0216o.f3210r, EnumC0217p.f3214s, 0));
            }
            arrayList.add(arrayList2);
        }
        return h7.a(new r(interfaceC0215n, interfaceC0215n.getLayoutDirection()), arrayList, p063g1.b.b(i10, 0, 13)).a();
    }

    @Override // H0.I
    public final int e(InterfaceC0215n interfaceC0215n, List list, int i10) {
        ArrayList arrayListK = AbstractC0283f.k(interfaceC0215n);
        W.H h7 = this.f3162a;
        h7.getClass();
        ArrayList arrayList = new ArrayList(arrayListK.size());
        int size = arrayListK.size();
        for (int i11 = 0; i11 < size; i11++) {
            List list2 = (List) arrayListK.get(i11);
            ArrayList arrayList2 = new ArrayList(list2.size());
            int size2 = list2.size();
            for (int i12 = 0; i12 < size2; i12++) {
                arrayList2.add(new C0212k((H) list2.get(i12), EnumC0216o.f3211s, EnumC0217p.f3213r, 0));
            }
            arrayList.add(arrayList2);
        }
        return h7.a(new r(interfaceC0215n, interfaceC0215n.getLayoutDirection()), arrayList, p063g1.b.b(0, i10, 7)).b();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof N) && p251z9.j.a(this.f3162a, ((N) obj).f3162a);
    }

    public final int hashCode() {
        return this.f3162a.hashCode();
    }

    @Override // H0.I
    public final int i(InterfaceC0215n interfaceC0215n, List list, int i10) {
        ArrayList arrayListK = AbstractC0283f.k(interfaceC0215n);
        W.H h7 = this.f3162a;
        h7.getClass();
        ArrayList arrayList = new ArrayList(arrayListK.size());
        int size = arrayListK.size();
        for (int i11 = 0; i11 < size; i11++) {
            List list2 = (List) arrayListK.get(i11);
            ArrayList arrayList2 = new ArrayList(list2.size());
            int size2 = list2.size();
            for (int i12 = 0; i12 < size2; i12++) {
                arrayList2.add(new C0212k((H) list2.get(i12), EnumC0216o.f3211s, EnumC0217p.f3214s, 0));
            }
            arrayList.add(arrayList2);
        }
        return h7.a(new r(interfaceC0215n, interfaceC0215n.getLayoutDirection()), arrayList, p063g1.b.b(i10, 0, 13)).a();
    }

    public final String toString() {
        return "MultiContentMeasurePolicyImpl(measurePolicy=" + this.f3162a + ')';
    }
}
