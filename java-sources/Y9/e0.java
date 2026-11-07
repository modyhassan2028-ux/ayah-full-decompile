package Y9;

/* JADX INFO: loaded from: classes.dex */
public final class e0 extends S {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final e0 f10508c = new e0(f0.f10511a);

    @Override // Y9.AbstractC0645a
    public final int h(Object obj) {
        int[] iArr = ((p110k9.s) obj).f19089r;
        p251z9.j.e(iArr, "$this$collectionSize");
        return iArr.length;
    }

    @Override // Y9.AbstractC0658n, Y9.AbstractC0645a
    public final void j(X9.a aVar, int i10, Object obj) {
        d0 d0Var = (d0) obj;
        p251z9.j.e(d0Var, "builder");
        int iO = aVar.z(this.f10483b, i10).o();
        d0Var.b(d0Var.d() + 1);
        int[] iArr = d0Var.f10505a;
        int i11 = d0Var.f10506b;
        d0Var.f10506b = i11 + 1;
        iArr[i11] = iO;
    }

    @Override // Y9.AbstractC0645a
    public final Object k(Object obj) {
        int[] iArr = ((p110k9.s) obj).f19089r;
        p251z9.j.e(iArr, "$this$toBuilder");
        d0 d0Var = new d0();
        d0Var.f10505a = iArr;
        d0Var.f10506b = iArr.length;
        d0Var.b(10);
        return d0Var;
    }

    @Override // Y9.S
    public final Object n() {
        return new p110k9.s(new int[0]);
    }

    @Override // Y9.S
    public final void o(p009aa.n nVar, Object obj, int i10) {
        int[] iArr = ((p110k9.s) obj).f19089r;
        p251z9.j.e(nVar, "encoder");
        for (int i11 = 0; i11 < i10; i11++) {
            nVar.i(this.f10483b, i11).j(iArr[i11]);
        }
    }
}
