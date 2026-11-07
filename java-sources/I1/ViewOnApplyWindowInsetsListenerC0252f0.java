package I1;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.view.animation.Interpolator;
import j$.util.Objects;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: I1.f0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnApplyWindowInsetsListenerC0252f0 implements View.OnApplyWindowInsetsListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractC0244b0 f3730a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public B0 f3731b;

    public ViewOnApplyWindowInsetsListenerC0252f0(View view, AbstractC0244b0 abstractC0244b0) {
        B0 b0B;
        this.f3730a = abstractC0244b0;
        WeakHashMap weakHashMap = S.f3689a;
        B0 b0A = J.a(view);
        if (b0A != null) {
            int i10 = Build.VERSION.SDK_INT;
            b0B = (i10 >= 34 ? new q0(b0A) : i10 >= 30 ? new p0(b0A) : i10 >= 29 ? new o0(b0A) : new m0(b0A)).b();
        } else {
            b0B = null;
        }
        this.f3731b = b0B;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        Interpolator interpolator;
        if (!view.isLaidOut()) {
            this.f3731b = B0.h(view, windowInsets);
            return C0254g0.j(view, windowInsets);
        }
        B0 b0H = B0.h(view, windowInsets);
        y0 y0Var = b0H.f3671a;
        if (this.f3731b == null) {
            WeakHashMap weakHashMap = S.f3689a;
            this.f3731b = J.a(view);
        }
        if (this.f3731b == null) {
            this.f3731b = b0H;
            return C0254g0.j(view, windowInsets);
        }
        AbstractC0244b0 abstractC0244b0K = C0254g0.k(view);
        if (abstractC0244b0K != null && Objects.equals((B0) abstractC0244b0K.f3713s, b0H)) {
            return C0254g0.j(view, windowInsets);
        }
        int[] iArr = new int[1];
        int[] iArr2 = new int[1];
        B0 b5 = this.f3731b;
        int i10 = 1;
        while (i10 <= 512) {
            A1.c cVarG = y0Var.g(i10);
            A1.c cVarG2 = b5.f3671a.g(i10);
            int i11 = cVarG.f462a;
            int i12 = cVarG.f465d;
            int i13 = cVarG.f464c;
            int i14 = cVarG.f463b;
            int i15 = cVarG2.f462a;
            int i16 = cVarG2.f465d;
            int i17 = cVarG2.f464c;
            int i18 = cVarG2.f463b;
            boolean z10 = i11 > i15 || i14 > i18 || i13 > i17 || i12 > i16;
            if (z10 != (i11 < i15 || i14 < i18 || i13 < i17 || i12 < i16)) {
                if (z10) {
                    iArr[0] = iArr[0] | i10;
                } else {
                    iArr2[0] = iArr2[0] | i10;
                }
            }
            i10 <<= 1;
            iArr = iArr;
        }
        int i19 = 0;
        int i20 = iArr[0];
        int i21 = iArr2[0];
        int i22 = i20 | i21;
        if (i22 == 0) {
            this.f3731b = b0H;
            return C0254g0.j(view, windowInsets);
        }
        B0 b10 = this.f3731b;
        if ((i20 & 8) != 0) {
            interpolator = C0254g0.f3738e;
        } else if ((i21 & 8) != 0) {
            interpolator = C0254g0.f3739f;
        } else if ((i20 & 519) != 0) {
            interpolator = C0254g0.g;
        } else {
            interpolator = (i21 & 519) != 0 ? C0254g0.f3740h : null;
        }
        l0 l0Var = new l0(i22, interpolator, (i22 & 8) != 0 ? 160L : 250L);
        l0Var.f3759a.e(0.0f);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(l0Var.f3759a.b());
        A1.c cVarG3 = y0Var.g(i22);
        A1.c cVarG4 = b10.f3671a.g(i22);
        int iMin = Math.min(cVarG3.f462a, cVarG4.f462a);
        int i23 = cVarG3.f463b;
        int i24 = cVarG4.f463b;
        int iMin2 = Math.min(i23, i24);
        int i25 = cVarG3.f464c;
        int i26 = cVarG4.f464c;
        int iMin3 = Math.min(i25, i26);
        int i27 = cVarG3.f465d;
        int i28 = cVarG4.f465d;
        M.k kVar = new M.k(21, A1.c.c(iMin, iMin2, iMin3, Math.min(i27, i28)), A1.c.c(Math.max(cVarG3.f462a, cVarG4.f462a), Math.max(i23, i24), Math.max(i25, i26), Math.max(i27, i28)));
        C0254g0.g(view, l0Var, b0H, false);
        duration.addUpdateListener(new C0246c0(l0Var, b0H, b10, i22, view));
        duration.addListener(new C0248d0(i19, l0Var, view));
        ViewTreeObserverOnPreDrawListenerC0266t.a(view, new RunnableC0250e0(view, l0Var, kVar, duration, 0));
        this.f3731b = b0H;
        return C0254g0.j(view, windowInsets);
    }
}
