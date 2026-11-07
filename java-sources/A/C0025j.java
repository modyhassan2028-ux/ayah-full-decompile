package A;

import D0.C0086d;
import F.C0153b;
import K0.ViewOnAttachStateChangeListenerC0381z;
import K9.AbstractC0405x;
import K9.InterfaceC0402u;
import Z.C0698o;
import androidx.compose.ui.platform.AbstractComposeView;
import java.util.NoSuchElementException;
import p001a0.C0717a;
import p001a0.C0718b;

/* JADX INFO: renamed from: A.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0025j extends p251z9.k implements p241y9.a {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f266r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f267s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f268t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f269u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0025j(C0698o c0698o, C0717a c0717a, Z.w0 w0Var, Z.W w9) {
        super(0);
        this.f266r = 5;
        this.f267s = c0698o;
        this.f268t = c0717a;
        this.f269u = w0Var;
    }

    @Override // p241y9.a
    public final Object invoke() {
        p110k9.y yVar;
        switch (this.f266r) {
            case 0:
                C0031m c0031m = (C0031m) this.f267s;
                C0009b c0009b = c0031m.f318I;
                while (true) {
                    p011b0.e eVar = c0009b.f188a;
                    int i10 = eVar.f13127t;
                    yVar = p110k9.y.f19095a;
                    if (i10 != 0) {
                        if (i10 == 0) {
                            throw new NoSuchElementException("MutableVector is empty.");
                        }
                        p171r0.e eVar2 = (p171r0.e) ((C0021h) eVar.f13125r[i10 - 1]).f246a.invoke();
                        if (eVar2 == null ? true : c0031m.x0(eVar2, c0031m.f322M)) {
                            p011b0.e eVar3 = c0009b.f188a;
                            ((C0021h) eVar3.l(eVar3.f13127t - 1)).f247b.resumeWith(yVar);
                        }
                    }
                }
                if (c0031m.f320K) {
                    p171r0.e eVarW0 = c0031m.w0();
                    if (eVarW0 != null && c0031m.x0(eVarW0, c0031m.f322M)) {
                        c0031m.f320K = false;
                    }
                }
                ((r1) this.f268t).f404e = C0031m.v0(c0031m, (InterfaceC0015e) this.f269u);
                return yVar;
            case 1:
                F.h hVar = (F.h) ((Z.C) this.f267s).getValue();
                F.A a9 = (F.A) this.f268t;
                return new F.i(a9, hVar, (C0153b) this.f269u, new G.a0((E9.d) ((G.G) a9.f2012d.f1161v).getValue(), hVar));
            case 2:
                H.f fVar = (H.f) this.f267s;
                p171r0.e eVarV0 = H.f.v0(fVar, (J0.j0) this.f268t, (C0086d) this.f269u);
                if (eVarV0 == null) {
                    return null;
                }
                C0031m c0031m2 = fVar.f3126F;
                if (p063g1.l.a(c0031m2.f322M, 0L)) {
                    C.a.c("Expected BringIntoViewRequester to not be used before parents are placed.");
                }
                return eVarV0.h(c0031m2.z0(eVarV0, c0031m2.f322M) ^ (-9223372034707292160L));
            case 3:
                AbstractC0405x.x((InterfaceC0402u) this.f267s, null, new C0039q((Z.X) this.f268t, (O.N) this.f269u, (p150o9.c) null, 14), 1);
                return p110k9.y.f19095a;
            case 4:
                AbstractComposeView abstractComposeView = (AbstractComposeView) this.f267s;
                abstractComposeView.removeOnAttachStateChangeListener((ViewOnAttachStateChangeListenerC0381z) this.f268t);
                K0.a1 a1Var = (K0.a1) this.f269u;
                p251z9.j.e(a1Var, "listener");
                p017b7.g.e0(abstractComposeView).f6580a.remove(a1Var);
                return p110k9.y.f19095a;
            default:
                C0698o c0698o = (C0698o) this.f267s;
                C0718b c0718b = c0698o.f10717L;
                C0717a c0717a = (C0717a) this.f268t;
                Z.w0 w0Var = (Z.w0) this.f269u;
                C0717a c0717a2 = c0718b.f11088b;
                try {
                    c0718b.f11088b = c0717a;
                    Z.w0 w0Var2 = c0698o.f10711F;
                    int[] iArr = c0698o.f10733n;
                    u.t tVar = c0698o.f10740u;
                    c0698o.f10733n = null;
                    c0698o.f10740u = null;
                    try {
                        c0698o.f10711F = w0Var;
                        boolean z10 = c0718b.f11091e;
                        try {
                            c0718b.f11091e = false;
                            throw null;
                        } catch (Throwable th) {
                            c0718b.f11091e = z10;
                            throw th;
                        }
                    } catch (Throwable th2) {
                        c0698o.f10711F = w0Var2;
                        c0698o.f10733n = iArr;
                        c0698o.f10740u = tVar;
                        throw th2;
                    }
                } catch (Throwable th3) {
                    c0718b.f11088b = c0717a2;
                    throw th3;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0025j(Object obj, Object obj2, Object obj3, int i10) {
        super(0);
        this.f266r = i10;
        this.f267s = obj;
        this.f268t = obj2;
        this.f269u = obj3;
    }
}
