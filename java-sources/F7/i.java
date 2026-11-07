package F7;

import android.animation.Animator;
import com.ayah.R;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;

/* JADX INFO: loaded from: classes.dex */
public final class i extends b {
    public final /* synthetic */ ExtendedFloatingActionButton g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(ExtendedFloatingActionButton extendedFloatingActionButton, p248z6.c cVar) {
        super(extendedFloatingActionButton, cVar);
        this.g = extendedFloatingActionButton;
    }

    @Override // F7.b
    public final int c() {
        return R.animator.mtrl_extended_fab_show_motion_spec;
    }

    @Override // F7.b
    public final void e() {
        this.f2426d.f24847s = null;
        this.g.f14916K = 0;
    }

    @Override // F7.b
    public final void f(Animator animator) {
        p248z6.c cVar = this.f2426d;
        Animator animator2 = (Animator) cVar.f24847s;
        if (animator2 != null) {
            animator2.cancel();
        }
        cVar.f24847s = animator;
        ExtendedFloatingActionButton extendedFloatingActionButton = this.g;
        extendedFloatingActionButton.setVisibility(0);
        extendedFloatingActionButton.f14916K = 2;
    }

    @Override // F7.b
    public final void g() {
        ExtendedFloatingActionButton extendedFloatingActionButton = this.g;
        extendedFloatingActionButton.setVisibility(0);
        extendedFloatingActionButton.setAlpha(1.0f);
        extendedFloatingActionButton.setScaleY(1.0f);
        extendedFloatingActionButton.setScaleX(1.0f);
    }

    @Override // F7.b
    public final boolean h() {
        f fVar = ExtendedFloatingActionButton.f14912c0;
        ExtendedFloatingActionButton extendedFloatingActionButton = this.g;
        if (extendedFloatingActionButton.getVisibility() != 0) {
            if (extendedFloatingActionButton.f14916K != 2) {
                return false;
            }
        } else if (extendedFloatingActionButton.f14916K == 1) {
            return false;
        }
        return true;
    }
}
