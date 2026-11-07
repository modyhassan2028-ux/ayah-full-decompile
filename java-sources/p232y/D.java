package p232y;

import J0.K;
import p063g1.c;
import p063g1.m;
import p171r0.e;
import p180s0.C;
import p180s0.F;
import p180s0.J;

/* JADX INFO: loaded from: classes.dex */
public final class D implements J, K {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final D f24416s = new D(0);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final D f24417t = new D(1);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final D f24418u = new D(2);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f24419r;

    public /* synthetic */ D(int i10) {
        this.f24419r = i10;
    }

    @Override // p232y.K
    public void a(K k7) {
        k7.a();
    }

    @Override // p180s0.J
    public F c(long j, m mVar, c cVar) {
        switch (this.f24419r) {
            case 0:
                float fE = cVar.E(r.f24583a);
                return new C(new e(0.0f, -fE, Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)) + fE));
            default:
                float fE2 = cVar.E(r.f24583a);
                return new C(new e(-fE2, 0.0f, Float.intBitsToFloat((int) (j >> 32)) + fE2, Float.intBitsToFloat((int) (j & 4294967295L))));
        }
    }
}
