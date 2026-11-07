package p035d3;

import N9.k0;
import Z1.b;
import android.view.View;
import androidx.drawerlayout.widget.DrawerLayout;
import com.ayah.MainActivity;
import p025c4.a;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class F implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ E f15588a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MainActivity f15589b;

    public F(E e10, MainActivity mainActivity) {
        this.f15588a = e10;
        this.f15589b = mainActivity;
    }

    @Override // Z1.b
    public final void a(View view) {
        j.e(view, "view");
    }

    @Override // Z1.b
    public final void b(View view) {
        j.e(view, "view");
        this.f15588a.e(true);
        MainActivity mainActivity = this.f15589b;
        a aVar = mainActivity.f13624B0;
        if (aVar == null) {
            j.k("drawerVisibilityModel");
            throw null;
        }
        k0 k0Var = aVar.f13460a;
        Boolean bool = Boolean.TRUE;
        k0Var.getClass();
        k0Var.n(null, bool);
        p211v6.a aVar2 = mainActivity.f13639d0;
        if (aVar2 != null) {
            aVar2.d();
        } else {
            j.k("systemUiHelper");
            throw null;
        }
    }

    @Override // Z1.b
    public final void c(View view) {
        j.e(view, "view");
        this.f15588a.e(false);
        MainActivity mainActivity = this.f15589b;
        a aVar = mainActivity.f13624B0;
        if (aVar == null) {
            j.k("drawerVisibilityModel");
            throw null;
        }
        k0 k0Var = aVar.f13460a;
        Boolean bool = Boolean.FALSE;
        k0Var.getClass();
        k0Var.n(null, bool);
        p211v6.a aVar2 = mainActivity.f13639d0;
        if (aVar2 == null) {
            j.k("systemUiHelper");
            throw null;
        }
        if (aVar2.a()) {
            return;
        }
        DrawerLayout drawerLayout = mainActivity.f13634Y;
        if (drawerLayout != null) {
            drawerLayout.setDrawerLockMode(1);
        } else {
            j.k("drawerLayout");
            throw null;
        }
    }
}
