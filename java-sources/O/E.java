package O;

import H0.InterfaceC0215n;
import H0.X;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class E implements H0.I {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final E f6281a = new E();

    @Override // H0.I
    public final H0.J a(H0.K k7, List list, long j) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int iMax = 0;
        int iMax2 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            H0.U uA = ((H0.H) list.get(i10)).a(j);
            iMax = Math.max(iMax, uA.f3168r);
            iMax2 = Math.max(iMax2, uA.f3169s);
            arrayList.add(uA);
        }
        return k7.g0(iMax, iMax2, p120l9.s.f19441r, new X(2, arrayList));
    }

    @Override // H0.I
    public final /* synthetic */ int b(InterfaceC0215n interfaceC0215n, List list, int i10) {
        return p245z2.a.m(this, interfaceC0215n, list, i10);
    }

    @Override // H0.I
    public final /* synthetic */ int c(InterfaceC0215n interfaceC0215n, List list, int i10) {
        return p245z2.a.j(this, interfaceC0215n, list, i10);
    }

    @Override // H0.I
    public final /* synthetic */ int e(InterfaceC0215n interfaceC0215n, List list, int i10) {
        return p245z2.a.g(this, interfaceC0215n, list, i10);
    }

    @Override // H0.I
    public final /* synthetic */ int i(InterfaceC0215n interfaceC0215n, List list, int i10) {
        return p245z2.a.d(this, interfaceC0215n, list, i10);
    }
}
