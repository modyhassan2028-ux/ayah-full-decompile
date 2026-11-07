package K;

import H0.InterfaceC0219s;
import K0.C0363p0;
import K0.X0;
import U0.C0515g;
import Z.C0681f0;
import Z.C0699o0;
import Z.C0704u;

/* JADX INFO: loaded from: classes.dex */
public final class B extends p251z9.k implements p241y9.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f4439r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ W f4440s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ B(W w9, int i10) {
        super(1);
        this.f4439r = i10;
        this.f4440s = w9;
    }

    @Override // p241y9.c
    public final Object e(Object obj) {
        X0 x9;
        switch (this.f4439r) {
            case 0:
                InterfaceC0219s interfaceC0219s = (InterfaceC0219s) obj;
                t0 t0VarD = this.f4440s.d();
                if (t0VarD != null) {
                    t0VarD.f4796c = interfaceC0219s;
                }
                return p110k9.y.f19095a;
            case 1:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                this.f4440s.f4567q.setValue(bool);
                return p110k9.y.f19095a;
            case 2:
                int i10 = ((Z0.j) obj).f10928a;
                android.support.v4.media.session.r rVar = this.f4440s.f4568r;
                rVar.getClass();
                if (i10 == 7 || i10 == 2 || i10 == 6 || i10 == 5 || i10 == 3 || i10 == 4) {
                    rVar.D();
                } else if (i10 != 1 && i10 != 0) {
                    throw new IllegalStateException("invalid ImeAction");
                }
                if (i10 == 6) {
                    p162q0.j jVar = (p162q0.j) rVar.f11366u;
                    if (jVar == null) {
                        p251z9.j.k("focusManager");
                        throw null;
                    }
                    ((p162q0.k) jVar).e(1);
                } else if (i10 == 5) {
                    p162q0.j jVar2 = (p162q0.j) rVar.f11366u;
                    if (jVar2 == null) {
                        p251z9.j.k("focusManager");
                        throw null;
                    }
                    ((p162q0.k) jVar2).e(2);
                } else if (i10 == 7 && (x9 = (X0) rVar.f11364s) != null) {
                    ((C0363p0) x9).a();
                }
                return p110k9.y.f19095a;
            default:
                Z0.y yVar = (Z0.y) obj;
                String str = yVar.f10953a.f8060s;
                W w9 = this.f4440s;
                C0681f0 c0681f0 = w9.f4570t;
                C0515g c0515g = w9.j;
                if (!p251z9.j.a(str, c0515g != null ? c0515g.f8060s : null)) {
                    w9.f4561k.setValue(L.f4484r);
                    if (((Boolean) c0681f0.getValue()).booleanValue()) {
                        c0681f0.setValue(Boolean.FALSE);
                    } else {
                        w9.f4569s.setValue(Boolean.FALSE);
                    }
                }
                long j = U0.K.f8033b;
                w9.f(j);
                w9.e(j);
                w9.f4571u.e(yVar);
                C0699o0 c0699o0 = w9.f4554b;
                C0704u c0704u = c0699o0.f10747b;
                if (c0704u != null) {
                    c0704u.q(c0699o0, null);
                }
                return p110k9.y.f19095a;
        }
    }
}
