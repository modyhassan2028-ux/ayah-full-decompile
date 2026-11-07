package Y9;

/* JADX INFO: renamed from: Y9.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0649e extends S {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C0649e f10507c = new C0649e(C0650f.f10509a);

    @Override // Y9.AbstractC0645a
    public final int h(Object obj) {
        boolean[] zArr = (boolean[]) obj;
        p251z9.j.e(zArr, "<this>");
        return zArr.length;
    }

    @Override // Y9.AbstractC0658n, Y9.AbstractC0645a
    public final void j(X9.a aVar, int i10, Object obj) {
        C0648d c0648d = (C0648d) obj;
        p251z9.j.e(c0648d, "builder");
        boolean zN = aVar.n(this.f10483b, i10);
        c0648d.b(c0648d.d() + 1);
        boolean[] zArr = c0648d.f10503a;
        int i11 = c0648d.f10504b;
        c0648d.f10504b = i11 + 1;
        zArr[i11] = zN;
    }

    @Override // Y9.AbstractC0645a
    public final Object k(Object obj) {
        boolean[] zArr = (boolean[]) obj;
        p251z9.j.e(zArr, "<this>");
        C0648d c0648d = new C0648d();
        c0648d.f10503a = zArr;
        c0648d.f10504b = zArr.length;
        c0648d.b(10);
        return c0648d;
    }

    @Override // Y9.S
    public final Object n() {
        return new boolean[0];
    }

    @Override // Y9.S
    public final void o(p009aa.n nVar, Object obj, int i10) {
        boolean[] zArr = (boolean[]) obj;
        p251z9.j.e(nVar, "encoder");
        p251z9.j.e(zArr, "content");
        for (int i11 = 0; i11 < i10; i11++) {
            boolean z10 = zArr[i11];
            Q q10 = this.f10483b;
            p251z9.j.e(q10, "descriptor");
            nVar.f(q10, i11);
            nVar.b(z10);
        }
    }
}
