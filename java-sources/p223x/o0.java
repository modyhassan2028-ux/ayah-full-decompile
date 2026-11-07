package p223x;

import B9.a;
import Z.C0677d0;
import Z.C0681f0;
import Z.D0;
import p093j0.n;
import p110k9.y;
import p241y9.c;
import p251z9.k;

/* JADX INFO: loaded from: classes.dex */
public final class o0 extends k implements c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ q0 f24063r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ float f24064s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(q0 q0Var, float f3) {
        super(1);
        this.f24063r = q0Var;
        this.f24064s = f3;
    }

    @Override // p241y9.c
    public final Object e(Object obj) {
        long jLongValue = ((Number) obj).longValue();
        q0 q0Var = this.f24063r;
        boolean zG = q0Var.g();
        C0677d0 c0677d0 = q0Var.g;
        if (!zG) {
            if (((D0) n.u(c0677d0.f10656s, c0677d0)).f10594c == Long.MIN_VALUE) {
                c0677d0.g(jLongValue);
                ((C0681f0) q0Var.f24065a.f16104r).setValue(Boolean.TRUE);
            }
            long jW = jLongValue - ((D0) n.u(c0677d0.f10656s, c0677d0)).f10594c;
            float f3 = this.f24064s;
            if (f3 != 0.0f) {
                jW = a.W(jW / ((double) f3));
            }
            q0Var.n(jW);
            q0Var.h(jW, f3 == 0.0f);
        }
        return y.f19095a;
    }
}
