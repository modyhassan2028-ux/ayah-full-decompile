package K;

import A.C0007a;
import A.C0040q0;
import A.R0;
import D.AbstractC0071n;
import D0.C0086d;
import K0.AbstractC0359n0;
import K0.C0335b0;
import U0.AbstractC0522n;
import U0.C0511c;
import U0.C0512d;
import U0.C0513e;
import U0.C0515g;
import Z.C0672b;
import Z.C0675c0;
import Z.C0681f0;
import Z.C0690k;
import Z.C0698o;
import Z.C0699o0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0681f0 f4812a = C0672b.r(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C0515g f4813b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p093j0.r f4814c;

    public w0(C0515g c0515g) {
        C0317k c0317k = C0317k.f4666E;
        c0515g.getClass();
        C0512d c0512d = new C0512d(c0515g);
        ArrayList arrayList = c0512d.f8053s;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            List list = (List) c0317k.e(((C0511c) arrayList.get(i10)).a(Integer.MIN_VALUE));
            ArrayList arrayList3 = new ArrayList(list.size());
            int size2 = list.size();
            for (int i11 = 0; i11 < size2; i11++) {
                C0513e c0513e = (C0513e) list.get(i11);
                arrayList3.add(new C0511c(c0513e.f8054a, c0513e.f8055b, c0513e.f8056c, c0513e.f8057d));
            }
            p120l9.m.d0(arrayList2, arrayList3);
        }
        arrayList.clear();
        arrayList.addAll(arrayList2);
        this.f4813b = c0512d.b();
        this.f4814c = new p093j0.r();
    }

    public static C0513e c(C0513e c0513e, U0.I i10) {
        U0.p pVar = i10.f8024b;
        int iC = pVar.c(pVar.f8111f - 1, false);
        if (c0513e.f8055b < iC) {
            return C0513e.a(c0513e, null, Math.min(c0513e.f8056c, iC), 11);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r19v2 */
    /* JADX WARN: Type inference failed for: r19v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r19v5 */
    /* JADX WARN: Type inference failed for: r21v0 */
    /* JADX WARN: Type inference failed for: r25v0, types: [Z.o] */
    /* JADX WARN: Type inference failed for: r3v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v7, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v16 */
    public final void a(int i10, C0698o c0698o) {
        int i11;
        char c10;
        ?? r10;
        Object obj;
        c0698o.V(1154651354);
        char c11 = 2;
        int i12 = (c0698o.i(this) ? 4 : 2) | i10;
        ?? r11 = 0;
        if (c0698o.K(i12 & 1, (i12 & 3) != 2)) {
            C0335b0 c0335b0 = (C0335b0) c0698o.k(AbstractC0359n0.f5127r);
            C0515g c0515g = this.f4813b;
            List listA = c0515g.a(c0515g.f8060s.length());
            int size = listA.size();
            int i13 = 0;
            while (i13 < size) {
                C0513e c0513e = (C0513e) listA.get(i13);
                int i14 = c0513e.f8055b;
                Object obj2 = c0513e.f8054a;
                if (i14 != c0513e.f8056c) {
                    c0698o.T(1386075176);
                    Object objH = c0698o.H();
                    Z.S s10 = C0690k.f10683a;
                    if (objH == s10) {
                        obj = objH;
                        B.j jVar = new B.j();
                        c0698o.e0(jVar);
                        obj = jVar;
                    }
                    obj = objH;
                    B.j jVar2 = (B.j) obj;
                    c10 = c11;
                    l0.r rVarF = androidx.compose.foundation.a.f(R0.m.a(androidx.compose.ui.graphics.a.a(l0.o.f19333a, new C0007a(14, this, c0513e)), r11, C0317k.f4667F).b(new z0(new u0(r11, this, c0513e))), jVar2);
                    D0.s.f1128a.getClass();
                    l0.r rVarF2 = D0.u.f(rVarF, D0.u.f1130b);
                    boolean zI = c0698o.i(this) | c0698o.g(c0513e) | c0698o.i(c0335b0);
                    Object objH2 = c0698o.H();
                    Object obj3 = objH2;
                    if (zI || objH2 == s10) {
                        C0086d c0086d = new C0086d(this, c0513e, c0335b0);
                        c0698o.e0(c0086d);
                        obj3 = c0086d;
                    }
                    AbstractC0071n.a(androidx.compose.foundation.a.d(rVarF2, jVar2, (p241y9.a) obj3), c0698o, r11);
                    AbstractC0522n abstractC0522n = (AbstractC0522n) obj2;
                    U0.J jA = abstractC0522n.a();
                    if (jA == null || (jA.f8029a == null && jA.f8030b == null && jA.f8031c == null && jA.f8032d == null)) {
                        i11 = i12;
                        ?? r12 = r11;
                        c0698o.T(1388926990);
                        c0698o.p(r12);
                        r10 = r12;
                    } else {
                        c0698o.T(1386898319);
                        Object objH3 = c0698o.H();
                        Object obj4 = objH3;
                        if (objH3 == s10) {
                            X x9 = new X(jVar2);
                            c0698o.e0(x9);
                            obj4 = x9;
                        }
                        X x10 = (X) obj4;
                        Object objH4 = c0698o.H();
                        p150o9.c cVar = null;
                        Object obj5 = objH4;
                        if (objH4 == s10) {
                            C0040q0 c0040q0 = new C0040q0(x10, cVar, 9);
                            c0698o.e0(c0040q0);
                            obj5 = c0040q0;
                        }
                        C0672b.f(c0698o, p110k9.y.f19095a, (p241y9.e) obj5);
                        C0675c0 c0675c0 = x10.f4578b;
                        C0675c0 c0675c1 = x10.f4578b;
                        Boolean boolValueOf = Boolean.valueOf((boolean) ((c0675c0.g() & 2) != 0 ? 1 : r11));
                        Boolean boolValueOf2 = Boolean.valueOf((boolean) ((c0675c1.g() & 1) != 0 ? 1 : r11));
                        Boolean boolValueOf3 = Boolean.valueOf((boolean) ((c0675c1.g() & 4) != 0 ? 1 : r11));
                        U0.J jA2 = abstractC0522n.a();
                        U0.C c12 = jA2 != null ? jA2.f8029a : null;
                        ?? r21 = r11;
                        U0.J jA3 = abstractC0522n.a();
                        U0.C c13 = jA3 != null ? jA3.f8030b : null;
                        i11 = i12;
                        U0.J jA4 = abstractC0522n.a();
                        U0.C c14 = jA4 != null ? jA4.f8031c : null;
                        U0.J jA5 = abstractC0522n.a();
                        U0.C c15 = jA5 != null ? jA5.f8032d : null;
                        U0.C c16 = c14;
                        Object[] objArr = new Object[7];
                        objArr[r21 == true ? 1 : 0] = boolValueOf;
                        objArr[1] = boolValueOf2;
                        objArr[c10] = boolValueOf3;
                        objArr[3] = c12;
                        objArr[4] = c13;
                        objArr[5] = c16;
                        objArr[6] = c15;
                        boolean zI2 = c0698o.i(this) | c0698o.g(c0513e);
                        Object objH5 = c0698o.H();
                        Object obj6 = objH5;
                        if (zI2 || objH5 == s10) {
                            C0007a c0007a = new C0007a(this, c0513e, x10);
                            c0698o.e0(c0007a);
                            obj6 = c0007a;
                        }
                        b(objArr, (p241y9.c) obj6, c0698o, (i11 << 6) & 896);
                        boolean z10 = r21 == true ? 1 : 0;
                        c0698o.p(z10);
                        r10 = z10;
                    }
                    c0698o.p(r10);
                } else {
                    i11 = i12;
                    c10 = c11;
                    r10 = r11;
                    c0698o.T(1388940878);
                    c0698o.p(r10);
                }
                i13++;
                r11 = r10;
                c11 = c10;
                i12 = i11;
            }
        } else {
            c0698o.N();
        }
        C0699o0 c0699o0R = c0698o.r();
        if (c0699o0R != null) {
            c0699o0R.f10749d = new R0(i10, 9, this);
        }
    }

    public final void b(Object[] objArr, p241y9.c cVar, C0698o c0698o, int i10) {
        c0698o.V(-2083052099);
        int i11 = (i10 & 48) == 0 ? (c0698o.i(cVar) ? 32 : 16) | i10 : i10;
        if ((i10 & 384) == 0) {
            i11 |= c0698o.i(this) ? 256 : 128;
        }
        c0698o.R(-416604407, Integer.valueOf(objArr.length));
        for (Object obj : objArr) {
            i11 |= c0698o.i(obj) ? 4 : 0;
        }
        c0698o.p(false);
        if ((i11 & 14) == 0) {
            i11 |= 2;
        }
        if (c0698o.K(i11 & 1, (i11 & 147) != 146)) {
            ArrayList arrayList = new ArrayList(2);
            arrayList.add(cVar);
            if (objArr.length > 0) {
                arrayList.ensureCapacity(arrayList.size() + objArr.length);
                Collections.addAll(arrayList, objArr);
            }
            Object[] array = arrayList.toArray(new Object[arrayList.size()]);
            boolean zI = c0698o.i(this) | ((i11 & 112) == 32);
            Object objH = c0698o.H();
            if (zI || objH == C0690k.f10683a) {
                objH = new r(this, cVar, 1);
                c0698o.e0(objH);
            }
            C0672b.e(array, (p241y9.c) objH, c0698o);
        } else {
            c0698o.N();
        }
        C0699o0 c0699o0R = c0698o.r();
        if (c0699o0R != null) {
            c0699o0R.f10749d = new v0(this, objArr, cVar, i10, 0);
        }
    }
}
