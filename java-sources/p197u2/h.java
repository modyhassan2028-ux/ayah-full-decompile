package p197u2;

import E2.C0112b;
import G9.f;
import N9.AbstractC0419l;
import N9.U;
import N9.Y;
import N9.b0;
import N9.k0;
import O2.a;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.media.session.p;
import android.util.Log;
import androidx.lifecycle.EnumC0767p;
import androidx.lifecycle.InterfaceC0771u;
import com.google.android.gms.internal.measurement.AbstractC0813f2;
import i7.C;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import p013b2.n;
import p120l9.k;
import p120l9.m;
import p120l9.r;
import p173r2.A;
import p173r2.D;
import p173r2.G;
import p173r2.H;
import p173r2.InterfaceC1286f;
import p173r2.i;
import p173r2.l;
import p173r2.o;
import p173r2.v;
import p173r2.x;
import p241y9.c;
import p251z9.j;
import p251z9.t;
import p251z9.y;
import u.P;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final A f22849a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f22850b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public x f22851c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Bundle f22852d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Bundle[] f22853e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final k f22854f = new k();
    public final k0 g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final k0 f22855h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final U f22856i;
    public final LinkedHashMap j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final LinkedHashMap f22857k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final LinkedHashMap f22858l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final LinkedHashMap f22859m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public InterfaceC0771u f22860n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public o f22861o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ArrayList f22862p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public EnumC0767p f22863q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final a f22864r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final H f22865s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final LinkedHashMap f22866t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public c f22867u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public f f22868v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final LinkedHashMap f22869w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f22870x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final ArrayList f22871y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final Y f22872z;

    public h(A a9, l lVar) {
        this.f22849a = a9;
        this.f22850b = lVar;
        r rVar = r.f19440r;
        this.g = AbstractC0419l.c(rVar);
        k0 k0VarC = AbstractC0419l.c(rVar);
        this.f22855h = k0VarC;
        this.f22856i = new U(k0VarC);
        this.j = new LinkedHashMap();
        this.f22857k = new LinkedHashMap();
        this.f22858l = new LinkedHashMap();
        this.f22859m = new LinkedHashMap();
        this.f22862p = new ArrayList();
        this.f22863q = EnumC0767p.f12662s;
        this.f22864r = new a(2, this);
        this.f22865s = new H();
        this.f22866t = new LinkedHashMap();
        this.f22869w = new LinkedHashMap();
        this.f22871y = new ArrayList();
        this.f22872z = AbstractC0419l.b(0, 2, M9.a.f5831s);
    }

    public static v e(int i10, v vVar, v vVar2, boolean z10) {
        if (vVar.f21493s.f1641a == i10 && (vVar2 == null || (vVar.equals(vVar2) && j.a(vVar.f21494t, vVar2.f21494t)))) {
            return vVar;
        }
        x xVar = vVar instanceof x ? (x) vVar : null;
        if (xVar == null) {
            xVar = vVar.f21494t;
            j.b(xVar);
        }
        return xVar.f21502w.t(i10, xVar, vVar2, z10);
    }

    public static /* synthetic */ void o(h hVar, p173r2.j jVar) {
        hVar.n(jVar, false, new k());
    }

    public final void a(v vVar, Bundle bundle, p173r2.j jVar, List list) {
        Object objPrevious;
        Object objPrevious2;
        n nVar = this.f22849a.f21413c;
        v vVar2 = jVar.f21442s;
        boolean z10 = vVar2 instanceof InterfaceC1286f;
        k kVar = this.f22854f;
        if (!z10) {
            while (!kVar.isEmpty() && (((p173r2.j) kVar.last()).f21442s instanceof InterfaceC1286f) && m(((p173r2.j) kVar.last()).f21442s.f21493s.f1641a, true, false)) {
            }
        }
        k<p173r2.j> kVar2 = new k();
        Object obj = null;
        if (vVar instanceof x) {
            v vVar3 = vVar2;
            do {
                j.b(vVar3);
                vVar3 = vVar3.f21494t;
                if (vVar3 != null) {
                    ListIterator listIterator = list.listIterator(list.size());
                    do {
                        if (!listIterator.hasPrevious()) {
                            objPrevious2 = null;
                            break;
                        }
                        objPrevious2 = listIterator.previous();
                    } while (!j.a(((p173r2.j) objPrevious2).f21442s, vVar3));
                    p173r2.j jVarF = (p173r2.j) objPrevious2;
                    if (jVarF == null) {
                        jVarF = C.f(nVar, vVar3, bundle, i(), this.f22861o);
                    }
                    kVar2.addFirst(jVarF);
                    if (!kVar.isEmpty() && ((p173r2.j) kVar.last()).f21442s == vVar3) {
                        o(this, (p173r2.j) kVar.last());
                    }
                }
                if (vVar3 == null) {
                    break;
                }
            } while (vVar3 != vVar);
        }
        v vVar4 = kVar2.isEmpty() ? vVar2 : ((p173r2.j) kVar2.first()).f21442s;
        while (vVar4 != null && d(vVar4.f21493s.f1641a, vVar4) != vVar4) {
            vVar4 = vVar4.f21494t;
            if (vVar4 != null) {
                Bundle bundle2 = (bundle == null || !bundle.isEmpty()) ? bundle : null;
                ListIterator listIterator2 = list.listIterator(list.size());
                do {
                    if (!listIterator2.hasPrevious()) {
                        objPrevious = null;
                        break;
                    }
                    objPrevious = listIterator2.previous();
                } while (!j.a(((p173r2.j) objPrevious).f21442s, vVar4));
                p173r2.j jVarF2 = (p173r2.j) objPrevious;
                if (jVarF2 == null) {
                    jVarF2 = C.f(nVar, vVar4, vVar4.b(bundle2), i(), this.f22861o);
                }
                kVar2.addFirst(jVarF2);
            }
        }
        if (!kVar2.isEmpty()) {
            vVar2 = ((p173r2.j) kVar2.first()).f21442s;
        }
        while (!kVar.isEmpty() && (((p173r2.j) kVar.last()).f21442s instanceof x)) {
            v vVar5 = ((p173r2.j) kVar.last()).f21442s;
            j.c(vVar5, "null cannot be cast to non-null type androidx.navigation.NavGraph");
            if (((P) ((x) vVar5).f21502w.f1675d).d(vVar2.f21493s.f1641a) != null) {
                break;
            } else {
                o(this, (p173r2.j) kVar.last());
            }
        }
        p173r2.j jVar2 = (p173r2.j) kVar.f();
        if (jVar2 == null) {
            jVar2 = (p173r2.j) kVar2.f();
        }
        if (!j.a(jVar2 != null ? jVar2.f21442s : null, this.f22851c)) {
            ListIterator listIterator3 = list.listIterator(list.size());
            while (listIterator3.hasPrevious()) {
                Object objPrevious3 = listIterator3.previous();
                v vVar6 = ((p173r2.j) objPrevious3).f21442s;
                x xVar = this.f22851c;
                j.b(xVar);
                if (j.a(vVar6, xVar)) {
                    obj = objPrevious3;
                    break;
                }
            }
            p173r2.j jVarF3 = (p173r2.j) obj;
            if (jVarF3 == null) {
                x xVar2 = this.f22851c;
                j.b(xVar2);
                x xVar3 = this.f22851c;
                j.b(xVar3);
                jVarF3 = C.f(nVar, xVar2, xVar3.b(bundle), i(), this.f22861o);
            }
            kVar2.addFirst(jVarF3);
        }
        for (p173r2.j jVar3 : kVar2) {
            Object obj2 = this.f22866t.get(this.f22865s.b(jVar3.f21442s.f21492r));
            if (obj2 == null) {
                throw new IllegalStateException(p.B(new StringBuilder("NavigatorBackStack for "), vVar.f21492r, " should already be created").toString());
            }
            ((p173r2.n) obj2).a(jVar3);
        }
        kVar.addAll(kVar2);
        kVar.addLast(jVar);
        ArrayList arrayListR0 = m.r0(kVar2, jVar);
        int size = arrayListR0.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj3 = arrayListR0.get(i10);
            i10++;
            p173r2.j jVar4 = (p173r2.j) obj3;
            x xVar4 = jVar4.f21442s.f21494t;
            if (xVar4 != null) {
                k(jVar4, f(xVar4.f21493s.f1641a));
            }
        }
    }

    public final boolean b() {
        k kVar;
        while (true) {
            kVar = this.f22854f;
            if (kVar.isEmpty() || !(((p173r2.j) kVar.last()).f21442s instanceof x)) {
                break;
            }
            o(this, (p173r2.j) kVar.last());
        }
        p173r2.j jVar = (p173r2.j) kVar.h();
        ArrayList arrayList = this.f22871y;
        if (jVar != null) {
            arrayList.add(jVar);
        }
        this.f22870x++;
        s();
        int i10 = this.f22870x - 1;
        this.f22870x = i10;
        if (i10 == 0) {
            ArrayList arrayListD0 = m.D0(arrayList);
            arrayList.clear();
            int size = arrayListD0.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayListD0.get(i11);
                i11++;
                p173r2.j jVar2 = (p173r2.j) obj;
                Iterator it = m.C0(this.f22862p).iterator();
                if (it.hasNext()) {
                    if (it.next() != null) {
                        throw new ClassCastException();
                    }
                    v vVar = jVar2.f21442s;
                    jVar2.f21448y.a();
                    throw null;
                }
                this.f22872z.g(jVar2);
            }
            ArrayList arrayListD1 = m.D0(kVar);
            k0 k0Var = this.g;
            k0Var.getClass();
            k0Var.n(null, arrayListD1);
            ArrayList arrayListP = p();
            k0 k0Var2 = this.f22855h;
            k0Var2.getClass();
            k0Var2.n(null, arrayListP);
        }
        return jVar != null;
    }

    public final boolean c(ArrayList arrayList, v vVar, boolean z10, boolean z11) {
        h hVar;
        boolean z12;
        p251z9.r rVar = new p251z9.r();
        k kVar = new k();
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                hVar = this;
                z12 = z11;
                break;
            }
            int i11 = i10 + 1;
            G g = (G) arrayList.get(i10);
            p251z9.r rVar2 = new p251z9.r();
            p173r2.j jVar = (p173r2.j) this.f22854f.last();
            hVar = this;
            z12 = z11;
            f fVar = new f(rVar2, rVar, hVar, z12, kVar);
            j.e(g, "navigator");
            j.e(jVar, "popUpTo");
            hVar.f22868v = fVar;
            g.e(jVar, z12);
            hVar.f22868v = null;
            if (!rVar2.f24882r) {
                break;
            }
            z11 = z12;
            i10 = i11;
        }
        if (z12) {
            LinkedHashMap linkedHashMap = hVar.f22858l;
            if (!z10) {
                final int i12 = 0;
                f fVar2 = new f(new G9.p(G9.k.b0(vVar, new b(1)), new c(this) { // from class: u2.g

                    /* JADX INFO: renamed from: s, reason: collision with root package name */
                    public final /* synthetic */ h f22848s;

                    {
                        this.f22848s = this;
                    }

                    @Override // p241y9.c
                    public final Object e(Object obj) {
                        boolean zContainsKey;
                        v vVar2 = (v) obj;
                        switch (i12) {
                            case 0:
                                j.e(vVar2, "destination");
                                zContainsKey = this.f22848s.f22858l.containsKey(Integer.valueOf(vVar2.f21493s.f1641a));
                                break;
                            default:
                                j.e(vVar2, "destination");
                                zContainsKey = this.f22848s.f22858l.containsKey(Integer.valueOf(vVar2.f21493s.f1641a));
                                break;
                        }
                        return Boolean.valueOf(!zContainsKey);
                    }
                }, 0));
                while (fVar2.hasNext()) {
                    Integer numValueOf = Integer.valueOf(((v) fVar2.next()).f21493s.f1641a);
                    p173r2.k kVar2 = (p173r2.k) kVar.f();
                    linkedHashMap.put(numValueOf, kVar2 != null ? (String) kVar2.f21449a.f6165b : null);
                }
            }
            if (!kVar.isEmpty()) {
                b0 b0Var = ((p173r2.k) kVar.first()).f21449a;
                final int i13 = 1;
                f fVar3 = new f(new G9.p(G9.k.b0(d(b0Var.f6164a, null), new b(2)), new c(this) { // from class: u2.g

                    /* JADX INFO: renamed from: s, reason: collision with root package name */
                    public final /* synthetic */ h f22848s;

                    {
                        this.f22848s = this;
                    }

                    @Override // p241y9.c
                    public final Object e(Object obj) {
                        boolean zContainsKey;
                        v vVar2 = (v) obj;
                        switch (i13) {
                            case 0:
                                j.e(vVar2, "destination");
                                zContainsKey = this.f22848s.f22858l.containsKey(Integer.valueOf(vVar2.f21493s.f1641a));
                                break;
                            default:
                                j.e(vVar2, "destination");
                                zContainsKey = this.f22848s.f22858l.containsKey(Integer.valueOf(vVar2.f21493s.f1641a));
                                break;
                        }
                        return Boolean.valueOf(!zContainsKey);
                    }
                }, 0));
                while (fVar3.hasNext()) {
                    linkedHashMap.put(Integer.valueOf(((v) fVar3.next()).f21493s.f1641a), (String) b0Var.f6165b);
                }
                if (linkedHashMap.values().contains((String) b0Var.f6165b)) {
                    hVar.f22859m.put((String) b0Var.f6165b, kVar);
                }
            }
        }
        hVar.f22850b.invoke();
        return rVar.f24882r;
    }

    public final v d(int i10, v vVar) {
        v vVar2;
        x xVar = this.f22851c;
        if (xVar == null) {
            return null;
        }
        if (xVar.f21493s.f1641a == i10) {
            if (vVar == null) {
                return xVar;
            }
            if (j.a(xVar, vVar) && vVar.f21494t == null) {
                return this.f22851c;
            }
        }
        p173r2.j jVar = (p173r2.j) this.f22854f.h();
        if (jVar == null || (vVar2 = jVar.f21442s) == null) {
            vVar2 = this.f22851c;
            j.b(vVar2);
        }
        return e(i10, vVar2, vVar, false);
    }

    public final p173r2.j f(int i10) {
        Object objPrevious;
        k kVar = this.f22854f;
        ListIterator<E> listIterator = kVar.listIterator(kVar.size());
        do {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            }
            objPrevious = listIterator.previous();
        } while (((p173r2.j) objPrevious).f21442s.f21493s.f1641a != i10);
        p173r2.j jVar = (p173r2.j) objPrevious;
        if (jVar != null) {
            return jVar;
        }
        StringBuilder sbW = p123m2.c.w(i10, "No destination with ID ", " is on the NavController's back stack. The current destination is ");
        sbW.append(g());
        throw new IllegalArgumentException(sbW.toString().toString());
    }

    public final v g() {
        p173r2.j jVar = (p173r2.j) this.f22854f.h();
        if (jVar != null) {
            return jVar.f21442s;
        }
        return null;
    }

    public final x h() {
        x xVar = this.f22851c;
        if (xVar == null) {
            throw new IllegalStateException("You must call setGraph() before calling getGraph()");
        }
        j.c(xVar, "null cannot be cast to non-null type androidx.navigation.NavGraph");
        return xVar;
    }

    public final EnumC0767p i() {
        return this.f22860n == null ? EnumC0767p.f12663t : this.f22863q;
    }

    public final x j() {
        v vVar;
        p173r2.j jVar = (p173r2.j) this.f22854f.h();
        if (jVar == null || (vVar = jVar.f21442s) == null) {
            vVar = this.f22851c;
            j.b(vVar);
        }
        x xVar = vVar instanceof x ? (x) vVar : null;
        if (xVar != null) {
            return xVar;
        }
        x xVar2 = vVar.f21494t;
        j.b(xVar2);
        return xVar2;
    }

    public final void k(p173r2.j jVar, p173r2.j jVar2) {
        this.j.put(jVar, jVar2);
        LinkedHashMap linkedHashMap = this.f22857k;
        if (linkedHashMap.get(jVar2) == null) {
            linkedHashMap.put(jVar2, new a());
        }
        Object obj = linkedHashMap.get(jVar2);
        j.b(obj);
        ((a) obj).f22823a.incrementAndGet();
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01cd A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:112:0x0191 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:113:0x01bb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:115:0x01b9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:119:0x0200 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:120:0x01f9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:121:? A[LOOP:7: B:71:0x01e3->B:121:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:48:0x0110  */
    /* JADX WARN: Code duplicated, block: B:51:0x011d A[LOOP:4: B:49:0x0115->B:51:0x011d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:55:0x017a  */
    /* JADX WARN: Code duplicated, block: B:57:0x0186  */
    /* JADX WARN: Code duplicated, block: B:62:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:65:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:73:0x01e9 A[Catch: all -> 0x01fe, TryCatch #0 {all -> 0x01fe, blocks: (B:70:0x01cd, B:71:0x01e3, B:73:0x01e9, B:75:0x01f9, B:79:0x0201), top: B:101:0x01cd }] */
    /* JADX WARN: Code duplicated, block: B:85:0x0213  */
    public final void l(v vVar, Bundle bundle, p173r2.C c10) {
        boolean z10;
        int iNextIndex;
        v vVar2;
        k<p173r2.j> kVar;
        G gB;
        v vVar3;
        p173r2.n nVarB;
        ListIterator listIterator;
        int iNextIndex2;
        x xVar;
        int i10;
        j.e(vVar, "node");
        Iterator it = this.f22866t.values().iterator();
        while (it.hasNext()) {
            ((p173r2.n) it.next()).f21458d = true;
        }
        p251z9.r rVar = new p251z9.r();
        boolean zM = (c10 == null || (i10 = c10.f21419c) == -1) ? false : m(i10, c10.f21420d, c10.f21421e);
        Bundle bundleB = vVar.b(bundle);
        if (c10 != null && c10.f21418b && this.f22858l.containsKey(Integer.valueOf(vVar.f21493s.f1641a))) {
            rVar.f24882r = q(vVar.f21493s.f1641a, bundleB, c10);
            z10 = false;
        } else {
            if (c10 == null || !c10.f21417a) {
                z10 = false;
            } else {
                p173r2.j jVar = (p173r2.j) this.f22854f.h();
                k kVar2 = this.f22854f;
                ListIterator listIterator2 = kVar2.listIterator(kVar2.b());
                while (true) {
                    if (listIterator2.hasPrevious()) {
                        if (((p173r2.j) listIterator2.previous()).f21442s == vVar) {
                            iNextIndex = listIterator2.nextIndex();
                            break;
                        }
                    } else {
                        iNextIndex = -1;
                        break;
                    }
                }
                if (iNextIndex == -1) {
                    z10 = false;
                } else if (vVar instanceof x) {
                    int i11 = x.f21501x;
                    List listE0 = G9.k.e0(new G9.p(G9.k.b0((x) vVar, new G9.m(24)), new b(3), 1));
                    if (this.f22854f.f19438t - iNextIndex == listE0.size()) {
                        k kVar3 = this.f22854f;
                        List listSubList = kVar3.subList(iNextIndex, kVar3.f19438t);
                        ArrayList arrayList = new ArrayList(p120l9.n.a0(listSubList, 10));
                        Iterator it2 = listSubList.iterator();
                        while (it2.hasNext()) {
                            arrayList.add(Integer.valueOf(((p173r2.j) it2.next()).f21442s.f21493s.f1641a));
                        }
                        if (arrayList.equals(listE0)) {
                            kVar = new k();
                            while (AbstractC0813f2.E(this.f22854f) >= iNextIndex) {
                                p173r2.j jVar2 = (p173r2.j) m.u0(this.f22854f);
                                r(jVar2);
                                p173r2.j jVar3 = new p173r2.j(jVar2.f21441r, jVar2.f21442s, jVar2.f21442s.b(bundle), jVar2.f21444u, jVar2.f21445v, jVar2.f21446w, jVar2.f21447x);
                                d dVar = jVar3.f21448y;
                                EnumC0767p enumC0767p = jVar2.f21444u;
                                dVar.getClass();
                                j.e(enumC0767p, "<set-?>");
                                dVar.f22829d = enumC0767p;
                                d dVar2 = jVar3.f21448y;
                                EnumC0767p enumC0767p2 = jVar2.f21448y.f22834k;
                                dVar2.getClass();
                                j.e(enumC0767p2, "maxState");
                                dVar2.f22834k = enumC0767p2;
                                dVar2.b();
                                kVar.addFirst(jVar3);
                            }
                            for (p173r2.j jVar4 : kVar) {
                                xVar = jVar4.f21442s.f21494t;
                                if (xVar != null) {
                                    k(jVar4, f(xVar.f21493s.f1641a));
                                }
                                this.f22854f.addLast(jVar4);
                            }
                            for (p173r2.j jVar5 : kVar) {
                                gB = this.f22865s.b(jVar5.f21442s.f21492r);
                                vVar3 = jVar5.f21442s;
                                if (vVar3 == null) {
                                    vVar3 = null;
                                }
                                if (vVar3 == null) {
                                    new D().f21424b = true;
                                    gB.c(vVar3);
                                    nVarB = gB.b();
                                    synchronized (nVarB.f21455a) {
                                        try {
                                            ArrayList arrayListD0 = m.D0((Collection) nVarB.f21459e.f6130r.getValue());
                                            listIterator = arrayListD0.listIterator(arrayListD0.size());
                                            while (true) {
                                                if (listIterator.hasPrevious()) {
                                                    if (j.a(((p173r2.j) listIterator.previous()).f21446w, jVar5.f21446w)) {
                                                        iNextIndex2 = listIterator.nextIndex();
                                                        break;
                                                    }
                                                } else {
                                                    iNextIndex2 = -1;
                                                    break;
                                                }
                                            }
                                            arrayListD0.set(iNextIndex2, jVar5);
                                            k0 k0Var = nVarB.f21456b;
                                            k0Var.getClass();
                                            k0Var.n(null, arrayListD0);
                                        } catch (Throwable th) {
                                            throw th;
                                        }
                                    }
                                }
                            }
                            z10 = true;
                        }
                    }
                    z10 = false;
                } else if (jVar == null || (vVar2 = jVar.f21442s) == null || vVar.f21493s.f1641a != vVar2.f21493s.f1641a) {
                    z10 = false;
                } else {
                    kVar = new k();
                    while (AbstractC0813f2.E(this.f22854f) >= iNextIndex) {
                        p173r2.j jVar6 = (p173r2.j) m.u0(this.f22854f);
                        r(jVar6);
                        p173r2.j jVar7 = new p173r2.j(jVar6.f21441r, jVar6.f21442s, jVar6.f21442s.b(bundle), jVar6.f21444u, jVar6.f21445v, jVar6.f21446w, jVar6.f21447x);
                        d dVar3 = jVar7.f21448y;
                        EnumC0767p enumC0767p3 = jVar6.f21444u;
                        dVar3.getClass();
                        j.e(enumC0767p3, "<set-?>");
                        dVar3.f22829d = enumC0767p3;
                        d dVar4 = jVar7.f21448y;
                        EnumC0767p enumC0767p4 = jVar6.f21448y.f22834k;
                        dVar4.getClass();
                        j.e(enumC0767p4, "maxState");
                        dVar4.f22834k = enumC0767p4;
                        dVar4.b();
                        kVar.addFirst(jVar7);
                    }
                    while (r0.hasNext()) {
                        xVar = jVar4.f21442s.f21494t;
                        if (xVar != null) {
                            k(jVar4, f(xVar.f21493s.f1641a));
                        }
                        this.f22854f.addLast(jVar4);
                    }
                    while (r0.hasNext()) {
                        gB = this.f22865s.b(jVar5.f21442s.f21492r);
                        vVar3 = jVar5.f21442s;
                        if (vVar3 == null) {
                            vVar3 = null;
                        }
                        if (vVar3 == null) {
                            new D().f21424b = true;
                            gB.c(vVar3);
                            nVarB = gB.b();
                            synchronized (nVarB.f21455a) {
                                ArrayList arrayListD1 = m.D0((Collection) nVarB.f21459e.f6130r.getValue());
                                listIterator = arrayListD1.listIterator(arrayListD1.size());
                                while (true) {
                                    if (listIterator.hasPrevious()) {
                                        if (j.a(((p173r2.j) listIterator.previous()).f21446w, jVar5.f21446w)) {
                                            iNextIndex2 = listIterator.nextIndex();
                                            break;
                                        }
                                    } else {
                                        iNextIndex2 = -1;
                                        break;
                                    }
                                }
                                arrayListD1.set(iNextIndex2, jVar5);
                                k0 k0Var2 = nVarB.f21456b;
                                k0Var2.getClass();
                                k0Var2.n(null, arrayListD1);
                            }
                        }
                    }
                    z10 = true;
                }
            }
            if (!z10) {
                p173r2.j jVarF = C.f(this.f22849a.f21413c, vVar, bundleB, i(), this.f22861o);
                G gB2 = this.f22865s.b(vVar.f21492r);
                List listK = AbstractC0813f2.K(jVarF);
                this.f22867u = new H8.h(rVar, this, vVar, bundleB, 3);
                gB2.d(listK, c10);
                this.f22867u = null;
            }
        }
        this.f22850b.invoke();
        Iterator it3 = this.f22866t.values().iterator();
        while (it3.hasNext()) {
            ((p173r2.n) it3.next()).f21458d = false;
        }
        if (zM || rVar.f24882r || z10) {
            b();
        } else {
            s();
        }
    }

    public final boolean m(int i10, boolean z10, boolean z11) {
        v vVar;
        C0112b c0112b;
        k kVar = this.f22854f;
        if (kVar.isEmpty()) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = m.v0(kVar).iterator();
        do {
            if (!it.hasNext()) {
                vVar = null;
                break;
            }
            vVar = ((p173r2.j) it.next()).f21442s;
            String str = vVar.f21492r;
            c0112b = vVar.f21493s;
            G gB = this.f22865s.b(str);
            if (z10 || c0112b.f1641a != i10) {
                arrayList.add(gB);
            }
        } while (c0112b.f1641a != i10);
        if (vVar != null) {
            return c(arrayList, vVar, z10, z11);
        }
        int i11 = v.f21491v;
        String str2 = "Ignoring popBackStack to destination " + i.a(this.f22849a.f21413c, i10) + " as it was not found on the current back stack";
        j.e(str2, "message");
        Log.i("NavController", str2);
        return false;
    }

    public final void n(p173r2.j jVar, boolean z10, k kVar) {
        o oVar;
        U u8;
        Set set;
        j.e(jVar, "popUpTo");
        k kVar2 = this.f22854f;
        p173r2.j jVar2 = (p173r2.j) kVar2.last();
        if (!j.a(jVar2, jVar)) {
            throw new IllegalStateException(("Attempted to pop " + jVar.f21442s + ", which is not the top of the back stack (" + jVar2.f21442s + ')').toString());
        }
        m.u0(kVar2);
        p173r2.n nVar = (p173r2.n) this.f22866t.get(this.f22865s.b(jVar2.f21442s.f21492r));
        boolean z11 = true;
        if ((nVar == null || (u8 = nVar.f21460f) == null || (set = (Set) u8.f6130r.getValue()) == null || !set.contains(jVar2)) && !this.f22857k.containsKey(jVar2)) {
            z11 = false;
        }
        EnumC0767p enumC0767p = jVar2.f21448y.j.f12672c;
        EnumC0767p enumC0767p2 = EnumC0767p.f12663t;
        if (enumC0767p.compareTo(enumC0767p2) >= 0) {
            if (z10) {
                jVar2.c(enumC0767p2);
                kVar.addFirst(new p173r2.k(jVar2));
            }
            if (z11) {
                jVar2.c(enumC0767p2);
            } else {
                jVar2.c(EnumC0767p.f12661r);
                r(jVar2);
            }
        }
        if (z10 || z11 || (oVar = this.f22861o) == null) {
            return;
        }
        String str = jVar2.f21446w;
        j.e(str, "backStackEntryId");
        androidx.lifecycle.U u10 = (androidx.lifecycle.U) oVar.f21462b.remove(str);
        if (u10 != null) {
            u10.a();
        }
    }

    public final ArrayList p() {
        EnumC0767p enumC0767p;
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f22866t.values().iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            enumC0767p = EnumC0767p.f12664u;
            if (!zHasNext) {
                break;
            }
            Iterable iterable = (Iterable) ((p173r2.n) it.next()).f21460f.f6130r.getValue();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : iterable) {
                p173r2.j jVar = (p173r2.j) obj;
                if (!arrayList.contains(jVar) && jVar.f21448y.f22834k.compareTo(enumC0767p) < 0) {
                    arrayList2.add(obj);
                }
            }
            m.d0(arrayList, arrayList2);
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : this.f22854f) {
            p173r2.j jVar2 = (p173r2.j) obj2;
            if (!arrayList.contains(jVar2) && jVar2.f21448y.f22834k.compareTo(enumC0767p) >= 0) {
                arrayList3.add(obj2);
            }
        }
        m.d0(arrayList, arrayList3);
        ArrayList arrayList4 = new ArrayList();
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj3 = arrayList.get(i10);
            i10++;
            if (!(((p173r2.j) obj3).f21442s instanceof x)) {
                arrayList4.add(obj3);
            }
        }
        return arrayList4;
    }

    public final boolean q(int i10, final Bundle bundle, p173r2.C c10) {
        v vVarH;
        p173r2.j jVar;
        v vVar;
        Bundle bundle2;
        Integer numValueOf = Integer.valueOf(i10);
        LinkedHashMap linkedHashMap = this.f22858l;
        int i11 = 0;
        if (!linkedHashMap.containsKey(numValueOf)) {
            return false;
        }
        String str = (String) linkedHashMap.get(Integer.valueOf(i10));
        Collection collectionValues = linkedHashMap.values();
        j.e(collectionValues, "<this>");
        Iterator it = collectionValues.iterator();
        while (it.hasNext()) {
            if (j.a((String) it.next(), str)) {
                it.remove();
            }
        }
        k<p173r2.k> kVar = (k) y.a(this.f22859m).remove(str);
        n nVar = this.f22849a.f21413c;
        ArrayList arrayList = new ArrayList();
        p173r2.j jVar2 = (p173r2.j) this.f22854f.h();
        if (jVar2 == null || (vVarH = jVar2.f21442s) == null) {
            vVarH = h();
        }
        if (kVar != null) {
            for (p173r2.k kVar2 : kVar) {
                b0 b0Var = kVar2.f21449a;
                b0 b0Var2 = kVar2.f21449a;
                v vVarE = e(b0Var.f6164a, vVarH, null, true);
                if (vVarE == null) {
                    int i12 = v.f21491v;
                    throw new IllegalStateException(("Restore State failed: destination " + i.a(nVar, b0Var2.f6164a) + " cannot be found from the current destination " + vVarH).toString());
                }
                EnumC0767p enumC0767pI = i();
                o oVar = this.f22861o;
                j.e(nVar, "context");
                j.e(enumC0767pI, "hostLifecycleState");
                Bundle bundle3 = (Bundle) b0Var2.f6166c;
                if (bundle3 != null) {
                    Context context = nVar.f13172a;
                    bundle3.setClassLoader(context != null ? context.getClassLoader() : null);
                    bundle2 = bundle3;
                } else {
                    bundle2 = null;
                }
                String str2 = (String) b0Var2.f6165b;
                Bundle bundle4 = (Bundle) b0Var2.f6167d;
                j.e(str2, "id");
                arrayList.add(new p173r2.j(nVar, vVarE, bundle2, enumC0767pI, oVar, str2, bundle4));
                vVarH = vVarE;
            }
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int size = arrayList.size();
        int i13 = 0;
        while (i13 < size) {
            Object obj = arrayList.get(i13);
            i13++;
            if (!(((p173r2.j) obj).f21442s instanceof x)) {
                arrayList3.add(obj);
            }
        }
        int size2 = arrayList3.size();
        int i14 = 0;
        while (i14 < size2) {
            Object obj2 = arrayList3.get(i14);
            i14++;
            p173r2.j jVar3 = (p173r2.j) obj2;
            List list = (List) m.n0(arrayList2);
            if (j.a((list == null || (jVar = (p173r2.j) m.m0(list)) == null || (vVar = jVar.f21442s) == null) ? null : vVar.f21492r, jVar3.f21442s.f21492r)) {
                list.add(jVar3);
            } else {
                arrayList2.add(AbstractC0813f2.M(jVar3));
            }
        }
        final p251z9.r rVar = new p251z9.r();
        int size3 = arrayList2.size();
        while (i11 < size3) {
            Object obj3 = arrayList2.get(i11);
            i11++;
            List list2 = (List) obj3;
            G gB = this.f22865s.b(((p173r2.j) m.f0(list2)).f21442s.f21492r);
            final t tVar = new t();
            final ArrayList arrayList4 = arrayList;
            this.f22867u = new c() { // from class: u2.e
                @Override // p241y9.c
                public final Object e(Object obj4) {
                    List listSubList;
                    p173r2.j jVar4 = (p173r2.j) obj4;
                    j.e(jVar4, "entry");
                    rVar.f24882r = true;
                    ArrayList arrayList5 = arrayList4;
                    int iIndexOf = arrayList5.indexOf(jVar4);
                    if (iIndexOf != -1) {
                        t tVar2 = tVar;
                        int i15 = iIndexOf + 1;
                        listSubList = arrayList5.subList(tVar2.f24884r, i15);
                        tVar2.f24884r = i15;
                    } else {
                        listSubList = r.f19440r;
                    }
                    this.a(jVar4.f21442s, bundle, jVar4, listSubList);
                    return p110k9.y.f19095a;
                }
            };
            gB.d(list2, c10);
            this.f22867u = null;
            arrayList = arrayList4;
        }
        return rVar.f24882r;
    }

    public final void r(p173r2.j jVar) {
        j.e(jVar, "child");
        p173r2.j jVar2 = (p173r2.j) this.j.remove(jVar);
        if (jVar2 == null) {
            return;
        }
        LinkedHashMap linkedHashMap = this.f22857k;
        a aVar = (a) linkedHashMap.get(jVar2);
        Integer numValueOf = aVar != null ? Integer.valueOf(aVar.f22823a.decrementAndGet()) : null;
        if (numValueOf != null && numValueOf.intValue() == 0) {
            p173r2.n nVar = (p173r2.n) this.f22866t.get(this.f22865s.b(jVar2.f21442s.f21492r));
            if (nVar != null) {
                nVar.c(jVar2);
            }
            linkedHashMap.remove(jVar2);
        }
    }

    public final void s() {
        a aVar;
        U u8;
        Set set;
        ArrayList arrayListD0 = m.D0(this.f22854f);
        if (arrayListD0.isEmpty()) {
            return;
        }
        int i10 = 0;
        ArrayList arrayListM = AbstractC0813f2.M(((p173r2.j) m.m0(arrayListD0)).f21442s);
        ArrayList arrayList = new ArrayList();
        if (m.m0(arrayListM) instanceof InterfaceC1286f) {
            Iterator it = m.v0(arrayListD0).iterator();
            while (it.hasNext()) {
                v vVar = ((p173r2.j) it.next()).f21442s;
                arrayList.add(vVar);
                if (!(vVar instanceof InterfaceC1286f) && !(vVar instanceof x)) {
                    break;
                }
            }
        }
        HashMap map = new HashMap();
        for (p173r2.j jVar : m.v0(arrayListD0)) {
            EnumC0767p enumC0767p = jVar.f21448y.f22834k;
            v vVar2 = jVar.f21442s;
            v vVar3 = (v) m.g0(arrayListM);
            EnumC0767p enumC0767p2 = EnumC0767p.f12665v;
            EnumC0767p enumC0767p3 = EnumC0767p.f12664u;
            if (vVar3 != null && vVar3.f21493s.f1641a == vVar2.f21493s.f1641a) {
                if (enumC0767p != enumC0767p2) {
                    p173r2.n nVar = (p173r2.n) this.f22866t.get(this.f22865s.b(jVar.f21442s.f21492r));
                    if (j.a((nVar == null || (u8 = nVar.f21460f) == null || (set = (Set) u8.f6130r.getValue()) == null) ? null : Boolean.valueOf(set.contains(jVar)), Boolean.TRUE) || ((aVar = (a) this.f22857k.get(jVar)) != null && aVar.f22823a.get() == 0)) {
                        map.put(jVar, enumC0767p3);
                    } else {
                        map.put(jVar, enumC0767p2);
                    }
                }
                v vVar4 = (v) m.g0(arrayList);
                if (vVar4 != null && vVar4.f21493s.f1641a == vVar2.f21493s.f1641a) {
                    m.t0(arrayList);
                }
                m.t0(arrayListM);
                x xVar = vVar2.f21494t;
                if (xVar != null) {
                    arrayListM.add(xVar);
                }
            } else if (arrayList.isEmpty() || vVar2.f21493s.f1641a != ((v) m.f0(arrayList)).f21493s.f1641a) {
                jVar.c(EnumC0767p.f12663t);
            } else {
                v vVar5 = (v) m.t0(arrayList);
                if (enumC0767p == enumC0767p2) {
                    jVar.c(enumC0767p3);
                } else if (enumC0767p != enumC0767p3) {
                    map.put(jVar, enumC0767p3);
                }
                x xVar2 = vVar5.f21494t;
                if (xVar2 != null && !arrayList.contains(xVar2)) {
                    arrayList.add(xVar2);
                }
            }
        }
        int size = arrayListD0.size();
        while (i10 < size) {
            Object obj = arrayListD0.get(i10);
            i10++;
            p173r2.j jVar2 = (p173r2.j) obj;
            EnumC0767p enumC0767p4 = (EnumC0767p) map.get(jVar2);
            if (enumC0767p4 != null) {
                jVar2.c(enumC0767p4);
            } else {
                jVar2.f21448y.b();
            }
        }
    }
}
