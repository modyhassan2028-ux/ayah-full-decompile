package p193t7;

import I1.AbstractC0244b0;
import I1.B0;
import I1.l0;
import M.k;
import android.view.View;
import java.util.Iterator;
import java.util.List;
import p137n7.a;

/* JADX INFO: loaded from: classes.dex */
public final class f extends AbstractC0244b0 {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final View f22642t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f22643u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f22644v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int[] f22645w;

    public f(View view) {
        super(0);
        this.f22645w = new int[2];
        this.f22642t = view;
    }

    @Override // I1.AbstractC0244b0
    public final void d(l0 l0Var) {
        this.f22642t.setTranslationY(0.0f);
    }

    @Override // I1.AbstractC0244b0
    public final void e(l0 l0Var) {
        View view = this.f22642t;
        int[] iArr = this.f22645w;
        view.getLocationOnScreen(iArr);
        this.f22643u = iArr[1];
    }

    @Override // I1.AbstractC0244b0
    public final B0 f(B0 b5, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            l0 l0Var = (l0) it.next();
            if ((l0Var.f3759a.d() & 8) != 0) {
                this.f22642t.setTranslationY(a.c(this.f22644v, l0Var.f3759a.c(), 0));
                break;
            }
        }
        return b5;
    }

    @Override // I1.AbstractC0244b0
    public final k g(l0 l0Var, k kVar) {
        View view = this.f22642t;
        int[] iArr = this.f22645w;
        view.getLocationOnScreen(iArr);
        int i10 = this.f22643u - iArr[1];
        this.f22644v = i10;
        view.setTranslationY(i10);
        return kVar;
    }
}
