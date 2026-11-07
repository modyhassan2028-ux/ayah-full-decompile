package H0;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class r implements K, InterfaceC0215n {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final p063g1.m f3219r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0215n f3220s;

    public r(InterfaceC0215n interfaceC0215n, p063g1.m mVar) {
        this.f3219r = mVar;
        this.f3220s = interfaceC0215n;
    }

    @Override // p063g1.c
    public final int E(float f3) {
        return this.f3220s.E(f3);
    }

    @Override // p063g1.c
    public final long M(long j) {
        return this.f3220s.M(j);
    }

    @Override // p063g1.c
    public final float Q(long j) {
        return this.f3220s.Q(j);
    }

    @Override // p063g1.c
    public final long X(float f3) {
        return this.f3220s.X(f3);
    }

    @Override // p063g1.c
    public final float b0(int i10) {
        return this.f3220s.b0(i10);
    }

    @Override // p063g1.c
    public final float d0(float f3) {
        return this.f3220s.d0(f3);
    }

    @Override // H0.K
    public final J g0(int i10, int i11, Map map, p241y9.c cVar) {
        if (i10 < 0) {
            i10 = 0;
        }
        if (i11 < 0) {
            i11 = 0;
        }
        if ((i10 & (-16777216)) != 0 || ((-16777216) & i11) != 0) {
            G0.a.b("Size(" + i10 + " x " + i11 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new C0218q(i10, i11, map);
    }

    @Override // p063g1.c
    public final float getDensity() {
        return this.f3220s.getDensity();
    }

    @Override // H0.InterfaceC0215n
    public final p063g1.m getLayoutDirection() {
        return this.f3219r;
    }

    @Override // p063g1.c
    public final float n() {
        return this.f3220s.n();
    }

    @Override // H0.InterfaceC0215n
    public final boolean t() {
        return this.f3220s.t();
    }

    @Override // p063g1.c
    public final long v(long j) {
        return this.f3220s.v(j);
    }

    @Override // p063g1.c
    public final float w(float f3) {
        return this.f3220s.w(f3);
    }

    @Override // p063g1.c
    public final float z(long j) {
        return this.f3220s.z(j);
    }
}
