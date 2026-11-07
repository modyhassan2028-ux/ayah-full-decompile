package p180s0;

import N9.b0;
import android.graphics.Shader;
import p110k9.t;

/* JADX INFO: loaded from: classes.dex */
public final class L extends F {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f21813e;

    public L(long j) {
        this.f21813e = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof L) {
            return q.c(this.f21813e, ((L) obj).f21813e);
        }
        return false;
    }

    public final int hashCode() {
        int i10 = q.f21844h;
        return t.a(this.f21813e);
    }

    @Override // p180s0.F
    public final void j(float f3, long j, b0 b0Var) {
        b0Var.c(1.0f);
        long jB = this.f21813e;
        if (f3 != 1.0f) {
            jB = q.b(jB, q.d(jB) * f3);
        }
        b0Var.e(jB);
        if (((Shader) b0Var.f6166c) != null) {
            b0Var.h(null);
        }
    }

    public final String toString() {
        return "SolidColor(value=" + ((Object) q.i(this.f21813e)) + ')';
    }
}
