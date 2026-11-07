package Y9;

/* JADX INFO: renamed from: Y9.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0656l extends S {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C0656l f10528c = new C0656l(C0657m.f10531a);

    @Override // Y9.AbstractC0645a
    public final int h(Object obj) {
        char[] cArr = (char[]) obj;
        p251z9.j.e(cArr, "<this>");
        return cArr.length;
    }

    @Override // Y9.AbstractC0658n, Y9.AbstractC0645a
    public final void j(X9.a aVar, int i10, Object obj) {
        C0655k c0655k = (C0655k) obj;
        p251z9.j.e(c0655k, "builder");
        char cM = aVar.m(this.f10483b, i10);
        c0655k.b(c0655k.d() + 1);
        char[] cArr = c0655k.f10525a;
        int i11 = c0655k.f10526b;
        c0655k.f10526b = i11 + 1;
        cArr[i11] = cM;
    }

    @Override // Y9.AbstractC0645a
    public final Object k(Object obj) {
        char[] cArr = (char[]) obj;
        p251z9.j.e(cArr, "<this>");
        C0655k c0655k = new C0655k();
        c0655k.f10525a = cArr;
        c0655k.f10526b = cArr.length;
        c0655k.b(10);
        return c0655k;
    }

    @Override // Y9.S
    public final Object n() {
        return new char[0];
    }

    @Override // Y9.S
    public final void o(p009aa.n nVar, Object obj, int i10) {
        char[] cArr = (char[]) obj;
        p251z9.j.e(nVar, "encoder");
        p251z9.j.e(cArr, "content");
        for (int i11 = 0; i11 < i10; i11++) {
            char c10 = cArr[i11];
            Q q10 = this.f10483b;
            p251z9.j.e(q10, "descriptor");
            nVar.f(q10, i11);
            nVar.d(c10);
        }
    }
}
