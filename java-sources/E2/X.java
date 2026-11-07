package E2;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import com.google.android.material.carousel.CarouselLayoutManager;

/* JADX INFO: loaded from: classes.dex */
public final class X extends Q {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f1628q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f1629r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ X(Object obj, Context context, int i10) {
        super(context);
        this.f1628q = i10;
        this.f1629r = obj;
    }

    @Override // E2.Q
    public int b(View view, int i10) {
        switch (this.f1628q) {
            case 1:
                CarouselLayoutManager carouselLayoutManager = (CarouselLayoutManager) this.f1629r;
                if (carouselLayoutManager.f14756u == null || !carouselLayoutManager.R0()) {
                    return 0;
                }
                int iH = AbstractC0135m0.H(view);
                return (int) (carouselLayoutManager.f14751p - carouselLayoutManager.O0(iH, carouselLayoutManager.N0(iH)));
            default:
                return super.b(view, i10);
        }
    }

    @Override // E2.Q
    public int c(View view, int i10) {
        switch (this.f1628q) {
            case 1:
                CarouselLayoutManager carouselLayoutManager = (CarouselLayoutManager) this.f1629r;
                if (carouselLayoutManager.f14756u == null || carouselLayoutManager.R0()) {
                    return 0;
                }
                int iH = AbstractC0135m0.H(view);
                return (int) (carouselLayoutManager.f14751p - carouselLayoutManager.O0(iH, carouselLayoutManager.N0(iH)));
            default:
                return super.c(view, i10);
        }
    }

    @Override // E2.Q
    public float d(DisplayMetrics displayMetrics) {
        switch (this.f1628q) {
            case 0:
                return 100.0f / displayMetrics.densityDpi;
            default:
                return super.d(displayMetrics);
        }
    }

    @Override // E2.Q
    public int e(int i10) {
        switch (this.f1628q) {
            case 0:
                return Math.min(100, super.e(i10));
            default:
                return super.e(i10);
        }
    }

    @Override // E2.Q
    public PointF f(int i10) {
        switch (this.f1628q) {
            case 1:
                return ((CarouselLayoutManager) this.f1629r).a(i10);
            default:
                return super.f(i10);
        }
    }

    @Override // E2.Q
    public void i(View view, z0 z0Var) {
        switch (this.f1628q) {
            case 0:
                Y y10 = (Y) this.f1629r;
                int[] iArrB = y10.b(y10.f1630a.getLayoutManager(), view);
                int i10 = iArrB[0];
                int i11 = iArrB[1];
                int iCeil = (int) Math.ceil(((double) e(Math.max(Math.abs(i10), Math.abs(i11)))) / 0.3356d);
                if (iCeil > 0) {
                    z0Var.f1825a = i10;
                    z0Var.f1826b = i11;
                    z0Var.f1827c = iCeil;
                    z0Var.f1829e = this.j;
                    z0Var.f1830f = true;
                }
                break;
            default:
                super.i(view, z0Var);
                break;
        }
    }
}
