package p214w;

import H0.H;
import H0.I;
import H0.InterfaceC0215n;
import H0.J;
import H0.K;
import H0.U;
import H0.X;
import com.google.android.gms.internal.measurement.AbstractC0813f2;
import java.util.ArrayList;
import java.util.List;
import p063g1.l;
import p120l9.s;

/* JADX INFO: renamed from: w.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1402o implements I {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1405s f23522a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f23523b;

    public C1402o(C1405s c1405s) {
        this.f23522a = c1405s;
    }

    @Override // H0.I
    public final J a(K k7, List list, long j) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int iMax = 0;
        int iMax2 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            U uA = ((H) list.get(i10)).a(j);
            iMax = Math.max(iMax, uA.f3168r);
            iMax2 = Math.max(iMax2, uA.f3169s);
            arrayList.add(uA);
        }
        boolean zT = k7.t();
        C1405s c1405s = this.f23522a;
        if (zT) {
            this.f23523b = true;
            c1405s.f23534a.setValue(new l((4294967295L & ((long) iMax2)) | (((long) iMax) << 32)));
        } else if (!this.f23523b) {
            c1405s.f23534a.setValue(new l((4294967295L & ((long) iMax2)) | (((long) iMax) << 32)));
        }
        return k7.g0(iMax, iMax2, s.f19441r, new X(5, arrayList));
    }

    @Override // H0.I
    public final int b(InterfaceC0215n interfaceC0215n, List list, int i10) {
        if (list.isEmpty()) {
            return 0;
        }
        int iH = ((H) list.get(0)).H(i10);
        int iE = AbstractC0813f2.E(list);
        int i11 = 1;
        if (1 <= iE) {
            while (true) {
                int iH2 = ((H) list.get(i11)).H(i10);
                if (iH2 > iH) {
                    iH = iH2;
                }
                if (i11 == iE) {
                    break;
                }
                i11++;
            }
        }
        return iH;
    }

    @Override // H0.I
    public final int c(InterfaceC0215n interfaceC0215n, List list, int i10) {
        if (list.isEmpty()) {
            return 0;
        }
        int iP = ((H) list.get(0)).P(i10);
        int iE = AbstractC0813f2.E(list);
        int i11 = 1;
        if (1 <= iE) {
            while (true) {
                int iP2 = ((H) list.get(i11)).P(i10);
                if (iP2 > iP) {
                    iP = iP2;
                }
                if (i11 == iE) {
                    break;
                }
                i11++;
            }
        }
        return iP;
    }

    @Override // H0.I
    public final int e(InterfaceC0215n interfaceC0215n, List list, int i10) {
        if (list.isEmpty()) {
            return 0;
        }
        int iN = ((H) list.get(0)).N(i10);
        int iE = AbstractC0813f2.E(list);
        int i11 = 1;
        if (1 <= iE) {
            while (true) {
                int iN2 = ((H) list.get(i11)).N(i10);
                if (iN2 > iN) {
                    iN = iN2;
                }
                if (i11 == iE) {
                    break;
                }
                i11++;
            }
        }
        return iN;
    }

    @Override // H0.I
    public final int i(InterfaceC0215n interfaceC0215n, List list, int i10) {
        if (list.isEmpty()) {
            return 0;
        }
        int iD = ((H) list.get(0)).d(i10);
        int iE = AbstractC0813f2.E(list);
        int i11 = 1;
        if (1 <= iE) {
            while (true) {
                int iD2 = ((H) list.get(i11)).d(i10);
                if (iD2 > iD) {
                    iD = iD2;
                }
                if (i11 == iE) {
                    break;
                }
                i11++;
            }
        }
        return iD;
    }
}
