package p063g1;

import android.support.v4.media.session.p;
import p123m2.c;

/* JADX INFO: loaded from: classes.dex */
public final class d implements c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final float f16247r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final float f16248s;

    public d(float f3, float f7) {
        this.f16247r = f3;
        this.f16248s = f7;
    }

    @Override // p063g1.c
    public final /* synthetic */ int E(float f3) {
        return p.c(this, f3);
    }

    @Override // p063g1.c
    public final /* synthetic */ long M(long j) {
        return p.h(j, this);
    }

    @Override // p063g1.c
    public final /* synthetic */ float Q(long j) {
        return p.g(j, this);
    }

    @Override // p063g1.c
    public final long X(float f3) {
        return p.i(this, d0(f3));
    }

    @Override // p063g1.c
    public final float b0(int i10) {
        return i10 / getDensity();
    }

    @Override // p063g1.c
    public final float d0(float f3) {
        return f3 / getDensity();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Float.compare(this.f16247r, dVar.f16247r) == 0 && Float.compare(this.f16248s, dVar.f16248s) == 0;
    }

    @Override // p063g1.c
    public final float getDensity() {
        return this.f16247r;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f16248s) + (Float.floatToIntBits(this.f16247r) * 31);
    }

    @Override // p063g1.c
    public final float n() {
        return this.f16248s;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DensityImpl(density=");
        sb.append(this.f16247r);
        sb.append(", fontScale=");
        return c.v(sb, this.f16248s, ')');
    }

    @Override // p063g1.c
    public final /* synthetic */ long v(long j) {
        return p.f(j, this);
    }

    @Override // p063g1.c
    public final float w(float f3) {
        return getDensity() * f3;
    }

    @Override // p063g1.c
    public final /* synthetic */ float z(long j) {
        return p.e(j, this);
    }
}
