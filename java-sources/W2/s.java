package W2;

import android.animation.Animator;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowId;
import java.util.ArrayList;
import u.C1350e;
import u.C1360o;

/* JADX INFO: loaded from: classes.dex */
public final class s implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public p f9581r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public ViewGroup f9582s;

    /* JADX WARN: Code duplicated, block: B:100:0x021d  */
    /* JADX WARN: Code duplicated, block: B:102:0x022b  */
    /* JADX WARN: Code duplicated, block: B:103:0x0237  */
    /* JADX WARN: Code duplicated, block: B:107:0x0249  */
    /* JADX WARN: Code duplicated, block: B:134:0x01f5 A[EDGE_INSN: B:134:0x01f5->B:90:0x01f5 BREAK  A[LOOP:1: B:18:0x0084->B:89:0x01eb], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:14:0x004c  */
    /* JADX WARN: Code duplicated, block: B:164:0x0215 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:16:0x0053 A[LOOP:0: B:15:0x0051->B:16:0x0053, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:20:0x0089  */
    /* JADX WARN: Code duplicated, block: B:22:0x008d  */
    /* JADX WARN: Code duplicated, block: B:24:0x0090  */
    /* JADX WARN: Code duplicated, block: B:26:0x0093  */
    /* JADX WARN: Code duplicated, block: B:28:0x0096  */
    /* JADX WARN: Code duplicated, block: B:29:0x009b  */
    /* JADX WARN: Code duplicated, block: B:31:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:44:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:47:0x0104  */
    /* JADX WARN: Code duplicated, block: B:49:0x0119  */
    /* JADX WARN: Code duplicated, block: B:62:0x015e  */
    /* JADX WARN: Code duplicated, block: B:64:0x016e  */
    /* JADX WARN: Code duplicated, block: B:77:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:79:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:93:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:95:0x020a  */
    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        ArrayList arrayList;
        int i10;
        Aa.a aVar;
        Aa.a aVar2;
        C1350e c1350e;
        C1350e c1350e2;
        int i11;
        int[] iArr;
        boolean z10;
        int i12;
        int i13;
        C1350e c1350eP;
        int i14;
        Animator animator;
        C0628i c0628i;
        x xVar;
        x xVar2;
        int i15;
        Aa.a aVar3;
        boolean z11;
        int i16;
        View view;
        x xVar3;
        C1350e c1350e3;
        int i17;
        int i18;
        View view2;
        View view3;
        SparseArray sparseArray;
        int size;
        int i19;
        View view4;
        View view5;
        C1360o c1360o;
        int iJ;
        int i20;
        View view6;
        Aa.a aVar4;
        int size2;
        int i21;
        p pVar = this.f9581r;
        ViewGroup viewGroup = this.f9582s;
        viewGroup.getViewTreeObserver().removeOnPreDrawListener(this);
        viewGroup.removeOnAttachStateChangeListener(this);
        boolean z12 = true;
        if (!t.f9585c.remove(viewGroup)) {
            return true;
        }
        C1350e c1350eB = t.b();
        ArrayList arrayList2 = (ArrayList) c1350eB.get(viewGroup);
        if (arrayList2 != null) {
            arrayList = arrayList2.size() > 0 ? new ArrayList(arrayList2) : null;
            arrayList2.add(pVar);
            pVar.a(new r(this, c1350eB));
            i10 = 0;
            pVar.h(viewGroup, false);
            if (arrayList != null) {
                size2 = arrayList.size();
                i21 = 0;
                while (i21 < size2) {
                    Object obj = arrayList.get(i21);
                    i21++;
                    ((p) obj).A(viewGroup);
                }
            }
            pVar.f9556B = new ArrayList();
            pVar.f9557C = new ArrayList();
            aVar = pVar.f9576x;
            aVar2 = pVar.f9577y;
            c1350e = new C1350e((C1350e) aVar.f554r);
            c1350e2 = new C1350e((C1350e) aVar2.f554r);
            i11 = 0;
            while (true) {
                iArr = pVar.f9555A;
                if (i11 < iArr.length) {
                    break;
                }
                i15 = iArr[i11];
                if (i15 != z12) {
                    aVar3 = aVar2;
                    z11 = z12;
                    for (i16 = c1350e.f22703t - 1; i16 >= 0; i16--) {
                        view = (View) c1350e.f(i16);
                        if (view == null && pVar.u(view) && (xVar3 = (x) c1350e2.remove(view)) != null && pVar.u(xVar3.f9590b)) {
                            pVar.f9556B.add((x) c1350e.g(i16));
                            pVar.f9557C.add(xVar3);
                        }
                    }
                } else if (i15 != 2) {
                    aVar3 = aVar2;
                    z11 = z12;
                    c1350e3 = (C1350e) aVar.f557u;
                    C1350e c1350e4 = (C1350e) aVar3.f557u;
                    i17 = c1350e3.f22703t;
                    for (i18 = 0; i18 < i17; i18++) {
                        view2 = (View) c1350e3.i(i18);
                        if (view2 == null && pVar.u(view2) && (view3 = (View) c1350e4.get(c1350e3.f(i18))) != null && pVar.u(view3)) {
                            x xVar4 = (x) c1350e.get(view2);
                            x xVar5 = (x) c1350e2.get(view3);
                            if (xVar4 != null && xVar5 != null) {
                                pVar.f9556B.add(xVar4);
                                pVar.f9557C.add(xVar5);
                                c1350e.remove(view2);
                                c1350e2.remove(view3);
                            }
                        }
                    }
                } else if (i15 != 3) {
                    z11 = z12;
                    sparseArray = (SparseArray) aVar.f555s;
                    aVar3 = aVar2;
                    SparseArray sparseArray2 = (SparseArray) aVar3.f555s;
                    size = sparseArray.size();
                    for (i19 = 0; i19 < size; i19++) {
                        view4 = (View) sparseArray.valueAt(i19);
                        if (view4 == null && pVar.u(view4) && (view5 = (View) sparseArray2.get(sparseArray.keyAt(i19))) != null && pVar.u(view5)) {
                            x xVar6 = (x) c1350e.get(view4);
                            x xVar7 = (x) c1350e2.get(view5);
                            if (xVar6 != null && xVar7 != null) {
                                pVar.f9556B.add(xVar6);
                                pVar.f9557C.add(xVar7);
                                c1350e.remove(view4);
                                c1350e2.remove(view5);
                            }
                        }
                    }
                } else if (i15 != 4) {
                    aVar3 = aVar2;
                    z11 = z12;
                } else {
                    c1360o = (C1360o) aVar.f556t;
                    C1360o c1360o2 = (C1360o) aVar2.f556t;
                    iJ = c1360o.j();
                    i20 = i10;
                    while (i20 < iJ) {
                        view6 = (View) c1360o.k(i20);
                        if (view6 == null && pVar.u(view6)) {
                            aVar4 = aVar2;
                            View view7 = (View) c1360o2.d(c1360o.g(i20));
                            if (view7 != null && pVar.u(view7)) {
                                x xVar8 = (x) c1350e.get(view6);
                                x xVar9 = (x) c1350e2.get(view7);
                                if (xVar8 != null && xVar9 != null) {
                                    pVar.f9556B.add(xVar8);
                                    pVar.f9557C.add(xVar9);
                                    c1350e.remove(view6);
                                    c1350e2.remove(view7);
                                }
                            }
                            i20++;
                            aVar2 = aVar4;
                            z12 = z12;
                        } else {
                            aVar4 = aVar2;
                        }
                        i20++;
                        aVar2 = aVar4;
                        z12 = z12;
                    }
                    z11 = z12;
                    aVar3 = aVar2;
                }
                i11++;
                aVar2 = aVar3;
                z12 = z11;
                i10 = 0;
            }
            z10 = z12;
            for (i12 = 0; i12 < c1350e.f22703t; i12++) {
                xVar2 = (x) c1350e.i(i12);
                if (pVar.u(xVar2.f9590b)) {
                    pVar.f9556B.add(xVar2);
                    pVar.f9557C.add(null);
                }
            }
            for (i13 = 0; i13 < c1350e2.f22703t; i13++) {
                xVar = (x) c1350e2.i(i13);
                if (pVar.u(xVar.f9590b)) {
                    pVar.f9557C.add(xVar);
                    pVar.f9556B.add(null);
                }
            }
            c1350eP = p.p();
            int i22 = c1350eP.f22703t;
            WindowId windowId = viewGroup.getWindowId();
            i14 = i22 - 1;
            while (i14 >= 0) {
                animator = (Animator) c1350eP.f(i14);
                if (animator == null && (c0628i = (C0628i) c1350eP.get(animator)) != null) {
                    p pVar2 = c0628i.f9546e;
                    View view8 = c0628i.f9542a;
                    if (view8 != null && windowId.equals(c0628i.f9545d)) {
                        x xVar10 = c0628i.f9544c;
                        boolean z13 = z10;
                        x xVarR = pVar.r(view8, z13);
                        x xVarN = pVar.n(view8, z13);
                        if (xVarR == null && xVarN == null) {
                            xVarN = (x) ((C1350e) pVar.f9577y.f554r).get(view8);
                        }
                        if ((xVarR != null || xVarN != null) && pVar2.t(xVar10, xVarN)) {
                            pVar2.o().getClass();
                            if (animator.isRunning() || animator.isStarted()) {
                                animator.cancel();
                            } else {
                                c1350eP.remove(animator);
                            }
                        }
                    }
                }
                i14--;
                z10 = true;
            }
            pVar.l(viewGroup, pVar.f9576x, pVar.f9577y, pVar.f9556B, pVar.f9557C);
            pVar.B();
            return true;
        }
        arrayList2 = new ArrayList();
        c1350eB.put(viewGroup, arrayList2);
        arrayList2.add(pVar);
        pVar.a(new r(this, c1350eB));
        i10 = 0;
        pVar.h(viewGroup, false);
        if (arrayList != null) {
            size2 = arrayList.size();
            i21 = 0;
            while (i21 < size2) {
                Object obj2 = arrayList.get(i21);
                i21++;
                ((p) obj2).A(viewGroup);
            }
        }
        pVar.f9556B = new ArrayList();
        pVar.f9557C = new ArrayList();
        aVar = pVar.f9576x;
        aVar2 = pVar.f9577y;
        c1350e = new C1350e((C1350e) aVar.f554r);
        c1350e2 = new C1350e((C1350e) aVar2.f554r);
        i11 = 0;
        while (true) {
            iArr = pVar.f9555A;
            if (i11 < iArr.length) {
                break;
                break;
            }
            i15 = iArr[i11];
            if (i15 != z12) {
                aVar3 = aVar2;
                z11 = z12;
                while (i16 >= 0) {
                    view = (View) c1350e.f(i16);
                    if (view == null) {
                    }
                }
            } else if (i15 != 2) {
                aVar3 = aVar2;
                z11 = z12;
                c1350e3 = (C1350e) aVar.f557u;
                C1350e c1350e5 = (C1350e) aVar3.f557u;
                i17 = c1350e3.f22703t;
                while (i18 < i17) {
                    view2 = (View) c1350e3.i(i18);
                    if (view2 == null) {
                    }
                }
            } else if (i15 != 3) {
                z11 = z12;
                sparseArray = (SparseArray) aVar.f555s;
                aVar3 = aVar2;
                SparseArray sparseArray3 = (SparseArray) aVar3.f555s;
                size = sparseArray.size();
                while (i19 < size) {
                    view4 = (View) sparseArray.valueAt(i19);
                    if (view4 == null) {
                    }
                }
            } else if (i15 != 4) {
                aVar3 = aVar2;
                z11 = z12;
            } else {
                c1360o = (C1360o) aVar.f556t;
                C1360o c1360o3 = (C1360o) aVar2.f556t;
                iJ = c1360o.j();
                i20 = i10;
                while (i20 < iJ) {
                    view6 = (View) c1360o.k(i20);
                    if (view6 == null) {
                        aVar4 = aVar2;
                    } else {
                        aVar4 = aVar2;
                    }
                    i20++;
                    aVar2 = aVar4;
                    z12 = z12;
                }
                z11 = z12;
                aVar3 = aVar2;
            }
            i11++;
            aVar2 = aVar3;
            z12 = z11;
            i10 = 0;
        }
        z10 = z12;
        while (i12 < c1350e.f22703t) {
            xVar2 = (x) c1350e.i(i12);
            if (pVar.u(xVar2.f9590b)) {
                pVar.f9556B.add(xVar2);
                pVar.f9557C.add(null);
            }
        }
        while (i13 < c1350e2.f22703t) {
            xVar = (x) c1350e2.i(i13);
            if (pVar.u(xVar.f9590b)) {
                pVar.f9557C.add(xVar);
                pVar.f9556B.add(null);
            }
        }
        c1350eP = p.p();
        int i23 = c1350eP.f22703t;
        WindowId windowId2 = viewGroup.getWindowId();
        i14 = i23 - 1;
        while (i14 >= 0) {
            animator = (Animator) c1350eP.f(i14);
            if (animator == null) {
            }
            i14--;
            z10 = true;
        }
        pVar.l(viewGroup, pVar.f9576x, pVar.f9577y, pVar.f9556B, pVar.f9557C);
        pVar.B();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        ViewGroup viewGroup = this.f9582s;
        viewGroup.getViewTreeObserver().removeOnPreDrawListener(this);
        viewGroup.removeOnAttachStateChangeListener(this);
        t.f9585c.remove(viewGroup);
        ArrayList arrayList = (ArrayList) t.b().get(viewGroup);
        if (arrayList != null && arrayList.size() > 0) {
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                ((p) obj).A(viewGroup);
            }
        }
        this.f9581r.i(true);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
