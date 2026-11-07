package p056f2;

import Aa.a;
import E2.RunnableC0147v;
import K0.C0368s0;
import L5.c;
import R7.f;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.support.v4.media.session.p;
import android.support.v4.media.session.r;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentContainerView;
import androidx.lifecycle.EnumC0767p;
import androidx.lifecycle.J;
import androidx.lifecycle.U;
import com.ayah.R;
import j$.util.DesugarCollections;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.ListIterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import p020c.D;
import p020c.E;
import p020c.InterfaceC0777b;
import p020c.i;
import p053f.g;
import p216w1.m;
import p216w1.v;
import p251z9.e;
import p251z9.j;
import p251z9.w;
import u.P;

/* JADX INFO: loaded from: classes.dex */
public abstract class K {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final D f15946A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final f f15947B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public g f15948C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public g f15949D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public g f15950E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public ArrayDeque f15951F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public boolean f15952G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public boolean f15953H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public boolean f15954I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public boolean f15955J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public boolean f15956K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public ArrayList f15957L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public ArrayList f15958M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public ArrayList f15959N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public N f15960O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public final RunnableC0147v f15961P;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f15963b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ArrayList f15966e;
    public D g;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ArrayList f15973n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final c f15974o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final CopyOnWriteArrayList f15975p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final A f15976q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final A f15977r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final A f15978s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final A f15979t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final C f15980u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f15981v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public C0949w f15982w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public AbstractC0951y f15983x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public AbstractComponentCallbacksC0947u f15984y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public AbstractComponentCallbacksC0947u f15985z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f15962a = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f15964c = new a(11);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ArrayList f15965d = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final LayoutInflaterFactory2C0952z f15967f = new LayoutInflaterFactory2C0952z(this);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public C0928a f15968h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f15969i = false;
    public final E j = new E(1, this);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final AtomicInteger f15970k = new AtomicInteger();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Map f15971l = DesugarCollections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Map f15972m = DesugarCollections.synchronizedMap(new HashMap());

