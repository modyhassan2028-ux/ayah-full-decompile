package Z2;

import android.database.DataSetObserver;
import androidx.viewpager.widget.PagerTitleStrip;
import androidx.viewpager.widget.ViewPager;

/* JADX INFO: loaded from: classes.dex */
public final class c extends DataSetObserver implements i, h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PagerTitleStrip f10969a;

    public c(PagerTitleStrip pagerTitleStrip) {
        this.f10969a = pagerTitleStrip;
    }

    @Override // Z2.i
    public final void b(int i10, float f3) {
        if (f3 > 0.5f) {
            i10++;
        }
        this.f10969a.c(i10, f3, false);
    }

    @Override // Z2.h
    public final void c(ViewPager viewPager) {
        this.f10969a.a();
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        PagerTitleStrip pagerTitleStrip = this.f10969a;
        int currentItem = pagerTitleStrip.f12994r.getCurrentItem();
        pagerTitleStrip.f12994r.getAdapter();
        pagerTitleStrip.b(currentItem);
        float f3 = pagerTitleStrip.f12999w;
        if (f3 < 0.0f) {
            f3 = 0.0f;
        }
        pagerTitleStrip.c(pagerTitleStrip.f12994r.getCurrentItem(), f3, true);
    }

    @Override // Z2.i
    public final void a(int i10) {
    }
}
