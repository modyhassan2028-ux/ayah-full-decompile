package J0;

import K0.AbstractC0359n0;
import K0.c1;
import Z.C0672b;
import Z.InterfaceC0706w;
import Z.M0;

/* JADX INFO: renamed from: J0.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0285h extends p251z9.k implements p241y9.e {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final C0285h f4089s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final C0285h f4090t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final C0285h f4091u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final C0285h f4092v;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f4093r;

    static {
        int i10 = 2;
        f4089s = new C0285h(i10, 0);
        f4090t = new C0285h(i10, 1);
        f4091u = new C0285h(i10, 2);
        f4092v = new C0285h(i10, 3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0285h(int i10, int i11) {
        super(i10);
        this.f4093r = i11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13, types: [l0.q] */
    /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8, types: [l0.q] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [b0.e] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [b0.e] */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r3v5 */
    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f4093r) {
            case 0:
                ((Number) obj2).intValue();
                ((InterfaceC0288k) obj).getClass();
                break;
            case 1:
                ((I) ((InterfaceC0288k) obj)).b0((H0.I) obj2);
                break;
            case 2:
                ((I) ((InterfaceC0288k) obj)).c0((l0.r) obj2);
                break;
            default:
                InterfaceC0706w interfaceC0706w = (InterfaceC0706w) obj2;
                I i10 = (I) ((InterfaceC0288k) obj);
                i10.S = interfaceC0706w;
                C0280d0 c0280d0 = i10.f3914W;
                M0 m10 = AbstractC0359n0.f5118h;
                p074h0.h hVar = (p074h0.h) interfaceC0706w;
                hVar.getClass();
                i10.Z((p063g1.c) C0672b.s(hVar, m10));
                p063g1.m mVar = (p063g1.m) C0672b.s(hVar, AbstractC0359n0.f5123n);
                if (i10.Q != mVar) {
                    i10.Q = mVar;
                    i10.E();
                    I iU = i10.u();
                    if (iU != null) {
                        iU.C();
                    }
                    i10.D();
                    for (l0.q qVar = (l0.q) c0280d0.f4067f; qVar != null; qVar = qVar.f19344w) {
                        qVar.o0();
                    }
                }
                i10.d0((c1) C0672b.s(hVar, AbstractC0359n0.f5128s));
                l0.q qVar2 = (l0.q) c0280d0.f4067f;
                if ((qVar2.f19342u & 32768) != 0) {
                    while (qVar2 != null) {
                        if ((qVar2.f19341t & 32768) != 0) {
                            ?? F10 = qVar2;
                            ?? eVar = 0;
                            while (F10 != 0) {
                                if (F10 instanceof InterfaceC0289l) {
                                    l0.q qVar3 = ((l0.q) ((InterfaceC0289l) F10)).f19339r;
                                    if (qVar3.f19338E) {
                                        k0.c(qVar3);
                                    } else {
                                        qVar3.f19334A = true;
                                    }
                                } else if ((F10.f19341t & 32768) != 0 && (F10 instanceof AbstractC0291n)) {
                                    l0.q qVar4 = ((AbstractC0291n) F10).f4151G;
                                    int i11 = 0;
                                    while (qVar4 != null) {
                                        if ((qVar4.f19341t & 32768) != 0) {
                                            i11++;
                                            if (i11 == 1) {
                                                F10 = F10;
                                                eVar = eVar;
                                                eVar = eVar;
                                                F10 = qVar4;
                                            } else {
                                                if (eVar == 0) {
                                                    eVar = new p011b0.e(new l0.q[16]);
                                                }
                                                if (F10 != 0) {
                                                    eVar.b(F10);
                                                    F10 = 0;
                                                }
                                                eVar.b(qVar4);
                                            }
                                        } else {
                                            F10 = F10;
                                            eVar = eVar;
                                        }
                                        qVar4 = qVar4.f19344w;
                                        F10 = F10;
                                        eVar = eVar;
                                    }
                                    if (i11 == 1) {
                                        F10 = F10;
                                        eVar = eVar;
                                    } else {
                                        F10 = F10;
                                        eVar = eVar;
                                    }
                                }
                                F10 = AbstractC0283f.f(eVar);
                            }
                        }
                        if ((qVar2.f19342u & 32768) != 0) {
                            qVar2 = qVar2.f19344w;
                        }
                    }
                }
                break;
        }
        return p110k9.y.f19095a;
    }
}