    /* JADX WARN: Type inference failed for: r0v16, types: [f2.A] */
    /* JADX WARN: Type inference failed for: r0v17, types: [f2.A] */
    /* JADX WARN: Type inference failed for: r0v18, types: [f2.A] */
    /* JADX WARN: Type inference failed for: r0v19, types: [f2.A] */
    public K() {
        DesugarCollections.synchronizedMap(new HashMap());
        this.f15973n = new ArrayList();
        this.f15974o = new c(this);
        this.f15975p = new CopyOnWriteArrayList();
        final int i10 = 0;
        this.f15976q = new H1.a(this) { // from class: f2.A

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ K f15933b;

            {
                this.f15933b = this;
            }

            @Override // H1.a
            public final void accept(Object obj) {
                switch (i10) {
                    case 0:
                        K k7 = this.f15933b;
                        if (k7.M()) {
                            k7.i(false);
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        K k10 = this.f15933b;
                        if (k10.M() && num.intValue() == 80) {
                            k10.m(false);
                            break;
                        }
                        break;
                    case 2:
                        m mVar = (m) obj;
                        K k11 = this.f15933b;
                        if (k11.M()) {
                            boolean z10 = mVar.f23595a;
                            k11.n(false);
                        }
                        break;
                    default:
                        v vVar = (v) obj;
                        K k12 = this.f15933b;
                        if (k12.M()) {
                            boolean z11 = vVar.f23623a;
                            k12.s(false);
                        }
                        break;
                }
            }
        };
        final int i11 = 1;
        this.f15977r = new H1.a(this) { // from class: f2.A

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ K f15933b;

            {
                this.f15933b = this;
            }

            @Override // H1.a
            public final void accept(Object obj) {
                switch (i11) {
                    case 0:
                        K k7 = this.f15933b;
                        if (k7.M()) {
                            k7.i(false);
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        K k10 = this.f15933b;
                        if (k10.M() && num.intValue() == 80) {
                            k10.m(false);
                            break;
                        }
                        break;
                    case 2:
                        m mVar = (m) obj;
                        K k11 = this.f15933b;
                        if (k11.M()) {
                            boolean z10 = mVar.f23595a;
                            k11.n(false);
                        }
                        break;
                    default:
                        v vVar = (v) obj;
                        K k12 = this.f15933b;
                        if (k12.M()) {
                            boolean z11 = vVar.f23623a;
                            k12.s(false);
                        }
                        break;
                }
            }
        };
        final int i12 = 2;
        this.f15978s = new H1.a(this) { // from class: f2.A

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ K f15933b;

            {
                this.f15933b = this;
            }

            @Override // H1.a
            public final void accept(Object obj) {
                switch (i12) {
                    case 0:
                        K k7 = this.f15933b;
                        if (k7.M()) {
                            k7.i(false);
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        K k10 = this.f15933b;
                        if (k10.M() && num.intValue() == 80) {
                            k10.m(false);
                            break;
                        }
                        break;
                    case 2:
                        m mVar = (m) obj;
                        K k11 = this.f15933b;
                        if (k11.M()) {
                            boolean z10 = mVar.f23595a;
                            k11.n(false);
                        }
                        break;
                    default:
                        v vVar = (v) obj;
                        K k12 = this.f15933b;
                        if (k12.M()) {
                            boolean z11 = vVar.f23623a;
                            k12.s(false);
                        }
                        break;
                }
            }
        };
        final int i13 = 3;
        this.f15979t = new H1.a(this) { // from class: f2.A

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ K f15933b;

            {
                this.f15933b = this;
            }

            @Override // H1.a
            public final void accept(Object obj) {
                switch (i13) {
                    case 0:
                        K k7 = this.f15933b;
                        if (k7.M()) {
                            k7.i(false);
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        K k10 = this.f15933b;
                        if (k10.M() && num.intValue() == 80) {
                            k10.m(false);
                            break;
                        }
                        break;
                    case 2:
                        m mVar = (m) obj;
                        K k11 = this.f15933b;
                        if (k11.M()) {
                            boolean z10 = mVar.f23595a;
                            k11.n(false);
                        }
                        break;
                    default:
                        v vVar = (v) obj;
                        K k12 = this.f15933b;
                        if (k12.M()) {
                            boolean z11 = vVar.f23623a;
                            k12.s(false);
                        }
                        break;
                }
            }
        };
        this.f15980u = new C(this);
        this.f15981v = -1;
        this.f15946A = new D(this);
        this.f15947B = new f(26);
        this.f15951F = new ArrayDeque();
        this.f15961P = new RunnableC0147v(14, this);
    }

    public static HashSet F(C0928a c0928a) {
        HashSet hashSet = new HashSet();
        for (int i10 = 0; i10 < c0928a.f16050a.size(); i10++) {
            AbstractComponentCallbacksC0947u abstractComponentCallbacksC0947u = ((T) c0928a.f16050a.get(i10)).f16022b;
            if (abstractComponentCallbacksC0947u != null && c0928a.g) {
                hashSet.add(abstractComponentCallbacksC0947u);
            }
        }
        return hashSet;
    }

    public static boolean K(int i10) {
        return Log.isLoggable("FragmentManager", i10);
    }

    public static boolean L(AbstractComponentCallbacksC0947u abstractComponentCallbacksC0947u) {
        abstractComponentCallbacksC0947u.getClass();
        ArrayList arrayListT = abstractComponentCallbacksC0947u.f16139M.f15964c.t();
        int size = arrayListT.size();
        boolean zL = false;
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayListT.get(i10);
            i10++;
            AbstractComponentCallbacksC0947u abstractComponentCallbacksC0947u2 = (AbstractComponentCallbacksC0947u) obj;
            if (abstractComponentCallbacksC0947u2 != null) {
                zL = L(abstractComponentCallbacksC0947u2);
            }
            if (zL) {
                return true;
            }
        }
        return false;
    }

    public static boolean N(AbstractComponentCallbacksC0947u abstractComponentCallbacksC0947u) {
        if (abstractComponentCallbacksC0947u == null) {
            return true;
        }
        if (abstractComponentCallbacksC0947u.U) {
            return abstractComponentCallbacksC0947u.f16137K == null || N(abstractComponentCallbacksC0947u.f16140N);
        }
        return false;
    }

    public static boolean O(AbstractComponentCallbacksC0947u abstractComponentCallbacksC0947u) {
        if (abstractComponentCallbacksC0947u == null) {
            return true;
        }
        K k7 = abstractComponentCallbacksC0947u.f16137K;
        return abstractComponentCallbacksC0947u.equals(k7.f15985z) && O(k7.f15984y);
    }

    public static void d0(AbstractComponentCallbacksC0947u abstractComponentCallbacksC0947u) {
        if (K(2)) {
            Log.v("FragmentManager", "show: " + abstractComponentCallbacksC0947u);
        }
        if (abstractComponentCallbacksC0947u.R) {
            abstractComponentCallbacksC0947u.R = false;
            abstractComponentCallbacksC0947u.f16149b0 = !abstractComponentCallbacksC0947u.f16149b0;
        }
    }

    public final boolean A(boolean z10) {
        boolean zA;
        C0928a c0928a;
        z(z10);
        if (!this.f15969i && (c0928a = this.f15968h) != null) {
            c0928a.f16066s = false;
            c0928a.d();
            if (K(3)) {
                Log.d("FragmentManager", "Reversing mTransitioningOp " + this.f15968h + " as part of execPendingActions for actions " + this.f15962a);
            }
            this.f15968h.e(false, false);
            this.f15962a.add(0, this.f15968h);
            ArrayList arrayList = this.f15968h.f16050a;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                AbstractComponentCallbacksC0947u abstractComponentCallbacksC0947u = ((T) obj).f16022b;
                if (abstractComponentCallbacksC0947u != null) {
                    abstractComponentCallbacksC0947u.f16130D = false;
                }
            }
            this.f15968h = null;
        }
        boolean z11 = false;
        while (true) {
            ArrayList arrayList2 = this.f15957L;
            ArrayList arrayList3 = this.f15958M;
            synchronized (this.f15962a) {
                if (this.f15962a.isEmpty()) {
                    zA = false;
                } else {
                    try {
                        int size2 = this.f15962a.size();
                        zA = false;
                        for (int i11 = 0; i11 < size2; i11++) {
                            zA |= ((H) this.f15962a.get(i11)).a(arrayList2, arrayList3);
                        }
                        this.f15962a.clear();
                        this.f15982w.f16174t.removeCallbacks(this.f15961P);
                    } catch (Throwable th) {
                        this.f15962a.clear();
                        this.f15982w.f16174t.removeCallbacks(this.f15961P);
                        throw th;
                    }
                }
            }
            if (!zA) {
                g0();
                v();
                ((HashMap) this.f15964c.f554r).values().removeAll(Collections.singleton(null));
                return z11;
            }
            z11 = true;
            this.f15963b = true;
            try {
                V(this.f15957L, this.f15958M);
                d();
            } catch (Throwable th2) {
                d();
                throw th2;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:111:0x021e A[PHI: r15
      0x021e: PHI (r15v24 int) = (r15v23 int), (r15v26 int) binds: [B:103:0x020b, B:107:0x0215] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:63:0x0166  */
    public final void B(ArrayList arrayList, ArrayList arrayList2, int i10, int i11) {
        Object objPrevious;
        boolean z10;
        int i12;
        boolean z11;
        boolean z12;
        int i13;
        a aVar = this.f15964c;
        ArrayList arrayList3 = this.f15973n;
        boolean z13 = ((C0928a) arrayList.get(i10)).f16063p;
        ArrayList arrayList4 = this.f15959N;
        if (arrayList4 == null) {
            this.f15959N = new ArrayList();
        } else {
            arrayList4.clear();
        }
        this.f15959N.addAll(aVar.v());
        AbstractComponentCallbacksC0947u abstractComponentCallbacksC0947u = this.f15985z;
        int i14 = i10;
        boolean z14 = false;
        while (i14 < i11) {
            C0928a c0928a = (C0928a) arrayList.get(i14);
            if (((Boolean) arrayList2.get(i14)).booleanValue()) {
                z10 = z13;
                i12 = i14;
                z11 = z14;
                int i15 = 1;
                ArrayList arrayList5 = this.f15959N;
                ArrayList arrayList6 = c0928a.f16050a;
                int size = arrayList6.size() - 1;
                while (size >= 0) {
                    T t2 = (T) arrayList6.get(size);
                    int i16 = t2.f16021a;
                    if (i16 != i15) {
                        if (i16 != 3) {
                            switch (i16) {
                                case 6:
                                    arrayList5.add(t2.f16022b);
                                    break;
                                case 8:
                                    abstractComponentCallbacksC0947u = null;
                                    break;
                                case 9:
                                    abstractComponentCallbacksC0947u = t2.f16022b;
                                    break;
                                case 10:
                                    t2.f16028i = t2.f16027h;
                                    break;
                            }
                        } else {
                            arrayList5.add(t2.f16022b);
                        }
                        size--;
                        i15 = 1;
                    }
                    arrayList5.remove(t2.f16022b);
                    size--;
                    i15 = 1;
                }
            } else {
                ArrayList arrayList7 = this.f15959N;
                ArrayList arrayList8 = c0928a.f16050a;
                int i17 = 0;
                while (i17 < arrayList8.size()) {
                    T t10 = (T) arrayList8.get(i17);
                    boolean z15 = z13;
                    int i18 = t10.f16021a;
                    int i19 = i14;
                    int i20 = 1;
                    if (i18 != 1) {
                        z12 = z14;
                        if (i18 != 2) {
                            if (i18 == 3 || i18 == 6) {
                                arrayList7.remove(t10.f16022b);
                                AbstractComponentCallbacksC0947u abstractComponentCallbacksC0947u2 = t10.f16022b;
                                if (abstractComponentCallbacksC0947u2 == abstractComponentCallbacksC0947u) {
                                    arrayList8.add(i17, new T(9, abstractComponentCallbacksC0947u2));
                                    i17++;
                                    abstractComponentCallbacksC0947u = null;
                                }
                            } else if (i18 == 7) {
                                i20 = 1;
                            } else if (i18 == 8) {
                                arrayList8.add(i17, new T(9, abstractComponentCallbacksC0947u, 0));
                                t10.f16023c = true;
                                i17++;
                                abstractComponentCallbacksC0947u = t10.f16022b;
                            }
                            i20 = 1;
                        } else {
                            AbstractComponentCallbacksC0947u abstractComponentCallbacksC0947u3 = t10.f16022b;
                            int i21 = abstractComponentCallbacksC0947u3.f16142P;
                            int size2 = arrayList7.size() - 1;
                            boolean z16 = false;
                            while (size2 >= 0) {
                                int i22 = size2;
                                AbstractComponentCallbacksC0947u abstractComponentCallbacksC0947u4 = (AbstractComponentCallbacksC0947u) arrayList7.get(size2);
                                if (abstractComponentCallbacksC0947u4.f16142P != i21) {
                                    i21 = i21;
                                } else if (abstractComponentCallbacksC0947u4 == abstractComponentCallbacksC0947u3) {
                                    i21 = i21;
                                    z16 = true;
                                } else {
                                    if (abstractComponentCallbacksC0947u4 == abstractComponentCallbacksC0947u) {
                                        arrayList8.add(i17, new T(9, abstractComponentCallbacksC0947u4, 0));
                                        i17++;
                                        i13 = 0;
                                        abstractComponentCallbacksC0947u = null;
                                    } else {
                                        i13 = 0;
                                    }
                                    T t11 = new T(3, abstractComponentCallbacksC0947u4, i13);
                                    t11.f16024d = t10.f16024d;
                                    t11.f16026f = t10.f16026f;
                                    t11.f16025e = t10.f16025e;
                                    t11.g = t10.g;
                                    arrayList8.add(i17, t11);
                                    arrayList7.remove(abstractComponentCallbacksC0947u4);
                                    i17++;
                                    abstractComponentCallbacksC0947u = abstractComponentCallbacksC0947u;
                                }
                                size2 = i22 - 1;
                                i21 = i21;
                            }
                            i20 = 1;
                            if (z16) {
                                arrayList8.remove(i17);
                                i17--;
                            } else {
                                t10.f16021a = 1;
                                t10.f16023c = true;
                                arrayList7.add(abstractComponentCallbacksC0947u3);
                            }
                        }
                        i17 += i20;
                        z13 = z15;
                        i14 = i19;
                        z14 = z12;
                    } else {
                        z12 = z14;
                    }
                    arrayList7.add(t10.f16022b);
                    i17 += i20;
                    z13 = z15;
                    i14 = i19;
                    z14 = z12;
                }
                z10 = z13;
                i12 = i14;
                z11 = z14;
            }
            z14 = z11 || c0928a.g;
            i14 = i12 + 1;
            z13 = z10;
        }
        boolean z17 = z13;
        boolean z18 = z14;
        this.f15959N.clear();
        if (!z17 && this.f15981v >= 1) {
            for (int i23 = i10; i23 < i11; i23++) {
                ArrayList arrayList9 = ((C0928a) arrayList.get(i23)).f16050a;
                int size3 = arrayList9.size();
                int i24 = 0;
                while (i24 < size3) {
                    Object obj = arrayList9.get(i24);
                    i24++;
                    AbstractComponentCallbacksC0947u abstractComponentCallbacksC0947u5 = ((T) obj).f16022b;
                    if (abstractComponentCallbacksC0947u5 != null && abstractComponentCallbacksC0947u5.f16137K != null) {
                        aVar.z(g(abstractComponentCallbacksC0947u5));
                    }
                }
            }
        }
        String str = "Unknown cmd: ";
        int i25 = i10;
        while (i25 < i11) {
            C0928a c0928a2 = (C0928a) arrayList.get(i25);
            if (((Boolean) arrayList2.get(i25)).booleanValue()) {
                c0928a2.c(-1);
                K k7 = c0928a2.f16065r;
                ArrayList arrayList10 = c0928a2.f16050a;
                boolean z19 = true;
                for (int size4 = arrayList10.size() - 1; size4 >= 0; size4--) {
                    T t12 = (T) arrayList10.get(size4);
                    AbstractComponentCallbacksC0947u abstractComponentCallbacksC0947u6 = t12.f16022b;
                    if (abstractComponentCallbacksC0947u6 != null) {
                        if (abstractComponentCallbacksC0947u6.f16148a0 != null) {
                            abstractComponentCallbacksC0947u6.i().f16117a = z19;
                        }
                        int i26 = c0928a2.f16055f;
                        int i27 = 8194;
                        int i28 = 4097;
                        if (i26 != 4097) {
                            if (i26 != 8194) {
                                i27 = 4100;
                                if (i26 != 8197) {
                                    i28 = 4099;
                                    if (i26 != 4099) {
                                        i27 = i26 != 4100 ? 0 : 8197;
                                    } else {
                                        i27 = i28;
                                    }
                                }
                            } else {
                                i27 = i28;
                            }
                        }
                        if (abstractComponentCallbacksC0947u6.f16148a0 != null || i27 != 0) {
                            abstractComponentCallbacksC0947u6.i();
                            abstractComponentCallbacksC0947u6.f16148a0.f16122f = i27;
                        }
                        abstractComponentCallbacksC0947u6.i();
                        abstractComponentCallbacksC0947u6.f16148a0.getClass();
                    }
                    switch (t12.f16021a) {
                        case 1:
                            abstractComponentCallbacksC0947u6.O(t12.f16024d, t12.f16025e, t12.f16026f, t12.g);
                            z19 = true;
                            k7.Z(abstractComponentCallbacksC0947u6, true);
                            k7.U(abstractComponentCallbacksC0947u6);
                            break;
                        case 2:
                        default:
                            throw new IllegalArgumentException(str + t12.f16021a);
                        case 3:
                            abstractComponentCallbacksC0947u6.O(t12.f16024d, t12.f16025e, t12.f16026f, t12.g);
                            k7.a(abstractComponentCallbacksC0947u6);
                            z19 = true;
                            break;
                        case 4:
                            abstractComponentCallbacksC0947u6.O(t12.f16024d, t12.f16025e, t12.f16026f, t12.g);
                            k7.getClass();
                            d0(abstractComponentCallbacksC0947u6);
                            z19 = true;
                            break;
                        case 5:
                            abstractComponentCallbacksC0947u6.O(t12.f16024d, t12.f16025e, t12.f16026f, t12.g);
                            k7.Z(abstractComponentCallbacksC0947u6, true);
                            k7.J(abstractComponentCallbacksC0947u6);
                            z19 = true;
                            break;
                        case 6:
                            abstractComponentCallbacksC0947u6.O(t12.f16024d, t12.f16025e, t12.f16026f, t12.g);
                            k7.c(abstractComponentCallbacksC0947u6);
                            z19 = true;
                            break;
                        case 7:
                            abstractComponentCallbacksC0947u6.O(t12.f16024d, t12.f16025e, t12.f16026f, t12.g);
                            k7.Z(abstractComponentCallbacksC0947u6, true);
                            k7.h(abstractComponentCallbacksC0947u6);
                            z19 = true;
                            break;
                        case 8:
                            k7.b0(null);
                            z19 = true;
                            break;
                        case 9:
                            k7.b0(abstractComponentCallbacksC0947u6);
                            z19 = true;
                            break;
                        case 10:
                            k7.a0(abstractComponentCallbacksC0947u6, t12.f16027h);
                            z19 = true;
                            break;
                    }
                }
            } else {
                c0928a2.c(1);
                K k10 = c0928a2.f16065r;
                ArrayList arrayList11 = c0928a2.f16050a;
                int size5 = arrayList11.size();
                int i29 = 0;
                while (i29 < size5) {
                    T t13 = (T) arrayList11.get(i29);
                    AbstractComponentCallbacksC0947u abstractComponentCallbacksC0947u7 = t13.f16022b;
                    if (abstractComponentCallbacksC0947u7 != null) {
                        if (abstractComponentCallbacksC0947u7.f16148a0 != null) {
                            abstractComponentCallbacksC0947u7.i().f16117a = false;
                        }
                        int i30 = c0928a2.f16055f;
                        if (abstractComponentCallbacksC0947u7.f16148a0 != null || i30 != 0) {
                            abstractComponentCallbacksC0947u7.i();
                            abstractComponentCallbacksC0947u7.f16148a0.f16122f = i30;
                        }
                        abstractComponentCallbacksC0947u7.i();
                        abstractComponentCallbacksC0947u7.f16148a0.getClass();
                    }
                    switch (t13.f16021a) {
                        case 1:
                            abstractComponentCallbacksC0947u7.O(t13.f16024d, t13.f16025e, t13.f16026f, t13.g);
                            k10.Z(abstractComponentCallbacksC0947u7, false);
                            k10.a(abstractComponentCallbacksC0947u7);
                            i29++;
                            str = str;
                            break;
                        case 2:
                        default:
                            throw new IllegalArgumentException(str + t13.f16021a);
                        case 3:
                            abstractComponentCallbacksC0947u7.O(t13.f16024d, t13.f16025e, t13.f16026f, t13.g);
                            k10.U(abstractComponentCallbacksC0947u7);
                            i29++;
                            str = str;
                            break;
                        case 4:
                            abstractComponentCallbacksC0947u7.O(t13.f16024d, t13.f16025e, t13.f16026f, t13.g);
                            k10.J(abstractComponentCallbacksC0947u7);
                            i29++;
                            str = str;
                            break;
                        case 5:
                            abstractComponentCallbacksC0947u7.O(t13.f16024d, t13.f16025e, t13.f16026f, t13.g);
                            k10.Z(abstractComponentCallbacksC0947u7, false);
                            d0(abstractComponentCallbacksC0947u7);
                            i29++;
                            str = str;
                            break;
                        case 6:
                            abstractComponentCallbacksC0947u7.O(t13.f16024d, t13.f16025e, t13.f16026f, t13.g);
                            k10.h(abstractComponentCallbacksC0947u7);
                            i29++;
                            str = str;
                            break;
                        case 7:
                            abstractComponentCallbacksC0947u7.O(t13.f16024d, t13.f16025e, t13.f16026f, t13.g);
                            k10.Z(abstractComponentCallbacksC0947u7, false);
                            k10.c(abstractComponentCallbacksC0947u7);
                            i29++;
                            str = str;
                            break;
                        case 8:
                            k10.b0(abstractComponentCallbacksC0947u7);
                            i29++;
                            str = str;
                            break;
                        case 9:
                            k10.b0(null);
                            i29++;
                            str = str;
                            break;
                        case 10:
                            k10.a0(abstractComponentCallbacksC0947u7, t13.f16028i);
                            i29++;
                            str = str;
                            break;
                    }
                }
            }
            i25++;
            str = str;
        }
        boolean zBooleanValue = ((Boolean) arrayList2.get(i11 - 1)).booleanValue();
        if (z18 && !arrayList3.isEmpty()) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int size6 = arrayList.size();
            int i31 = 0;
            while (i31 < size6) {
                Object obj2 = arrayList.get(i31);
                i31++;
                linkedHashSet.addAll(F((C0928a) obj2));
            }
            if (this.f15968h == null) {
                int size7 = arrayList3.size();
                int i32 = 0;
                while (i32 < size7) {
                    Object obj3 = arrayList3.get(i32);
                    i32++;
                    if (obj3 != null) {
                        throw new ClassCastException();
                    }
                    Iterator it = linkedHashSet.iterator();
                    if (it.hasNext()) {
                        throw null;
                    }
                }
                int size8 = arrayList3.size();
                int i33 = 0;
                while (i33 < size8) {
                    Object obj4 = arrayList3.get(i33);
                    i33++;
                    if (obj4 != null) {
                        throw new ClassCastException();
                    }
                    Iterator it2 = linkedHashSet.iterator();
                    if (it2.hasNext()) {
                        throw null;
                    }
                }
            }
        }
        for (int i34 = i10; i34 < i11; i34++) {
            C0928a c0928a3 = (C0928a) arrayList.get(i34);
            if (zBooleanValue) {
                for (int size9 = c0928a3.f16050a.size() - 1; size9 >= 0; size9--) {
                    AbstractComponentCallbacksC0947u abstractComponentCallbacksC0947u8 = ((T) c0928a3.f16050a.get(size9)).f16022b;
                    if (abstractComponentCallbacksC0947u8 != null) {
                        g(abstractComponentCallbacksC0947u8).k();
                    }
                }
            } else {
                ArrayList arrayList12 = c0928a3.f16050a;
                int size10 = arrayList12.size();
                int i35 = 0;
                while (i35 < size10) {
                    Object obj5 = arrayList12.get(i35);
                    i35++;
                    AbstractComponentCallbacksC0947u abstractComponentCallbacksC0947u9 = ((T) obj5).f16022b;
                    if (abstractComponentCallbacksC0947u9 != null) {
                        g(abstractComponentCallbacksC0947u9).k();
                    }
                }
            }
        }
        P(this.f15981v, true);
        int i36 = i10;
        for (C0941n c0941n : f(arrayList, i36, i11)) {
            c0941n.f16109e = zBooleanValue;
            synchronized (c0941n.f16106b) {
                try {
                    c0941n.l();
                    ArrayList arrayList13 = c0941n.f16106b;
                    ListIterator listIterator = arrayList13.listIterator(arrayList13.size());
                    while (true) {
                        if (listIterator.hasPrevious()) {
                            objPrevious = listIterator.previous();
                            X x9 = (X) objPrevious;
                            View view = x9.f16041c.f16145X;
                            j.d(view, "operation.fragment.mView");
                            char c10 = 4;
                            if (view.getAlpha() != 0.0f || view.getVisibility() != 0) {
                                int visibility = view.getVisibility();
                                if (visibility == 0) {
                                    c10 = 2;
                                } else if (visibility != 4) {
                                    if (visibility != 8) {
                                        throw new IllegalArgumentException("Unknown visibility " + visibility);
                                    }
                                    c10 = 3;
                                }
                            }
                            if (x9.f16039a != 2 || c10 == 2) {
                            }
                        } else {
                            objPrevious = null;
                        }
                    }
                    c0941n.f16110f = false;
                } catch (Throwable th) {
                    throw th;
                }
            }
            c0941n.e();
        }
        while (i36 < i11) {
            C0928a c0928a4 = (C0928a) arrayList.get(i36);
            if (((Boolean) arrayList2.get(i36)).booleanValue() && c0928a4.f16067t >= 0) {
                c0928a4.f16067t = -1;
            }
            if (c0928a4.f16064q != null) {
                for (int i37 = 0; i37 < c0928a4.f16064q.size(); i37++) {
                    ((Runnable) c0928a4.f16064q.get(i37)).run();
                }
                c0928a4.f16064q = null;
            }
            i36++;
        }
        if (z18 && arrayList3.size() > 0) {
            throw p.u(0, arrayList3);
        }
    }

    public final AbstractComponentCallbacksC0947u C(int i10) {
        a aVar = this.f15964c;
        ArrayList arrayList = (ArrayList) aVar.f556t;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            AbstractComponentCallbacksC0947u abstractComponentCallbacksC0947u = (AbstractComponentCallbacksC0947u) arrayList.get(size);
            if (abstractComponentCallbacksC0947u != null && abstractComponentCallbacksC0947u.f16141O == i10) {
                return abstractComponentCallbacksC0947u;
            }
        }
        for (Q q10 : ((HashMap) aVar.f554r).values()) {
            if (q10 != null) {
                AbstractComponentCallbacksC0947u abstractComponentCallbacksC0947u2 = q10.f16017c;
                if (abstractComponentCallbacksC0947u2.f16141O == i10) {
                    return abstractComponentCallbacksC0947u2;
                }
            }
        }
        return null;
    }

    public final AbstractComponentCallbacksC0947u D(String str) {
        a aVar = this.f15964c;
        ArrayList arrayList = (ArrayList) aVar.f556t;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            AbstractComponentCallbacksC0947u abstractComponentCallbacksC0947u = (AbstractComponentCallbacksC0947u) arrayList.get(size);
            if (abstractComponentCallbacksC0947u != null && str.equals(abstractComponentCallbacksC0947u.Q)) {
                return abstractComponentCallbacksC0947u;
            }
        }
        for (Q q10 : ((HashMap) aVar.f554r).values()) {
            if (q10 != null) {
                AbstractComponentCallbacksC0947u abstractComponentCallbacksC0947u2 = q10.f16017c;
                if (str.equals(abstractComponentCallbacksC0947u2.Q)) {
                    return abstractComponentCallbacksC0947u2;
                }
            }
        }
        return null;
    }

    public final void E() {
        for (C0941n c0941n : e()) {
            if (c0941n.f16110f) {
                if (K(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Forcing postponed operations");
                }
                c0941n.f16110f = false;
                c0941n.e();
            }
        }
    }

    public final ViewGroup G(AbstractComponentCallbacksC0947u abstractComponentCallbacksC0947u) {
        ViewGroup viewGroup = abstractComponentCallbacksC0947u.f16144W;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (abstractComponentCallbacksC0947u.f16142P <= 0 || !this.f15983x.e()) {
            return null;
        }
        View viewD = this.f15983x.d(abstractComponentCallbacksC0947u.f16142P);
        if (viewD instanceof ViewGroup) {
            return (ViewGroup) viewD;
        }
        return null;
    }

    public final D H() {
        AbstractComponentCallbacksC0947u abstractComponentCallbacksC0947u = this.f15984y;
        return abstractComponentCallbacksC0947u != null ? abstractComponentCallbacksC0947u.f16137K.H() : this.f15946A;
    }

    public final f I() {
        AbstractComponentCallbacksC0947u abstractComponentCallbacksC0947u = this.f15984y;
        return abstractComponentCallbacksC0947u != null ? abstractComponentCallbacksC0947u.f16137K.I() : this.f15947B;
    }

    public final void J(AbstractComponentCallbacksC0947u abstractComponentCallbacksC0947u) {
        if (K(2)) {
            Log.v("FragmentManager", "hide: " + abstractComponentCallbacksC0947u);
        }
        if (abstractComponentCallbacksC0947u.R) {
            return;
        }
        abstractComponentCallbacksC0947u.R = true;
        abstractComponentCallbacksC0947u.f16149b0 = true ^ abstractComponentCallbacksC0947u.f16149b0;
        c0(abstractComponentCallbacksC0947u);
    }

    public final boolean M() {
        AbstractComponentCallbacksC0947u abstractComponentCallbacksC0947u = this.f15984y;
        if (abstractComponentCallbacksC0947u == null) {
            return true;
        }
        return abstractComponentCallbacksC0947u.f16138L != null && abstractComponentCallbacksC0947u.f16128B && abstractComponentCallbacksC0947u.o().M();
    }

    public final void P(int i10, boolean z10) {
        C0949w c0949w;
        if (this.f15982w == null && i10 != -1) {
            throw new IllegalStateException("No activity");
        }
        if (z10 || i10 != this.f15981v) {
            this.f15981v = i10;
            a aVar = this.f15964c;
            HashMap map = (HashMap) aVar.f554r;
            ArrayList arrayList = (ArrayList) aVar.f556t;
            int size = arrayList.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList.get(i11);
                i11++;
                Q q10 = (Q) map.get(((AbstractComponentCallbacksC0947u) obj).f16165v);
                if (q10 != null) {
                    q10.k();
                }
            }
            for (Q q11 : map.values()) {
                if (q11 != null) {
                    q11.k();
                    AbstractComponentCallbacksC0947u abstractComponentCallbacksC0947u = q11.f16017c;
                    if (abstractComponentCallbacksC0947u.f16129C && !abstractComponentCallbacksC0947u.u()) {
                        aVar.A(q11);
                    }
                }
            }
            e0();
            if (this.f15952G && (c0949w = this.f15982w) != null && this.f15981v == 7) {
                c0949w.f16176v.invalidateOptionsMenu();
                this.f15952G = false;
            }
        }
    }

    public final void Q() {
        if (this.f15982w == null) {
            return;
        }
        this.f15953H = false;
        this.f15954I = false;
        this.f15960O.g = false;
        for (AbstractComponentCallbacksC0947u abstractComponentCallbacksC0947u : this.f15964c.v()) {
            if (abstractComponentCallbacksC0947u != null) {
                abstractComponentCallbacksC0947u.f16139M.Q();
            }
        }
    }

    public final boolean R() {
        return S(-1, 0);
    }

    public final boolean S(int i10, int i11) {
        A(false);
        z(true);
        AbstractComponentCallbacksC0947u abstractComponentCallbacksC0947u = this.f15985z;
        if (abstractComponentCallbacksC0947u != null && i10 < 0 && abstractComponentCallbacksC0947u.k().R()) {
            return true;
        }
        boolean zT = T(this.f15957L, this.f15958M, i10, i11);
        if (zT) {
            this.f15963b = true;
            try {
                V(this.f15957L, this.f15958M);
                d();
            } catch (Throwable th) {
                d();
                throw th;
            }
        }
        g0();
        v();
        ((HashMap) this.f15964c.f554r).values().removeAll(Collections.singleton(null));
        return zT;
    }

    public final boolean T(ArrayList arrayList, ArrayList arrayList2, int i10, int i11) {
        boolean z10 = (i11 & 1) != 0;
        int size = -1;
        if (!this.f15965d.isEmpty()) {
            if (i10 < 0) {
                size = z10 ? 0 : this.f15965d.size() - 1;
            } else {
                int size2 = this.f15965d.size() - 1;
                while (size2 >= 0) {
                    C0928a c0928a = (C0928a) this.f15965d.get(size2);
                    if (i10 >= 0 && i10 == c0928a.f16067t) {
                        break;
                    }
                    size2--;
                }
                if (size2 < 0) {
                    size = size2;
                } else if (z10) {
                    size = size2;
                    while (size > 0) {
                        C0928a c0928a2 = (C0928a) this.f15965d.get(size - 1);
                        if (i10 < 0 || i10 != c0928a2.f16067t) {
                            break;
                        }
                        size--;
                    }
                } else if (size2 != this.f15965d.size() - 1) {
                    size = size2 + 1;
                }
            }
        }
        if (size < 0) {
            return false;
        }
        for (int size3 = this.f15965d.size() - 1; size3 >= size; size3--) {
            arrayList.add((C0928a) this.f15965d.remove(size3));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    public final void U(AbstractComponentCallbacksC0947u abstractComponentCallbacksC0947u) {
        if (K(2)) {
            Log.v("FragmentManager", "remove: " + abstractComponentCallbacksC0947u + " nesting=" + abstractComponentCallbacksC0947u.f16136J);
        }
        boolean zU = abstractComponentCallbacksC0947u.u();
        if (abstractComponentCallbacksC0947u.S && zU) {
            return;
        }
        a aVar = this.f15964c;
        synchronized (((ArrayList) aVar.f556t)) {
            ((ArrayList) aVar.f556t).remove(abstractComponentCallbacksC0947u);
        }
        abstractComponentCallbacksC0947u.f16128B = false;
        if (L(abstractComponentCallbacksC0947u)) {
            this.f15952G = true;
        }
        abstractComponentCallbacksC0947u.f16129C = true;
        c0(abstractComponentCallbacksC0947u);
    }

    public final void V(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() != arrayList2.size()) {
            throw new IllegalStateException("Internal error with the back stack records");
        }
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (i10 < size) {
            if (!((C0928a) arrayList.get(i10)).f16063p) {
                if (i11 != i10) {
                    B(arrayList, arrayList2, i11, i10);
                }
                i11 = i10 + 1;
                if (((Boolean) arrayList2.get(i10)).booleanValue()) {
                    while (i11 < size && ((Boolean) arrayList2.get(i11)).booleanValue() && !((C0928a) arrayList.get(i11)).f16063p) {
                        i11++;
                    }
                }
                B(arrayList, arrayList2, i10, i11);
                i10 = i11 - 1;
            }
            i10++;
        }
        if (i11 != size) {
            B(arrayList, arrayList2, i11, size);
        }
    }

    public final void W(Bundle bundle) {
        c cVar;
        int i10;
        Bundle bundle2;
        Q q10;
        Bundle bundle3;
        Bundle bundle4;
        for (String str : bundle.keySet()) {
            if (str.startsWith("result_") && (bundle4 = bundle.getBundle(str)) != null) {
                bundle4.setClassLoader(this.f15982w.f16173s.getClassLoader());
                this.f15972m.put(str.substring(7), bundle4);
            }
        }
        HashMap map = new HashMap();
        for (String str2 : bundle.keySet()) {
            if (str2.startsWith("fragment_") && (bundle3 = bundle.getBundle(str2)) != null) {
                bundle3.setClassLoader(this.f15982w.f16173s.getClassLoader());
                map.put(str2.substring(9), bundle3);
            }
        }
        a aVar = this.f15964c;
        HashMap map2 = (HashMap) aVar.f555s;
        HashMap map3 = (HashMap) aVar.f554r;
        map2.clear();
        map2.putAll(map);
        M m10 = (M) bundle.getParcelable("state");
        if (m10 == null) {
            return;
        }
        map3.clear();
        ArrayList arrayList = m10.f15986r;
        int size = arrayList.size();
        int i11 = 0;
        while (true) {
            cVar = this.f15974o;
            int i12 = 2;
            if (i11 >= size) {
                break;
            }
            Object obj = arrayList.get(i11);
            i11++;
            Bundle bundleI = aVar.I((String) obj, null);
            if (bundleI != null) {
                AbstractComponentCallbacksC0947u abstractComponentCallbacksC0947u = (AbstractComponentCallbacksC0947u) this.f15960O.f15995b.get(((P) bundleI.getParcelable("state")).f16007s);
                if (abstractComponentCallbacksC0947u != null) {
                    if (K(2)) {
                        Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + abstractComponentCallbacksC0947u);
                    }
                    q10 = new Q(cVar, aVar, abstractComponentCallbacksC0947u, bundleI);
                    bundle2 = bundleI;
                } else {
                    i12 = 2;
                    bundle2 = bundleI;
                    q10 = new Q(this.f15974o, this.f15964c, this.f15982w.f16173s.getClassLoader(), H(), bundleI);
                }
                AbstractComponentCallbacksC0947u abstractComponentCallbacksC0947u2 = q10.f16017c;
                abstractComponentCallbacksC0947u2.f16162s = bundle2;
                abstractComponentCallbacksC0947u2.f16137K = this;
                if (K(i12)) {
                    Log.v("FragmentManager", "restoreSaveState: active (" + abstractComponentCallbacksC0947u2.f16165v + "): " + abstractComponentCallbacksC0947u2);
                }
                q10.m(this.f15982w.f16173s.getClassLoader());
                aVar.z(q10);
                q10.f16019e = this.f15981v;
            }
        }
        N n6 = this.f15960O;
        n6.getClass();
        ArrayList arrayList2 = new ArrayList(n6.f15995b.values());
        int size2 = arrayList2.size();
        int i13 = 0;
        while (i13 < size2) {
            Object obj2 = arrayList2.get(i13);
            i13++;
            AbstractComponentCallbacksC0947u abstractComponentCallbacksC0947u3 = (AbstractComponentCallbacksC0947u) obj2;
            if (map3.get(abstractComponentCallbacksC0947u3.f16165v) == null) {
                if (K(2)) {
                    Log.v("FragmentManager", "Discarding retained Fragment " + abstractComponentCallbacksC0947u3 + " that was not found in the set of active Fragments " + m10.f15986r);
                }
                this.f15960O.f(abstractComponentCallbacksC0947u3);
                abstractComponentCallbacksC0947u3.f16137K = this;
                Q q11 = new Q(cVar, aVar, abstractComponentCallbacksC0947u3);
                q11.f16019e = 1;
                q11.k();
                abstractComponentCallbacksC0947u3.f16129C = true;
                q11.k();
            }
        }
        ArrayList arrayList3 = m10.f15987s;
        ((ArrayList) aVar.f556t).clear();
        if (arrayList3 != null) {
            int size3 = arrayList3.size();
            int i14 = 0;
            while (i14 < size3) {
                Object obj3 = arrayList3.get(i14);
                i14++;
                String str3 = (String) obj3;
                AbstractComponentCallbacksC0947u abstractComponentCallbacksC0947uM = aVar.m(str3);
                if (abstractComponentCallbacksC0947uM == null) {
                    throw new IllegalStateException(p245z2.a.D("No instantiated fragment for (", str3, ")"));
                }
                if (K(2)) {
                    Log.v("FragmentManager", "restoreSaveState: added (" + str3 + "): " + abstractComponentCallbacksC0947uM);
                }
                aVar.a(abstractComponentCallbacksC0947uM);
            }
        }
        if (m10.f15988t != null) {
            this.f15965d = new ArrayList(m10.f15988t.length);
            int i15 = 0;
            while (true) {
                C0929b[] c0929bArr = m10.f15988t;
                if (i15 >= c0929bArr.length) {
                    break;
                }
                C0929b c0929b = c0929bArr[i15];
                ArrayList arrayList4 = c0929b.f16074s;
                C0928a c0928a = new C0928a(this);
                int[] iArr = c0929b.f16073r;
                int i16 = 0;
                int i17 = 0;
                while (i16 < iArr.length) {
                    T t2 = new T();
                    int i18 = i16 + 1;
                    t2.f16021a = iArr[i16];
                    if (K(2)) {
                        Log.v("FragmentManager", "Instantiate " + c0928a + " op #" + i17 + " base fragment #" + iArr[i18]);
                    }
                    t2.f16027h = EnumC0767p.values()[c0929b.f16075t[i17]];
                    t2.f16028i = EnumC0767p.values()[c0929b.f16076u[i17]];
                    int i19 = i16 + 2;
                    t2.f16023c = iArr[i18] != 0;
                    int i20 = iArr[i19];
                    t2.f16024d = i20;
                    int i21 = iArr[i16 + 3];
                    t2.f16025e = i21;
                    int i22 = i16 + 5;
                    int i23 = iArr[i16 + 4];
                    t2.f16026f = i23;
                    i16 += 6;
                    int[] iArr2 = iArr;
                    int i24 = iArr2[i22];
                    t2.g = i24;
                    c0928a.f16051b = i20;
                    c0928a.f16052c = i21;
                    c0928a.f16053d = i23;
                    c0928a.f16054e = i24;
                    c0928a.b(t2);
                    i17++;
                    iArr = iArr2;
                }
                c0928a.f16055f = c0929b.f16077v;
                c0928a.f16057i = c0929b.f16078w;
                c0928a.g = true;
                c0928a.j = c0929b.f16080y;
                c0928a.f16058k = c0929b.f16081z;
                c0928a.f16059l = c0929b.f16068A;
                c0928a.f16060m = c0929b.f16069B;
                c0928a.f16061n = c0929b.f16070C;
                c0928a.f16062o = c0929b.f16071D;
                c0928a.f16063p = c0929b.f16072E;
                c0928a.f16067t = c0929b.f16079x;
                for (int i25 = 0; i25 < arrayList4.size(); i25++) {
                    String str4 = (String) arrayList4.get(i25);
                    if (str4 != null) {
                        ((T) c0928a.f16050a.get(i25)).f16022b = aVar.m(str4);
                    }
                }
                c0928a.c(1);
                if (K(2)) {
                    StringBuilder sbW = p123m2.c.w(i15, "restoreAllState: back stack #", " (index ");
                    sbW.append(c0928a.f16067t);
                    sbW.append("): ");
                    sbW.append(c0928a);
                    Log.v("FragmentManager", sbW.toString());
                    PrintWriter printWriter = new PrintWriter(new V());
                    c0928a.g("  ", printWriter, false);
                    printWriter.close();
                }
                this.f15965d.add(c0928a);
                i15++;
            }
            i10 = 0;
        } else {
            i10 = 0;
            this.f15965d = new ArrayList();
        }
        this.f15970k.set(m10.f15989u);
        String str5 = m10.f15990v;
        if (str5 != null) {
            AbstractComponentCallbacksC0947u abstractComponentCallbacksC0947uM2 = aVar.m(str5);
            this.f15985z = abstractComponentCallbacksC0947uM2;
            r(abstractComponentCallbacksC0947uM2);
        }
        ArrayList arrayList5 = m10.f15991w;
        if (arrayList5 != null) {
            for (int i26 = i10; i26 < arrayList5.size(); i26++) {
                this.f15971l.put((String) arrayList5.get(i26), (C0930c) m10.f15992x.get(i26));
            }
        }
        this.f15951F = new ArrayDeque(m10.f15993y);
    }

    public final Bundle X() {
        int i10;
        ArrayList arrayList;
        C0929b[] c0929bArr;
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        E();
        x();
        A(true);
        this.f15953H = true;
        this.f15960O.g = true;
        a aVar = this.f15964c;
        aVar.getClass();
        HashMap map = (HashMap) aVar.f554r;
        ArrayList arrayList2 = new ArrayList(map.size());
        Iterator it = map.values().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Q q10 = (Q) it.next();
            if (q10 != null) {
                AbstractComponentCallbacksC0947u abstractComponentCallbacksC0947u = q10.f16017c;
                String str = abstractComponentCallbacksC0947u.f16165v;
                Bundle bundle3 = new Bundle();
                AbstractComponentCallbacksC0947u abstractComponentCallbacksC0947u2 = q10.f16017c;
                if (abstractComponentCallbacksC0947u2.f16161r == -1 && (bundle = abstractComponentCallbacksC0947u2.f16162s) != null) {
                    bundle3.putAll(bundle);
                }
                bundle3.putParcelable("state", new P(abstractComponentCallbacksC0947u2));
                if (abstractComponentCallbacksC0947u2.f16161r > 0) {
                    Bundle bundle4 = new Bundle();
                    abstractComponentCallbacksC0947u2.F(bundle4);
                    if (!bundle4.isEmpty()) {
                        bundle3.putBundle("savedInstanceState", bundle4);
                    }
                    q10.f16015a.x(abstractComponentCallbacksC0947u2, bundle4, false);
                    Bundle bundle5 = new Bundle();
                    abstractComponentCallbacksC0947u2.f16158k0.J(bundle5);
                    if (!bundle5.isEmpty()) {
                        bundle3.putBundle("registryState", bundle5);
                    }
                    Bundle bundleX = abstractComponentCallbacksC0947u2.f16139M.X();
                    if (!bundleX.isEmpty()) {
                        bundle3.putBundle("childFragmentManager", bundleX);
                    }
                    if (abstractComponentCallbacksC0947u2.f16145X != null) {
                        q10.o();
                    }
                    SparseArray<? extends Parcelable> sparseArray = abstractComponentCallbacksC0947u2.f16163t;
                    if (sparseArray != null) {
                        bundle3.putSparseParcelableArray("viewState", sparseArray);
                    }
                    Bundle bundle6 = abstractComponentCallbacksC0947u2.f16164u;
                    if (bundle6 != null) {
                        bundle3.putBundle("viewRegistryState", bundle6);
                    }
                }
                Bundle bundle7 = abstractComponentCallbacksC0947u2.f16166w;
                if (bundle7 != null) {
                    bundle3.putBundle("arguments", bundle7);
                }
                aVar.I(str, bundle3);
                arrayList2.add(abstractComponentCallbacksC0947u.f16165v);
                if (K(2)) {
                    Log.v("FragmentManager", "Saved state of " + abstractComponentCallbacksC0947u + ": " + abstractComponentCallbacksC0947u.f16162s);
                }
            }
        }
        HashMap map2 = (HashMap) this.f15964c.f555s;
        if (!map2.isEmpty()) {
            a aVar2 = this.f15964c;
            synchronized (((ArrayList) aVar2.f556t)) {
                try {
                    if (((ArrayList) aVar2.f556t).isEmpty()) {
                        arrayList = null;
                    } else {
                        arrayList = new ArrayList(((ArrayList) aVar2.f556t).size());
                        ArrayList arrayList3 = (ArrayList) aVar2.f556t;
                        int size = arrayList3.size();
                        int i11 = 0;
                        while (i11 < size) {
                            Object obj = arrayList3.get(i11);
                            i11++;
                            AbstractComponentCallbacksC0947u abstractComponentCallbacksC0947u3 = (AbstractComponentCallbacksC0947u) obj;
                            arrayList.add(abstractComponentCallbacksC0947u3.f16165v);
                            if (K(2)) {
                                Log.v("FragmentManager", "saveAllState: adding fragment (" + abstractComponentCallbacksC0947u3.f16165v + "): " + abstractComponentCallbacksC0947u3);
                            }
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            int size2 = this.f15965d.size();
            if (size2 > 0) {
                c0929bArr = new C0929b[size2];
                for (i10 = 0; i10 < size2; i10++) {
                    c0929bArr[i10] = new C0929b((C0928a) this.f15965d.get(i10));
                    if (K(2)) {
                        StringBuilder sbW = p123m2.c.w(i10, "saveAllState: adding back stack #", ": ");
                        sbW.append(this.f15965d.get(i10));
                        Log.v("FragmentManager", sbW.toString());
                    }
                }
            } else {
                c0929bArr = null;
            }
            M m10 = new M();
            m10.f15990v = null;
            ArrayList arrayList4 = new ArrayList();
            m10.f15991w = arrayList4;
            ArrayList arrayList5 = new ArrayList();
            m10.f15992x = arrayList5;
            m10.f15986r = arrayList2;
            m10.f15987s = arrayList;
            m10.f15988t = c0929bArr;
            m10.f15989u = this.f15970k.get();
            AbstractComponentCallbacksC0947u abstractComponentCallbacksC0947u4 = this.f15985z;
            if (abstractComponentCallbacksC0947u4 != null) {
                m10.f15990v = abstractComponentCallbacksC0947u4.f16165v;
            }
            arrayList4.addAll(this.f15971l.keySet());
            arrayList5.addAll(this.f15971l.values());
            m10.f15993y = new ArrayList(this.f15951F);
            bundle2.putParcelable("state", m10);
            for (String str2 : this.f15972m.keySet()) {
                bundle2.putBundle(p123m2.c.s("result_", str2), (Bundle) this.f15972m.get(str2));
            }
            for (String str3 : map2.keySet()) {
                bundle2.putBundle(p123m2.c.s("fragment_", str3), (Bundle) map2.get(str3));
            }
        } else if (K(2)) {
            Log.v("FragmentManager", "saveAllState: no fragments!");
            return bundle2;
        }
        return bundle2;
    }

    public final void Y() {
        synchronized (this.f15962a) {
            try {
                if (this.f15962a.size() == 1) {
                    this.f15982w.f16174t.removeCallbacks(this.f15961P);
                    this.f15982w.f16174t.post(this.f15961P);
                    g0();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void Z(AbstractComponentCallbacksC0947u abstractComponentCallbacksC0947u, boolean z10) {
        ViewGroup viewGroupG = G(abstractComponentCallbacksC0947u);
        if (viewGroupG == null || !(viewGroupG instanceof FragmentContainerView)) {
            return;
        }
        ((FragmentContainerView) viewGroupG).setDrawDisappearingViewsLast(!z10);
    }

    public final Q a(AbstractComponentCallbacksC0947u abstractComponentCallbacksC0947u) {
        String str = abstractComponentCallbacksC0947u.f16152e0;
        if (str != null) {
            p064g2.c.c(abstractComponentCallbacksC0947u, str);
        }
        if (K(2)) {
            Log.v("FragmentManager", "add: " + abstractComponentCallbacksC0947u);
        }
        Q qG = g(abstractComponentCallbacksC0947u);
        abstractComponentCallbacksC0947u.f16137K = this;
        a aVar = this.f15964c;
        aVar.z(qG);
        if (!abstractComponentCallbacksC0947u.S) {
            aVar.a(abstractComponentCallbacksC0947u);
            abstractComponentCallbacksC0947u.f16129C = false;
            if (abstractComponentCallbacksC0947u.f16145X == null) {
                abstractComponentCallbacksC0947u.f16149b0 = false;
            }
            if (L(abstractComponentCallbacksC0947u)) {
                this.f15952G = true;
            }
        }
        return qG;
    }

    public final void a0(AbstractComponentCallbacksC0947u abstractComponentCallbacksC0947u, EnumC0767p enumC0767p) {
        if (abstractComponentCallbacksC0947u.equals(this.f15964c.m(abstractComponentCallbacksC0947u.f16165v)) && (abstractComponentCallbacksC0947u.f16138L == null || abstractComponentCallbacksC0947u.f16137K == this)) {
            abstractComponentCallbacksC0947u.f16153f0 = enumC0767p;
            return;
        }
        throw new IllegalArgumentException("Fragment " + abstractComponentCallbacksC0947u + " is not an active fragment of FragmentManager " + this);
    }

    public final void b(C0949w c0949w, AbstractC0951y abstractC0951y, AbstractComponentCallbacksC0947u abstractComponentCallbacksC0947u) {
        if (this.f15982w != null) {
            throw new IllegalStateException("Already attached");
        }
        this.f15982w = c0949w;
        this.f15983x = abstractC0951y;
        this.f15984y = abstractComponentCallbacksC0947u;
        CopyOnWriteArrayList copyOnWriteArrayList = this.f15975p;
        if (abstractComponentCallbacksC0947u != null) {
            copyOnWriteArrayList.add(new E(abstractComponentCallbacksC0947u));
        } else if (c0949w != null) {
            copyOnWriteArrayList.add(c0949w);
        }
        if (this.f15984y != null) {
            g0();
        }
        if (c0949w != null) {
            D dA = c0949w.f16176v.a();
            this.g = dA;
            dA.a(abstractComponentCallbacksC0947u != null ? abstractComponentCallbacksC0947u : c0949w, this.j);
        }
        if (abstractComponentCallbacksC0947u != null) {
            N n6 = abstractComponentCallbacksC0947u.f16137K.f15960O;
            HashMap map = n6.f15996c;
            N n10 = (N) map.get(abstractComponentCallbacksC0947u.f16165v);
            if (n10 == null) {
                n10 = new N(n6.f15998e);
                map.put(abstractComponentCallbacksC0947u.f16165v, n10);
            }
            this.f15960O = n10;
        } else if (c0949w != null) {
            U uG = c0949w.f16176v.g();
            p105k2.a aVar = p105k2.a.f18957b;
            j.e(aVar, "defaultCreationExtras");
            a aVar2 = new a(uG, N.f15994h, aVar);
            e eVarA = w.a(N.class);
            String strB = eVarA.b();
            if (strB == null) {
                throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
            }
            this.f15960O = (N) aVar2.x("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strB), eVarA);
        } else {
            this.f15960O = new N(false);
        }
        N n11 = this.f15960O;
        n11.g = this.f15953H || this.f15954I;
        this.f15964c.f557u = n11;
        C0949w c0949w2 = this.f15982w;
        if (c0949w2 != null && abstractComponentCallbacksC0947u == null) {
            c cVarB = c0949w2.b();
            cVarB.L("android:support:fragments", new C0368s0(3, this));
            Bundle bundleM = cVarB.m("android:support:fragments");
            if (bundleM != null) {
                W(bundleM);
            }
        }
        C0949w c0949w3 = this.f15982w;
        if (c0949w3 != null) {
            i iVar = c0949w3.f16176v.f11385z;
            String strS = p123m2.c.s("FragmentManager:", abstractComponentCallbacksC0947u != null ? p.B(new StringBuilder(), abstractComponentCallbacksC0947u.f16165v, ":") : "");
            this.f15948C = iVar.c(p.z(strS, "StartActivityForResult"), new F(3), new X4.c(this));
            this.f15949D = iVar.c(p.z(strS, "StartIntentSenderForResult"), new F(0), new B(this, 1));
            this.f15950E = iVar.c(p.z(strS, "RequestPermissions"), new F(1), new B(this, 0));
        }
        C0949w c0949w4 = this.f15982w;
        if (c0949w4 != null) {
            c0949w4.f16176v.j(this.f15976q);
        }
        C0949w c0949w5 = this.f15982w;
        if (c0949w5 != null) {
            FragmentActivity fragmentActivity = c0949w5.f16176v;
            fragmentActivity.getClass();
            A a9 = this.f15977r;
            j.e(a9, "listener");
            fragmentActivity.f11369B.add(a9);
        }
        C0949w c0949w6 = this.f15982w;
        if (c0949w6 != null) {
            FragmentActivity fragmentActivity2 = c0949w6.f16176v;
            fragmentActivity2.getClass();
            A a10 = this.f15978s;
            j.e(a10, "listener");
            fragmentActivity2.f11371D.add(a10);
        }
        C0949w c0949w7 = this.f15982w;
        if (c0949w7 != null) {
            FragmentActivity fragmentActivity3 = c0949w7.f16176v;
            fragmentActivity3.getClass();
            A a11 = this.f15979t;
            j.e(a11, "listener");
            fragmentActivity3.f11372E.add(a11);
        }
        C0949w c0949w8 = this.f15982w;
        if (c0949w8 == null || abstractComponentCallbacksC0947u != null) {
            return;
        }
        FragmentActivity fragmentActivity4 = c0949w8.f16176v;
        fragmentActivity4.getClass();
        C c10 = this.f15980u;
        j.e(c10, "provider");
        r rVar = fragmentActivity4.f11379t;
        ((CopyOnWriteArrayList) rVar.f11365t).add(c10);
        ((Runnable) rVar.f11364s).run();
    }

    public final void b0(AbstractComponentCallbacksC0947u abstractComponentCallbacksC0947u) {
        if (abstractComponentCallbacksC0947u != null) {
            if (!abstractComponentCallbacksC0947u.equals(this.f15964c.m(abstractComponentCallbacksC0947u.f16165v)) || (abstractComponentCallbacksC0947u.f16138L != null && abstractComponentCallbacksC0947u.f16137K != this)) {
                throw new IllegalArgumentException("Fragment " + abstractComponentCallbacksC0947u + " is not an active fragment of FragmentManager " + this);
            }
        }
        AbstractComponentCallbacksC0947u abstractComponentCallbacksC0947u2 = this.f15985z;
        this.f15985z = abstractComponentCallbacksC0947u;
        r(abstractComponentCallbacksC0947u2);
        r(this.f15985z);
    }

    public final void c(AbstractComponentCallbacksC0947u abstractComponentCallbacksC0947u) {
        if (K(2)) {
            Log.v("FragmentManager", "attach: " + abstractComponentCallbacksC0947u);
        }
        if (abstractComponentCallbacksC0947u.S) {
            abstractComponentCallbacksC0947u.S = false;
            if (abstractComponentCallbacksC0947u.f16128B) {
                return;
            }
            this.f15964c.a(abstractComponentCallbacksC0947u);
            if (K(2)) {
                Log.v("FragmentManager", "add from attach: " + abstractComponentCallbacksC0947u);
            }
            if (L(abstractComponentCallbacksC0947u)) {
                this.f15952G = true;
            }
        }
    }

    public final void c0(AbstractComponentCallbacksC0947u abstractComponentCallbacksC0947u) {
        ViewGroup viewGroupG = G(abstractComponentCallbacksC0947u);
        if (viewGroupG != null) {
            C0946t c0946t = abstractComponentCallbacksC0947u.f16148a0;
            if ((c0946t == null ? 0 : c0946t.f16121e) + (c0946t == null ? 0 : c0946t.f16120d) + (c0946t == null ? 0 : c0946t.f16119c) + (c0946t == null ? 0 : c0946t.f16118b) > 0) {
                if (viewGroupG.getTag(R.id.visible_removing_fragment_view_tag) == null) {
                    viewGroupG.setTag(R.id.visible_removing_fragment_view_tag, abstractComponentCallbacksC0947u);
                }
                AbstractComponentCallbacksC0947u abstractComponentCallbacksC0947u2 = (AbstractComponentCallbacksC0947u) viewGroupG.getTag(R.id.visible_removing_fragment_view_tag);
                C0946t c0946t2 = abstractComponentCallbacksC0947u.f16148a0;
                boolean z10 = c0946t2 != null ? c0946t2.f16117a : false;
                if (abstractComponentCallbacksC0947u2.f16148a0 == null) {
                    return;
                }
                abstractComponentCallbacksC0947u2.i().f16117a = z10;
            }
        }
    }

    public final void d() {
        this.f15963b = false;
        this.f15958M.clear();
        this.f15957L.clear();
    }

    public final HashSet e() {
        C0941n c0941n;
        HashSet hashSet = new HashSet();
        ArrayList arrayListQ = this.f15964c.q();
        int size = arrayListQ.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayListQ.get(i10);
            i10++;
            ViewGroup viewGroup = ((Q) obj).f16017c.f16144W;
            if (viewGroup != null) {
                j.e(I(), "factory");
                Object tag = viewGroup.getTag(R.id.special_effects_controller_view_tag);
                if (tag instanceof C0941n) {
                    c0941n = (C0941n) tag;
                } else {
                    c0941n = new C0941n(viewGroup);
                    viewGroup.setTag(R.id.special_effects_controller_view_tag, c0941n);
                }
                hashSet.add(c0941n);
            }
        }
        return hashSet;
    }

    public final void e0() {
        ArrayList arrayListQ = this.f15964c.q();
        int size = arrayListQ.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayListQ.get(i10);
            i10++;
            Q q10 = (Q) obj;
            AbstractComponentCallbacksC0947u abstractComponentCallbacksC0947u = q10.f16017c;
            if (abstractComponentCallbacksC0947u.f16146Y) {
                if (this.f15963b) {
                    this.f15956K = true;
                } else {
                    abstractComponentCallbacksC0947u.f16146Y = false;
                    q10.k();
                }
            }
        }
    }

    public final HashSet f(ArrayList arrayList, int i10, int i11) {
        ViewGroup viewGroup;
        HashSet hashSet = new HashSet();
        while (i10 < i11) {
            ArrayList arrayList2 = ((C0928a) arrayList.get(i10)).f16050a;
            int size = arrayList2.size();
            int i12 = 0;
            while (i12 < size) {
                Object obj = arrayList2.get(i12);
                i12++;
                AbstractComponentCallbacksC0947u abstractComponentCallbacksC0947u = ((T) obj).f16022b;
                if (abstractComponentCallbacksC0947u != null && (viewGroup = abstractComponentCallbacksC0947u.f16144W) != null) {
                    hashSet.add(C0941n.i(viewGroup, this));
                }
            }
            i10++;
        }
        return hashSet;
    }

    public final void f0(IllegalStateException illegalStateException) {
        Log.e("FragmentManager", illegalStateException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new V());
        C0949w c0949w = this.f15982w;
        if (c0949w == null) {
            try {
                w("  ", null, printWriter, new String[0]);
                throw illegalStateException;
            } catch (Exception e10) {
                Log.e("FragmentManager", "Failed dumping state", e10);
                throw illegalStateException;
            }
        }
        try {
            c0949w.f16176v.dump("  ", null, printWriter, new String[0]);
            throw illegalStateException;
        } catch (Exception e11) {
            Log.e("FragmentManager", "Failed dumping state", e11);
            throw illegalStateException;
        }
    }

    public final Q g(AbstractComponentCallbacksC0947u abstractComponentCallbacksC0947u) {
        String str = abstractComponentCallbacksC0947u.f16165v;
        a aVar = this.f15964c;
        Q q10 = (Q) ((HashMap) aVar.f554r).get(str);
        if (q10 != null) {
            return q10;
        }
        Q q11 = new Q(this.f15974o, aVar, abstractComponentCallbacksC0947u);
        q11.m(this.f15982w.f16173s.getClassLoader());
        q11.f16019e = this.f15981v;
        return q11;
    }

    public final void g0() {
        synchronized (this.f15962a) {
            try {
                if (!this.f15962a.isEmpty()) {
                    this.j.e(true);
                    if (K(3)) {
                        Log.d("FragmentManager", "FragmentManager " + this + " enabling OnBackPressedCallback, caused by non-empty pending actions");
                    }
                    return;
                }
                boolean z10 = this.f15965d.size() + (this.f15968h != null ? 1 : 0) > 0 && O(this.f15984y);
                if (K(3)) {
                    Log.d("FragmentManager", "OnBackPressedCallback for FragmentManager " + this + " enabled state is " + z10);
                }
                this.j.e(z10);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void h(AbstractComponentCallbacksC0947u abstractComponentCallbacksC0947u) {
        if (K(2)) {
            Log.v("FragmentManager", "detach: " + abstractComponentCallbacksC0947u);
        }
        if (abstractComponentCallbacksC0947u.S) {
            return;
        }
        abstractComponentCallbacksC0947u.S = true;
        if (abstractComponentCallbacksC0947u.f16128B) {
            if (K(2)) {
                Log.v("FragmentManager", "remove from detach: " + abstractComponentCallbacksC0947u);
            }
            a aVar = this.f15964c;
            synchronized (((ArrayList) aVar.f556t)) {
                ((ArrayList) aVar.f556t).remove(abstractComponentCallbacksC0947u);
            }
            abstractComponentCallbacksC0947u.f16128B = false;
            if (L(abstractComponentCallbacksC0947u)) {
                this.f15952G = true;
            }
            c0(abstractComponentCallbacksC0947u);
        }
    }

    public final void i(boolean z10) {
        if (z10 && this.f15982w != null) {
            f0(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
            throw null;
        }
        for (AbstractComponentCallbacksC0947u abstractComponentCallbacksC0947u : this.f15964c.v()) {
            if (abstractComponentCallbacksC0947u != null) {
                abstractComponentCallbacksC0947u.f16143V = true;
                if (z10) {
                    abstractComponentCallbacksC0947u.f16139M.i(true);
                }
            }
        }
    }

    public final boolean j() {
        if (this.f15981v >= 1) {
            for (AbstractComponentCallbacksC0947u abstractComponentCallbacksC0947u : this.f15964c.v()) {
                if (abstractComponentCallbacksC0947u != null) {
                    if (!abstractComponentCallbacksC0947u.R ? abstractComponentCallbacksC0947u.f16139M.j() : false) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final boolean k() {
        if (this.f15981v < 1) {
            return false;
        }
        ArrayList arrayList = null;
        boolean z10 = false;
        for (AbstractComponentCallbacksC0947u abstractComponentCallbacksC0947u : this.f15964c.v()) {
            if (abstractComponentCallbacksC0947u != null && N(abstractComponentCallbacksC0947u)) {
                if (!abstractComponentCallbacksC0947u.R ? abstractComponentCallbacksC0947u.f16139M.k() : false) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(abstractComponentCallbacksC0947u);
                    z10 = true;
                }
            }
        }
        if (this.f15966e != null) {
            for (int i10 = 0; i10 < this.f15966e.size(); i10++) {
                AbstractComponentCallbacksC0947u abstractComponentCallbacksC0947u2 = (AbstractComponentCallbacksC0947u) this.f15966e.get(i10);
                if (arrayList == null || !arrayList.contains(abstractComponentCallbacksC0947u2)) {
                    abstractComponentCallbacksC0947u2.getClass();
                }
            }
        }
        this.f15966e = arrayList;
        return z10;
    }

    public final void l() {
        boolean z10;
        this.f15955J = true;
        A(true);
        x();
        C0949w c0949w = this.f15982w;
        a aVar = this.f15964c;
        if (c0949w != null) {
            z10 = ((N) aVar.f557u).f15999f;
        } else {
            FragmentActivity fragmentActivity = c0949w.f16173s;
            z10 = p123m2.c.D(fragmentActivity) ? !fragmentActivity.isChangingConfigurations() : true;
        }
        if (z10) {
            Iterator it = this.f15971l.values().iterator();
            while (it.hasNext()) {
                ArrayList arrayList = ((C0930c) it.next()).f16082r;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((N) aVar.f557u).d((String) obj, false);
                }
            }
        }
        u(-1);
        C0949w c0949w2 = this.f15982w;
        if (c0949w2 != null) {
            FragmentActivity fragmentActivity2 = c0949w2.f16176v;
            fragmentActivity2.getClass();
            A a9 = this.f15977r;
            j.e(a9, "listener");
            fragmentActivity2.f11369B.remove(a9);
        }
        C0949w c0949w3 = this.f15982w;
        if (c0949w3 != null) {
            FragmentActivity fragmentActivity3 = c0949w3.f16176v;
            fragmentActivity3.getClass();
            A a10 = this.f15976q;
            j.e(a10, "listener");
            fragmentActivity3.f11368A.remove(a10);
        }
        C0949w c0949w4 = this.f15982w;
        if (c0949w4 != null) {
            FragmentActivity fragmentActivity4 = c0949w4.f16176v;
            fragmentActivity4.getClass();
            A a11 = this.f15978s;
            j.e(a11, "listener");
            fragmentActivity4.f11371D.remove(a11);
        }
        C0949w c0949w5 = this.f15982w;
        if (c0949w5 != null) {
            FragmentActivity fragmentActivity5 = c0949w5.f16176v;
            fragmentActivity5.getClass();
            A a12 = this.f15979t;
            j.e(a12, "listener");
            fragmentActivity5.f11372E.remove(a12);
        }
        C0949w c0949w6 = this.f15982w;
        if ((c0949w6 != null) && this.f15984y == null) {
            FragmentActivity fragmentActivity6 = c0949w6.f16176v;
            fragmentActivity6.getClass();
            C c10 = this.f15980u;
            j.e(c10, "provider");
            r rVar = fragmentActivity6.f11379t;
            ((CopyOnWriteArrayList) rVar.f11365t).remove(c10);
            if (((HashMap) rVar.f11366u).remove(c10) != null) {
                throw new ClassCastException();
            }
            ((Runnable) rVar.f11364s).run();
        }
        this.f15982w = null;
        this.f15983x = null;
        this.f15984y = null;
        if (this.g != null) {
            Iterator it2 = this.j.f13408b.iterator();
            while (it2.hasNext()) {
                ((InterfaceC0777b) it2.next()).cancel();
            }
            this.g = null;
        }
        g gVar = this.f15948C;
        if (gVar != null) {
            gVar.j.e(gVar.f15881k);
            g gVar2 = this.f15949D;
            gVar2.j.e(gVar2.f15881k);
            g gVar3 = this.f15950E;
            gVar3.j.e(gVar3.f15881k);
        }
    }

    public final void m(boolean z10) {
        if (z10 && this.f15982w != null) {
            f0(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
            throw null;
        }
        for (AbstractComponentCallbacksC0947u abstractComponentCallbacksC0947u : this.f15964c.v()) {
            if (abstractComponentCallbacksC0947u != null) {
                abstractComponentCallbacksC0947u.f16143V = true;
                if (z10) {
                    abstractComponentCallbacksC0947u.f16139M.m(true);
                }
            }
        }
    }

    public final void n(boolean z10) {
        if (z10 && this.f15982w != null) {
            f0(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
            throw null;
        }
        for (AbstractComponentCallbacksC0947u abstractComponentCallbacksC0947u : this.f15964c.v()) {
            if (abstractComponentCallbacksC0947u != null && z10) {
                abstractComponentCallbacksC0947u.f16139M.n(true);
            }
        }
    }

    public final void o() {
        ArrayList arrayListT = this.f15964c.t();
        int size = arrayListT.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayListT.get(i10);
            i10++;
            AbstractComponentCallbacksC0947u abstractComponentCallbacksC0947u = (AbstractComponentCallbacksC0947u) obj;
            if (abstractComponentCallbacksC0947u != null) {
                abstractComponentCallbacksC0947u.t();
                abstractComponentCallbacksC0947u.f16139M.o();
            }
        }
    }

    public final boolean p() {
        if (this.f15981v >= 1) {
            for (AbstractComponentCallbacksC0947u abstractComponentCallbacksC0947u : this.f15964c.v()) {
                if (abstractComponentCallbacksC0947u != null) {
                    if (!abstractComponentCallbacksC0947u.R ? abstractComponentCallbacksC0947u.f16139M.p() : false) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final void q() {
        if (this.f15981v < 1) {
            return;
        }
        for (AbstractComponentCallbacksC0947u abstractComponentCallbacksC0947u : this.f15964c.v()) {
            if (abstractComponentCallbacksC0947u != null && !abstractComponentCallbacksC0947u.R) {
                abstractComponentCallbacksC0947u.f16139M.q();
            }
        }
    }

    public final void r(AbstractComponentCallbacksC0947u abstractComponentCallbacksC0947u) {
        if (abstractComponentCallbacksC0947u != null) {
            if (abstractComponentCallbacksC0947u.equals(this.f15964c.m(abstractComponentCallbacksC0947u.f16165v))) {
                abstractComponentCallbacksC0947u.f16137K.getClass();
                boolean zO = O(abstractComponentCallbacksC0947u);
                Boolean bool = abstractComponentCallbacksC0947u.f16127A;
                if (bool == null || bool.booleanValue() != zO) {
                    abstractComponentCallbacksC0947u.f16127A = Boolean.valueOf(zO);
                    L l10 = abstractComponentCallbacksC0947u.f16139M;
                    l10.g0();
                    l10.r(l10.f15985z);
                }
            }
        }
    }

    public final void s(boolean z10) {
        if (z10 && this.f15982w != null) {
            f0(new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
            throw null;
        }
        for (AbstractComponentCallbacksC0947u abstractComponentCallbacksC0947u : this.f15964c.v()) {
            if (abstractComponentCallbacksC0947u != null && z10) {
                abstractComponentCallbacksC0947u.f16139M.s(true);
            }
        }
    }

    public final boolean t() {
        if (this.f15981v < 1) {
            return false;
        }
        boolean z10 = false;
        for (AbstractComponentCallbacksC0947u abstractComponentCallbacksC0947u : this.f15964c.v()) {
            if (abstractComponentCallbacksC0947u != null && N(abstractComponentCallbacksC0947u)) {
                if (!abstractComponentCallbacksC0947u.R ? abstractComponentCallbacksC0947u.f16139M.t() : false) {
                    z10 = true;
                }
            }
        }
        return z10;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        AbstractComponentCallbacksC0947u abstractComponentCallbacksC0947u = this.f15984y;
        if (abstractComponentCallbacksC0947u != null) {
            sb.append(abstractComponentCallbacksC0947u.getClass().getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(this.f15984y)));
            sb.append("}");
        } else {
            C0949w c0949w = this.f15982w;
            if (c0949w != null) {
                sb.append(c0949w.getClass().getSimpleName());
                sb.append("{");
                sb.append(Integer.toHexString(System.identityHashCode(this.f15982w)));
                sb.append("}");
            } else {
                sb.append("null");
            }
        }
        sb.append("}}");
        return sb.toString();
    }

    public final void u(int i10) {
        try {
            this.f15963b = true;
            for (Q q10 : ((HashMap) this.f15964c.f554r).values()) {
                if (q10 != null) {
                    q10.f16019e = i10;
                }
            }
            P(i10, false);
            Iterator it = e().iterator();
            while (it.hasNext()) {
                ((C0941n) it.next()).h();
            }
            this.f15963b = false;
            A(true);
        } catch (Throwable th) {
            this.f15963b = false;
            throw th;
        }
    }

    public final void v() {
        if (this.f15956K) {
            this.f15956K = false;
            e0();
        }
    }

    public final void w(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        String strZ = p.z(str, "    ");
        a aVar = this.f15964c;
        ArrayList arrayList = (ArrayList) aVar.f556t;
        String strZ2 = p.z(str, "    ");
        HashMap map = (HashMap) aVar.f554r;
        if (!map.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (Q q10 : map.values()) {
                printWriter.print(str);
                if (q10 != null) {
                    AbstractComponentCallbacksC0947u abstractComponentCallbacksC0947u = q10.f16017c;
                    printWriter.println(abstractComponentCallbacksC0947u);
                    abstractComponentCallbacksC0947u.getClass();
                    printWriter.print(strZ2);
                    printWriter.print("mFragmentId=#");
                    printWriter.print(Integer.toHexString(abstractComponentCallbacksC0947u.f16141O));
                    printWriter.print(" mContainerId=#");
                    printWriter.print(Integer.toHexString(abstractComponentCallbacksC0947u.f16142P));
                    printWriter.print(" mTag=");
                    printWriter.println(abstractComponentCallbacksC0947u.Q);
                    printWriter.print(strZ2);
                    printWriter.print("mState=");
                    printWriter.print(abstractComponentCallbacksC0947u.f16161r);
                    printWriter.print(" mWho=");
                    printWriter.print(abstractComponentCallbacksC0947u.f16165v);
                    printWriter.print(" mBackStackNesting=");
                    printWriter.println(abstractComponentCallbacksC0947u.f16136J);
                    printWriter.print(strZ2);
                    printWriter.print("mAdded=");
                    printWriter.print(abstractComponentCallbacksC0947u.f16128B);
                    printWriter.print(" mRemoving=");
                    printWriter.print(abstractComponentCallbacksC0947u.f16129C);
                    printWriter.print(" mFromLayout=");
                    printWriter.print(abstractComponentCallbacksC0947u.f16131E);
                    printWriter.print(" mInLayout=");
                    printWriter.println(abstractComponentCallbacksC0947u.f16132F);
                    printWriter.print(strZ2);
                    printWriter.print("mHidden=");
                    printWriter.print(abstractComponentCallbacksC0947u.R);
                    printWriter.print(" mDetached=");
                    printWriter.print(abstractComponentCallbacksC0947u.S);
                    printWriter.print(" mMenuVisible=");
                    printWriter.print(abstractComponentCallbacksC0947u.U);
                    printWriter.print(" mHasMenu=");
                    printWriter.println(false);
                    printWriter.print(strZ2);
                    printWriter.print("mRetainInstance=");
                    printWriter.print(abstractComponentCallbacksC0947u.T);
                    printWriter.print(" mUserVisibleHint=");
                    printWriter.println(abstractComponentCallbacksC0947u.f16147Z);
                    if (abstractComponentCallbacksC0947u.f16137K != null) {
                        printWriter.print(strZ2);
                        printWriter.print("mFragmentManager=");
                        printWriter.println(abstractComponentCallbacksC0947u.f16137K);
                    }
                    if (abstractComponentCallbacksC0947u.f16138L != null) {
                        printWriter.print(strZ2);
                        printWriter.print("mHost=");
                        printWriter.println(abstractComponentCallbacksC0947u.f16138L);
                    }
                    if (abstractComponentCallbacksC0947u.f16140N != null) {
                        printWriter.print(strZ2);
                        printWriter.print("mParentFragment=");
                        printWriter.println(abstractComponentCallbacksC0947u.f16140N);
                    }
                    if (abstractComponentCallbacksC0947u.f16166w != null) {
                        printWriter.print(strZ2);
                        printWriter.print("mArguments=");
                        printWriter.println(abstractComponentCallbacksC0947u.f16166w);
                    }
                    if (abstractComponentCallbacksC0947u.f16162s != null) {
                        printWriter.print(strZ2);
                        printWriter.print("mSavedFragmentState=");
                        printWriter.println(abstractComponentCallbacksC0947u.f16162s);
                    }
                    if (abstractComponentCallbacksC0947u.f16163t != null) {
                        printWriter.print(strZ2);
                        printWriter.print("mSavedViewState=");
                        printWriter.println(abstractComponentCallbacksC0947u.f16163t);
                    }
                    if (abstractComponentCallbacksC0947u.f16164u != null) {
                        printWriter.print(strZ2);
                        printWriter.print("mSavedViewRegistryState=");
                        printWriter.println(abstractComponentCallbacksC0947u.f16164u);
                    }
                    Object objQ = abstractComponentCallbacksC0947u.q(false);
                    if (objQ != null) {
                        printWriter.print(strZ2);
                        printWriter.print("mTarget=");
                        printWriter.print(objQ);
                        printWriter.print(" mTargetRequestCode=");
                        printWriter.println(abstractComponentCallbacksC0947u.f16169z);
                    }
                    printWriter.print(strZ2);
                    printWriter.print("mPopDirection=");
                    C0946t c0946t = abstractComponentCallbacksC0947u.f16148a0;
                    printWriter.println(c0946t == null ? false : c0946t.f16117a);
                    C0946t c0946t2 = abstractComponentCallbacksC0947u.f16148a0;
                    if ((c0946t2 == null ? 0 : c0946t2.f16118b) != 0) {
                        printWriter.print(strZ2);
                        printWriter.print("getEnterAnim=");
                        C0946t c0946t3 = abstractComponentCallbacksC0947u.f16148a0;
                        printWriter.println(c0946t3 == null ? 0 : c0946t3.f16118b);
                    }
                    C0946t c0946t4 = abstractComponentCallbacksC0947u.f16148a0;
                    if ((c0946t4 == null ? 0 : c0946t4.f16119c) != 0) {
                        printWriter.print(strZ2);
                        printWriter.print("getExitAnim=");
                        C0946t c0946t5 = abstractComponentCallbacksC0947u.f16148a0;
                        printWriter.println(c0946t5 == null ? 0 : c0946t5.f16119c);
                    }
                    C0946t c0946t6 = abstractComponentCallbacksC0947u.f16148a0;
                    if ((c0946t6 == null ? 0 : c0946t6.f16120d) != 0) {
                        printWriter.print(strZ2);
                        printWriter.print("getPopEnterAnim=");
                        C0946t c0946t7 = abstractComponentCallbacksC0947u.f16148a0;
                        printWriter.println(c0946t7 == null ? 0 : c0946t7.f16120d);
                    }
                    C0946t c0946t8 = abstractComponentCallbacksC0947u.f16148a0;
                    if ((c0946t8 == null ? 0 : c0946t8.f16121e) != 0) {
                        printWriter.print(strZ2);
                        printWriter.print("getPopExitAnim=");
                        C0946t c0946t9 = abstractComponentCallbacksC0947u.f16148a0;
                        printWriter.println(c0946t9 == null ? 0 : c0946t9.f16121e);
                    }
                    if (abstractComponentCallbacksC0947u.f16144W != null) {
                        printWriter.print(strZ2);
                        printWriter.print("mContainer=");
                        printWriter.println(abstractComponentCallbacksC0947u.f16144W);
                    }
                    if (abstractComponentCallbacksC0947u.f16145X != null) {
                        printWriter.print(strZ2);
                        printWriter.print("mView=");
                        printWriter.println(abstractComponentCallbacksC0947u.f16145X);
                    }
                    if (abstractComponentCallbacksC0947u.l() != null) {
                        U uG = abstractComponentCallbacksC0947u.g();
                        J j = p133n2.a.f19981c;
                        j.e(uG, "store");
                        p105k2.a aVar2 = p105k2.a.f18957b;
                        j.e(aVar2, "defaultCreationExtras");
                        a aVar3 = new a(uG, j, aVar2);
                        e eVarA = w.a(p133n2.a.class);
                        String strB = eVarA.b();
                        if (strB == null) {
                            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
                        }
                        P p10 = ((p133n2.a) aVar3.x("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strB), eVarA)).f19982b;
                        if (p10.g() > 0) {
                            printWriter.print(strZ2);
                            printWriter.println("Loaders:");
                            if (p10.g() > 0) {
                                if (p10.h(0) != null) {
                                    throw new ClassCastException();
                                }
                                printWriter.print(strZ2);
                                printWriter.print("  #");
                                printWriter.print(p10.e(0));
                                printWriter.print(": ");
                                throw null;
                            }
                        }
                    }
                    printWriter.print(strZ2);
                    printWriter.println("Child " + abstractComponentCallbacksC0947u.f16139M + ":");
                    abstractComponentCallbacksC0947u.f16139M.w(p.z(strZ2, "  "), fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        int size2 = arrayList.size();
        if (size2 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i10 = 0; i10 < size2; i10++) {
                AbstractComponentCallbacksC0947u abstractComponentCallbacksC0947u2 = (AbstractComponentCallbacksC0947u) arrayList.get(i10);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i10);
                printWriter.print(": ");
                printWriter.println(abstractComponentCallbacksC0947u2.toString());
            }
        }
        ArrayList arrayList2 = this.f15966e;
        if (arrayList2 != null && (size = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i11 = 0; i11 < size; i11++) {
                AbstractComponentCallbacksC0947u abstractComponentCallbacksC0947u3 = (AbstractComponentCallbacksC0947u) this.f15966e.get(i11);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i11);
                printWriter.print(": ");
                printWriter.println(abstractComponentCallbacksC0947u3.toString());
            }
        }
        int size3 = this.f15965d.size();
        if (size3 > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i12 = 0; i12 < size3; i12++) {
                C0928a c0928a = (C0928a) this.f15965d.get(i12);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i12);
                printWriter.print(": ");
                printWriter.println(c0928a.toString());
                c0928a.g(strZ, printWriter, true);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.f15970k.get());
        synchronized (this.f15962a) {
            try {
                int size4 = this.f15962a.size();
                if (size4 > 0) {
                    printWriter.print(str);
                    printWriter.println("Pending Actions:");
                    for (int i13 = 0; i13 < size4; i13++) {
                        Object obj = (H) this.f15962a.get(i13);
                        printWriter.print(str);
                        printWriter.print("  #");
                        printWriter.print(i13);
                        printWriter.print(": ");
                        printWriter.println(obj);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.f15982w);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f15983x);
        if (this.f15984y != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f15984y);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f15981v);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.f15953H);
        printWriter.print(" mStopped=");
        printWriter.print(this.f15954I);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.f15955J);
        if (this.f15952G) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.f15952G);
        }
    }

    public final void x() {
        Iterator it = e().iterator();
        while (it.hasNext()) {
            ((C0941n) it.next()).h();
        }
    }

    public final void y(H h7, boolean z10) {
        if (!z10) {
            if (this.f15982w == null) {
                if (!this.f15955J) {
                    throw new IllegalStateException("FragmentManager has not been attached to a host.");
                }
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            if (this.f15953H || this.f15954I) {
                throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
            }
        }
        synchronized (this.f15962a) {
            try {
                if (this.f15982w == null) {
                    if (!z10) {
                        throw new IllegalStateException("Activity has been destroyed");
                    }
                } else {
                    this.f15962a.add(h7);
                    Y();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void z(boolean z10) {
        if (this.f15963b) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        }
        if (this.f15982w == null) {
            if (!this.f15955J) {
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            throw new IllegalStateException("FragmentManager has been destroyed");
        }
        if (Looper.myLooper() != this.f15982w.f16174t.getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
        if (!z10 && (this.f15953H || this.f15954I)) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        if (this.f15957L == null) {
            this.f15957L = new ArrayList();
            this.f15958M = new ArrayList();
        }
    }
}
