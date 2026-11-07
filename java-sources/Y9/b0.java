package Y9;

/* JADX INFO: loaded from: classes.dex */
public final class b0 extends S {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b0 f10499c = new b0(c0.f10501a);

    @Override // Y9.AbstractC0645a
    public final int h(Object obj) {
        byte[] bArr = ((p110k9.q) obj).f19087r;
        p251z9.j.e(bArr, "$this$collectionSize");
        return bArr.length;
    }

    @Override // Y9.AbstractC0658n, Y9.AbstractC0645a
    public final void j(X9.a aVar, int i10, Object obj) {
        a0 a0Var = (a0) obj;
        p251z9.j.e(a0Var, "builder");
        byte bR = aVar.z(this.f10483b, i10).r();
        a0Var.b(a0Var.d() + 1);
        byte[] bArr = a0Var.f10497a;
        int i11 = a0Var.f10498b;
        a0Var.f10498b = i11 + 1;
        bArr[i11] = bR;
    }

    @Override // Y9.AbstractC0645a
    public final Object k(Object obj) {
        byte[] bArr = ((p110k9.q) obj).f19087r;
        p251z9.j.e(bArr, "$this$toBuilder");
        a0 a0Var = new a0();
        a0Var.f10497a = bArr;
        a0Var.f10498b = bArr.length;
        a0Var.b(10);
        return a0Var;
    }

    @Override // Y9.S
    public final Object n() {
        return new p110k9.q(new byte[0]);
    }

    @Override // Y9.S
    public final void o(p009aa.n nVar, Object obj, int i10) {
        byte[] bArr = ((p110k9.q) obj).f19087r;
        p251z9.j.e(nVar, "encoder");
        for (int i11 = 0; i11 < i10; i11++) {
            nVar.i(this.f10483b, i11).c(bArr[i11]);
        }
    }
}
