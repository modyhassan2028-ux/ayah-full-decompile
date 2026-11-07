package W;

import H0.InterfaceC0215n;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: W.g2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0562g2 implements H0.I {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ float f9138a;

    public C0562g2(float f3) {
        this.f9138a = f3;
    }

    @Override // H0.I
    public final H0.J a(H0.K k7, List list, long j) {
        E0 e10;
        E0 e11;
        Object obj;
        Object obj2;
        float fW = k7.w(this.f9138a);
        int i10 = 0;
        long jA = p063g1.a.a(j, 0, 0, 0, 0, 10);
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int i11 = 0;
        while (true) {
            e10 = E0.f8524s;
            e11 = E0.f8523r;
            if (i11 >= size) {
                break;
            }
            Object obj3 = list.get(i11);
            H0.H h7 = (H0.H) obj3;
            if (androidx.compose.ui.layout.a.a(h7) != e11 && androidx.compose.ui.layout.a.a(h7) != e10) {
                arrayList.add(obj3);
            }
            i11++;
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i12 = 0; i12 < size2; i12++) {
            arrayList2.add(((H0.H) arrayList.get(i12)).a(jA));
        }
        int size3 = list.size();
        int i13 = 0;
        while (true) {
            if (i13 >= size3) {
                obj = null;
                break;
            }
            obj = list.get(i13);
            if (androidx.compose.ui.layout.a.a((H0.H) obj) == e11) {
                break;
            }
            i13++;
        }
        H0.H h10 = (H0.H) obj;
        int size4 = list.size();
        while (true) {
            if (i10 >= size4) {
                obj2 = null;
                break;
            }
            obj2 = list.get(i10);
            if (androidx.compose.ui.layout.a.a((H0.H) obj2) == e10) {
                break;
            }
            i10++;
        }
        H0.H h11 = (H0.H) obj2;
        return k7.g0(p063g1.a.j(j), p063g1.a.i(j), p120l9.s.f19441r, new C0558f2(h10 != null ? h10.a(jA) : null, arrayList2, h11 != null ? h11.a(jA) : null, j, fW, 6.2831855f / arrayList2.size()));
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
