package I1;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.animation.PathInterpolator;
import java.util.Collections;

/* JADX INFO: renamed from: I1.c0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0246c0 implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l0 f3715a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ B0 f3716b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ B0 f3717c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3718d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ View f3719e;

    public C0246c0(l0 l0Var, B0 b5, B0 b10, int i10, View view) {
        this.f3715a = l0Var;
        this.f3716b = b5;
        this.f3717c = b10;
        this.f3718d = i10;
        this.f3719e = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        r0 o0Var;
        float animatedFraction = valueAnimator.getAnimatedFraction();
        l0 l0Var = this.f3715a;
        k0 k0Var = l0Var.f3759a;
        k0Var.e(animatedFraction);
        B0 b5 = this.f3716b;
        y0 y0Var = b5.f3671a;
        float fC = k0Var.c();
        PathInterpolator pathInterpolator = C0254g0.f3738e;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 34) {
            o0Var = new q0(b5);
        } else if (i10 >= 30) {
            o0Var = new p0(b5);
        } else {
            o0Var = i10 >= 29 ? new o0(b5) : new m0(b5);
        }
        for (int i11 = 1; i11 <= 512; i11 <<= 1) {
            if ((this.f3718d & i11) == 0) {
                o0Var.c(i11, y0Var.g(i11));
            } else {
                A1.c cVarG = y0Var.g(i11);
                A1.c cVarG2 = this.f3717c.f3671a.g(i11);
                float f3 = 1.0f - fC;
                o0Var.c(i11, B0.e(cVarG, (int) (((double) ((cVarG.f462a - cVarG2.f462a) * f3)) + 0.5d), (int) (((double) ((cVarG.f463b - cVarG2.f463b) * f3)) + 0.5d), (int) (((double) ((cVarG.f464c - cVarG2.f464c) * f3)) + 0.5d), (int) (((double) ((cVarG.f465d - cVarG2.f465d) * f3)) + 0.5d)));
            }
        }
        C0254g0.h(this.f3719e, o0Var.b(), Collections.singletonList(l0Var));
    }
}
