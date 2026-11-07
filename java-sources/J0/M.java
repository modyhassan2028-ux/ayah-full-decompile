package J0;

/* JADX INFO: loaded from: classes.dex */
public final class M {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final I f3945a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f3946b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f3947c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f3949e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f3950f;
    public boolean g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f3951h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f3952i;
    public boolean j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f3953k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f3954l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f3955m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f3956n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f3957o;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public V f3959q;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public E f3948d = E.f3886v;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Z f3958p = new Z(this);

    public M(I i10) {
        this.f3945a = i10;
    }

    public final j0 a() {
        return (j0) this.f3945a.f3914W.f4065d;
    }

    public final void b(int i10) {
        int i11 = this.f3954l;
        this.f3954l = i10;
        if ((i11 == 0) != (i10 == 0)) {
            I iU = this.f3945a.u();
            M m10 = iU != null ? iU.f3915X : null;
            if (m10 != null) {
                if (i10 == 0) {
                    m10.b(m10.f3954l - 1);
                } else {
                    m10.b(m10.f3954l + 1);
                }
            }
        }
    }

    public final void c(int i10) {
        int i11 = this.f3957o;
        this.f3957o = i10;
        if ((i11 == 0) != (i10 == 0)) {
            I iU = this.f3945a.u();
            M m10 = iU != null ? iU.f3915X : null;
            if (m10 != null) {
                if (i10 == 0) {
                    m10.c(m10.f3957o - 1);
                } else {
                    m10.c(m10.f3957o + 1);
                }
            }
        }
    }

    public final void d(boolean z10) {
        if (this.f3953k != z10) {
            this.f3953k = z10;
            if (z10 && !this.j) {
                b(this.f3954l + 1);
            } else {
                if (z10 || this.j) {
                    return;
                }
                b(this.f3954l - 1);
            }
        }
    }

    public final void e(boolean z10) {
        if (this.j != z10) {
            this.j = z10;
            if (z10 && !this.f3953k) {
                b(this.f3954l + 1);
            } else {
                if (z10 || this.f3953k) {
                    return;
                }
                b(this.f3954l - 1);
            }
        }
    }

    public final void f(boolean z10) {
        if (this.f3956n != z10) {
            this.f3956n = z10;
            if (z10 && !this.f3955m) {
                c(this.f3957o + 1);
            } else {
                if (z10 || this.f3955m) {
                    return;
                }
                c(this.f3957o - 1);
            }
        }
    }

    public final void g(boolean z10) {
        if (this.f3955m != z10) {
            this.f3955m = z10;
            if (z10 && !this.f3956n) {
                c(this.f3957o + 1);
            } else {
                if (z10 || this.f3956n) {
                    return;
                }
                c(this.f3957o - 1);
            }
        }
    }

    public final void h() {
        Z z10 = this.f3958p;
        M m10 = z10.f4046w;
        Object obj = z10.f4030J;
        I i10 = this.f3945a;
        if ((obj != null || m10.a().i() != null) && z10.f4029I) {
            z10.f4029I = false;
            z10.f4030J = m10.a().i();
            I iU = i10.u();
            if (iU != null) {
                I.W(iU, false, 7);
            }
        }
        V v10 = this.f3959q;
        if (v10 != null) {
            M m11 = v10.f4004w;
            if (v10.f4002O == null) {
                Q qC0 = m11.a().C0();
                p251z9.j.b(qC0);
                if (qC0.f3972C.i() == null) {
                    return;
                }
            }
            if (v10.f4001N) {
                v10.f4001N = false;
                Q qC1 = m11.a().C0();
                p251z9.j.b(qC1);
                v10.f4002O = qC1.f3972C.i();
                if (AbstractC0283f.s(i10)) {
                    I iU2 = i10.u();
                    if (iU2 != null) {
                        I.W(iU2, false, 7);
                        return;
                    }
                    return;
                }
                I iU3 = i10.u();
                if (iU3 != null) {
                    I.U(iU3, false, 7);
                }
            }
        }
    }
}
