package F;

import H0.T;
import J0.K;
import Z.X;
import java.util.ArrayList;
import java.util.List;
import p151p.V;
import p180s0.C1297f;
import p180s0.C1303l;

/* JADX INFO: loaded from: classes.dex */
public final class q extends p251z9.k implements p241y9.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f2090r = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ boolean f2091s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f2092t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f2093u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f2094v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(X x9, ArrayList arrayList, List list, boolean z10) {
        super(1);
        this.f2092t = x9;
        this.f2093u = arrayList;
        this.f2094v = list;
        this.f2091s = z10;
    }

    @Override // p241y9.c
    public final Object e(Object obj) {
        switch (this.f2090r) {
            case 0:
                T t2 = (T) obj;
                p pVar = new p(0, (ArrayList) this.f2093u, this.f2094v, this.f2091s);
                t2.f3167a = true;
                pVar.e(t2);
                t2.f3167a = false;
                ((X) this.f2092t).getValue();
                return p110k9.y.f19095a;
            default:
                C1303l c1303l = (C1303l) this.f2094v;
                C1297f c1297f = (C1297f) this.f2093u;
                K k7 = (K) obj;
                k7.a();
                p196u0.b bVar = k7.f3942r;
                if (((Boolean) ((p241y9.a) this.f2092t).invoke()).booleanValue()) {
                    if (this.f2091s) {
                        long jI = bVar.I();
                        p074h0.i iVar = bVar.f22795s;
                        long jV = iVar.v();
                        iVar.p().q();
                        try {
                            ((V) iVar.f16422s).w(-1.0f, 1.0f, jI);
                            bVar.d(c1297f, c1303l);
                        } finally {
                            iVar.p().n();
                            iVar.J(jV);
                        }
                    } else {
                        bVar.d(c1297f, c1303l);
                    }
                }
                return p110k9.y.f19095a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(p241y9.a aVar, boolean z10, C1297f c1297f, C1303l c1303l) {
        super(1);
        this.f2092t = aVar;
        this.f2091s = z10;
        this.f2093u = c1297f;
        this.f2094v = c1303l;
    }
}
