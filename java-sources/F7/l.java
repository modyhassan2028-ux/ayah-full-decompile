package F7;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

/* JADX INFO: loaded from: classes.dex */
public final class l extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f2453a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f2454b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ M.k f2455c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u f2456d;

    public l(u uVar, boolean z10, M.k kVar) {
        this.f2456d = uVar;
        this.f2454b = z10;
        this.f2455c = kVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f2453a = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        u uVar = this.f2456d;
        uVar.f2511r = 0;
        uVar.f2505l = null;
        if (this.f2453a) {
            return;
        }
        FloatingActionButton floatingActionButton = uVar.f2515v;
        boolean z10 = this.f2454b;
        floatingActionButton.a(z10 ? 8 : 4, z10);
        M.k kVar = this.f2455c;
        if (kVar != null) {
            ((p000a.a) kVar.f5618s).V((FloatingActionButton) kVar.f5619t);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        u uVar = this.f2456d;
        uVar.f2515v.a(0, this.f2454b);
        uVar.f2511r = 1;
        uVar.f2505l = animator;
        this.f2453a = false;
    }
}
