package H0;

import D.C0082z;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class Y extends J0.F {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Y f3180b = new Y("Undefined intrinsics block and it is required");

    @Override // H0.I
    public final J a(K k7, List list, long j) {
        int size = list.size();
        p120l9.s sVar = p120l9.s.f19441r;
        if (size == 0) {
            return k7.g0(p063g1.a.j(j), p063g1.a.i(j), sVar, V.f3174t);
        }
        if (size == 1) {
            U uA = ((H) list.get(0)).a(j);
            return k7.g0(p063g1.b.g(j, uA.f3168r), p063g1.b.f(j, uA.f3169s), sVar, new C0082z(uA, 5));
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size2 = list.size();
        int iMax = 0;
        int iMax2 = 0;
        for (int i10 = 0; i10 < size2; i10++) {
            U uA2 = ((H) list.get(i10)).a(j);
            iMax = Math.max(uA2.f3168r, iMax);
            iMax2 = Math.max(uA2.f3169s, iMax2);
            arrayList.add(uA2);
        }
        return k7.g0(p063g1.b.g(j, iMax), p063g1.b.f(j, iMax2), sVar, new X(0, arrayList));
    }
}
