package androidx.recyclerview.widget;

import E2.A;
import E2.A0;
import E2.AbstractC0114c;
import E2.AbstractC0135m0;
import E2.B0;
import E2.C0133l0;
import E2.C0137n0;
import E2.J0;
import E2.K;
import E2.K0;
import E2.L0;
import E2.M0;
import E2.N0;
import E2.Q;
import E2.RunnableC0147v;
import E2.W;
import E2.u0;
import I1.S;
import J1.f;
import J1.g;
import M.k;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.WeakHashMap;
import p123m2.c;

/* JADX INFO: loaded from: classes.dex */
public class StaggeredGridLayoutManager extends AbstractC0135m0 implements A0 {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final k f12927B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final int f12928C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public boolean f12929D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public boolean f12930E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public M0 f12931F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final Rect f12932G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final J0 f12933H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public final boolean f12934I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public int[] f12935J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public final RunnableC0147v f12936K;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f12937p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final N0[] f12938q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final W f12939r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final W f12940s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f12941t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f12942u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final K f12943v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f12944w;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final BitSet f12946y;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f12945x = false;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f12947z = -1;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f12926A = Integer.MIN_VALUE;

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i10, int i11) {
        this.f12937p = -1;
        this.f12944w = false;
        k kVar = new k(8, false);
        this.f12927B = kVar;
        this.f12928C = 2;
        this.f12932G = new Rect();
        this.f12933H = new J0(this);
        this.f12934I = true;
        this.f12936K = new RunnableC0147v(2, this);
        C0133l0 c0133l0I = AbstractC0135m0.I(context, attributeSet, i10, i11);
        int i12 = c0133l0I.f1705a;
        if (i12 != 0 && i12 != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        c(null);
        if (i12 != this.f12941t) {
            this.f12941t = i12;
            W w9 = this.f12939r;
            this.f12939r = this.f12940s;
            this.f12940s = w9;
            q0();
        }
        int i13 = c0133l0I.f1706b;
        c(null);
        if (i13 != this.f12937p) {
            kVar.j();
            q0();
            this.f12937p = i13;
            this.f12946y = new BitSet(this.f12937p);
            this.f12938q = new N0[this.f12937p];
            for (int i14 = 0; i14 < this.f12937p; i14++) {
                this.f12938q[i14] = new N0(this, i14);
            }
            q0();
        }
        boolean z10 = c0133l0I.f1707c;
        c(null);
        M0 m10 = this.f12931F;
        if (m10 != null && m10.f1577y != z10) {
            m10.f1577y = z10;
        }
        this.f12944w = z10;
        q0();
        K k7 = new K();
        k7.f1547a = true;
        k7.f1552f = 0;
        k7.g = 0;
        this.f12943v = k7;
        this.f12939r = W.b(this, this.f12941t);
        this.f12940s = W.b(this, 1 - this.f12941t);
    }

    public static int f1(int i10, int i11, int i12) {
        int mode;
        return (!(i11 == 0 && i12 == 0) && ((mode = View.MeasureSpec.getMode(i10)) == Integer.MIN_VALUE || mode == 1073741824)) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i10) - i11) - i12), mode) : i10;
    }

    @Override // E2.AbstractC0135m0
    public final void C0(RecyclerView recyclerView, B0 b5, int i10) {
        Q q10 = new Q(recyclerView.getContext());
        q10.f1604a = i10;
        D0(q10);
    }

    @Override // E2.AbstractC0135m0
    public final boolean E0() {
        return this.f12931F == null;
    }

    public final boolean F0() {
        int iM0;
        if (w() != 0 && this.f12928C != 0 && this.g) {
            if (this.f12945x) {
                iM0 = N0();
                M0();
            } else {
                iM0 = M0();
                N0();
            }
            if (iM0 == 0 && R0() != null) {
                this.f12927B.j();
                this.f1720f = true;
                q0();
                return true;
            }
        }
        return false;
    }

    public final int G0(B0 b5) {
        if (w() == 0) {
            return 0;
        }
        boolean z10 = !this.f12934I;
        return AbstractC0114c.g(b5, this.f12939r, J0(z10), I0(z10), this, this.f12934I, this.f12945x);
    }

    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v24 */
    /* JADX WARN: Type inference failed for: r8v3, types: [boolean, int] */
    public final int H0(u0 u0Var, K k7, B0 b5) {
        N0 n6;
        ?? r10;
        int iJ;
        int iE;
        int iM;
        int iE2;
        int i10;
        int i11;
        int i12;
        int i13 = 0;
        int i14 = 1;
        this.f12946y.set(0, this.f12937p, true);
        K k10 = this.f12943v;
        int i15 = k10.f1554i ? k7.f1551e == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE : k7.f1551e == 1 ? k7.g + k7.f1548b : k7.f1552f - k7.f1548b;
        int i16 = k7.f1551e;
        for (int i17 = 0; i17 < this.f12937p; i17++) {
            if (!((ArrayList) this.f12938q[i17].f1594f).isEmpty()) {
                e1(this.f12938q[i17], i16, i15);
            }
        }
        int i18 = this.f12945x ? this.f12939r.i() : this.f12939r.m();
        boolean z10 = false;
        while (true) {
            int i19 = k7.f1549c;
            if (i19 < 0 || i19 >= b5.b() || (!k10.f1554i && this.f12946y.isEmpty())) {
                break;
            }
            View view = u0Var.k(Long.MAX_VALUE, k7.f1549c).f1486a;
            k7.f1549c += k7.f1550d;
            K0 k11 = (K0) view.getLayoutParams();
            int iC = k11.f1733a.c();
            k kVar = this.f12927B;
            int[] iArr = (int[]) kVar.f5618s;
            int i20 = (iArr == null || iC >= iArr.length) ? -1 : iArr[iC];
            if (i20 == -1) {
                if (V0(k7.f1551e)) {
                    i12 = this.f12937p - i14;
                    i11 = -1;
                    i10 = -1;
                } else {
                    i10 = i14;
                    i11 = this.f12937p;
                    i12 = i13;
                }
                N0 n10 = null;
                if (k7.f1551e == i14) {
                    int iM2 = this.f12939r.m();
                    int i21 = Integer.MAX_VALUE;
                    while (i12 != i11) {
                        N0 n11 = this.f12938q[i12];
                        int iH = n11.h(iM2);
                        if (iH < i21) {
                            i21 = iH;
                            n10 = n11;
                        }
                        i12 += i10;
                    }
                } else {
                    int i22 = this.f12939r.i();
                    int i23 = Integer.MIN_VALUE;
                    while (i12 != i11) {
                        N0 n12 = this.f12938q[i12];
                        int iJ2 = n12.j(i22);
                        if (iJ2 > i23) {
                            n10 = n12;
                            i23 = iJ2;
                        }
                        i12 += i10;
                    }
                }
                n6 = n10;
                kVar.n(iC);
                ((int[]) kVar.f5618s)[iC] = n6.f1593e;
            } else {
                n6 = this.f12938q[i20];
            }
            k11.f1555e = n6;
            if (k7.f1551e == 1) {
                r10 = 0;
                b(view, -1, false);
            } else {
                r10 = 0;
                b(view, 0, false);
            }
            if (this.f12941t == 1) {
                T0(view, AbstractC0135m0.x(r10, this.f12942u, this.f1724l, r10, ((ViewGroup.MarginLayoutParams) k11).width), AbstractC0135m0.x(true, this.f1727o, this.f1725m, D() + G(), ((ViewGroup.MarginLayoutParams) k11).height));
            } else {
                T0(view, AbstractC0135m0.x(true, this.f1726n, this.f1724l, F() + E(), ((ViewGroup.MarginLayoutParams) k11).width), AbstractC0135m0.x(false, this.f12942u, this.f1725m, 0, ((ViewGroup.MarginLayoutParams) k11).height));
            }
            if (k7.f1551e == 1) {
                iE = n6.h(i18);
                iJ = this.f12939r.e(view) + iE;
            } else {
                iJ = n6.j(i18);
                iE = iJ - this.f12939r.e(view);
            }
            if (k7.f1551e == 1) {
                N0 n13 = k11.f1555e;
                n13.getClass();
                K0 k12 = (K0) view.getLayoutParams();
                k12.f1555e = n13;
                ArrayList arrayList = (ArrayList) n13.f1594f;
                arrayList.add(view);
                n13.f1591c = Integer.MIN_VALUE;
                if (arrayList.size() == 1) {
                    n13.f1590b = Integer.MIN_VALUE;
                }
                if (k12.f1733a.i() || k12.f1733a.l()) {
                    n13.f1592d = ((StaggeredGridLayoutManager) n13.g).f12939r.e(view) + n13.f1592d;
                }
            } else {
                N0 n14 = k11.f1555e;
                n14.getClass();
                K0 k13 = (K0) view.getLayoutParams();
                k13.f1555e = n14;
                ArrayList arrayList2 = (ArrayList) n14.f1594f;
                arrayList2.add(0, view);
                n14.f1590b = Integer.MIN_VALUE;
                if (arrayList2.size() == 1) {
                    n14.f1591c = Integer.MIN_VALUE;
                }
                if (k13.f1733a.i() || k13.f1733a.l()) {
                    n14.f1592d = ((StaggeredGridLayoutManager) n14.g).f12939r.e(view) + n14.f1592d;
                }
            }
            if (S0() && this.f12941t == 1) {
                iE2 = this.f12940s.i() - (((this.f12937p - 1) - n6.f1593e) * this.f12942u);
                iM = iE2 - this.f12940s.e(view);
            } else {
                iM = this.f12940s.m() + (n6.f1593e * this.f12942u);
                iE2 = this.f12940s.e(view) + iM;
            }
            if (this.f12941t == 1) {
                AbstractC0135m0.O(view, iM, iE, iE2, iJ);
            } else {
                AbstractC0135m0.O(view, iE, iM, iJ, iE2);
            }
            e1(n6, k10.f1551e, i15);
            X0(u0Var, k10);
            if (k10.f1553h && view.hasFocusable()) {
                this.f12946y.set(n6.f1593e, false);
            }
            i14 = 1;
            z10 = true;
            i13 = 0;
        }
        if (!z10) {
            X0(u0Var, k10);
        }
        int iM3 = k10.f1551e == -1 ? this.f12939r.m() - P0(this.f12939r.m()) : O0(this.f12939r.i()) - this.f12939r.i();
        if (iM3 > 0) {
            return Math.min(k7.f1548b, iM3);
        }
        return 0;
    }

    public final View I0(boolean z10) {
        int iM = this.f12939r.m();
        int i10 = this.f12939r.i();
        View view = null;
        for (int iW = w() - 1; iW >= 0; iW--) {
            View viewV = v(iW);
            int iG = this.f12939r.g(viewV);
            int iD = this.f12939r.d(viewV);
            if (iD > iM && iG < i10) {
                if (iD <= i10 || !z10) {
                    return viewV;
                }
                if (view == null) {
                    view = viewV;
                }
            }
        }
        return view;
    }

    @Override // E2.AbstractC0135m0
    public final int J(u0 u0Var, B0 b5) {
        if (this.f12941t == 0) {
            return Math.min(this.f12937p, b5.b());
        }
        return -1;
    }

    public final View J0(boolean z10) {
        int iM = this.f12939r.m();
        int i10 = this.f12939r.i();
        int iW = w();
        View view = null;
        for (int i11 = 0; i11 < iW; i11++) {
            View viewV = v(i11);
            int iG = this.f12939r.g(viewV);
            if (this.f12939r.d(viewV) > iM && iG < i10) {
                if (iG >= iM || !z10) {
                    return viewV;
                }
                if (view == null) {
                    view = viewV;
                }
            }
        }
        return view;
    }

    public final void K0(u0 u0Var, B0 b5, boolean z10) {
        int i10;
        int iO0 = O0(Integer.MIN_VALUE);
        if (iO0 != Integer.MIN_VALUE && (i10 = this.f12939r.i() - iO0) > 0) {
            int i11 = i10 - (-b1(-i10, u0Var, b5));
            if (!z10 || i11 <= 0) {
                return;
            }
            this.f12939r.q(i11);
        }
    }

    @Override // E2.AbstractC0135m0
    public final boolean L() {
        return this.f12928C != 0;
    }

    public final void L0(u0 u0Var, B0 b5, boolean z10) {
        int iM;
        int iP0 = P0(Integer.MAX_VALUE);
        if (iP0 != Integer.MAX_VALUE && (iM = iP0 - this.f12939r.m()) > 0) {
            int iB1 = iM - b1(iM, u0Var, b5);
            if (!z10 || iB1 <= 0) {
                return;
            }
            this.f12939r.q(-iB1);
        }
    }

    @Override // E2.AbstractC0135m0
    public final boolean M() {
        return this.f12944w;
    }

    public final int M0() {
        if (w() == 0) {
            return 0;
        }
        return AbstractC0135m0.H(v(0));
    }

    public final int N0() {
        int iW = w();
        if (iW == 0) {
            return 0;
        }
        return AbstractC0135m0.H(v(iW - 1));
    }

    public final int O0(int i10) {
        int iH = this.f12938q[0].h(i10);
        for (int i11 = 1; i11 < this.f12937p; i11++) {
            int iH2 = this.f12938q[i11].h(i10);
            if (iH2 > iH) {
                iH = iH2;
            }
        }
        return iH;
    }

    @Override // E2.AbstractC0135m0
    public final void P(int i10) {
        super.P(i10);
        for (int i11 = 0; i11 < this.f12937p; i11++) {
            N0 n6 = this.f12938q[i11];
            int i12 = n6.f1590b;
            if (i12 != Integer.MIN_VALUE) {
                n6.f1590b = i12 + i10;
            }
            int i13 = n6.f1591c;
            if (i13 != Integer.MIN_VALUE) {
                n6.f1591c = i13 + i10;
            }
        }
    }

    public final int P0(int i10) {
        int iJ = this.f12938q[0].j(i10);
        for (int i11 = 1; i11 < this.f12937p; i11++) {
            int iJ2 = this.f12938q[i11].j(i10);
            if (iJ2 < iJ) {
                iJ = iJ2;
            }
        }
        return iJ;
    }

    @Override // E2.AbstractC0135m0
    public final void Q(int i10) {
        super.Q(i10);
        for (int i11 = 0; i11 < this.f12937p; i11++) {
            N0 n6 = this.f12938q[i11];
            int i12 = n6.f1590b;
            if (i12 != Integer.MIN_VALUE) {
                n6.f1590b = i12 + i10;
            }
            int i13 = n6.f1591c;
            if (i13 != Integer.MIN_VALUE) {
                n6.f1591c = i13 + i10;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0034  */
    /* JADX WARN: Code duplicated, block: B:22:0x0036 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:24:0x0039  */
    /* JADX WARN: Code duplicated, block: B:26:0x0041  */
    /* JADX WARN: Code duplicated, block: B:29:0x0050 A[LOOP:0: B:25:0x003f->B:29:0x0050, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:30:0x0053 A[EDGE_INSN: B:30:0x0053->B:31:0x0054 BREAK  A[LOOP:0: B:25:0x003f->B:29:0x0050]] */
    /* JADX WARN: Code duplicated, block: B:32:0x0056  */
    /* JADX WARN: Code duplicated, block: B:35:0x0068  */
    /* JADX WARN: Code duplicated, block: B:38:0x0077 A[LOOP:1: B:34:0x0066->B:38:0x0077, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:41:0x007d  */
    /* JADX WARN: Code duplicated, block: B:43:0x0092  */
    /* JADX WARN: Code duplicated, block: B:44:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:47:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:49:0x00b8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:51:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:52:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:53:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:56:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:58:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:59:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:61:0x00db  */
    /* JADX WARN: Code duplicated, block: B:63:0x0053 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:0x0054 A[EDGE_INSN: B:64:0x0054->B:31:0x0054 BREAK  A[LOOP:0: B:25:0x003f->B:29:0x0050], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:0x007a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x007b A[EDGE_INSN: B:66:0x007b->B:40:0x007b BREAK  A[LOOP:1: B:34:0x0066->B:38:0x0077], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:67:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:? A[RETURN, SYNTHETIC] */
    public final void Q0(int i10, int i11, int i12) {
        int i13;
        int i14;
        k kVar;
        int[] iArr;
        int iN0;
        ArrayList arrayList;
        L0 l10;
        int size;
        int i15;
        int i16;
        int size2;
        int iN1 = this.f12945x ? N0() : M0();
        if (i12 == 8) {
            if (i10 < i11) {
                i13 = i11 + 1;
            } else {
                i13 = i10 + 1;
                i14 = i11;
            }
            kVar = this.f12927B;
            iArr = (int[]) kVar.f5618s;
            if (iArr != null && i14 < iArr.length) {
                arrayList = (ArrayList) kVar.f5619t;
                if (arrayList != null) {
                    if (arrayList == null) {
                        size2 = arrayList.size() - 1;
                        while (true) {
                            if (size2 >= 0) {
                                l10 = null;
                                break;
                            }
                            l10 = (L0) ((ArrayList) kVar.f5619t).get(size2);
                            if (l10.f1561r == i14) {
                                break;
                            } else {
                                size2--;
                            }
                        }
                    } else {
                        l10 = null;
                        break;
                    }
                    if (l10 != null) {
                        ((ArrayList) kVar.f5619t).remove(l10);
                    }
                    size = ((ArrayList) kVar.f5619t).size();
                    i15 = 0;
                    while (true) {
                        if (i15 < size) {
                            i15 = -1;
                            break;
                        } else if (((L0) ((ArrayList) kVar.f5619t).get(i15)).f1561r >= i14) {
                            break;
                        } else {
                            i15++;
                        }
                    }
                    if (i15 != -1) {
                        L0 l11 = (L0) ((ArrayList) kVar.f5619t).get(i15);
                        ((ArrayList) kVar.f5619t).remove(i15);
                        i16 = l11.f1561r;
                    } else {
                        i16 = -1;
                    }
                } else {
                    i16 = -1;
                }
                if (i16 == -1) {
                    int[] iArr2 = (int[]) kVar.f5618s;
                    Arrays.fill(iArr2, i14, iArr2.length, -1);
                    int length = ((int[]) kVar.f5618s).length;
                } else {
                    Arrays.fill((int[]) kVar.f5618s, i14, Math.min(i16 + 1, ((int[]) kVar.f5618s).length), -1);
                }
            }
            if (i12 != 1) {
                kVar.B(i10, i11);
            } else if (i12 != 2) {
                kVar.C(i10, i11);
            } else if (i12 == 8) {
                kVar.C(i10, 1);
                kVar.B(i11, 1);
            }
            if (i13 <= iN1) {
                return;
            }
            if (this.f12945x) {
                iN0 = M0();
            } else {
                iN0 = N0();
            }
            if (i14 <= iN0) {
                q0();
            }
        }
        i13 = i10 + i11;
        i14 = i10;
        kVar = this.f12927B;
        iArr = (int[]) kVar.f5618s;
        if (iArr != null) {
            arrayList = (ArrayList) kVar.f5619t;
            if (arrayList != null) {
                if (arrayList == null) {
                    size2 = arrayList.size() - 1;
                    while (true) {
                        if (size2 >= 0) {
                            l10 = null;
                            break;
                        }
                        l10 = (L0) ((ArrayList) kVar.f5619t).get(size2);
                        if (l10.f1561r == i14) {
                            break;
                            break;
                        }
                        size2--;
                    }
                } else {
                    l10 = null;
                    break;
                }
                if (l10 != null) {
                    ((ArrayList) kVar.f5619t).remove(l10);
                }
                size = ((ArrayList) kVar.f5619t).size();
                i15 = 0;
                while (true) {
                    if (i15 < size) {
                        i15 = -1;
                        break;
                    } else {
                        if (((L0) ((ArrayList) kVar.f5619t).get(i15)).f1561r >= i14) {
                            break;
                            break;
                        }
                        i15++;
                    }
                }
                if (i15 != -1) {
                    L0 l12 = (L0) ((ArrayList) kVar.f5619t).get(i15);
                    ((ArrayList) kVar.f5619t).remove(i15);
                    i16 = l12.f1561r;
                } else {
                    i16 = -1;
                }
            } else {
                i16 = -1;
            }
            if (i16 == -1) {
                int[] iArr3 = (int[]) kVar.f5618s;
                Arrays.fill(iArr3, i14, iArr3.length, -1);
                int length2 = ((int[]) kVar.f5618s).length;
            } else {
                Arrays.fill((int[]) kVar.f5618s, i14, Math.min(i16 + 1, ((int[]) kVar.f5618s).length), -1);
            }
        }
        if (i12 != 1) {
            kVar.B(i10, i11);
        } else if (i12 != 2) {
            kVar.C(i10, i11);
        } else if (i12 == 8) {
            kVar.C(i10, 1);
            kVar.B(i11, 1);
        }
        if (i13 <= iN1) {
            return;
        }
        if (this.f12945x) {
            iN0 = M0();
        } else {
            iN0 = N0();
        }
        if (i14 <= iN0) {
            q0();
        }
    }

    @Override // E2.AbstractC0135m0
    public final void R() {
        this.f12927B.j();
        for (int i10 = 0; i10 < this.f12937p; i10++) {
            this.f12938q[i10].b();
        }
    }

    /* JADX WARN: Code duplicated, block: B:51:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:52:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:54:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:55:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:68:0x00fe A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:0x002c A[SYNTHETIC] */
    public final View R0() {
        boolean z10;
        boolean z11;
        int iW = w();
        int i10 = iW - 1;
        BitSet bitSet = new BitSet(this.f12937p);
        bitSet.set(0, this.f12937p, true);
        byte b5 = (this.f12941t == 1 && S0()) ? (byte) 1 : (byte) -1;
        if (this.f12945x) {
            iW = -1;
        } else {
            i10 = 0;
        }
        int i11 = i10 < iW ? 1 : -1;
        while (i10 != iW) {
            View viewV = v(i10);
            K0 k7 = (K0) viewV.getLayoutParams();
            if (bitSet.get(k7.f1555e.f1593e)) {
                N0 n6 = k7.f1555e;
                if (this.f12945x) {
                    int i12 = n6.f1591c;
                    if (i12 == Integer.MIN_VALUE) {
                        n6.a();
                        i12 = n6.f1591c;
                    }
                    if (i12 < this.f12939r.i()) {
                        ((K0) ((View) c.q(1, (ArrayList) n6.f1594f)).getLayoutParams()).getClass();
                        return viewV;
                    }
                } else {
                    int i13 = n6.f1590b;
                    ArrayList arrayList = (ArrayList) n6.f1594f;
                    if (i13 == Integer.MIN_VALUE) {
                        View view = (View) arrayList.get(0);
                        K0 k10 = (K0) view.getLayoutParams();
                        n6.f1590b = ((StaggeredGridLayoutManager) n6.g).f12939r.g(view);
                        k10.getClass();
                        i13 = n6.f1590b;
                    }
                    if (i13 > this.f12939r.m()) {
                        ((K0) ((View) arrayList.get(0)).getLayoutParams()).getClass();
                        return viewV;
                    }
                }
                bitSet.clear(k7.f1555e.f1593e);
            }
            i10 += i11;
            if (i10 != iW) {
                View viewV2 = v(i10);
                if (this.f12945x) {
                    int iD = this.f12939r.d(viewV);
                    int iD2 = this.f12939r.d(viewV2);
                    if (iD >= iD2) {
                        if (iD == iD2) {
                            if (k7.f1555e.f1593e - ((K0) viewV2.getLayoutParams()).f1555e.f1593e < 0) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (b5 < 0) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            if (z10 != z11) {
                            }
                        } else {
                            continue;
                        }
                    }
                    return viewV;
                }
                int iG = this.f12939r.g(viewV);
                int iG2 = this.f12939r.g(viewV2);
                if (iG <= iG2) {
                    if (iG == iG2) {
                        if (k7.f1555e.f1593e - ((K0) viewV2.getLayoutParams()).f1555e.f1593e < 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (b5 < 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (z10 != z11) {
                        }
                    } else {
                        continue;
                    }
                }
                return viewV;
            }
        }
        return null;
    }

    public final boolean S0() {
        return this.f1716b.getLayoutDirection() == 1;
    }

    @Override // E2.AbstractC0135m0
    public final void T(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f1716b;
        if (recyclerView2 != null) {
            recyclerView2.removeCallbacks(this.f12936K);
        }
        for (int i10 = 0; i10 < this.f12937p; i10++) {
            this.f12938q[i10].b();
        }
        recyclerView.requestLayout();
    }

    public final void T0(View view, int i10, int i11) {
        Rect rect = this.f12932G;
        d(rect, view);
        K0 k7 = (K0) view.getLayoutParams();
        int iF1 = f1(i10, ((ViewGroup.MarginLayoutParams) k7).leftMargin + rect.left, ((ViewGroup.MarginLayoutParams) k7).rightMargin + rect.right);
        int iF2 = f1(i11, ((ViewGroup.MarginLayoutParams) k7).topMargin + rect.top, ((ViewGroup.MarginLayoutParams) k7).bottomMargin + rect.bottom);
        if (z0(view, iF1, iF2, k7)) {
            view.measure(iF1, iF2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0048  */
    /* JADX WARN: Code duplicated, block: B:37:0x0053  */
    @Override // E2.AbstractC0135m0
    public final View U(View view, int i10, u0 u0Var, B0 b5) {
        View viewF;
        int i11;
        if (w() != 0) {
            RecyclerView recyclerView = this.f1716b;
            if (recyclerView == null || (viewF = recyclerView.F(view)) == null || ((ArrayList) this.f1715a.f1676e).contains(viewF)) {
                viewF = null;
            }
            if (viewF != null) {
                a1();
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 != 17) {
                            if (i10 != 33) {
                                if (i10 == 66 ? this.f12941t == 0 : !(i10 != 130 || this.f12941t != 1)) {
                                    i11 = 1;
                                }
                            } else if (this.f12941t == 1) {
                                i11 = -1;
                            }
                            i11 = Integer.MIN_VALUE;
                        } else if (this.f12941t == 0) {
                            i11 = -1;
                        } else {
                            i11 = Integer.MIN_VALUE;
                        }
                    } else if (this.f12941t != 1 && S0()) {
                        i11 = -1;
                    } else {
                        i11 = 1;
                    }
                } else if (this.f12941t != 1 && S0()) {
                    i11 = 1;
                } else {
                    i11 = -1;
                }
                if (i11 != Integer.MIN_VALUE) {
                    K0 k7 = (K0) viewF.getLayoutParams();
                    k7.getClass();
                    N0 n6 = k7.f1555e;
                    int iN0 = i11 == 1 ? N0() : M0();
                    d1(iN0, b5);
                    c1(i11);
                    K k10 = this.f12943v;
                    k10.f1549c = k10.f1550d + iN0;
                    k10.f1548b = (int) (this.f12939r.n() * 0.33333334f);
                    k10.f1553h = true;
                    k10.f1547a = false;
                    H0(u0Var, k10, b5);
                    this.f12929D = this.f12945x;
                    View viewI = n6.i(iN0, i11);
                    if (viewI != null && viewI != viewF) {
                        return viewI;
                    }
                    if (V0(i11)) {
                        for (int i12 = this.f12937p - 1; i12 >= 0; i12--) {
                            View viewI2 = this.f12938q[i12].i(iN0, i11);
                            if (viewI2 != null && viewI2 != viewF) {
                                return viewI2;
                            }
                        }
                    } else {
                        for (int i13 = 0; i13 < this.f12937p; i13++) {
                            View viewI3 = this.f12938q[i13].i(iN0, i11);
                            if (viewI3 != null && viewI3 != viewF) {
                                return viewI3;
                            }
                        }
                    }
                    boolean z10 = (this.f12944w ^ true) == (i11 == -1);
                    View viewR = r(z10 ? n6.d() : n6.e());
                    if (viewR != null && viewR != viewF) {
                        return viewR;
                    }
                    if (V0(i11)) {
                        for (int i14 = this.f12937p - 1; i14 >= 0; i14--) {
                            if (i14 != n6.f1593e) {
                                View viewR2 = r(z10 ? this.f12938q[i14].d() : this.f12938q[i14].e());
                                if (viewR2 != null && viewR2 != viewF) {
                                    return viewR2;
                                }
                            }
                        }
                    } else {
                        for (int i15 = 0; i15 < this.f12937p; i15++) {
                            View viewR3 = r(z10 ? this.f12938q[i15].d() : this.f12938q[i15].e());
                            if (viewR3 != null && viewR3 != viewF) {
                                return viewR3;
                            }
                        }
                    }
                }
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:108:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:109:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:123:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:125:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:131:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:133:0x0209  */
    /* JADX WARN: Code duplicated, block: B:254:0x0419  */
    /* JADX WARN: Code duplicated, block: B:265:0x01fc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:269:0x01fc A[SYNTHETIC] */
    public final void U0(u0 u0Var, B0 b5, boolean z10) {
        boolean z11;
        M0 m10;
        int iW;
        int i10;
        int iH;
        int iH2;
        int iW2;
        int i11;
        boolean z12;
        M0 m11 = this.f12931F;
        J0 j10 = this.f12933H;
        if (!(m11 == null && this.f12947z == -1) && b5.b() == 0) {
            l0(u0Var);
            j10.a();
            return;
        }
        boolean z13 = j10.f1545e;
        StaggeredGridLayoutManager staggeredGridLayoutManager = j10.g;
        boolean z14 = (z13 && this.f12947z == -1 && this.f12931F == null) ? false : true;
        k kVar = this.f12927B;
        if (z14) {
            j10.a();
            M0 m12 = this.f12931F;
            if (m12 != null) {
                int i12 = m12.f1572t;
                if (i12 > 0) {
                    if (i12 == this.f12937p) {
                        for (int i13 = 0; i13 < this.f12937p; i13++) {
                            this.f12938q[i13].b();
                            M0 m13 = this.f12931F;
                            int i14 = m13.f1573u[i13];
                            if (i14 != Integer.MIN_VALUE) {
                                i14 += m13.f1578z ? this.f12939r.i() : this.f12939r.m();
                            }
                            N0 n6 = this.f12938q[i13];
                            n6.f1590b = i14;
                            n6.f1591c = i14;
                        }
                    } else {
                        m12.f1573u = null;
                        m12.f1572t = 0;
                        m12.f1574v = 0;
                        m12.f1575w = null;
                        m12.f1576x = null;
                        m12.f1570r = m12.f1571s;
                    }
                }
                M0 m14 = this.f12931F;
                this.f12930E = m14.f1569A;
                boolean z15 = m14.f1577y;
                c(null);
                M0 m15 = this.f12931F;
                if (m15 != null && m15.f1577y != z15) {
                    m15.f1577y = z15;
                }
                this.f12944w = z15;
                q0();
                a1();
                M0 m16 = this.f12931F;
                int i15 = m16.f1570r;
                if (i15 != -1) {
                    this.f12947z = i15;
                    j10.f1543c = m16.f1578z;
                } else {
                    j10.f1543c = this.f12945x;
                }
                if (m16.f1574v > 1) {
                    kVar.f5618s = m16.f1575w;
                    kVar.f5619t = m16.f1576x;
                }
            } else {
                a1();
                j10.f1543c = this.f12945x;
            }
            if (b5.g || (i11 = this.f12947z) == -1) {
                if (this.f12929D) {
                    int iB = b5.b();
                    iW2 = w() - 1;
                    while (true) {
                        if (iW2 < 0) {
                            iH2 = 0;
                            break;
                        }
                        iH2 = AbstractC0135m0.H(v(iW2));
                        if (iH2 < 0 && iH2 < iB) {
                            break;
                        } else {
                            iW2--;
                        }
                    }
                } else {
                    int iB2 = b5.b();
                    iW = w();
                    i10 = 0;
                    while (true) {
                        if (i10 >= iW) {
                            iH2 = 0;
                            break;
                        }
                        iH = AbstractC0135m0.H(v(i10));
                        if (iH < 0 && iH < iB2) {
                            iH2 = iH;
                            break;
                        }
                        i10++;
                    }
                }
                j10.f1541a = iH2;
                j10.f1542b = Integer.MIN_VALUE;
            } else if (i11 < 0 || i11 >= b5.b()) {
                this.f12947z = -1;
                this.f12926A = Integer.MIN_VALUE;
                if (this.f12929D) {
                    int iB3 = b5.b();
                    iW2 = w() - 1;
                    while (true) {
                        if (iW2 < 0) {
                            iH2 = 0;
                            break;
                        } else {
                            iH2 = AbstractC0135m0.H(v(iW2));
                            if (iH2 < 0) {
                            }
                            iW2--;
                        }
                    }
                } else {
                    int iB4 = b5.b();
                    iW = w();
                    i10 = 0;
                    while (true) {
                        if (i10 >= iW) {
                            iH2 = 0;
                            break;
                        } else {
                            iH = AbstractC0135m0.H(v(i10));
                            if (iH < 0) {
                            }
                            i10++;
                        }
                    }
                }
                j10.f1541a = iH2;
                j10.f1542b = Integer.MIN_VALUE;
            } else {
                M0 m17 = this.f12931F;
                if (m17 == null || m17.f1570r == -1 || m17.f1572t < 1) {
                    View viewR = r(this.f12947z);
                    if (viewR != null) {
                        j10.f1541a = this.f12945x ? N0() : M0();
                        if (this.f12926A != Integer.MIN_VALUE) {
                            if (j10.f1543c) {
                                j10.f1542b = (this.f12939r.i() - this.f12926A) - this.f12939r.d(viewR);
                            } else {
                                j10.f1542b = (this.f12939r.m() + this.f12926A) - this.f12939r.g(viewR);
                            }
                        } else if (this.f12939r.e(viewR) > this.f12939r.n()) {
                            j10.f1542b = j10.f1543c ? this.f12939r.i() : this.f12939r.m();
                        } else {
                            int iG = this.f12939r.g(viewR) - this.f12939r.m();
                            if (iG < 0) {
                                j10.f1542b = -iG;
                            } else {
                                int i16 = this.f12939r.i() - this.f12939r.d(viewR);
                                if (i16 < 0) {
                                    j10.f1542b = i16;
                                } else {
                                    j10.f1542b = Integer.MIN_VALUE;
                                }
                            }
                        }
                    } else {
                        int i17 = this.f12947z;
                        j10.f1541a = i17;
                        int i18 = this.f12926A;
                        if (i18 == Integer.MIN_VALUE) {
                            if (w() != 0) {
                                if ((i17 < M0()) != this.f12945x) {
                                    z12 = false;
                                } else {
                                    z12 = true;
                                }
                            } else if (this.f12945x) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            j10.f1543c = z12;
                            j10.f1542b = z12 ? staggeredGridLayoutManager.f12939r.i() : staggeredGridLayoutManager.f12939r.m();
                        } else if (j10.f1543c) {
                            j10.f1542b = staggeredGridLayoutManager.f12939r.i() - i18;
                        } else {
                            j10.f1542b = staggeredGridLayoutManager.f12939r.m() + i18;
                        }
                        j10.f1544d = true;
                    }
                } else {
                    j10.f1542b = Integer.MIN_VALUE;
                    j10.f1541a = this.f12947z;
                }
            }
            j10.f1545e = true;
        }
        if (this.f12931F == null && this.f12947z == -1 && (j10.f1543c != this.f12929D || S0() != this.f12930E)) {
            kVar.j();
            j10.f1544d = true;
        }
        if (w() > 0 && ((m10 = this.f12931F) == null || m10.f1572t < 1)) {
            if (j10.f1544d) {
                for (int i19 = 0; i19 < this.f12937p; i19++) {
                    this.f12938q[i19].b();
                    int i20 = j10.f1542b;
                    if (i20 != Integer.MIN_VALUE) {
                        N0 n10 = this.f12938q[i19];
                        n10.f1590b = i20;
                        n10.f1591c = i20;
                    }
                }
            } else if (z14 || j10.f1546f == null) {
                for (int i21 = 0; i21 < this.f12937p; i21++) {
                    N0 n11 = this.f12938q[i21];
                    boolean z16 = this.f12945x;
                    int i22 = j10.f1542b;
                    StaggeredGridLayoutManager staggeredGridLayoutManager2 = (StaggeredGridLayoutManager) n11.g;
                    int iH3 = z16 ? n11.h(Integer.MIN_VALUE) : n11.j(Integer.MIN_VALUE);
                    n11.b();
                    if (iH3 != Integer.MIN_VALUE && ((!z16 || iH3 >= staggeredGridLayoutManager2.f12939r.i()) && (z16 || iH3 <= staggeredGridLayoutManager2.f12939r.m()))) {
                        if (i22 != Integer.MIN_VALUE) {
                            iH3 += i22;
                        }
                        n11.f1591c = iH3;
                        n11.f1590b = iH3;
                    }
                }
                N0[] n0Arr = this.f12938q;
                int length = n0Arr.length;
                int[] iArr = j10.f1546f;
                if (iArr == null || iArr.length < length) {
                    j10.f1546f = new int[staggeredGridLayoutManager.f12938q.length];
                }
                for (int i23 = 0; i23 < length; i23++) {
                    j10.f1546f[i23] = n0Arr[i23].j(Integer.MIN_VALUE);
                }
            } else {
                for (int i24 = 0; i24 < this.f12937p; i24++) {
                    N0 n12 = this.f12938q[i24];
                    n12.b();
                    int i25 = j10.f1546f[i24];
                    n12.f1590b = i25;
                    n12.f1591c = i25;
                }
            }
        }
        q(u0Var);
        K k7 = this.f12943v;
        k7.f1547a = false;
        int iN = this.f12940s.n();
        this.f12942u = iN / this.f12937p;
        View.MeasureSpec.makeMeasureSpec(iN, this.f12940s.k());
        d1(j10.f1541a, b5);
        if (j10.f1543c) {
            c1(-1);
            H0(u0Var, k7, b5);
            c1(1);
            k7.f1549c = j10.f1541a + k7.f1550d;
            H0(u0Var, k7, b5);
        } else {
            c1(1);
            H0(u0Var, k7, b5);
            c1(-1);
            k7.f1549c = j10.f1541a + k7.f1550d;
            H0(u0Var, k7, b5);
        }
        if (this.f12940s.k() != 1073741824) {
            int iW3 = w();
            float fMax = 0.0f;
            for (int i26 = 0; i26 < iW3; i26++) {
                View viewV = v(i26);
                float fE = this.f12940s.e(viewV);
                if (fE >= fMax) {
                    ((K0) viewV.getLayoutParams()).getClass();
                    fMax = Math.max(fMax, fE);
                }
            }
            int i27 = this.f12942u;
            int iRound = Math.round(fMax * this.f12937p);
            if (this.f12940s.k() == Integer.MIN_VALUE) {
                iRound = Math.min(iRound, this.f12940s.n());
            }
            this.f12942u = iRound / this.f12937p;
            View.MeasureSpec.makeMeasureSpec(iRound, this.f12940s.k());
            if (this.f12942u != i27) {
                for (int i28 = 0; i28 < iW3; i28++) {
                    View viewV2 = v(i28);
                    K0 k10 = (K0) viewV2.getLayoutParams();
                    k10.getClass();
                    if (S0() && this.f12941t == 1) {
                        int i29 = -((this.f12937p - 1) - k10.f1555e.f1593e);
                        viewV2.offsetLeftAndRight((this.f12942u * i29) - (i29 * i27));
                    } else {
                        int i30 = k10.f1555e.f1593e;
                        int i31 = this.f12942u * i30;
                        int i32 = i30 * i27;
                        if (this.f12941t == 1) {
                            viewV2.offsetLeftAndRight(i31 - i32);
                        } else {
                            viewV2.offsetTopAndBottom(i31 - i32);
                        }
                    }
                }
            }
        }
        if (w() > 0) {
            if (this.f12945x) {
                K0(u0Var, b5, true);
                L0(u0Var, b5, false);
            } else {
                L0(u0Var, b5, true);
                K0(u0Var, b5, false);
            }
        }
        if (z10 && !b5.g && this.f12928C != 0 && w() > 0 && R0() != null) {
            RecyclerView recyclerView = this.f1716b;
            if (recyclerView != null) {
                recyclerView.removeCallbacks(this.f12936K);
            }
            z11 = F0();
        }
        if (b5.g) {
            j10.a();
        }
        this.f12929D = j10.f1543c;
        this.f12930E = S0();
        if (z11) {
            j10.a();
            U0(u0Var, b5, false);
        }
    }

    @Override // E2.AbstractC0135m0
    public final void V(AccessibilityEvent accessibilityEvent) {
        super.V(accessibilityEvent);
        if (w() > 0) {
            View viewJ0 = J0(false);
            View viewI0 = I0(false);
            if (viewJ0 == null || viewI0 == null) {
                return;
            }
            int iH = AbstractC0135m0.H(viewJ0);
            int iH2 = AbstractC0135m0.H(viewI0);
            if (iH < iH2) {
                accessibilityEvent.setFromIndex(iH);
                accessibilityEvent.setToIndex(iH2);
            } else {
                accessibilityEvent.setFromIndex(iH2);
                accessibilityEvent.setToIndex(iH);
            }
        }
    }

    public final boolean V0(int i10) {
        if (this.f12941t == 0) {
            return (i10 == -1) != this.f12945x;
        }
        return ((i10 == -1) == this.f12945x) == S0();
    }

    @Override // E2.AbstractC0135m0
    public final void W(u0 u0Var, B0 b5, g gVar) {
        super.W(u0Var, b5, gVar);
        gVar.m("androidx.recyclerview.widget.StaggeredGridLayoutManager");
    }

    public final void W0(int i10, B0 b5) {
        int iM0;
        int i11;
        if (i10 > 0) {
            iM0 = N0();
            i11 = 1;
        } else {
            iM0 = M0();
            i11 = -1;
        }
        K k7 = this.f12943v;
        k7.f1547a = true;
        d1(iM0, b5);
        c1(i11);
        k7.f1549c = iM0 + k7.f1550d;
        k7.f1548b = Math.abs(i10);
    }

    @Override // E2.AbstractC0135m0
    public final void X(u0 u0Var, B0 b5, View view, g gVar) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof K0)) {
            Y(view, gVar);
            return;
        }
        K0 k7 = (K0) layoutParams;
        if (this.f12941t == 0) {
            N0 n6 = k7.f1555e;
            gVar.o(f.a(n6 != null ? n6.f1593e : -1, 1, -1, -1, false, false));
        } else {
            N0 n10 = k7.f1555e;
            gVar.o(f.a(-1, -1, n10 != null ? n10.f1593e : -1, 1, false, false));
        }
    }

    public final void X0(u0 u0Var, K k7) {
        int iMin;
        if (!k7.f1547a || k7.f1554i) {
            return;
        }
        if (k7.f1548b == 0) {
            if (k7.f1551e == -1) {
                Y0(u0Var, k7.g);
                return;
            } else {
                Z0(u0Var, k7.f1552f);
                return;
            }
        }
        int i10 = 1;
        if (k7.f1551e == -1) {
            int i11 = k7.f1552f;
            int iJ = this.f12938q[0].j(i11);
            while (i10 < this.f12937p) {
                int iJ2 = this.f12938q[i10].j(i11);
                if (iJ2 > iJ) {
                    iJ = iJ2;
                }
                i10++;
            }
            int i12 = i11 - iJ;
            Y0(u0Var, i12 < 0 ? k7.g : k7.g - Math.min(i12, k7.f1548b));
            return;
        }
        int i13 = k7.g;
        int iH = this.f12938q[0].h(i13);
        while (i10 < this.f12937p) {
            int iH2 = this.f12938q[i10].h(i13);
            if (iH2 < iH) {
                iH = iH2;
            }
            i10++;
        }
        int i14 = iH - k7.g;
        if (i14 < 0) {
            iMin = k7.f1552f;
        } else {
            iMin = Math.min(i14, k7.f1548b) + k7.f1552f;
        }
        Z0(u0Var, iMin);
    }

    public final void Y0(u0 u0Var, int i10) {
        for (int iW = w() - 1; iW >= 0; iW--) {
            View viewV = v(iW);
            if (this.f12939r.g(viewV) < i10 || this.f12939r.p(viewV) < i10) {
                return;
            }
            K0 k7 = (K0) viewV.getLayoutParams();
            k7.getClass();
            if (((ArrayList) k7.f1555e.f1594f).size() == 1) {
                return;
            }
            N0 n6 = k7.f1555e;
            ArrayList arrayList = (ArrayList) n6.f1594f;
            int size = arrayList.size();
            View view = (View) arrayList.remove(size - 1);
            K0 k10 = (K0) view.getLayoutParams();
            k10.f1555e = null;
            if (k10.f1733a.i() || k10.f1733a.l()) {
                n6.f1592d -= ((StaggeredGridLayoutManager) n6.g).f12939r.e(view);
            }
            if (size == 1) {
                n6.f1590b = Integer.MIN_VALUE;
            }
            n6.f1591c = Integer.MIN_VALUE;
            n0(viewV, u0Var);
        }
    }

    @Override // E2.AbstractC0135m0
    public final void Z(int i10, int i11) {
        Q0(i10, i11, 1);
    }

    public final void Z0(u0 u0Var, int i10) {
        while (w() > 0) {
            View viewV = v(0);
            if (this.f12939r.d(viewV) > i10 || this.f12939r.o(viewV) > i10) {
                return;
            }
            K0 k7 = (K0) viewV.getLayoutParams();
            k7.getClass();
            if (((ArrayList) k7.f1555e.f1594f).size() == 1) {
                return;
            }
            N0 n6 = k7.f1555e;
            ArrayList arrayList = (ArrayList) n6.f1594f;
            View view = (View) arrayList.remove(0);
            K0 k10 = (K0) view.getLayoutParams();
            k10.f1555e = null;
            if (arrayList.size() == 0) {
                n6.f1591c = Integer.MIN_VALUE;
            }
            if (k10.f1733a.i() || k10.f1733a.l()) {
                n6.f1592d -= ((StaggeredGridLayoutManager) n6.g).f12939r.e(view);
            }
            n6.f1590b = Integer.MIN_VALUE;
            n0(viewV, u0Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:6:0x000c  */
    @Override // E2.A0
    public final PointF a(int i10) {
        int i11 = -1;
        if (w() != 0) {
            if ((i10 < M0()) == this.f12945x) {
                i11 = 1;
            }
        } else if (this.f12945x) {
            i11 = 1;
        }
        PointF pointF = new PointF();
        if (i11 == 0) {
            return null;
        }
        if (this.f12941t == 0) {
            pointF.x = i11;
            pointF.y = 0.0f;
            return pointF;
        }
        pointF.x = 0.0f;
        pointF.y = i11;
        return pointF;
    }

    @Override // E2.AbstractC0135m0
    public final void a0() {
        this.f12927B.j();
        q0();
    }

    public final void a1() {
        if (this.f12941t == 1 || !S0()) {
            this.f12945x = this.f12944w;
        } else {
            this.f12945x = !this.f12944w;
        }
    }

    @Override // E2.AbstractC0135m0
    public final void b0(int i10, int i11) {
        Q0(i10, i11, 8);
    }

    public final int b1(int i10, u0 u0Var, B0 b5) {
        if (w() == 0 || i10 == 0) {
            return 0;
        }
        W0(i10, b5);
        K k7 = this.f12943v;
        int iH0 = H0(u0Var, k7, b5);
        if (k7.f1548b >= iH0) {
            i10 = i10 < 0 ? -iH0 : iH0;
        }
        this.f12939r.q(-i10);
        this.f12929D = this.f12945x;
        k7.f1548b = 0;
        X0(u0Var, k7);
        return i10;
    }

    @Override // E2.AbstractC0135m0
    public final void c(String str) {
        if (this.f12931F == null) {
            super.c(str);
        }
    }

    @Override // E2.AbstractC0135m0
    public final void c0(int i10, int i11) {
        Q0(i10, i11, 2);
    }

    public final void c1(int i10) {
        K k7 = this.f12943v;
        k7.f1551e = i10;
        k7.f1550d = this.f12945x != (i10 == -1) ? -1 : 1;
    }

    @Override // E2.AbstractC0135m0
    public final void d0(int i10, int i11) {
        Q0(i10, i11, 4);
    }

    public final void d1(int i10, B0 b5) {
        int iN;
        int iN2;
        int i11;
        K k7 = this.f12943v;
        boolean z10 = false;
        k7.f1548b = 0;
        k7.f1549c = i10;
        Q q10 = this.f1719e;
        if (q10 == null || !q10.f1608e || (i11 = b5.f1443a) == -1) {
            iN = 0;
            iN2 = 0;
        } else {
            if (this.f12945x == (i11 < i10)) {
                iN = this.f12939r.n();
                iN2 = 0;
            } else {
                iN2 = this.f12939r.n();
                iN = 0;
            }
        }
        RecyclerView recyclerView = this.f1716b;
        if (recyclerView == null || !recyclerView.f12922y) {
            k7.g = this.f12939r.h() + iN;
            k7.f1552f = -iN2;
        } else {
            k7.f1552f = this.f12939r.m() - iN2;
            k7.g = this.f12939r.i() + iN;
        }
        k7.f1553h = false;
        k7.f1547a = true;
        if (this.f12939r.k() == 0 && this.f12939r.h() == 0) {
            z10 = true;
        }
        k7.f1554i = z10;
    }

    @Override // E2.AbstractC0135m0
    public final boolean e() {
        return this.f12941t == 0;
    }

    @Override // E2.AbstractC0135m0
    public final void e0(u0 u0Var, B0 b5) {
        U0(u0Var, b5, true);
    }

    public final void e1(N0 n6, int i10, int i11) {
        int i12 = n6.f1592d;
        int i13 = n6.f1593e;
        if (i10 != -1) {
            int i14 = n6.f1591c;
            if (i14 == Integer.MIN_VALUE) {
                n6.a();
                i14 = n6.f1591c;
            }
            if (i14 - i12 >= i11) {
                this.f12946y.set(i13, false);
                return;
            }
            return;
        }
        int i15 = n6.f1590b;
        if (i15 == Integer.MIN_VALUE) {
            View view = (View) ((ArrayList) n6.f1594f).get(0);
            K0 k7 = (K0) view.getLayoutParams();
            n6.f1590b = ((StaggeredGridLayoutManager) n6.g).f12939r.g(view);
            k7.getClass();
            i15 = n6.f1590b;
        }
        if (i15 + i12 <= i11) {
            this.f12946y.set(i13, false);
        }
    }

    @Override // E2.AbstractC0135m0
    public final boolean f() {
        return this.f12941t == 1;
    }

    @Override // E2.AbstractC0135m0
    public final void f0(B0 b5) {
        this.f12947z = -1;
        this.f12926A = Integer.MIN_VALUE;
        this.f12931F = null;
        this.f12933H.a();
    }

    @Override // E2.AbstractC0135m0
    public final boolean g(C0137n0 c0137n0) {
        return c0137n0 instanceof K0;
    }

    @Override // E2.AbstractC0135m0
    public final void g0(Parcelable parcelable) {
        if (parcelable instanceof M0) {
            M0 m10 = (M0) parcelable;
            this.f12931F = m10;
            if (this.f12947z != -1) {
                m10.f1570r = -1;
                m10.f1571s = -1;
                m10.f1573u = null;
                m10.f1572t = 0;
                m10.f1574v = 0;
                m10.f1575w = null;
                m10.f1576x = null;
            }
            q0();
        }
    }

    @Override // E2.AbstractC0135m0
    public final Parcelable h0() {
        int iJ;
        int iM;
        int[] iArr;
        M0 m10 = this.f12931F;
        if (m10 != null) {
            M0 m11 = new M0();
            m11.f1572t = m10.f1572t;
            m11.f1570r = m10.f1570r;
            m11.f1571s = m10.f1571s;
            m11.f1573u = m10.f1573u;
            m11.f1574v = m10.f1574v;
            m11.f1575w = m10.f1575w;
            m11.f1577y = m10.f1577y;
            m11.f1578z = m10.f1578z;
            m11.f1569A = m10.f1569A;
            m11.f1576x = m10.f1576x;
            return m11;
        }
        M0 m12 = new M0();
        m12.f1577y = this.f12944w;
        m12.f1578z = this.f12929D;
        m12.f1569A = this.f12930E;
        k kVar = this.f12927B;
        if (kVar == null || (iArr = (int[]) kVar.f5618s) == null) {
            m12.f1574v = 0;
        } else {
            m12.f1575w = iArr;
            m12.f1574v = iArr.length;
            m12.f1576x = (ArrayList) kVar.f5619t;
        }
        if (w() <= 0) {
            m12.f1570r = -1;
            m12.f1571s = -1;
            m12.f1572t = 0;
            return m12;
        }
        m12.f1570r = this.f12929D ? N0() : M0();
        View viewI0 = this.f12945x ? I0(true) : J0(true);
        m12.f1571s = viewI0 != null ? AbstractC0135m0.H(viewI0) : -1;
        int i10 = this.f12937p;
        m12.f1572t = i10;
        m12.f1573u = new int[i10];
        for (int i11 = 0; i11 < this.f12937p; i11++) {
            if (this.f12929D) {
                iJ = this.f12938q[i11].h(Integer.MIN_VALUE);
                if (iJ != Integer.MIN_VALUE) {
                    iM = this.f12939r.i();
                    iJ -= iM;
                }
            } else {
                iJ = this.f12938q[i11].j(Integer.MIN_VALUE);
                if (iJ != Integer.MIN_VALUE) {
                    iM = this.f12939r.m();
                    iJ -= iM;
                }
            }
            m12.f1573u[i11] = iJ;
        }
        return m12;
    }

    @Override // E2.AbstractC0135m0
    public final void i(int i10, int i11, B0 b5, A a9) {
        K k7;
        int iH;
        int iJ;
        if (this.f12941t != 0) {
            i10 = i11;
        }
        if (w() == 0 || i10 == 0) {
            return;
        }
        W0(i10, b5);
        int[] iArr = this.f12935J;
        if (iArr == null || iArr.length < this.f12937p) {
            this.f12935J = new int[this.f12937p];
        }
        int i12 = 0;
        int i13 = 0;
        while (true) {
            int i14 = this.f12937p;
            k7 = this.f12943v;
            if (i12 >= i14) {
                break;
            }
            if (k7.f1550d == -1) {
                iH = k7.f1552f;
                iJ = this.f12938q[i12].j(iH);
            } else {
                iH = this.f12938q[i12].h(k7.g);
                iJ = k7.g;
            }
            int i15 = iH - iJ;
            if (i15 >= 0) {
                this.f12935J[i13] = i15;
                i13++;
            }
            i12++;
        }
        Arrays.sort(this.f12935J, 0, i13);
        for (int i16 = 0; i16 < i13; i16++) {
            int i17 = k7.f1549c;
            if (i17 < 0 || i17 >= b5.b()) {
                return;
            }
            a9.c(k7.f1549c, this.f12935J[i16]);
            k7.f1549c += k7.f1550d;
        }
    }

    @Override // E2.AbstractC0135m0
    public final void i0(int i10) {
        if (i10 == 0) {
            F0();
        }
    }

    @Override // E2.AbstractC0135m0
    public final int k(B0 b5) {
        if (w() == 0) {
            return 0;
        }
        boolean z10 = !this.f12934I;
        return AbstractC0114c.f(b5, this.f12939r, J0(z10), I0(z10), this, this.f12934I);
    }

    @Override // E2.AbstractC0135m0
    public final int l(B0 b5) {
        return G0(b5);
    }

    @Override // E2.AbstractC0135m0
    public final int m(B0 b5) {
        if (w() == 0) {
            return 0;
        }
        boolean z10 = !this.f12934I;
        return AbstractC0114c.h(b5, this.f12939r, J0(z10), I0(z10), this, this.f12934I);
    }

    @Override // E2.AbstractC0135m0
    public final int n(B0 b5) {
        if (w() == 0) {
            return 0;
        }
        boolean z10 = !this.f12934I;
        return AbstractC0114c.f(b5, this.f12939r, J0(z10), I0(z10), this, this.f12934I);
    }

    @Override // E2.AbstractC0135m0
    public final int o(B0 b5) {
        return G0(b5);
    }

    @Override // E2.AbstractC0135m0
    public final int p(B0 b5) {
        if (w() == 0) {
            return 0;
        }
        boolean z10 = !this.f12934I;
        return AbstractC0114c.h(b5, this.f12939r, J0(z10), I0(z10), this, this.f12934I);
    }

    @Override // E2.AbstractC0135m0
    public final int r0(int i10, u0 u0Var, B0 b5) {
        return b1(i10, u0Var, b5);
    }

    @Override // E2.AbstractC0135m0
    public final C0137n0 s() {
        return this.f12941t == 0 ? new K0(-2, -1) : new K0(-1, -2);
    }

    @Override // E2.AbstractC0135m0
    public final void s0(int i10) {
        M0 m10 = this.f12931F;
        if (m10 != null && m10.f1570r != i10) {
            m10.f1573u = null;
            m10.f1572t = 0;
            m10.f1570r = -1;
            m10.f1571s = -1;
        }
        this.f12947z = i10;
        this.f12926A = Integer.MIN_VALUE;
        q0();
    }

    @Override // E2.AbstractC0135m0
    public final C0137n0 t(Context context, AttributeSet attributeSet) {
        return new K0(context, attributeSet);
    }

    @Override // E2.AbstractC0135m0
    public final int t0(int i10, u0 u0Var, B0 b5) {
        return b1(i10, u0Var, b5);
    }

    @Override // E2.AbstractC0135m0
    public final C0137n0 u(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new K0((ViewGroup.MarginLayoutParams) layoutParams) : new K0(layoutParams);
    }

    @Override // E2.AbstractC0135m0
    public final void w0(Rect rect, int i10, int i11) {
        int iH;
        int iH2;
        int iF = F() + E();
        int iD = D() + G();
        int i12 = this.f12941t;
        int i13 = this.f12937p;
        if (i12 == 1) {
            int iHeight = rect.height() + iD;
            RecyclerView recyclerView = this.f1716b;
            WeakHashMap weakHashMap = S.f3689a;
            iH2 = AbstractC0135m0.h(i11, iHeight, recyclerView.getMinimumHeight());
            iH = AbstractC0135m0.h(i10, (this.f12942u * i13) + iF, this.f1716b.getMinimumWidth());
        } else {
            int iWidth = rect.width() + iF;
            RecyclerView recyclerView2 = this.f1716b;
            WeakHashMap weakHashMap2 = S.f3689a;
            iH = AbstractC0135m0.h(i10, iWidth, recyclerView2.getMinimumWidth());
            iH2 = AbstractC0135m0.h(i11, (this.f12942u * i13) + iD, this.f1716b.getMinimumHeight());
        }
        this.f1716b.setMeasuredDimension(iH, iH2);
    }

    @Override // E2.AbstractC0135m0
    public final int y(u0 u0Var, B0 b5) {
        if (this.f12941t == 1) {
            return Math.min(this.f12937p, b5.b());
        }
        return -1;
    }
}
