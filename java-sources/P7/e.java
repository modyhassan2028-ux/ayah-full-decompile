package P7;

import android.view.View;
import com.google.android.material.search.SearchView;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e implements View.OnClickListener {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f6729r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ SearchView f6730s;

    public /* synthetic */ e(SearchView searchView, int i10) {
        this.f6729r = i10;
        this.f6730s = searchView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10 = this.f6729r;
        SearchView searchView = this.f6730s;
        switch (i10) {
            case 0:
                int i11 = SearchView.U;
                searchView.k();
                break;
            case 1:
                int i12 = SearchView.U;
                if (!searchView.S.equals(j.f6738s) && !searchView.S.equals(j.f6737r)) {
                    searchView.f15137F.l();
                    break;
                }
                break;
            default:
                searchView.f15132A.setText("");
                searchView.i();
                break;
        }
    }
}
