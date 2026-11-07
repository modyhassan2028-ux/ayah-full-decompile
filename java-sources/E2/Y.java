package E2;

import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class Y extends AbstractC0141p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public RecyclerView f1630a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final I0 f1631b = new I0(this);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public V f1632c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public V f1633d;

    public static int c(View view, W w9) {
        return ((w9.e(view) / 2) + w9.g(view)) - ((w9.n() / 2) + w9.m());
    }

    public static View d(AbstractC0135m0 abstractC0135m0, W w9) {
        int iW = abstractC0135m0.w();
        View view = null;
        if (iW == 0) {
            return null;
        }
        int iN = (w9.n() / 2) + w9.m();
        int i10 = Integer.MAX_VALUE;
        for (int i11 = 0; i11 < iW; i11++) {
            View viewV = abstractC0135m0.v(i11);
            int iAbs = Math.abs(((w9.e(viewV) / 2) + w9.g(viewV)) - iN);
            if (iAbs < i10) {
                view = viewV;
                i10 = iAbs;
            }
        }
        return view;
    }

    public final void a(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f1630a;
        if (recyclerView2 == recyclerView) {
            return;
        }
        I0 i10 = this.f1631b;
        if (recyclerView2 != null) {
            ArrayList arrayList = recyclerView2.f12856A0;
            if (arrayList != null) {
                arrayList.remove(i10);
            }
            this.f1630a.setOnFlingListener(null);
        }
        this.f1630a = recyclerView;
        if (recyclerView != null) {
            if (recyclerView.getOnFlingListener() != null) {
                throw new IllegalStateException("An instance of OnFlingListener already set.");
            }
            this.f1630a.j(i10);
            this.f1630a.setOnFlingListener(this);
            new Scroller(this.f1630a.getContext(), new DecelerateInterpolator());
            h();
        }
    }

    public final int[] b(AbstractC0135m0 abstractC0135m0, View view) {
        int[] iArr = new int[2];
        if (abstractC0135m0.e()) {
            iArr[0] = c(view, f(abstractC0135m0));
        } else {
            iArr[0] = 0;
        }
        if (abstractC0135m0.f()) {
            iArr[1] = c(view, g(abstractC0135m0));
            return iArr;
        }
        iArr[1] = 0;
        return iArr;
    }

    public View e(AbstractC0135m0 abstractC0135m0) {
        if (abstractC0135m0.f()) {
            return d(abstractC0135m0, g(abstractC0135m0));
        }
        if (abstractC0135m0.e()) {
            return d(abstractC0135m0, f(abstractC0135m0));
        }
        return null;
    }

    public final W f(AbstractC0135m0 abstractC0135m0) {
        V v10 = this.f1633d;
        if (v10 == null || ((AbstractC0135m0) v10.f1626b) != abstractC0135m0) {
            this.f1633d = new V(abstractC0135m0, 0);
        }
        return this.f1633d;
    }

    public final W g(AbstractC0135m0 abstractC0135m0) {
        V v10 = this.f1632c;
        if (v10 == null || ((AbstractC0135m0) v10.f1626b) != abstractC0135m0) {
            this.f1632c = new V(abstractC0135m0, 1);
        }
        return this.f1632c;
    }

    public final void h() {
        AbstractC0135m0 layoutManager;
        View viewE;
        RecyclerView recyclerView = this.f1630a;
        if (recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null || (viewE = e(layoutManager)) == null) {
            return;
        }
        int[] iArrB = b(layoutManager, viewE);
        int i10 = iArrB[0];
        if (i10 == 0 && iArrB[1] == 0) {
            return;
        }
        this.f1630a.n0(i10, iArrB[1], false);
    }
}
