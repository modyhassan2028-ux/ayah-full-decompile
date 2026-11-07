package Y9;

/* JADX INFO: renamed from: Y9.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0660p extends S {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C0660p f10540c = new C0660p(C0661q.f10541a);

    @Override // Y9.AbstractC0645a
    public final int h(Object obj) {
        double[] dArr = (double[]) obj;
        p251z9.j.e(dArr, "<this>");
        return dArr.length;
    }

    @Override // Y9.AbstractC0658n, Y9.AbstractC0645a
    public final void j(X9.a aVar, int i10, Object obj) {
        C0659o c0659o = (C0659o) obj;
        p251z9.j.e(c0659o, "builder");
        double dJ = aVar.j(this.f10483b, i10);
        c0659o.b(c0659o.d() + 1);
        double[] dArr = c0659o.f10538a;
        int i11 = c0659o.f10539b;
        c0659o.f10539b = i11 + 1;
        dArr[i11] = dJ;
    }

    @Override // Y9.AbstractC0645a
    public final Object k(Object obj) {
        double[] dArr = (double[]) obj;
        p251z9.j.e(dArr, "<this>");
        C0659o c0659o = new C0659o();
        c0659o.f10538a = dArr;
        c0659o.f10539b = dArr.length;
        c0659o.b(10);
        return c0659o;
    }

    @Override // Y9.S
    public final Object n() {
        return new double[0];
    }

    @Override // Y9.S
    public final void o(p009aa.n nVar, Object obj, int i10) {
        double[] dArr = (double[]) obj;
        p251z9.j.e(nVar, "encoder");
        p251z9.j.e(dArr, "content");
        for (int i11 = 0; i11 < i10; i11++) {
            double d5 = dArr[i11];
            Q q10 = this.f10483b;
            p251z9.j.e(q10, "descriptor");
            nVar.f(q10, i11);
            nVar.e(d5);
        }
    }
}
