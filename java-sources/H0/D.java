package H0;

import J0.AbstractC0283f;
import J0.AbstractC0291n;
import J0.B0;
import J0.C0;
import J0.C0280d0;
import androidx.compose.ui.platform.AndroidComposeView;

/* JADX INFO: loaded from: classes.dex */
public final class D implements b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ E f3135a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3136b;

    public D(E e10, Object obj) {
        this.f3135a = e10;
        this.f3136b = obj;
    }

    @Override // H0.b0
    public final void a() {
        E e10 = this.f3135a;
        J0.I i10 = e10.f3144r;
        e10.b();
        J0.I i11 = (J0.I) e10.f3137A.j(this.f3136b);
        if (i11 != null) {
            if (e10.f3142F <= 0) {
                G0.a.b("No pre-composed items to dispose");
            }
            int iJ = ((p011b0.b) i10.p()).f13119r.j(i11);
            if (iJ < ((p011b0.b) i10.p()).f13119r.f13127t - e10.f3142F) {
                G0.a.b("Item is not in pre-composed item range");
            }
            e10.f3141E++;
            e10.f3142F--;
            int i12 = (((p011b0.b) i10.p()).f13119r.f13127t - e10.f3142F) - e10.f3141E;
            i10.f3904H = true;
            i10.L(iJ, i12, 1);
            i10.f3904H = false;
            e10.a(i12);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0, types: [C0.h] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [l0.q] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7, types: [l0.q] */
    /* JADX WARN: Type inference failed for: r6v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3, types: [b0.e] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6, types: [b0.e] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r8v7 */
    @Override // H0.b0
    public final void b(C0.h hVar) {
        C0280d0 c0280d0;
        l0.q qVar;
        B0 b5;
        J0.I i10 = (J0.I) this.f3135a.f3137A.g(this.f3136b);
        if (i10 == null || (c0280d0 = i10.f3914W) == null || (qVar = (l0.q) c0280d0.f4067f) == null) {
            return;
        }
        if (!qVar.f19339r.f19338E) {
            G0.a.b("visitSubtreeIf called on an unattached node");
        }
        p011b0.e eVar = new p011b0.e(new l0.q[16]);
        l0.q qVar2 = qVar.f19339r;
        l0.q qVar3 = qVar2.f19344w;
        if (qVar3 == null) {
            AbstractC0283f.b(eVar, qVar2);
        } else {
            eVar.b(qVar3);
        }
        while (true) {
            int i11 = eVar.f13127t;
            if (i11 == 0) {
                return;
            }
            l0.q qVar4 = (l0.q) eVar.l(i11 - 1);
            if ((qVar4.f19342u & 262144) != 0) {
                l0.q qVar5 = qVar4;
                while (true) {
                    if (qVar5 != null) {
                        if ((qVar5.f19341t & 262144) != 0) {
                            ?? F10 = qVar5;
                            ?? eVar2 = 0;
                            while (F10 != 0) {
                                if (F10 instanceof C0) {
                                    C0 c10 = (C0) F10;
                                    boolean zEquals = "androidx.compose.foundation.lazy.layout.TraversablePrefetchStateNode".equals(c10.p());
                                    B0 b10 = B0.f3879s;
                                    if (zEquals) {
                                        hVar.e(c10);
                                        b5 = b10;
                                    } else {
                                        b5 = B0.f3878r;
                                    }
                                    if (b5 != B0.f3880t) {
                                        if (b5 == b10) {
                                            break;
                                        }
                                    } else {
                                        return;
                                    }
                                } else if ((F10.f19341t & 262144) != 0 && (F10 instanceof AbstractC0291n)) {
                                    l0.q qVar6 = ((AbstractC0291n) F10).f4151G;
                                    int i12 = 0;
                                    F10 = F10;
                                    eVar2 = eVar2;
                                    while (qVar6 != null) {
                                        if ((qVar6.f19341t & 262144) != 0) {
                                            i12++;
                                            if (i12 == 1) {
                                                eVar2 = eVar2;
                                                F10 = qVar6;
                                            } else {
                                                if (eVar2 == 0) {
                                                    eVar2 = new p011b0.e(new l0.q[16]);
                                                }
                                                if (F10 != 0) {
                                                    eVar2.b(F10);
                                                    F10 = 0;
                                                }
                                                eVar2.b(qVar6);
                                            }
                                        }
                                        qVar6 = qVar6.f19344w;
                                        F10 = F10;
                                        eVar2 = eVar2;
                                    }
                                    if (i12 == 1) {
                                    }
                                }
                                F10 = AbstractC0283f.f(eVar2);
                            }
                        }
                        qVar5 = qVar5.f19344w;
                    }
                }
            }
            AbstractC0283f.b(eVar, qVar4);
        }
    }

    @Override // H0.b0
    public final int c() {
        J0.I i10 = (J0.I) this.f3135a.f3137A.g(this.f3136b);
        if (i10 != null) {
            return ((p011b0.b) i10.o()).f13119r.f13127t;
        }
        return 0;
    }

    @Override // H0.b0
    public final void d(long j, int i10) {
        E e10 = this.f3135a;
        J0.I i11 = (J0.I) e10.f3137A.g(this.f3136b);
        if (i11 == null || !i11.H()) {
            return;
        }
        int i12 = ((p011b0.b) i11.o()).f13119r.f13127t;
        if (i10 < 0 || i10 >= i12) {
            G0.a.d("Index (" + i10 + ") is out of bound of [0, " + i12 + ')');
        }
        if (i11.I()) {
            G0.a.a("Pre-measure called on node that is not placed");
        }
        J0.I i13 = e10.f3144r;
        i13.f3904H = true;
        ((AndroidComposeView) J0.L.a(i11)).z((J0.I) ((p011b0.b) i11.o()).get(i10), j);
        i13.f3904H = false;
    }
}
