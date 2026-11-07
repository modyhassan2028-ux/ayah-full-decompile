package Y9;

/* JADX INFO: loaded from: classes.dex */
public final class A extends S {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final A f10450c = new A(B.f10451a);

    @Override // Y9.AbstractC0645a
    public final int h(Object obj) {
        int[] iArr = (int[]) obj;
        p251z9.j.e(iArr, "<this>");
        return iArr.length;
    }

    @Override // Y9.AbstractC0658n, Y9.AbstractC0645a
    public final void j(X9.a aVar, int i10, Object obj) {
        C0669z c0669z = (C0669z) obj;
        p251z9.j.e(c0669z, "builder");
        int iP = aVar.p(this.f10483b, i10);
        c0669z.b(c0669z.d() + 1);
        int[] iArr = c0669z.f10557a;
        int i11 = c0669z.f10558b;
        c0669z.f10558b = i11 + 1;
        iArr[i11] = iP;
    }

    @Override // Y9.AbstractC0645a
    public final Object k(Object obj) {
        int[] iArr = (int[]) obj;
        p251z9.j.e(iArr, "<this>");
        C0669z c0669z = new C0669z();
        c0669z.f10557a = iArr;
        c0669z.f10558b = iArr.length;
        c0669z.b(10);
        return c0669z;
    }

    @Override // Y9.S
    public final Object n() {
        return new int[0];
    }

    @Override // Y9.S
    public final void o(p009aa.n nVar, Object obj, int i10) {
        int[] iArr = (int[]) obj;
        p251z9.j.e(nVar, "encoder");
        p251z9.j.e(iArr, "content");
        for (int i11 = 0; i11 < i10; i11++) {
            int i12 = iArr[i11];
            Q q10 = this.f10483b;
            p251z9.j.e(q10, "descriptor");
            nVar.f(q10, i11);
            nVar.j(i12);
        }
    }
}
