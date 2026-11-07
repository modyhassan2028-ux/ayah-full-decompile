package androidx.compose.foundation.layout;

import D.Y;
import J0.AbstractC0274a0;
import l0.q;
import p063g1.f;

/* JADX INFO: loaded from: classes.dex */
final class SizeElement extends AbstractC0274a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f11815a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f11816b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f11817c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f11818d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f11819e;

    public SizeElement(float f3, float f7, float f10, float f11, boolean z10) {
        this.f11815a = f3;
        this.f11816b = f7;
        this.f11817c = f10;
        this.f11818d = f11;
        this.f11819e = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SizeElement)) {
            return false;
        }
        SizeElement sizeElement = (SizeElement) obj;
        return f.a(this.f11815a, sizeElement.f11815a) && f.a(this.f11816b, sizeElement.f11816b) && f.a(this.f11817c, sizeElement.f11817c) && f.a(this.f11818d, sizeElement.f11818d) && this.f11819e == sizeElement.f11819e;
    }

    public final int hashCode() {
        return p123m2.c.n(p123m2.c.n(p123m2.c.n(Float.floatToIntBits(this.f11815a) * 31, this.f11816b, 31), this.f11817c, 31), this.f11818d, 31) + (this.f11819e ? 1231 : 1237);
    }

    @Override // J0.AbstractC0274a0
    public final q k() {
        Y y10 = new Y();
        y10.f925F = this.f11815a;
        y10.f926G = this.f11816b;
        y10.f927H = this.f11817c;
        y10.f928I = this.f11818d;
        y10.f929J = this.f11819e;
        return y10;
    }

    @Override // J0.AbstractC0274a0
    public final void l(q qVar) {
        Y y10 = (Y) qVar;
        y10.f925F = this.f11815a;
        y10.f926G = this.f11816b;
        y10.f927H = this.f11817c;
        y10.f928I = this.f11818d;
        y10.f929J = this.f11819e;
    }

    public /* synthetic */ SizeElement(float f3, float f7, float f10, float f11, boolean z10, int i10) {
        this((i10 & 1) != 0 ? Float.NaN : f3, (i10 & 2) != 0 ? Float.NaN : f7, (i10 & 4) != 0 ? Float.NaN : f10, (i10 & 8) != 0 ? Float.NaN : f11, z10);
    }
}
