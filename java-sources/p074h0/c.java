package p074h0;

import Z.C0672b;
import Z.C0698o;
import androidx.compose.animation.b;
import l0.r;
import p110k9.y;
import p181s2.s;
import p214w.G;
import p214w.H;
import p223x.InterfaceC1435y;
import p223x.n0;
import p223x.q0;
import p223x.t0;
import p223x.u0;
import p241y9.e;
import p251z9.k;

/* JADX INFO: loaded from: classes.dex */
public final class c extends k implements e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f16404r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f16405s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f16406t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f16407u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f16408v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f16409w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f16410x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        super(2);
        this.f16404r = 0;
        this.f16405s = dVar;
        this.f16407u = obj;
        this.f16408v = obj2;
        this.f16409w = obj3;
        this.f16410x = obj4;
        this.f16406t = i10;
    }

    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f16404r) {
            case 0:
                ((Number) obj2).intValue();
                d dVar = (d) this.f16405s;
                dVar.h(this.f16407u, this.f16408v, this.f16409w, this.f16410x, (C0698o) obj, C0672b.y(this.f16406t) | 1);
                break;
            case 1:
                ((Number) obj2).intValue();
                b.c((q0) this.f16407u, (r) this.f16408v, (G) this.f16409w, (H) this.f16410x, (d) this.f16405s, (C0698o) obj, C0672b.y(this.f16406t | 1));
                break;
            case 2:
                ((Number) obj2).intValue();
                s.b((q0) this.f16407u, (r) this.f16408v, (u0) this.f16409w, (p241y9.c) this.f16410x, (d) this.f16405s, (C0698o) obj, C0672b.y(this.f16406t | 1));
                break;
            default:
                ((Number) obj2).intValue();
                q0 q0Var = (q0) this.f16405s;
                n0 n0Var = (n0) this.f16409w;
                InterfaceC1435y interfaceC1435y = (InterfaceC1435y) this.f16410x;
                t0.a(q0Var, n0Var, this.f16407u, this.f16408v, interfaceC1435y, (C0698o) obj, C0672b.y(this.f16406t | 1));
                break;
        }
        return y.f19095a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(q0 q0Var, r rVar, Object obj, Object obj2, d dVar, int i10, int i11) {
        super(2);
        this.f16404r = i11;
        this.f16407u = q0Var;
        this.f16408v = rVar;
        this.f16409w = obj;
        this.f16410x = obj2;
        this.f16405s = dVar;
        this.f16406t = i10;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(q0 q0Var, n0 n0Var, Object obj, Object obj2, InterfaceC1435y interfaceC1435y, int i10) {
        super(2);
        this.f16404r = 3;
        this.f16405s = q0Var;
        this.f16409w = n0Var;
        this.f16407u = obj;
        this.f16408v = obj2;
        this.f16410x = interfaceC1435y;
        this.f16406t = i10;
    }
}
