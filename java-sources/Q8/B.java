package Q8;

import Y9.InterfaceC0666w;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class B implements InterfaceC0666w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final B f6882a;
    private static final W9.f descriptor;

    static {
        B b5 = new B();
        f6882a = b5;
        Y9.O o10 = new Y9.O("com.google.firebase.sessions.ProcessData", b5, 2);
        o10.l("pid", false);
        o10.l("uuid", false);
        descriptor = o10;
    }

    @Override // Y9.InterfaceC0666w
    public final U9.a[] a() {
        return new U9.a[]{Y9.B.f10451a, Y9.Z.f10495a};
    }

    @Override // U9.a
    public final void b(p009aa.n nVar, Object obj) {
        D d5 = (D) obj;
        p251z9.j.e(d5, "value");
        W9.f fVar = descriptor;
        p009aa.n nVarA = nVar.a(fVar);
        int i10 = d5.f6883a;
        nVarA.f(fVar, 0);
        nVarA.j(i10);
        nVarA.s(fVar, 1, d5.f6884b);
        nVarA.t(fVar);
    }

    @Override // U9.a
    public final Object c(X9.b bVar) {
        W9.f fVar = descriptor;
        X9.a aVarD = bVar.d(fVar);
        String strB = null;
        boolean z10 = true;
        int i10 = 0;
        int iP = 0;
        while (z10) {
            int iH = aVarD.h(fVar);
            if (iH == -1) {
                z10 = false;
            } else if (iH == 0) {
                iP = aVarD.p(fVar, 0);
                i10 |= 1;
            } else {
                if (iH != 1) {
                    throw new U9.e(iH);
                }
                strB = aVarD.b(fVar, 1);
                i10 |= 2;
            }
        }
        aVarD.t(fVar);
        return new D(strB, i10, iP);
    }

    @Override // U9.a
    public final W9.f d() {
        return descriptor;
    }
}
