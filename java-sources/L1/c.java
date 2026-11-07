package L1;

import H7.M;
import I1.AbstractC0244b0;
import I1.B0;
import I1.S;
import I1.k0;
import I1.l0;
import I1.y0;
import M.k;
import android.graphics.RectF;
import android.support.v4.media.session.p;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class c extends AbstractC0244b0 {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f5436t = 0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Object f5437u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f5438v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar) {
        super(0);
        this.f5438v = dVar;
        this.f5437u = new HashMap();
    }

    @Override // I1.AbstractC0244b0
    public final void d(l0 l0Var) {
        switch (this.f5436t) {
            case 0:
                ArrayList arrayList = ((d) this.f5438v).f5440b;
                if ((l0Var.f3759a.d() & 519) != 0) {
                    ((HashMap) this.f5437u).remove(l0Var);
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        a aVar = (a) arrayList.get(size);
                        int i10 = aVar.f5432c;
                        boolean z10 = i10 > 0;
                        int i11 = i10 - 1;
                        aVar.f5432c = i11;
                        if (z10 && i11 == 0) {
                            ArrayList arrayList2 = aVar.f5430a;
                            int size2 = arrayList2.size() - 1;
                            if (size2 >= 0) {
                                throw p.u(size2, arrayList2);
                            }
                        }
                    }
                    return;
                }
                return;
            default:
                View view = (View) this.f5438v;
                p071g9.a aVar2 = (p071g9.a) this.f5437u;
                int i12 = aVar2.f16336b;
                k0 k0Var = l0Var.f3759a;
                if ((i12 & k0Var.d()) != 0) {
                    aVar2.f16336b = (~k0Var.d()) & aVar2.f16336b;
                    B0 b5 = (B0) aVar2.g;
                    if (b5 != null) {
                        S.b(view, b5);
                    }
                }
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                for (View view2 : (List) aVar2.f16340f) {
                    view2.setTranslationX(0.0f);
                    view2.setTranslationY(0.0f);
                }
                return;
        }
    }

    @Override // I1.AbstractC0244b0
    public final void e(l0 l0Var) {
        switch (this.f5436t) {
            case 0:
                ArrayList arrayList = ((d) this.f5438v).f5440b;
                if ((l0Var.f3759a.d() & 519) != 0) {
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        ((a) arrayList.get(size)).f5432c++;
                    }
                }
                break;
            default:
                p071g9.a aVar = (p071g9.a) this.f5437u;
                aVar.f16336b = (l0Var.f3759a.d() & aVar.f16335a) | aVar.f16336b;
                break;
        }
    }

    @Override // I1.AbstractC0244b0
    public final B0 f(B0 b5, List list) {
        switch (this.f5436t) {
            case 0:
                ArrayList arrayList = ((d) this.f5438v).f5440b;
                RectF rectF = new RectF(1.0f, 1.0f, 1.0f, 1.0f);
                for (int size = list.size() - 1; size >= 0; size--) {
                    l0 l0Var = (l0) list.get(size);
                    Integer num = (Integer) ((HashMap) this.f5437u).get(l0Var);
                    if (num != null) {
                        int iIntValue = num.intValue();
                        float fA = l0Var.f3759a.a();
                        if ((iIntValue & 1) != 0) {
                            rectF.left = fA;
                        }
                        if ((iIntValue & 2) != 0) {
                            rectF.top = fA;
                        }
                        if ((iIntValue & 4) != 0) {
                            rectF.right = fA;
                        }
                        if ((iIntValue & 8) != 0) {
                            rectF.bottom = fA;
                        }
                    }
                }
                A1.c.b(b5.f3671a.g(519), b5.f3671a.g(64));
                for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                    ArrayList arrayList2 = ((a) arrayList.get(size2)).f5430a;
                    int size3 = arrayList2.size() - 1;
                    if (size3 >= 0) {
                        throw p.u(size3, arrayList2);
                    }
                }
                return b5;
            default:
                View view = (View) this.f5438v;
                p071g9.a aVar = (p071g9.a) this.f5437u;
                j.e(b5, "insets");
                y0 y0Var = b5.f3671a;
                j.e(list, "runningAnimations");
                Iterator it = list.iterator();
                int iD = 0;
                while (it.hasNext()) {
                    iD |= ((l0) it.next()).f3759a.d();
                }
                int i10 = aVar.f16335a & iD;
                if (i10 != 0) {
                    A1.c cVarG = y0Var.g(i10);
                    j.d(cVarG, "insets.getInsets(runningAnimatingTypes)");
                    M m10 = (M) aVar.f16337c;
                    M m11 = (M) aVar.f16338d;
                    m10.getClass();
                    j.e(m11, "other");
                    int i11 = m11.f3458a;
                    int i12 = m11.f3459b;
                    int i13 = m11.f3460c;
                    int i14 = m11.f3461d;
                    if ((i11 | i12 | i13 | i14) != 0) {
                        M m12 = new M();
                        m12.f3458a = i11 | m10.f3458a;
                        m12.f3459b = m10.f3459b | i12;
                        m12.f3460c = m10.f3460c | i13;
                        m12.f3461d = m10.f3461d | i14;
                        m10 = m12;
                    }
                    A1.c cVarG2 = y0Var.g((~i10) & (m10.f3461d | m10.f3458a | m10.f3459b | m10.f3460c));
                    j.d(cVarG2, "insets.getInsets(\n      …                        )");
                    A1.c cVarC = A1.c.c(cVarG.f462a - cVarG2.f462a, cVarG.f463b - cVarG2.f463b, cVarG.f464c - cVarG2.f464c, cVarG.f465d - cVarG2.f465d);
                    A1.c cVarC2 = A1.c.c(Math.max(cVarC.f462a, 0), Math.max(cVarC.f463b, 0), Math.max(cVarC.f464c, 0), Math.max(cVarC.f465d, 0));
                    float f3 = cVarC2.f462a - cVarC2.f464c;
                    float f7 = cVarC2.f463b - cVarC2.f465d;
                    view.setTranslationX(f3);
                    view.setTranslationY(f7);
                    for (View view2 : (List) aVar.f16340f) {
                        view2.setTranslationX(f3);
                        view2.setTranslationY(f7);
                    }
                }
                return b5;
        }
    }

    @Override // I1.AbstractC0244b0
    public k g(l0 l0Var, k kVar) {
        switch (this.f5436t) {
            case 0:
                if ((l0Var.f3759a.d() & 519) != 0) {
                    A1.c cVar = (A1.c) kVar.f5619t;
                    A1.c cVar2 = (A1.c) kVar.f5618s;
                    int i10 = cVar.f462a != cVar2.f462a ? 1 : 0;
                    if (cVar.f463b != cVar2.f463b) {
                        i10 |= 2;
                    }
                    if (cVar.f464c != cVar2.f464c) {
                        i10 |= 4;
                    }
                    if (cVar.f465d != cVar2.f465d) {
                        i10 |= 8;
                    }
                    ((HashMap) this.f5437u).put(l0Var, Integer.valueOf(i10));
                }
                break;
        }
        return kVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(p071g9.a aVar, View view) {
        super(1);
        this.f5437u = aVar;
        this.f5438v = view;
    }
}
