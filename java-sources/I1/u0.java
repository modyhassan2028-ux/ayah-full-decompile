package I1;

import android.view.DisplayCutout;
import android.view.WindowInsets;
import j$.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class u0 extends t0 {
    public u0(B0 b5, WindowInsets windowInsets) {
        super(b5, windowInsets);
    }

    @Override // I1.y0
    public B0 a() {
        return B0.h(null, this.f3777c.consumeDisplayCutout());
    }

    @Override // I1.s0, I1.y0
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u0)) {
            return false;
        }
        u0 u0Var = (u0) obj;
        return Objects.equals(this.f3777c, u0Var.f3777c) && Objects.equals(this.g, u0Var.g) && s0.C(this.f3781h, u0Var.f3781h);
    }

    @Override // I1.y0
    public C0259l f() {
        DisplayCutout displayCutout = this.f3777c.getDisplayCutout();
        if (displayCutout == null) {
            return null;
        }
        return new C0259l(displayCutout);
    }

    @Override // I1.y0
    public int hashCode() {
        return this.f3777c.hashCode();
    }

    public u0(B0 b5, u0 u0Var) {
        super(b5, u0Var);
    }
}
