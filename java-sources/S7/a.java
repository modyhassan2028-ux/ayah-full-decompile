package S7;

import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.sidesheet.SideSheetBehavior;

/* JADX INFO: loaded from: classes.dex */
public final class a extends B0.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f7514d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final SideSheetBehavior f7515e;

    public /* synthetic */ a(SideSheetBehavior sideSheetBehavior, int i10) {
        this.f7514d = i10;
        this.f7515e = sideSheetBehavior;
    }

    @Override // B0.c
    public final int B(ViewGroup.MarginLayoutParams marginLayoutParams) {
        switch (this.f7514d) {
            case 0:
                return marginLayoutParams.leftMargin;
            default:
                return marginLayoutParams.rightMargin;
        }
    }

    @Override // B0.c
    public final int E() {
        switch (this.f7514d) {
            case 0:
                SideSheetBehavior sideSheetBehavior = this.f7515e;
                return Math.max(0, sideSheetBehavior.f15161E + sideSheetBehavior.f15162F);
            default:
                SideSheetBehavior sideSheetBehavior2 = this.f7515e;
                return Math.max(0, (sideSheetBehavior2.f15160D - sideSheetBehavior2.f15159C) - sideSheetBehavior2.f15162F);
        }
    }

    @Override // B0.c
    public final int G() {
        switch (this.f7514d) {
            case 0:
                SideSheetBehavior sideSheetBehavior = this.f7515e;
                return (-sideSheetBehavior.f15159C) - sideSheetBehavior.f15162F;
            default:
                return this.f7515e.f15160D;
        }
    }

    @Override // B0.c
    public final int I() {
        switch (this.f7514d) {
            case 0:
                return this.f7515e.f15162F;
            default:
                return this.f7515e.f15160D;
        }
    }

    @Override // B0.c
    public final int J() {
        switch (this.f7514d) {
            case 0:
                return -this.f7515e.f15159C;
            default:
                return E();
        }
    }

    @Override // B0.c
    public final int K(View view) {
        switch (this.f7514d) {
            case 0:
                return view.getRight() + this.f7515e.f15162F;
            default:
                return view.getLeft() - this.f7515e.f15162F;
        }
    }

    @Override // B0.c
    public final int L(CoordinatorLayout coordinatorLayout) {
        switch (this.f7514d) {
            case 0:
                return coordinatorLayout.getLeft();
            default:
                return coordinatorLayout.getRight();
        }
    }

    @Override // B0.c
    public final int N() {
        switch (this.f7514d) {
            case 0:
                return 1;
            default:
                return 0;
        }
    }

    @Override // B0.c
    public final boolean S(float f3) {
        switch (this.f7514d) {
            case 0:
                return f3 > 0.0f;
            default:
                return f3 < 0.0f;
        }
    }

    @Override // B0.c
    public final boolean T(View view) {
        switch (this.f7514d) {
            case 0:
                return view.getRight() < (E() - G()) / 2;
            default:
                return view.getLeft() > (E() + this.f7515e.f15160D) / 2;
        }
    }

    @Override // B0.c
    public final boolean U(float f3, float f7) {
        switch (this.f7514d) {
            case 0:
                return Math.abs(f3) > Math.abs(f7) && Math.abs(f3) > ((float) 500);
            default:
                return Math.abs(f3) > Math.abs(f7) && Math.abs(f3) > ((float) 500);
        }
    }

    @Override // B0.c
    public final int d(ViewGroup.MarginLayoutParams marginLayoutParams) {
        switch (this.f7514d) {
            case 0:
                return marginLayoutParams.leftMargin;
            default:
                return marginLayoutParams.rightMargin;
        }
    }

    @Override // B0.c
    public final float e(int i10) {
        switch (this.f7514d) {
            case 0:
                float fG = G();
                return (i10 - fG) / (E() - fG);
            default:
                float f3 = this.f7515e.f15160D;
                return (f3 - i10) / (f3 - E());
        }
    }

    @Override // B0.c
    public final boolean f0(View view, float f3) {
        switch (this.f7514d) {
            case 0:
                float left = view.getLeft();
                SideSheetBehavior sideSheetBehavior = this.f7515e;
                float fAbs = Math.abs((f3 * sideSheetBehavior.f15158B) + left);
                sideSheetBehavior.getClass();
                return fAbs > 0.5f;
            default:
                float right = view.getRight();
                SideSheetBehavior sideSheetBehavior2 = this.f7515e;
                float fAbs2 = Math.abs((f3 * sideSheetBehavior2.f15158B) + right);
                sideSheetBehavior2.getClass();
                return fAbs2 > 0.5f;
        }
    }

    @Override // B0.c
    public final void j0(ViewGroup.MarginLayoutParams marginLayoutParams, int i10) {
        switch (this.f7514d) {
            case 0:
                marginLayoutParams.leftMargin = i10;
                break;
            default:
                marginLayoutParams.rightMargin = i10;
                break;
        }
    }

    @Override // B0.c
    public final void k0(ViewGroup.MarginLayoutParams marginLayoutParams, int i10, int i11) {
        switch (this.f7514d) {
            case 0:
                if (i10 <= this.f7515e.f15160D) {
                    marginLayoutParams.leftMargin = i11;
                }
                break;
            default:
                int i12 = this.f7515e.f15160D;
                if (i10 <= i12) {
                    marginLayoutParams.rightMargin = i12 - i10;
                }
                break;
        }
    }
}
