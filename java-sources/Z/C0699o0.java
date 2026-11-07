package Z;

/* JADX INFO: renamed from: Z.o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0699o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f10746a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C0704u f10747b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C0670a f10748c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public p241y9.e f10749d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f10750e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public u.z f10751f;
    public u.E g;

    public C0699o0(C0704u c0704u) {
        this.f10747b = c0704u;
    }

    public static boolean a(C c10, u.E e10) {
        p251z9.j.c(c10, "null cannot be cast to non-null type androidx.compose.runtime.DerivedState<kotlin.Any?>");
        F0 f3 = c10.f10589t;
        if (f3 == null) {
            f3 = S.f10643w;
        }
        return !f3.a(c10.h().f10586f, e10.g(c10));
    }

    public final boolean b() {
        if (this.f10747b != null) {
            C0670a c0670a = this.f10748c;
            if (c0670a != null ? c0670a.a() : false) {
                return true;
            }
        }
        return false;
    }

    public final M c(Object obj) {
        M mQ;
        C0704u c0704u = this.f10747b;
        return (c0704u == null || (mQ = c0704u.q(this, obj)) == null) ? M.f10623r : mQ;
    }

    public final void d() {
        C0704u c0704u = this.f10747b;
        if (c0704u != null) {
            c0704u.f10815F = true;
        }
        this.f10747b = null;
        this.f10751f = null;
        this.g = null;
    }

    public final void e(boolean z10) {
        if (z10) {
            this.f10746a |= 32;
        } else {
            this.f10746a &= -33;
        }
    }
}
