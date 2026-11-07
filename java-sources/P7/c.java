package P7;

import I1.G0;
import I1.S;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import com.google.android.material.search.SearchBar;
import com.google.android.material.search.SearchView;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements Runnable {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f6726r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ SearchView f6727s;

    public /* synthetic */ c(SearchView searchView, int i10) {
        this.f6726r = i10;
        this.f6727s = searchView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        G0 g0H;
        G0 g0H2;
        switch (this.f6726r) {
            case 0:
                SearchView searchView = this.f6727s;
                EditText editText = searchView.f15132A;
                if (editText.requestFocus()) {
                    editText.sendAccessibilityEvent(8);
                }
                if (searchView.Q && (g0H = S.h(editText)) != null) {
                    g0H.f3681a.T(8);
                } else {
                    ((InputMethodManager) editText.getContext().getSystemService(InputMethodManager.class)).showSoftInput(editText, 1);
                }
                break;
            case 1:
                this.f6727s.k();
                break;
            case 2:
                SearchView searchView2 = this.f6727s;
                EditText editText2 = searchView2.f15132A;
                editText2.clearFocus();
                SearchBar searchBar = searchView2.f15142K;
                if (searchBar != null) {
                    searchBar.requestFocus();
                }
                if (searchView2.Q && (g0H2 = S.h(editText2)) != null) {
                    g0H2.f3681a.E(8);
                } else {
                    InputMethodManager inputMethodManager = (InputMethodManager) editText2.getContext().getSystemService(InputMethodManager.class);
                    if (inputMethodManager != null) {
                        inputMethodManager.hideSoftInputFromWindow(editText2.getWindowToken(), 0);
                    }
                }
                break;
            default:
                this.f6727s.i();
                break;
        }
    }
}
