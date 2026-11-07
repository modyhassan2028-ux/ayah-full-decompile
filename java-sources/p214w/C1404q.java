package p214w;

import p223x.q0;
import p241y9.a;
import p251z9.k;

/* JADX INFO: renamed from: w.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1404q extends k implements a {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f23532r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ q0 f23533s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1404q(q0 q0Var, int i10) {
        super(0);
        this.f23532r = i10;
        this.f23533s = q0Var;
    }

    @Override // p241y9.a
    public final Object invoke() {
        switch (this.f23532r) {
            case 0:
                q0 q0Var = this.f23533s;
                Object objI = q0Var.f24065a.i();
                x xVar = x.f23551t;
                return Boolean.valueOf(objI == xVar && q0Var.f24068d.getValue() == xVar);
            default:
                return Long.valueOf(this.f23533s.b());
        }
    }
}
