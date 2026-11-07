package K0;

import A.C0029l;
import J0.AbstractC0283f;
import Z.C0672b;
import androidx.compose.ui.platform.AndroidComposeView;

/* JADX INFO: loaded from: classes.dex */
public abstract class L0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Z.M0 f4956a = new Z.M0(C0382z0.f5213t);

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final void a(M.l lVar, C0029l c0029l, q9.c cVar) {
        J0 j10;
        if (cVar instanceof J0) {
            j10 = (J0) cVar;
            int i10 = j10.f4951s;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                j10.f4951s = i10 - Integer.MIN_VALUE;
            } else {
                j10 = new J0(cVar);
            }
        } else {
            j10 = new J0(cVar);
        }
        Object obj = j10.f4950r;
        int i11 = j10.f4951s;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p110k9.a.e(obj);
            throw new A6.a();
        }
        p110k9.a.e(obj);
        if (!lVar.f19339r.f19338E) {
            throw new IllegalArgumentException("establishTextInputSession called from an unattached node");
        }
        J0.r0 r0VarY = AbstractC0283f.y(lVar);
        p074h0.h hVar = (p074h0.h) AbstractC0283f.x(lVar).S;
        hVar.getClass();
        if (C0672b.s(hVar, f4956a) != null) {
            throw new ClassCastException();
        }
        j10.f4951s = 1;
        b(r0VarY, c0029l, j10);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final void b(J0.r0 r0Var, p241y9.e eVar, q9.c cVar) {
        K0 k7;
        if (cVar instanceof K0) {
            k7 = (K0) cVar;
            int i10 = k7.f4954s;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                k7.f4954s = i10 - Integer.MIN_VALUE;
            } else {
                k7 = new K0(cVar);
            }
        } else {
            k7 = new K0(cVar);
        }
        Object obj = k7.f4953r;
        int i11 = k7.f4954s;
        if (i11 == 0) {
            p110k9.a.e(obj);
            k7.f4954s = 1;
            ((AndroidComposeView) r0Var).P(eVar, k7);
        } else {
            if (i11 == 1) {
                p110k9.a.e(obj);
                throw new A6.a();
            }
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p110k9.a.e(obj);
            throw new A6.a();
        }
    }
}
