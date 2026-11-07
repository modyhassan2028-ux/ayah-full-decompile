package E2;

import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.ExecutorService;

/* JADX INFO: renamed from: E2.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0114c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static ExecutorService f1649b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f1648a = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C0140p f1650c = new C0140p(0);

    public static r e(AbstractC0114c abstractC0114c) {
        int i10;
        C0146u c0146u;
        int i11;
        C0145t c0145t;
        C0142q c0142q;
        int i12;
        int i13;
        C0146u c0146u2;
        C0146u c0146u3;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int iL = abstractC0114c.l();
        int iK = abstractC0114c.k();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        C0145t c0145t2 = new C0145t();
        int i21 = 0;
        c0145t2.f1766a = 0;
        c0145t2.f1767b = iL;
        c0145t2.f1768c = 0;
        c0145t2.f1769d = iK;
        arrayList2.add(c0145t2);
        int i22 = iL + iK;
        int i23 = 1;
        int i24 = (((i22 + 1) / 2) * 2) + 1;
        int[] iArr = new int[i24];
        int i25 = i24 / 2;
        int[] iArr2 = new int[i24];
        ArrayList arrayList3 = new ArrayList();
        while (!arrayList2.isEmpty()) {
            C0145t c0145t3 = (C0145t) arrayList2.remove(arrayList2.size() - i23);
            if (c0145t3.b() >= i23 && c0145t3.a() >= i23) {
                int iA = ((c0145t3.a() + c0145t3.b()) + i23) / 2;
                int i26 = i23 + i25;
                iArr[i26] = c0145t3.f1766a;
                iArr2[i26] = c0145t3.f1767b;
                int i27 = i21;
                while (true) {
                    if (i27 >= iA) {
                        i10 = i25;
                        c0146u = null;
                        break;
                    }
                    int i28 = Math.abs(c0145t3.b() - c0145t3.a()) % 2 == i23 ? i23 : i21;
                    int iB = c0145t3.b() - c0145t3.a();
                    int i29 = -i27;
                    int i30 = i29;
                    while (true) {
                        if (i30 > i27) {
                            i12 = i21;
                            i10 = i25;
                            i13 = iA;
                            c0146u2 = null;
                            break;
                        }
                        if (i30 == i29 || (i30 != i27 && iArr[i30 + 1 + i25] > iArr[(i30 - 1) + i25])) {
                            i18 = iArr[i30 + 1 + i25];
                            i19 = i18;
                        } else {
                            i18 = iArr[(i30 - 1) + i25];
                            i19 = i18 + 1;
                        }
                        i10 = i25;
                        int i31 = ((i19 - c0145t3.f1766a) + c0145t3.f1768c) - i30;
                        int i32 = (i27 == 0 || i19 != i18) ? i31 : i31 - 1;
                        int i33 = i30;
                        int i34 = i31;
                        int i35 = i19;
                        i13 = iA;
                        while (i35 < c0145t3.f1767b && i34 < c0145t3.f1769d && abstractC0114c.c(i35, i34)) {
                            i35++;
                            i34++;
                        }
                        iArr[i33 + i10] = i35;
                        if (i28 != 0) {
                            int i36 = iB - i33;
                            i20 = i28;
                            if (i36 >= i29 + 1 && i36 <= i27 - 1 && iArr2[i36 + i10] <= i35) {
                                c0146u2 = new C0146u();
                                c0146u2.f1773a = i18;
                                c0146u2.f1774b = i32;
                                c0146u2.f1775c = i35;
                                c0146u2.f1776d = i34;
                                i12 = 0;
                                c0146u2.f1777e = false;
                                break;
                            }
                        } else {
                            i20 = i28;
                        }
                        i30 = i33 + 2;
                        i21 = 0;
                        i25 = i10;
                        iA = i13;
                        i28 = i20;
                    }
                    if (c0146u2 != null) {
                        c0146u = c0146u2;
                        break;
                    }
                    int i37 = (c0145t3.b() - c0145t3.a()) % 2 == 0 ? 1 : i12;
                    int iB2 = c0145t3.b() - c0145t3.a();
                    int i38 = i29;
                    while (true) {
                        if (i38 > i27) {
                            c0146u3 = null;
                            break;
                        }
                        if (i38 == i29 || (i38 != i27 && iArr2[i38 + 1 + i10] < iArr2[(i38 - 1) + i10])) {
                            i14 = iArr2[i38 + 1 + i10];
                            i15 = i14;
                        } else {
                            i14 = iArr2[(i38 - 1) + i10];
                            i15 = i14 - 1;
                        }
                        int i39 = c0145t3.f1769d - ((c0145t3.f1767b - i15) - i38);
                        int i40 = (i27 == 0 || i15 != i14) ? i39 : i39 + 1;
                        int i41 = i37;
                        while (true) {
                            if (i15 > c0145t3.f1766a && i39 > c0145t3.f1768c) {
                                i16 = iB2;
                                if (!abstractC0114c.c(i15 - 1, i39 - 1)) {
                                    break;
                                }
                                i15--;
                                i39--;
                                iB2 = i16;
                            } else {
                                i16 = iB2;
                                break;
                            }
                        }
                        iArr2[i38 + i10] = i15;
                        if (i41 != 0 && (i17 = i16 - i38) >= i29 && i17 <= i27 && iArr[i17 + i10] >= i15) {
                            c0146u3 = new C0146u();
                            c0146u3.f1773a = i15;
                            c0146u3.f1774b = i39;
                            c0146u3.f1775c = i14;
                            c0146u3.f1776d = i40;
                            c0146u3.f1777e = true;
                            break;
                        }
                        i38 += 2;
                        i37 = i41;
                        iB2 = i16;
                    }
                    if (c0146u3 != null) {
                        c0146u = c0146u3;
                        break;
                    }
                    i27++;
                    i25 = i10;
                    iA = i13;
                    i23 = 1;
                    i21 = 0;
                }
            } else {
                i10 = i25;
                c0146u = null;
                break;
            }
            if (c0146u != null) {
                if (c0146u.a() > 0) {
                    int i42 = c0146u.f1776d;
                    int i43 = c0146u.f1774b;
                    int i44 = i42 - i43;
                    int i45 = c0146u.f1775c;
                    int i46 = c0146u.f1773a;
                    int i47 = i45 - i46;
                    if (i44 == i47) {
                        c0142q = new C0142q(i46, i43, i47);
                    } else if (c0146u.f1777e) {
                        c0142q = new C0142q(i46, i43, c0146u.a());
                    } else {
                        c0142q = i44 > i47 ? new C0142q(i46, i43 + 1, c0146u.a()) : new C0142q(i46 + 1, i43, c0146u.a());
                    }
                    arrayList.add(c0142q);
                }
                if (arrayList3.isEmpty()) {
                    c0145t = new C0145t();
                    i11 = 1;
                } else {
                    i11 = 1;
                    c0145t = (C0145t) arrayList3.remove(arrayList3.size() - 1);
                }
                c0145t.f1766a = c0145t3.f1766a;
                c0145t.f1768c = c0145t3.f1768c;
                c0145t.f1767b = c0146u.f1773a;
                c0145t.f1769d = c0146u.f1774b;
                arrayList2.add(c0145t);
                c0145t3.f1767b = c0145t3.f1767b;
                c0145t3.f1769d = c0145t3.f1769d;
                c0145t3.f1766a = c0146u.f1775c;
                c0145t3.f1768c = c0146u.f1776d;
                arrayList2.add(c0145t3);
            } else {
                i11 = 1;
                arrayList3.add(c0145t3);
            }
            i25 = i10;
            i23 = i11;
            i21 = 0;
        }
        Collections.sort(arrayList, f1650c);
        return new r(abstractC0114c, arrayList, iArr, iArr2);
    }

    public static int f(B0 b5, W w9, View view, View view2, AbstractC0135m0 abstractC0135m0, boolean z10) {
        if (abstractC0135m0.w() == 0 || b5.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z10) {
            return Math.abs(AbstractC0135m0.H(view) - AbstractC0135m0.H(view2)) + 1;
        }
        return Math.min(w9.n(), w9.d(view2) - w9.g(view));
    }

    public static int g(B0 b5, W w9, View view, View view2, AbstractC0135m0 abstractC0135m0, boolean z10, boolean z11) {
        if (abstractC0135m0.w() == 0 || b5.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        int iMax = z11 ? Math.max(0, (b5.b() - Math.max(AbstractC0135m0.H(view), AbstractC0135m0.H(view2))) - 1) : Math.max(0, Math.min(AbstractC0135m0.H(view), AbstractC0135m0.H(view2)));
        if (z10) {
            return Math.round((iMax * (Math.abs(w9.d(view2) - w9.g(view)) / (Math.abs(AbstractC0135m0.H(view) - AbstractC0135m0.H(view2)) + 1))) + (w9.m() - w9.g(view)));
        }
        return iMax;
    }

    public static int h(B0 b5, W w9, View view, View view2, AbstractC0135m0 abstractC0135m0, boolean z10) {
        if (abstractC0135m0.w() == 0 || b5.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z10) {
            return b5.b();
        }
        return (int) (((w9.d(view2) - w9.g(view)) / (Math.abs(AbstractC0135m0.H(view) - AbstractC0135m0.H(view2)) + 1)) * b5.b());
    }

    public abstract boolean a(int i10, int i11);

    public abstract boolean b(Object obj, Object obj2);

    public abstract boolean c(int i10, int i11);

    public abstract boolean d(Object obj, Object obj2);

    public abstract Object i(int i10, int i11);

    public abstract Object j(Object obj, Object obj2);

    public abstract int k();

    public abstract int l();
}
