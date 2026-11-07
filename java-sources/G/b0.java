package G;

import p214w.C1394g;

/* JADX INFO: loaded from: classes.dex */
public final class b0 extends p251z9.k implements p241y9.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f2664r = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f2665s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f2666t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f2667u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f2668v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(int i10, int i11, u.z zVar, a0 a0Var) {
        super(1);
        this.f2665s = i10;
        this.f2666t = i11;
        this.f2667u = zVar;
        this.f2668v = a0Var;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0081  */
    @Override // p241y9.c
    public final Object e(Object obj) {
        Object c0173g;
        switch (this.f2664r) {
            case 0:
                C0175i c0175i = (C0175i) obj;
                p241y9.c cVar = (p241y9.c) c0175i.f2702c.f11364s;
                int i10 = c0175i.f2700a;
                int iMax = Math.max(this.f2665s, i10);
                int iMin = Math.min(this.f2666t, (c0175i.f2701b + i10) - 1);
                if (iMax <= iMin) {
                    while (true) {
                        if (cVar == null) {
                            c0173g = new C0173g(iMax);
                        } else {
                            c0173g = cVar.e(Integer.valueOf(iMax - i10));
                            if (c0173g == null) {
                                c0173g = new C0173g(iMax);
                            }
                        }
                        ((u.z) this.f2667u).g(iMax, c0173g);
                        a0 a0Var = (a0) this.f2668v;
                        ((Object[]) a0Var.f2656d)[iMax - a0Var.f2654b] = c0173g;
                        if (iMax != iMin) {
                            iMax++;
                        }
                    }
                }
                break;
            default:
                H0.T t2 = (H0.T) obj;
                H0.U[] uArr = (H0.U[]) this.f2667u;
                C1394g c1394g = (C1394g) this.f2668v;
                for (H0.U u8 : uArr) {
                    if (u8 != null) {
                        long jA = c1394g.f23502a.f23518b.a((((long) u8.f3168r) << 32) | (((long) u8.f3169s) & 4294967295L), (((long) this.f2666t) & 4294967295L) | (((long) this.f2665s) << 32), p063g1.m.f16261r);
                        t2.d(u8, (int) (jA >> 32), (int) (jA & 4294967295L), 0.0f);
                    }
                }
                break;
        }
        return p110k9.y.f19095a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(H0.U[] uArr, C1394g c1394g, int i10, int i11) {
        super(1);
        this.f2667u = uArr;
        this.f2668v = c1394g;
        this.f2665s = i10;
        this.f2666t = i11;
    }
}
