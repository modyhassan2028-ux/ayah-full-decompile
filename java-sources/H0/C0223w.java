package H0;

import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: H0.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0223w implements e0, K {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C0226z f3223r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ E f3224s;

    public C0223w(E e10) {
        this.f3224s = e10;
        this.f3223r = e10.f3151y;
    }

    @Override // p063g1.c
    public final int E(float f3) {
        C0226z c0226z = this.f3223r;
        c0226z.getClass();
        return android.support.v4.media.session.p.c(c0226z, f3);
    }

    @Override // p063g1.c
    public final long M(long j) {
        C0226z c0226z = this.f3223r;
        c0226z.getClass();
        return android.support.v4.media.session.p.h(j, c0226z);
    }

    @Override // p063g1.c
    public final float Q(long j) {
        C0226z c0226z = this.f3223r;
        c0226z.getClass();
        return android.support.v4.media.session.p.g(j, c0226z);
    }

    @Override // p063g1.c
    public final long X(float f3) {
        return this.f3223r.X(f3);
    }

    @Override // p063g1.c
    public final float b0(int i10) {
        return this.f3223r.b0(i10);
    }

    @Override // H0.e0
    public final List c0(Object obj, p241y9.e eVar) {
        E e10 = this.f3224s;
        J0.I i10 = e10.f3144r;
        J0.I i11 = (J0.I) e10.f3150x.g(obj);
        if (i11 != null && ((p011b0.b) i10.p()).f13119r.j(i11) < e10.f3147u) {
            return i11.n();
        }
        u.E e11 = e10.f3137A;
        p011b0.e eVar2 = e10.f3140D;
        if (eVar2.f13127t < e10.f3148v) {
            G0.a.a("Error: currentApproachIndex cannot be greater than the size of theapproachComposedSlotIds list.");
        }
        int i12 = eVar2.f13127t;
        int i13 = e10.f3148v;
        if (i12 == i13) {
            eVar2.b(obj);
        } else {
            Object[] objArr = eVar2.f13125r;
            Object obj2 = objArr[i13];
            objArr[i13] = obj;
        }
        e10.f3148v++;
        if (!e11.b(obj)) {
            e10.f3139C.l(obj, e10.g(obj, eVar));
            if (i10.f3915X.f3948d == J0.E.f3884t) {
                i10.T(true);
            } else {
                J0.I.U(i10, true, 6);
            }
        }
        J0.I i14 = (J0.I) e11.g(obj);
        if (i14 == null) {
            return p120l9.r.f19440r;
        }
        List listH0 = i14.f3915X.f3958p.h0();
        p011b0.b bVar = (p011b0.b) listH0;
        int i15 = bVar.f13119r.f13127t;
        for (int i16 = 0; i16 < i15; i16++) {
            ((J0.Z) bVar.get(i16)).f4046w.f3946b = true;
        }
        return listH0;
    }

    @Override // p063g1.c
    public final float d0(float f3) {
        return f3 / this.f3223r.getDensity();
    }

    @Override // H0.K
    public final J g0(int i10, int i11, Map map, p241y9.c cVar) {
        return this.f3223r.a(i10, i11, map, cVar);
    }

    @Override // p063g1.c
    public final float getDensity() {
        return this.f3223r.f3238s;
    }

    @Override // H0.InterfaceC0215n
    public final p063g1.m getLayoutDirection() {
        return this.f3223r.f3237r;
    }

    @Override // p063g1.c
    public final float n() {
        return this.f3223r.f3239t;
    }

    @Override // H0.InterfaceC0215n
    public final boolean t() {
        return this.f3223r.t();
    }

    @Override // p063g1.c
    public final long v(long j) {
        C0226z c0226z = this.f3223r;
        c0226z.getClass();
        return android.support.v4.media.session.p.f(j, c0226z);
    }

    @Override // p063g1.c
    public final float w(float f3) {
        return this.f3223r.getDensity() * f3;
    }

    @Override // p063g1.c
    public final float z(long j) {
        C0226z c0226z = this.f3223r;
        c0226z.getClass();
        return android.support.v4.media.session.p.e(j, c0226z);
    }
}
