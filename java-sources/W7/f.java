package W7;

import Z2.i;
import com.google.android.material.tabs.TabLayout;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class f implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference f9650a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f9651b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f9652c;

    public f(TabLayout tabLayout) {
        this.f9650a = new WeakReference(tabLayout);
    }

    @Override // Z2.i
    public final void a(int i10) {
        this.f9651b = this.f9652c;
        this.f9652c = i10;
        TabLayout tabLayout = (TabLayout) this.f9650a.get();
        if (tabLayout != null) {
            tabLayout.f15233m0 = this.f9652c;
        }
    }

    @Override // Z2.i
    public final void b(int i10, float f3) {
        TabLayout tabLayout = (TabLayout) this.f9650a.get();
        if (tabLayout != null) {
            int i11 = this.f9652c;
            boolean z10 = true;
            if (i11 == 2 && this.f9651b != 1) {
                z10 = false;
            }
            if (i11 == 2 && this.f9651b == 0) {
                z10 = false;
            }
            tabLayout.i(i10, f3, z10, z10, false);
        }
    }
}
