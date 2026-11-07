package W;

import Z.C0698o;

/* JADX INFO: renamed from: W.a1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0537a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Z.M0 f8962a = new Z.M0(C0564h0.f9145A);

    public static final p180s0.J a(int i10, C0698o c0698o) {
        Z0 z10 = (Z0) c0698o.k(f8962a);
        switch (AbstractC0607v1.b(i10)) {
            case 0:
                return z10.f8938e;
            case 1:
                return b(z10.f8938e);
            case 2:
                return z10.f8934a;
            case 3:
                return b(z10.f8934a);
            case 4:
                return J.e.f3871a;
            case 5:
                return z10.f8937d;
            case 6:
                float f3 = (float) 0.0d;
                return J.d.a(z10.f8937d, new J.b(f3), null, null, new J.b(f3), 6);
            case 7:
                return b(z10.f8937d);
            case 8:
                return z10.f8936c;
            case 9:
                return p180s0.F.f21774a;
            case 10:
                return z10.f8935b;
            default:
                throw new A6.a();
        }
    }

    public static final J.d b(J.d dVar) {
        float f3 = (float) 0.0d;
        return J.d.a(dVar, null, null, new J.b(f3), new J.b(f3), 3);
    }
}
