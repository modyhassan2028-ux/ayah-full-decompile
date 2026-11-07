package W2;

import I1.C0248d0;
import I1.S;
import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowId;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import u.C1350e;
import u.C1360o;

/* JADX INFO: loaded from: classes.dex */
public abstract class p implements Cloneable {

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public static final Animator[] f9554P = new Animator[0];
    public static final int[] Q = {2, 1, 3, 4};
    public static final H8.e R = new H8.e(17);
    public static final ThreadLocal S = new ThreadLocal();

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public ArrayList f9556B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public ArrayList f9557C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public m[] f9558D;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public long f9568N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public long f9569O;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final String f9570r = getClass().getName();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f9571s = -1;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f9572t = -1;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public TimeInterpolator f9573u = null;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final ArrayList f9574v = new ArrayList();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final ArrayList f9575w = new ArrayList();

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Aa.a f9576x = new Aa.a(6);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Aa.a f9577y = new Aa.a(6);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public C0620a f9578z = null;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final int[] f9555A = Q;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final ArrayList f9559E = new ArrayList();

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public Animator[] f9560F = f9554P;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public int f9561G = 0;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public boolean f9562H = false;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public boolean f9563I = false;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public p f9564J = null;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public ArrayList f9565K = null;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public ArrayList f9566L = new ArrayList();

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public H8.e f9567M = R;

    public static void b(Aa.a aVar, View view, x xVar) {
        C1350e c1350e = (C1350e) aVar.f554r;
        C1350e c1350e2 = (C1350e) aVar.f557u;
        SparseArray sparseArray = (SparseArray) aVar.f555s;
        C1360o c1360o = (C1360o) aVar.f556t;
        c1350e.put(view, xVar);
        int id = view.getId();
        if (id >= 0) {
            if (sparseArray.indexOfKey(id) >= 0) {
                sparseArray.put(id, null);
            } else {
                sparseArray.put(id, view);
            }
        }
        WeakHashMap weakHashMap = S.f3689a;
        String strF = I1.I.f(view);
        if (strF != null) {
            if (c1350e2.containsKey(strF)) {
                c1350e2.put(strF, null);
            } else {
                c1350e2.put(strF, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                if (c1360o.f(itemIdAtPosition) < 0) {
                    view.setHasTransientState(true);
                    c1360o.h(itemIdAtPosition, view);
                    return;
                }
                View view2 = (View) c1360o.d(itemIdAtPosition);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                    c1360o.h(itemIdAtPosition, null);
                }
            }
        }
    }

    public static C1350e p() {
        ThreadLocal threadLocal = S;
        C1350e c1350e = (C1350e) threadLocal.get();
        if (c1350e != null) {
            return c1350e;
        }
        C1350e c1350e2 = new C1350e(0);
        threadLocal.set(c1350e2);
        return c1350e2;
    }

    public static boolean v(x xVar, x xVar2, String str) {
        Object obj = xVar.f9589a.get(str);
        Object obj2 = xVar2.f9589a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return !obj.equals(obj2);
    }

    public void A(View view) {
        if (this.f9562H) {
            if (!this.f9563I) {
                ArrayList arrayList = this.f9559E;
                int size = arrayList.size();
                Animator[] animatorArr = (Animator[]) arrayList.toArray(this.f9560F);
                this.f9560F = f9554P;
                for (int i10 = size - 1; i10 >= 0; i10--) {
                    Animator animator = animatorArr[i10];
                    animatorArr[i10] = null;
                    animator.resume();
                }
                this.f9560F = animatorArr;
                w(this, o.g, false);
            }
            this.f9562H = false;
        }
    }

