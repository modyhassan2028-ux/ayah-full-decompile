package p014b3;

import androidx.viewpager2.widget.ViewPager2;

/* JADX INFO: loaded from: classes.dex */
public final class h extends k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13227a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ViewPager2 f13228b;

    public /* synthetic */ h(ViewPager2 viewPager2, int i10) {
        this.f13227a = i10;
        this.f13228b = viewPager2;
    }

    @Override // p014b3.k
    public void a(int i10) {
        switch (this.f13227a) {
            case 0:
                if (i10 == 0) {
                    this.f13228b.e();
                }
                break;
        }
    }

    @Override // p014b3.k
    public final void c(int i10) {
        switch (this.f13227a) {
            case 0:
                ViewPager2 viewPager2 = this.f13228b;
                if (viewPager2.f13052u != i10) {
                    viewPager2.f13052u = i10;
                    viewPager2.f13048K.J();
                }
                break;
            default:
                ViewPager2 viewPager3 = this.f13228b;
                viewPager3.clearFocus();
                if (viewPager3.hasFocus()) {
                    viewPager3.f13038A.requestFocus(2);
                }
                break;
        }
    }
}
