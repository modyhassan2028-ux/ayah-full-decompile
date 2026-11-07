package androidx.appcompat.widget;

import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Intent;
import android.util.Log;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class a implements View.OnClickListener {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ SearchView f11718r;

    public a(SearchView searchView) {
        this.f11718r = searchView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        SearchView searchView = this.f11718r;
        SearchView.SearchAutoComplete searchAutoComplete = searchView.f11592G;
        if (view == searchView.f11596K) {
            searchView.w(false);
            searchAutoComplete.requestFocus();
            searchAutoComplete.setImeVisibility(true);
            View.OnClickListener onClickListener = searchView.f11610g0;
            if (onClickListener != null) {
                onClickListener.onClick(searchView);
                return;
            }
            return;
        }
        if (view == searchView.f11598M) {
            searchView.m();
            return;
        }
        if (view == searchView.f11597L) {
            searchView.q();
            return;
        }
        if (view != searchView.f11599N) {
            if (view == searchAutoComplete) {
                searchView.l();
                return;
            }
            return;
        }
        SearchableInfo searchableInfo = searchView.f11624u0;
        if (searchableInfo == null) {
            return;
        }
        try {
            if (!searchableInfo.getVoiceSearchLaunchWebSearch()) {
                if (searchableInfo.getVoiceSearchLaunchRecognizer()) {
                    searchView.getContext().startActivity(searchView.k(searchView.f11606c0, searchableInfo));
                }
            } else {
                Intent intent = new Intent(searchView.f11605b0);
                ComponentName searchActivity = searchableInfo.getSearchActivity();
                intent.putExtra("calling_package", searchActivity == null ? null : searchActivity.flattenToShortString());
                searchView.getContext().startActivity(intent);
            }
        } catch (ActivityNotFoundException unused) {
            Log.w("SearchView", "Could not find voice search activity");
        }
    }
}
