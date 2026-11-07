package p162q0;

import J0.AbstractC0283f;
import J0.I;
import java.util.Comparator;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class v implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final v f21237a = new v();

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        t tVar = (t) obj;
        t tVar2 = (t) obj2;
        int i10 = 0;
        if (f.s(tVar) && f.s(tVar2)) {
            I iX = AbstractC0283f.x(tVar);
            I iX2 = AbstractC0283f.x(tVar2);
            if (!j.a(iX, iX2)) {
                Object[] objArr = new I[16];
                int i11 = 0;
                while (iX != null) {
                    int i12 = i11 + 1;
                    if (objArr.length < i12) {
                        int length = objArr.length;
                        Object[] objArr2 = new Object[Math.max(i12, length * 2)];
                        System.arraycopy(objArr, 0, objArr2, 0, length);
                        objArr = objArr2;
                    }
                    if (i11 != 0) {
                        System.arraycopy(objArr, 0, objArr, 0 + 1, i11 + 0);
                    }
                    objArr[0] = iX;
                    i11++;
                    iX = iX.u();
                }
                Object[] objArr3 = new I[16];
                int i13 = 0;
                while (iX2 != null) {
                    int i14 = i13 + 1;
                    if (objArr3.length < i14) {
                        int length2 = objArr3.length;
                        Object[] objArr4 = new Object[Math.max(i14, length2 * 2)];
                        System.arraycopy(objArr3, 0, objArr4, 0, length2);
                        objArr3 = objArr4;
                    }
                    if (i13 != 0) {
                        System.arraycopy(objArr3, 0, objArr3, 0 + 1, i13 + 0);
                    }
                    objArr3[0] = iX2;
                    i13++;
                    iX2 = iX2.u();
                }
                int iMin = Math.min(i11 - 1, i13 - 1);
                if (iMin >= 0) {
                    while (j.a(objArr[i10], objArr3[i10])) {
                        if (i10 != iMin) {
                            i10++;
                        }
                    }
                    return j.f(((I) objArr[i10]).v(), ((I) objArr3[i10]).v());
                }
                throw new IllegalStateException("Could not find a common ancestor between the two FocusModifiers.");
            }
        } else {
            if (f.s(tVar)) {
                return -1;
            }
            if (f.s(tVar2)) {
                return 1;
            }
        }
        return 0;
    }
}
