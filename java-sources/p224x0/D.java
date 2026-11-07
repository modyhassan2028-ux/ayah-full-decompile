package p224x0;

import p074h0.i;
import p110k9.y;
import p151p.V;
import p196u0.d;
import p241y9.c;
import p251z9.k;

/* JADX INFO: loaded from: classes.dex */
public final class D extends k implements c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f24132r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ E f24133s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ D(E e10, int i10) {
        super(1);
        this.f24132r = i10;
        this.f24133s = e10;
    }

    /* JADX WARN: Type inference failed for: r10v3, types: [y9.a, z9.k] */
    @Override // p241y9.c
    public final Object e(Object obj) {
        switch (this.f24132r) {
            case 0:
                E e10 = this.f24133s;
                e10.f24136d = true;
                e10.f24138f.invoke();
                return y.f19095a;
            default:
                d dVar = (d) obj;
                E e11 = this.f24133s;
                C1439c c1439c = e11.f24134b;
                float f3 = e11.f24141k;
                float f7 = e11.f24142l;
                i iVarY = dVar.y();
                long jV = iVarY.v();
                iVarY.p().q();
                try {
                    ((V) iVarY.f16422s).w(f3, f7, 0L);
                    c1439c.a(dVar);
                    return y.f19095a;
                } finally {
                    iVarY.p().n();
                    iVarY.J(jV);
                }
        }
    }
}
