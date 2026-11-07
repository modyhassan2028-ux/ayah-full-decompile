package X2;

/* JADX INFO: loaded from: classes.dex */
public abstract class l extends k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public A1.e[] f9895a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f9896b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f9897c;

    public l() {
        this.f9895a = null;
        this.f9897c = 0;
    }

    public A1.e[] getPathData() {
        return this.f9895a;
    }

    public String getPathName() {
        return this.f9896b;
    }

    public void setPathData(A1.e[] eVarArr) {
        if (!B0.c.f(this.f9895a, eVarArr)) {
            this.f9895a = B0.c.w(eVarArr);
            return;
        }
        A1.e[] eVarArr2 = this.f9895a;
        for (int i10 = 0; i10 < eVarArr.length; i10++) {
            eVarArr2[i10].f467a = eVarArr[i10].f467a;
            int i11 = 0;
            while (true) {
                float[] fArr = eVarArr[i10].f468b;
                if (i11 < fArr.length) {
                    eVarArr2[i10].f468b[i11] = fArr[i11];
                    i11++;
                }
            }
        }
    }

    public l(l lVar) {
        this.f9895a = null;
        this.f9897c = 0;
        this.f9896b = lVar.f9896b;
        this.f9895a = B0.c.w(lVar.f9895a);
    }
}
