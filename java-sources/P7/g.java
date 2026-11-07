package P7;

import android.view.MotionEvent;
import android.view.View;
import com.google.android.material.search.SearchView;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g implements View.OnTouchListener {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f6731r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f6732s;

    public /* synthetic */ g(int i10, Object obj) {
        this.f6731r = i10;
        this.f6732s = obj;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i10 = this.f6731r;
        Object obj = this.f6732s;
        switch (i10) {
            case 0:
                SearchView searchView = (SearchView) obj;
                int i11 = SearchView.U;
                if (searchView.g()) {
                    searchView.f();
                }
                break;
            default:
                X7.j jVar = (X7.j) obj;
                if (motionEvent.getAction() == 1) {
                    long jCurrentTimeMillis = System.currentTimeMillis() - jVar.f10018o;
                    if (jCurrentTimeMillis < 0 || jCurrentTimeMillis > 300) {
                        jVar.f10016m = false;
                    }
                    jVar.t();
                    jVar.f10016m = true;
                    jVar.f10018o = System.currentTimeMillis();
                }
                break;
        }
        return false;
    }
}
