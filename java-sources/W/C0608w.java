package W;

import D.InterfaceC0062e;
import D.InterfaceC0064g;
import H0.AbstractC0204c;
import H0.C0214m;
import H0.InterfaceC0215n;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: W.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0608w implements H0.I {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r f9431a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0062e f9432b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0064g f9433c;

    public C0608w(r rVar, InterfaceC0062e interfaceC0062e, InterfaceC0064g interfaceC0064g) {
        this.f9431a = rVar;
        this.f9432b = interfaceC0062e;
        this.f9433c = interfaceC0064g;
    }

    @Override // H0.I
    public final H0.J a(H0.K k7, List list, long j) {
        int iH;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            H0.H h7 = (H0.H) list.get(i10);
            if (p251z9.j.a(androidx.compose.ui.layout.a.a(h7), "navigationIcon")) {
                H0.U uA = h7.a(p063g1.a.a(j, 0, 0, 0, 0, 14));
                int size2 = list.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    H0.H h10 = (H0.H) list.get(i11);
                    if (p251z9.j.a(androidx.compose.ui.layout.a.a(h10), "actionIcons")) {
                        H0.U uA2 = h10.a(p063g1.a.a(j, 0, 0, 0, 0, 14));
                        if (p063g1.a.h(j) == Integer.MAX_VALUE) {
                            iH = p063g1.a.h(j);
                        } else {
                            iH = (p063g1.a.h(j) - uA.f3168r) - uA2.f3168r;
                            if (iH < 0) {
                                iH = 0;
                            }
                        }
                        int i12 = iH;
                        int size3 = list.size();
                        for (int i13 = 0; i13 < size3; i13++) {
                            H0.H h11 = (H0.H) list.get(i13);
                            if (p251z9.j.a(androidx.compose.ui.layout.a.a(h11), "title")) {
                                H0.U uA3 = h11.a(p063g1.a.a(j, 0, i12, 0, 0, 12));
                                C0214m c0214m = AbstractC0204c.f3186b;
                                int iR = uA3.R(c0214m) != Integer.MIN_VALUE ? uA3.R(c0214m) : 0;
                                getClass();
                                int iG = p063g1.a.g(j) == Integer.MAX_VALUE ? p063g1.a.g(j) : p063g1.a.g(j) + (Float.isNaN(0.0f) ? 0 : B9.a.V(0.0f));
                                return k7.g0(p063g1.a.h(j), iG, p120l9.s.f19441r, new C0605v(uA, iG, uA3, this.f9432b, j, uA2, k7, this.f9433c, iR));
                            }
                        }
                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
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
