package I1;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import j$.util.Objects;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class B0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final B0 f3670b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y0 f3671a;

    static {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 34) {
            f3670b = x0.f3793s;
        } else if (i10 >= 30) {
            f3670b = w0.f3791r;
        } else {
            f3670b = y0.f3796b;
        }
    }

    public B0(WindowInsets windowInsets) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 34) {
            this.f3671a = new x0(this, windowInsets);
            return;
        }
        if (i10 >= 30) {
            this.f3671a = new w0(this, windowInsets);
            return;
        }
        if (i10 >= 29) {
            this.f3671a = new v0(this, windowInsets);
        } else if (i10 >= 28) {
            this.f3671a = new u0(this, windowInsets);
        } else {
            this.f3671a = new t0(this, windowInsets);
        }
    }

    public static A1.c e(A1.c cVar, int i10, int i11, int i12, int i13) {
        int iMax = Math.max(0, cVar.f462a - i10);
        int iMax2 = Math.max(0, cVar.f463b - i11);
        int iMax3 = Math.max(0, cVar.f464c - i12);
        int iMax4 = Math.max(0, cVar.f465d - i13);
        return (iMax == i10 && iMax2 == i11 && iMax3 == i12 && iMax4 == i13) ? cVar : A1.c.c(iMax, iMax2, iMax3, iMax4);
    }

    public static B0 h(View view, WindowInsets windowInsets) {
        windowInsets.getClass();
        B0 b5 = new B0(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            WeakHashMap weakHashMap = S.f3689a;
            B0 b0A = J.a(view);
            y0 y0Var = b5.f3671a;
            y0Var.t(b0A);
            y0Var.d(view.getRootView());
            y0Var.v(view.getWindowSystemUiVisibility());
        }
        return b5;
    }

    public final int a() {
        return this.f3671a.l().f465d;
    }

    public final int b() {
        return this.f3671a.l().f462a;
    }

    public final int c() {
        return this.f3671a.l().f464c;
    }

    public final int d() {
        return this.f3671a.l().f463b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof B0) {
            return Objects.equals(this.f3671a, ((B0) obj).f3671a);
        }
        return false;
    }

    public final B0 f(int i10, int i11, int i12, int i13) {
        r0 o0Var;
        int i14 = Build.VERSION.SDK_INT;
        if (i14 >= 34) {
            o0Var = new q0(this);
        } else if (i14 >= 30) {
            o0Var = new p0(this);
        } else {
            o0Var = i14 >= 29 ? new o0(this) : new m0(this);
        }
        o0Var.g(A1.c.c(i10, i11, i12, i13));
        return o0Var.b();
    }

    public final WindowInsets g() {
        y0 y0Var = this.f3671a;
        if (y0Var instanceof s0) {
            return ((s0) y0Var).f3777c;
        }
        return null;
    }

    public final int hashCode() {
        y0 y0Var = this.f3671a;
        if (y0Var == null) {
            return 0;
        }
        return y0Var.hashCode();
    }

    public B0(B0 b5) {
        if (b5 != null) {
            y0 y0Var = b5.f3671a;
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 34 && (y0Var instanceof x0)) {
                this.f3671a = new x0(this, (x0) y0Var);
            } else if (i10 >= 30 && (y0Var instanceof w0)) {
                this.f3671a = new w0(this, (w0) y0Var);
            } else if (i10 >= 29 && (y0Var instanceof v0)) {
                this.f3671a = new v0(this, (v0) y0Var);
            } else if (i10 >= 28 && (y0Var instanceof u0)) {
                this.f3671a = new u0(this, (u0) y0Var);
            } else if (y0Var instanceof t0) {
                this.f3671a = new t0(this, (t0) y0Var);
            } else if (y0Var instanceof s0) {
                this.f3671a = new s0(this, (s0) y0Var);
            } else {
                this.f3671a = new y0(this);
            }
            y0Var.e(this);
            return;
        }
        this.f3671a = new y0(this);
    }
}
