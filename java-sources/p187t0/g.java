package p187t0;

import p180s0.q;

/* JADX INFO: loaded from: classes.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f22538a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f22539b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f22540c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float[] f22541d;

    public g(c cVar, c cVar2, c cVar3, float[] fArr) {
        this.f22538a = cVar;
        this.f22539b = cVar2;
        this.f22540c = cVar3;
        this.f22541d = fArr;
    }

    public long a(long j) {
        float fH = q.h(j);
        float fG = q.g(j);
        float fE = q.e(j);
        float fD = q.d(j);
        c cVar = this.f22539b;
        long jD = cVar.d(fH, fG, fE);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jD >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jD & 4294967295L));
        float fE2 = cVar.e(fH, fG, fE);
        float[] fArr = this.f22541d;
        if (fArr != null) {
            fIntBitsToFloat *= fArr[0];
            fIntBitsToFloat2 *= fArr[1];
            fE2 *= fArr[2];
        }
        float f3 = fIntBitsToFloat;
        float f7 = fIntBitsToFloat2;
        return this.f22540c.f(f3, f7, fE2, fD, this.f22538a);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0069  */
    /* JADX WARN: Illegal instructions before constructor call */
    public g(c cVar, c cVar2, int i10) {
        float[] fArr;
        long j = cVar.f22511b;
        long j10 = b.f22505a;
        c cVarA = b.a(j, j10) ? j.a(cVar) : cVar;
        c cVarA2 = b.a(cVar2.f22511b, j10) ? j.a(cVar2) : cVar2;
        if (i10 == 3) {
            boolean zA = b.a(cVar.f22511b, j10);
            boolean zA2 = b.a(cVar2.f22511b, j10);
            if (!(zA && zA2) && (zA || zA2)) {
                s sVar = ((q) (zA ? cVar : cVar2)).f22561d;
                float[] fArrA = j.f22547e;
                float[] fArrA2 = zA ? sVar.a() : fArrA;
                fArrA = zA2 ? sVar.a() : fArrA;
                fArr = new float[]{fArrA2[0] / fArrA[0], fArrA2[1] / fArrA[1], fArrA2[2] / fArrA[2]};
            } else {
                fArr = null;
            }
        } else {
            fArr = null;
        }
        this(cVar2, cVarA, cVarA2, fArr);
    }
}
