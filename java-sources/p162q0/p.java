package p162q0;

import G0.a;
import J0.AbstractC0283f;
import J0.AbstractC0291n;
import l0.q;
import p011b0.e;
import p241y9.c;

/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final p f21223b = new p();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final p f21224c = new p();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final p f21225d = new p();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f21226a = new e(new q[16]);

    public static void b(p pVar) {
        pVar.getClass();
        pVar.a(new m(1, 3));
    }

    public final boolean a(c cVar) {
        if (this == f21223b) {
            throw new IllegalStateException("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
        }
        if (this == f21224c) {
            throw new IllegalStateException("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
        }
        e eVar = this.f21226a;
        int i10 = eVar.f13127t;
        if (i10 == 0) {
            throw new IllegalStateException("\n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n");
        }
        Object[] objArr = eVar.f13125r;
        boolean z10 = false;
        for (int i11 = 0; i11 < i10; i11++) {
            q qVar = (q) ((q) objArr[i11]);
            if (!qVar.f19339r.f19338E) {
                a.b("visitChildren called on an unattached node");
            }
            e eVar2 = new e(new q[16]);
            q qVar2 = qVar.f19339r;
            q qVar3 = qVar2.f19344w;
            if (qVar3 == null) {
                AbstractC0283f.b(eVar2, qVar2);
            } else {
                eVar2.b(qVar3);
            }
            while (true) {
                int i12 = eVar2.f13127t;
                if (i12 == 0) {
                    break;
                }
                q qVarF = (q) eVar2.l(i12 - 1);
                if ((qVarF.f19342u & 1024) == 0) {
                    AbstractC0283f.b(eVar2, qVarF);
                } else {
                    while (qVarF != null) {
                        if ((qVarF.f19341t & 1024) != 0) {
                            e eVar3 = null;
                            while (qVarF != null) {
                                if (qVarF instanceof t) {
                                    t tVar = (t) qVarF;
                                    if (tVar.w0().f21214a ? ((Boolean) cVar.e(tVar)).booleanValue() : f.i(tVar, 7, cVar)) {
                                        z10 = true;
                                        break;
                                    }
                                } else if (((qVarF.f19341t & 1024) != 0) && (qVarF instanceof AbstractC0291n)) {
                                    int i13 = 0;
                                    for (q qVar4 = ((AbstractC0291n) qVarF).f4151G; qVar4 != null; qVar4 = qVar4.f19344w) {
                                        if ((qVar4.f19341t & 1024) != 0) {
                                            i13++;
                                            if (i13 == 1) {
                                                qVarF = qVar4;
                                            } else {
                                                if (eVar3 == null) {
                                                    eVar3 = new e(new q[16]);
                                                }
                                                if (qVarF != null) {
                                                    eVar3.b(qVarF);
                                                    qVarF = null;
                                                }
                                                eVar3.b(qVar4);
                                            }
                                        }
                                    }
                                    if (i13 == 1) {
                                    }
                                }
                                qVarF = AbstractC0283f.f(eVar3);
                            }
                            break;
                        }
                        qVarF = qVarF.f19344w;
                    }
                }
            }
        }
        return z10;
    }
}
