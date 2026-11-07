package Z;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: Z.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0700p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Z f10752a = new Z("provider");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Z f10753b = new Z("provider");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Z f10754c = new Z("compositionLocalMap");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Z f10755d = new Z("providers");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Z f10756e = new Z("reference");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final F1.b f10757f = new F1.b(4);

    public static final void a(int i10, int i11, List list) {
        int iF = f(i10, list);
        if (iF < 0) {
            iF = -(iF + 1);
        }
        while (iF < list.size() && ((L) list.get(iF)).f10621b < i11) {
            list.remove(iF);
        }
    }

    public static final void b(w0 w0Var, ArrayList arrayList, int i10) {
        boolean zI = w0Var.i(i10);
        int[] iArr = w0Var.f10840b;
        if (zI) {
            arrayList.add(w0Var.k(i10));
            return;
        }
        int i11 = iArr[(i10 * 5) + 3] + i10;
        for (int i12 = i10 + 1; i12 < i11; i12 += iArr[(i12 * 5) + 3]) {
            b(w0Var, arrayList, i12);
        }
    }

    public static final void c(String str) {
        throw new C0688j(p245z2.a.D("Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (", str, "). Please report to Google or use https://goo.gle/compose-feedback"));
    }

    public static final Void d(String str) {
        throw new C0688j(p245z2.a.D("Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (", str, "). Please report to Google or use https://goo.gle/compose-feedback"));
    }

    public static final void e(A0 a9, E6.h hVar) {
        int iO;
        int[] iArr = a9.f10561b;
        int i10 = a9.f10577t;
        int iF = a9.f(iArr, a9.q(a9.s(i10) + i10));
        for (int iF2 = a9.f(a9.f10561b, a9.q(a9.f10577t)); iF2 < iF; iF2++) {
            Object obj = a9.f10562c[a9.g(iF2)];
            int iC = -1;
            if (obj instanceof InterfaceC0686i) {
                hVar.f((InterfaceC0686i) obj, a9.o() - iF2, -1, -1);
            } else if (obj instanceof u0) {
                u0 u0Var = (u0) obj;
                if (!(u0Var.f10830a instanceof C0692l)) {
                    h(a9, iF2, obj);
                    int iO2 = a9.o() - iF2;
                    C0670a c0670a = u0Var.f10831b;
                    if (c0670a == null || !c0670a.a()) {
                        iO = -1;
                    } else {
                        iC = a9.c(c0670a);
                        iO = a9.o() - a9.M(iC);
                    }
                    hVar.f(u0Var, iO2, iC, iO);
                }
            } else if (obj instanceof C0699o0) {
                h(a9, iF2, obj);
                ((C0699o0) obj).d();
            }
        }
    }

    public static final int f(int i10, List list) {
        int size = list.size() - 1;
        int i11 = 0;
        while (i11 <= size) {
            int i12 = (i11 + size) >>> 1;
            int iF = p251z9.j.f(((L) list.get(i12)).f10621b, i10);
            if (iF < 0) {
                i11 = i12 + 1;
            } else {
                if (iF <= 0) {
                    return i12;
                }
                size = i12 - 1;
            }
        }
        return -(i11 + 1);
    }

    public static final void g(A0 a9, E6.h hVar) {
        int iO;
        int[] iArr = a9.f10561b;
        int i10 = a9.f10577t;
        int iF = a9.f(iArr, a9.q(a9.s(i10) + i10));
        for (int iF2 = a9.f(a9.f10561b, a9.q(a9.f10577t)); iF2 < iF; iF2++) {
            Object obj = a9.f10562c[a9.g(iF2)];
            int iC = -1;
            if (obj instanceof InterfaceC0686i) {
                int iO2 = a9.o() - iF2;
                Object obj2 = (InterfaceC0686i) obj;
                u.F f3 = (u.F) hVar.f1926f;
                if (f3 == null) {
                    int i11 = u.N.f22700a;
                    f3 = new u.F();
                    hVar.f1926f = f3;
                }
                f3.j(obj2);
                hVar.f(obj2, iO2, -1, -1);
            }
            if (obj instanceof u0) {
                int iO3 = a9.o() - iF2;
                u0 u0Var = (u0) obj;
                C0670a c0670a = u0Var.f10831b;
                if (c0670a == null || !c0670a.a()) {
                    iO = -1;
                } else {
                    iC = a9.c(c0670a);
                    iO = a9.o() - a9.M(iC);
                }
                hVar.f(u0Var, iO3, iC, iO);
            }
            if (obj instanceof C0699o0) {
                ((C0699o0) obj).d();
            }
        }
        a9.F();
    }

    public static final void h(A0 a9, int i10, Object obj) {
        int iG = a9.g(i10);
        Object[] objArr = a9.f10562c;
        Object obj2 = objArr[iG];
        objArr[iG] = C0690k.f10683a;
        if (obj == obj2) {
            return;
        }
        c("Slot table is out of sync (expected " + obj + ", got " + obj2 + ')');
    }
}
