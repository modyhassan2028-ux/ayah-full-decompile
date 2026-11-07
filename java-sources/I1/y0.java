package I1;

import android.os.Build;
import android.view.View;
import j$.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class y0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final B0 f3796b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final B0 f3797a;

    static {
        r0 o0Var;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 34) {
            o0Var = new q0();
        } else if (i10 >= 30) {
            o0Var = new p0();
        } else {
            o0Var = i10 >= 29 ? new o0() : new m0();
        }
        f3796b = o0Var.b().f3671a.a().f3671a.b().f3671a.c();
    }

    public y0(B0 b5) {
        this.f3797a = b5;
    }

    public B0 a() {
        return this.f3797a;
    }

    public B0 b() {
        return this.f3797a;
    }

    public B0 c() {
        return this.f3797a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y0)) {
            return false;
        }
        y0 y0Var = (y0) obj;
        return p() == y0Var.p() && o() == y0Var.o() && Objects.equals(l(), y0Var.l()) && Objects.equals(j(), y0Var.j()) && Objects.equals(f(), y0Var.f());
    }

    public C0259l f() {
        return null;
    }

    public A1.c g(int i10) {
        return A1.c.f461e;
    }

    public A1.c h(int i10) {
        if ((i10 & 8) == 0) {
            return A1.c.f461e;
        }
        throw new IllegalArgumentException("Unable to query the maximum insets for IME");
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(p()), Boolean.valueOf(o()), l(), j(), f());
    }

    public A1.c i() {
        return l();
    }

    public A1.c j() {
        return A1.c.f461e;
    }

    public A1.c k() {
        return l();
    }

    public A1.c l() {
        return A1.c.f461e;
    }

    public A1.c m() {
        return l();
    }

    public B0 n(int i10, int i11, int i12, int i13) {
        return f3796b;
    }

    public boolean o() {
        return false;
    }

    public boolean p() {
        return false;
    }

    public boolean q(int i10) {
        return true;
    }

    public void d(View view) {
    }

    public void e(B0 b5) {
    }

    public void r(A1.c[] cVarArr) {
    }

    public void s(A1.c cVar) {
    }

    public void t(B0 b5) {
    }

    public void u(A1.c cVar) {
    }

    public void v(int i10) {
    }
}
