package p014b3;

import E2.AbstractC0135m0;
import android.view.View;
import android.view.ViewParent;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.ayah.MainActivity;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import java.util.Locale;
import p168q6.b;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class d extends k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13209a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f13210b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f13211c;

    public d(j jVar) {
        this.f13210b = jVar;
    }

    @Override // p014b3.k
    public void a(int i10) {
        int i11 = this.f13209a;
    }

    @Override // p014b3.k
    public void b(int i10, float f3, int i11) {
        switch (this.f13209a) {
            case 0:
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) this.f13210b;
                if (((l) this.f13211c) == null) {
                    return;
                }
                float f7 = -f3;
                for (int i12 = 0; i12 < linearLayoutManager.w(); i12++) {
                    View viewV = linearLayoutManager.v(i12);
                    if (viewV == null) {
                        Locale locale = Locale.US;
                        throw new IllegalStateException("LayoutManager returned a null child at pos " + i12 + "/" + linearLayoutManager.w() + " while transforming pages");
                    }
                    float fH = (AbstractC0135m0.H(viewV) - i10) + f7;
                    c cVar = (c) ((l) this.f13211c);
                    cVar.getClass();
                    ViewParent parent = viewV.getParent();
                    ViewParent parent2 = parent.getParent();
                    if (!(parent instanceof RecyclerView) || !(parent2 instanceof ViewPager2)) {
                        throw new IllegalStateException("Expected the page view to be managed by a ViewPager2 instance.");
                    }
                    ViewPager2 viewPager2 = (ViewPager2) parent2;
                    float f10 = cVar.f13208r * fH;
                    if (viewPager2.getOrientation() == 0) {
                        if (viewPager2.b()) {
                            f10 = -f10;
                        }
                        viewV.setTranslationX(f10);
                    } else {
                        viewV.setTranslationY(f10);
                    }
                }
                return;
            default:
                return;
        }
    }

    @Override // p014b3.k
    public final void c(int i10) {
        switch (this.f13209a) {
            case 0:
                return;
            default:
                BottomNavigationView bottomNavigationView = (BottomNavigationView) this.f13210b;
                b bVar = ((MainActivity) this.f13211c).f13638c0;
                if (bVar != null) {
                    bottomNavigationView.setSelectedItemId((int) bVar.b(i10));
                    return;
                } else {
                    j.k("rightAdapter");
                    throw null;
                }
        }
    }

    public d(BottomNavigationView bottomNavigationView, MainActivity mainActivity) {
        this.f13210b = bottomNavigationView;
        this.f13211c = mainActivity;
    }

    private final void d(int i10) {
    }

    private final void e(int i10) {
    }
}
