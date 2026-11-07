package Q8;

import Y9.InterfaceC0666w;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class N implements InterfaceC0666w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final N f6905a;
    private static final W9.f descriptor;

    static {
        N n6 = new N();
        f6905a = n6;
        Y9.O o10 = new Y9.O("com.google.firebase.sessions.SessionDetails", n6, 4);
        o10.l("sessionId", false);
        o10.l("firstSessionId", false);
        o10.l("sessionIndex", false);
        o10.l("sessionStartTimestampUs", false);
        descriptor = o10;
    }

    @Override // Y9.InterfaceC0666w
    public final U9.a[] a() {
        Y9.Z z10 = Y9.Z.f10495a;
        return new U9.a[]{z10, z10, Y9.B.f10451a, Y9.H.f10461a};
    }

    @Override // U9.a
    public final void b(p009aa.n nVar, Object obj) {
        P p10 = (P) obj;
        p251z9.j.e(p10, "value");
        W9.f fVar = descriptor;
        p009aa.n nVarA = nVar.a(fVar);
        nVarA.s(fVar, 0, p10.f6906a);
        nVarA.s(fVar, 1, p10.f6907b);
        int i10 = p10.f6908c;
        nVarA.f(fVar, 2);
        nVarA.j(i10);
        nVarA.l(fVar, 3, p10.f6909d);
        nVarA.t(fVar);
    }

    @Override // U9.a
    public final Object c(X9.b bVar) {
        W9.f fVar = descriptor;
        X9.a aVarD = bVar.d(fVar);
        int i10 = 0;
        int iP = 0;
        String strB = null;
        String strB2 = null;
        long jK = 0;
        boolean z10 = true;
        while (z10) {
            int iH = aVarD.h(fVar);
            if (iH == -1) {
                z10 = false;
            } else if (iH == 0) {
                strB = aVarD.b(fVar, 0);
                i10 |= 1;
            } else if (iH == 1) {
                strB2 = aVarD.b(fVar, 1);
                i10 |= 2;
            } else if (iH == 2) {
                iP = aVarD.p(fVar, 2);
                i10 |= 4;
            } else {
                if (iH != 3) {
                    throw new U9.e(iH);
                }
                jK = aVarD.k(fVar, 3);
                i10 |= 8;
            }
        }
        aVarD.t(fVar);
        return new P(i10, strB, strB2, iP, jK);
    }

    @Override // U9.a
    public final W9.f d() {
        return descriptor;
    }
}
