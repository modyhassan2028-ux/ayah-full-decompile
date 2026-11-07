package p214w;

import E9.d;
import G.b0;
import H0.H;
import H0.I;
import H0.InterfaceC0215n;
import H0.J;
import H0.K;
import H0.U;
import com.google.android.gms.internal.measurement.AbstractC0813f2;
import java.util.List;
import java.util.NoSuchElementException;
import p063g1.l;
import p120l9.s;

/* JADX INFO: renamed from: w.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1394g implements I {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1401n f23502a;

    public C1394g(C1401n c1401n) {
        this.f23502a = c1401n;
    }

    @Override // H0.I
    public final J a(K k7, List list, long j) {
        U u8;
        U u10;
        int i10;
        int i11;
        int i12;
        int size = list.size();
        U[] uArr = new U[size];
        int size2 = list.size();
        long j10 = 0;
        int i13 = 0;
        while (true) {
            u8 = null;
            if (i13 >= size2) {
                break;
            }
            H h7 = (H) list.get(i13);
            Object objI = h7.i();
            C1396i c1396i = objI instanceof C1396i ? (C1396i) objI : null;
            if (c1396i != null && ((Boolean) c1396i.f23503a.getValue()).booleanValue()) {
                U uA = h7.a(j);
                long j11 = (((long) uA.f3169s) & 4294967295L) | (((long) uA.f3168r) << 32);
                uArr[i13] = uA;
                j10 = j11;
            }
            i13++;
        }
        int size3 = list.size();
        for (int i14 = 0; i14 < size3; i14++) {
            H h10 = (H) list.get(i14);
            if (uArr[i14] == null) {
                uArr[i14] = h10.a(j);
            }
        }
        if (k7.t()) {
            i10 = (int) (j10 >> 32);
        } else {
            if (size == 0) {
                u10 = null;
            } else {
                u10 = uArr[0];
                int i15 = size - 1;
                if (i15 != 0) {
                    int i16 = u10 != null ? u10.f3168r : 0;
                    d dVar = new d(1, i15, 1);
                    int i17 = dVar.f1996s;
                    int i18 = dVar.f1997t;
                    boolean z10 = i18 <= 0 ? 1 >= i17 : 1 <= i17;
                    int i19 = z10 ? 1 : i17;
                    while (z10) {
                        if (i19 != i17) {
                            i19 += i18;
                            z10 = z10;
                        } else {
                            if (!z10) {
                                throw new NoSuchElementException();
                            }
                            i19 = i19;
                            z10 = false;
                        }
                        U u11 = uArr[i19];
                        int i20 = u11 != null ? u11.f3168r : 0;
                        if (i16 < i20) {
                            u10 = u11;
                            i16 = i20;
                        }
                    }
                }
            }
            i10 = u10 != null ? u10.f3168r : 0;
        }
        if (k7.t()) {
            i11 = (int) (j10 & 4294967295L);
        } else {
            if (size != 0) {
                u8 = uArr[0];
                int i21 = size - 1;
                if (i21 != 0) {
                    int i22 = u8 != null ? u8.f3169s : 0;
                    d dVar2 = new d(1, i21, 1);
                    int i23 = dVar2.f1996s;
                    int i24 = dVar2.f1997t;
                    boolean z11 = i24 <= 0 ? 1 >= i23 : 1 <= i23;
                    int i25 = z11 ? 1 : i23;
                    while (z11) {
                        if (i25 != i23) {
                            i12 = i25 + i24;
                            z11 = z11;
                        } else {
                            if (!z11) {
                                throw new NoSuchElementException();
                            }
                            i12 = i25;
                            z11 = false;
                        }
                        U u12 = uArr[i25];
                        int i26 = u12 != null ? u12.f3169s : 0;
                        i25 = i12;
                        if (i22 < i26) {
                            u8 = u12;
                            i22 = i26;
                        }
                    }
                }
            }
            i11 = u8 != null ? u8.f3169s : 0;
        }
        if (!k7.t()) {
            this.f23502a.f23519c.setValue(new l((((long) i10) << 32) | (((long) i11) & 4294967295L)));
        }
        return k7.g0(i10, i11, s.f19441r, new b0(uArr, this, i10, i11));
    }

    @Override // H0.I
    public final int b(InterfaceC0215n interfaceC0215n, List list, int i10) {
        Integer numValueOf;
        if (!list.isEmpty()) {
            numValueOf = Integer.valueOf(((H) list.get(0)).H(i10));
            int iE = AbstractC0813f2.E(list);
            int i11 = 1;
            if (1 <= iE) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(((H) list.get(i11)).H(i10));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i11 == iE) {
                        break;
                    }
                    i11++;
                }
            }
        } else {
            numValueOf = null;
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }

    @Override // H0.I
    public final int c(InterfaceC0215n interfaceC0215n, List list, int i10) {
        Integer numValueOf;
        if (!list.isEmpty()) {
            numValueOf = Integer.valueOf(((H) list.get(0)).P(i10));
            int iE = AbstractC0813f2.E(list);
            int i11 = 1;
            if (1 <= iE) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(((H) list.get(i11)).P(i10));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i11 == iE) {
                        break;
                    }
                    i11++;
                }
            }
        } else {
            numValueOf = null;
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }

    @Override // H0.I
    public final int e(InterfaceC0215n interfaceC0215n, List list, int i10) {
        Integer numValueOf;
        if (!list.isEmpty()) {
            numValueOf = Integer.valueOf(((H) list.get(0)).N(i10));
            int iE = AbstractC0813f2.E(list);
            int i11 = 1;
            if (1 <= iE) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(((H) list.get(i11)).N(i10));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i11 == iE) {
                        break;
                    }
                    i11++;
                }
            }
        } else {
            numValueOf = null;
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }

    @Override // H0.I
    public final int i(InterfaceC0215n interfaceC0215n, List list, int i10) {
        Integer numValueOf;
        if (!list.isEmpty()) {
            numValueOf = Integer.valueOf(((H) list.get(0)).d(i10));
            int iE = AbstractC0813f2.E(list);
            int i11 = 1;
            if (1 <= iE) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(((H) list.get(i11)).d(i10));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i11 == iE) {
                        break;
                    }
                    i11++;
                }
            }
        } else {
            numValueOf = null;
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }
}
