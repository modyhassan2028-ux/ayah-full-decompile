package p063g1;

import p075h1.a;
import p123m2.c;

/* JADX INFO: loaded from: classes.dex */
public final class n implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f16264a;

    public n(float f3) {
        this.f16264a = f3;
    }

    @Override // p075h1.a
    public final float a(float f3) {
        return f3 / this.f16264a;
    }

    @Override // p075h1.a
    public final float b(float f3) {
        return f3 * this.f16264a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n) && Float.compare(this.f16264a, ((n) obj).f16264a) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f16264a);
    }

    public final String toString() {
        return c.v(new StringBuilder("LinearFontScaleConverter(fontScale="), this.f16264a, ')');
    }
}
