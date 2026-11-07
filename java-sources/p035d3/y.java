package p035d3;

import android.view.MenuItem;
import android.view.View;
import com.ayah.MainActivity;
import com.ayah.feature.picker.book.view.ChooseBookPage;
import p056f2.C0949w;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class y implements View.OnClickListener {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f15687r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ MainActivity f15688s;

    public /* synthetic */ y(MainActivity mainActivity, int i10) {
        this.f15687r = i10;
        this.f15688s = mainActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10 = this.f15687r;
        MainActivity mainActivity = this.f15688s;
        switch (i10) {
            case 0:
                int i11 = MainActivity.f13622J0;
                new ChooseBookPage().V(((C0949w) mainActivity.f12591L.f9953r).f16175u, "chooseBook");
                break;
            case 1:
                MenuItem menuItem = mainActivity.f13653r0;
                if (menuItem != null) {
                    menuItem.collapseActionView();
                }
                break;
            default:
                int i12 = MainActivity.f13622J0;
                mainActivity.C();
                break;
        }
    }
}
