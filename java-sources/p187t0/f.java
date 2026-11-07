package p187t0;

import p180s0.F;
import p180s0.q;

/* JADX INFO: loaded from: classes.dex */
public final class f extends g {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final q f22536e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final q f22537f;
    public final float[] g;

    public f(q qVar, q qVar2) {
        float[] fArrG;
        super(qVar2, qVar, qVar2, null);
        this.f22536e = qVar;
        this.f22537f = qVar2;
        float[] fArr = a.f22503b.f22504a;
        s sVar = qVar.f22561d;
        float[] fArr2 = qVar.f22565i;
        s sVar2 = qVar2.f22561d;
        float[] fArr3 = qVar2.j;
        if (j.d(sVar, sVar2)) {
            fArrG = j.g(fArr3, fArr2);
        } else {
            float[] fArrA = sVar.a();
            float[] fArrA2 = sVar2.a();
            s sVar3 = j.f22544b;
            fArrG = j.g(j.d(sVar2, sVar3) ? fArr3 : j.f(j.g(j.c(fArr, fArrA2, new float[]{0.964212f, 1.0f, 0.825188f}), qVar2.f22565i)), j.d(sVar, sVar3) ? fArr2 : j.g(j.c(fArr, fArrA, new float[]{0.964212f, 1.0f, 0.825188f}), fArr2));
        }
        this.g = fArrG;
    }

    @Override // p187t0.g
    public final long a(long j) {
        float fH = q.h(j);
        float fG = q.g(j);
        float fE = q.e(j);
        float fD = q.d(j);
        m mVar = this.f22536e.f22571p;
        float fB = (float) mVar.b(fH);
        float fB2 = (float) mVar.b(fG);
        float fB3 = (float) mVar.b(fE);
        float[] fArr = this.g;
        float f3 = (fArr[6] * fB3) + (fArr[3] * fB2) + (fArr[0] * fB);
        float f7 = (fArr[7] * fB3) + (fArr[4] * fB2) + (fArr[1] * fB);
        float f10 = (fArr[8] * fB3) + (fArr[5] * fB2) + (fArr[2] * fB);
        q qVar = this.f22537f;
        float fB4 = (float) qVar.f22568m.b(f3);
        m mVar2 = qVar.f22568m;
        return F.b(fB4, (float) mVar2.b(f7), (float) mVar2.b(f10), fD, qVar);
    }
}
