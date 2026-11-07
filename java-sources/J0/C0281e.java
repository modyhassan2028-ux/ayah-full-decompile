package J0;

import androidx.compose.ui.platform.AndroidComposeView;

/* JADX INFO: renamed from: J0.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0281e extends p251z9.k implements p241y9.c {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final C0281e f4070A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final C0281e f4071B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final C0281e f4072C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final C0281e f4073D;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final C0281e f4074s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final C0281e f4075t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final C0281e f4076u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final C0281e f4077v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final C0281e f4078w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final C0281e f4079x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final C0281e f4080y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final C0281e f4081z;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f4082r;

    static {
        int i10 = 1;
        f4074s = new C0281e(i10, 0);
        f4075t = new C0281e(i10, 1);
        f4076u = new C0281e(i10, 2);
        f4077v = new C0281e(i10, 3);
        f4078w = new C0281e(i10, 4);
        f4079x = new C0281e(i10, 5);
        f4080y = new C0281e(i10, 6);
        f4081z = new C0281e(i10, 7);
        f4070A = new C0281e(i10, 8);
        f4071B = new C0281e(i10, 9);
        f4072C = new C0281e(i10, 10);
        f4073D = new C0281e(i10, 11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0281e(int i10, int i11) {
        super(i10);
        this.f4082r = i11;
    }

    @Override // p241y9.c
    public final Object e(Object obj) {
        switch (this.f4082r) {
            case 0:
                ((C0277c) obj).x0();
                break;
            case 1:
                v0 v0Var = (v0) obj;
                if (v0Var.x()) {
                    v0Var.f4181s.i0(v0Var);
                }
                break;
            case 2:
                q0 q0Var = ((j0) obj).f4140W;
                if (q0Var != null) {
                    q0Var.invalidate();
                }
                break;
            case 3:
                j0 j0Var = (j0) obj;
                if (j0Var.x() && j0Var.b1(true)) {
                    I i10 = j0Var.f4125C;
                    M m10 = i10.f3915X;
                    if (m10.f3954l > 0) {
                        if (m10.f3953k || m10.j) {
                            i10.V(false);
                        }
                        m10.f3958p.k0();
                    }
                    r0 r0VarA = L.a(i10);
                    r0VarA.getRectManager().e(i10);
                    AndroidComposeView androidComposeView = (AndroidComposeView) r0VarA;
                    ((p011b0.e) androidComposeView.f12032g0.f4015e.f5618s).b(i10);
                    i10.f3923f0 = true;
                    androidComposeView.L(null);
                }
                break;
            case 4:
                o0 o0Var = (o0) obj;
                if (o0Var.x()) {
                    o0Var.f4156r.A();
                }
                break;
            case 5:
                I i11 = (I) obj;
                if (i11.H()) {
                    i11.V(false);
                }
                break;
            case 6:
                I i12 = (I) obj;
                if (i12.H()) {
                    i12.V(false);
                }
                break;
            case 7:
                I i13 = (I) obj;
                if (i13.H()) {
                    i13.T(false);
                }
                break;
            case 8:
                I i14 = (I) obj;
                if (i14.H()) {
                    i14.T(false);
                }
                break;
            case 9:
                I i15 = (I) obj;
                if (i15.H()) {
                    I.U(i15, false, 7);
                }
                break;
            case 10:
                I i16 = (I) obj;
                if (i16.H()) {
                    I.W(i16, false, 7);
                }
                break;
            default:
                I i17 = (I) obj;
                if (i17.H()) {
                    i17.F();
                }
                break;
        }
        return p110k9.y.f19095a;
    }
}
