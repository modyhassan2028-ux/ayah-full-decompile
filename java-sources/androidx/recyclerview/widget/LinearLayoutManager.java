package androidx.recyclerview.widget;

import E2.A;
import E2.A0;
import E2.AbstractC0114c;
import E2.AbstractC0115c0;
import E2.AbstractC0135m0;
import E2.B0;
import E2.C0133l0;
import E2.C0137n0;
import E2.F0;
import E2.L;
import E2.M;
import E2.N;
import E2.P;
import E2.Q;
import E2.W;
import E2.u0;
import J1.d;
import J1.g;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import java.util.ArrayList;
import java.util.List;
import p123m2.c;

/* JADX INFO: loaded from: classes.dex */
public class LinearLayoutManager extends AbstractC0135m0 implements A0 {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final L f12831A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final M f12832B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final int f12833C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final int[] f12834D;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f12835p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public N f12836q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public W f12837r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f12838s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final boolean f12839t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f12840u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f12841v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final boolean f12842w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f12843x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f12844y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public P f12845z;

    public LinearLayoutManager(int i10) {
        this.f12835p = 1;
        this.f12839t = false;
        this.f12840u = false;
        this.f12841v = false;
        this.f12842w = true;
        this.f12843x = -1;
        this.f12844y = Integer.MIN_VALUE;
        this.f12845z = null;
        this.f12831A = new L();
        this.f12832B = new M();
        this.f12833C = 2;
        this.f12834D = new int[2];
        f1(i10);
        c(null);
        if (this.f12839t) {
            this.f12839t = false;
            q0();
        }
    }