    public void B() {
        J();
        C1350e c1350eP = p();
        ArrayList arrayList = this.f9566L;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            Animator animator = (Animator) obj;
            if (c1350eP.containsKey(animator)) {
                J();
                if (animator != null) {
                    animator.addListener(new C0248d0(this, c1350eP));
                    long j = this.f9572t;
                    if (j >= 0) {
                        animator.setDuration(j);
                    }
                    long j10 = this.f9571s;
                    if (j10 >= 0) {
                        animator.setStartDelay(animator.getStartDelay() + j10);
                    }
                    TimeInterpolator timeInterpolator = this.f9573u;
                    if (timeInterpolator != null) {
                        animator.setInterpolator(timeInterpolator);
                    }
                    animator.addListener(new F7.e(8, this));
                    animator.start();
                }
            }
        }
        this.f9566L.clear();
        m();
    }

    public void C(long j, long j10) {
        long j11 = this.f9568N;
        int i10 = 0;
        boolean z10 = j < j10;
        if ((j10 < 0 && j >= 0) || (j10 > j11 && j <= j11)) {
            this.f9563I = false;
            w(this, o.f9550c, z10);
        }
        ArrayList arrayList = this.f9559E;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.f9560F);
        this.f9560F = f9554P;
        while (i10 < size) {
            Animator animator = animatorArr[i10];
            animatorArr[i10] = null;
            j.b(animator, Math.min(Math.max(0L, j), j.a(animator)));
            i10++;
            j11 = j11;
        }
        long j12 = j11;
        this.f9560F = animatorArr;
        if ((j <= j12 || j10 > j12) && (j >= 0 || j10 < 0)) {
            return;
        }
        if (j > j12) {
            this.f9563I = true;
        }
        w(this, o.f9551d, z10);
    }

    public void D(long j) {
        this.f9572t = j;
    }

    public void F(TimeInterpolator timeInterpolator) {
        this.f9573u = timeInterpolator;
    }

    public void G(H8.e eVar) {
        if (eVar == null) {
            this.f9567M = R;
        } else {
            this.f9567M = eVar;
        }
    }

    public void I(long j) {
        this.f9571s = j;
    }

    public final void J() {
        if (this.f9561G == 0) {
            w(this, o.f9550c, false);
            this.f9563I = false;
        }
        this.f9561G++;
    }

    public String K(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(getClass().getSimpleName());
        sb.append("@");
        sb.append(Integer.toHexString(hashCode()));
        sb.append(": ");
        if (this.f9572t != -1) {
            sb.append("dur(");
            sb.append(this.f9572t);
            sb.append(") ");
        }
        if (this.f9571s != -1) {
            sb.append("dly(");
            sb.append(this.f9571s);
            sb.append(") ");
        }
        if (this.f9573u != null) {
            sb.append("interp(");
            sb.append(this.f9573u);
            sb.append(") ");
        }
        ArrayList arrayList = this.f9574v;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f9575w;
        if (size > 0 || arrayList2.size() > 0) {
            sb.append("tgts(");
            if (arrayList.size() > 0) {
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    if (i10 > 0) {
                        sb.append(", ");
                    }
                    sb.append(arrayList.get(i10));
                }
            }
            if (arrayList2.size() > 0) {
                for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                    if (i11 > 0) {
                        sb.append(", ");
                    }
                    sb.append(arrayList2.get(i11));
                }
            }
            sb.append(")");
        }
        return sb.toString();
    }

    public void a(m mVar) {
        if (this.f9565K == null) {
            this.f9565K = new ArrayList();
        }
        this.f9565K.add(mVar);
    }

    public void c() {
        ArrayList arrayList = this.f9559E;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.f9560F);
        this.f9560F = f9554P;
        for (int i10 = size - 1; i10 >= 0; i10--) {
            Animator animator = animatorArr[i10];
            animatorArr[i10] = null;
            animator.cancel();
        }
        this.f9560F = animatorArr;
        w(this, o.f9552e, false);
    }

    public abstract void d(x xVar);

    public final void e(View view, boolean z10) {
        if (view == null) {
            return;
        }
        view.getId();
        if (view.getParent() instanceof ViewGroup) {
            x xVar = new x(view);
            if (z10) {
                g(xVar);
            } else {
                d(xVar);
            }
            xVar.f9591c.add(this);
            f(xVar);
            if (z10) {
                b(this.f9576x, view, xVar);
            } else {
                b(this.f9577y, view, xVar);
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                e(viewGroup.getChildAt(i10), z10);
            }
        }
    }

    public abstract void g(x xVar);

    public final void h(ViewGroup viewGroup, boolean z10) {
        i(z10);
        ArrayList arrayList = this.f9574v;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f9575w;
        if (size <= 0 && arrayList2.size() <= 0) {
            e(viewGroup, z10);
            return;
        }
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            View viewFindViewById = viewGroup.findViewById(((Integer) arrayList.get(i10)).intValue());
            if (viewFindViewById != null) {
                x xVar = new x(viewFindViewById);
                if (z10) {
                    g(xVar);
                } else {
                    d(xVar);
                }
                xVar.f9591c.add(this);
                f(xVar);
                if (z10) {
                    b(this.f9576x, viewFindViewById, xVar);
                } else {
                    b(this.f9577y, viewFindViewById, xVar);
                }
            }
        }
        for (int i11 = 0; i11 < arrayList2.size(); i11++) {
            View view = (View) arrayList2.get(i11);
            x xVar2 = new x(view);
            if (z10) {
                g(xVar2);
            } else {
                d(xVar2);
            }
            xVar2.f9591c.add(this);
            f(xVar2);
            if (z10) {
                b(this.f9576x, view, xVar2);
            } else {
                b(this.f9577y, view, xVar2);
            }
        }
    }

    public final void i(boolean z10) {
        if (z10) {
            ((C1350e) this.f9576x.f554r).clear();
            ((SparseArray) this.f9576x.f555s).clear();
            ((C1360o) this.f9576x.f556t).b();
        } else {
            ((C1350e) this.f9577y.f554r).clear();
            ((SparseArray) this.f9577y.f555s).clear();
            ((C1360o) this.f9577y.f556t).b();
        }
    }

    @Override // 
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public p clone() {
        try {
            p pVar = (p) super.clone();
            pVar.f9566L = new ArrayList();
            pVar.f9576x = new Aa.a(6);
            pVar.f9577y = new Aa.a(6);
            pVar.f9556B = null;
            pVar.f9557C = null;
            pVar.f9564J = this;
            pVar.f9565K = null;
            return pVar;
        } catch (CloneNotSupportedException e10) {
            throw new RuntimeException(e10);
        }
    }

    public Animator k(ViewGroup viewGroup, x xVar, x xVar2) {
        return null;
    }

    public void l(ViewGroup viewGroup, Aa.a aVar, Aa.a aVar2, ArrayList arrayList, ArrayList arrayList2) {
        int i10;
        int i11;
        View view;
        x xVar;
        Animator animator;
        x xVar2;
        C1350e c1350eP = p();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        o().getClass();
        int i12 = 0;
        while (i12 < size) {
            x xVar3 = (x) arrayList.get(i12);
            x xVar4 = (x) arrayList2.get(i12);
            if (xVar3 != null && !xVar3.f9591c.contains(this)) {
                xVar3 = null;
            }
            if (xVar4 != null && !xVar4.f9591c.contains(this)) {
                xVar4 = null;
            }
            if ((xVar3 != null || xVar4 != null) && (xVar3 == null || xVar4 == null || t(xVar3, xVar4))) {
                Animator animatorK = k(viewGroup, xVar3, xVar4);
                if (animatorK != null) {
                    String str = this.f9570r;
                    if (xVar4 != null) {
                        view = xVar4.f9590b;
                        String[] strArrQ = q();
                        if (strArrQ != null && strArrQ.length > 0) {
                            xVar2 = new x(view);
                            x xVar5 = (x) ((C1350e) aVar2.f554r).get(view);
                            i10 = size;
                            if (xVar5 != null) {
                                int i13 = 0;
                                while (i13 < strArrQ.length) {
                                    String str2 = strArrQ[i13];
                                    int i14 = i12;
                                    xVar2.f9589a.put(str2, xVar5.f9589a.get(str2));
                                    i13++;
                                    i12 = i14;
                                    xVar5 = xVar5;
                                }
                            }
                            i11 = i12;
                            int i15 = c1350eP.f22703t;
                            int i16 = 0;
                            while (true) {
                                if (i16 >= i15) {
                                    animator = animatorK;
                                    break;
                                }
                                C0628i c0628i = (C0628i) c1350eP.get((Animator) c1350eP.f(i16));
                                if (c0628i.f9544c != null && c0628i.f9542a == view && c0628i.f9543b.equals(str) && c0628i.f9544c.equals(xVar2)) {
                                    animator = null;
                                    break;
                                }
                                i16++;
                            }
                        } else {
                            i10 = size;
                            i11 = i12;
                            animator = animatorK;
                            xVar2 = null;
                        }
                        animatorK = animator;
                        xVar = xVar2;
                    } else {
                        i10 = size;
                        i11 = i12;
                        view = xVar3.f9590b;
                        xVar = null;
                    }
                    if (animatorK != null) {
                        WindowId windowId = viewGroup.getWindowId();
                        C0628i c0628i2 = new C0628i();
                        c0628i2.f9542a = view;
                        c0628i2.f9543b = str;
                        c0628i2.f9544c = xVar;
                        c0628i2.f9545d = windowId;
                        c0628i2.f9546e = this;
                        c0628i2.f9547f = animatorK;
                        c1350eP.put(animatorK, c0628i2);
                        this.f9566L.add(animatorK);
                    }
                }
                i12 = i11 + 1;
                size = i10;
            }
            i10 = size;
            i11 = i12;
            i12 = i11 + 1;
            size = i10;
        }
        if (sparseIntArray.size() != 0) {
            for (int i17 = 0; i17 < sparseIntArray.size(); i17++) {
                C0628i c0628i3 = (C0628i) c1350eP.get((Animator) this.f9566L.get(sparseIntArray.keyAt(i17)));
                c0628i3.f9547f.setStartDelay(c0628i3.f9547f.getStartDelay() + (((long) sparseIntArray.valueAt(i17)) - Long.MAX_VALUE));
            }
        }
    }

    public final void m() {
        int i10 = this.f9561G - 1;
        this.f9561G = i10;
        if (i10 == 0) {
            w(this, o.f9551d, false);
            for (int i11 = 0; i11 < ((C1360o) this.f9576x.f556t).j(); i11++) {
                View view = (View) ((C1360o) this.f9576x.f556t).k(i11);
                if (view != null) {
                    view.setHasTransientState(false);
                }
            }
            for (int i12 = 0; i12 < ((C1360o) this.f9577y.f556t).j(); i12++) {
                View view2 = (View) ((C1360o) this.f9577y.f556t).k(i12);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                }
            }
            this.f9563I = true;
        }
    }

    public final x n(View view, boolean z10) {
        C0620a c0620a = this.f9578z;
        if (c0620a != null) {
            return c0620a.n(view, z10);
        }
        ArrayList arrayList = z10 ? this.f9556B : this.f9557C;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                i10 = -1;
                break;
            }
            x xVar = (x) arrayList.get(i10);
            if (xVar == null) {
                return null;
            }
            if (xVar.f9590b == view) {
                break;
            }
            i10++;
        }
        if (i10 >= 0) {
            return (x) (z10 ? this.f9557C : this.f9556B).get(i10);
        }
        return null;
    }

    public final p o() {
        C0620a c0620a = this.f9578z;
        return c0620a != null ? c0620a.o() : this;
    }

    public String[] q() {
        return null;
    }

    public final x r(View view, boolean z10) {
        C0620a c0620a = this.f9578z;
        if (c0620a != null) {
            return c0620a.r(view, z10);
        }
        return (x) ((C1350e) (z10 ? this.f9576x : this.f9577y).f554r).get(view);
    }

    public boolean s() {
        return !this.f9559E.isEmpty();
    }

    public boolean t(x xVar, x xVar2) {
        if (xVar != null && xVar2 != null) {
            String[] strArrQ = q();
            if (strArrQ != null) {
                for (String str : strArrQ) {
                    if (v(xVar, xVar2, str)) {
                        return true;
                    }
                }
            } else {
                Iterator it = xVar.f9589a.keySet().iterator();
                while (it.hasNext()) {
                    if (v(xVar, xVar2, (String) it.next())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final String toString() {
        return K("");
    }

    public final boolean u(View view) {
        int id = view.getId();
        ArrayList arrayList = this.f9574v;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f9575w;
        return (size == 0 && arrayList2.size() == 0) || arrayList.contains(Integer.valueOf(id)) || arrayList2.contains(view);
    }

    public final void w(p pVar, o oVar, boolean z10) {
        p pVar2 = this.f9564J;
        if (pVar2 != null) {
            pVar2.w(pVar, oVar, z10);
        }
        ArrayList arrayList = this.f9565K;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        int size = this.f9565K.size();
        m[] mVarArr = this.f9558D;
        if (mVarArr == null) {
            mVarArr = new m[size];
        }
        this.f9558D = null;
        m[] mVarArr2 = (m[]) this.f9565K.toArray(mVarArr);
        for (int i10 = 0; i10 < size; i10++) {
            oVar.b(mVarArr2[i10], pVar, z10);
            mVarArr2[i10] = null;
        }
        this.f9558D = mVarArr2;
    }

    public void x(View view) {
        if (this.f9563I) {
            return;
        }
        ArrayList arrayList = this.f9559E;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.f9560F);
        this.f9560F = f9554P;
        for (int i10 = size - 1; i10 >= 0; i10--) {
            Animator animator = animatorArr[i10];
            animatorArr[i10] = null;
            animator.pause();
        }
        this.f9560F = animatorArr;
        w(this, o.f9553f, false);
        this.f9562H = true;
    }

    public void y() {
        C1350e c1350eP = p();
        this.f9568N = 0L;
        for (int i10 = 0; i10 < this.f9566L.size(); i10++) {
            Animator animator = (Animator) this.f9566L.get(i10);
            C0628i c0628i = (C0628i) c1350eP.get(animator);
            if (animator != null && c0628i != null) {
                Animator animator2 = c0628i.f9547f;
                long j = this.f9572t;
                if (j >= 0) {
                    animator2.setDuration(j);
                }
                long j10 = this.f9571s;
                if (j10 >= 0) {
                    animator2.setStartDelay(animator2.getStartDelay() + j10);
                }
                TimeInterpolator timeInterpolator = this.f9573u;
                if (timeInterpolator != null) {
                    animator2.setInterpolator(timeInterpolator);
                }
                this.f9559E.add(animator);
                this.f9568N = Math.max(this.f9568N, j.a(animator));
            }
        }
        this.f9566L.clear();
    }

    public p z(m mVar) {
        p pVar;
        ArrayList arrayList = this.f9565K;
        if (arrayList != null) {
            if (!arrayList.remove(mVar) && (pVar = this.f9564J) != null) {
                pVar.z(mVar);
            }
            if (this.f9565K.size() == 0) {
                this.f9565K = null;
            }
        }
        return this;
    }

    public void H() {
    }

    public void E(va.g gVar) {
    }

    public void f(x xVar) {
    }
}
