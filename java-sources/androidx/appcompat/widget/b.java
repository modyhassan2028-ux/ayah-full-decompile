package androidx.appcompat.widget;

import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class b implements View.OnKeyListener {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ SearchView f11719r;

    public b(SearchView searchView) {
        this.f11719r = searchView;
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
        SearchView searchView = this.f11719r;
        SearchView.SearchAutoComplete searchAutoComplete = searchView.f11592G;
        if (searchView.f11624u0 != null) {
            if (!searchAutoComplete.isPopupShowing() || searchAutoComplete.getListSelection() == -1) {
                if (TextUtils.getTrimmedLength(searchAutoComplete.getText()) != 0 && keyEvent.hasNoModifiers() && keyEvent.getAction() == 1 && i10 == 66) {
                    view.cancelLongPress();
                    searchView.getContext().startActivity(searchView.j("android.intent.action.SEARCH", null, null, searchAutoComplete.getText().toString()));
                    return true;
                }
            } else if (searchView.f11624u0 != null && searchView.f11613j0 != null && keyEvent.getAction() == 0 && keyEvent.hasNoModifiers()) {
                if (i10 == 66 || i10 == 84 || i10 == 61) {
                    searchView.n(searchAutoComplete.getListSelection());
                    return true;
                }
                if (i10 == 21 || i10 == 22) {
                    searchAutoComplete.setSelection(i10 == 21 ? 0 : searchAutoComplete.length());
                    searchAutoComplete.setListSelection(0);
                    searchAutoComplete.clearListSelection();
                    searchAutoComplete.a();
                    return true;
                }
                if (i10 == 19) {
                    searchAutoComplete.getListSelection();
                    return false;
                }
            }
        }
        return false;
    }
}
