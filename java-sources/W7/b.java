package W7;

import Z2.h;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;

/* JADX INFO: loaded from: classes.dex */
public final class b implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TabLayout f9646a;

    public b(TabLayout tabLayout) {
        this.f9646a = tabLayout;
    }

    @Override // Z2.h
    public final void c(ViewPager viewPager) {
        TabLayout tabLayout = this.f9646a;
        if (tabLayout.f15229i0 == viewPager) {
            tabLayout.g();
        }
    }
}
