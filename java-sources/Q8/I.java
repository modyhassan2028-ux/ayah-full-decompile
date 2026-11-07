package Q8;

import Y9.InterfaceC0666w;
import com.google.android.gms.internal.measurement.B1;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class I implements InterfaceC0666w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final I f6897a;
    private static final W9.f descriptor;

    static {
        I i10 = new I();
        f6897a = i10;
        Y9.O o10 = new Y9.O("com.google.firebase.sessions.SessionData", i10, 3);
        o10.l("sessionDetails", false);
        o10.l("backgroundTime", true);
        o10.l("processDataMap", true);
        descriptor = o10;
    }

    @Override // Y9.InterfaceC0666w
    public final U9.a[] a() {
        return new U9.a[]{N.f6905a, B1.C(h0.f7009a), B1.C(K.f6898d[2])};
    }

    @Override // U9.a
    public final void b(p009aa.n nVar, Object obj) {
        K k7 = (K) obj;
        p251z9.j.e(k7, "value");
        W9.f fVar = descriptor;
        p009aa.n nVarA = nVar.a(fVar);
        U9.a[] aVarArr = K.f6898d;
        N n6 = N.f6905a;
        P p10 = k7.f6899a;
        Map map = k7.f6901c;
        j0 j0Var = k7.f6900b;
        nVarA.o(fVar, 0, n6, p10);
        if (nVarA.u(fVar) || j0Var != null) {
            nVarA.n(fVar, 1, h0.f7009a, j0Var);
        }
        if (nVarA.u(fVar) || map != null) {
            nVarA.n(fVar, 2, aVarArr[2], map);
        }
        nVarA.t(fVar);
    }

    @Override // U9.a
    public final Object c(X9.b bVar) {
        W9.f fVar = descriptor;
        X9.a aVarD = bVar.d(fVar);
        U9.a[] aVarArr = K.f6898d;
        P p10 = null;
        boolean z10 = true;
        int i10 = 0;
        j0 j0Var = null;
        Map map = null;
        while (z10) {
            int iH = aVarD.h(fVar);
            if (iH == -1) {
                z10 = false;
            } else if (iH == 0) {
                p10 = (P) aVarD.f(fVar, 0, N.f6905a, p10);
                i10 |= 1;
            } else if (iH == 1) {
                j0Var = (j0) aVarD.x(fVar, 1, h0.f7009a, j0Var);
                i10 |= 2;
            } else {
                if (iH != 2) {
                    throw new U9.e(iH);
                }
                map = (Map) aVarD.x(fVar, 2, aVarArr[2], map);
                i10 |= 4;
            }
        }
        aVarD.t(fVar);
        return new K(i10, p10, j0Var, map);
    }

    @Override // U9.a
    public final W9.f d() {
        return descriptor;
    }
}
