package p245z2;

import A.X0;
import Ca.j;
import Ca.n;
import Da.h;
import Da.k;
import F.A;
import F.C0153b;
import F.o;
import F.s;
import H0.C0212k;
import H0.EnumC0216o;
import H0.EnumC0217p;
import H0.H;
import H0.InterfaceC0215n;
import H0.InterfaceC0221u;
import H0.L;
import H0.M;
import I0.d;
import I0.f;
import J0.AbstractC0283f;
import J0.AbstractC0291n;
import J0.C0280d0;
import J0.I;
import J0.InterfaceC0302z;
import J0.P;
import J0.g0;
import J0.l0;
import J0.m0;
import J0.q0;
import J0.r0;
import J0.z0;
import K0.C0374v0;
import K0.Q0;
import Z.C0672b;
import Z.C0675c0;
import Z.C0681f0;
import android.view.View;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.lazy.layout.LazyLayoutAnimateItemElement;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.platform.DrawChildContainer;
import androidx.compose.ui.platform.ViewLayer;
import androidx.compose.ui.platform.ViewLayerContainer;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l0.q;
import l0.r;
import p011b0.e;
import p017b7.g;
import p063g1.b;
import p223x.AbstractC1413d;
import p223x.C1408a0;
import p248z6.c;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class a {
    public static String A(char c10, String str, String str2) {
        return str + str2 + c10;
    }

    public static String B(int i10, String str, String str2) {
        return str + i10 + str2;
    }

    public static String C(RecyclerView recyclerView, StringBuilder sb) {
        sb.append(recyclerView.C());
        return sb.toString();
    }

    public static String D(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static String E(StringBuilder sb, int i10, String str) {
        sb.append(i10);
        sb.append(str);
        return sb.toString();
    }

    public static String F(StringBuilder sb, String str, char c10) {
        sb.append(str);
        sb.append(c10);
        return sb.toString();
    }

    public static void G(int i10, int i11, int i12, int i13, int i14) {
        g.C(i10);
        g.C(i11);
        g.C(i12);
        g.C(i13);
        g.C(i14);
    }

    public static /* synthetic */ void H(Object obj) {
        if (obj != null) {
            throw new ClassCastException();
        }
    }

    public static void I(StringBuilder sb, String str, String str2, String str3, String str4) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
    }

    public static r J(r rVar) {
        if (1.0f <= 0.0d) {
            E.a.a("invalid weight; must be greater than zero");
        }
        return rVar.b(new LayoutWeightElement(1.0f, true));
    }

    public static j a(n nVar, String str, long j) {
        return new j(str, 0, j, new c(2, nVar), false, null, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12, types: [l0.q] */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15, types: [l0.q] */
    /* JADX WARN: Type inference failed for: r1v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [b0.e] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [b0.e] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r8v0, types: [I0.d, J0.m] */
    /* JADX WARN: Type inference failed for: r8v3, types: [y9.a, z9.k] */
    public static Object b(d dVar, f fVar) {
        C0280d0 c0280d0;
        q qVar = (q) dVar;
        if (!qVar.f19339r.f19338E) {
            G0.a.a("ModifierLocal accessed from an unattached node");
        }
        if (!qVar.f19339r.f19338E) {
            G0.a.b("visitAncestors called on an unattached node");
        }
        q qVar2 = qVar.f19339r.f19343v;
        I iX = AbstractC0283f.x(dVar);
        while (iX != null) {
            if ((((q) iX.f3914W.f4067f).f19342u & 32) != 0) {
                while (qVar2 != null) {
                    if ((qVar2.f19341t & 32) != 0) {
                        ?? F10 = qVar2;
                        ?? eVar = 0;
                        while (F10 != 0) {
                            if (F10 instanceof d) {
                                d dVar2 = (d) F10;
                                if (dVar2.j().q(fVar)) {
                                    return dVar2.j().D(fVar);
                                }
                            } else if ((F10.f19341t & 32) != 0 && (F10 instanceof AbstractC0291n)) {
                                q qVar3 = ((AbstractC0291n) F10).f4151G;
                                int i10 = 0;
                                F10 = F10;
                                eVar = eVar;
                                while (qVar3 != null) {
                                    if ((qVar3.f19341t & 32) != 0) {
                                        i10++;
                                        if (i10 == 1) {
                                            eVar = eVar;
                                            F10 = qVar3;
                                        } else {
                                            if (eVar == 0) {
                                                eVar = new e(new q[16]);
                                            }
                                            if (F10 != 0) {
                                                eVar.b(F10);
                                                F10 = 0;
                                            }
                                            eVar.b(qVar3);
                                        }
                                    }
                                    qVar3 = qVar3.f19344w;
                                    F10 = F10;
                                    eVar = eVar;
                                }
                                if (i10 == 1) {
                                }
                            }
                            F10 = AbstractC0283f.f(eVar);
                        }
                    }
                    qVar2 = qVar2.f19343v;
                }
            }
            iX = iX.u();
            qVar2 = (iX == null || (c0280d0 = iX.f3914W) == null) ? null : (z0) c0280d0.f4066e;
        }
        return fVar.f3661a.invoke();
    }

    public static int c(InterfaceC0221u interfaceC0221u, P p10, H h7, int i10) {
        return interfaceC0221u.e(new H0.r(p10, p10.getLayoutDirection()), new C0212k(h7, L.f3157s, M.f3160s, 1), b.b(i10, 0, 13)).a();
    }

    public static int d(H0.I i10, InterfaceC0215n interfaceC0215n, List list, int i11) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i12 = 0; i12 < size; i12++) {
            arrayList.add(new C0212k((H) list.get(i12), EnumC0216o.f3211s, EnumC0217p.f3214s, 0));
        }
        return i10.a(new H0.r(interfaceC0215n, interfaceC0215n.getLayoutDirection()), arrayList, b.b(i11, 0, 13)).a();
    }

    public static int e(InterfaceC0302z interfaceC0302z, InterfaceC0215n interfaceC0215n, H h7, int i10) {
        return interfaceC0302z.e(new H0.r(interfaceC0215n, interfaceC0215n.getLayoutDirection()), new C0212k(h7, l0.f4145s, m0.f4148s, 2), b.b(i10, 0, 13)).a();
    }

    public static int f(InterfaceC0221u interfaceC0221u, P p10, H h7, int i10) {
        return interfaceC0221u.e(new H0.r(p10, p10.getLayoutDirection()), new C0212k(h7, L.f3157s, M.f3159r, 1), b.b(0, i10, 7)).b();
    }

    public static int g(H0.I i10, InterfaceC0215n interfaceC0215n, List list, int i11) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i12 = 0; i12 < size; i12++) {
            arrayList.add(new C0212k((H) list.get(i12), EnumC0216o.f3211s, EnumC0217p.f3213r, 0));
        }
        return i10.a(new H0.r(interfaceC0215n, interfaceC0215n.getLayoutDirection()), arrayList, b.b(0, i11, 7)).b();
    }

    public static int h(InterfaceC0302z interfaceC0302z, InterfaceC0215n interfaceC0215n, H h7, int i10) {
        return interfaceC0302z.e(new H0.r(interfaceC0215n, interfaceC0215n.getLayoutDirection()), new C0212k(h7, l0.f4145s, m0.f4147r, 2), b.b(0, i10, 7)).b();
    }

    public static int i(InterfaceC0221u interfaceC0221u, P p10, H h7, int i10) {
        return interfaceC0221u.e(new H0.r(p10, p10.getLayoutDirection()), new C0212k(h7, L.f3156r, M.f3160s, 1), b.b(i10, 0, 13)).a();
    }

    public static int j(H0.I i10, InterfaceC0215n interfaceC0215n, List list, int i11) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i12 = 0; i12 < size; i12++) {
            arrayList.add(new C0212k((H) list.get(i12), EnumC0216o.f3210r, EnumC0217p.f3214s, 0));
        }
        return i10.a(new H0.r(interfaceC0215n, interfaceC0215n.getLayoutDirection()), arrayList, b.b(i11, 0, 13)).a();
    }

    public static int k(InterfaceC0302z interfaceC0302z, InterfaceC0215n interfaceC0215n, H h7, int i10) {
        return interfaceC0302z.e(new H0.r(interfaceC0215n, interfaceC0215n.getLayoutDirection()), new C0212k(h7, l0.f4144r, m0.f4148s, 2), b.b(i10, 0, 13)).a();
    }

    public static int l(InterfaceC0221u interfaceC0221u, P p10, H h7, int i10) {
        return interfaceC0221u.e(new H0.r(p10, p10.getLayoutDirection()), new C0212k(h7, L.f3156r, M.f3159r, 1), b.b(0, i10, 7)).b();
    }

    public static int m(H0.I i10, InterfaceC0215n interfaceC0215n, List list, int i11) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i12 = 0; i12 < size; i12++) {
            arrayList.add(new C0212k((H) list.get(i12), EnumC0216o.f3210r, EnumC0217p.f3213r, 0));
        }
        return i10.a(new H0.r(interfaceC0215n, interfaceC0215n.getLayoutDirection()), arrayList, b.b(0, i11, 7)).b();
    }

    public static int n(InterfaceC0302z interfaceC0302z, InterfaceC0215n interfaceC0215n, H h7, int i10) {
        return interfaceC0302z.e(new H0.r(interfaceC0215n, interfaceC0215n.getLayoutDirection()), new C0212k(h7, l0.f4144r, m0.f4147r, 2), b.b(0, i10, 7)).b();
    }

    public static k o(n nVar, Object obj) {
        h hVar = new h();
        nVar.a(new Ca.r(hVar), obj);
        return hVar.k(hVar.f1362s);
    }

    public static j p(n nVar, int i10, long j, Boolean bool) {
        return new j("EXPLICIT", i10, j, new M.k(3, nVar, bool), false, null, false);
    }

    public static r q(C0153b c0153b) {
        C1408a0 c1408a0P = AbstractC1413d.p(400.0f, 5, null);
        long j = 1;
        C1408a0 c1408a0P2 = AbstractC1413d.p(400.0f, 1, new p063g1.j((j & 4294967295L) | (j << 32)));
        C1408a0 c1408a0P3 = AbstractC1413d.p(400.0f, 5, null);
        c0153b.getClass();
        return new LazyLayoutAnimateItemElement(c1408a0P, c1408a0P2, c1408a0P3);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.Object, java.util.Collection, java.util.List] */
    public static int t(X0 x9, int i10) {
        Object obj;
        F.r rVarG = ((A) x9.f168c).g();
        if (!rVarG.f2103k.isEmpty()) {
            int iB = x9.b();
            if (i10 > x9.c() || iB > i10) {
                return ((i10 - x9.b()) * Y2.a.m0(rVarG)) - ((C0675c0) ((A) x9.f168c).f2012d.f1159t).g();
            }
            ?? r10 = rVarG.f2103k;
            int size = r10.size();
            int i11 = 0;
            while (true) {
                if (i11 >= size) {
                    obj = null;
                    break;
                }
                obj = r10.get(i11);
                if (((s) obj).f2110a == i10) {
                    break;
                }
                i11++;
            }
            s sVar = (s) obj;
            if (sVar != null) {
                return sVar.f2120m;
            }
        }
        return 0;
    }

    public static q0 u(r0 r0Var, p241y9.e eVar, g0 g0Var, p205v0.b bVar, boolean z10, int i10) {
        e eVar2;
        Reference referencePoll;
        Object obj = null;
        if ((i10 & 4) != 0) {
            bVar = null;
        }
        if ((i10 & 8) != 0) {
            z10 = false;
        }
        AndroidComposeView androidComposeView = (AndroidComposeView) r0Var;
        if (bVar != null) {
            return new C0374v0(bVar, null, androidComposeView, eVar, g0Var);
        }
        if (z10) {
            if (androidComposeView.isHardwareAccelerated() && androidComposeView.f12041p0) {
                try {
                    return new Q0(androidComposeView, eVar, g0Var);
                } catch (Throwable unused) {
                    androidComposeView.f12041p0 = false;
                }
            }
            if (androidComposeView.f12029d0 == null) {
                if (!ViewLayer.f12076J) {
                    K0.P.u(new View(androidComposeView.getContext()));
                }
                DrawChildContainer drawChildContainer = ViewLayer.f12077K ? new DrawChildContainer(androidComposeView.getContext()) : new ViewLayerContainer(androidComposeView.getContext());
                androidComposeView.f12029d0 = drawChildContainer;
                androidComposeView.addView(drawChildContainer, -1);
            }
            DrawChildContainer drawChildContainer2 = androidComposeView.f12029d0;
            p251z9.j.b(drawChildContainer2);
            return new ViewLayer(androidComposeView, drawChildContainer2, eVar, g0Var);
        }
        M.k kVar = androidComposeView.f12010K0;
        do {
            ReferenceQueue referenceQueue = (ReferenceQueue) kVar.f5619t;
            eVar2 = (e) kVar.f5618s;
            referencePoll = referenceQueue.poll();
            if (referencePoll != null) {
                eVar2.k(referencePoll);
            }
        } while (referencePoll != null);
        while (true) {
            int i11 = eVar2.f13127t;
            if (i11 == 0) {
                break;
            }
            Object obj2 = ((Reference) eVar2.l(i11 - 1)).get();
            if (obj2 != null) {
                obj = obj2;
                break;
            }
        }
        q0 q0Var = (q0) obj;
        if (q0Var == null) {
            return new C0374v0(androidComposeView.getGraphicsContext().b(), androidComposeView.getGraphicsContext(), androidComposeView, eVar, g0Var);
        }
        q0Var.c(eVar, g0Var);
        return q0Var;
    }

    public static void w(F.h hVar, int i10, p074h0.d dVar) {
        Object obj = null;
        hVar.f2052a.a(i10, new android.support.v4.media.session.r(obj, o.f2083t, dVar, 6));
    }

    public static int x(String str, int i10, int i11) {
        return (str.hashCode() + i10) * i11;
    }

    public static C0681f0 y(long j) {
        return C0672b.r(new p180s0.q(j));
    }

    public static ClassCastException z(Iterator it) {
        it.next().getClass();
        return new ClassCastException();
    }
}
