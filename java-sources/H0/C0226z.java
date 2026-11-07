package H0;

import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: H0.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0226z implements e0 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public p063g1.m f3237r = p063g1.m.f16262s;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public float f3238s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public float f3239t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ E f3240u;

    public C0226z(E e10) {
        this.f3240u = e10;
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

    public final J a(int i10, int i11, Map map, p241y9.c cVar) {
        if ((i10 & (-16777216)) != 0 || ((-16777216) & i11) != 0) {
            G0.a.b("Size(" + i10 + " x " + i11 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new C0225y(i10, i11, map, this, this.f3240u, cVar);
    }

    @Override // p063g1.c
    public final float b0(int i10) {
        return i10 / getDensity();
    }

    @Override // H0.e0
    public final List c0(Object obj, p241y9.e eVar) {
        E e10 = this.f3240u;
        e10.b();
        J0.I i10 = e10.f3144r;
        J0.E e11 = i10.f3915X.f3948d;
        J0.E e12 = J0.E.f3884t;
        J0.E e13 = J0.E.f3882r;
        if (e11 != e13 && e11 != e12 && e11 != J0.E.f3883s && e11 != J0.E.f3885u) {
            G0.a.b("subcompose can only be used inside the measure or layout blocks");
        }
        u.E e14 = e10.f3150x;
        Object objG = e14.g(obj);
        if (objG == null) {
            objG = (J0.I) e10.f3137A.j(obj);
            if (objG != null) {
                if (e10.f3142F <= 0) {
                    G0.a.b("Check failed.");
                }
                e10.f3142F--;
            } else {
                objG = e10.j(obj);
                if (objG == null) {
                    int i11 = e10.f3147u;
                    J0.I i12 = new J0.I(2);
                    i10.f3904H = true;
                    i10.B(i11, i12);
                    i10.f3904H = false;
                    objG = i12;
                }
            }
            e14.l(obj, objG);
        }
        J0.I i13 = (J0.I) objG;
        if (p120l9.m.h0(e10.f3147u, i10.p()) != i13) {
            int iJ = ((p011b0.b) i10.p()).f13119r.j(i13);
            if (iJ < e10.f3147u) {
                G0.a.a("Key \"" + obj + "\" was already used. If you are using LazyColumn/Row please make sure you provide a unique key for each item.");
            }
            int i14 = e10.f3147u;
            if (i14 != iJ) {
                i10.f3904H = true;
                i10.L(iJ, i14, 1);
                i10.f3904H = false;
            }
        }
        e10.f3147u++;
        e10.h(i13, obj, eVar);
        return (e11 == e13 || e11 == e12) ? i13.n() : i13.m();
    }

    @Override // p063g1.c
    public final float d0(float f3) {
        return f3 / getDensity();
    }

    @Override // H0.K
    public final J g0(int i10, int i11, Map map, p241y9.c cVar) {
        return a(i10, i11, map, cVar);
    }

    @Override // p063g1.c
    public final float getDensity() {
        return this.f3238s;
    }

    @Override // H0.InterfaceC0215n
    public final p063g1.m getLayoutDirection() {
        return this.f3237r;
    }

    @Override // p063g1.c
    public final float n() {
        return this.f3239t;
    }

    @Override // H0.InterfaceC0215n
    public final boolean t() {
        J0.E e10 = this.f3240u.f3144r.f3915X.f3948d;
        return e10 == J0.E.f3885u || e10 == J0.E.f3883s;
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
