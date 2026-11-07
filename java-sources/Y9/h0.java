package Y9;

/* JADX INFO: loaded from: classes.dex */
public final class h0 extends S {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final h0 f10518c = new h0(i0.f10521a);

    @Override // Y9.AbstractC0645a
    public final int h(Object obj) {
        long[] jArr = ((p110k9.u) obj).f19091r;
        p251z9.j.e(jArr, "$this$collectionSize");
        return jArr.length;
    }

    @Override // Y9.AbstractC0658n, Y9.AbstractC0645a
    public final void j(X9.a aVar, int i10, Object obj) {
        g0 g0Var = (g0) obj;
        p251z9.j.e(g0Var, "builder");
        long jA = aVar.z(this.f10483b, i10).a();
        g0Var.b(g0Var.d() + 1);
        long[] jArr = g0Var.f10515a;
        int i11 = g0Var.f10516b;
        g0Var.f10516b = i11 + 1;
        jArr[i11] = jA;
    }

    @Override // Y9.AbstractC0645a
    public final Object k(Object obj) {
        long[] jArr = ((p110k9.u) obj).f19091r;
        p251z9.j.e(jArr, "$this$toBuilder");
        g0 g0Var = new g0();
        g0Var.f10515a = jArr;
        g0Var.f10516b = jArr.length;
        g0Var.b(10);
        return g0Var;
    }

    @Override // Y9.S
    public final Object n() {
        return new p110k9.u(new long[0]);
    }

    @Override // Y9.S
    public final void o(p009aa.n nVar, Object obj, int i10) {
        long[] jArr = ((p110k9.u) obj).f19091r;
        p251z9.j.e(nVar, "encoder");
        for (int i11 = 0; i11 < i10; i11++) {
            nVar.i(this.f10483b, i11).k(jArr[i11]);
        }
    }
}
