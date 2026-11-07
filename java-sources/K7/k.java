package K7;

import K0.RunnableC0354l;
import android.support.v4.media.session.r;
import android.view.View;
import com.google.android.material.navigation.NavigationView;
import j$.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class k implements Z1.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ NavigationView f5295a;

    public k(NavigationView navigationView) {
        this.f5295a = navigationView;
    }

    @Override // Z1.b
    public final void b(View view) {
        NavigationView navigationView = this.f5295a;
        if (view == navigationView) {
            r rVar = navigationView.f15088L;
            Objects.requireNonNull(rVar);
            view.post(new RunnableC0354l(3, rVar));
        }
    }

    @Override // Z1.b
    public final void c(View view) {
        NavigationView navigationView = this.f5295a;
        if (view == navigationView) {
            r rVar = navigationView.f15088L;
            J7.d dVar = (J7.d) rVar.f11364s;
            if (dVar != null) {
                dVar.c((View) rVar.f11366u);
            }
            if (!navigationView.f15084H || navigationView.f15083G == 0) {
                return;
            }
            navigationView.f15083G = 0;
            navigationView.h(navigationView.getWidth(), navigationView.getHeight());
        }
    }

    @Override // Z1.b
    public final void a(View view) {
    }
}
