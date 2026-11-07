package E2;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import java.util.ArrayList;

/* JADX INFO: renamed from: E2.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0138o extends AbstractC0129j0 {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static TimeInterpolator f1737s;
    public boolean g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList f1738h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ArrayList f1739i;
    public final ArrayList j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ArrayList f1740k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ArrayList f1741l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ArrayList f1742m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ArrayList f1743n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ArrayList f1744o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ArrayList f1745p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ArrayList f1746q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ArrayList f1747r;

    public C0138o() {
        this.f1688a = null;
        this.f1689b = new ArrayList();
        this.f1690c = 120L;
        this.f1691d = 120L;
        this.f1692e = 250L;
        this.f1693f = 250L;
        this.g = true;
        this.f1738h = new ArrayList();
        this.f1739i = new ArrayList();
        this.j = new ArrayList();
        this.f1740k = new ArrayList();
        this.f1741l = new ArrayList();
        this.f1742m = new ArrayList();
        this.f1743n = new ArrayList();
        this.f1744o = new ArrayList();
        this.f1745p = new ArrayList();
        this.f1746q = new ArrayList();
        this.f1747r = new ArrayList();
    }

    public static void h(ArrayList arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((F0) arrayList.get(size)).f1486a.animate().cancel();
        }
    }

    @Override // E2.AbstractC0129j0
    public final boolean a(F0 f3, F0 f7, C0127i0 c0127i0, C0127i0 c0127i1) {
        int i10;
        int i11;
        int i12 = c0127i0.f1681a;
        int i13 = c0127i0.f1682b;
        if (f7.p()) {
            int i14 = c0127i0.f1681a;
            i11 = c0127i0.f1682b;
            i10 = i14;
        } else {
            i10 = c0127i1.f1681a;
            i11 = c0127i1.f1682b;
        }
        if (f3 == f7) {
            return g(f3, i12, i13, i10, i11);
        }
        View view = f3.f1486a;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        float alpha = view.getAlpha();
        l(f3);
        view.setTranslationX(translationX);
        view.setTranslationY(translationY);
        view.setAlpha(alpha);
        View view2 = f7.f1486a;
        l(f7);
        view2.setTranslationX(-((int) ((i10 - i12) - translationX)));
        view2.setTranslationY(-((int) ((i11 - i13) - translationY)));
        view2.setAlpha(0.0f);
        C0134m c0134m = new C0134m();
        c0134m.f1709a = f3;
        c0134m.f1710b = f7;
        c0134m.f1711c = i12;
        c0134m.f1712d = i13;
        c0134m.f1713e = i10;
        c0134m.f1714f = i11;
        this.f1740k.add(c0134m);
        return true;
    }

    @Override // E2.AbstractC0129j0
    public final void d(F0 f3) {
        View view = f3.f1486a;
        view.animate().cancel();
        ArrayList arrayList = this.j;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (((C0136n) arrayList.get(size)).f1728a == f3) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                c(f3);
                arrayList.remove(size);
            }
        }
        j(this.f1740k, f3);
        if (this.f1738h.remove(f3)) {
            view.setAlpha(1.0f);
            c(f3);
        }
        if (this.f1739i.remove(f3)) {
            view.setAlpha(1.0f);
            c(f3);
        }
        ArrayList arrayList2 = this.f1743n;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList3 = (ArrayList) arrayList2.get(size2);
            j(arrayList3, f3);
            if (arrayList3.isEmpty()) {
                arrayList2.remove(size2);
            }
        }
        ArrayList arrayList4 = this.f1742m;
        for (int size3 = arrayList4.size() - 1; size3 >= 0; size3--) {
            ArrayList arrayList5 = (ArrayList) arrayList4.get(size3);
            for (int size4 = arrayList5.size() - 1; size4 >= 0; size4--) {
                if (((C0136n) arrayList5.get(size4)).f1728a == f3) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    c(f3);
                    arrayList5.remove(size4);
                    if (!arrayList5.isEmpty()) {
                        break;
                    }
                    arrayList4.remove(size3);
                    break;
                }
            }
        }
        ArrayList arrayList6 = this.f1741l;
        for (int size5 = arrayList6.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList7 = (ArrayList) arrayList6.get(size5);
            if (arrayList7.remove(f3)) {
                view.setAlpha(1.0f);
                c(f3);
                if (arrayList7.isEmpty()) {
                    arrayList6.remove(size5);
                }
            }
        }
        this.f1746q.remove(f3);
        this.f1744o.remove(f3);
        this.f1747r.remove(f3);
        this.f1745p.remove(f3);
        i();
    }

    @Override // E2.AbstractC0129j0
    public final void e() {
        ArrayList arrayList = this.j;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            C0136n c0136n = (C0136n) arrayList.get(size);
            View view = c0136n.f1728a.f1486a;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            c(c0136n.f1728a);
            arrayList.remove(size);
        }
        ArrayList arrayList2 = this.f1738h;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            c((F0) arrayList2.get(size2));
            arrayList2.remove(size2);
        }
        ArrayList arrayList3 = this.f1739i;
        int size3 = arrayList3.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            F0 f3 = (F0) arrayList3.get(size3);
            f3.f1486a.setAlpha(1.0f);
            c(f3);
            arrayList3.remove(size3);
        }
        ArrayList arrayList4 = this.f1740k;
        for (int size4 = arrayList4.size() - 1; size4 >= 0; size4--) {
            C0134m c0134m = (C0134m) arrayList4.get(size4);
            F0 f7 = c0134m.f1709a;
            if (f7 != null) {
                k(c0134m, f7);
            }
            F0 f10 = c0134m.f1710b;
            if (f10 != null) {
                k(c0134m, f10);
            }
        }
        arrayList4.clear();
        if (f()) {
            ArrayList arrayList5 = this.f1742m;
            for (int size5 = arrayList5.size() - 1; size5 >= 0; size5--) {
                ArrayList arrayList6 = (ArrayList) arrayList5.get(size5);
                for (int size6 = arrayList6.size() - 1; size6 >= 0; size6--) {
                    C0136n c0136n2 = (C0136n) arrayList6.get(size6);
                    View view2 = c0136n2.f1728a.f1486a;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    c(c0136n2.f1728a);
                    arrayList6.remove(size6);
                    if (arrayList6.isEmpty()) {
                        arrayList5.remove(arrayList6);
                    }
                }
            }
            ArrayList arrayList7 = this.f1741l;
            for (int size7 = arrayList7.size() - 1; size7 >= 0; size7--) {
                ArrayList arrayList8 = (ArrayList) arrayList7.get(size7);
                for (int size8 = arrayList8.size() - 1; size8 >= 0; size8--) {
                    F0 f11 = (F0) arrayList8.get(size8);
                    f11.f1486a.setAlpha(1.0f);
                    c(f11);
                    arrayList8.remove(size8);
                    if (arrayList8.isEmpty()) {
                        arrayList7.remove(arrayList8);
                    }
                }
            }
            ArrayList arrayList9 = this.f1743n;
            for (int size9 = arrayList9.size() - 1; size9 >= 0; size9--) {
                ArrayList arrayList10 = (ArrayList) arrayList9.get(size9);
                for (int size10 = arrayList10.size() - 1; size10 >= 0; size10--) {
                    C0134m c0134m2 = (C0134m) arrayList10.get(size10);
                    F0 f12 = c0134m2.f1709a;
                    if (f12 != null) {
                        k(c0134m2, f12);
                    }
                    F0 f13 = c0134m2.f1710b;
                    if (f13 != null) {
                        k(c0134m2, f13);
                    }
                    if (arrayList10.isEmpty()) {
                        arrayList9.remove(arrayList10);
                    }
                }
            }
            h(this.f1746q);
            h(this.f1745p);
            h(this.f1744o);
            h(this.f1747r);
            ArrayList arrayList11 = this.f1689b;
            if (arrayList11.size() > 0) {
                throw android.support.v4.media.session.p.u(0, arrayList11);
            }
            arrayList11.clear();
        }
    }

    @Override // E2.AbstractC0129j0
    public final boolean f() {
        return (this.f1739i.isEmpty() && this.f1740k.isEmpty() && this.j.isEmpty() && this.f1738h.isEmpty() && this.f1745p.isEmpty() && this.f1746q.isEmpty() && this.f1744o.isEmpty() && this.f1747r.isEmpty() && this.f1742m.isEmpty() && this.f1741l.isEmpty() && this.f1743n.isEmpty()) ? false : true;
    }

    public final boolean g(F0 f3, int i10, int i11, int i12, int i13) {
        View view = f3.f1486a;
        int translationX = i10 + ((int) view.getTranslationX());
        int translationY = i11 + ((int) f3.f1486a.getTranslationY());
        l(f3);
        int i14 = i12 - translationX;
        int i15 = i13 - translationY;
        if (i14 == 0 && i15 == 0) {
            c(f3);
            return false;
        }
        if (i14 != 0) {
            view.setTranslationX(-i14);
        }
        if (i15 != 0) {
            view.setTranslationY(-i15);
        }
        C0136n c0136n = new C0136n();
        c0136n.f1728a = f3;
        c0136n.f1729b = translationX;
        c0136n.f1730c = translationY;
        c0136n.f1731d = i12;
        c0136n.f1732e = i13;
        this.j.add(c0136n);
        return true;
    }

    public final void i() {
        if (f()) {
            return;
        }
        ArrayList arrayList = this.f1689b;
        if (arrayList.size() > 0) {
            throw android.support.v4.media.session.p.u(0, arrayList);
        }
        arrayList.clear();
    }

    public final void j(ArrayList arrayList, F0 f3) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C0134m c0134m = (C0134m) arrayList.get(size);
            if (k(c0134m, f3) && c0134m.f1709a == null && c0134m.f1710b == null) {
                arrayList.remove(c0134m);
            }
        }
    }

    public final boolean k(C0134m c0134m, F0 f3) {
        if (c0134m.f1710b == f3) {
            c0134m.f1710b = null;
        } else {
            if (c0134m.f1709a != f3) {
                return false;
            }
            c0134m.f1709a = null;
        }
        View view = f3.f1486a;
        View view2 = f3.f1486a;
        view.setAlpha(1.0f);
        view2.setTranslationX(0.0f);
        view2.setTranslationY(0.0f);
        c(f3);
        return true;
    }

    public final void l(F0 f3) {
        if (f1737s == null) {
            f1737s = new ValueAnimator().getInterpolator();
        }
        f3.f1486a.animate().setInterpolator(f1737s);
        d(f3);
    }
}
