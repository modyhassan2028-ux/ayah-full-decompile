package Y9;

/* JADX INFO: renamed from: Y9.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0664u extends S {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C0664u f10552c = new C0664u(C0665v.f10553a);

    @Override // Y9.AbstractC0645a
    public final int h(Object obj) {
        float[] fArr = (float[]) obj;
        p251z9.j.e(fArr, "<this>");
        return fArr.length;
    }

    @Override // Y9.AbstractC0658n, Y9.AbstractC0645a
    public final void j(X9.a aVar, int i10, Object obj) {
        C0663t c0663t = (C0663t) obj;
        p251z9.j.e(c0663t, "builder");
        float fS = aVar.s(this.f10483b, i10);
        c0663t.b(c0663t.d() + 1);
        float[] fArr = c0663t.f10550a;
        int i11 = c0663t.f10551b;
        c0663t.f10551b = i11 + 1;
        fArr[i11] = fS;
    }

    @Override // Y9.AbstractC0645a
    public final Object k(Object obj) {
        float[] fArr = (float[]) obj;
        p251z9.j.e(fArr, "<this>");
        C0663t c0663t = new C0663t();
        c0663t.f10550a = fArr;
        c0663t.f10551b = fArr.length;
        c0663t.b(10);
        return c0663t;
    }

    @Override // Y9.S
    public final Object n() {
        return new float[0];
    }

    @Override // Y9.S
    public final void o(p009aa.n nVar, Object obj, int i10) {
        float[] fArr = (float[]) obj;
        p251z9.j.e(nVar, "encoder");
        p251z9.j.e(fArr, "content");
        for (int i11 = 0; i11 < i10; i11++) {
            float f3 = fArr[i11];
            Q q10 = this.f10483b;
            p251z9.j.e(q10, "descriptor");
            nVar.f(q10, i11);
            nVar.g(f3);
        }
    }
}
