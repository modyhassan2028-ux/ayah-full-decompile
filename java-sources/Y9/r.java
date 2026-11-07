package Y9;

/* JADX INFO: loaded from: classes.dex */
public final class r implements U9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final r f10543a = new r();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final T f10544b = new T("kotlin.time.Duration", W9.d.f9667k);

    @Override // U9.a
    public final void b(p009aa.n nVar, Object obj) {
        long j = ((I9.a) obj).f3853r;
        int i10 = I9.a.f3852u;
        StringBuilder sb = new StringBuilder();
        if (j < 0) {
            sb.append('-');
        }
        sb.append("PT");
        long jH = j < 0 ? I9.a.h(j) : j;
        long jG = I9.a.g(jH, I9.c.HOURS);
        boolean z10 = false;
        int iG = I9.a.e(jH) ? 0 : (int) (I9.a.g(jH, I9.c.MINUTES) % ((long) 60));
        int iG2 = I9.a.e(jH) ? 0 : (int) (I9.a.g(jH, I9.c.SECONDS) % ((long) 60));
        int iD = I9.a.d(jH);
        if (I9.a.e(j)) {
            jG = 9999999999999L;
        }
        boolean z11 = jG != 0;
        boolean z12 = (iG2 == 0 && iD == 0) ? false : true;
        if (iG != 0 || (z12 && z11)) {
            z10 = true;
        }
        if (z11) {
            sb.append(jG);
            sb.append('H');
        }
        if (z10) {
            sb.append(iG);
            sb.append('M');
        }
        if (z12 || (!z11 && !z10)) {
            I9.a.b(sb, iG2, iD, 9, "S", true);
        }
        nVar.r(sb.toString());
    }

    @Override // U9.a
    public final Object c(X9.b bVar) {
        int i10 = I9.a.f3852u;
        String strW = bVar.w();
        p251z9.j.e(strW, "value");
        try {
            return new I9.a(p017b7.g.G(strW));
        } catch (IllegalArgumentException e10) {
            throw new IllegalArgumentException(p245z2.a.D("Invalid ISO duration string format: '", strW, "'."), e10);
        }
    }

    @Override // U9.a
    public final W9.f d() {
        return f10544b;
    }
}
