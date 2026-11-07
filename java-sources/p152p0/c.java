package p152p0;

import android.support.v4.media.session.p;
import p151p.C1256n;
import p251z9.k;

/* JADX INFO: loaded from: classes.dex */
public final class c implements p063g1.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public a f20809r = f.f20813r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public C1256n f20810s;

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

    /* JADX WARN: Multi-variable type inference failed */
    public final C1256n a(p241y9.c cVar) {
        C1256n c1256n = new C1256n(2);
        c1256n.f20747s = (k) cVar;
        this.f20810s = c1256n;
        return c1256n;
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
        return this.f20809r.getDensity().getDensity();
    }

    @Override // p063g1.c
    public final float n() {
        return this.f20809r.getDensity().n();
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
