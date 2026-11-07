package I1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.drawerlayout.widget.DrawerLayout;
import com.google.android.material.navigation.NavigationView;
import u.C1350e;

/* JADX INFO: renamed from: I1.d0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0248d0 extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3720a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3721b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f3722c;

    public /* synthetic */ C0248d0(int i10, Object obj, Object obj2) {
        this.f3720a = i10;
        this.f3721b = obj;
        this.f3722c = obj2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f3720a) {
            case 0:
                l0 l0Var = (l0) this.f3721b;
                l0Var.f3759a.e(1.0f);
                C0254g0.f((View) this.f3722c, l0Var);
                break;
            case 1:
                DrawerLayout drawerLayout = (DrawerLayout) this.f3721b;
                drawerLayout.c((NavigationView) this.f3722c, false);
                drawerLayout.setScrimColor(-1728053248);
                break;
            case 2:
                ((C1350e) this.f3721b).remove(animator);
                ((W2.p) this.f3722c).f9559E.remove(animator);
                break;
            default:
                ((p249z7.e) this.f3721b).setCircularRevealOverlayDrawable(null);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f3720a) {
            case 2:
                ((W2.p) this.f3722c).f9559E.add(animator);
                break;
            case 3:
                ((p249z7.e) this.f3721b).setCircularRevealOverlayDrawable((Drawable) this.f3722c);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public C0248d0(W2.p pVar, C1350e c1350e) {
        this.f3720a = 2;
        this.f3722c = pVar;
        this.f3721b = c1350e;
    }
}
