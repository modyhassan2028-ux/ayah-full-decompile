package Y9;

/* JADX INFO: loaded from: classes.dex */
public final class G extends S {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final G f10460c = new G(H.f10461a);

    @Override // Y9.AbstractC0645a
    public final int h(Object obj) {
        long[] jArr = (long[]) obj;
        p251z9.j.e(jArr, "<this>");
        return jArr.length;
    }

    @Override // Y9.AbstractC0658n, Y9.AbstractC0645a
    public final void j(X9.a aVar, int i10, Object obj) {
        F f3 = (F) obj;
        p251z9.j.e(f3, "builder");
        long jK = aVar.k(this.f10483b, i10);
        f3.b(f3.d() + 1);
        long[] jArr = f3.f10458a;
        int i11 = f3.f10459b;
        f3.f10459b = i11 + 1;
        jArr[i11] = jK;
    }

    @Override // Y9.AbstractC0645a
    public final Object k(Object obj) {
        long[] jArr = (long[]) obj;
        p251z9.j.e(jArr, "<this>");
        F f3 = new F();
        f3.f10458a = jArr;
        f3.f10459b = jArr.length;
        f3.b(10);
        return f3;
    }

    @Override // Y9.S
    public final Object n() {
        return new long[0];
    }

    @Override // Y9.S
    public final void o(p009aa.n nVar, Object obj, int i10) {
        long[] jArr = (long[]) obj;
        p251z9.j.e(nVar, "encoder");
        p251z9.j.e(jArr, "content");
        for (int i11 = 0; i11 < i10; i11++) {
            nVar.l(this.f10483b, i11, jArr[i11]);
        }
    }
}