    @Override // E2.AbstractC0135m0
    public final boolean A0() {
        if (this.f1725m != 1073741824 && this.f1724l != 1073741824) {
            int iW = w();
            for (int i10 = 0; i10 < iW; i10++) {
                ViewGroup.LayoutParams layoutParams = v(i10).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // E2.AbstractC0135m0
    public void C0(RecyclerView recyclerView, B0 b5, int i10) {
        Q q10 = new Q(recyclerView.getContext());
        q10.f1604a = i10;
        D0(q10);
    }

    @Override // E2.AbstractC0135m0
    public boolean E0() {
        return this.f12845z == null && this.f12838s == this.f12841v;
    }

    public void F0(B0 b5, int[] iArr) {
        int i10;
        int iN = b5.f1443a != -1 ? this.f12837r.n() : 0;
        if (this.f12836q.f1584f == -1) {
            i10 = 0;
        } else {
            i10 = iN;
            iN = 0;
        }
        iArr[0] = iN;
        iArr[1] = i10;
    }

    public void G0(B0 b5, N n6, A a9) {
        int i10 = n6.f1582d;
        if (i10 < 0 || i10 >= b5.b()) {
            return;
        }
        a9.c(i10, Math.max(0, n6.g));
    }

    public final int H0(B0 b5) {
        if (w() == 0) {
            return 0;
        }
        L0();
        W w9 = this.f12837r;
        boolean z10 = !this.f12842w;
        return AbstractC0114c.f(b5, w9, O0(z10), N0(z10), this, this.f12842w);
    }

    public final int I0(B0 b5) {
        if (w() == 0) {
            return 0;
        }
        L0();
        W w9 = this.f12837r;
        boolean z10 = !this.f12842w;
        return AbstractC0114c.g(b5, w9, O0(z10), N0(z10), this, this.f12842w, this.f12840u);
    }

    public final int J0(B0 b5) {
        if (w() == 0) {
            return 0;
        }
        L0();
        W w9 = this.f12837r;
        boolean z10 = !this.f12842w;
        return AbstractC0114c.h(b5, w9, O0(z10), N0(z10), this, this.f12842w);
    }

    public final int K0(int i10) {
        if (i10 == 1) {
            return (this.f12835p != 1 && Y0()) ? 1 : -1;
        }
        if (i10 == 2) {
            return (this.f12835p != 1 && Y0()) ? -1 : 1;
        }
        if (i10 == 17) {
            return this.f12835p == 0 ? -1 : Integer.MIN_VALUE;
        }
        if (i10 == 33) {
            return this.f12835p == 1 ? -1 : Integer.MIN_VALUE;
        }
        if (i10 != 66) {
            return (i10 == 130 && this.f12835p == 1) ? 1 : Integer.MIN_VALUE;
        }
        return this.f12835p == 0 ? 1 : Integer.MIN_VALUE;
    }

    @Override // E2.AbstractC0135m0
    public final boolean L() {
        return true;
    }

    public final void L0() {
        if (this.f12836q == null) {
            N n6 = new N();
            n6.f1579a = true;
            n6.f1585h = 0;
            n6.f1586i = 0;
            n6.f1587k = null;
            this.f12836q = n6;
        }
    }

    @Override // E2.AbstractC0135m0
    public final boolean M() {
        return this.f12839t;
    }

    public final int M0(u0 u0Var, N n6, B0 b5, boolean z10) {
        int i10;
        int i11 = n6.f1581c;
        int i12 = n6.g;
        if (i12 != Integer.MIN_VALUE) {
            if (i11 < 0) {
                n6.g = i12 + i11;
            }
            b1(u0Var, n6);
        }
        int i13 = n6.f1581c + n6.f1585h;
        while (true) {
            if ((!n6.f1588l && i13 <= 0) || (i10 = n6.f1582d) < 0 || i10 >= b5.b()) {
                break;
            }
            M m10 = this.f12832B;
            m10.f1565a = 0;
            m10.f1566b = false;
            m10.f1567c = false;
            m10.f1568d = false;
            Z0(u0Var, b5, n6, m10);
            if (!m10.f1566b) {
                int i14 = n6.f1580b;
                int i15 = m10.f1565a;
                n6.f1580b = (n6.f1584f * i15) + i14;
                if (!m10.f1567c || n6.f1587k != null || !b5.g) {
                    n6.f1581c -= i15;
                    i13 -= i15;
                }
                int i16 = n6.g;
                if (i16 != Integer.MIN_VALUE) {
                    int i17 = i16 + i15;
                    n6.g = i17;
                    int i18 = n6.f1581c;
                    if (i18 < 0) {
                        n6.g = i17 + i18;
                    }
                    b1(u0Var, n6);
                }
                if (z10 && m10.f1568d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i11 - n6.f1581c;
    }

    public final View N0(boolean z10) {
        return this.f12840u ? S0(0, w(), z10, true) : S0(w() - 1, -1, z10, true);
    }

    public final View O0(boolean z10) {
        return this.f12840u ? S0(w() - 1, -1, z10, true) : S0(0, w(), z10, true);
    }

    public final int P0() {
        View viewS0 = S0(0, w(), false, true);
        if (viewS0 == null) {
            return -1;
        }
        return AbstractC0135m0.H(viewS0);
    }

    public final int Q0() {
        View viewS0 = S0(w() - 1, -1, false, true);
        if (viewS0 == null) {
            return -1;
        }
        return AbstractC0135m0.H(viewS0);
    }

    public final View R0(int i10, int i11) {
        int i12;
        int i13;
        L0();
        if (i11 <= i10 && i11 >= i10) {
            return v(i10);
        }
        if (this.f12837r.g(v(i10)) < this.f12837r.m()) {
            i12 = 16644;
            i13 = 16388;
        } else {
            i12 = 4161;
            i13 = 4097;
        }
        return this.f12835p == 0 ? this.f1717c.o(i10, i11, i12, i13) : this.f1718d.o(i10, i11, i12, i13);
    }

    public final View S0(int i10, int i11, boolean z10, boolean z11) {
        L0();
        int i12 = z10 ? 24579 : 320;
        int i13 = z11 ? 320 : 0;
        return this.f12835p == 0 ? this.f1717c.o(i10, i11, i12, i13) : this.f1718d.o(i10, i11, i12, i13);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0075  */
    /* JADX WARN: Code duplicated, block: B:35:0x0079  */
    public View T0(u0 u0Var, B0 b5, boolean z10, boolean z11) {
        int i10;
        int iW;
        int i11;
        L0();
        int iW2 = w();
        if (z11) {
            iW = w() - 1;
            i10 = -1;
            i11 = -1;
        } else {
            i10 = iW2;
            iW = 0;
            i11 = 1;
        }
        int iB = b5.b();
        int iM = this.f12837r.m();
        int i12 = this.f12837r.i();
        View view = null;
        View view2 = null;
        View view3 = null;
        while (iW != i10) {
            View viewV = v(iW);
            int iH = AbstractC0135m0.H(viewV);
            int iG = this.f12837r.g(viewV);
            int iD = this.f12837r.d(viewV);
            if (iH >= 0 && iH < iB) {
                if (!((C0137n0) viewV.getLayoutParams()).f1733a.i()) {
                    boolean z12 = iD <= iM && iG < iM;
                    boolean z13 = iG >= i12 && iD > i12;
                    if (!z12 && !z13) {
                        return viewV;
                    }
                    if (z10) {
                        if (z13) {
                            view2 = viewV;
                        } else if (view == null) {
                            view = viewV;
                        }
                    } else if (z12) {
                        view2 = viewV;
                    } else if (view == null) {
                        view = viewV;
                    }
                } else if (view3 == null) {
                    view3 = viewV;
                }
            }
            iW += i11;
        }
        if (view != null) {
            return view;
        }
        return view2 != null ? view2 : view3;
    }

    @Override // E2.AbstractC0135m0
    public View U(View view, int i10, u0 u0Var, B0 b5) {
        int iK0;
        View viewR0;
        d1();
        if (w() != 0 && (iK0 = K0(i10)) != Integer.MIN_VALUE) {
            L0();
            h1(iK0, (int) (this.f12837r.n() * 0.33333334f), false, b5);
            N n6 = this.f12836q;
            n6.g = Integer.MIN_VALUE;
            n6.f1579a = false;
            M0(u0Var, n6, b5, true);
            if (iK0 == -1) {
                viewR0 = this.f12840u ? R0(w() - 1, -1) : R0(0, w());
            } else {
                viewR0 = this.f12840u ? R0(0, w()) : R0(w() - 1, -1);
            }
            View viewX0 = iK0 == -1 ? X0() : W0();
            if (!viewX0.hasFocusable()) {
                return viewR0;
            }
            if (viewR0 != null) {
                return viewX0;
            }
        }
        return null;
    }

    public final int U0(int i10, u0 u0Var, B0 b5, boolean z10) {
        int i11;
        int i12 = this.f12837r.i() - i10;
        if (i12 <= 0) {
            return 0;
        }
        int i13 = -e1(-i12, u0Var, b5);
        int i14 = i10 + i13;
        if (!z10 || (i11 = this.f12837r.i() - i14) <= 0) {
            return i13;
        }
        this.f12837r.q(i11);
        return i11 + i13;
    }

    @Override // E2.AbstractC0135m0
    public final void V(AccessibilityEvent accessibilityEvent) {
        super.V(accessibilityEvent);
        if (w() > 0) {
            accessibilityEvent.setFromIndex(P0());
            accessibilityEvent.setToIndex(Q0());
        }
    }

    public final int V0(int i10, u0 u0Var, B0 b5, boolean z10) {
        int iM;
        int iM2 = i10 - this.f12837r.m();
        if (iM2 <= 0) {
            return 0;
        }
        int i11 = -e1(iM2, u0Var, b5);
        int i12 = i10 + i11;
        if (!z10 || (iM = i12 - this.f12837r.m()) <= 0) {
            return i11;
        }
        this.f12837r.q(-iM);
        return i11 - iM;
    }

    @Override // E2.AbstractC0135m0
    public void W(u0 u0Var, B0 b5, g gVar) {
        super.W(u0Var, b5, gVar);
        AbstractC0115c0 abstractC0115c0 = this.f1716b.f12861D;
        if (abstractC0115c0 == null || abstractC0115c0.a() <= 0) {
            return;
        }
        gVar.b(d.f4204o);
    }

    public final View W0() {
        return v(this.f12840u ? 0 : w() - 1);
    }

    public final View X0() {
        return v(this.f12840u ? w() - 1 : 0);
    }

    public final boolean Y0() {
        return this.f1716b.getLayoutDirection() == 1;
    }

    public void Z0(u0 u0Var, B0 b5, N n6, M m10) {
        int iE;
        int i10;
        int i11;
        int iF;
        View viewB = n6.b(u0Var);
        if (viewB == null) {
            m10.f1566b = true;
            return;
        }
        C0137n0 c0137n0 = (C0137n0) viewB.getLayoutParams();
        if (n6.f1587k == null) {
            if (this.f12840u == (n6.f1584f == -1)) {
                b(viewB, -1, false);
            } else {
                b(viewB, 0, false);
            }
        } else {
            if (this.f12840u == (n6.f1584f == -1)) {
                b(viewB, -1, true);
            } else {
                b(viewB, 0, true);
            }
        }
        C0137n0 c0137n1 = (C0137n0) viewB.getLayoutParams();
        Rect rectQ = this.f1716b.Q(viewB);
        int i12 = rectQ.left + rectQ.right;
        int i13 = rectQ.top + rectQ.bottom;
        int iX = AbstractC0135m0.x(e(), this.f1726n, this.f1724l, F() + E() + ((ViewGroup.MarginLayoutParams) c0137n1).leftMargin + ((ViewGroup.MarginLayoutParams) c0137n1).rightMargin + i12, ((ViewGroup.MarginLayoutParams) c0137n1).width);
        int iX2 = AbstractC0135m0.x(f(), this.f1727o, this.f1725m, D() + G() + ((ViewGroup.MarginLayoutParams) c0137n1).topMargin + ((ViewGroup.MarginLayoutParams) c0137n1).bottomMargin + i13, ((ViewGroup.MarginLayoutParams) c0137n1).height);
        if (z0(viewB, iX, iX2, c0137n1)) {
            viewB.measure(iX, iX2);
        }
        m10.f1565a = this.f12837r.e(viewB);
        if (this.f12835p == 1) {
            if (Y0()) {
                iF = this.f1726n - F();
                iE = iF - this.f12837r.f(viewB);
            } else {
                iE = E();
                iF = this.f12837r.f(viewB) + iE;
            }
            if (n6.f1584f == -1) {
                i10 = n6.f1580b;
                i11 = i10 - m10.f1565a;
            } else {
                i11 = n6.f1580b;
                i10 = m10.f1565a + i11;
            }
        } else {
            int iG = G();
            int iF2 = this.f12837r.f(viewB) + iG;
            if (n6.f1584f == -1) {
                int i14 = n6.f1580b;
                int i15 = i14 - m10.f1565a;
                iF = i14;
                i10 = iF2;
                iE = i15;
                i11 = iG;
            } else {
                int i16 = n6.f1580b;
                int i17 = m10.f1565a + i16;
                iE = i16;
                i10 = iF2;
                i11 = iG;
                iF = i17;
            }
        }
        AbstractC0135m0.O(viewB, iE, i11, iF, i10);
        if (c0137n0.f1733a.i() || c0137n0.f1733a.l()) {
            m10.f1567c = true;
        }
        m10.f1568d = viewB.hasFocusable();
    }

    @Override // E2.A0
    public final PointF a(int i10) {
        if (w() == 0) {
            return null;
        }
        int i11 = (i10 < AbstractC0135m0.H(v(0))) != this.f12840u ? -1 : 1;
        return this.f12835p == 0 ? new PointF(i11, 0.0f) : new PointF(0.0f, i11);
    }

    public final void b1(u0 u0Var, N n6) {
        if (!n6.f1579a || n6.f1588l) {
            return;
        }
        int i10 = n6.g;
        int i11 = n6.f1586i;
        if (n6.f1584f == -1) {
            int iW = w();
            if (i10 < 0) {
                return;
            }
            int iH = (this.f12837r.h() - i10) + i11;
            if (this.f12840u) {
                for (int i12 = 0; i12 < iW; i12++) {
                    View viewV = v(i12);
                    if (this.f12837r.g(viewV) < iH || this.f12837r.p(viewV) < iH) {
                        c1(u0Var, 0, i12);
                        return;
                    }
                }
                return;
            }
            int i13 = iW - 1;
            for (int i14 = i13; i14 >= 0; i14--) {
                View viewV2 = v(i14);
                if (this.f12837r.g(viewV2) < iH || this.f12837r.p(viewV2) < iH) {
                    c1(u0Var, i13, i14);
                    return;
                }
            }
            return;
        }
        if (i10 < 0) {
            return;
        }
        int i15 = i10 - i11;
        int iW2 = w();
        if (!this.f12840u) {
            for (int i16 = 0; i16 < iW2; i16++) {
                View viewV3 = v(i16);
                if (this.f12837r.d(viewV3) > i15 || this.f12837r.o(viewV3) > i15) {
                    c1(u0Var, 0, i16);
                    return;
                }
            }
            return;
        }
        int i17 = iW2 - 1;
        for (int i18 = i17; i18 >= 0; i18--) {
            View viewV4 = v(i18);
            if (this.f12837r.d(viewV4) > i15 || this.f12837r.o(viewV4) > i15) {
                c1(u0Var, i17, i18);
                return;
            }
        }
    }

    @Override // E2.AbstractC0135m0
    public final void c(String str) {
        if (this.f12845z == null) {
            super.c(str);
        }
    }

    public final void c1(u0 u0Var, int i10, int i11) {
        if (i10 == i11) {
            return;
        }
        if (i11 <= i10) {
            while (i10 > i11) {
                View viewV = v(i10);
                o0(i10);
                u0Var.h(viewV);
                i10--;
            }
            return;
        }
        for (int i12 = i11 - 1; i12 >= i10; i12--) {
            View viewV2 = v(i12);
            o0(i12);
            u0Var.h(viewV2);
        }
    }

    public final void d1() {
        if (this.f12835p == 1 || !Y0()) {
            this.f12840u = this.f12839t;
        } else {
            this.f12840u = !this.f12839t;
        }
    }

    @Override // E2.AbstractC0135m0
    public final boolean e() {
        return this.f12835p == 0;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:104:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:111:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:114:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:118:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:122:0x0213 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:124:0x0217  */
    /* JADX WARN: Code duplicated, block: B:126:0x021a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:128:0x021e  */
    /* JADX WARN: Code duplicated, block: B:130:0x0221 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:131:0x0223  */
    /* JADX WARN: Code duplicated, block: B:133:0x0227  */
    /* JADX WARN: Code duplicated, block: B:135:0x022b  */
    /* JADX WARN: Code duplicated, block: B:137:0x0232  */
    /* JADX WARN: Code duplicated, block: B:138:0x0238  */
    /* JADX WARN: Code duplicated, block: B:95:0x0194  */
    @Override // E2.AbstractC0135m0
    public void e0(u0 u0Var, B0 b5) {
        View focusedChild;
        int iB;
        RecyclerView recyclerView;
        View focusedChild2;
        boolean z10;
        boolean z11;
        View viewT0;
        int iG;
        int iD;
        int iM;
        int i10;
        boolean z12;
        boolean z13;
        C0137n0 c0137n0;
        int i11;
        int iG2;
        int i12;
        int i13;
        List list;
        int i14;
        int i15;
        int iU0;
        int i16;
        View viewR;
        int iG3;
        int i17;
        int i18;
        int i19 = -1;
        if (!(this.f12845z == null && this.f12843x == -1) && b5.b() == 0) {
            l0(u0Var);
            return;
        }
        P p10 = this.f12845z;
        if (p10 != null && (i18 = p10.f1601r) >= 0) {
            this.f12843x = i18;
        }
        L0();
        this.f12836q.f1579a = false;
        d1();
        RecyclerView recyclerView2 = this.f1716b;
        if (recyclerView2 == null || (focusedChild = recyclerView2.getFocusedChild()) == null || ((ArrayList) this.f1715a.f1676e).contains(focusedChild)) {
            focusedChild = null;
        }
        L l10 = this.f12831A;
        if (!l10.f1560e || this.f12843x != -1 || this.f12845z != null) {
            l10.d();
            l10.f1559d = this.f12840u ^ this.f12841v;
            if (b5.g || (i11 = this.f12843x) == -1) {
                if (w() != 0) {
                    recyclerView = this.f1716b;
                    if (recyclerView != null || (focusedChild2 = recyclerView.getFocusedChild()) == null || ((ArrayList) this.f1715a.f1676e).contains(focusedChild2)) {
                        focusedChild2 = null;
                    }
                    if (focusedChild2 != null) {
                        c0137n0 = (C0137n0) focusedChild2.getLayoutParams();
                        if (!c0137n0.f1733a.i() || c0137n0.f1733a.c() < 0 || c0137n0.f1733a.c() >= b5.b()) {
                            z10 = this.f12838s;
                            z11 = this.f12841v;
                            if (z10 == z11 || (viewT0 = T0(u0Var, b5, l10.f1559d, z11)) == null) {
                                l10.a();
                                if (this.f12841v) {
                                    iB = b5.b() - 1;
                                } else {
                                    iB = 0;
                                }
                                l10.f1557b = iB;
                            } else {
                                l10.b(AbstractC0135m0.H(viewT0), viewT0);
                                if (!b5.g && E0()) {
                                    iG = this.f12837r.g(viewT0);
                                    iD = this.f12837r.d(viewT0);
                                    iM = this.f12837r.m();
                                    i10 = this.f12837r.i();
                                    if (iD <= iM || iG >= iM) {
                                        z12 = false;
                                    } else {
                                        z12 = true;
                                    }
                                    if (iG >= i10 || iD <= i10) {
                                        z13 = false;
                                    } else {
                                        z13 = true;
                                    }
                                    if (z12 || z13) {
                                        if (l10.f1559d) {
                                            iM = i10;
                                        }
                                        l10.f1558c = iM;
                                    }
                                }
                            }
                        } else {
                            l10.c(AbstractC0135m0.H(focusedChild2), focusedChild2);
                        }
                    } else {
                        z10 = this.f12838s;
                        z11 = this.f12841v;
                        if (z10 == z11) {
                            l10.a();
                            if (this.f12841v) {
                                iB = b5.b() - 1;
                            } else {
                                iB = 0;
                            }
                            l10.f1557b = iB;
                        } else {
                            l10.b(AbstractC0135m0.H(viewT0), viewT0);
                            if (!b5.g) {
                                iG = this.f12837r.g(viewT0);
                                iD = this.f12837r.d(viewT0);
                                iM = this.f12837r.m();
                                i10 = this.f12837r.i();
                                if (iD <= iM) {
                                    z12 = false;
                                } else {
                                    z12 = false;
                                }
                                if (iG >= i10) {
                                    z13 = false;
                                } else {
                                    z13 = false;
                                }
                                if (z12) {
                                    if (l10.f1559d) {
                                        iM = i10;
                                    }
                                    l10.f1558c = iM;
                                } else {
                                    if (l10.f1559d) {
                                        iM = i10;
                                    }
                                    l10.f1558c = iM;
                                }
                            }
                        }
                    }
                } else {
                    l10.a();
                    if (this.f12841v) {
                        iB = b5.b() - 1;
                    } else {
                        iB = 0;
                    }
                    l10.f1557b = iB;
                }
            } else if (i11 < 0 || i11 >= b5.b()) {
                this.f12843x = -1;
                this.f12844y = Integer.MIN_VALUE;
                if (w() != 0) {
                    recyclerView = this.f1716b;
                    if (recyclerView != null) {
                        focusedChild2 = null;
                    } else {
                        focusedChild2 = null;
                    }
                    if (focusedChild2 != null) {
                        c0137n0 = (C0137n0) focusedChild2.getLayoutParams();
                        if (c0137n0.f1733a.i()) {
                            z10 = this.f12838s;
                            z11 = this.f12841v;
                            if (z10 == z11) {
                                l10.a();
                                if (this.f12841v) {
                                    iB = b5.b() - 1;
                                } else {
                                    iB = 0;
                                }
                                l10.f1557b = iB;
                            } else {
                                l10.b(AbstractC0135m0.H(viewT0), viewT0);
                                if (!b5.g) {
                                    iG = this.f12837r.g(viewT0);
                                    iD = this.f12837r.d(viewT0);
                                    iM = this.f12837r.m();
                                    i10 = this.f12837r.i();
                                    if (iD <= iM) {
                                        z12 = false;
                                    } else {
                                        z12 = false;
                                    }
                                    if (iG >= i10) {
                                        z13 = false;
                                    } else {
                                        z13 = false;
                                    }
                                    if (z12) {
                                        if (l10.f1559d) {
                                            iM = i10;
                                        }
                                        l10.f1558c = iM;
                                    } else {
                                        if (l10.f1559d) {
                                            iM = i10;
                                        }
                                        l10.f1558c = iM;
                                    }
                                }
                            }
                        } else {
                            z10 = this.f12838s;
                            z11 = this.f12841v;
                            if (z10 == z11) {
                                l10.a();
                                if (this.f12841v) {
                                    iB = b5.b() - 1;
                                } else {
                                    iB = 0;
                                }
                                l10.f1557b = iB;
                            } else {
                                l10.b(AbstractC0135m0.H(viewT0), viewT0);
                                if (!b5.g) {
                                    iG = this.f12837r.g(viewT0);
                                    iD = this.f12837r.d(viewT0);
                                    iM = this.f12837r.m();
                                    i10 = this.f12837r.i();
                                    if (iD <= iM) {
                                        z12 = false;
                                    } else {
                                        z12 = false;
                                    }
                                    if (iG >= i10) {
                                        z13 = false;
                                    } else {
                                        z13 = false;
                                    }
                                    if (z12) {
                                        if (l10.f1559d) {
                                            iM = i10;
                                        }
                                        l10.f1558c = iM;
                                    } else {
                                        if (l10.f1559d) {
                                            iM = i10;
                                        }
                                        l10.f1558c = iM;
                                    }
                                }
                            }
                        }
                    } else {
                        z10 = this.f12838s;
                        z11 = this.f12841v;
                        if (z10 == z11) {
                            l10.a();
                            if (this.f12841v) {
                                iB = b5.b() - 1;
                            } else {
                                iB = 0;
                            }
                            l10.f1557b = iB;
                        } else {
                            l10.b(AbstractC0135m0.H(viewT0), viewT0);
                            if (!b5.g) {
                                iG = this.f12837r.g(viewT0);
                                iD = this.f12837r.d(viewT0);
                                iM = this.f12837r.m();
                                i10 = this.f12837r.i();
                                if (iD <= iM) {
                                    z12 = false;
                                } else {
                                    z12 = false;
                                }
                                if (iG >= i10) {
                                    z13 = false;
                                } else {
                                    z13 = false;
                                }
                                if (z12) {
                                    if (l10.f1559d) {
                                        iM = i10;
                                    }
                                    l10.f1558c = iM;
                                } else {
                                    if (l10.f1559d) {
                                        iM = i10;
                                    }
                                    l10.f1558c = iM;
                                }
                            }
                        }
                    }
                } else {
                    l10.a();
                    if (this.f12841v) {
                        iB = b5.b() - 1;
                    } else {
                        iB = 0;
                    }
                    l10.f1557b = iB;
                }
            } else {
                int i20 = this.f12843x;
                l10.f1557b = i20;
                P p11 = this.f12845z;
                if (p11 != null && p11.f1601r >= 0) {
                    boolean z14 = p11.f1603t;
                    l10.f1559d = z14;
                    if (z14) {
                        l10.f1558c = this.f12837r.i() - this.f12845z.f1602s;
                    } else {
                        l10.f1558c = this.f12837r.m() + this.f12845z.f1602s;
                    }
                } else if (this.f12844y == Integer.MIN_VALUE) {
                    View viewR2 = r(i20);
                    if (viewR2 == null) {
                        if (w() > 0) {
                            l10.f1559d = (this.f12843x < AbstractC0135m0.H(v(0))) == this.f12840u;
                        }
                        l10.a();
                    } else if (this.f12837r.e(viewR2) > this.f12837r.n()) {
                        l10.a();
                    } else if (this.f12837r.g(viewR2) - this.f12837r.m() < 0) {
                        l10.f1558c = this.f12837r.m();
                        l10.f1559d = false;
                    } else if (this.f12837r.i() - this.f12837r.d(viewR2) < 0) {
                        l10.f1558c = this.f12837r.i();
                        l10.f1559d = true;
                    } else {
                        if (l10.f1559d) {
                            int iD2 = this.f12837r.d(viewR2);
                            W w9 = this.f12837r;
                            iG2 = (Integer.MIN_VALUE == w9.f1625a ? 0 : w9.n() - w9.f1625a) + iD2;
                        } else {
                            iG2 = this.f12837r.g(viewR2);
                        }
                        l10.f1558c = iG2;
                    }
                } else {
                    boolean z15 = this.f12840u;
                    l10.f1559d = z15;
                    if (z15) {
                        l10.f1558c = this.f12837r.i() - this.f12844y;
                    } else {
                        l10.f1558c = this.f12837r.m() + this.f12844y;
                    }
                }
            }
            l10.f1560e = true;
        } else if (focusedChild != null && (this.f12837r.g(focusedChild) >= this.f12837r.i() || this.f12837r.d(focusedChild) <= this.f12837r.m())) {
            l10.c(AbstractC0135m0.H(focusedChild), focusedChild);
        }
        N n6 = this.f12836q;
        n6.f1584f = n6.j >= 0 ? 1 : -1;
        int[] iArr = this.f12834D;
        iArr[0] = 0;
        iArr[1] = 0;
        F0(b5, iArr);
        int iM2 = this.f12837r.m() + Math.max(0, iArr[0]);
        int iJ = this.f12837r.j() + Math.max(0, iArr[1]);
        if (b5.g && (i16 = this.f12843x) != -1 && this.f12844y != Integer.MIN_VALUE && (viewR = r(i16)) != null) {
            if (this.f12840u) {
                i17 = this.f12837r.i() - this.f12837r.d(viewR);
                iG3 = this.f12844y;
            } else {
                iG3 = this.f12837r.g(viewR) - this.f12837r.m();
                i17 = this.f12844y;
            }
            int i21 = i17 - iG3;
            if (i21 > 0) {
                iM2 += i21;
            } else {
                iJ -= i21;
            }
        }
        if (!l10.f1559d ? !this.f12840u : this.f12840u) {
            i19 = 1;
        }
        a1(u0Var, b5, l10, i19);
        q(u0Var);
        this.f12836q.f1588l = this.f12837r.k() == 0 && this.f12837r.h() == 0;
        this.f12836q.getClass();
        this.f12836q.f1586i = 0;
        if (l10.f1559d) {
            j1(l10.f1557b, l10.f1558c);
            N n10 = this.f12836q;
            n10.f1585h = iM2;
            M0(u0Var, n10, b5, false);
            N n11 = this.f12836q;
            i13 = n11.f1580b;
            int i22 = n11.f1582d;
            int i23 = n11.f1581c;
            if (i23 > 0) {
                iJ += i23;
            }
            i1(l10.f1557b, l10.f1558c);
            N n12 = this.f12836q;
            n12.f1585h = iJ;
            n12.f1582d += n12.f1583e;
            M0(u0Var, n12, b5, false);
            N n13 = this.f12836q;
            i12 = n13.f1580b;
            int i24 = n13.f1581c;
            if (i24 > 0) {
                j1(i22, i13);
                N n14 = this.f12836q;
                n14.f1585h = i24;
                M0(u0Var, n14, b5, false);
                i13 = this.f12836q.f1580b;
            }
        } else {
            i1(l10.f1557b, l10.f1558c);
            N n15 = this.f12836q;
            n15.f1585h = iJ;
            M0(u0Var, n15, b5, false);
            N n16 = this.f12836q;
            i12 = n16.f1580b;
            int i25 = n16.f1582d;
            int i26 = n16.f1581c;
            if (i26 > 0) {
                iM2 += i26;
            }
            j1(l10.f1557b, l10.f1558c);
            N n17 = this.f12836q;
            n17.f1585h = iM2;
            n17.f1582d += n17.f1583e;
            M0(u0Var, n17, b5, false);
            N n18 = this.f12836q;
            int i27 = n18.f1580b;
            int i28 = n18.f1581c;
            if (i28 > 0) {
                i1(i25, i12);
                N n19 = this.f12836q;
                n19.f1585h = i28;
                M0(u0Var, n19, b5, false);
                i12 = this.f12836q.f1580b;
            }
            i13 = i27;
        }
        if (w() > 0) {
            if (this.f12840u ^ this.f12841v) {
                int iU1 = U0(i12, u0Var, b5, true);
                i14 = i13 + iU1;
                i15 = i12 + iU1;
                iU0 = V0(i14, u0Var, b5, false);
            } else {
                int iV0 = V0(i13, u0Var, b5, true);
                i14 = i13 + iV0;
                i15 = i12 + iV0;
                iU0 = U0(i15, u0Var, b5, false);
            }
            i13 = i14 + iU0;
            i12 = i15 + iU0;
        }
        if (b5.f1451k && w() != 0 && !b5.g && E0()) {
            List list2 = u0Var.f1781d;
            int size = list2.size();
            int iH = AbstractC0135m0.H(v(0));
            int iE = 0;
            int iE2 = 0;
            for (int i29 = 0; i29 < size; i29++) {
                F0 f3 = (F0) list2.get(i29);
                boolean zI = f3.i();
                View view = f3.f1486a;
                if (!zI) {
                    if ((f3.c() < iH) != this.f12840u) {
                        iE += this.f12837r.e(view);
                    } else {
                        iE2 += this.f12837r.e(view);
                    }
                }
            }
            this.f12836q.f1587k = list2;
            if (iE > 0) {
                j1(AbstractC0135m0.H(X0()), i13);
                N n20 = this.f12836q;
                n20.f1585h = iE;
                n20.f1581c = 0;
                n20.a(null);
                M0(u0Var, this.f12836q, b5, false);
            }
            if (iE2 > 0) {
                i1(AbstractC0135m0.H(W0()), i12);
                N n21 = this.f12836q;
                n21.f1585h = iE2;
                n21.f1581c = 0;
                list = null;
                n21.a(null);
                M0(u0Var, this.f12836q, b5, false);
            } else {
                list = null;
            }
            this.f12836q.f1587k = list;
        }
        if (b5.g) {
            l10.d();
        } else {
            W w10 = this.f12837r;
            w10.f1625a = w10.n();
        }
        this.f12838s = this.f12841v;
    }

    public final int e1(int i10, u0 u0Var, B0 b5) {
        if (w() != 0 && i10 != 0) {
            L0();
            this.f12836q.f1579a = true;
            int i11 = i10 > 0 ? 1 : -1;
            int iAbs = Math.abs(i10);
            h1(i11, iAbs, true, b5);
            N n6 = this.f12836q;
            int iM0 = M0(u0Var, n6, b5, false) + n6.g;
            if (iM0 >= 0) {
                if (iAbs > iM0) {
                    i10 = i11 * iM0;
                }
                this.f12837r.q(-i10);
                this.f12836q.j = i10;
                return i10;
            }
        }
        return 0;
    }

    @Override // E2.AbstractC0135m0
    public final boolean f() {
        return this.f12835p == 1;
    }

    @Override // E2.AbstractC0135m0
    public void f0(B0 b5) {
        this.f12845z = null;
        this.f12843x = -1;
        this.f12844y = Integer.MIN_VALUE;
        this.f12831A.d();
    }

    public final void f1(int i10) {
        if (i10 != 0 && i10 != 1) {
            throw new IllegalArgumentException(c.r(i10, "invalid orientation:"));
        }
        c(null);
        if (i10 != this.f12835p || this.f12837r == null) {
            W wB = W.b(this, i10);
            this.f12837r = wB;
            this.f12831A.f1556a = wB;
            this.f12835p = i10;
            q0();
        }
    }

    @Override // E2.AbstractC0135m0
    public final void g0(Parcelable parcelable) {
        if (parcelable instanceof P) {
            P p10 = (P) parcelable;
            this.f12845z = p10;
            if (this.f12843x != -1) {
                p10.f1601r = -1;
            }
            q0();
        }
    }

    public void g1(boolean z10) {
        c(null);
        if (this.f12841v == z10) {
            return;
        }
        this.f12841v = z10;
        q0();
    }

    @Override // E2.AbstractC0135m0
    public final Parcelable h0() {
        P p10 = this.f12845z;
        if (p10 != null) {
            P p11 = new P();
            p11.f1601r = p10.f1601r;
            p11.f1602s = p10.f1602s;
            p11.f1603t = p10.f1603t;
            return p11;
        }
        P p12 = new P();
        if (w() <= 0) {
            p12.f1601r = -1;
            return p12;
        }
        L0();
        boolean z10 = this.f12838s ^ this.f12840u;
        p12.f1603t = z10;
        if (z10) {
            View viewW0 = W0();
            p12.f1602s = this.f12837r.i() - this.f12837r.d(viewW0);
            p12.f1601r = AbstractC0135m0.H(viewW0);
            return p12;
        }
        View viewX0 = X0();
        p12.f1601r = AbstractC0135m0.H(viewX0);
        p12.f1602s = this.f12837r.g(viewX0) - this.f12837r.m();
        return p12;
    }

    public final void h1(int i10, int i11, boolean z10, B0 b5) {
        int iM;
        this.f12836q.f1588l = this.f12837r.k() == 0 && this.f12837r.h() == 0;
        this.f12836q.f1584f = i10;
        int[] iArr = this.f12834D;
        iArr[0] = 0;
        iArr[1] = 0;
        F0(b5, iArr);
        int iMax = Math.max(0, iArr[0]);
        int iMax2 = Math.max(0, iArr[1]);
        boolean z11 = i10 == 1;
        N n6 = this.f12836q;
        int i12 = z11 ? iMax2 : iMax;
        n6.f1585h = i12;
        if (!z11) {
            iMax = iMax2;
        }
        n6.f1586i = iMax;
        if (z11) {
            n6.f1585h = this.f12837r.j() + i12;
            View viewW0 = W0();
            N n10 = this.f12836q;
            n10.f1583e = this.f12840u ? -1 : 1;
            int iH = AbstractC0135m0.H(viewW0);
            N n11 = this.f12836q;
            n10.f1582d = iH + n11.f1583e;
            n11.f1580b = this.f12837r.d(viewW0);
            iM = this.f12837r.d(viewW0) - this.f12837r.i();
        } else {
            View viewX0 = X0();
            N n12 = this.f12836q;
            n12.f1585h = this.f12837r.m() + n12.f1585h;
            N n13 = this.f12836q;
            n13.f1583e = this.f12840u ? 1 : -1;
            int iH2 = AbstractC0135m0.H(viewX0);
            N n14 = this.f12836q;
            n13.f1582d = iH2 + n14.f1583e;
            n14.f1580b = this.f12837r.g(viewX0);
            iM = (-this.f12837r.g(viewX0)) + this.f12837r.m();
        }
        N n15 = this.f12836q;
        n15.f1581c = i11;
        if (z10) {
            n15.f1581c = i11 - iM;
        }
        n15.g = iM;
    }

    @Override // E2.AbstractC0135m0
    public final void i(int i10, int i11, B0 b5, A a9) {
        if (this.f12835p != 0) {
            i10 = i11;
        }
        if (w() == 0 || i10 == 0) {
            return;
        }
        L0();
        h1(i10 > 0 ? 1 : -1, Math.abs(i10), true, b5);
        G0(b5, this.f12836q, a9);
    }

    public final void i1(int i10, int i11) {
        this.f12836q.f1581c = this.f12837r.i() - i11;
        N n6 = this.f12836q;
        n6.f1583e = this.f12840u ? -1 : 1;
        n6.f1582d = i10;
        n6.f1584f = 1;
        n6.f1580b = i11;
        n6.g = Integer.MIN_VALUE;
    }

    @Override // E2.AbstractC0135m0
    public final void j(int i10, A a9) {
        boolean z10;
        int i11;
        P p10 = this.f12845z;
        if (p10 == null || (i11 = p10.f1601r) < 0) {
            d1();
            z10 = this.f12840u;
            i11 = this.f12843x;
            if (i11 == -1) {
                i11 = z10 ? i10 - 1 : 0;
            }
        } else {
            z10 = p10.f1603t;
        }
        int i12 = z10 ? -1 : 1;
        for (int i13 = 0; i13 < this.f12833C && i11 >= 0 && i11 < i10; i13++) {
            a9.c(i11, 0);
            i11 += i12;
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0048  */
    /* JADX WARN: Code duplicated, block: B:21:0x0050  */
    @Override // E2.AbstractC0135m0
    public boolean j0(int i10, Bundle bundle) {
        int iMin;
        P p10;
        if (super.j0(i10, bundle)) {
            return true;
        }
        if (i10 == 16908343 && bundle != null) {
            if (this.f12835p == 1) {
                int i11 = bundle.getInt("android.view.accessibility.action.ARGUMENT_ROW_INT", -1);
                if (i11 >= 0) {
                    RecyclerView recyclerView = this.f1716b;
                    iMin = Math.min(i11, J(recyclerView.f12912t, recyclerView.f12923y0) - 1);
                    if (iMin >= 0) {
                        this.f12843x = iMin;
                        this.f12844y = 0;
                        p10 = this.f12845z;
                        if (p10 != null) {
                            p10.f1601r = -1;
                        }
                        q0();
                        return true;
                    }
                }
            } else {
                int i12 = bundle.getInt("android.view.accessibility.action.ARGUMENT_COLUMN_INT", -1);
                if (i12 >= 0) {
                    RecyclerView recyclerView2 = this.f1716b;
                    iMin = Math.min(i12, y(recyclerView2.f12912t, recyclerView2.f12923y0) - 1);
                    if (iMin >= 0) {
                        this.f12843x = iMin;
                        this.f12844y = 0;
                        p10 = this.f12845z;
                        if (p10 != null) {
                            p10.f1601r = -1;
                        }
                        q0();
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final void j1(int i10, int i11) {
        this.f12836q.f1581c = i11 - this.f12837r.m();
        N n6 = this.f12836q;
        n6.f1582d = i10;
        n6.f1583e = this.f12840u ? 1 : -1;
        n6.f1584f = -1;
        n6.f1580b = i11;
        n6.g = Integer.MIN_VALUE;
    }

    @Override // E2.AbstractC0135m0
    public final int k(B0 b5) {
        return H0(b5);
    }

    @Override // E2.AbstractC0135m0
    public int l(B0 b5) {
        return I0(b5);
    }

    @Override // E2.AbstractC0135m0
    public int m(B0 b5) {
        return J0(b5);
    }

    @Override // E2.AbstractC0135m0
    public final int n(B0 b5) {
        return H0(b5);
    }

    @Override // E2.AbstractC0135m0
    public int o(B0 b5) {
        return I0(b5);
    }

    @Override // E2.AbstractC0135m0
    public int p(B0 b5) {
        return J0(b5);
    }

    @Override // E2.AbstractC0135m0
    public final View r(int i10) {
        int iW = w();
        if (iW == 0) {
            return null;
        }
        int iH = i10 - AbstractC0135m0.H(v(0));
        if (iH >= 0 && iH < iW) {
            View viewV = v(iH);
            if (AbstractC0135m0.H(viewV) == i10) {
                return viewV;
            }
        }
        return super.r(i10);
    }

    @Override // E2.AbstractC0135m0
    public int r0(int i10, u0 u0Var, B0 b5) {
        if (this.f12835p == 1) {
            return 0;
        }
        return e1(i10, u0Var, b5);
    }

    @Override // E2.AbstractC0135m0
    public C0137n0 s() {
        return new C0137n0(-2, -2);
    }

    @Override // E2.AbstractC0135m0
    public final void s0(int i10) {
        this.f12843x = i10;
        this.f12844y = Integer.MIN_VALUE;
        P p10 = this.f12845z;
        if (p10 != null) {
            p10.f1601r = -1;
        }
        q0();
    }

    @Override // E2.AbstractC0135m0
    public int t0(int i10, u0 u0Var, B0 b5) {
        if (this.f12835p == 0) {
            return 0;
        }
        return e1(i10, u0Var, b5);
    }

    @SuppressLint({"UnknownNullness"})
    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i10, int i11) {
        this.f12835p = 1;
        this.f12839t = false;
        this.f12840u = false;
        this.f12841v = false;
        this.f12842w = true;
        this.f12843x = -1;
        this.f12844y = Integer.MIN_VALUE;
        this.f12845z = null;
        this.f12831A = new L();
        this.f12832B = new M();
        this.f12833C = 2;
        this.f12834D = new int[2];
        C0133l0 c0133l0I = AbstractC0135m0.I(context, attributeSet, i10, i11);
        f1(c0133l0I.f1705a);
        boolean z10 = c0133l0I.f1707c;
        c(null);
        if (z10 != this.f12839t) {
            this.f12839t = z10;
            q0();
        }
        g1(c0133l0I.f1708d);
    }

    @Override // E2.AbstractC0135m0
    public final void T(RecyclerView recyclerView) {
    }

    public void a1(u0 u0Var, B0 b5, L l10, int i10) {
    }
}
