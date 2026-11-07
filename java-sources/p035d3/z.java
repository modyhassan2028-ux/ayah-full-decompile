package p035d3;

import A1.c;
import I1.B0;
import I1.r;
import K7.i;
import android.view.MenuItem;
import android.view.View;
import com.ayah.MainActivity;
import com.ayah.ui.widget.search.SearchResultsView;
import com.ayah.ui.widget.search.SearchViewWrapper;
import p053f.b;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class z implements b, r, i {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ MainActivity f15689r;

    public /* synthetic */ z(MainActivity mainActivity) {
        this.f15689r = mainActivity;
    }

    @Override // p053f.b
    public void d(Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        int i10 = MainActivity.f13622J0;
        this.f15689r.w().a(zBooleanValue);
    }

    @Override // I1.r
    public B0 p(View view, B0 b5) {
        int i10 = MainActivity.f13622J0;
        j.e(view, "view");
        c cVarG = b5.f3671a.g(8);
        j.d(cVarG, "getInsets(...)");
        int i11 = cVarG.f465d;
        SearchResultsView searchResultsView = view instanceof SearchResultsView ? (SearchResultsView) view : null;
        if (searchResultsView != null) {
            searchResultsView.setImeInsets(i11);
        }
        MenuItem menuItem = this.f15689r.f13653r0;
        View actionView = menuItem != null ? menuItem.getActionView() : null;
        SearchViewWrapper searchViewWrapper = actionView instanceof SearchViewWrapper ? (SearchViewWrapper) actionView : null;
        if (searchViewWrapper != null) {
            searchViewWrapper.setImeInsets$app_release(i11);
        }
        return b5;
    }
}
