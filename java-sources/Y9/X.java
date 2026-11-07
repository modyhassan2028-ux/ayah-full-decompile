package Y9;

/* JADX INFO: loaded from: classes.dex */
public final class X extends S {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final X f10492c = new X(Y.f10493a);

    @Override // Y9.AbstractC0645a
    public final int h(Object obj) {
        short[] sArr = (short[]) obj;
        p251z9.j.e(sArr, "<this>");
        return sArr.length;
    }

    @Override // Y9.AbstractC0658n, Y9.AbstractC0645a
    public final void j(X9.a aVar, int i10, Object obj) {
        W w9 = (W) obj;
        p251z9.j.e(w9, "builder");
        short sL = aVar.l(this.f10483b, i10);
        w9.b(w9.d() + 1);
        short[] sArr = w9.f10490a;
        int i11 = w9.f10491b;
        w9.f10491b = i11 + 1;
        sArr[i11] = sL;
    }

    @Override // Y9.AbstractC0645a
    public final Object k(Object obj) {
        short[] sArr = (short[]) obj;
        p251z9.j.e(sArr, "<this>");
        W w9 = new W();
        w9.f10490a = sArr;
        w9.f10491b = sArr.length;
        w9.b(10);
        return w9;
    }

    @Override // Y9.S
    public final Object n() {
        return new short[0];
    }

    @Override // Y9.S
    public final void o(p009aa.n nVar, Object obj, int i10) {
        short[] sArr = (short[]) obj;
        p251z9.j.e(nVar, "encoder");
        p251z9.j.e(sArr, "content");
        for (int i11 = 0; i11 < i10; i11++) {
            short s10 = sArr[i11];
            Q q10 = this.f10483b;
            p251z9.j.e(q10, "descriptor");
            nVar.f(q10, i11);
            nVar.q(s10);
        }
    }
}
