package W;

import com.google.android.gms.internal.measurement.AbstractC0813f2;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class G extends p251z9.k implements p241y9.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ ArrayList f8544r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f8545s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ ArrayList f8546t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C0561g1 f8547u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ p241y9.a f8548v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f8549w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ ArrayList f8550x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ ArrayList f8551y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final /* synthetic */ int f8552z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G(ArrayList arrayList, int i10, ArrayList arrayList2, C0561g1 c0561g1, p241y9.a aVar, int i11, ArrayList arrayList3, ArrayList arrayList4, int i12) {
        super(1);
        this.f8544r = arrayList;
        this.f8545s = i10;
        this.f8546t = arrayList2;
        this.f8547u = c0561g1;
        this.f8548v = aVar;
        this.f8549w = i11;
        this.f8550x = arrayList3;
        this.f8551y = arrayList4;
        this.f8552z = i12;
    }

    @Override // p241y9.c
    public final Object e(Object obj) {
        Integer numValueOf;
        Integer numValueOf2;
        int iV;
        H0.T t2 = (H0.T) obj;
        ArrayList arrayList = this.f8544r;
        Integer numValueOf3 = null;
        if (!arrayList.isEmpty()) {
            numValueOf = Integer.valueOf(((H0.U) arrayList.get(0)).f3168r);
            int iE = AbstractC0813f2.E(arrayList);
            if (1 <= iE) {
                int i10 = 1;
                while (true) {
                    Integer numValueOf4 = Integer.valueOf(((H0.U) arrayList.get(i10)).f3168r);
                    if (numValueOf4.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf4;
                    }
                    if (i10 == iE) {
                        break;
                    }
                    i10++;
                }
            }
        } else {
            numValueOf = null;
        }
        int iIntValue = numValueOf != null ? numValueOf.intValue() : 0;
        int i11 = this.f8545s;
        int iMax = Math.max(0, (i11 - iIntValue) / 2);
        ArrayList arrayList2 = this.f8546t;
        if (!arrayList2.isEmpty()) {
            numValueOf2 = Integer.valueOf(((H0.U) arrayList2.get(0)).f3168r);
            int iE2 = AbstractC0813f2.E(arrayList2);
            if (1 <= iE2) {
                int i12 = 1;
                while (true) {
                    Integer numValueOf5 = Integer.valueOf(((H0.U) arrayList2.get(i12)).f3168r);
                    if (numValueOf5.compareTo(numValueOf2) > 0) {
                        numValueOf2 = numValueOf5;
                    }
                    if (i12 == iE2) {
                        break;
                    }
                    i12++;
                }
            }
        } else {
            numValueOf2 = null;
        }
        int iIntValue2 = numValueOf2 != null ? numValueOf2.intValue() : 0;
        if (!arrayList2.isEmpty()) {
            numValueOf3 = Integer.valueOf(((H0.U) arrayList2.get(0)).f3169s);
            int iE3 = AbstractC0813f2.E(arrayList2);
            if (1 <= iE3) {
                int i13 = 1;
                while (true) {
                    Integer numValueOf6 = Integer.valueOf(((H0.U) arrayList2.get(i13)).f3169s);
                    if (numValueOf6.compareTo(numValueOf3) > 0) {
                        numValueOf3 = numValueOf6;
                    }
                    if (i13 == iE3) {
                        break;
                    }
                    i13++;
                }
            }
        }
        int iIntValue3 = numValueOf3 != null ? numValueOf3.intValue() : 0;
        int i14 = (i11 - iIntValue2) / 2;
        int iOrdinal = this.f8547u.b().ordinal();
        if (iOrdinal == 0 || iOrdinal == 1) {
            iV = this.f8549w;
        } else {
            if (iOrdinal != 2) {
                throw new A6.a();
            }
            iV = B9.a.V(((Number) this.f8548v.invoke()).floatValue());
        }
        int i15 = iV - iIntValue3;
        ArrayList arrayList3 = this.f8550x;
        int size = arrayList3.size();
        for (int i16 = 0; i16 < size; i16++) {
            H0.T.g(t2, (H0.U) arrayList3.get(i16), 0, this.f8552z);
        }
        ArrayList arrayList4 = this.f8551y;
        int size2 = arrayList4.size();
        for (int i17 = 0; i17 < size2; i17++) {
            H0.T.g(t2, (H0.U) arrayList4.get(i17), 0, 0);
        }
        int size3 = arrayList.size();
        for (int i18 = 0; i18 < size3; i18++) {
            H0.T.g(t2, (H0.U) arrayList.get(i18), iMax, 0);
        }
        int size4 = arrayList2.size();
        for (int i19 = 0; i19 < size4; i19++) {
            H0.T.g(t2, (H0.U) arrayList2.get(i19), i14, i15);
        }
        return p110k9.y.f19095a;
    }
}
