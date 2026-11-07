package K;

import A.C0007a;
import H0.InterfaceC0215n;
import W.C0587o1;
import W.C0604u1;
import W.EnumC0572j1;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class Y implements H0.I {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4579a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f4580b;

    public /* synthetic */ Y(int i10, Object obj) {
        this.f4579a = i10;
        this.f4580b = obj;
    }

    @Override // H0.I
    public final H0.J a(H0.K k7, List list, long j) {
        switch (this.f4579a) {
            case 0:
                return k7.g0(p063g1.a.h(j), p063g1.a.g(j), p120l9.s.f19441r, new C0007a(10, list, this));
            default:
                C0604u1 c0604u1 = (C0604u1) this.f4580b;
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    H0.H h7 = (H0.H) list.get(i10);
                    if (androidx.compose.ui.layout.a.a(h7) == EnumC0572j1.f9191r) {
                        H0.U uA = h7.a(j);
                        int size2 = list.size();
                        for (int i11 = 0; i11 < size2; i11++) {
                            H0.H h10 = (H0.H) list.get(i11);
                            if (androidx.compose.ui.layout.a.a(h10) == EnumC0572j1.f9192s) {
                                H0.U uA2 = h10.a(p063g1.a.a(p063g1.b.j(j, -uA.f3168r, 0, 2), 0, 0, 0, 0, 11));
                                int i12 = uA.f3168r + uA2.f3168r;
                                int iMax = Math.max(uA2.f3169s, uA.f3169s);
                                c0604u1.f9409z.h(uA2.f3169s);
                                c0604u1.f9407x.h(i12);
                                int i13 = uA.f3168r / 2;
                                float f3 = uA2.f3168r;
                                E9.a aVar = c0604u1.f9403t;
                                float f7 = aVar.f1993a;
                                float f10 = aVar.f1994b;
                                float fK = B0.c.k(c0604u1.f9404u.g(), f7, f10);
                                float f11 = f10 - f7;
                                return k7.g0(i12, iMax, p120l9.s.f19441r, new C0587o1(uA2, i13, (iMax - uA2.f3169s) / 2, uA, B9.a.V(B0.c.k(f11 == 0.0f ? 0.0f : (fK - f7) / f11, 0.0f, 1.0f) * f3), (iMax - uA.f3169s) / 2));
                            }
                        }
                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
    }

    @Override // H0.I
    public final /* synthetic */ int b(InterfaceC0215n interfaceC0215n, List list, int i10) {
        int i11 = this.f4579a;
        return p245z2.a.m(this, interfaceC0215n, list, i10);
    }

    @Override // H0.I
    public final /* synthetic */ int c(InterfaceC0215n interfaceC0215n, List list, int i10) {
        int i11 = this.f4579a;
        return p245z2.a.j(this, interfaceC0215n, list, i10);
    }

    @Override // H0.I
    public final /* synthetic */ int e(InterfaceC0215n interfaceC0215n, List list, int i10) {
        int i11 = this.f4579a;
        return p245z2.a.g(this, interfaceC0215n, list, i10);
    }

    @Override // H0.I
    public final /* synthetic */ int i(InterfaceC0215n interfaceC0215n, List list, int i10) {
        int i11 = this.f4579a;
        return p245z2.a.d(this, interfaceC0215n, list, i10);
    }
}
