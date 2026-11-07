package Y9;

/* JADX INFO: loaded from: classes.dex */
public final class k0 extends S {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final k0 f10527c = new k0(l0.f10529a);

    @Override // Y9.AbstractC0645a
    public final int h(Object obj) {
        short[] sArr = ((p110k9.x) obj).f19094r;
        p251z9.j.e(sArr, "$this$collectionSize");
        return sArr.length;
    }

    @Override // Y9.AbstractC0658n, Y9.AbstractC0645a
    public final void j(X9.a aVar, int i10, Object obj) {
        j0 j0Var = (j0) obj;
        p251z9.j.e(j0Var, "builder");
        short sV = aVar.z(this.f10483b, i10).v();
        j0Var.b(j0Var.d() + 1);
        short[] sArr = j0Var.f10523a;
        int i11 = j0Var.f10524b;
        j0Var.f10524b = i11 + 1;
        sArr[i11] = sV;
    }

    @Override // Y9.AbstractC0645a
    public final Object k(Object obj) {
        short[] sArr = ((p110k9.x) obj).f19094r;
        p251z9.j.e(sArr, "$this$toBuilder");
        j0 j0Var = new j0();
        j0Var.f10523a = sArr;
        j0Var.f10524b = sArr.length;
        j0Var.b(10);
        return j0Var;
    }

    @Override // Y9.S
    public final Object n() {
        return new p110k9.x(new short[0]);
    }

    @Override // Y9.S
    public final void o(p009aa.n nVar, Object obj, int i10) {
        short[] sArr = ((p110k9.x) obj).f19094r;
        p251z9.j.e(nVar, "encoder");
        for (int i11 = 0; i11 < i10; i11++) {
            nVar.i(this.f10483b, i11).q(sArr[i11]);
        }
    }
}
