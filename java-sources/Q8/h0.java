package Q8;

import Y9.InterfaceC0666w;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h0 implements InterfaceC0666w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h0 f7009a;
    private static final W9.f descriptor;

    static {
        h0 h0Var = new h0();
        f7009a = h0Var;
        Y9.O o10 = new Y9.O("com.google.firebase.sessions.Time", h0Var, 3);
        o10.l("ms", false);
        o10.l("us", true);
        o10.l("seconds", true);
        descriptor = o10;
    }

    @Override // Y9.InterfaceC0666w
    public final U9.a[] a() {
        Y9.H h7 = Y9.H.f10461a;
        return new U9.a[]{h7, h7, h7};
    }

    @Override // U9.a
    public final void b(p009aa.n nVar, Object obj) {
        j0 j0Var = (j0) obj;
        p251z9.j.e(j0Var, "value");
        W9.f fVar = descriptor;
        p009aa.n nVarA = nVar.a(fVar);
        long j = j0Var.f7029a;
        long j10 = j0Var.f7031c;
        long j11 = j0Var.f7030b;
        nVarA.l(fVar, 0, j);
        if (nVarA.u(fVar) || j11 != ((long) 1000) * j) {
            nVarA.l(fVar, 1, j11);
        }
        if (nVarA.u(fVar) || j10 != j / ((long) 1000)) {
            nVarA.l(fVar, 2, j10);
        }
        nVarA.t(fVar);
    }

    @Override // U9.a
    public final Object c(X9.b bVar) {
        W9.f fVar = descriptor;
        X9.a aVarD = bVar.d(fVar);
        int i10 = 0;
        long jK = 0;
        long jK2 = 0;
        long jK3 = 0;
        boolean z10 = true;
        while (z10) {
            int iH = aVarD.h(fVar);
            if (iH == -1) {
                z10 = false;
            } else if (iH == 0) {
                jK = aVarD.k(fVar, 0);
                i10 |= 1;
            } else if (iH == 1) {
                jK2 = aVarD.k(fVar, 1);
                i10 |= 2;
            } else {
                if (iH != 2) {
                    throw new U9.e(iH);
                }
                jK3 = aVarD.k(fVar, 2);
                i10 |= 4;
            }
        }
        aVarD.t(fVar);
        return new j0(i10, jK, jK2, jK3);
    }

    @Override // U9.a
    public final W9.f d() {
        return descriptor;
    }
}
