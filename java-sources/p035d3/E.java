package p035d3;

import android.view.View;
import android.view.ViewGroup;
import androidx.drawerlayout.widget.DrawerLayout;
import com.ayah.MainActivity;
import p020c.x;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class E extends x {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f15586d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ MainActivity f15587e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ E(MainActivity mainActivity, int i10) {
        super(false);
        this.f15586d = i10;
        this.f15587e = mainActivity;
    }

    @Override // p020c.x
    public final void b() {
        switch (this.f15586d) {
            case 0:
                MainActivity mainActivity = this.f15587e;
                ViewGroup viewGroup = mainActivity.f13641f0;
                if (viewGroup == null) {
                    j.k("dialogViewArea");
                    throw null;
                }
                if (viewGroup.getChildCount() != 0) {
                    mainActivity.C();
                    return;
                }
                return;
            default:
                MainActivity mainActivity2 = this.f15587e;
                DrawerLayout drawerLayout = mainActivity2.f13634Y;
                if (drawerLayout == null) {
                    j.k("drawerLayout");
                    throw null;
                }
                View viewE = drawerLayout.e(8388611);
                if (!(viewE != null ? DrawerLayout.k(viewE) : false)) {
                    DrawerLayout drawerLayout2 = mainActivity2.f13634Y;
                    if (drawerLayout2 == null) {
                        j.k("drawerLayout");
                        throw null;
                    }
                    View viewE2 = drawerLayout2.e(8388613);
                    if (!(viewE2 != null ? DrawerLayout.k(viewE2) : false)) {
                        return;
                    }
                }
                DrawerLayout drawerLayout3 = mainActivity2.f13634Y;
                if (drawerLayout3 != null) {
                    drawerLayout3.d(false);
                    return;
                } else {
                    j.k("drawerLayout");
                    throw null;
                }
        }
    }
}
