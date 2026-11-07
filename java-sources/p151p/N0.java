package p151p;

import android.view.View;
import androidx.appcompat.widget.SearchView;

/* JADX INFO: loaded from: classes.dex */
public final class N0 implements View.OnFocusChangeListener {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ SearchView f20580r;

    public N0(SearchView searchView) {
        this.f20580r = searchView;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z10) {
        SearchView searchView = this.f20580r;
        View.OnFocusChangeListener onFocusChangeListener = searchView.f11609f0;
        if (onFocusChangeListener != null) {
            onFocusChangeListener.onFocusChange(searchView, z10);
        }
    }
}
