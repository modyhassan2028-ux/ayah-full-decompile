package J0;

/* JADX INFO: loaded from: classes.dex */
public final class O implements p063g1.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ P f3965r;

    public O(P p10) {
        this.f3965r = p10;
    }

    @Override // p063g1.c
    public final /* synthetic */ int E(float f3) {
        return android.support.v4.media.session.p.c(this, f3);
    }

    @Override // p063g1.c
    public final /* synthetic */ long M(long j) {
        return android.support.v4.media.session.p.h(j, this);
    }

    @Override // p063g1.c
    public final /* synthetic */ float Q(long j) {
        return android.support.v4.media.session.p.g(j, this);
    }

    @Override // p063g1.c
    public final long X(float f3) {
        return android.support.v4.media.session.p.i(this, d0(f3));
    }

    @Override // p063g1.c
    public final float b0(int i10) {
        return i10 / getDensity();
    }

    @Override // p063g1.c
    public final float d0(float f3) {
        return f3 / getDensity();
    }

    @Override // p063g1.c
    public final float getDensity() {
        return this.f3965r.getDensity();
    }

    @Override // p063g1.c
    public final float n() {
        return this.f3965r.n();
    }

    @Override // p063g1.c
    public final /* synthetic */ long v(long j) {
        return android.support.v4.media.session.p.f(j, this);
    }

    @Override // p063g1.c
    public final float w(float f3) {
        return getDensity() * f3;
    }

    @Override // p063g1.c
    public final /* synthetic */ float z(long j) {
        return android.support.v4.media.session.p.e(j, this);
    }
}
