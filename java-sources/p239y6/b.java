package p239y6;

import E2.r0;
import F9.n;
import I1.C0;
import I1.D0;
import I1.E0;
import I1.F0;
import O8.c;
import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.Window;
import androidx.recyclerview.widget.RecyclerView;
import com.ayah.ui.widget.search.SearchResultsView;
import p181s2.A;

/* JADX INFO: loaded from: classes.dex */
public final class b extends r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SearchResultsView f24654a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f24655b;

    public b(SearchResultsView searchResultsView, Context context) {
        this.f24654a = searchResultsView;
        this.f24655b = context;
    }

    @Override // E2.r0
    public final void a(RecyclerView recyclerView, int i10) {
        n d1;
        SearchResultsView searchResultsView = this.f24654a;
        if (!searchResultsView.f13968z || i10 != 1) {
            if (i10 == 0) {
                searchResultsView.f13968z = true;
                return;
            }
            return;
        }
        Activity activityE = A.e(this.f24655b);
        if (activityE != null) {
            Window window = activityE.getWindow();
            c cVar = new c((View) recyclerView);
            int i11 = Build.VERSION.SDK_INT;
            if (i11 >= 35) {
                d1 = new F0(window, cVar);
            } else if (i11 >= 30) {
                d1 = new E0(window, cVar);
            } else {
                d1 = i11 >= 26 ? new D0(window, cVar) : new C0(window, cVar);
            }
            d1.E(8);
        }
        searchResultsView.f13968z = false;
    }
}
