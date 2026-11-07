package p014b3;

import Aa.a;
import E2.AbstractC0119e0;
import androidx.viewpager2.widget.ViewPager2;

/* JADX INFO: loaded from: classes.dex */
public final class g extends AbstractC0119e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13225a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f13226b;

    public /* synthetic */ g(int i10, Object obj) {
        this.f13225a = i10;
        this.f13226b = obj;
    }

    @Override // E2.AbstractC0119e0
    public final void a() {
        switch (this.f13225a) {
            case 0:
                ViewPager2 viewPager2 = (ViewPager2) this.f13226b;
                viewPager2.f13053v = true;
                viewPager2.f13040C.f13224l = true;
                break;
            default:
                ((a) this.f13226b).J();
                break;
        }
    }

    @Override // E2.AbstractC0119e0
    public final void b(int i10, int i11, Object obj) {
        a();
    }

    @Override // E2.AbstractC0119e0
    public final void c(int i10, int i11) {
        a();
    }

    @Override // E2.AbstractC0119e0
    public final void d(int i10, int i11) {
        a();
    }

    @Override // E2.AbstractC0119e0
    public final void e(int i10, int i11) {
        a();
    }
}
