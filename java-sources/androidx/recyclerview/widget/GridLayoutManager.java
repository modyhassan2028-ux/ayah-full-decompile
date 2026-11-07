package androidx.recyclerview.widget;

import E2.A;
import E2.AbstractC0115c0;
import E2.AbstractC0135m0;
import E2.B0;
import E2.C0137n0;
import E2.D;
import E2.F0;
import E2.L;
import E2.M;
import E2.N;
import E2.P;
import E2.u0;
import I1.S;
import J1.d;
import J1.f;
import J1.g;
import M.k;
import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;
import java.util.WeakHashMap;
import p123m2.c;
import p245z2.a;

/* JADX INFO: loaded from: classes.dex */
public class GridLayoutManager extends LinearLayoutManager {

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public static final Set f12819P = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList(17, 66, 33, 130)));

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public boolean f12820E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public int f12821F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public int[] f12822G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public View[] f12823H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public final SparseIntArray f12824I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public final SparseIntArray f12825J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public final k f12826K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final Rect f12827L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public int f12828M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public int f12829N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public int f12830O;

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.f12820E = false;
        this.f12821F = -1;
        this.f12824I = new SparseIntArray();
        this.f12825J = new SparseIntArray();
        this.f12826K = new k(7);
        this.f12827L = new Rect();
        this.f12828M = -1;
        this.f12829N = -1;
        this.f12830O = -1;
        v1(AbstractC0135m0.I(context, attributeSet, i10, i11).f1706b);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, E2.AbstractC0135m0
    public final boolean E0() {
        return this.f12845z == null && !this.f12820E;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void G0(B0 b5, N n6, A a9) {
        int i10;
        int i11 = this.f12821F;
        for (int i12 = 0; i12 < this.f12821F && (i10 = n6.f1582d) >= 0 && i10 < b5.b() && i11 > 0; i12++) {
            a9.c(n6.f1582d, Math.max(0, n6.g));
            this.f12826K.getClass();
            i11--;
            n6.f1582d += n6.f1583e;
        }
    }

    @Override // E2.AbstractC0135m0
    public final int J(u0 u0Var, B0 b5) {
        if (this.f12835p == 0) {
            return Math.min(this.f12821F, C());
        }
        if (b5.b() < 1) {
            return 0;
        }
        return r1(b5.b() - 1, u0Var, b5) + 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final View T0(u0 u0Var, B0 b5, boolean z10, boolean z11) {
        int i10;
        int iW;
        int iW2 = w();
        int i11 = 1;
        if (z11) {
            iW = w() - 1;
            i10 = -1;
            i11 = -1;
        } else {
            i10 = iW2;
            iW = 0;
        }
        int iB = b5.b();
        L0();
        int iM = this.f12837r.m();
        int i12 = this.f12837r.i();
        View view = null;
        View view2 = null;
        while (iW != i10) {
            View viewV = v(iW);
            int iH = AbstractC0135m0.H(viewV);
            if (iH >= 0 && iH < iB && s1(iH, u0Var, b5) == 0) {
                if (((C0137n0) viewV.getLayoutParams()).f1733a.i()) {
                    if (view2 == null) {
                        view2 = viewV;
                    }
                } else {
                    if (this.f12837r.g(viewV) < i12 && this.f12837r.d(viewV) >= iM) {
                        return viewV;
                    }
                    if (view == null) {
                        view = viewV;
                    }
                }
            }
            iW += i11;
        }
        return view != null ? view : view2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x00e2, code lost:
    
        if (r13 == (r2 > r15)) goto L57;
     */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, E2.AbstractC0135m0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View U(android.view.View r23, int r24, E2.u0 r25, E2.B0 r26) {
        /*
            Method dump skipped, instruction units count: 326
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.U(android.view.View, int, E2.u0, E2.B0):android.view.View");
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, E2.AbstractC0135m0
    public final void W(u0 u0Var, B0 b5, g gVar) {
        super.W(u0Var, b5, gVar);
        gVar.m(GridView.class.getName());
        AbstractC0115c0 abstractC0115c0 = this.f1716b.f12861D;
        if (abstractC0115c0 == null || abstractC0115c0.a() <= 1) {
            return;
        }
        gVar.b(d.f4210u);
    }

    @Override // E2.AbstractC0135m0
    public final void X(u0 u0Var, B0 b5, View view, g gVar) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof D)) {
            Y(view, gVar);
            return;
        }
        D d5 = (D) layoutParams;
        int iR1 = r1(d5.f1733a.c(), u0Var, b5);
        if (this.f12835p == 0) {
            gVar.o(f.a(d5.f1461e, d5.f1462f, iR1, 1, false, false));
        } else {
            gVar.o(f.a(iR1, 1, d5.f1461e, d5.f1462f, false, false));
        }
    }

    @Override // E2.AbstractC0135m0
    public final void Z(int i10, int i11) {
        k kVar = this.f12826K;
        kVar.x();
        ((SparseIntArray) kVar.f5619t).clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void Z0(u0 u0Var, B0 b5, N n6, M m10) {
        int i10;
        int i11;
        int i12;
        int iF;
        int iE;
        int iF2;
        int iX;
        int iX2;
        boolean z10;
        int i13;
        View viewB;
        int iL = this.f12837r.l();
        boolean z11 = iL != 1073741824;
        int i14 = w() > 0 ? this.f12822G[this.f12821F] : 0;
        if (z11) {
            w1();
        }
        boolean z12 = n6.f1583e == 1;
        int iS1 = this.f12821F;
        if (!z12) {
            iS1 = s1(n6.f1582d, u0Var, b5) + t1(n6.f1582d, u0Var, b5);
        }
        int i15 = 0;
        while (i15 < this.f12821F && (i13 = n6.f1582d) >= 0 && i13 < b5.b() && iS1 > 0) {
            int i16 = n6.f1582d;
            int iT1 = t1(i16, u0Var, b5);
            if (iT1 > this.f12821F) {
                throw new IllegalArgumentException(a.E(c.x("Item at position ", i16, " requires ", iT1, " spans but GridLayoutManager has only "), this.f12821F, " spans."));
            }
            iS1 -= iT1;
            if (iS1 < 0 || (viewB = n6.b(u0Var)) == null) {
                break;
            }
            this.f12823H[i15] = viewB;
            i15++;
        }
        if (i15 == 0) {
            m10.f1566b = true;
            return;
        }
        if (z12) {
            i12 = 1;
            i11 = i15;
            i10 = 0;
        } else {
            i10 = i15 - 1;
            i11 = -1;
            i12 = -1;
        }
        int i17 = 0;
        while (i10 != i11) {
            View view = this.f12823H[i10];
            D d5 = (D) view.getLayoutParams();
            int iT2 = t1(AbstractC0135m0.H(view), u0Var, b5);
            d5.f1462f = iT2;
            d5.f1461e = i17;
            i17 += iT2;
            i10 += i12;
        }
        float f3 = 0.0f;
        int i18 = 0;
        for (int i19 = 0; i19 < i15; i19++) {
            View view2 = this.f12823H[i19];
            if (n6.f1587k != null) {
                z10 = false;
                if (z12) {
                    b(view2, -1, true);
                } else {
                    b(view2, 0, true);
                }
            } else if (z12) {
                z10 = false;
                b(view2, -1, false);
            } else {
                z10 = false;
                b(view2, 0, false);
            }
            d(this.f12827L, view2);
            u1(view2, iL, z10);
            int iE2 = this.f12837r.e(view2);
            if (iE2 > i18) {
                i18 = iE2;
            }
            float f7 = (this.f12837r.f(view2) * 1.0f) / ((D) view2.getLayoutParams()).f1462f;
            if (f7 > f3) {
                f3 = f7;
            }
        }
        if (z11) {
            k1(Math.max(Math.round(f3 * this.f12821F), i14));
            i18 = 0;
            for (int i20 = 0; i20 < i15; i20++) {
                View view3 = this.f12823H[i20];
                u1(view3, 1073741824, true);
                int iE3 = this.f12837r.e(view3);
                if (iE3 > i18) {
                    i18 = iE3;
                }
            }
        }
        for (int i21 = 0; i21 < i15; i21++) {
            View view4 = this.f12823H[i21];
            if (this.f12837r.e(view4) != i18) {
                D d9 = (D) view4.getLayoutParams();
                Rect rect = d9.f1734b;
                int i22 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) d9).topMargin + ((ViewGroup.MarginLayoutParams) d9).bottomMargin;
                int i23 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) d9).leftMargin + ((ViewGroup.MarginLayoutParams) d9).rightMargin;
                int iQ1 = q1(d9.f1461e, d9.f1462f);
                if (this.f12835p == 1) {
                    iX2 = AbstractC0135m0.x(false, iQ1, 1073741824, i23, ((ViewGroup.MarginLayoutParams) d9).width);
                    iX = View.MeasureSpec.makeMeasureSpec(i18 - i22, 1073741824);
                } else {
                    int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i18 - i23, 1073741824);
                    iX = AbstractC0135m0.x(false, iQ1, 1073741824, i22, ((ViewGroup.MarginLayoutParams) d9).height);
                    iX2 = iMakeMeasureSpec;
                }
                if (B0(view4, iX2, iX, (C0137n0) view4.getLayoutParams())) {
                    view4.measure(iX2, iX);
                }
            }
        }
        int iG = 0;
        m10.f1565a = i18;
        if (this.f12835p != 1) {
            if (n6.f1584f == -1) {
                int i24 = n6.f1580b;
                iE = i24 - i18;
                iF = i24;
            } else {
                int i25 = n6.f1580b;
                iF = i25 + i18;
                iE = i25;
            }
            iF2 = iG;
        } else if (n6.f1584f == -1) {
            iF2 = n6.f1580b;
            iG = iF2 - i18;
            iE = 0;
            iF = 0;
        } else {
            int i26 = n6.f1580b;
            iF = 0;
            iG = i26;
            iF2 = i26 + i18;
            iE = 0;
        }
        for (int i27 = 0; i27 < i15; i27++) {
            View view5 = this.f12823H[i27];
            D d10 = (D) view5.getLayoutParams();
            if (this.f12835p != 1) {
                iG = G() + this.f12822G[d10.f1461e];
                iF2 = this.f12837r.f(view5) + iG;
            } else if (Y0()) {
                int iE4 = E() + this.f12822G[this.f12821F - d10.f1461e];
                iF = iE4;
                iE = iE4 - this.f12837r.f(view5);
            } else {
                iE = E() + this.f12822G[d10.f1461e];
                iF = this.f12837r.f(view5) + iE;
            }
            AbstractC0135m0.O(view5, iE, iG, iF, iF2);
            if (d10.f1733a.i() || d10.f1733a.l()) {
                m10.f1567c = true;
            }
            m10.f1568d = view5.hasFocusable() | m10.f1568d;
        }
        Arrays.fill(this.f12823H, (Object) null);
    }

    @Override // E2.AbstractC0135m0
    public final void a0() {
        k kVar = this.f12826K;
        kVar.x();
        ((SparseIntArray) kVar.f5619t).clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void a1(u0 u0Var, B0 b5, L l10, int i10) {
        w1();
        if (b5.b() > 0 && !b5.g) {
            boolean z10 = i10 == 1;
            int iS1 = s1(l10.f1557b, u0Var, b5);
            if (z10) {
                while (iS1 > 0) {
                    int i11 = l10.f1557b;
                    if (i11 <= 0) {
                        break;
                    }
                    int i12 = i11 - 1;
                    l10.f1557b = i12;
                    iS1 = s1(i12, u0Var, b5);
                }
            } else {
                int iB = b5.b() - 1;
                int i13 = l10.f1557b;
                while (i13 < iB) {
                    int i14 = i13 + 1;
                    int iS2 = s1(i14, u0Var, b5);
                    if (iS2 <= iS1) {
                        break;
                    }
                    i13 = i14;
                    iS1 = iS2;
                }
                l10.f1557b = i13;
            }
        }
        l1();
    }

    @Override // E2.AbstractC0135m0
    public final void b0(int i10, int i11) {
        k kVar = this.f12826K;
        kVar.x();
        ((SparseIntArray) kVar.f5619t).clear();
    }

    @Override // E2.AbstractC0135m0
    public final void c0(int i10, int i11) {
        k kVar = this.f12826K;
        kVar.x();
        ((SparseIntArray) kVar.f5619t).clear();
    }

    @Override // E2.AbstractC0135m0
    public final void d0(int i10, int i11) {
        k kVar = this.f12826K;
        kVar.x();
        ((SparseIntArray) kVar.f5619t).clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, E2.AbstractC0135m0
    public final void e0(u0 u0Var, B0 b5) {
        boolean z10 = b5.g;
        SparseIntArray sparseIntArray = this.f12825J;
        SparseIntArray sparseIntArray2 = this.f12824I;
        if (z10) {
            int iW = w();
            for (int i10 = 0; i10 < iW; i10++) {
                D d5 = (D) v(i10).getLayoutParams();
                int iC = d5.f1733a.c();
                sparseIntArray2.put(iC, d5.f1462f);
                sparseIntArray.put(iC, d5.f1461e);
            }
        }
        super.e0(u0Var, b5);
        sparseIntArray2.clear();
        sparseIntArray.clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, E2.AbstractC0135m0
    public final void f0(B0 b5) {
        View viewR;
        super.f0(b5);
        this.f12820E = false;
        int i10 = this.f12828M;
        if (i10 == -1 || (viewR = r(i10)) == null) {
            return;
        }
        viewR.sendAccessibilityEvent(67108864);
        this.f12828M = -1;
    }

    @Override // E2.AbstractC0135m0
    public final boolean g(C0137n0 c0137n0) {
        return c0137n0 instanceof D;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void g1(boolean z10) {
        if (z10) {
            throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
        }
        super.g1(false);
    }

    /* JADX WARN: Code duplicated, block: B:118:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:121:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:122:0x01a9 A[EDGE_INSN: B:122:0x01a9->B:166:0x027c BREAK  A[LOOP:2: B:126:0x01b9->B:135:0x01e2, LOOP_LABEL: LOOP:2: B:126:0x01b9->B:135:0x01e2]] */
    /* JADX WARN: Code duplicated, block: B:123:0x01ac A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:128:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:131:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:134:0x01da A[LOOP:3: B:129:0x01c7->B:134:0x01da, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:139:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:142:0x0213  */
    /* JADX WARN: Code duplicated, block: B:143:0x0215  */
    /* JADX WARN: Code duplicated, block: B:145:0x0218 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:150:0x0227  */
    /* JADX WARN: Code duplicated, block: B:153:0x0235  */
    /* JADX WARN: Code duplicated, block: B:156:0x0243  */
    /* JADX WARN: Code duplicated, block: B:163:0x0262  */
    /* JADX WARN: Code duplicated, block: B:167:0x027e  */
    /* JADX WARN: Code duplicated, block: B:209:0x01a9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:210:0x01e5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:211:0x01e2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:212:0x01a9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:213:0x01ff A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:214:? A[LOOP:4: B:137:0x01ed->B:214:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:215:0x0254 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:216:0x01a9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:217:0x0251 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:218:0x0249 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:220:0x022f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:222:0x01a9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:223:0x026e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:224:? A[LOOP:7: B:161:0x025c->B:224:?, LOOP_END, SYNTHETIC] */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, E2.AbstractC0135m0
    public final boolean j0(int i10, Bundle bundle) {
        View viewV;
        F0 f0O;
        int iIntValue;
        int i11;
        TreeMap treeMap;
        int i12;
        Iterator it;
        Integer num;
        int iIntValue2;
        Iterator it2;
        Integer num2;
        TreeMap treeMap2;
        int i13;
        Iterator it3;
        Integer num3;
        int iIntValue3;
        Iterator it4;
        Integer num4;
        if (i10 == d.f4210u.a() && i10 != -1) {
            int i14 = 0;
            while (true) {
                if (i14 >= w()) {
                    viewV = null;
                    break;
                }
                View viewV2 = v(i14);
                Objects.requireNonNull(viewV2);
                if (viewV2.isAccessibilityFocused()) {
                    viewV = v(i14);
                    break;
                }
                i14++;
            }
            if (viewV != null && bundle != null) {
                int i15 = bundle.getInt("android.view.accessibility.action.ARGUMENT_DIRECTION_INT", -1);
                if (f12819P.contains(Integer.valueOf(i15)) && (f0O = this.f1716b.O(viewV)) != null) {
                    int iB = f0O.b();
                    int iN1 = n1(iB);
                    int iM1 = m1(iB);
                    if (iN1 >= 0 && iM1 >= 0) {
                        if (!o1(iB).contains(Integer.valueOf(this.f12829N)) || !p1(m1(iB), iB).contains(Integer.valueOf(this.f12830O))) {
                            this.f12829N = iN1;
                            this.f12830O = iM1;
                        }
                        int i16 = this.f12829N;
                        if (i16 == -1) {
                            i16 = iN1;
                        }
                        int i17 = this.f12830O;
                        if (i17 != -1) {
                            iM1 = i17;
                        }
                        if (i15 == 17) {
                            iIntValue = iB - 1;
                            while (true) {
                                if (iIntValue >= 0) {
                                    int iN2 = n1(iIntValue);
                                    int iM2 = m1(iIntValue);
                                    if (iN2 >= 0 && iM2 >= 0) {
                                        if (this.f12835p != 1) {
                                            if (o1(iIntValue).contains(Integer.valueOf(i16)) && iM2 < iM1) {
                                                this.f12830O = iM2;
                                                break;
                                            }
                                            iIntValue--;
                                        } else {
                                            if ((iN2 == i16 && iM2 < iM1) || iN2 < i16) {
                                                this.f12829N = iN2;
                                                this.f12830O = iM2;
                                                break;
                                            }
                                            iIntValue--;
                                        }
                                    }
                                }
                                iIntValue = -1;
                                break;
                            }
                            if (iIntValue == -1) {
                                if (i15 == 17) {
                                    if (i15 == 66) {
                                        if (iN1 < 0) {
                                            treeMap = new TreeMap();
                                            i12 = 0;
                                            loop5: while (true) {
                                                if (i12 < C()) {
                                                    it2 = o1(i12).iterator();
                                                    while (true) {
                                                        if (it2.hasNext()) {
                                                            num2 = (Integer) it2.next();
                                                            if (num2.intValue() < 0) {
                                                                if (!treeMap.containsKey(num2)) {
                                                                    treeMap.put(num2, Integer.valueOf(i12));
                                                                }
                                                            }
                                                        } else {
                                                            i12++;
                                                        }
                                                    }
                                                } else {
                                                    it = treeMap.keySet().iterator();
                                                    while (true) {
                                                        if (it.hasNext()) {
                                                            num = (Integer) it.next();
                                                            iIntValue2 = num.intValue();
                                                            if (iIntValue2 > iN1) {
                                                                iIntValue = ((Integer) treeMap.get(num)).intValue();
                                                                this.f12829N = iIntValue2;
                                                                this.f12830O = 0;
                                                                break;
                                                            }
                                                        }
                                                    }
                                                }
                                                iIntValue = -1;
                                                break loop2;
                                            }
                                        }
                                        iIntValue = -1;
                                        break loop2;
                                    }
                                } else {
                                    if (iN1 < 0) {
                                        treeMap2 = new TreeMap(Collections.reverseOrder());
                                        i13 = 0;
                                        loop2: while (true) {
                                            if (i13 < C()) {
                                                it4 = o1(i13).iterator();
                                                while (true) {
                                                    if (it4.hasNext()) {
                                                        num4 = (Integer) it4.next();
                                                        if (num4.intValue() < 0) {
                                                            treeMap2.put(num4, Integer.valueOf(i13));
                                                        }
                                                    } else {
                                                        i13++;
                                                    }
                                                }
                                            } else {
                                                it3 = treeMap2.keySet().iterator();
                                                while (true) {
                                                    if (it3.hasNext()) {
                                                        num3 = (Integer) it3.next();
                                                        iIntValue3 = num3.intValue();
                                                        if (iIntValue3 < iN1) {
                                                            iIntValue = ((Integer) treeMap2.get(num3)).intValue();
                                                            this.f12829N = iIntValue3;
                                                            this.f12830O = m1(iIntValue);
                                                            break;
                                                        }
                                                    }
                                                }
                                            }
                                            iIntValue = -1;
                                            break loop2;
                                        }
                                    }
                                    iIntValue = -1;
                                    break loop2;
                                }
                            }
                            if (iIntValue != -1) {
                                s0(iIntValue);
                                this.f12828M = iIntValue;
                                return true;
                            }
                        } else if (i15 == 33) {
                            iIntValue = iB - 1;
                            while (true) {
                                if (iIntValue >= 0) {
                                    int iN3 = n1(iIntValue);
                                    int iM3 = m1(iIntValue);
                                    if (iN3 >= 0 && iM3 >= 0) {
                                        if (this.f12835p != 1) {
                                            if (iN3 < i16 && iM3 == iM1) {
                                                this.f12829N = ((Integer) Collections.max(o1(iIntValue))).intValue();
                                                break;
                                            }
                                            iIntValue--;
                                        } else {
                                            if (iN3 < i16 && p1(m1(iIntValue), iIntValue).contains(Integer.valueOf(iM1))) {
                                                this.f12829N = iN3;
                                                break;
                                            }
                                            iIntValue--;
                                        }
                                    }
                                }
                                iIntValue = -1;
                                break;
                            }
                            if (iIntValue == -1) {
                                if (i15 == 17) {
                                    if (i15 == 66) {
                                        if (iN1 < 0) {
                                            treeMap = new TreeMap();
                                            i12 = 0;
                                            loop5: while (true) {
                                                if (i12 < C()) {
                                                    it2 = o1(i12).iterator();
                                                    while (true) {
                                                        if (it2.hasNext()) {
                                                            num2 = (Integer) it2.next();
                                                            if (num2.intValue() < 0) {
                                                                if (!treeMap.containsKey(num2)) {
                                                                    treeMap.put(num2, Integer.valueOf(i12));
                                                                }
                                                            }
                                                        } else {
                                                            i12++;
                                                        }
                                                    }
                                                } else {
                                                    it = treeMap.keySet().iterator();
                                                    while (true) {
                                                        if (it.hasNext()) {
                                                            num = (Integer) it.next();
                                                            iIntValue2 = num.intValue();
                                                            if (iIntValue2 > iN1) {
                                                                iIntValue = ((Integer) treeMap.get(num)).intValue();
                                                                this.f12829N = iIntValue2;
                                                                this.f12830O = 0;
                                                                break;
                                                            }
                                                        }
                                                    }
                                                }
                                                iIntValue = -1;
                                                break loop2;
                                            }
                                        }
                                        iIntValue = -1;
                                        break loop2;
                                    }
                                } else {
                                    if (iN1 < 0) {
                                        treeMap2 = new TreeMap(Collections.reverseOrder());
                                        i13 = 0;
                                        loop2: while (true) {
                                            if (i13 < C()) {
                                                it4 = o1(i13).iterator();
                                                while (true) {
                                                    if (it4.hasNext()) {
                                                        num4 = (Integer) it4.next();
                                                        if (num4.intValue() < 0) {
                                                            treeMap2.put(num4, Integer.valueOf(i13));
                                                        }
                                                    } else {
                                                        i13++;
                                                    }
                                                }
                                            } else {
                                                it3 = treeMap2.keySet().iterator();
                                                while (true) {
                                                    if (it3.hasNext()) {
                                                        num3 = (Integer) it3.next();
                                                        iIntValue3 = num3.intValue();
                                                        if (iIntValue3 < iN1) {
                                                            iIntValue = ((Integer) treeMap2.get(num3)).intValue();
                                                            this.f12829N = iIntValue3;
                                                            this.f12830O = m1(iIntValue);
                                                            break;
                                                        }
                                                    }
                                                }
                                            }
                                            iIntValue = -1;
                                            break loop2;
                                        }
                                    }
                                    iIntValue = -1;
                                    break loop2;
                                }
                            }
                            if (iIntValue != -1) {
                                s0(iIntValue);
                                this.f12828M = iIntValue;
                                return true;
                            }
                        } else if (i15 == 66) {
                            iIntValue = iB + 1;
                            while (true) {
                                if (iIntValue < C()) {
                                    int iN4 = n1(iIntValue);
                                    int iM4 = m1(iIntValue);
                                    if (iN4 >= 0 && iM4 >= 0) {
                                        if (this.f12835p != 1) {
                                            if (iM4 > iM1 && o1(iIntValue).contains(Integer.valueOf(i16))) {
                                                this.f12830O = iM4;
                                                break;
                                            }
                                            iIntValue++;
                                        } else {
                                            if ((iN4 == i16 && iM4 > iM1) || iN4 > i16) {
                                                this.f12829N = iN4;
                                                this.f12830O = iM4;
                                                break;
                                            }
                                            iIntValue++;
                                        }
                                    }
                                }
                                iIntValue = -1;
                                break;
                            }
                            if (iIntValue == -1) {
                                if (i15 == 17) {
                                    if (i15 == 66) {
                                        if (iN1 < 0) {
                                            treeMap = new TreeMap();
                                            i12 = 0;
                                            loop5: while (true) {
                                                if (i12 < C()) {
                                                    it2 = o1(i12).iterator();
                                                    while (true) {
                                                        if (it2.hasNext()) {
                                                            num2 = (Integer) it2.next();
                                                            if (num2.intValue() < 0) {
                                                                if (!treeMap.containsKey(num2)) {
                                                                    treeMap.put(num2, Integer.valueOf(i12));
                                                                }
                                                            }
                                                        } else {
                                                            i12++;
                                                        }
                                                    }
                                                } else {
                                                    it = treeMap.keySet().iterator();
                                                    while (true) {
                                                        if (it.hasNext()) {
                                                            num = (Integer) it.next();
                                                            iIntValue2 = num.intValue();
                                                            if (iIntValue2 > iN1) {
                                                                iIntValue = ((Integer) treeMap.get(num)).intValue();
                                                                this.f12829N = iIntValue2;
                                                                this.f12830O = 0;
                                                                break;
                                                            }
                                                        }
                                                    }
                                                }
                                                iIntValue = -1;
                                                break loop2;
                                            }
                                        }
                                        iIntValue = -1;
                                        break loop2;
                                    }
                                } else {
                                    if (iN1 < 0) {
                                        treeMap2 = new TreeMap(Collections.reverseOrder());
                                        i13 = 0;
                                        loop2: while (true) {
                                            if (i13 < C()) {
                                                it4 = o1(i13).iterator();
                                                while (true) {
                                                    if (it4.hasNext()) {
                                                        num4 = (Integer) it4.next();
                                                        if (num4.intValue() < 0) {
                                                            treeMap2.put(num4, Integer.valueOf(i13));
                                                        }
                                                    } else {
                                                        i13++;
                                                    }
                                                }
                                            } else {
                                                it3 = treeMap2.keySet().iterator();
                                                while (true) {
                                                    if (it3.hasNext()) {
                                                        num3 = (Integer) it3.next();
                                                        iIntValue3 = num3.intValue();
                                                        if (iIntValue3 < iN1) {
                                                            iIntValue = ((Integer) treeMap2.get(num3)).intValue();
                                                            this.f12829N = iIntValue3;
                                                            this.f12830O = m1(iIntValue);
                                                            break;
                                                        }
                                                    }
                                                }
                                            }
                                            iIntValue = -1;
                                            break loop2;
                                        }
                                    }
                                    iIntValue = -1;
                                    break loop2;
                                }
                            }
                            if (iIntValue != -1) {
                                s0(iIntValue);
                                this.f12828M = iIntValue;
                                return true;
                            }
                        } else if (i15 == 130) {
                            iIntValue = iB + 1;
                            while (true) {
                                if (iIntValue < C()) {
                                    int iN5 = n1(iIntValue);
                                    int iM5 = m1(iIntValue);
                                    if (iN5 >= 0 && iM5 >= 0) {
                                        if (this.f12835p != 1) {
                                            if (iN5 > i16 && iM5 == iM1) {
                                                this.f12829N = n1(iIntValue);
                                                break;
                                            }
                                            iIntValue++;
                                        } else {
                                            if (iN5 > i16 && (iM5 == iM1 || p1(m1(iIntValue), iIntValue).contains(Integer.valueOf(iM1)))) {
                                                this.f12829N = iN5;
                                                break;
                                            }
                                            iIntValue++;
                                        }
                                    }
                                }
                                iIntValue = -1;
                                break;
                            }
                            if (iIntValue == -1 && (i11 = this.f12835p) == 0) {
                                if (i15 == 17) {
                                    if (i15 == 66) {
                                        if (iN1 < 0 || i11 == 1) {
                                            iIntValue = -1;
                                            break loop2;
                                        }
                                        treeMap = new TreeMap();
                                        i12 = 0;
                                        loop5: while (true) {
                                            if (i12 < C()) {
                                                it2 = o1(i12).iterator();
                                                while (true) {
                                                    if (it2.hasNext()) {
                                                        num2 = (Integer) it2.next();
                                                        if (num2.intValue() < 0) {
                                                            if (!treeMap.containsKey(num2)) {
                                                                treeMap.put(num2, Integer.valueOf(i12));
                                                            }
                                                        }
                                                    } else {
                                                        i12++;
                                                    }
                                                }
                                            } else {
                                                it = treeMap.keySet().iterator();
                                                while (true) {
                                                    if (it.hasNext()) {
                                                        num = (Integer) it.next();
                                                        iIntValue2 = num.intValue();
                                                        if (iIntValue2 > iN1) {
                                                            iIntValue = ((Integer) treeMap.get(num)).intValue();
                                                            this.f12829N = iIntValue2;
                                                            this.f12830O = 0;
                                                            break;
                                                        }
                                                    }
                                                }
                                            }
                                            iIntValue = -1;
                                            break loop2;
                                        }
                                    }
                                } else {
                                    if (iN1 < 0 || i11 == 1) {
                                        iIntValue = -1;
                                        break loop2;
                                    }
                                    treeMap2 = new TreeMap(Collections.reverseOrder());
                                    i13 = 0;
                                    loop2: while (true) {
                                        if (i13 < C()) {
                                            it4 = o1(i13).iterator();
                                            while (true) {
                                                if (it4.hasNext()) {
                                                    num4 = (Integer) it4.next();
                                                    if (num4.intValue() < 0) {
                                                        treeMap2.put(num4, Integer.valueOf(i13));
                                                    }
                                                } else {
                                                    i13++;
                                                }
                                            }
                                        } else {
                                            it3 = treeMap2.keySet().iterator();
                                            while (true) {
                                                if (it3.hasNext()) {
                                                    num3 = (Integer) it3.next();
                                                    iIntValue3 = num3.intValue();
                                                    if (iIntValue3 < iN1) {
                                                        iIntValue = ((Integer) treeMap2.get(num3)).intValue();
                                                        this.f12829N = iIntValue3;
                                                        this.f12830O = m1(iIntValue);
                                                        break;
                                                    }
                                                }
                                            }
                                        }
                                        iIntValue = -1;
                                        break loop2;
                                    }
                                }
                            }
                            if (iIntValue != -1) {
                                s0(iIntValue);
                                this.f12828M = iIntValue;
                                return true;
                            }
                        }
                    }
                }
            }
        } else {
            if (i10 != 16908343 || bundle == null) {
                return super.j0(i10, bundle);
            }
            int i18 = bundle.getInt("android.view.accessibility.action.ARGUMENT_ROW_INT", -1);
            int i19 = bundle.getInt("android.view.accessibility.action.ARGUMENT_COLUMN_INT", -1);
            if (i18 != -1 && i19 != -1) {
                int iA = this.f1716b.f12861D.a();
                int i20 = 0;
                while (true) {
                    if (i20 >= iA) {
                        i20 = -1;
                        break;
                    }
                    RecyclerView recyclerView = this.f1716b;
                    int iS1 = s1(i20, recyclerView.f12912t, recyclerView.f12923y0);
                    RecyclerView recyclerView2 = this.f1716b;
                    int iR1 = r1(i20, recyclerView2.f12912t, recyclerView2.f12923y0);
                    if (this.f12835p != 1) {
                        if (iS1 == i18 && iR1 == i19) {
                            break;
                        }
                        i20++;
                    } else {
                        if (iS1 == i19 && iR1 == i18) {
                            break;
                        }
                        i20++;
                    }
                }
                if (i20 > -1) {
                    this.f12843x = i20;
                    this.f12844y = 0;
                    P p10 = this.f12845z;
                    if (p10 != null) {
                        p10.f1601r = -1;
                    }
                    q0();
                    return true;
                }
            }
        }
        return false;
    }

    public final void k1(int i10) {
        int i11;
        int[] iArr = this.f12822G;
        int i12 = this.f12821F;
        if (iArr == null || iArr.length != i12 + 1 || iArr[iArr.length - 1] != i10) {
            iArr = new int[i12 + 1];
        }
        int i13 = 0;
        iArr[0] = 0;
        int i14 = i10 / i12;
        int i15 = i10 % i12;
        int i16 = 0;
        for (int i17 = 1; i17 <= i12; i17++) {
            i13 += i15;
            if (i13 <= 0 || i12 - i13 >= i15) {
                i11 = i14;
            } else {
                i11 = i14 + 1;
                i13 -= i12;
            }
            i16 += i11;
            iArr[i17] = i16;
        }
        this.f12822G = iArr;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, E2.AbstractC0135m0
    public final int l(B0 b5) {
        return I0(b5);
    }

    public final void l1() {
        View[] viewArr = this.f12823H;
        if (viewArr == null || viewArr.length != this.f12821F) {
            this.f12823H = new View[this.f12821F];
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, E2.AbstractC0135m0
    public final int m(B0 b5) {
        return J0(b5);
    }

    public final int m1(int i10) {
        if (this.f12835p == 0) {
            RecyclerView recyclerView = this.f1716b;
            return r1(i10, recyclerView.f12912t, recyclerView.f12923y0);
        }
        RecyclerView recyclerView2 = this.f1716b;
        return s1(i10, recyclerView2.f12912t, recyclerView2.f12923y0);
    }

    public final int n1(int i10) {
        if (this.f12835p == 1) {
            RecyclerView recyclerView = this.f1716b;
            return r1(i10, recyclerView.f12912t, recyclerView.f12923y0);
        }
        RecyclerView recyclerView2 = this.f1716b;
        return s1(i10, recyclerView2.f12912t, recyclerView2.f12923y0);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, E2.AbstractC0135m0
    public final int o(B0 b5) {
        return I0(b5);
    }

    public final HashSet o1(int i10) {
        return p1(n1(i10), i10);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, E2.AbstractC0135m0
    public final int p(B0 b5) {
        return J0(b5);
    }

    public final HashSet p1(int i10, int i11) {
        HashSet hashSet = new HashSet();
        RecyclerView recyclerView = this.f1716b;
        int iT1 = t1(i11, recyclerView.f12912t, recyclerView.f12923y0);
        for (int i12 = i10; i12 < i10 + iT1; i12++) {
            hashSet.add(Integer.valueOf(i12));
        }
        return hashSet;
    }

    public final int q1(int i10, int i11) {
        if (this.f12835p != 1 || !Y0()) {
            int[] iArr = this.f12822G;
            return iArr[i11 + i10] - iArr[i10];
        }
        int[] iArr2 = this.f12822G;
        int i12 = this.f12821F;
        return iArr2[i12 - i10] - iArr2[(i12 - i10) - i11];
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, E2.AbstractC0135m0
    public final int r0(int i10, u0 u0Var, B0 b5) {
        w1();
        l1();
        return super.r0(i10, u0Var, b5);
    }

    public final int r1(int i10, u0 u0Var, B0 b5) {
        boolean z10 = b5.g;
        k kVar = this.f12826K;
        if (!z10) {
            int i11 = this.f12821F;
            kVar.getClass();
            return k.u(i10, i11);
        }
        int iB = u0Var.b(i10);
        if (iB != -1) {
            int i12 = this.f12821F;
            kVar.getClass();
            return k.u(iB, i12);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i10);
        return 0;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, E2.AbstractC0135m0
    public final C0137n0 s() {
        return this.f12835p == 0 ? new D(-2, -1) : new D(-1, -2);
    }

    public final int s1(int i10, u0 u0Var, B0 b5) {
        boolean z10 = b5.g;
        k kVar = this.f12826K;
        if (!z10) {
            int i11 = this.f12821F;
            kVar.getClass();
            return i10 % i11;
        }
        int i12 = this.f12825J.get(i10, -1);
        if (i12 != -1) {
            return i12;
        }
        int iB = u0Var.b(i10);
        if (iB != -1) {
            int i13 = this.f12821F;
            kVar.getClass();
            return iB % i13;
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i10);
        return 0;
    }

    @Override // E2.AbstractC0135m0
    public final C0137n0 t(Context context, AttributeSet attributeSet) {
        D d5 = new D(context, attributeSet);
        d5.f1461e = -1;
        d5.f1462f = 0;
        return d5;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, E2.AbstractC0135m0
    public final int t0(int i10, u0 u0Var, B0 b5) {
        w1();
        l1();
        return super.t0(i10, u0Var, b5);
    }

    public final int t1(int i10, u0 u0Var, B0 b5) {
        boolean z10 = b5.g;
        k kVar = this.f12826K;
        if (!z10) {
            kVar.getClass();
            return 1;
        }
        int i11 = this.f12824I.get(i10, -1);
        if (i11 != -1) {
            return i11;
        }
        if (u0Var.b(i10) != -1) {
            kVar.getClass();
            return 1;
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i10);
        return 1;
    }

    @Override // E2.AbstractC0135m0
    public final C0137n0 u(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            D d5 = new D((ViewGroup.MarginLayoutParams) layoutParams);
            d5.f1461e = -1;
            d5.f1462f = 0;
            return d5;
        }
        D d9 = new D(layoutParams);
        d9.f1461e = -1;
        d9.f1462f = 0;
        return d9;
    }

    public final void u1(View view, int i10, boolean z10) {
        int iX;
        int iX2;
        D d5 = (D) view.getLayoutParams();
        Rect rect = d5.f1734b;
        int i11 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) d5).topMargin + ((ViewGroup.MarginLayoutParams) d5).bottomMargin;
        int i12 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) d5).leftMargin + ((ViewGroup.MarginLayoutParams) d5).rightMargin;
        int iQ1 = q1(d5.f1461e, d5.f1462f);
        if (this.f12835p == 1) {
            iX2 = AbstractC0135m0.x(false, iQ1, i10, i12, ((ViewGroup.MarginLayoutParams) d5).width);
            iX = AbstractC0135m0.x(true, this.f12837r.n(), this.f1725m, i11, ((ViewGroup.MarginLayoutParams) d5).height);
        } else {
            int iX3 = AbstractC0135m0.x(false, iQ1, i10, i11, ((ViewGroup.MarginLayoutParams) d5).height);
            int iX4 = AbstractC0135m0.x(true, this.f12837r.n(), this.f1724l, i12, ((ViewGroup.MarginLayoutParams) d5).width);
            iX = iX3;
            iX2 = iX4;
        }
        C0137n0 c0137n0 = (C0137n0) view.getLayoutParams();
        if (z10 ? B0(view, iX2, iX, c0137n0) : z0(view, iX2, iX, c0137n0)) {
            view.measure(iX2, iX);
        }
    }

    public final void v1(int i10) {
        if (i10 == this.f12821F) {
            return;
        }
        this.f12820E = true;
        if (i10 < 1) {
            throw new IllegalArgumentException(c.r(i10, "Span count should be at least 1. Provided "));
        }
        this.f12821F = i10;
        this.f12826K.x();
        q0();
    }

    @Override // E2.AbstractC0135m0
    public final void w0(Rect rect, int i10, int i11) {
        int iH;
        int iH2;
        if (this.f12822G == null) {
            super.w0(rect, i10, i11);
        }
        int iF = F() + E();
        int iD = D() + G();
        if (this.f12835p == 1) {
            int iHeight = rect.height() + iD;
            RecyclerView recyclerView = this.f1716b;
            WeakHashMap weakHashMap = S.f3689a;
            iH2 = AbstractC0135m0.h(i11, iHeight, recyclerView.getMinimumHeight());
            int[] iArr = this.f12822G;
            iH = AbstractC0135m0.h(i10, iArr[iArr.length - 1] + iF, this.f1716b.getMinimumWidth());
        } else {
            int iWidth = rect.width() + iF;
            RecyclerView recyclerView2 = this.f1716b;
            WeakHashMap weakHashMap2 = S.f3689a;
            iH = AbstractC0135m0.h(i10, iWidth, recyclerView2.getMinimumWidth());
            int[] iArr2 = this.f12822G;
            iH2 = AbstractC0135m0.h(i11, iArr2[iArr2.length - 1] + iD, this.f1716b.getMinimumHeight());
        }
        this.f1716b.setMeasuredDimension(iH, iH2);
    }

    public final void w1() {
        int iD;
        int iG;
        if (this.f12835p == 1) {
            iD = this.f1726n - F();
            iG = E();
        } else {
            iD = this.f1727o - D();
            iG = G();
        }
        k1(iD - iG);
    }

    @Override // E2.AbstractC0135m0
    public final int y(u0 u0Var, B0 b5) {
        if (this.f12835p == 1) {
            return Math.min(this.f12821F, C());
        }
        if (b5.b() < 1) {
            return 0;
        }
        return r1(b5.b() - 1, u0Var, b5) + 1;
    }

    public GridLayoutManager(int i10) {
        super(1);
        this.f12820E = false;
        this.f12821F = -1;
        this.f12824I = new SparseIntArray();
        this.f12825J = new SparseIntArray();
        this.f12826K = new k(7);
        this.f12827L = new Rect();
        this.f12828M = -1;
        this.f12829N = -1;
        this.f12830O = -1;
        v1(i10);
    }
}
