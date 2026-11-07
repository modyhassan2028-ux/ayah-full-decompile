package G;

import A.C0009b;
import A.EnumC0047u0;
import D.C0082z;
import F.C0155d;
import H0.AbstractC0207f;
import J0.AbstractC0283f;
import J0.InterfaceC0302z;
import com.google.android.gms.internal.measurement.AbstractC0813f2;

/* JADX INFO: renamed from: G.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0181o extends l0.q implements I0.d, InterfaceC0302z {

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public static final C0179m f2713I = new C0179m();

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public C0155d f2714F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public C0009b f2715G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public EnumC0047u0 f2716H;

    @Override // I0.e
    public final /* synthetic */ Object Z(I0.f fVar) {
        return p245z2.a.b(this, fVar);
    }

    @Override // J0.InterfaceC0302z
    public final /* synthetic */ int a(J0.P p10, H0.H h7, int i10) {
        return p245z2.a.h(this, p10, h7, i10);
    }

    @Override // J0.InterfaceC0302z
    public final /* synthetic */ int c(J0.P p10, H0.H h7, int i10) {
        return p245z2.a.e(this, p10, h7, i10);
    }

    @Override // J0.InterfaceC0302z
    public final /* synthetic */ int d(J0.P p10, H0.H h7, int i10) {
        return p245z2.a.n(this, p10, h7, i10);
    }

    @Override // J0.InterfaceC0302z
    public final H0.J e(H0.K k7, H0.H h7, long j) {
        H0.U uA = h7.a(j);
        return k7.g0(uA.f3168r, uA.f3169s, p120l9.s.f19441r, new C0082z(uA, 4));
    }

    @Override // J0.InterfaceC0302z
    public final /* synthetic */ int f(J0.P p10, H0.H h7, int i10) {
        return p245z2.a.k(this, p10, h7, i10);
    }

    @Override // I0.d
    public final AbstractC0813f2 j() {
        I0.g gVar = new I0.g(AbstractC0207f.f3197a);
        gVar.f3663t.setValue(this);
        return gVar;
    }

    public final boolean v0(C0178l c0178l, int i10) {
        if (i10 == 5 || i10 == 6) {
            if (this.f2716H == EnumC0047u0.f425s) {
                return false;
            }
        } else if (i10 == 3 || i10 == 4) {
            if (this.f2716H == EnumC0047u0.f424r) {
                return false;
            }
        } else if (i10 != 1 && i10 != 2) {
            throw new IllegalStateException("Lazy list does not support beyond bounds layout for the specified direction");
        }
        if (w0(i10)) {
            if (c0178l.f2709b >= this.f2714F.f2045a.g().f2106n - 1) {
                return false;
            }
        } else if (c0178l.f2708a <= 0) {
            return false;
        }
        return true;
    }

    public final boolean w0(int i10) {
        if (i10 == 1) {
            return false;
        }
        if (i10 == 2) {
            return true;
        }
        if (i10 == 5) {
            return false;
        }
        if (i10 == 6) {
            return true;
        }
        if (i10 == 3) {
            int iOrdinal = AbstractC0283f.x(this).Q.ordinal();
            if (iOrdinal == 0) {
                return false;
            }
            if (iOrdinal == 1) {
                return true;
            }
            throw new A6.a();
        }
        if (i10 != 4) {
            throw new IllegalStateException("Lazy list does not support beyond bounds layout for the specified direction");
        }
        int iOrdinal2 = AbstractC0283f.x(this).Q.ordinal();
        if (iOrdinal2 == 0) {
            return true;
        }
        if (iOrdinal2 == 1) {
            return false;
        }
        throw new A6.a();
    }
}
