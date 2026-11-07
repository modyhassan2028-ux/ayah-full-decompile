package p214w;

import p223x.C1408a0;
import p223x.l0;
import p241y9.c;
import p251z9.k;

/* JADX INFO: loaded from: classes.dex */
public final class E extends k implements c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f23427r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ F f23428s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ E(F f3, int i10) {
        super(1);
        this.f23427r = i10;
        this.f23428s = f3;
    }

    @Override // p241y9.c
    public final Object e(Object obj) {
        switch (this.f23427r) {
            case 0:
                l0 l0Var = (l0) obj;
                x xVar = x.f23549r;
                x xVar2 = x.f23550s;
                boolean zB = l0Var.b(xVar, xVar2);
                C1408a0 c1408a0 = null;
                F f3 = this.f23428s;
                if (zB) {
                    C1406t c1406t = f3.f23433K.f23440a.f23467c;
                    if (c1406t != null) {
                        c1408a0 = c1406t.f23537c;
                    }
                } else if (l0Var.b(xVar2, x.f23551t)) {
                    C1406t c1406t2 = f3.f23434L.f23443a.f23467c;
                    if (c1406t2 != null) {
                        c1408a0 = c1406t2.f23537c;
                    }
                } else {
                    c1408a0 = B.f23418d;
                }
                return c1408a0 == null ? B.f23418d : c1408a0;
            default:
                l0 l0Var2 = (l0) obj;
                x xVar3 = x.f23549r;
                x xVar4 = x.f23550s;
                boolean zB2 = l0Var2.b(xVar3, xVar4);
                F f7 = this.f23428s;
                if (zB2) {
                    Q q10 = f7.f23433K.f23440a.f23466b;
                    return q10 != null ? q10.f23463b : B.f23417c;
                }
                if (!l0Var2.b(xVar4, x.f23551t)) {
                    return B.f23417c;
                }
                Q q11 = f7.f23434L.f23443a.f23466b;
                return q11 != null ? q11.f23463b : B.f23417c;
        }
    }
}
