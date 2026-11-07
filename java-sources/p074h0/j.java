package p074h0;

import Z.C0690k;
import Z.C0698o;
import Z.C0699o0;
import Z.C0704u;
import java.util.ArrayList;
import p241y9.e;
import p251z9.y;

/* JADX INFO: loaded from: classes.dex */
public abstract class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k f16425a = new k(0, new long[0], new Object[0]);

    public static final int a(int i10, int i11) {
        return i10 << (((i11 % 10) * 3) + 1);
    }

    public static final long b() {
        return Thread.currentThread().getId();
    }

    public static final void c(C0698o c0698o, e eVar) {
        p251z9.j.c(eVar, "null cannot be cast to non-null type kotlin.Function2<androidx.compose.runtime.Composer, kotlin.Int, kotlin.Unit>");
        y.b(2, eVar);
        eVar.invoke(c0698o, 1);
    }

    public static final d d(int i10, p110k9.e eVar, C0698o c0698o) {
        Object objH = c0698o.H();
        if (objH == C0690k.f10683a) {
            objH = new d(i10, eVar, true);
            c0698o.e0(objH);
        }
        d dVar = (d) objH;
        if (!p251z9.j.a(dVar.f16413t, eVar)) {
            boolean z10 = dVar.f16413t == null;
            dVar.f16413t = eVar;
            if (!z10 && dVar.f16412s) {
                C0699o0 c0699o0 = dVar.f16414u;
                if (c0699o0 != null) {
                    C0704u c0704u = c0699o0.f10747b;
                    if (c0704u != null) {
                        c0704u.q(c0699o0, null);
                    }
                    dVar.f16414u = null;
                }
                ArrayList arrayList = dVar.f16415v;
                if (arrayList != null) {
                    int size = arrayList.size();
                    for (int i11 = 0; i11 < size; i11++) {
                        C0699o0 c0699o1 = (C0699o0) arrayList.get(i11);
                        C0704u c0704u2 = c0699o1.f10747b;
                        if (c0704u2 != null) {
                            c0704u2.q(c0699o1, null);
                        }
                    }
                    arrayList.clear();
                }
            }
        }
        return dVar;
    }

    public static final boolean e(C0699o0 c0699o0, C0699o0 c0699o1) {
        if (c0699o0 == null) {
            return true;
        }
        if (c0699o0 instanceof C0699o0) {
            return !c0699o0.b() || c0699o0.equals(c0699o1) || p251z9.j.a(c0699o0.f10748c, c0699o1.f10748c);
        }
        return false;
    }
}
