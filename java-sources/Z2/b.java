package Z2;

import android.view.View;
import androidx.viewpager.widget.PagerTabStrip;
import androidx.viewpager.widget.ViewPager;

/* JADX INFO: loaded from: classes.dex */
public final class b implements View.OnClickListener {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f10967r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ PagerTabStrip f10968s;

    public /* synthetic */ b(PagerTabStrip pagerTabStrip, int i10) {
        this.f10967r = i10;
        this.f10968s = pagerTabStrip;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f10967r) {
            case 0:
                ViewPager viewPager = this.f10968s.f12994r;
                viewPager.setCurrentItem(viewPager.getCurrentItem() - 1);
                break;
            default:
                ViewPager viewPager2 = this.f10968s.f12994r;
                viewPager2.setCurrentItem(viewPager2.getCurrentItem() + 1);
                break;
        }
    }
}
