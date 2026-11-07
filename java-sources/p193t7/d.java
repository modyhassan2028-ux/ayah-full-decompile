package p193t7;

import A1.b;
import F9.n;
import I1.B0;
import I1.C0;
import I1.D0;
import I1.E0;
import I1.F0;
import I1.I;
import I1.S;
import O8.c;
import R7.i;
import Y2.a;
import android.content.res.ColorStateList;
import android.os.Build;
import android.view.View;
import android.view.Window;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class d extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Boolean f22627a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final B0 f22628b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Window f22629c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f22630d;

    public d(View view, B0 b5) {
        ColorStateList colorStateListC;
        this.f22628b = b5;
        i iVar = BottomSheetBehavior.C(view).f14703z;
        if (iVar != null) {
            colorStateListC = iVar.f7325r.f7296c;
        } else {
            WeakHashMap weakHashMap = S.f3689a;
            colorStateListC = I.c(view);
        }
        if (colorStateListC != null) {
            this.f22627a = Boolean.valueOf(a.T(colorStateListC.getDefaultColor()));
            return;
        }
        ColorStateList colorStateListD = b.d(view.getBackground());
        Integer numValueOf = colorStateListD != null ? Integer.valueOf(colorStateListD.getDefaultColor()) : null;
        if (numValueOf != null) {
            this.f22627a = Boolean.valueOf(a.T(numValueOf.intValue()));
        } else {
            this.f22627a = null;
        }
    }

    @Override // p193t7.a
    public final void a(View view) {
        d(view);
    }

    @Override // p193t7.a
    public final void b(View view) {
        d(view);
    }

    @Override // p193t7.a
    public final void c(int i10, View view) {
        d(view);
    }

    public final void d(View view) {
        n d1;
        n d5;
        int top = view.getTop();
        B0 b5 = this.f22628b;
        if (top < b5.d()) {
            Window window = this.f22629c;
            if (window != null) {
                Boolean bool = this.f22627a;
                boolean zBooleanValue = bool == null ? this.f22630d : bool.booleanValue();
                c cVar = new c(window.getDecorView());
                int i10 = Build.VERSION.SDK_INT;
                if (i10 >= 35) {
                    d5 = new F0(window, cVar);
                } else if (i10 >= 30) {
                    d5 = new E0(window, cVar);
                } else {
                    d5 = i10 >= 26 ? new D0(window, cVar) : new C0(window, cVar);
                }
                d5.R(zBooleanValue);
            }
            view.setPadding(view.getPaddingLeft(), b5.d() - view.getTop(), view.getPaddingRight(), view.getPaddingBottom());
            return;
        }
        if (view.getTop() != 0) {
            Window window2 = this.f22629c;
            if (window2 != null) {
                boolean z10 = this.f22630d;
                c cVar2 = new c(window2.getDecorView());
                int i11 = Build.VERSION.SDK_INT;
                if (i11 >= 35) {
                    d1 = new F0(window2, cVar2);
                } else if (i11 >= 30) {
                    d1 = new E0(window2, cVar2);
                } else {
                    d1 = i11 >= 26 ? new D0(window2, cVar2) : new C0(window2, cVar2);
                }
                d1.R(z10);
            }
            view.setPadding(view.getPaddingLeft(), 0, view.getPaddingRight(), view.getPaddingBottom());
        }
    }

    public final void e(Window window) {
        n d1;
        if (this.f22629c == window) {
            return;
        }
        this.f22629c = window;
        if (window != null) {
            c cVar = new c(window.getDecorView());
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 35) {
                d1 = new F0(window, cVar);
            } else if (i10 >= 30) {
                d1 = new E0(window, cVar);
            } else {
                d1 = i10 >= 26 ? new D0(window, cVar) : new C0(window, cVar);
            }
            this.f22630d = d1.F();
        }
    }
}
