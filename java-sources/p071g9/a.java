package p071g9;

import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintHelper;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import p017b7.g;
import p100j8.c;
import p100j8.p;
import p132n1.n;
import p132n1.w;
import p132n1.z;
import p153p1.e;
import p153p1.f;
import p153p1.h;
import p153p1.i;
import p153p1.j;
import s1.d;
import s1.l;
import s1.m;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f16335a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f16336b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f16337c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f16338d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f16339e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f16340f;
    public Object g;

    public a(Class cls, Class[] clsArr) {
        this.f16337c = null;
        HashSet hashSet = new HashSet();
        this.f16338d = hashSet;
        this.f16339e = new HashSet();
        this.f16335a = 0;
        this.f16336b = 0;
        this.g = new HashSet();
        hashSet.add(p.a(cls));
        for (Class cls2 : clsArr) {
            g.R(cls2, "Null interface");
            ((HashSet) this.f16338d).add(p.a(cls2));
        }
    }

    public static void d(f fVar, f fVar2) {
        e jVar;
        ArrayList arrayList = fVar.f20902g0;
        HashMap map = new HashMap();
        map.put(fVar, fVar2);
        fVar2.f20902g0.clear();
        fVar2.f(fVar, map);
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            e eVar = (e) obj;
            if (eVar instanceof p153p1.a) {
                jVar = new p153p1.a();
            } else if (eVar instanceof i) {
                jVar = new i();
            } else if (eVar instanceof h) {
                jVar = new h();
            } else {
                jVar = eVar instanceof j ? new j() : new e();
            }
            fVar2.f20902g0.add(jVar);
            e eVar2 = jVar.f20861K;
            if (eVar2 != null) {
                ((f) eVar2).f20902g0.remove(jVar);
                jVar.f20861K = null;
            }
            jVar.f20861K = fVar2;
            map.put(eVar, jVar);
        }
        int size2 = arrayList.size();
        while (i10 < size2) {
            Object obj2 = arrayList.get(i10);
            i10++;
            e eVar3 = (e) obj2;
            ((e) map.get(eVar3)).f(eVar3, map);
        }
    }

    public static e f(f fVar, View view) {
        if (fVar.f20868W == view) {
            return fVar;
        }
        ArrayList arrayList = fVar.f20902g0;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            e eVar = (e) arrayList.get(i10);
            if (eVar.f20868W == view) {
                return eVar;
            }
        }
        return null;
    }

    public void a(p100j8.h hVar) {
        if (((HashSet) this.f16338d).contains(hVar.f18805a)) {
            throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
        }
        ((HashSet) this.f16339e).add(hVar);
    }

    public p100j8.a b() {
        if (((c) this.f16340f) != null) {
            return new p100j8.a((String) this.f16337c, new HashSet((HashSet) this.f16338d), new HashSet((HashSet) this.f16339e), this.f16335a, this.f16336b, (c) this.f16340f, (HashSet) this.g);
        }
        throw new IllegalStateException("Missing required property: factory.");
    }

    public void c() {
        int i10;
        HashMap map;
        MotionLayout motionLayout = (MotionLayout) this.g;
        int childCount = motionLayout.getChildCount();
        HashMap map2 = motionLayout.Q;
        map2.clear();
        int i11 = 0;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = motionLayout.getChildAt(i12);
            map2.put(childAt, new n(childAt));
        }
        while (i11 < childCount) {
            View childAt2 = motionLayout.getChildAt(i11);
            n nVar = (n) map2.get(childAt2);
            if (nVar == null) {
                i10 = childCount;
                map = map2;
            } else {
                if (((l) this.f16339e) != null) {
                    e eVarF = f((f) this.f16337c, childAt2);
                    if (eVarF != null) {
                        l lVar = (l) this.f16339e;
                        w wVar = nVar.f19898d;
                        wVar.f19954t = 0.0f;
                        wVar.f19955u = 0.0f;
                        nVar.d(wVar);
                        float fN = eVarF.n();
                        float fO = eVarF.o();
                        i10 = childCount;
                        float fM = eVarF.m();
                        map = map2;
                        float fJ = eVarF.j();
                        wVar.f19956v = fN;
                        wVar.f19957w = fO;
                        wVar.f19958x = fM;
                        wVar.f19959y = fJ;
                        s1.g gVarG = lVar.g(nVar.f19896b);
                        wVar.a(gVarG);
                        nVar.j = gVarG.f21935c.f22001f;
                        nVar.f19900f.c(eVarF, lVar, nVar.f19896b);
                    } else {
                        i10 = childCount;
                        map = map2;
                        if (motionLayout.f12196d0 != 0) {
                            Log.e("MotionLayout", Y2.a.F() + "no widget for  " + Y2.a.H(childAt2) + " (" + childAt2.getClass().getName() + ")");
                        }
                    }
                } else {
                    i10 = childCount;
                    map = map2;
                }
                if (((l) this.f16340f) != null) {
                    e eVarF2 = f((f) this.f16338d, childAt2);
                    if (eVarF2 != null) {
                        l lVar2 = (l) this.f16340f;
                        w wVar2 = nVar.f19899e;
                        wVar2.f19954t = 1.0f;
                        wVar2.f19955u = 1.0f;
                        nVar.d(wVar2);
                        float fN2 = eVarF2.n();
                        float fO2 = eVarF2.o();
                        float fM2 = eVarF2.m();
                        float fJ2 = eVarF2.j();
                        wVar2.f19956v = fN2;
                        wVar2.f19957w = fO2;
                        wVar2.f19958x = fM2;
                        wVar2.f19959y = fJ2;
                        wVar2.a(lVar2.g(nVar.f19896b));
                        nVar.g.c(eVarF2, lVar2, nVar.f19896b);
                    } else if (motionLayout.f12196d0 != 0) {
                        Log.e("MotionLayout", Y2.a.F() + "no widget for  " + Y2.a.H(childAt2) + " (" + childAt2.getClass().getName() + ")");
                    }
                }
            }
            i11++;
            childCount = i10;
            map2 = map;
        }
    }

    public void e() {
        if (!(this.f16335a == 0)) {
            throw new IllegalStateException("Instantiation type has already been set.");
        }
        this.f16335a = 2;
    }

    public void g(l lVar, l lVar2) {
        this.f16339e = lVar;
        this.f16340f = lVar2;
        this.f16337c = new f();
        f fVar = new f();
        this.f16338d = fVar;
        f fVar2 = (f) this.f16337c;
        MotionLayout motionLayout = (MotionLayout) this.g;
        int i10 = MotionLayout.f12166Q0;
        f fVar3 = motionLayout.f12276t;
        d dVar = fVar3.f20905j0;
        fVar2.f20905j0 = dVar;
        fVar2.f20904i0.f21253f = dVar;
        d dVar2 = fVar3.f20905j0;
        fVar.f20905j0 = dVar2;
        fVar.f20904i0.f21253f = dVar2;
        fVar2.f20902g0.clear();
        ((f) this.f16338d).f20902g0.clear();
        d(fVar3, (f) this.f16337c);
        d(fVar3, (f) this.f16338d);
        if (motionLayout.U > 0.5d) {
            if (lVar != null) {
                i((f) this.f16337c, lVar);
            }
            i((f) this.f16338d, lVar2);
        } else {
            i((f) this.f16338d, lVar2);
            if (lVar != null) {
                i((f) this.f16337c, lVar);
            }
        }
        ((f) this.f16337c).f20906k0 = motionLayout.k();
        ((f) this.f16337c).G();
        ((f) this.f16338d).f20906k0 = motionLayout.k();
        ((f) this.f16338d).G();
        ViewGroup.LayoutParams layoutParams = motionLayout.getLayoutParams();
        if (layoutParams != null) {
            int i11 = layoutParams.width;
            p153p1.d dVar3 = p153p1.d.f20847s;
            if (i11 == -2) {
                ((f) this.f16337c).x(dVar3);
                ((f) this.f16338d).x(dVar3);
            }
            if (layoutParams.height == -2) {
                ((f) this.f16337c).y(dVar3);
                ((f) this.f16338d).y(dVar3);
            }
        }
    }

    public void h() {
        MotionLayout motionLayout = (MotionLayout) this.g;
        int i10 = motionLayout.f12185N;
        int i11 = motionLayout.f12187O;
        int mode = View.MeasureSpec.getMode(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        motionLayout.f12171E0 = mode;
        motionLayout.f12172F0 = mode2;
        int optimizationLevel = motionLayout.getOptimizationLevel();
        if (motionLayout.f12182L == motionLayout.getStartState()) {
            motionLayout.n((f) this.f16338d, optimizationLevel, i10, i11);
            if (((l) this.f16339e) != null) {
                motionLayout.n((f) this.f16337c, optimizationLevel, i10, i11);
            }
        } else {
            if (((l) this.f16339e) != null) {
                motionLayout.n((f) this.f16337c, optimizationLevel, i10, i11);
            }
            motionLayout.n((f) this.f16338d, optimizationLevel, i10, i11);
        }
        int i12 = 0;
        if (!(motionLayout.getParent() instanceof MotionLayout) || mode != 1073741824 || mode2 != 1073741824) {
            motionLayout.f12171E0 = mode;
            motionLayout.f12172F0 = mode2;
            if (motionLayout.f12182L == motionLayout.getStartState()) {
                motionLayout.n((f) this.f16338d, optimizationLevel, i10, i11);
                if (((l) this.f16339e) != null) {
                    motionLayout.n((f) this.f16337c, optimizationLevel, i10, i11);
                }
            } else {
                if (((l) this.f16339e) != null) {
                    motionLayout.n((f) this.f16337c, optimizationLevel, i10, i11);
                }
                motionLayout.n((f) this.f16338d, optimizationLevel, i10, i11);
            }
            motionLayout.f12167A0 = ((f) this.f16337c).m();
            motionLayout.f12168B0 = ((f) this.f16337c).j();
            motionLayout.f12169C0 = ((f) this.f16338d).m();
            int iJ = ((f) this.f16338d).j();
            motionLayout.f12170D0 = iJ;
            motionLayout.f12218z0 = (motionLayout.f12167A0 == motionLayout.f12169C0 && motionLayout.f12168B0 == iJ) ? false : true;
        }
        int i13 = motionLayout.f12167A0;
        int i14 = motionLayout.f12168B0;
        int i15 = motionLayout.f12171E0;
        if (i15 == Integer.MIN_VALUE || i15 == 0) {
            i13 = (int) ((motionLayout.f12173G0 * (motionLayout.f12169C0 - i13)) + i13);
        }
        int i16 = motionLayout.f12172F0;
        if (i16 == Integer.MIN_VALUE || i16 == 0) {
            i14 = (int) ((motionLayout.f12173G0 * (motionLayout.f12170D0 - i14)) + i14);
        }
        int i17 = i14;
        f fVar = (f) this.f16337c;
        motionLayout.m(i10, i11, i13, i17, fVar.f20915t0 || ((f) this.f16338d).f20915t0, fVar.f20916u0 || ((f) this.f16338d).f20916u0);
        HashMap map = motionLayout.Q;
        int childCount = motionLayout.getChildCount();
        motionLayout.L0.c();
        motionLayout.f12194b0 = true;
        motionLayout.getWidth();
        motionLayout.getHeight();
        z zVar = motionLayout.f12174H.f19820c;
        int i18 = zVar != null ? zVar.f19978p : -1;
        if (i18 != -1) {
            for (int i19 = 0; i19 < childCount; i19++) {
                n nVar = (n) map.get(motionLayout.getChildAt(i19));
                if (nVar != null) {
                    nVar.f19917y = i18;
                }
            }
        }
        for (int i20 = 0; i20 < childCount; i20++) {
            n nVar2 = (n) map.get(motionLayout.getChildAt(i20));
            if (nVar2 != null) {
                motionLayout.f12174H.e(nVar2);
                nVar2.e(motionLayout.getNanoTime());
            }
        }
        z zVar2 = motionLayout.f12174H.f19820c;
        float f3 = zVar2 != null ? zVar2.f19972i : 0.0f;
        if (f3 != 0.0f) {
            boolean z10 = ((double) f3) < 0.0d;
            float fAbs = Math.abs(f3);
            float fMax = -3.4028235E38f;
            float fMin = Float.MAX_VALUE;
            float fMax2 = -3.4028235E38f;
            float fMin2 = Float.MAX_VALUE;
            for (int i21 = 0; i21 < childCount; i21++) {
                n nVar3 = (n) map.get(motionLayout.getChildAt(i21));
                if (!Float.isNaN(nVar3.j)) {
                    for (int i22 = 0; i22 < childCount; i22++) {
                        n nVar4 = (n) map.get(motionLayout.getChildAt(i22));
                        if (!Float.isNaN(nVar4.j)) {
                            fMin = Math.min(fMin, nVar4.j);
                            fMax = Math.max(fMax, nVar4.j);
                        }
                    }
                    while (i12 < childCount) {
                        n nVar5 = (n) map.get(motionLayout.getChildAt(i12));
                        if (!Float.isNaN(nVar5.j)) {
                            nVar5.f19904l = 1.0f / (1.0f - fAbs);
                            if (z10) {
                                nVar5.f19903k = fAbs - (((fMax - nVar5.j) / (fMax - fMin)) * fAbs);
                            } else {
                                nVar5.f19903k = fAbs - (((nVar5.j - fMin) * fAbs) / (fMax - fMin));
                            }
                        }
                        i12++;
                    }
                    return;
                }
                w wVar = nVar3.f19899e;
                float f7 = wVar.f19956v;
                float f10 = wVar.f19957w;
                float f11 = z10 ? f10 - f7 : f10 + f7;
                fMin2 = Math.min(fMin2, f11);
                fMax2 = Math.max(fMax2, f11);
            }
            while (i12 < childCount) {
                n nVar6 = (n) map.get(motionLayout.getChildAt(i12));
                w wVar2 = nVar6.f19899e;
                float f12 = wVar2.f19956v;
                float f13 = wVar2.f19957w;
                float f14 = z10 ? f13 - f12 : f13 + f12;
                nVar6.f19904l = 1.0f / (1.0f - fAbs);
                nVar6.f19903k = fAbs - (((f14 - fMin2) * fAbs) / (fMax2 - fMin2));
                i12++;
            }
        }
    }

    public void i(f fVar, l lVar) {
        SparseArray sparseArray = new SparseArray();
        m mVar = new m();
        sparseArray.clear();
        sparseArray.put(0, fVar);
        MotionLayout motionLayout = (MotionLayout) this.g;
        sparseArray.put(motionLayout.getId(), fVar);
        ArrayList arrayList = fVar.f20902g0;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            e eVar = (e) obj;
            sparseArray.put(eVar.f20868W.getId(), eVar);
        }
        ArrayList arrayList2 = fVar.f20902g0;
        int size2 = arrayList2.size();
        int i11 = 0;
        while (i11 < size2) {
            int i12 = i11 + 1;
            e eVar2 = (e) arrayList2.get(i11);
            View view = eVar2.f20868W;
            int id = view.getId();
            HashMap map = lVar.f22023c;
            if (map.containsKey(Integer.valueOf(id))) {
                ((s1.g) map.get(Integer.valueOf(id))).a(mVar);
            }
            eVar2.z(lVar.g(view.getId()).f21936d.f21965c);
            eVar2.w(lVar.g(view.getId()).f21936d.f21967d);
            if (view instanceof ConstraintHelper) {
                ConstraintHelper constraintHelper = (ConstraintHelper) view;
                int id2 = constraintHelper.getId();
                HashMap map2 = lVar.f22023c;
                if (map2.containsKey(Integer.valueOf(id2))) {
                    s1.g gVar = (s1.g) map2.get(Integer.valueOf(id2));
                    if (eVar2 instanceof j) {
                        constraintHelper.h(gVar, (j) eVar2, mVar, sparseArray);
                    }
                }
                if (view instanceof Barrier) {
                    ((Barrier) view).l();
                }
            }
            mVar.resolveLayoutDirection(motionLayout.getLayoutDirection());
            int i13 = MotionLayout.f12166Q0;
            motionLayout.c(false, view, eVar2, mVar, sparseArray);
            if (lVar.g(view.getId()).f21934b.f22004c == 1) {
                eVar2.f20869X = view.getVisibility();
            } else {
                eVar2.f20869X = lVar.g(view.getId()).f21934b.f22003b;
            }
            i11 = i12;
        }
        ArrayList arrayList3 = fVar.f20902g0;
        int size3 = arrayList3.size();
        int i14 = 0;
        while (i14 < size3) {
            Object obj2 = arrayList3.get(i14);
            i14++;
            e eVar3 = (e) obj2;
            if (eVar3 instanceof h) {
                ConstraintHelper constraintHelper2 = (ConstraintHelper) eVar3.f20868W;
                j jVar = (j) eVar3;
                constraintHelper2.getClass();
                jVar.f20974h0 = 0;
                Arrays.fill(jVar.f20973g0, (Object) null);
                for (int i15 = 0; i15 < constraintHelper2.f12261s; i15++) {
                    jVar.C((e) sparseArray.get(constraintHelper2.f12260r[i15]));
                }
                h hVar = (h) jVar;
                for (int i16 = 0; i16 < hVar.f20974h0; i16++) {
                    e eVar4 = hVar.f20973g0[i16];
                }
            }
        }
    }

    public a(MotionLayout motionLayout) {
        this.g = motionLayout;
        this.f16337c = new f();
        this.f16338d = new f();
        this.f16339e = null;
        this.f16340f = null;
    }
}
