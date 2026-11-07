package F7;

import android.animation.Animator;
import com.ayah.R;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;

/* JADX INFO: loaded from: classes.dex */
public final class h extends b {
    public boolean g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ExtendedFloatingActionButton f2450h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(ExtendedFloatingActionButton extendedFloatingActionButton, p248z6.c cVar) {
        super(extendedFloatingActionButton, cVar);
        this.f2450h = extendedFloatingActionButton;
    }

    @Override // F7.b
    public final int c() {
        return R.animator.mtrl_extended_fab_hide_motion_spec;
    }

    @Override // F7.b
    public final void d() {
        super.d();
        this.g = true;
    }

    @Override // F7.b
    public final void e() {
        this.f2426d.f24847s = null;
        ExtendedFloatingActionButton extendedFloatingActionButton = this.f2450h;
        extendedFloatingActionButton.f14916K = 0;
        if (this.g) {
            return;
        }
        extendedFloatingActionButton.setVisibility(8);
    }

    @Override // F7.b
    public final void f(Animator animator) {
        p248z6.c cVar = this.f2426d;
        Animator animator2 = (Animator) cVar.f24847s;
        if (animator2 != null) {
            animator2.cancel();
        }
        cVar.f24847s = animator;
        this.g = false;
        ExtendedFloatingActionButton extendedFloatingActionButton = this.f2450h;
        extendedFloatingActionButton.setVisibility(0);
        extendedFloatingActionButton.f14916K = 1;
    }

    @Override // F7.b
    public final void g() {
        this.f2450h.setVisibility(8);
    }

    @Override // F7.b
    public final boolean h() {
        f fVar = ExtendedFloatingActionButton.f14912c0;
        ExtendedFloatingActionButton extendedFloatingActionButton = this.f2450h;
        if (extendedFloatingActionButton.getVisibility() == 0) {
            if (extendedFloatingActionButton.f14916K != 1) {
                return false;
            }
        } else if (extendedFloatingActionButton.f14916K == 2) {
            return false;
        }
        return true;
    }
}
