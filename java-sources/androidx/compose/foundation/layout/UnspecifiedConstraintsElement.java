package androidx.compose.foundation.layout;

import D.a0;
import J0.AbstractC0274a0;
import l0.q;
import p063g1.f;

/* JADX INFO: loaded from: classes.dex */
final class UnspecifiedConstraintsElement extends AbstractC0274a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f11820a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f11821b;

    public UnspecifiedConstraintsElement(float f3, float f7) {
        this.f11820a = f3;
        this.f11821b = f7;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof UnspecifiedConstraintsElement)) {
            return false;
        }
        UnspecifiedConstraintsElement unspecifiedConstraintsElement = (UnspecifiedConstraintsElement) obj;
        return f.a(this.f11820a, unspecifiedConstraintsElement.f11820a) && f.a(this.f11821b, unspecifiedConstraintsElement.f11821b);
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f11821b) + (Float.floatToIntBits(this.f11820a) * 31);
    }

    @Override // J0.AbstractC0274a0
    public final q k() {
        a0 a0Var = new a0();
        a0Var.f936F = this.f11820a;
        a0Var.f937G = this.f11821b;
        return a0Var;
    }

    @Override // J0.AbstractC0274a0
    public final void l(q qVar) {
        a0 a0Var = (a0) qVar;
        a0Var.f936F = this.f11820a;
        a0Var.f937G = this.f11821b;
    }
}
