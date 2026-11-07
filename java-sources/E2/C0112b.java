package E2;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import p151p.AbstractC1249j0;
import p151p.C1273w;

/* JADX INFO: renamed from: E2.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0112b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f1641a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f1642b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f1643c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f1644d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f1645e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f1646f;

    public C0112b(p052ea.a aVar, p040da.b bVar) {
        this.f1643c = new L5.c(22, aVar.f15865d, bVar, false);
        this.f1641a = aVar.f15862a;
        this.f1645e = aVar.f15863b;
        this.f1644d = bVar;
        this.f1642b = aVar.f15864c;
        this.f1646f = new CopyOnWriteArrayList();
    }

    public void a() {
        View view = (View) this.f1643c;
        Drawable background = view.getBackground();
        if (background != null) {
            if (((ka.h) this.f1644d) != null) {
                if (((ka.h) this.f1646f) == null) {
                    this.f1646f = new ka.h();
                }
                ka.h hVar = (ka.h) this.f1646f;
                hVar.f19152c = null;
                hVar.f19151b = false;
                hVar.f19153d = null;
                hVar.f19150a = false;
                WeakHashMap weakHashMap = I1.S.f3689a;
                ColorStateList colorStateListC = I1.I.c(view);
                if (colorStateListC != null) {
                    hVar.f19151b = true;
                    hVar.f19152c = colorStateListC;
                }
                PorterDuff.Mode modeD = I1.I.d(view);
                if (modeD != null) {
                    hVar.f19150a = true;
                    hVar.f19153d = modeD;
                }
                if (hVar.f19151b || hVar.f19150a) {
                    C1273w.e(background, hVar, view.getDrawableState());
                    return;
                }
            }
            ka.h hVar2 = (ka.h) this.f1645e;
            if (hVar2 != null) {
                C1273w.e(background, hVar2, view.getDrawableState());
                return;
            }
            ka.h hVar3 = (ka.h) this.f1644d;
            if (hVar3 != null) {
                C1273w.e(background, hVar3, view.getDrawableState());
            }
        }
    }

    public boolean b(int i10) {
        ArrayList arrayList = (ArrayList) this.f1644d;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            C0110a c0110a = (C0110a) arrayList.get(i11);
            int i12 = c0110a.f1636a;
            if (i12 != 8) {
                if (i12 == 1) {
                    int i13 = c0110a.f1637b;
                    int i14 = c0110a.f1639d + i13;
                    while (i13 < i14) {
                        if (h(i13, i11 + 1) == i10) {
                            return true;
                        }
                        i13++;
                    }
                } else {
                    continue;
                }
            } else {
                if (h(c0110a.f1639d, i11 + 1) == i10) {
                    return true;
                }
            }
        }
        return false;
    }

    public void c(String str) {
        p031ca.b bVar;
        Iterator it = ((CopyOnWriteArrayList) this.f1646f).iterator();
        do {
            if (!it.hasNext()) {
                bVar = null;
                break;
            }
            bVar = (p031ca.b) it.next();
        } while (!bVar.f13599a.f15866r.equals(str));
        if (bVar == null || bVar.f13600b.isDone() || bVar.f13600b.isCancelled() || !bVar.f13600b.cancel(true)) {
            return;
        }
        ((CopyOnWriteArrayList) this.f1646f).remove(bVar);
    }

    public void d() {
        ArrayList arrayList = (ArrayList) this.f1644d;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((C0113b0) this.f1645e).a((C0110a) arrayList.get(i10));
        }
        s(arrayList);
        this.f1641a = 0;
    }

    public void e() {
        C0113b0 c0113b0 = (C0113b0) this.f1645e;
        d();
        ArrayList arrayList = (ArrayList) this.f1642b;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            C0110a c0110a = (C0110a) arrayList.get(i10);
            int i11 = c0110a.f1636a;
            if (i11 == 1) {
                c0113b0.a(c0110a);
                c0113b0.d(c0110a.f1637b, c0110a.f1639d);
            } else if (i11 == 2) {
                c0113b0.a(c0110a);
                int i12 = c0110a.f1637b;
                int i13 = c0110a.f1639d;
                RecyclerView recyclerView = c0113b0.f1647r;
                recyclerView.W(i12, i13, true);
                recyclerView.f12858B0 = true;
                recyclerView.f12923y0.f1445c += i13;
            } else if (i11 == 4) {
                c0113b0.a(c0110a);
                c0113b0.c(c0110a.f1637b, c0110a.f1639d, c0110a.f1638c);
            } else if (i11 == 8) {
                c0113b0.a(c0110a);
                c0113b0.e(c0110a.f1637b, c0110a.f1639d);
            }
        }
        s(arrayList);
        this.f1641a = 0;
    }

    public void f(C0110a c0110a) {
        int i10;
        H1.c cVar = (H1.c) this.f1643c;
        int i11 = c0110a.f1636a;
        if (i11 == 1 || i11 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int iW = w(c0110a.f1637b, i11);
        int i12 = c0110a.f1637b;
        int i13 = c0110a.f1636a;
        if (i13 == 2) {
            i10 = 0;
        } else {
            if (i13 != 4) {
                throw new IllegalArgumentException("op should be remove or update." + c0110a);
            }
            i10 = 1;
        }
        int i14 = 1;
        for (int i15 = 1; i15 < c0110a.f1639d; i15++) {
            int iW2 = w((i10 * i15) + c0110a.f1637b, c0110a.f1636a);
            int i16 = c0110a.f1636a;
            if (i16 == 2 ? iW2 != iW : !(i16 == 4 && iW2 == iW + 1)) {
                C0110a c0110aN = n(c0110a.f1638c, i16, iW, i14);
                g(c0110aN, i12);
                c0110aN.f1638c = null;
                cVar.c(c0110aN);
                if (c0110a.f1636a == 4) {
                    i12 += i14;
                }
                i14 = 1;
                iW = iW2;
            } else {
                i14++;
            }
        }
        Object obj = c0110a.f1638c;
        c0110a.f1638c = null;
        cVar.c(c0110a);
        if (i14 > 0) {
            C0110a c0110aN2 = n(obj, c0110a.f1636a, iW, i14);
            g(c0110aN2, i12);
            c0110aN2.f1638c = null;
            cVar.c(c0110aN2);
        }
    }

    public void g(C0110a c0110a, int i10) {
        C0113b0 c0113b0 = (C0113b0) this.f1645e;
        c0113b0.a(c0110a);
        int i11 = c0110a.f1636a;
        if (i11 != 2) {
            if (i11 != 4) {
                throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
            }
            c0113b0.c(i10, c0110a.f1639d, c0110a.f1638c);
        } else {
            int i12 = c0110a.f1639d;
            RecyclerView recyclerView = c0113b0.f1647r;
            recyclerView.W(i10, i12, true);
            recyclerView.f12858B0 = true;
            recyclerView.f12923y0.f1445c += i12;
        }
    }

    public int h(int i10, int i11) {
        ArrayList arrayList = (ArrayList) this.f1644d;
        int size = arrayList.size();
        while (i11 < size) {
            C0110a c0110a = (C0110a) arrayList.get(i11);
            int i12 = c0110a.f1636a;
            if (i12 == 8) {
                int i13 = c0110a.f1637b;
                if (i13 == i10) {
                    i10 = c0110a.f1639d;
                } else {
                    if (i13 < i10) {
                        i10--;
                    }
                    if (c0110a.f1639d <= i10) {
                        i10++;
                    }
                }
            } else {
                int i14 = c0110a.f1637b;
                if (i14 > i10) {
                    continue;
                } else if (i12 == 2) {
                    int i15 = c0110a.f1639d;
                    if (i10 < i14 + i15) {
                        return -1;
                    }
                    i10 -= i15;
                } else if (i12 == 1) {
                    i10 += c0110a.f1639d;
                }
            }
            i11++;
        }
        return i10;
    }

    public ColorStateList i() {
        ka.h hVar = (ka.h) this.f1645e;
        if (hVar != null) {
            return (ColorStateList) hVar.f19152c;
        }
        return null;
    }

    public PorterDuff.Mode j() {
        ka.h hVar = (ka.h) this.f1645e;
        if (hVar != null) {
            return (PorterDuff.Mode) hVar.f19153d;
        }
        return null;
    }

    public boolean k() {
        return ((ArrayList) this.f1642b).size() > 0;
    }

    public void l(AttributeSet attributeSet, int i10) {
        ColorStateList colorStateListI;
        View view = (View) this.f1643c;
        Context context = view.getContext();
        int[] iArr = p073h.a.f16378C;
        p074h0.i iVarB = p074h0.i.B(context, attributeSet, iArr, i10);
        TypedArray typedArray = (TypedArray) iVarB.f16423t;
        View view2 = (View) this.f1643c;
        I1.S.n(view2, view2.getContext(), iArr, attributeSet, (TypedArray) iVarB.f16423t, i10);
        try {
            if (typedArray.hasValue(0)) {
                this.f1641a = typedArray.getResourceId(0, -1);
                C1273w c1273w = (C1273w) this.f1642b;
                Context context2 = view.getContext();
                int i11 = this.f1641a;
                synchronized (c1273w) {
                    colorStateListI = c1273w.f20798a.i(context2, i11);
                }
                if (colorStateListI != null) {
                    t(colorStateListI);
                }
            }
            if (typedArray.hasValue(1)) {
                I1.I.i(view, iVarB.q(1));
            }
            if (typedArray.hasValue(2)) {
                I1.I.j(view, AbstractC1249j0.c(typedArray.getInt(2, -1), null));
            }
            iVarB.C();
        } catch (Throwable th) {
            iVarB.C();
            throw th;
        }
    }

    public p173r2.u m(String str) {
        p173r2.t tVar;
        p251z9.j.e(str, "route");
        p110k9.o oVar = (p110k9.o) this.f1646f;
        if (oVar == null || (tVar = (p173r2.t) oVar.getValue()) == null) {
            return null;
        }
        int i10 = p173r2.v.f21491v;
        String strConcat = "android-app://androidx.navigation/".concat(str);
        p251z9.j.e(strConcat, "uriString");
        Uri uri = Uri.parse(strConcat);
        p251z9.j.d(uri, "parse(...)");
        Bundle bundleD = tVar.d(uri, (LinkedHashMap) this.f1644d);
        if (bundleD == null) {
            return null;
        }
        return new p173r2.u((p173r2.v) this.f1643c, bundleD, tVar.f21485l, tVar.b(uri), false);
    }

    public C0110a n(Object obj, int i10, int i11, int i12) {
        C0110a c0110a = (C0110a) ((H1.c) this.f1643c).a();
        if (c0110a != null) {
            c0110a.f1636a = i10;
            c0110a.f1637b = i11;
            c0110a.f1639d = i12;
            c0110a.f1638c = obj;
            return c0110a;
        }
        C0110a c0110a2 = new C0110a();
        c0110a2.f1636a = i10;
        c0110a2.f1637b = i11;
        c0110a2.f1639d = i12;
        c0110a2.f1638c = obj;
        return c0110a2;
    }

    public void o() {
        this.f1641a = -1;
        t(null);
        a();
    }

    public void p(int i10) {
        ColorStateList colorStateListI;
        this.f1641a = i10;
        C1273w c1273w = (C1273w) this.f1642b;
        if (c1273w != null) {
            Context context = ((View) this.f1643c).getContext();
            synchronized (c1273w) {
                colorStateListI = c1273w.f20798a.i(context, i10);
            }
        } else {
            colorStateListI = null;
        }
        t(colorStateListI);
        a();
    }

    public void q(C0110a c0110a) {
        C0113b0 c0113b0 = (C0113b0) this.f1645e;
        ((ArrayList) this.f1644d).add(c0110a);
        int i10 = c0110a.f1636a;
        if (i10 == 1) {
            c0113b0.d(c0110a.f1637b, c0110a.f1639d);
            return;
        }
        if (i10 == 2) {
            int i11 = c0110a.f1637b;
            int i12 = c0110a.f1639d;
            RecyclerView recyclerView = c0113b0.f1647r;
            recyclerView.W(i11, i12, false);
            recyclerView.f12858B0 = true;
            return;
        }
        if (i10 == 4) {
            c0113b0.c(c0110a.f1637b, c0110a.f1639d, c0110a.f1638c);
        } else if (i10 == 8) {
            c0113b0.e(c0110a.f1637b, c0110a.f1639d);
        } else {
            throw new IllegalArgumentException("Unknown update op type for " + c0110a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0192  */
    /* JADX WARN: Code duplicated, block: B:104:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:105:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:187:0x00b1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:188:0x0138 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:191:0x012b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:192:0x01a9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:201:0x0015 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:205:0x0015 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:29:0x007c  */
    /* JADX WARN: Code duplicated, block: B:30:0x0081  */
    /* JADX WARN: Code duplicated, block: B:32:0x0086  */
    /* JADX WARN: Code duplicated, block: B:36:0x009d  */
    /* JADX WARN: Code duplicated, block: B:37:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:39:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:76:0x013a  */
    /* JADX WARN: Code duplicated, block: B:77:0x013c  */
    /* JADX WARN: Code duplicated, block: B:79:0x0142  */
    /* JADX WARN: Code duplicated, block: B:82:0x014d  */
    /* JADX WARN: Code duplicated, block: B:85:0x0158  */
    /* JADX WARN: Code duplicated, block: B:88:0x0163  */
    /* JADX WARN: Code duplicated, block: B:89:0x0169  */
    /* JADX WARN: Code duplicated, block: B:90:0x016b  */
    /* JADX WARN: Code duplicated, block: B:92:0x0171  */
    /* JADX WARN: Code duplicated, block: B:95:0x017c  */
    /* JADX WARN: Code duplicated, block: B:98:0x0187  */
    public void r() {
        boolean z10;
        byte b5;
        C0110a c0110aN;
        int i10;
        int i11;
        int i12;
        C0110a c0110aN2;
        boolean z11;
        boolean z12;
        Object obj;
        C0110a c0110a;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        H1.c cVar = (H1.c) this.f1643c;
        C0113b0 c0113b0 = (C0113b0) this.f1645e;
        O8.c cVar2 = (O8.c) this.f1646f;
        ArrayList arrayList = (ArrayList) this.f1642b;
        cVar2.getClass();
        while (true) {
            int size = arrayList.size() - 1;
            boolean z13 = false;
            while (true) {
                if (size < 0) {
                    size = -1;
                    break;
                }
                if (((C0110a) arrayList.get(size)).f1636a == 8) {
                    if (z13) {
                        break;
                    }
                } else {
                    z13 = true;
                }
                size--;
            }
            if (size == -1) {
                break;
            }
            int i21 = size + 1;
            C0112b c0112b = (C0112b) cVar2.f6511r;
            H1.c cVar3 = (H1.c) c0112b.f1643c;
            C0110a c0110a2 = (C0110a) arrayList.get(size);
            C0110a c0110a3 = (C0110a) arrayList.get(i21);
            int i22 = c0110a3.f1636a;
            if (i22 == 1) {
                int i23 = c0110a2.f1639d;
                int i24 = c0110a3.f1637b;
                int i25 = i23 < i24 ? -1 : 0;
                int i26 = c0110a2.f1637b;
                if (i26 < i24) {
                    i25++;
                }
                if (i24 <= i26) {
                    c0110a2.f1637b = i26 + c0110a3.f1639d;
                }
                int i27 = c0110a3.f1637b;
                if (i27 <= i23) {
                    c0110a2.f1639d = i23 + c0110a3.f1639d;
                }
                c0110a3.f1637b = i27 + i25;
                arrayList.set(size, c0110a3);
                arrayList.set(i21, c0110a2);
            } else if (i22 == 2) {
                int i28 = c0110a2.f1637b;
                int i29 = c0110a2.f1639d;
                if (i28 < i29) {
                    if (c0110a3.f1637b == i28 && c0110a3.f1639d == i29 - i28) {
                        z12 = true;
                        z11 = false;
                    } else {
                        z11 = false;
                        z12 = false;
                    }
                } else if (c0110a3.f1637b == i29 + 1 && c0110a3.f1639d == i28 - i29) {
                    z11 = true;
                    z12 = true;
                } else {
                    z11 = true;
                    z12 = false;
                }
                int i30 = c0110a3.f1637b;
                if (i29 < i30) {
                    c0110a3.f1637b = i30 - 1;
                } else {
                    int i31 = c0110a3.f1639d;
                    if (i29 < i30 + i31) {
                        c0110a3.f1639d = i31 - 1;
                        c0110a2.f1636a = 2;
                        c0110a2.f1639d = 1;
                        if (c0110a3.f1639d == 0) {
                            arrayList.remove(i21);
                            c0110a3.f1638c = null;
                            cVar3.c(c0110a3);
                        }
                    }
                }
                int i32 = c0110a2.f1637b;
                int i33 = c0110a3.f1637b;
                if (i32 <= i33) {
                    c0110a3.f1637b = i33 + 1;
                } else {
                    int i34 = i33 + c0110a3.f1639d;
                    if (i32 < i34) {
                        obj = null;
                        C0110a c0110aN3 = c0112b.n(null, 2, i32 + 1, i34 - i32);
                        c0110a3.f1639d = c0110a2.f1637b - c0110a3.f1637b;
                        c0110a = c0110aN3;
                    }
                    if (z12) {
                        arrayList.set(size, c0110a3);
                        arrayList.remove(i21);
                        c0110a2.f1638c = obj;
                        cVar3.c(c0110a2);
                    } else {
                        if (z11) {
                            if (c0110a != null) {
                                i19 = c0110a2.f1637b;
                                if (i19 > c0110a.f1637b) {
                                    c0110a2.f1637b = i19 - c0110a.f1639d;
                                }
                                i20 = c0110a2.f1639d;
                                if (i20 > c0110a.f1637b) {
                                    c0110a2.f1639d = i20 - c0110a.f1639d;
                                }
                            }
                            i17 = c0110a2.f1637b;
                            if (i17 > c0110a3.f1637b) {
                                c0110a2.f1637b = i17 - c0110a3.f1639d;
                            }
                            i18 = c0110a2.f1639d;
                            if (i18 > c0110a3.f1637b) {
                                c0110a2.f1639d = i18 - c0110a3.f1639d;
                            }
                        } else {
                            if (c0110a != null) {
                                i15 = c0110a2.f1637b;
                                if (i15 >= c0110a.f1637b) {
                                    c0110a2.f1637b = i15 - c0110a.f1639d;
                                }
                                i16 = c0110a2.f1639d;
                                if (i16 >= c0110a.f1637b) {
                                    c0110a2.f1639d = i16 - c0110a.f1639d;
                                }
                            }
                            i13 = c0110a2.f1637b;
                            if (i13 >= c0110a3.f1637b) {
                                c0110a2.f1637b = i13 - c0110a3.f1639d;
                            }
                            i14 = c0110a2.f1639d;
                            if (i14 >= c0110a3.f1637b) {
                                c0110a2.f1639d = i14 - c0110a3.f1639d;
                            }
                        }
                        arrayList.set(size, c0110a3);
                        if (c0110a2.f1637b != c0110a2.f1639d) {
                            arrayList.set(i21, c0110a2);
                        } else {
                            arrayList.remove(i21);
                        }
                        if (c0110a != null) {
                            arrayList.add(size, c0110a);
                        }
                    }
                }
                obj = null;
                c0110a = null;
                if (z12) {
                    arrayList.set(size, c0110a3);
                    arrayList.remove(i21);
                    c0110a2.f1638c = obj;
                    cVar3.c(c0110a2);
                } else {
                    if (z11) {
                        if (c0110a != null) {
                            i19 = c0110a2.f1637b;
                            if (i19 > c0110a.f1637b) {
                                c0110a2.f1637b = i19 - c0110a.f1639d;
                            }
                            i20 = c0110a2.f1639d;
                            if (i20 > c0110a.f1637b) {
                                c0110a2.f1639d = i20 - c0110a.f1639d;
                            }
                        }
                        i17 = c0110a2.f1637b;
                        if (i17 > c0110a3.f1637b) {
                            c0110a2.f1637b = i17 - c0110a3.f1639d;
                        }
                        i18 = c0110a2.f1639d;
                        if (i18 > c0110a3.f1637b) {
                            c0110a2.f1639d = i18 - c0110a3.f1639d;
                        }
                    } else {
                        if (c0110a != null) {
                            i15 = c0110a2.f1637b;
                            if (i15 >= c0110a.f1637b) {
                                c0110a2.f1637b = i15 - c0110a.f1639d;
                            }
                            i16 = c0110a2.f1639d;
                            if (i16 >= c0110a.f1637b) {
                                c0110a2.f1639d = i16 - c0110a.f1639d;
                            }
                        }
                        i13 = c0110a2.f1637b;
                        if (i13 >= c0110a3.f1637b) {
                            c0110a2.f1637b = i13 - c0110a3.f1639d;
                        }
                        i14 = c0110a2.f1639d;
                        if (i14 >= c0110a3.f1637b) {
                            c0110a2.f1639d = i14 - c0110a3.f1639d;
                        }
                    }
                    arrayList.set(size, c0110a3);
                    if (c0110a2.f1637b != c0110a2.f1639d) {
                        arrayList.set(i21, c0110a2);
                    } else {
                        arrayList.remove(i21);
                    }
                    if (c0110a != null) {
                        arrayList.add(size, c0110a);
                    }
                }
            } else if (i22 == 4) {
                int i35 = c0110a2.f1639d;
                int i36 = c0110a3.f1637b;
                if (i35 < i36) {
                    c0110a3.f1637b = i36 - 1;
                } else {
                    int i37 = c0110a3.f1639d;
                    if (i35 < i36 + i37) {
                        c0110a3.f1639d = i37 - 1;
                        c0110aN = c0112b.n(c0110a3.f1638c, 4, c0110a2.f1637b, 1);
                    }
                    i10 = c0110a2.f1637b;
                    i11 = c0110a3.f1637b;
                    if (i10 <= i11) {
                        c0110a3.f1637b = i11 + 1;
                    } else {
                        i12 = i11 + c0110a3.f1639d;
                        if (i10 < i12) {
                            int i38 = i12 - i10;
                            c0110aN2 = c0112b.n(c0110a3.f1638c, 4, i10 + 1, i38);
                            c0110a3.f1639d -= i38;
                        }
                        arrayList.set(i21, c0110a2);
                        if (c0110a3.f1639d > 0) {
                            arrayList.set(size, c0110a3);
                        } else {
                            arrayList.remove(size);
                            c0110a3.f1638c = null;
                            cVar3.c(c0110a3);
                        }
                        if (c0110aN != null) {
                            arrayList.add(size, c0110aN);
                        }
                        if (c0110aN2 != null) {
                            arrayList.add(size, c0110aN2);
                        }
                    }
                    c0110aN2 = null;
                    arrayList.set(i21, c0110a2);
                    if (c0110a3.f1639d > 0) {
                        arrayList.set(size, c0110a3);
                    } else {
                        arrayList.remove(size);
                        c0110a3.f1638c = null;
                        cVar3.c(c0110a3);
                    }
                    if (c0110aN != null) {
                        arrayList.add(size, c0110aN);
                    }
                    if (c0110aN2 != null) {
                        arrayList.add(size, c0110aN2);
                    }
                }
                c0110aN = null;
                i10 = c0110a2.f1637b;
                i11 = c0110a3.f1637b;
                if (i10 <= i11) {
                    c0110a3.f1637b = i11 + 1;
                } else {
                    i12 = i11 + c0110a3.f1639d;
                    if (i10 < i12) {
                        int i39 = i12 - i10;
                        c0110aN2 = c0112b.n(c0110a3.f1638c, 4, i10 + 1, i39);
                        c0110a3.f1639d -= i39;
                    }
                    arrayList.set(i21, c0110a2);
                    if (c0110a3.f1639d > 0) {
                        arrayList.set(size, c0110a3);
                    } else {
                        arrayList.remove(size);
                        c0110a3.f1638c = null;
                        cVar3.c(c0110a3);
                    }
                    if (c0110aN != null) {
                        arrayList.add(size, c0110aN);
                    }
                    if (c0110aN2 != null) {
                        arrayList.add(size, c0110aN2);
                    }
                }
                c0110aN2 = null;
                arrayList.set(i21, c0110a2);
                if (c0110a3.f1639d > 0) {
                    arrayList.set(size, c0110a3);
                } else {
                    arrayList.remove(size);
                    c0110a3.f1638c = null;
                    cVar3.c(c0110a3);
                }
                if (c0110aN != null) {
                    arrayList.add(size, c0110aN);
                }
                if (c0110aN2 != null) {
                    arrayList.add(size, c0110aN2);
                }
            }
        }
        int size2 = arrayList.size();
        for (int i40 = 0; i40 < size2; i40++) {
            C0110a c0110aN4 = (C0110a) arrayList.get(i40);
            int i41 = c0110aN4.f1636a;
            if (i41 == 1) {
                q(c0110aN4);
            } else if (i41 == 2) {
                int i42 = c0110aN4.f1637b;
                int i43 = c0110aN4.f1639d + i42;
                int i44 = i42;
                int i45 = 0;
                byte b10 = -1;
                while (i44 < i43) {
                    if (c0113b0.b(i44) != null || b(i44)) {
                        if (b10 == 0) {
                            f(n(null, 2, i42, i45));
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        b5 = 1;
                    } else {
                        if (b10 == 1) {
                            q(n(null, 2, i42, i45));
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        b5 = 0;
                    }
                    if (z10) {
                        i44 -= i45;
                        i43 -= i45;
                        i45 = 1;
                    } else {
                        i45++;
                    }
                    i44++;
                    b10 = b5;
                }
                if (i45 != c0110aN4.f1639d) {
                    c0110aN4.f1638c = null;
                    cVar.c(c0110aN4);
                    c0110aN4 = n(null, 2, i42, i45);
                }
                if (b10 == 0) {
                    f(c0110aN4);
                } else {
                    q(c0110aN4);
                }
            } else if (i41 == 4) {
                int i46 = c0110aN4.f1637b;
                int i47 = c0110aN4.f1639d + i46;
                int i48 = i46;
                int i49 = 0;
                byte b11 = -1;
                while (i46 < i47) {
                    if (c0113b0.b(i46) != null || b(i46)) {
                        if (b11 == 0) {
                            f(n(c0110aN4.f1638c, 4, i48, i49));
                            i48 = i46;
                            i49 = 0;
                        }
                        b11 = 1;
                    } else {
                        if (b11 == 1) {
                            q(n(c0110aN4.f1638c, 4, i48, i49));
                            i48 = i46;
                            i49 = 0;
                        }
                        b11 = 0;
                    }
                    i49++;
                    i46++;
                }
                if (i49 != c0110aN4.f1639d) {
                    Object obj2 = c0110aN4.f1638c;
                    c0110aN4.f1638c = null;
                    cVar.c(c0110aN4);
                    c0110aN4 = n(obj2, 4, i48, i49);
                }
                if (b11 == 0) {
                    f(c0110aN4);
                } else {
                    q(c0110aN4);
                }
            } else if (i41 == 8) {
                q(c0110aN4);
            }
        }
        arrayList.clear();
    }

    public void s(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            C0110a c0110a = (C0110a) arrayList.get(i10);
            c0110a.f1638c = null;
            ((H1.c) this.f1643c).c(c0110a);
        }
        arrayList.clear();
    }

    public void t(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (((ka.h) this.f1644d) == null) {
                this.f1644d = new ka.h();
            }
            ka.h hVar = (ka.h) this.f1644d;
            hVar.f19152c = colorStateList;
            hVar.f19151b = true;
        } else {
            this.f1644d = null;
        }
        a();
    }

    public void u(ColorStateList colorStateList) {
        if (((ka.h) this.f1645e) == null) {
            this.f1645e = new ka.h();
        }
        ka.h hVar = (ka.h) this.f1645e;
        hVar.f19152c = colorStateList;
        hVar.f19151b = true;
        a();
    }

    public void v(PorterDuff.Mode mode) {
        if (((ka.h) this.f1645e) == null) {
            this.f1645e = new ka.h();
        }
        ka.h hVar = (ka.h) this.f1645e;
        hVar.f19153d = mode;
        hVar.f19150a = true;
        a();
    }

    public int w(int i10, int i11) {
        int i12;
        int i13;
        H1.c cVar = (H1.c) this.f1643c;
        ArrayList arrayList = (ArrayList) this.f1644d;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C0110a c0110a = (C0110a) arrayList.get(size);
            int i14 = c0110a.f1636a;
            if (i14 == 8) {
                int i15 = c0110a.f1637b;
                int i16 = c0110a.f1639d;
                if (i15 < i16) {
                    i13 = i15;
                    i12 = i16;
                } else {
                    i12 = i15;
                    i13 = i16;
                }
                if (i10 < i13 || i10 > i12) {
                    if (i10 < i15) {
                        if (i11 == 1) {
                            c0110a.f1637b = i15 + 1;
                            c0110a.f1639d = i16 + 1;
                        } else if (i11 == 2) {
                            c0110a.f1637b = i15 - 1;
                            c0110a.f1639d = i16 - 1;
                        }
                    }
                } else if (i13 == i15) {
                    if (i11 == 1) {
                        c0110a.f1639d = i16 + 1;
                    } else if (i11 == 2) {
                        c0110a.f1639d = i16 - 1;
                    }
                    i10++;
                } else {
                    if (i11 == 1) {
                        c0110a.f1637b = i15 + 1;
                    } else if (i11 == 2) {
                        c0110a.f1637b = i15 - 1;
                    }
                    i10--;
                }
            } else {
                int i17 = c0110a.f1637b;
                if (i17 <= i10) {
                    if (i14 == 1) {
                        i10 -= c0110a.f1639d;
                    } else if (i14 == 2) {
                        i10 += c0110a.f1639d;
                    }
                } else if (i11 == 1) {
                    c0110a.f1637b = i17 + 1;
                } else if (i11 == 2) {
                    c0110a.f1637b = i17 - 1;
                }
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            C0110a c0110a2 = (C0110a) arrayList.get(size2);
            if (c0110a2.f1636a == 8) {
                int i18 = c0110a2.f1639d;
                if (i18 == c0110a2.f1637b || i18 < 0) {
                    arrayList.remove(size2);
                    c0110a2.f1638c = null;
                    cVar.c(c0110a2);
                }
            } else if (c0110a2.f1639d <= 0) {
                arrayList.remove(size2);
                c0110a2.f1638c = null;
                cVar.c(c0110a2);
            }
        }
        return i10;
    }

    public C0112b(p173r2.v vVar) {
        this.f1643c = vVar;
        this.f1642b = new ArrayList();
        this.f1644d = new LinkedHashMap();
    }

    public C0112b(View view) {
        this.f1641a = -1;
        this.f1643c = view;
        this.f1642b = C1273w.a();
    }

    public C0112b(C0113b0 c0113b0) {
        this.f1643c = new H1.c(30);
        this.f1642b = new ArrayList();
        this.f1644d = new ArrayList();
        this.f1641a = 0;
        this.f1645e = c0113b0;
        this.f1646f = new O8.c(this);
    }
}
