package P7;

import H7.H;
import H7.L;
import H7.M;
import I1.B0;
import I1.r;
import android.view.View;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.search.SearchView;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements L, r {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ SearchView f6728r;

    public /* synthetic */ d(SearchView searchView) {
        this.f6728r = searchView;
    }

    @Override // H7.L
    public B0 n(View view, B0 b5, M m10) {
        MaterialToolbar materialToolbar = this.f6728r.f15154x;
        boolean zL = H.l(materialToolbar);
        materialToolbar.setPadding(b5.b() + (zL ? m10.f3460c : m10.f3458a), m10.f3459b, b5.c() + (zL ? m10.f3458a : m10.f3460c), m10.f3461d);
        return b5;
    }

    @Override // I1.r
    public B0 p(View view, B0 b5) {
        SearchView.e(this.f6728r, b5);
        return b5;
    }
}
