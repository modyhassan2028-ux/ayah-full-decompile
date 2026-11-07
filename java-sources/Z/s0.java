package Z;

import D0.C0086d;
import K9.C0389g;
import K9.InterfaceC0388f;
import N9.AbstractC0419l;
import W.C0557f1;
import android.util.Log;
import com.google.android.gms.internal.measurement.AbstractC0813f2;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class s0 extends r {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final N9.k0 f10786x = AbstractC0419l.c(p054f0.b.f15890u);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final AtomicReference f10787y = new AtomicReference(Boolean.FALSE);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0678e f10788a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f10789b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public K9.a0 f10790c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Throwable f10791d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f10792e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f10793f;
    public u.F g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p011b0.e f10794h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ArrayList f10795i;
    public final ArrayList j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final u.E f10796k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final L5.c f10797l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final u.E f10798m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final u.E f10799n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ArrayList f10800o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public LinkedHashSet f10801p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public C0389g f10802q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public X4.c f10803r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f10804s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final N9.k0 f10805t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final K9.c0 f10806u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final p150o9.h f10807v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final S f10808w;

    public s0(p150o9.h hVar) {
        C0678e c0678e = new C0678e(new C0557f1(7, this));
        this.f10788a = c0678e;
        this.f10789b = new Object();
        this.f10792e = new ArrayList();
        this.g = new u.F();
        this.f10794h = new p011b0.e(new C0704u[16]);
        this.f10795i = new ArrayList();
        this.j = new ArrayList();
        this.f10796k = new u.E();
        this.f10797l = new L5.c(15);
        this.f10798m = new u.E();
        this.f10799n = new u.E();
        this.f10805t = AbstractC0419l.c(p0.f10760t);
        new AtomicReference(p074h0.j.f16425a);
        K9.c0 c0Var = new K9.c0((K9.a0) hVar.i(K9.r.f5392s));
        c0Var.s(new A.M0(27, this));
        this.f10806u = c0Var;
        this.f10807v = hVar.L(c0678e).L(c0Var);
        this.f10808w = new S(9);
    }

    public static final void E(ArrayList arrayList, s0 s0Var, C0704u c0704u) {
        arrayList.clear();
        synchronized (s0Var.f10789b) {
            Iterator it = s0Var.j.iterator();
            if (it.hasNext()) {
                ((W) it.next()).getClass();
                throw null;
            }
        }
    }

    public static final Object q(s0 s0Var, r0 r0Var) {
        C0389g c0389g;
        if (s0Var.A()) {
            return p110k9.y.f19095a;
        }
        C0389g c0389g2 = new C0389g(1, AbstractC0813f2.H(r0Var));
        c0389g2.s();
        synchronized (s0Var.f10789b) {
            if (s0Var.A()) {
                c0389g = c0389g2;
            } else {
                s0Var.f10802q = c0389g2;
                c0389g = null;
            }
        }
        if (c0389g != null) {
            c0389g.resumeWith(p110k9.y.f19095a);
        }
        Object objR = c0389g2.r();
        return objR == p161p9.a.f21156r ? objR : p110k9.y.f19095a;
    }

    public static final void r(s0 s0Var) {
        int i10;
        u.A a9;
        synchronized (s0Var.f10789b) {
            try {
                u.E e10 = s0Var.f10796k;
                if (e10.f22673e != 0) {
                    u.A aB = p011b0.a.b(e10);
                    s0Var.f10796k.a();
                    L5.c cVar = s0Var.f10797l;
                    ((u.E) cVar.f5532s).a();
                    ((u.E) cVar.f5533t).a();
                    s0Var.f10799n.a();
                    a9 = new u.A(aB.f22651b);
                    Object[] objArr = aB.f22650a;
                    int i11 = aB.f22651b;
                    for (int i12 = 0; i12 < i11; i12++) {
                        W w9 = (W) objArr[i12];
                        a9.a(new p110k9.j(w9, s0Var.f10798m.g(w9)));
                    }
                    s0Var.f10798m.a();
                } else {
                    a9 = u.K.f22697b;
                    p251z9.j.c(a9, "null cannot be cast to non-null type androidx.collection.ObjectList<E of androidx.collection.ObjectListKt.emptyObjectList>");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Object[] objArr2 = a9.f22650a;
        int i13 = a9.f22651b;
        for (i10 = 0; i10 < i13; i10++) {
            p110k9.j jVar = (p110k9.j) objArr2[i10];
        }
    }

    public static final boolean s(s0 s0Var) {
        boolean z10;
        synchronized (s0Var.f10789b) {
            z10 = s0Var.z();
        }
        return z10;
    }

    public static final C0704u t(s0 s0Var, C0704u c0704u, u.F f3) {
        LinkedHashSet linkedHashSet;
        p093j0.e eVarD;
        if (!c0704u.f10819J.f10710E && !c0704u.f10820K && ((linkedHashSet = s0Var.f10801p) == null || !linkedHashSet.contains(c0704u))) {
            A.M0 m10 = new A.M0(28, c0704u);
            X.L l10 = new X.L(6, c0704u, f3);
            p093j0.i iVarK = p093j0.n.k();
            p093j0.e eVar = iVarK instanceof p093j0.e ? (p093j0.e) iVarK : null;
            if (eVar == null || (eVarD = eVar.D(m10, l10)) == null) {
                throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
            }
            try {
                p093j0.i iVarJ = eVarD.j();
                if (f3 != null) {
                    try {
                        if (f3.h()) {
                            C0086d c0086d = new C0086d(21, f3, c0704u);
                            C0698o c0698o = c0704u.f10819J;
                            if (c0698o.f10710E) {
                                AbstractC0700p.c("Preparing a composition while composing is not supported");
                            }
                            c0698o.f10710E = true;
                            try {
                                c0086d.invoke();
                                c0698o.f10710E = false;
                            } catch (Throwable th) {
                                c0698o.f10710E = false;
                                throw th;
                            }
                        }
                    } catch (Throwable th2) {
                        p093j0.i.q(iVarJ);
                        throw th2;
                    }
                }
                boolean zV = c0704u.v();
                p093j0.i.q(iVarJ);
                w(eVarD);
                if (zV) {
                    return c0704u;
                }
            } catch (Throwable th3) {
                w(eVarD);
                throw th3;
            }
        }
        return null;
    }

    public static final boolean u(s0 s0Var) {
        List listB;
        synchronized (s0Var.f10789b) {
            boolean z10 = true;
            if (s0Var.g.g()) {
                if (s0Var.f10794h.f13127t == 0 && !s0Var.z()) {
                    z10 = false;
                }
                return z10;
            }
            p011b0.h hVar = new p011b0.h(s0Var.g);
            s0Var.g = new u.F();
            synchronized (s0Var.f10789b) {
                listB = s0Var.B();
            }
            try {
                int size = listB.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((C0704u) listB.get(i10)).w(hVar);
                    if (((p0) s0Var.f10805t.getValue()).compareTo(p0.f10759s) <= 0) {
                        break;
                    }
                }
                synchronized (s0Var.f10789b) {
                    s0Var.g = new u.F();
                }
                synchronized (s0Var.f10789b) {
                    if (s0Var.y() != null) {
                        throw new IllegalStateException("called outside of runRecomposeAndApplyChanges");
                    }
                    if (s0Var.f10794h.f13127t == 0 && !s0Var.z()) {
                        z10 = false;
                    }
                }
                return z10;
            } catch (Throwable th) {
                synchronized (s0Var.f10789b) {
                    u.F f3 = s0Var.g;
                    f3.getClass();
                    Iterator<E> it = hVar.iterator();
                    while (it.hasNext()) {
                        f3.j(it.next());
                    }
                    throw th;
                }
            }
        }
    }

    public static final void v(s0 s0Var, K9.a0 a0Var) {
        synchronized (s0Var.f10789b) {
            Throwable th = s0Var.f10791d;
            if (th != null) {
                throw th;
            }
            if (((p0) s0Var.f10805t.getValue()).compareTo(p0.f10759s) <= 0) {
                throw new IllegalStateException("Recomposer shut down");
            }
            if (s0Var.f10790c != null) {
                throw new IllegalStateException("Recomposer already running");
            }
            s0Var.f10790c = a0Var;
            s0Var.y();
        }
    }

    public static void w(p093j0.e eVar) {
        try {
            if (eVar.w() instanceof p093j0.j) {
                throw new IllegalStateException("Unsupported concurrent change during composition. A state object was modified by composition as well as being modified outside composition.");
            }
            eVar.c();
        } catch (Throwable th) {
            eVar.c();
            throw th;
        }
    }

    public final boolean A() {
        boolean z10;
        synchronized (this.f10789b) {
            z10 = this.g.h() || this.f10794h.f13127t != 0 || z();
        }
        return z10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    public final List B() {
        Object obj = this.f10793f;
        ?? r10 = obj;
        if (obj == null) {
            ArrayList arrayList = this.f10792e;
            Object arrayList2 = arrayList.isEmpty() ? p120l9.r.f19440r : new ArrayList(arrayList);
            this.f10793f = arrayList2;
            r10 = arrayList2;
        }
        return r10;
    }

    public final void C() {
        synchronized (this.f10789b) {
            this.f10804s = true;
        }
    }

    public final void D(C0704u c0704u) {
        synchronized (this.f10789b) {
            ArrayList arrayList = this.j;
            if (arrayList.size() > 0) {
                ((W) arrayList.get(0)).getClass();
                throw null;
            }
        }
    }

    public final List F(List list, u.F f3) {
        p093j0.e eVarD;
        ArrayList arrayList;
        HashMap map = new HashMap(list.size());
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            Object obj = list.get(i10);
            ((W) obj).getClass();
            Object arrayList2 = map.get(null);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                map.put(null, arrayList2);
            }
            ((ArrayList) arrayList2).add(obj);
        }
        for (Map.Entry entry : map.entrySet()) {
            C0704u c0704u = (C0704u) entry.getKey();
            List list2 = (List) entry.getValue();
            if (c0704u.f10819J.f10710E) {
                AbstractC0700p.c("Check failed");
            }
            A.M0 m10 = new A.M0(28, c0704u);
            X.L l10 = new X.L(6, c0704u, f3);
            p093j0.i iVarK = p093j0.n.k();
            p093j0.e eVar = iVarK instanceof p093j0.e ? (p093j0.e) iVarK : null;
            if (eVar == null || (eVarD = eVar.D(m10, l10)) == null) {
                throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
            }
            try {
                p093j0.i iVarJ = eVarD.j();
                try {
                    synchronized (this.f10789b) {
                        try {
                            arrayList = new ArrayList(list2.size());
                            int size2 = list2.size();
                            for (int i11 = 0; i11 < size2; i11++) {
                                W w9 = (W) list2.get(i11);
                                u.E e10 = this.f10796k;
                                w9.getClass();
                                Object objA = p011b0.a.a(e10);
                                arrayList.add(new p110k9.j(w9, objA));
                            }
                            int size3 = arrayList.size();
                            for (int i12 = 0; i12 < size3; i12++) {
                                p110k9.j jVar = (p110k9.j) arrayList.get(i12);
                                if (jVar.f19078s == null) {
                                    L5.c cVar = this.f10797l;
                                    ((W) jVar.f19077r).getClass();
                                    if (((u.E) cVar.f5532s).b(null)) {
                                        ArrayList arrayList3 = new ArrayList(p120l9.n.a0(arrayList, 10));
                                        int size4 = arrayList.size();
                                        int i13 = 0;
                                        while (i13 < size4) {
                                            Object obj2 = arrayList.get(i13);
                                            i13++;
                                            p110k9.j jVar2 = (p110k9.j) obj2;
                                            if (jVar2.f19078s == null) {
                                                L5.c cVar2 = this.f10797l;
                                                ((W) jVar2.f19077r).getClass();
                                                u.E e11 = (u.E) cVar2.f5532s;
                                                if (e11.i()) {
                                                    ((u.E) cVar2.f5533t).a();
                                                }
                                            }
                                            arrayList3.add(jVar2);
                                        }
                                        arrayList = arrayList3;
                                        break;
                                    }
                                }
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    int size5 = arrayList.size();
                    for (int i14 = 0; i14 < size5; i14++) {
                        if (((p110k9.j) arrayList.get(i14)).f19078s != null) {
                            int size6 = arrayList.size();
                            for (int i15 = 0; i15 < size6; i15++) {
                                if (((p110k9.j) arrayList.get(i15)).f19078s == null) {
                                    ArrayList arrayList4 = new ArrayList(arrayList.size());
                                    int size7 = arrayList.size();
                                    for (int i16 = 0; i16 < size7; i16++) {
                                        p110k9.j jVar3 = (p110k9.j) arrayList.get(i16);
                                        if (jVar3.f19078s == null) {
                                        }
                                    }
                                    synchronized (this.f10789b) {
                                        p120l9.m.d0(this.j, arrayList4);
                                    }
                                    ArrayList arrayList5 = new ArrayList(arrayList.size());
                                    int size8 = arrayList.size();
                                    for (int i17 = 0; i17 < size8; i17++) {
                                        Object obj3 = arrayList.get(i17);
                                        if (((p110k9.j) obj3).f19078s != null) {
                                            arrayList5.add(obj3);
                                        }
                                    }
                                    arrayList = arrayList5;
                                    break;
                                }
                            }
                            break;
                        }
                    }
                    c0704u.p(arrayList);
                    p093j0.i.q(iVarJ);
                    w(eVarD);
                } catch (Throwable th2) {
                    p093j0.i.q(iVarJ);
                    throw th2;
                }
            } catch (Throwable th3) {
                w(eVarD);
                throw th3;
            }
        }
        return p120l9.m.C0(map.keySet());
    }

    public final void G(Throwable th, C0704u c0704u) throws Throwable {
        if (!((Boolean) f10787y.get()).booleanValue() || (th instanceof C0688j)) {
            synchronized (this.f10789b) {
                X4.c cVar = this.f10803r;
                if (cVar != null) {
                    throw ((Throwable) cVar.f9953r);
                }
                this.f10803r = new X4.c(th);
            }
            throw th;
        }
        synchronized (this.f10789b) {
            try {
                Log.e("ComposeInternal", "Error was captured in composition while live edit was enabled.", th);
                this.f10795i.clear();
                this.f10794h.g();
                this.g = new u.F();
                this.j.clear();
                this.f10796k.a();
                this.f10798m.a();
                this.f10803r = new X4.c(th);
                if (c0704u != null) {
                    H(c0704u);
                }
                y();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void H(C0704u c0704u) {
        ArrayList arrayList = this.f10800o;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.f10800o = arrayList;
        }
        if (!arrayList.contains(c0704u)) {
            arrayList.add(c0704u);
        }
        if (this.f10792e.remove(c0704u)) {
            this.f10793f = null;
        }
    }

    public final void I() {
        InterfaceC0388f interfaceC0388fY;
        synchronized (this.f10789b) {
            if (this.f10804s) {
                this.f10804s = false;
                interfaceC0388fY = y();
            } else {
                interfaceC0388fY = null;
            }
        }
        if (interfaceC0388fY != null) {
            ((C0389g) interfaceC0388fY).resumeWith(p110k9.y.f19095a);
        }
    }

    @Override // Z.r
    public final void a(C0704u c0704u, p074h0.d dVar) throws Throwable {
        p093j0.e eVarD;
        boolean z10 = c0704u.f10819J.f10710E;
        try {
            A.M0 m10 = new A.M0(28, c0704u);
            X.L l10 = new X.L(6, c0704u, null);
            p093j0.i iVarK = p093j0.n.k();
            p093j0.e eVar = iVarK instanceof p093j0.e ? (p093j0.e) iVarK : null;
            if (eVar == null || (eVarD = eVar.D(m10, l10)) == null) {
                throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
            }
            try {
                p093j0.i iVarJ = eVarD.j();
                try {
                    c0704u.i(dVar);
                    p093j0.i.q(iVarJ);
                    w(eVarD);
                    if (!z10) {
                        p093j0.n.k().m();
                    }
                    synchronized (this.f10789b) {
                        if (((p0) this.f10805t.getValue()).compareTo(p0.f10759s) > 0 && !B().contains(c0704u)) {
                            this.f10792e.add(c0704u);
                            this.f10793f = null;
                        }
                    }
                    try {
                        D(c0704u);
                        try {
                            c0704u.d();
                            c0704u.f();
                            if (z10) {
                                return;
                            }
                            p093j0.n.k().m();
                        } catch (Throwable th) {
                            G(th, null);
                        }
                    } catch (Throwable th2) {
                        G(th2, c0704u);
                    }
                } catch (Throwable th3) {
                    p093j0.i.q(iVarJ);
                    throw th3;
                }
            } catch (Throwable th4) {
                w(eVarD);
                throw th4;
            }
        } catch (Throwable th5) {
            G(th5, c0704u);
        }
    }

    @Override // Z.r
    public final boolean c() {
        return ((Boolean) f10787y.get()).booleanValue();
    }

    @Override // Z.r
    public final boolean d() {
        return false;
    }

    @Override // Z.r
    public final boolean e() {
        return false;
    }

    @Override // Z.r
    public final int g() {
        return 1000;
    }

    @Override // Z.r
    public final p150o9.h h() {
        return this.f10807v;
    }

    @Override // Z.r
    public final void i(C0704u c0704u) {
        InterfaceC0388f interfaceC0388fY;
        synchronized (this.f10789b) {
            if (this.f10794h.h(c0704u)) {
                interfaceC0388fY = null;
            } else {
                this.f10794h.b(c0704u);
                interfaceC0388fY = y();
            }
        }
        if (interfaceC0388fY != null) {
            ((C0389g) interfaceC0388fY).resumeWith(p110k9.y.f19095a);
        }
    }

    @Override // Z.r
    public final V j(W w9) {
        V v10;
        synchronized (this.f10789b) {
            v10 = (V) this.f10798m.j(w9);
        }
        return v10;
    }

    @Override // Z.r
    public final void m(C0704u c0704u) {
        synchronized (this.f10789b) {
            try {
                LinkedHashSet linkedHashSet = this.f10801p;
                if (linkedHashSet == null) {
                    linkedHashSet = new LinkedHashSet();
                    this.f10801p = linkedHashSet;
                }
                linkedHashSet.add(c0704u);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // Z.r
    public final void p(C0704u c0704u) {
        synchronized (this.f10789b) {
            if (this.f10792e.remove(c0704u)) {
                this.f10793f = null;
            }
            this.f10794h.k(c0704u);
            this.f10795i.remove(c0704u);
        }
    }

    public final void x() {
        synchronized (this.f10789b) {
            if (((p0) this.f10805t.getValue()).compareTo(p0.f10762v) >= 0) {
                N9.k0 k0Var = this.f10805t;
                p0 p0Var = p0.f10759s;
                k0Var.getClass();
                k0Var.n(null, p0Var);
            }
        }
        this.f10806u.e(null);
    }

    public final InterfaceC0388f y() {
        N9.k0 k0Var = this.f10805t;
        int iCompareTo = ((p0) k0Var.getValue()).compareTo(p0.f10759s);
        ArrayList arrayList = this.j;
        ArrayList arrayList2 = this.f10795i;
        p011b0.e eVar = this.f10794h;
        if (iCompareTo <= 0) {
            this.f10792e.clear();
            this.f10793f = p120l9.r.f19440r;
            this.g = new u.F();
            eVar.g();
            arrayList2.clear();
            arrayList.clear();
            this.f10800o = null;
            C0389g c0389g = this.f10802q;
            if (c0389g != null) {
                c0389g.h(null);
            }
            this.f10802q = null;
            this.f10803r = null;
            return null;
        }
        X4.c cVar = this.f10803r;
        p0 p0Var = p0.f10763w;
        p0 p0Var2 = p0.f10760t;
        if (cVar == null) {
            if (this.f10790c == null) {
                this.g = new u.F();
                eVar.g();
                if (z()) {
                    p0Var2 = p0.f10761u;
                }
            } else {
                p0Var2 = (eVar.f13127t == 0 && !this.g.h() && arrayList2.isEmpty() && arrayList.isEmpty() && !z()) ? p0.f10762v : p0Var;
            }
        }
        k0Var.getClass();
        k0Var.n(null, p0Var2);
        if (p0Var2 != p0Var) {
            return null;
        }
        C0389g c0389g2 = this.f10802q;
        this.f10802q = null;
        return c0389g2;
    }

    public final boolean z() {
        return (this.f10804s || this.f10788a.f10662w.get() == 0) ? false : true;
    }

    @Override // Z.r
    public final void k(Set set) {
    }
}
