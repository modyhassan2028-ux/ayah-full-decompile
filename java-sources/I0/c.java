package I0;

import A.C0041r0;
import D.F;
import J0.AbstractC0283f;
import J0.AbstractC0291n;
import J0.C0277c;
import J0.I;
import androidx.compose.ui.platform.AndroidComposeView;
import java.util.HashSet;
import l0.q;
import u.A;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AndroidComposeView f3655a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p011b0.e f3656b = new p011b0.e(new C0277c[16]);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p011b0.e f3657c = new p011b0.e(new f[16]);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p011b0.e f3658d = new p011b0.e(new I[16]);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p011b0.e f3659e = new p011b0.e(new f[16]);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f3660f;

    public c(AndroidComposeView androidComposeView) {
        this.f3655a = androidComposeView;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [l0.q] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [l0.q] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [b0.e] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [b0.e] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v9 */
    public static void b(q qVar, f fVar, HashSet hashSet) {
        if (!qVar.f19339r.f19338E) {
            G0.a.b("visitSubtreeIf called on an unattached node");
        }
        p011b0.e eVar = new p011b0.e(new q[16]);
        q qVar2 = qVar.f19339r;
        q qVar3 = qVar2.f19344w;
        if (qVar3 == null) {
            AbstractC0283f.b(eVar, qVar2);
        } else {
            eVar.b(qVar3);
        }
        while (true) {
            int i10 = eVar.f13127t;
            if (i10 == 0) {
                return;
            }
            q qVar4 = (q) eVar.l(i10 - 1);
            if ((qVar4.f19342u & 32) != 0) {
                q qVar5 = qVar4;
                while (true) {
                    if (qVar5 != null) {
                        if ((qVar5.f19341t & 32) != 0) {
                            ?? F10 = qVar5;
                            ?? eVar2 = 0;
                            while (F10 != 0) {
                                if (F10 instanceof d) {
                                    d dVar = (d) F10;
                                    if (dVar instanceof C0277c) {
                                        C0277c c0277c = (C0277c) dVar;
                                        if ((c0277c.f4052F instanceof F) && c0277c.f4054H.contains(fVar)) {
                                            hashSet.add(dVar);
                                        }
                                    }
                                    if (dVar.j().q(fVar)) {
                                        break;
                                    }
                                } else if ((F10.f19341t & 32) != 0 && (F10 instanceof AbstractC0291n)) {
                                    q qVar6 = ((AbstractC0291n) F10).f4151G;
                                    int i11 = 0;
                                    F10 = F10;
                                    eVar2 = eVar2;
                                    while (qVar6 != null) {
                                        if ((qVar6.f19341t & 32) != 0) {
                                            i11++;
                                            if (i11 == 1) {
                                                eVar2 = eVar2;
                                                F10 = qVar6;
                                            } else {
                                                if (eVar2 == 0) {
                                                    eVar2 = new p011b0.e(new q[16]);
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
                                    if (i11 == 1) {
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

    public final void a() {
        if (this.f3660f) {
            return;
        }
        this.f3660f = true;
        C0041r0 c0041r0 = new C0041r0(8, this);
        A a9 = this.f3655a.L0;
        if (a9.f(c0041r0) >= 0) {
            return;
        }
        a9.a(c0041r0);
    }
}
