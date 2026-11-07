package p214w;

import Z.C0690k;
import Z.C0698o;
import Z.L0;
import p085i0.f;
import p180s0.q;
import p187t0.c;
import p223x.AbstractC1413d;
import p223x.AbstractC1415e;
import p223x.InterfaceC1435y;
import p223x.v0;
import p223x.w0;

/* JADX INFO: loaded from: classes.dex */
public abstract class L {
    static {
        AbstractC1413d.p(0.0f, 7, null);
    }

    public static final L0 a(long j, InterfaceC1435y interfaceC1435y, C0698o c0698o) {
        boolean zG = c0698o.g(q.f(j));
        Object objH = c0698o.H();
        if (zG || objH == C0690k.f10683a) {
            c cVarF = q.f(j);
            C1390c c1390c = C1390c.f23481w;
            f fVar = new f(11, cVarF);
            v0 v0Var = w0.f24113a;
            v0 v0Var2 = new v0(c1390c, fVar);
            c0698o.e0(v0Var2);
            objH = v0Var2;
        }
        return AbstractC1415e.a(new q(j), (v0) objH, interfaceC1435y, "ColorAnimation", c0698o, 384);
    }
}
