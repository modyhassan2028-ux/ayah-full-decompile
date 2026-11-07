package E2;

import A.o1;
import I1.C0241a;
import I1.C0243b;
import android.os.Trace;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import androidx.recyclerview.widget.RecyclerView;
import j$.util.DesugarCollections;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f1778a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ArrayList f1779b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f1780c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f1781d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f1782e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f1783f;
    public t0 g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f1784h;

    public u0(RecyclerView recyclerView) {
        this.f1784h = recyclerView;
        ArrayList arrayList = new ArrayList();
        this.f1778a = arrayList;
        this.f1779b = null;
        this.f1780c = new ArrayList();
        this.f1781d = DesugarCollections.unmodifiableList(arrayList);
        this.f1782e = 2;
        this.f1783f = 2;
    }

    public final void a(F0 f3, boolean z10) {
        RecyclerView.l(f3);
        View view = f3.f1486a;
        RecyclerView recyclerView = this.f1784h;
        H0 h7 = recyclerView.f12866F0;
        if (h7 != null) {
            C0243b c0243bJ = h7.j();
            I1.S.o(view, c0243bJ instanceof G0 ? (C0243b) ((G0) c0243bJ).f1505e.remove(view) : null);
        }
        if (z10) {
            ArrayList arrayList = recyclerView.f12865F;
            if (arrayList.size() > 0) {
                throw android.support.v4.media.session.p.u(0, arrayList);
            }
            AbstractC0115c0 abstractC0115c0 = recyclerView.f12861D;
            if (abstractC0115c0 != null) {
                abstractC0115c0.h(f3);
            }
            if (recyclerView.f12923y0 != null) {
                recyclerView.f12920x.J(f3);
            }
            if (RecyclerView.f12847U0) {
                Log.d("RecyclerView", "dispatchViewRecycled: " + f3);
            }
        }
        f3.f1502s = null;
        f3.f1501r = null;
        t0 t0VarC = c();
        t0VarC.getClass();
        int i10 = f3.f1491f;
        ArrayList arrayList2 = t0VarC.a(i10).f1762a;
        if (((s0) t0VarC.f1770a.get(i10)).f1763b <= arrayList2.size()) {
            p017b7.g.N(view);
        } else {
            if (RecyclerView.f12846T0 && arrayList2.contains(f3)) {
                throw new IllegalArgumentException("this scrap item already exists");
            }
            f3.n();
            arrayList2.add(f3);
        }
    }

    public final int b(int i10) {
        RecyclerView recyclerView = this.f1784h;
        if (i10 >= 0 && i10 < recyclerView.f12923y0.b()) {
            return !recyclerView.f12923y0.g ? i10 : recyclerView.f12916v.h(i10, 0);
        }
        StringBuilder sbW = p123m2.c.w(i10, "invalid position ", ". State item count is ");
        sbW.append(recyclerView.f12923y0.b());
        sbW.append(recyclerView.C());
        throw new IndexOutOfBoundsException(sbW.toString());
    }

    public final t0 c() {
        if (this.g == null) {
            t0 t0Var = new t0();
            t0Var.f1770a = new SparseArray();
            t0Var.f1771b = 0;
            t0Var.f1772c = Collections.newSetFromMap(new IdentityHashMap());
            this.g = t0Var;
            d();
        }
        return this.g;
    }

    public final void d() {
        RecyclerView recyclerView;
        AbstractC0115c0 abstractC0115c0;
        t0 t0Var = this.g;
        if (t0Var == null || (abstractC0115c0 = (recyclerView = this.f1784h).f12861D) == null || !recyclerView.f12873J) {
            return;
        }
        t0Var.f1772c.add(abstractC0115c0);
    }

    public final void e(AbstractC0115c0 abstractC0115c0, boolean z10) {
        t0 t0Var = this.g;
        if (t0Var != null) {
            SparseArray sparseArray = t0Var.f1770a;
            Set set = t0Var.f1772c;
            set.remove(abstractC0115c0);
            if (set.size() != 0 || z10) {
                return;
            }
            for (int i10 = 0; i10 < sparseArray.size(); i10++) {
                ArrayList arrayList = ((s0) sparseArray.get(sparseArray.keyAt(i10))).f1762a;
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    p017b7.g.N(((F0) arrayList.get(i11)).f1486a);
                }
            }
        }
    }

    public final void f() {
        ArrayList arrayList = this.f1780c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            g(size);
        }
        arrayList.clear();
        if (RecyclerView.f12851Y0) {
            A a9 = this.f1784h.f12921x0;
            int[] iArr = (int[]) a9.f1437e;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            a9.f1436d = 0;
        }
    }

    public final void g(int i10) {
        if (RecyclerView.f12847U0) {
            Log.d("RecyclerView", "Recycling cached view at index " + i10);
        }
        ArrayList arrayList = this.f1780c;
        F0 f3 = (F0) arrayList.get(i10);
        if (RecyclerView.f12847U0) {
            Log.d("RecyclerView", "CachedViewHolder to be recycled: " + f3);
        }
        a(f3, true);
        arrayList.remove(i10);
    }

    public final void h(View view) {
        F0 f0P = RecyclerView.P(view);
        boolean zK = f0P.k();
        RecyclerView recyclerView = this.f1784h;
        if (zK) {
            recyclerView.removeDetachedView(view, false);
        }
        if (f0P.j()) {
            f0P.f1497n.l(f0P);
        } else if (f0P.q()) {
            f0P.j &= -33;
        }
        i(f0P);
        if (recyclerView.f12897g0 == null || f0P.h()) {
            return;
        }
        recyclerView.f12897g0.d(f0P);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0032  */
    /* JADX WARN: Code duplicated, block: B:48:0x0099  */
    /* JADX WARN: Code duplicated, block: B:50:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:52:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:55:0x00b9 A[LOOP:2: B:51:0x00ac->B:55:0x00b9, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:84:0x00bc A[EDGE_INSN: B:84:0x00bc->B:56:0x00bc BREAK  A[LOOP:1: B:47:0x0097->B:54:0x00b6], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:85:0x00bc A[EDGE_INSN: B:85:0x00bc->B:56:0x00bc BREAK  A[LOOP:1: B:47:0x0097->B:54:0x00b6, LOOP_LABEL: LOOP:1: B:47:0x0097->B:54:0x00b6], SYNTHETIC] */
    public final void i(F0 f3) {
        boolean z10;
        boolean z11;
        int i10;
        int i11;
        int i12;
        int i13;
        RecyclerView recyclerView = this.f1784h;
        A a9 = recyclerView.f12921x0;
        boolean zJ = f3.j();
        View view = f3.f1486a;
        boolean z12 = false;
        boolean z13 = true;
        if (zJ || view.getParent() != null) {
            StringBuilder sb = new StringBuilder("Scrapped or attached views may not be recycled. isScrap:");
            sb.append(f3.j());
            sb.append(" isAttached:");
            sb.append(view.getParent() != null);
            sb.append(recyclerView.C());
            throw new IllegalArgumentException(sb.toString());
        }
        if (f3.k()) {
            StringBuilder sb2 = new StringBuilder("Tmp detached view should be removed from RecyclerView before it can be recycled: ");
            sb2.append(f3);
            throw new IllegalArgumentException(p245z2.a.C(recyclerView, sb2));
        }
        if (f3.p()) {
            throw new IllegalArgumentException(p245z2.a.C(recyclerView, new StringBuilder("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle.")));
        }
        if ((f3.j & 16) == 0) {
            WeakHashMap weakHashMap = I1.S.f3689a;
            if (view.hasTransientState()) {
                z10 = true;
            } else {
                z10 = false;
            }
        } else {
            z10 = false;
        }
        boolean z14 = RecyclerView.f12846T0;
        ArrayList arrayList = this.f1780c;
        if (z14 && arrayList.contains(f3)) {
            StringBuilder sb3 = new StringBuilder("cached view received recycle internal? ");
            sb3.append(f3);
            throw new IllegalArgumentException(p245z2.a.C(recyclerView, sb3));
        }
        if (f3.h()) {
            if (this.f1783f <= 0 || (f3.j & 526) != 0) {
                z11 = false;
            } else {
                int size = arrayList.size();
                if (size >= this.f1783f && size > 0) {
                    g(0);
                    size--;
                }
                if (RecyclerView.f12851Y0 && size > 0) {
                    int i14 = f3.f1488c;
                    if (((int[]) a9.f1437e) != null) {
                        int i15 = a9.f1436d * 2;
                        int i16 = 0;
                        while (true) {
                            if (i16 >= i15) {
                                i10 = size - 1;
                                loop1: while (i10 >= 0) {
                                    i11 = ((F0) arrayList.get(i10)).f1488c;
                                    if (((int[]) a9.f1437e) != null) {
                                        break;
                                    }
                                    i12 = a9.f1436d * 2;
                                    i13 = 0;
                                    while (true) {
                                        if (i13 < i12) {
                                            break loop1;
                                        } else if (((int[]) a9.f1437e)[i13] == i11) {
                                            break;
                                        } else {
                                            i13 += 2;
                                        }
                                    }
                                    i10--;
                                }
                                size = i10 + 1;
                            } else if (((int[]) a9.f1437e)[i16] != i14) {
                                i16 += 2;
                            }
                        }
                    } else {
                        i10 = size - 1;
                        loop1: while (i10 >= 0) {
                            i11 = ((F0) arrayList.get(i10)).f1488c;
                            if (((int[]) a9.f1437e) != null) {
                                break;
                                break;
                            }
                            i12 = a9.f1436d * 2;
                            i13 = 0;
                            while (true) {
                                if (i13 < i12) {
                                    break loop1;
                                    break loop1;
                                } else if (((int[]) a9.f1437e)[i13] == i11) {
                                    break;
                                } else {
                                    i13 += 2;
                                }
                            }
                            i10--;
                        }
                        size = i10 + 1;
                    }
                }
                arrayList.add(size, f3);
                z11 = true;
            }
            if (z11) {
                z13 = false;
            } else {
                a(f3, true);
            }
            z12 = z11;
        } else {
            if (RecyclerView.f12847U0) {
                Log.d("RecyclerView", "trying to recycle a non-recycleable holder. Hopefully, it will re-visit here. We are still removing it from animation lists" + recyclerView.C());
            }
            z13 = false;
        }
        recyclerView.f12920x.J(f3);
        if (z12 || z13 || !z10) {
            return;
        }
        p017b7.g.N(view);
        f3.f1502s = null;
        f3.f1501r = null;
    }

    public final void j(View view) {
        AbstractC0129j0 abstractC0129j0;
        F0 f0P = RecyclerView.P(view);
        int i10 = f0P.j & 12;
        RecyclerView recyclerView = this.f1784h;
        if (i10 == 0 && f0P.l() && (abstractC0129j0 = recyclerView.f12897g0) != null) {
            C0138o c0138o = (C0138o) abstractC0129j0;
            if (f0P.d().isEmpty() && c0138o.g && !f0P.g()) {
                if (this.f1779b == null) {
                    this.f1779b = new ArrayList();
                }
                f0P.f1497n = this;
                f0P.f1498o = true;
                this.f1779b.add(f0P);
                return;
            }
        }
        if (f0P.g() && !f0P.i() && !recyclerView.f12861D.f1652s) {
            throw new IllegalArgumentException(p245z2.a.C(recyclerView, new StringBuilder("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool.")));
        }
        f0P.f1497n = this;
        f0P.f1498o = false;
        this.f1778a.add(f0P);
    }

    /* JADX WARN: Code duplicated, block: B:120:0x020b  */
    /* JADX WARN: Code duplicated, block: B:191:0x0373 A[EDGE_INSN: B:191:0x0373->B:192:0x0374 BREAK  A[LOOP:4: B:186:0x035b->B:190:0x0370]] */
    /* JADX WARN: Code duplicated, block: B:264:0x049b  */
    /* JADX WARN: Code duplicated, block: B:273:0x04d0  */
    /* JADX WARN: Code duplicated, block: B:279:0x04e7  */
    /* JADX WARN: Code duplicated, block: B:280:0x04f4  */
    /* JADX WARN: Code duplicated, block: B:283:0x04fe  */
    /* JADX WARN: Code duplicated, block: B:284:0x0500  */
    /* JADX WARN: Code duplicated, block: B:286:0x0503  */
    /* JADX WARN: Code duplicated, block: B:288:0x0509  */
    /* JADX WARN: Code duplicated, block: B:291:0x051d  */
    /* JADX WARN: Code duplicated, block: B:292:0x0533  */
    /* JADX WARN: Code duplicated, block: B:295:0x053b  */
    /* JADX WARN: Code duplicated, block: B:311:0x05a2  */
    /* JADX WARN: Code duplicated, block: B:313:0x05a6  */
    /* JADX WARN: Code duplicated, block: B:316:0x05b7  */
    /* JADX WARN: Code duplicated, block: B:319:0x05c1  */
    /* JADX WARN: Code duplicated, block: B:323:0x05d8  */
    /* JADX WARN: Code duplicated, block: B:329:0x05ed  */
    /* JADX WARN: Code duplicated, block: B:331:0x05f1  */
    /* JADX WARN: Code duplicated, block: B:333:0x05f8  */
    /* JADX WARN: Code duplicated, block: B:337:0x0600  */
    /* JADX WARN: Code duplicated, block: B:339:0x0608  */
    /* JADX WARN: Code duplicated, block: B:341:0x0611  */
    /* JADX WARN: Code duplicated, block: B:342:0x0613  */
    /* JADX WARN: Code duplicated, block: B:344:0x0617  */
    /* JADX WARN: Code duplicated, block: B:345:0x061c  */
    /* JADX WARN: Code duplicated, block: B:350:0x062f  */
    /* JADX WARN: Code duplicated, block: B:353:0x0634  */
    /* JADX WARN: Code duplicated, block: B:357:0x063d  */
    /* JADX WARN: Code duplicated, block: B:358:0x0647  */
    /* JADX WARN: Code duplicated, block: B:35:0x007b A[EDGE_INSN: B:35:0x007b->B:36:0x007c BREAK  A[LOOP:0: B:14:0x0023->B:20:0x003d]] */
    /* JADX WARN: Code duplicated, block: B:360:0x064d  */
    /* JADX WARN: Code duplicated, block: B:361:0x0657  */
    /* JADX WARN: Code duplicated, block: B:366:0x0661  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v57 */
    /* JADX WARN: Type inference failed for: r7v59 */
    /* JADX WARN: Type inference failed for: r7v62 */
    /* JADX WARN: Type inference failed for: r7v73 */
    public final F0 k(long j, int i10) {
        int i11;
        F0 f0G;
        int i12;
        long j10;
        long j11;
        int iH;
        int i13;
        boolean z10;
        AbstractC0115c0 abstractC0115c0;
        boolean z11;
        boolean z12;
        long nanoTime;
        long j12;
        AccessibilityManager accessibilityManager;
        boolean z13;
        boolean z14;
        boolean z15;
        H0 h7;
        C0243b c0243bJ;
        G0 g10;
        View.AccessibilityDelegate accessibilityDelegateD;
        C0243b c0243b;
        ArrayList arrayList;
        ViewGroup.LayoutParams layoutParams;
        long j13;
        ViewGroup.LayoutParams layoutParams2;
        C0137n0 c0137n0;
        boolean z16;
        RecyclerView recyclerViewI;
        F0 f3;
        F0 f7;
        ArrayList arrayList2;
        View view;
        ?? r10;
        int size;
        int iH2;
        RecyclerView recyclerView = this.f1784h;
        B0 b5 = recyclerView.f12923y0;
        if (i10 < 0 || i10 >= b5.b()) {
            StringBuilder sbX = p123m2.c.x("Invalid item position ", i10, "(", i10, "). Item count:");
            sbX.append(b5.b());
            sbX.append(recyclerView.C());
            throw new IndexOutOfBoundsException(sbX.toString());
        }
        if (b5.g) {
            ArrayList arrayList3 = this.f1779b;
            if (arrayList3 != null && (size = arrayList3.size()) != 0) {
                int i14 = 0;
                while (true) {
                    if (i14 >= size) {
                        if (recyclerView.f12861D.f1652s && (iH2 = recyclerView.f12916v.h(i10, 0)) > 0 && iH2 < recyclerView.f12861D.a()) {
                            long jB = recyclerView.f12861D.b(iH2);
                            int i15 = 0;
                            while (true) {
                                if (i15 >= size) {
                                    f0G = null;
                                    break;
                                }
                                F0 f10 = (F0) this.f1779b.get(i15);
                                if (!f10.q() && f10.f1490e == jB) {
                                    f10.a(32);
                                    f0G = f10;
                                    break;
                                }
                                i15++;
                            }
                        } else {
                            f0G = null;
                            break;
                        }
                    } else {
                        f0G = (F0) this.f1779b.get(i14);
                        if (!f0G.q() && f0G.c() == i10) {
                            f0G.a(32);
                            break;
                        }
                        i14++;
                    }
                }
            } else {
                f0G = null;
                break;
            }
            i11 = f0G != null ? 1 : 0;
        } else {
            i11 = 0;
            f0G = null;
        }
        ArrayList arrayList4 = this.f1778a;
        ArrayList arrayList5 = this.f1780c;
        if (f0G == null) {
            int size2 = arrayList4.size();
            int i16 = 0;
            while (true) {
                if (i16 >= size2) {
                    ArrayList arrayList6 = (ArrayList) recyclerView.f12918w.f1676e;
                    int size3 = arrayList6.size();
                    int i17 = 0;
                    while (true) {
                        if (i17 >= size3) {
                            i12 = 1;
                            view = null;
                            break;
                        }
                        view = (View) arrayList6.get(i17);
                        F0 f0P = RecyclerView.P(view);
                        i12 = 1;
                        if (f0P.c() == i10 && !f0P.g() && !f0P.i()) {
                            break;
                        }
                        i17++;
                    }
                    if (view == null) {
                        int size4 = arrayList5.size();
                        int i18 = 0;
                        while (true) {
                            if (i18 >= size4) {
                                f0G = null;
                                break;
                            }
                            F0 f11 = (F0) arrayList5.get(i18);
                            if (!f11.g() && f11.c() == i10 && !f11.e()) {
                                arrayList5.remove(i18);
                                if (RecyclerView.f12847U0) {
                                    Log.d("RecyclerView", "getScrapOrHiddenOrCachedHolderForPosition(" + i10 + ") found match in cache: " + f11);
                                }
                                f0G = f11;
                                break;
                            }
                            i18++;
                        }
                    } else {
                        F0 f0P2 = RecyclerView.P(view);
                        C0124h c0124h = recyclerView.f12918w;
                        o1 o1Var = (o1) c0124h.f1675d;
                        int iIndexOfChild = ((C0111a0) c0124h.f1674c).f1640a.indexOfChild(view);
                        if (iIndexOfChild < 0) {
                            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
                        }
                        if (!o1Var.e(iIndexOfChild)) {
                            throw new RuntimeException("trying to unhide a view that was not hidden" + view);
                        }
                        o1Var.b(iIndexOfChild);
                        c0124h.J(view);
                        C0124h c0124h2 = recyclerView.f12918w;
                        o1 o1Var2 = (o1) c0124h2.f1675d;
                        int iIndexOfChild2 = ((C0111a0) c0124h2.f1674c).f1640a.indexOfChild(view);
                        int iC = (iIndexOfChild2 == -1 || o1Var2.e(iIndexOfChild2)) ? -1 : iIndexOfChild2 - o1Var2.c(iIndexOfChild2);
                        if (iC == -1) {
                            StringBuilder sb = new StringBuilder("layout index should not be -1 after unhiding a view:");
                            sb.append(f0P2);
                            throw new IllegalStateException(p245z2.a.C(recyclerView, sb));
                        }
                        recyclerView.f12918w.n(iC);
                        j(view);
                        f0P2.a(8224);
                        f0G = f0P2;
                        break;
                    }
                } else {
                    F0 f12 = (F0) arrayList4.get(i16);
                    if (!f12.q() && f12.c() == i10 && !f12.g() && (b5.g || !f12.i())) {
                        f12.a(32);
                        f0G = f12;
                        i12 = 1;
                        break;
                    }
                    i16++;
                }
            }
            if (f0G != null) {
                if (!f0G.i()) {
                    int i19 = f0G.f1488c;
                    if (i19 < 0 || i19 >= recyclerView.f12861D.a()) {
                        StringBuilder sb2 = new StringBuilder("Inconsistency detected. Invalid view holder adapter position");
                        sb2.append(f0G);
                        throw new IndexOutOfBoundsException(p245z2.a.C(recyclerView, sb2));
                    }
                    if (b5.g || recyclerView.f12861D.c(f0G.f1488c) == f0G.f1491f) {
                        AbstractC0115c0 abstractC0115c1 = recyclerView.f12861D;
                        if (!abstractC0115c1.f1652s || f0G.f1490e == abstractC0115c1.b(f0G.f1488c)) {
                            r10 = i12;
                        } else {
                            r10 = 0;
                        }
                    } else {
                        r10 = 0;
                    }
                } else {
                    if (RecyclerView.f12846T0 && !b5.g) {
                        throw new IllegalStateException(p245z2.a.C(recyclerView, new StringBuilder("should not receive a removed view unless it is pre layout")));
                    }
                    r10 = b5.g;
                }
                if (r10 == 0) {
                    f0G.a(4);
                    if (f0G.j()) {
                        recyclerView.removeDetachedView(f0G.f1486a, false);
                        f0G.f1497n.l(f0G);
                    } else if (f0G.q()) {
                        f0G.j &= -33;
                    }
                    i(f0G);
                    f0G = null;
                } else {
                    i11 = i12;
                }
            }
        } else {
            i12 = 1;
        }
        if (f0G == null) {
            int iH3 = recyclerView.f12916v.h(i10, 0);
            if (iH3 >= 0) {
                j10 = 3;
                if (iH3 < recyclerView.f12861D.a()) {
                    int iC2 = recyclerView.f12861D.c(iH3);
                    AbstractC0115c0 abstractC0115c2 = recyclerView.f12861D;
                    j11 = 4;
                    if (abstractC0115c2.f1652s) {
                        long jB2 = abstractC0115c2.b(iH3);
                        int size5 = arrayList4.size() - 1;
                        while (true) {
                            if (size5 < 0) {
                                int size6 = arrayList5.size() - 1;
                                while (true) {
                                    if (size6 >= 0) {
                                        f7 = (F0) arrayList5.get(size6);
                                        if (f7.f1490e != jB2 || f7.e()) {
                                            size6--;
                                        } else if (iC2 == f7.f1491f) {
                                            arrayList5.remove(size6);
                                        } else {
                                            g(size6);
                                        }
                                    }
                                    f0G = null;
                                    break;
                                }
                            }
                            f7 = (F0) arrayList4.get(size5);
                            ArrayList arrayList7 = arrayList4;
                            long j14 = f7.f1490e;
                            View view2 = f7.f1486a;
                            if (j14 != jB2 || f7.q()) {
                                arrayList2 = arrayList7;
                            } else if (iC2 == f7.f1491f) {
                                f7.a(32);
                                if (f7.i() && !b5.g) {
                                    f7.j = (f7.j & (-15)) | 2;
                                }
                            } else {
                                arrayList2 = arrayList7;
                                arrayList2.remove(size5);
                                recyclerView.removeDetachedView(view2, false);
                                F0 f0P3 = RecyclerView.P(view2);
                                f0P3.f1497n = null;
                                f0P3.f1498o = false;
                                f0P3.j &= -33;
                                i(f0P3);
                            }
                            size5--;
                            arrayList4 = arrayList2;
                            f0G = f7;
                            break;
                        }
                        if (f0G != null) {
                            f0G.f1488c = iH3;
                            i11 = i12;
                        }
                    }
                    if (f0G == null) {
                        if (RecyclerView.f12847U0) {
                            Log.d("RecyclerView", "tryGetViewHolderForPositionByDeadline(" + i10 + ") fetching from shared pool");
                        }
                        s0 s0Var = (s0) c().f1770a.get(iC2);
                        if (s0Var == null) {
                            f3 = null;
                            break;
                        }
                        ArrayList arrayList8 = s0Var.f1762a;
                        if (!arrayList8.isEmpty()) {
                            int size7 = arrayList8.size() - 1;
                            while (true) {
                                if (size7 < 0) {
                                    f3 = null;
                                    break;
                                }
                                if (!((F0) arrayList8.get(size7)).e()) {
                                    f3 = (F0) arrayList8.remove(size7);
                                    break;
                                }
                                size7--;
                            }
                        } else {
                            f3 = null;
                            break;
                        }
                        if (f3 != null) {
                            f3.n();
                            boolean z17 = RecyclerView.f12846T0;
                        }
                        f0G = f3;
                    }
                    if (f0G == null) {
                        long nanoTime2 = recyclerView.getNanoTime();
                        if (j != Long.MAX_VALUE) {
                            long j15 = this.g.a(iC2).f1764c;
                            if (((j15 == 0 || j15 + nanoTime2 < j) ? i12 : 0) == 0) {
                                return null;
                            }
                        }
                        AbstractC0115c0 abstractC0115c3 = recyclerView.f12861D;
                        abstractC0115c3.getClass();
                        try {
                            if (E1.i.a()) {
                                Object[] objArr = new Object[i12];
                                objArr[0] = Integer.valueOf(iC2);
                                Trace.beginSection(String.format("RV onCreateViewHolder type=0x%X", objArr));
                            }
                            f0G = abstractC0115c3.g(recyclerView, iC2);
                            if (f0G.f1486a.getParent() != null) {
                                throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
                            }
                            f0G.f1491f = iC2;
                            Trace.endSection();
                            if (RecyclerView.f12851Y0 && (recyclerViewI = RecyclerView.I(f0G.f1486a)) != null) {
                                f0G.f1487b = new WeakReference(recyclerViewI);
                            }
                            long nanoTime3 = recyclerView.getNanoTime() - nanoTime2;
                            s0 s0VarA = this.g.a(iC2);
                            long j16 = s0VarA.f1764c;
                            if (j16 != 0) {
                                nanoTime3 = (nanoTime3 / 4) + ((j16 / 4) * 3);
                            }
                            s0VarA.f1764c = nanoTime3;
                            if (RecyclerView.f12847U0) {
                                Log.d("RecyclerView", "tryGetViewHolderForPositionByDeadline created new ViewHolder");
                            }
                        } catch (Throwable th) {
                            Trace.endSection();
                            throw th;
                        }
                    }
                }
            }
            StringBuilder sbX2 = p123m2.c.x("Inconsistency detected. Invalid item position ", i10, "(offset:", iH3, ").state:");
            sbX2.append(b5.b());
            sbX2.append(recyclerView.C());
            throw new IndexOutOfBoundsException(sbX2.toString());
        }
        j10 = 3;
        j11 = 4;
        View view3 = f0G.f1486a;
        if (i11 != 0 && !b5.g) {
            int i20 = f0G.j;
            if ((i20 & 8192) != 0) {
                f0G.j = i20 & (-8193);
                if (b5.j) {
                    AbstractC0129j0.b(f0G);
                    AbstractC0129j0 abstractC0129j0 = recyclerView.f12897g0;
                    f0G.d();
                    abstractC0129j0.getClass();
                    C0127i0 c0127i0 = new C0127i0();
                    c0127i0.c(f0G);
                    recyclerView.d0(f0G, c0127i0);
                }
            }
        }
        if (!b5.g || !f0G.f()) {
            if (f0G.f()) {
                if (((f0G.j & 2) != 0) || f0G.g()) {
                    if (!RecyclerView.f12846T0) {
                    }
                    iH = recyclerView.f12916v.h(i10, 0);
                    f0G.f1502s = null;
                    f0G.f1501r = recyclerView;
                    i13 = f0G.f1491f;
                    long nanoTime4 = recyclerView.getNanoTime();
                    if (j != Long.MAX_VALUE) {
                        j13 = this.g.a(i13).f1765d;
                        if (j13 != 0) {
                        }
                    }
                    if (f0G.k()) {
                        recyclerView.attachViewToParent(view3, recyclerView.getChildCount(), view3.getLayoutParams());
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    abstractC0115c0 = recyclerView.f12861D;
                    abstractC0115c0.getClass();
                    if (f0G.f1502s == null) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z11) {
                        f0G.f1488c = iH;
                        if (abstractC0115c0.f1652s) {
                            f0G.f1490e = abstractC0115c0.b(iH);
                        }
                        f0G.j = (f0G.j & (-520)) | 1;
                        if (E1.i.a()) {
                            z12 = false;
                            Trace.beginSection(String.format("RV onBindViewHolder type=0x%X", Integer.valueOf(f0G.f1491f)));
                        } else {
                            z12 = false;
                        }
                    } else {
                        z12 = false;
                    }
                    f0G.f1502s = abstractC0115c0;
                    if (RecyclerView.f12846T0) {
                        if (view3.getParent() != null) {
                        }
                        if (view3.getParent() == null) {
                            throw new IllegalStateException("Attempting to bind attached holder with no parent (AKA temp detached): " + f0G);
                        }
                    }
                    abstractC0115c0.f(f0G, iH, f0G.d());
                    if (z11) {
                        arrayList = f0G.f1494k;
                        if (arrayList != null) {
                            arrayList.clear();
                        }
                        f0G.j &= -1025;
                        layoutParams = view3.getLayoutParams();
                        if (layoutParams instanceof C0137n0) {
                            ((C0137n0) layoutParams).f1735c = true;
                        }
                        Trace.endSection();
                    }
                    if (z10) {
                        recyclerView.detachViewFromParent(view3);
                    }
                    nanoTime = recyclerView.getNanoTime() - nanoTime4;
                    s0 s0VarA2 = this.g.a(f0G.f1491f);
                    j12 = s0VarA2.f1765d;
                    if (j12 != 0) {
                        nanoTime = (nanoTime / j11) + ((j12 / j11) * j10);
                    }
                    s0VarA2.f1765d = nanoTime;
                    accessibilityManager = recyclerView.S;
                    if (accessibilityManager == null) {
                        z13 = z12;
                    } else {
                        z13 = z12;
                    }
                    if (z13) {
                        z14 = true;
                        if (view3.getImportantForAccessibility() == 0) {
                            view3.setImportantForAccessibility(1);
                        }
                        h7 = recyclerView.f12866F0;
                        if (h7 != null) {
                            c0243bJ = h7.j();
                            if (c0243bJ instanceof G0) {
                                g10 = (G0) c0243bJ;
                                accessibilityDelegateD = I1.S.d(view3);
                                if (accessibilityDelegateD == null) {
                                    c0243b = null;
                                } else if (accessibilityDelegateD instanceof C0241a) {
                                    c0243b = ((C0241a) accessibilityDelegateD).f3708a;
                                } else {
                                    c0243b = new C0243b(accessibilityDelegateD);
                                }
                                if (c0243b != null) {
                                    g10.f1505e.put(view3, c0243b);
                                }
                            }
                            I1.S.o(view3, c0243bJ);
                        }
                    } else {
                        z14 = true;
                    }
                    if (b5.g) {
                        f0G.g = i10;
                    }
                    z15 = z14;
                }
            } else {
                if (!RecyclerView.f12846T0 && f0G.i()) {
                    StringBuilder sb3 = new StringBuilder("Removed holder should be bound and it should come here only in pre-layout. Holder: ");
                    sb3.append(f0G);
                    throw new IllegalStateException(p245z2.a.C(recyclerView, sb3));
                }
                iH = recyclerView.f12916v.h(i10, 0);
                f0G.f1502s = null;
                f0G.f1501r = recyclerView;
                i13 = f0G.f1491f;
                long nanoTime5 = recyclerView.getNanoTime();
                if (j != Long.MAX_VALUE) {
                    j13 = this.g.a(i13).f1765d;
                    if (j13 != 0 || j13 + nanoTime5 < j) {
                    }
                }
                if (f0G.k()) {
                    recyclerView.attachViewToParent(view3, recyclerView.getChildCount(), view3.getLayoutParams());
                    z10 = true;
                } else {
                    z10 = false;
                }
                abstractC0115c0 = recyclerView.f12861D;
                abstractC0115c0.getClass();
                if (f0G.f1502s == null) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    f0G.f1488c = iH;
                    if (abstractC0115c0.f1652s) {
                        f0G.f1490e = abstractC0115c0.b(iH);
                    }
                    f0G.j = (f0G.j & (-520)) | 1;
                    if (E1.i.a()) {
                        z12 = false;
                        Trace.beginSection(String.format("RV onBindViewHolder type=0x%X", Integer.valueOf(f0G.f1491f)));
                    } else {
                        z12 = false;
                    }
                } else {
                    z12 = false;
                }
                f0G.f1502s = abstractC0115c0;
                if (RecyclerView.f12846T0) {
                    if (view3.getParent() != null && view3.isAttachedToWindow() != f0G.k()) {
                        throw new IllegalStateException("Temp-detached state out of sync with reality. holder.isTmpDetached(): " + f0G.k() + ", attached to window: " + view3.isAttachedToWindow() + ", holder: " + f0G);
                    }
                    if (view3.getParent() == null && view3.isAttachedToWindow()) {
                        throw new IllegalStateException("Attempting to bind attached holder with no parent (AKA temp detached): " + f0G);
                    }
                }
                abstractC0115c0.f(f0G, iH, f0G.d());
                if (z11) {
                    arrayList = f0G.f1494k;
                    if (arrayList != null) {
                        arrayList.clear();
                    }
                    f0G.j &= -1025;
                    layoutParams = view3.getLayoutParams();
                    if (layoutParams instanceof C0137n0) {
                        ((C0137n0) layoutParams).f1735c = true;
                    }
                    Trace.endSection();
                }
                if (z10) {
                    recyclerView.detachViewFromParent(view3);
                }
                nanoTime = recyclerView.getNanoTime() - nanoTime5;
                s0 s0VarA3 = this.g.a(f0G.f1491f);
                j12 = s0VarA3.f1765d;
                if (j12 != 0) {
                    nanoTime = (nanoTime / j11) + ((j12 / j11) * j10);
                }
                s0VarA3.f1765d = nanoTime;
                accessibilityManager = recyclerView.S;
                if (accessibilityManager == null && accessibilityManager.isEnabled()) {
                    z13 = true;
                } else {
                    z13 = z12;
                }
                if (z13) {
                    z14 = true;
                    if (view3.getImportantForAccessibility() == 0) {
                        view3.setImportantForAccessibility(1);
                    }
                    h7 = recyclerView.f12866F0;
                    if (h7 != null) {
                        c0243bJ = h7.j();
                        if (c0243bJ instanceof G0) {
                            g10 = (G0) c0243bJ;
                            accessibilityDelegateD = I1.S.d(view3);
                            if (accessibilityDelegateD == null) {
                                c0243b = null;
                            } else if (accessibilityDelegateD instanceof C0241a) {
                                c0243b = ((C0241a) accessibilityDelegateD).f3708a;
                            } else {
                                c0243b = new C0243b(accessibilityDelegateD);
                            }
                            if (c0243b != null && c0243b != g10) {
                                g10.f1505e.put(view3, c0243b);
                            }
                        }
                        I1.S.o(view3, c0243bJ);
                    }
                } else {
                    z14 = true;
                }
                if (b5.g) {
                    f0G.g = i10;
                }
                z15 = z14;
            }
            layoutParams2 = view3.getLayoutParams();
            if (layoutParams2 == null) {
                c0137n0 = (C0137n0) recyclerView.generateDefaultLayoutParams();
                view3.setLayoutParams(c0137n0);
            } else if (recyclerView.checkLayoutParams(layoutParams2)) {
                c0137n0 = (C0137n0) layoutParams2;
            } else {
                c0137n0 = (C0137n0) recyclerView.generateLayoutParams(layoutParams2);
                view3.setLayoutParams(c0137n0);
            }
            c0137n0.f1733a = f0G;
            if (i11 == 0 && z15) {
                z16 = z14;
            } else {
                z16 = z12;
            }
            c0137n0.f1736d = z16;
            return f0G;
        }
        f0G.g = i10;
        z15 = false;
        z14 = true;
        z12 = false;
        layoutParams2 = view3.getLayoutParams();
        if (layoutParams2 == null) {
            c0137n0 = (C0137n0) recyclerView.generateDefaultLayoutParams();
            view3.setLayoutParams(c0137n0);
        } else if (recyclerView.checkLayoutParams(layoutParams2)) {
            c0137n0 = (C0137n0) recyclerView.generateLayoutParams(layoutParams2);
            view3.setLayoutParams(c0137n0);
        } else {
            c0137n0 = (C0137n0) layoutParams2;
        }
        c0137n0.f1733a = f0G;
        if (i11 == 0) {
            z16 = z12;
        } else {
            z16 = z12;
        }
        c0137n0.f1736d = z16;
        return f0G;
    }

    public final void l(F0 f3) {
        if (f3.f1498o) {
            this.f1779b.remove(f3);
        } else {
            this.f1778a.remove(f3);
        }
        f3.f1497n = null;
        f3.f1498o = false;
        f3.j &= -33;
    }

    public final void m() {
        AbstractC0135m0 abstractC0135m0 = this.f1784h.f12863E;
        this.f1783f = this.f1782e + (abstractC0135m0 != null ? abstractC0135m0.j : 0);
        ArrayList arrayList = this.f1780c;
        for (int size = arrayList.size() - 1; size >= 0 && arrayList.size() > this.f1783f; size--) {
            g(size);
        }
    }
}
