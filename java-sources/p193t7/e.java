package p193t7;

import B0.c;
import H7.C0228b;
import H7.ViewOnClickListenerC0238l;
import I1.I;
import I1.S;
import J7.d;
import U7.b;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.media.session.r;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.ayah.R;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p084i.z;
import p151p.C1256n;

/* JADX INFO: loaded from: classes.dex */
public final class e extends z {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public boolean f22631A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public boolean f22632B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public boolean f22633C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public d f22634D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public boolean f22635E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public r f22636F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public c f22637G;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public BottomSheetBehavior f22638w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public FrameLayout f22639x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public CoordinatorLayout f22640y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public FrameLayout f22641z;

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
        if (this.f22638w == null) {
            g();
        }
        super.cancel();
    }

    public final void g() {
        if (this.f22639x == null) {
            FrameLayout frameLayout = (FrameLayout) View.inflate(getContext(), R.layout.design_bottom_sheet_dialog, null);
            this.f22639x = frameLayout;
            this.f22640y = (CoordinatorLayout) frameLayout.findViewById(R.id.coordinator);
            FrameLayout frameLayout2 = (FrameLayout) this.f22639x.findViewById(R.id.design_bottom_sheet);
            this.f22641z = frameLayout2;
            BottomSheetBehavior bottomSheetBehaviorC = BottomSheetBehavior.C(frameLayout2);
            this.f22638w = bottomSheetBehaviorC;
            c cVar = this.f22637G;
            ArrayList arrayList = bottomSheetBehaviorC.f14686o0;
            if (!arrayList.contains(cVar)) {
                arrayList.add(cVar);
            }
            this.f22638w.J(this.f22631A);
            this.f22636F = new r(this.f22638w, this.f22641z);
        }
    }

    public final FrameLayout i(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        g();
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.f22639x.findViewById(R.id.coordinator);
        if (i10 != 0 && view == null) {
            view = getLayoutInflater().inflate(i10, (ViewGroup) coordinatorLayout, false);
        }
        if (this.f22635E) {
            FrameLayout frameLayout = this.f22641z;
            C1256n c1256n = new C1256n(5, this);
            WeakHashMap weakHashMap = S.f3689a;
            I.m(frameLayout, c1256n);
        }
        this.f22641z.removeAllViews();
        if (layoutParams == null) {
            this.f22641z.addView(view);
        } else {
            this.f22641z.addView(view, layoutParams);
        }
        coordinatorLayout.findViewById(R.id.touch_outside).setOnClickListener(new ViewOnClickListenerC0238l(6, this));
        S.o(this.f22641z, new C0228b(4, this));
        this.f22641z.setOnTouchListener(new b(2));
        return this.f22639x;
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Window window = getWindow();
        if (window != null) {
            boolean z10 = this.f22635E && Color.alpha(window.getNavigationBarColor()) < 255;
            FrameLayout frameLayout = this.f22639x;
            if (frameLayout != null) {
                frameLayout.setFitsSystemWindows(!z10);
            }
            CoordinatorLayout coordinatorLayout = this.f22640y;
            if (coordinatorLayout != null) {
                coordinatorLayout.setFitsSystemWindows(!z10);
            }
            c.d0(window, !z10);
            d dVar = this.f22634D;
            if (dVar != null) {
                dVar.e(window);
            }
        }
        r rVar = this.f22636F;
        if (rVar == null) {
            return;
        }
        if (this.f22631A) {
            rVar.O(false);
            return;
        }
        d dVar2 = (d) rVar.f11364s;
        if (dVar2 != null) {
            dVar2.c((View) rVar.f11366u);
        }
    }

    @Override // p084i.z, p020c.k, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            window.setStatusBarColor(0);
            window.addFlags(Integer.MIN_VALUE);
            window.setLayout(-1, -1);
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        d dVar;
        d dVar2 = this.f22634D;
        if (dVar2 != null) {
            dVar2.e(null);
        }
        r rVar = this.f22636F;
        if (rVar == null || (dVar = (d) rVar.f11364s) == null) {
            return;
        }
        dVar.c((View) rVar.f11366u);
    }

    @Override // p020c.k, android.app.Dialog
    public final void onStart() {
        super.onStart();
        BottomSheetBehavior bottomSheetBehavior = this.f22638w;
        if (bottomSheetBehavior == null || bottomSheetBehavior.f14674c0 != 5) {
            return;
        }
        bottomSheetBehavior.L(4);
    }

    @Override // android.app.Dialog
    public final void setCancelable(boolean z10) {
        r rVar;
        super.setCancelable(z10);
        if (this.f22631A != z10) {
            this.f22631A = z10;
            BottomSheetBehavior bottomSheetBehavior = this.f22638w;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.J(z10);
            }
            if (getWindow() == null || (rVar = this.f22636F) == null) {
                return;
            }
            if (this.f22631A) {
                rVar.O(false);
                return;
            }
            d dVar = (d) rVar.f11364s;
            if (dVar != null) {
                dVar.c((View) rVar.f11366u);
            }
        }
    }

    @Override // android.app.Dialog
    public final void setCanceledOnTouchOutside(boolean z10) {
        super.setCanceledOnTouchOutside(z10);
        if (z10 && !this.f22631A) {
            this.f22631A = true;
        }
        this.f22632B = z10;
        this.f22633C = true;
    }

    @Override // p084i.z, p020c.k, android.app.Dialog
    public final void setContentView(int i10) {
        super.setContentView(i(null, i10, null));
    }

    @Override // p084i.z, p020c.k, android.app.Dialog
    public final void setContentView(View view) {
        super.setContentView(i(view, 0, null));
    }

    @Override // p084i.z, p020c.k, android.app.Dialog
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(i(view, 0, layoutParams));
    }
}
