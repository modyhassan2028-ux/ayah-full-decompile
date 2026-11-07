package I1;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import j$.util.Objects;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public class s0 extends y0 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static boolean f3773i = false;
    public static Method j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static Class f3774k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static Field f3775l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static Field f3776m;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final WindowInsets f3777c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public A1.c[] f3778d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public A1.c f3779e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public B0 f3780f;
    public A1.c g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f3781h;

    public s0(B0 b5, WindowInsets windowInsets) {
        super(b5);
        this.f3779e = null;
        this.f3777c = windowInsets;
    }

    @SuppressLint({"PrivateApi"})
    private static void B() {
        try {
            j = View.class.getDeclaredMethod("getViewRootImpl", null);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            f3774k = cls;
            f3775l = cls.getDeclaredField("mVisibleInsets");
            f3776m = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
            f3775l.setAccessible(true);
            f3776m.setAccessible(true);
        } catch (ReflectiveOperationException e10) {
            Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e10.getMessage(), e10);
        }
        f3773i = true;
    }

    public static boolean C(int i10, int i11) {
        return (i10 & 6) == (i11 & 6);
    }

    @SuppressLint({"WrongConstant"})
    private A1.c w(int i10, boolean z10) {
        A1.c cVarA = A1.c.f461e;
        for (int i11 = 1; i11 <= 512; i11 <<= 1) {
            if ((i10 & i11) != 0) {
                cVarA = A1.c.a(cVarA, x(i11, z10));
            }
        }
        return cVarA;
    }

    private A1.c y() {
        B0 b5 = this.f3780f;
        return b5 != null ? b5.f3671a.j() : A1.c.f461e;
    }

    private A1.c z(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
        }
        if (!f3773i) {
            B();
        }
        Method method = j;
        if (method != null && f3774k != null && f3775l != null) {
            try {
                Object objInvoke = method.invoke(view, null);
                if (objInvoke == null) {
                    Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                    return null;
                }
                Rect rect = (Rect) f3775l.get(f3776m.get(objInvoke));
                if (rect != null) {
                    return A1.c.c(rect.left, rect.top, rect.right, rect.bottom);
                }
            } catch (ReflectiveOperationException e10) {
                Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e10.getMessage(), e10);
            }
        }
        return null;
    }

    public boolean A(int i10) {
        if (i10 != 1 && i10 != 2) {
            if (i10 == 4) {
                return false;
            }
            if (i10 != 8 && i10 != 128) {
                return true;
            }
        }
        return !x(i10, false).equals(A1.c.f461e);
    }

    @Override // I1.y0
    public void d(View view) {
        A1.c cVarZ = z(view);
        if (cVarZ == null) {
            cVarZ = A1.c.f461e;
        }
        s(cVarZ);
    }

    @Override // I1.y0
    public void e(B0 b5) {
        b5.f3671a.t(this.f3780f);
        A1.c cVar = this.g;
        y0 y0Var = b5.f3671a;
        y0Var.s(cVar);
        y0Var.v(this.f3781h);
    }

    @Override // I1.y0
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        s0 s0Var = (s0) obj;
        return Objects.equals(this.g, s0Var.g) && C(this.f3781h, s0Var.f3781h);
    }

    @Override // I1.y0
    public A1.c g(int i10) {
        return w(i10, false);
    }

    @Override // I1.y0
    public A1.c h(int i10) {
        return w(i10, true);
    }

    @Override // I1.y0
    public final A1.c l() {
        if (this.f3779e == null) {
            WindowInsets windowInsets = this.f3777c;
            this.f3779e = A1.c.c(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        return this.f3779e;
    }

    @Override // I1.y0
    public B0 n(int i10, int i11, int i12, int i13) {
        r0 o0Var;
        B0 b0H = B0.h(null, this.f3777c);
        int i14 = Build.VERSION.SDK_INT;
        if (i14 >= 34) {
            o0Var = new q0(b0H);
        } else if (i14 >= 30) {
            o0Var = new p0(b0H);
        } else {
            o0Var = i14 >= 29 ? new o0(b0H) : new m0(b0H);
        }
        o0Var.g(B0.e(l(), i10, i11, i12, i13));
        o0Var.e(B0.e(j(), i10, i11, i12, i13));
        return o0Var.b();
    }

    @Override // I1.y0
    public boolean p() {
        return this.f3777c.isRound();
    }

    @Override // I1.y0
    @SuppressLint({"WrongConstant"})
    public boolean q(int i10) {
        for (int i11 = 1; i11 <= 512; i11 <<= 1) {
            if ((i10 & i11) != 0 && !A(i11)) {
                return false;
            }
        }
        return true;
    }

    @Override // I1.y0
    public void r(A1.c[] cVarArr) {
        this.f3778d = cVarArr;
    }

    @Override // I1.y0
    public void s(A1.c cVar) {
        this.g = cVar;
    }

    @Override // I1.y0
    public void t(B0 b5) {
        this.f3780f = b5;
    }

    @Override // I1.y0
    public void v(int i10) {
        this.f3781h = i10;
    }

    public A1.c x(int i10, boolean z10) {
        A1.c cVarJ;
        int i11;
        A1.c cVar = A1.c.f461e;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 == 8) {
                    A1.c[] cVarArr = this.f3778d;
                    cVarJ = cVarArr != null ? cVarArr[B9.a.I(8)] : null;
                    if (cVarJ != null) {
                        return cVarJ;
                    }
                    A1.c cVarL = l();
                    A1.c cVarY = y();
                    int i12 = cVarL.f465d;
                    if (i12 > cVarY.f465d) {
                        return A1.c.c(0, 0, 0, i12);
                    }
                    A1.c cVar2 = this.g;
                    if (cVar2 != null && !cVar2.equals(cVar) && (i11 = this.g.f465d) > cVarY.f465d) {
                        return A1.c.c(0, 0, 0, i11);
                    }
                } else {
                    if (i10 == 16) {
                        return k();
                    }
                    if (i10 == 32) {
                        return i();
                    }
                    if (i10 == 64) {
                        return m();
                    }
                    if (i10 == 128) {
                        B0 b5 = this.f3780f;
                        C0259l c0259lF = b5 != null ? b5.f3671a.f() : f();
                        if (c0259lF != null) {
                            int i13 = Build.VERSION.SDK_INT;
                            return A1.c.c(i13 >= 28 ? B1.a.g(c0259lF.f3758a) : 0, i13 >= 28 ? B1.a.i(c0259lF.f3758a) : 0, i13 >= 28 ? B1.a.h(c0259lF.f3758a) : 0, i13 >= 28 ? B1.a.f(c0259lF.f3758a) : 0);
                        }
                    }
                }
            } else {
                if (z10) {
                    A1.c cVarY2 = y();
                    A1.c cVarJ2 = j();
                    return A1.c.c(Math.max(cVarY2.f462a, cVarJ2.f462a), 0, Math.max(cVarY2.f464c, cVarJ2.f464c), Math.max(cVarY2.f465d, cVarJ2.f465d));
                }
                if ((this.f3781h & 2) == 0) {
                    A1.c cVarL2 = l();
                    B0 b10 = this.f3780f;
                    cVarJ = b10 != null ? b10.f3671a.j() : null;
                    int iMin = cVarL2.f465d;
                    if (cVarJ != null) {
                        iMin = Math.min(iMin, cVarJ.f465d);
                    }
                    return A1.c.c(cVarL2.f462a, 0, cVarL2.f464c, iMin);
                }
            }
        } else {
            if (z10) {
                return A1.c.c(0, Math.max(y().f463b, l().f463b), 0, 0);
            }
            if ((this.f3781h & 4) == 0) {
                return A1.c.c(0, l().f463b, 0, 0);
            }
        }
        return cVar;
    }

    public s0(B0 b5, s0 s0Var) {
        this(b5, new WindowInsets(s0Var.f3777c));
    }
}
