package p094j1;

import A1.c;
import H0.a0;
import I1.AbstractC0244b0;
import I1.B0;
import I1.l0;
import J0.C0298v;
import M.k;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.viewinterop.AndroidViewHolder;
import androidx.compose.ui.viewinterop.ViewFactoryHolder;
import java.util.List;
import p104k1.m;
import va.g;

/* JADX INFO: loaded from: classes.dex */
public final class a extends AbstractC0244b0 {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f18704t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f18705u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(ViewGroup viewGroup, int i10) {
        super(1);
        this.f18704t = i10;
        this.f18705u = viewGroup;
    }

    @Override // I1.AbstractC0244b0
    public final B0 f(B0 b5, List list) {
        int i10 = this.f18704t;
        ViewGroup viewGroup = this.f18705u;
        switch (i10) {
            case 0:
                int i11 = AndroidViewHolder.Q;
                return ((ViewFactoryHolder) viewGroup).m(b5);
            default:
                m mVar = (m) viewGroup;
                if (mVar.f18931C) {
                    return b5;
                }
                View childAt = mVar.getChildAt(0);
                int iMax = Math.max(0, childAt.getLeft());
                int iMax2 = Math.max(0, childAt.getTop());
                int iMax3 = Math.max(0, mVar.getWidth() - childAt.getRight());
                int iMax4 = Math.max(0, mVar.getHeight() - childAt.getBottom());
                return (iMax == 0 && iMax2 == 0 && iMax3 == 0 && iMax4 == 0) ? b5 : b5.f3671a.n(iMax, iMax2, iMax3, iMax4);
        }
    }

    @Override // I1.AbstractC0244b0
    public final k g(l0 l0Var, k kVar) {
        switch (this.f18704t) {
            case 0:
                C0298v c0298v = (C0298v) ((ViewFactoryHolder) this.f18705u).f12112P.f3914W.f4064c;
                if (!c0298v.f4178d0.f19338E) {
                    return kVar;
                }
                long jL = g.L(c0298v.G(0L));
                int i10 = (int) (jL >> 32);
                if (i10 < 0) {
                    i10 = 0;
                }
                int i11 = (int) (jL & 4294967295L);
                if (i11 < 0) {
                    i11 = 0;
                }
                long jF = a0.d(c0298v).F();
                int i12 = (int) (jF >> 32);
                int i13 = (int) (jF & 4294967295L);
                long j = c0298v.f3170t;
                long jL2 = g.L(c0298v.G((((long) Float.floatToRawIntBits((int) (j >> 32))) << 32) | (((long) Float.floatToRawIntBits((int) (j & 4294967295L))) & 4294967295L)));
                int i14 = i12 - ((int) (jL2 >> 32));
                if (i14 < 0) {
                    i14 = 0;
                }
                int i15 = i13 - ((int) (4294967295L & jL2));
                int i16 = i15 >= 0 ? i15 : 0;
                return (i10 == 0 && i11 == 0 && i14 == 0 && i16 == 0) ? kVar : new k(21, AndroidViewHolder.l((c) kVar.f5618s, i10, i11, i14, i16), AndroidViewHolder.l((c) kVar.f5619t, i10, i11, i14, i16));
            default:
                m mVar = (m) this.f18705u;
                if (mVar.f18931C) {
                    return kVar;
                }
                View childAt = mVar.getChildAt(0);
                int iMax = Math.max(0, childAt.getLeft());
                int iMax2 = Math.max(0, childAt.getTop());
                int iMax3 = Math.max(0, mVar.getWidth() - childAt.getRight());
                int iMax4 = Math.max(0, mVar.getHeight() - childAt.getBottom());
                if (iMax == 0 && iMax2 == 0 && iMax3 == 0 && iMax4 == 0) {
                    return kVar;
                }
                c cVarC = c.c(iMax, iMax2, iMax3, iMax4);
                int i17 = cVarC.f462a;
                c cVar = (c) kVar.f5618s;
                int i18 = cVarC.f463b;
                int i19 = cVarC.f464c;
                int i20 = cVarC.f465d;
                return new k(21, B0.e(cVar, i17, i18, i19, i20), B0.e((c) kVar.f5619t, i17, i18, i19, i20));
        }
    }
}
