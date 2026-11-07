package E2;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f1753a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f1754b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int[] f1755c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AbstractC0114c f1756d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f1757e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f1758f;
    public final boolean g;

    public r(AbstractC0114c abstractC0114c, ArrayList arrayList, int[] iArr, int[] iArr2) {
        int i10;
        int i11;
        this.f1753a = arrayList;
        this.f1754b = iArr;
        this.f1755c = iArr2;
        Arrays.fill(iArr, 0);
        Arrays.fill(iArr2, 0);
        this.f1756d = abstractC0114c;
        int iL = abstractC0114c.l();
        this.f1757e = iL;
        int iK = abstractC0114c.k();
        this.f1758f = iK;
        this.g = true;
        C0142q c0142q = arrayList.isEmpty() ? null : (C0142q) arrayList.get(0);
        if (c0142q == null || c0142q.f1750a != 0 || c0142q.f1751b != 0) {
            arrayList.add(0, new C0142q(0, 0, 0));
        }
        arrayList.add(new C0142q(iL, iK, 0));
        int size = arrayList.size();
        int i12 = 0;
        while (i12 < size) {
            Object obj = arrayList.get(i12);
            i12++;
            C0142q c0142q2 = (C0142q) obj;
            for (int i13 = 0; i13 < c0142q2.f1752c; i13++) {
                int i14 = c0142q2.f1750a + i13;
                int i15 = c0142q2.f1751b + i13;
                int i16 = abstractC0114c.a(i14, i15) ? 1 : 2;
                iArr[i14] = (i15 << 4) | i16;
                iArr2[i15] = (i14 << 4) | i16;
            }
        }
        if (this.g) {
            int size2 = arrayList.size();
            int i17 = 0;
            int i18 = 0;
            while (i18 < size2) {
                Object obj2 = arrayList.get(i18);
                i18++;
                C0142q c0142q3 = (C0142q) obj2;
                while (true) {
                    i10 = c0142q3.f1750a;
                    if (i17 < i10) {
                        if (iArr[i17] == 0) {
                            int size3 = arrayList.size();
                            int i19 = 0;
                            for (int i20 = 0; i20 < size3; i20++) {
                                C0142q c0142q4 = (C0142q) arrayList.get(i20);
                                while (true) {
                                    i11 = c0142q4.f1751b;
                                    if (i19 < i11) {
                                        if (iArr2[i19] == 0 && abstractC0114c.c(i17, i19)) {
                                            int i21 = abstractC0114c.a(i17, i19) ? 8 : 4;
                                            iArr[i17] = (i19 << 4) | i21;
                                            iArr2[i19] = i21 | (i17 << 4);
                                            break;
                                        }
                                        i19++;
                                    }
                                }
                                i19 = c0142q4.f1752c + i11;
                            }
                        }
                        i17++;
                    }
                }
                i17 = c0142q3.f1752c + i10;
            }
        }
    }

    public static C0144s b(ArrayDeque arrayDeque, int i10, boolean z10) {
        C0144s c0144s;
        Iterator it = arrayDeque.iterator();
        while (true) {
            if (!it.hasNext()) {
                c0144s = null;
                break;
            }
            c0144s = (C0144s) it.next();
            if (c0144s.f1759a == i10 && c0144s.f1761c == z10) {
                it.remove();
                break;
            }
        }
        while (it.hasNext()) {
            C0144s c0144s2 = (C0144s) it.next();
            if (z10) {
                c0144s2.f1760b--;
            } else {
                c0144s2.f1760b++;
            }
        }
        return c0144s;
    }

    public final void a(p248z6.c cVar) {
        int[] iArr;
        AbstractC0114c abstractC0114c;
        int i10;
        int i11;
        ArrayList arrayList;
        r rVar = this;
        C0122g c0122g = new C0122g(cVar);
        ArrayDeque arrayDeque = new ArrayDeque();
        ArrayList arrayList2 = rVar.f1753a;
        boolean z10 = true;
        int size = arrayList2.size() - 1;
        int i12 = rVar.f1757e;
        int i13 = rVar.f1758f;
        int i14 = i12;
        while (size >= 0) {
            C0142q c0142q = (C0142q) arrayList2.get(size);
            int i15 = c0142q.f1750a;
            int i16 = c0142q.f1752c;
            int i17 = i15 + i16;
            int i18 = c0142q.f1751b;
            int i19 = i18 + i16;
            while (true) {
                iArr = rVar.f1754b;
                abstractC0114c = rVar.f1756d;
                boolean z11 = z10;
                i10 = 0;
                if (i14 <= i17) {
                    break;
                }
                i14--;
                int i20 = iArr[i14];
                if ((i20 & 12) != 0) {
                    arrayList = arrayList2;
                    int i21 = i20 >> 4;
                    C0144s c0144sB = b(arrayDeque, i21, false);
                    if (c0144sB != null) {
                        int i22 = (i12 - c0144sB.f1760b) - 1;
                        c0122g.h(i14, i22);
                        if ((i20 & 4) != 0) {
                            c0122g.u(i22, z11 ? 1 : 0, abstractC0114c.i(i14, i21));
                        }
                    } else {
                        arrayDeque.add(new C0144s(i14, (i12 - i14) - (z11 ? 1 : 0), z11));
                    }
                } else {
                    arrayList = arrayList2;
                    c0122g.g(i14, z11 ? 1 : 0);
                    i12--;
                }
                arrayList2 = arrayList;
                z10 = true;
            }
            ArrayList arrayList3 = arrayList2;
            while (i13 > i19) {
                i13--;
                int i23 = rVar.f1755c[i13];
                if ((i23 & 12) != 0) {
                    int i24 = i23 >> 4;
                    C0144s c0144sB2 = b(arrayDeque, i24, true);
                    if (c0144sB2 == null) {
                        arrayDeque.add(new C0144s(i13, i12 - i14, false));
                        i11 = 0;
                    } else {
                        i11 = 0;
                        c0122g.h((i12 - c0144sB2.f1760b) - 1, i14);
                        if ((i23 & 4) != 0) {
                            c0122g.u(i14, 1, abstractC0114c.i(i24, i13));
                        }
                    }
                } else {
                    i11 = i10;
                    c0122g.s(i14, 1);
                    i12++;
                }
                rVar = this;
                i10 = i11;
            }
            int i25 = i18;
            int i26 = i15;
            while (i10 < i16) {
                if ((iArr[i26] & 15) == 2) {
                    c0122g.u(i26, 1, abstractC0114c.i(i26, i25));
                }
                i26++;
                i25++;
                i10++;
            }
            size--;
            rVar = this;
            z10 = true;
            i13 = i18;
            i14 = i15;
            arrayList2 = arrayList3;
        }
        c0122g.a();
    }
}
