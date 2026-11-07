package Y9;

/* JADX INFO: renamed from: Y9.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0652h extends S {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C0652h f10517c = new C0652h(C0653i.f10519a);

    @Override // Y9.AbstractC0645a
    public final int h(Object obj) {
        byte[] bArr = (byte[]) obj;
        p251z9.j.e(bArr, "<this>");
        return bArr.length;
    }

    @Override // Y9.AbstractC0658n, Y9.AbstractC0645a
    public final void j(X9.a aVar, int i10, Object obj) {
        C0651g c0651g = (C0651g) obj;
        p251z9.j.e(c0651g, "builder");
        byte bU = aVar.u(this.f10483b, i10);
        c0651g.b(c0651g.d() + 1);
        byte[] bArr = c0651g.f10513a;
        int i11 = c0651g.f10514b;
        c0651g.f10514b = i11 + 1;
        bArr[i11] = bU;
    }

    @Override // Y9.AbstractC0645a
    public final Object k(Object obj) {
        byte[] bArr = (byte[]) obj;
        p251z9.j.e(bArr, "<this>");
        C0651g c0651g = new C0651g();
        c0651g.f10513a = bArr;
        c0651g.f10514b = bArr.length;
        c0651g.b(10);
        return c0651g;
    }

    @Override // Y9.S
    public final Object n() {
        return new byte[0];
    }

    @Override // Y9.S
    public final void o(p009aa.n nVar, Object obj, int i10) {
        byte[] bArr = (byte[]) obj;
        p251z9.j.e(nVar, "encoder");
        p251z9.j.e(bArr, "content");
        for (int i11 = 0; i11 < i10; i11++) {
            byte b5 = bArr[i11];
            Q q10 = this.f10483b;
            p251z9.j.e(q10, "descriptor");
            nVar.f(q10, i11);
            nVar.c(b5);
        }
    }
}
