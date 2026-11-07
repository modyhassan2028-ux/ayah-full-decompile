package p104k1;

import D.C0082z;
import H0.H;
import H0.I;
import H0.InterfaceC0215n;
import H0.J;
import H0.K;
import H0.U;
import H0.X;
import java.util.ArrayList;
import java.util.List;
import p063g1.a;
import p120l9.s;

/* JADX INFO: loaded from: classes.dex */
public final class d implements I {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final d f18907b = new d(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d f18908c = new d(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18909a;

    public /* synthetic */ d(int i10) {
        this.f18909a = i10;
    }

    @Override // H0.I
    public final J a(K k7, List list, long j) {
        switch (this.f18909a) {
            case 0:
                ArrayList arrayList = new ArrayList(list.size());
                int size = list.size();
                int iJ = 0;
                int i10 = 0;
                for (int i11 = 0; i11 < size; i11++) {
                    U uA = ((H) list.get(i11)).a(j);
                    iJ = Math.max(iJ, uA.f3168r);
                    i10 = Math.max(i10, uA.f3169s);
                    arrayList.add(uA);
                }
                if (list.isEmpty()) {
                    iJ = a.j(j);
                    i10 = a.i(j);
                }
                return k7.g0(iJ, i10, s.f19441r, new X(3, arrayList));
            default:
                int size2 = list.size();
                s sVar = s.f19441r;
                if (size2 == 0) {
                    return k7.g0(0, 0, sVar, b.f18900w);
                }
                if (size2 == 1) {
                    U uA2 = ((H) list.get(0)).a(j);
                    return k7.g0(uA2.f3168r, uA2.f3169s, sVar, new C0082z(uA2, 9));
                }
                ArrayList arrayList2 = new ArrayList(list.size());
                int size3 = list.size();
                int iMax = 0;
                int iMax2 = 0;
                for (int i12 = 0; i12 < size3; i12++) {
                    U uA3 = ((H) list.get(i12)).a(j);
                    iMax = Math.max(iMax, uA3.f3168r);
                    iMax2 = Math.max(iMax2, uA3.f3169s);
                    arrayList2.add(uA3);
                }
                return k7.g0(iMax, iMax2, sVar, new X(4, arrayList2));
        }
    }

    @Override // H0.I
    public final /* synthetic */ int b(InterfaceC0215n interfaceC0215n, List list, int i10) {
        int i11 = this.f18909a;
        return p245z2.a.m(this, interfaceC0215n, list, i10);
    }

    @Override // H0.I
    public final /* synthetic */ int c(InterfaceC0215n interfaceC0215n, List list, int i10) {
        int i11 = this.f18909a;
        return p245z2.a.j(this, interfaceC0215n, list, i10);
    }

    @Override // H0.I
    public final /* synthetic */ int e(InterfaceC0215n interfaceC0215n, List list, int i10) {
        int i11 = this.f18909a;
        return p245z2.a.g(this, interfaceC0215n, list, i10);
    }

    @Override // H0.I
    public final /* synthetic */ int i(InterfaceC0215n interfaceC0215n, List list, int i10) {
        int i11 = this.f18909a;
        return p245z2.a.d(this, interfaceC0215n, list, i10);
    }
}
