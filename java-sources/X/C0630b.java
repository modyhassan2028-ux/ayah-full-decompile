package X;

import H0.U;
import W.Q0;
import Z.C0698o;
import p223x.AbstractC1413d;
import p223x.AbstractC1434x;
import p223x.l0;
import p223x.u0;

/* JADX INFO: renamed from: X.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0630b extends p251z9.k implements p241y9.f {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final C0630b f9727s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final C0630b f9728t;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f9729r;

    static {
        int i10 = 3;
        f9727s = new C0630b(i10, 0);
        f9728t = new C0630b(i10, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0630b(int i10, int i11) {
        super(i10);
        this.f9729r = i11;
    }

    @Override // p241y9.f
    public final Object d(Object obj, Object obj2, Object obj3) {
        Object u0Var;
        switch (this.f9729r) {
            case 0:
                H0.K k7 = (H0.K) obj;
                long j = ((p063g1.a) obj3).f16246a;
                int iE = k7.E(AbstractC0632d.f9731a);
                int i10 = iE * 2;
                U uA = ((H0.H) obj2).a(p063g1.b.i(i10, 0, j));
                return k7.g0(uA.f3168r - i10, uA.f3169s, p120l9.s.f19441r, new Q0(iE, 1, uA));
            default:
                l0 l0Var = (l0) obj;
                C0698o c0698o = (C0698o) obj2;
                ((Number) obj3).intValue();
                c0698o.T(-1154662212);
                y yVar = y.f9806r;
                y yVar2 = y.f9807s;
                if (l0Var.b(yVar, yVar2)) {
                    u0Var = AbstractC1413d.q(67, 0, AbstractC1434x.f24124d, 2);
                } else {
                    u0Var = (l0Var.b(yVar2, yVar) || l0Var.b(y.f9808t, yVar2)) ? new u0(83, 67, AbstractC1434x.f24124d) : AbstractC1413d.p(0.0f, 7, null);
                }
                c0698o.p(false);
                return u0Var;
        }
    }
}
