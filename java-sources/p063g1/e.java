package p063g1;

import F9.n;
import android.support.v4.media.session.p;
import p075h1.a;
import p123m2.c;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class e implements c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final float f16249r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final float f16250s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final a f16251t;

    public e(float f3, float f7, a aVar) {
        this.f16249r = f3;
        this.f16250s = f7;
        this.f16251t = aVar;
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
        return n.L(4294967296L, this.f16251t.a(d0(f3)));
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
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Float.compare(this.f16249r, eVar.f16249r) == 0 && Float.compare(this.f16250s, eVar.f16250s) == 0 && j.a(this.f16251t, eVar.f16251t);
    }

    @Override // p063g1.c
    public final float getDensity() {
        return this.f16249r;
    }

    public final int hashCode() {
        return this.f16251t.hashCode() + c.n(Float.floatToIntBits(this.f16249r) * 31, this.f16250s, 31);
    }

    @Override // p063g1.c
    public final float n() {
        return this.f16250s;
    }

    public final String toString() {
        return "DensityWithConverter(density=" + this.f16249r + ", fontScale=" + this.f16250s + ", converter=" + this.f16251t + ')';
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
    public final float z(long j) {
        if (p.a(o.b(j), 4294967296L)) {
            return this.f16251t.b(o.c(j));
        }
        throw new IllegalStateException("Only Sp can convert to Px");
    }
}
