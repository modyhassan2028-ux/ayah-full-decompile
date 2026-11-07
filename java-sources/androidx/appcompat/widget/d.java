package androidx.appcompat.widget;

import android.view.inputmethod.InputMethodManager;

/* JADX INFO: loaded from: classes.dex */
public final class d implements Runnable {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ SearchView.SearchAutoComplete f11720r;

    public d(SearchView.SearchAutoComplete searchAutoComplete) {
        this.f11720r = searchAutoComplete;
    }

    @Override // java.lang.Runnable
    public final void run() {
        SearchView.SearchAutoComplete searchAutoComplete = this.f11720r;
        if (searchAutoComplete.f11631x) {
            ((InputMethodManager) searchAutoComplete.getContext().getSystemService("input_method")).showSoftInput(searchAutoComplete, 0);
            searchAutoComplete.f11631x = false;
        }
    }
}
