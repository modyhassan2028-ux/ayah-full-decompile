package p214w;

import p180s0.F;
import p180s0.M;
import p180s0.q;
import p187t0.d;
import p223x.AbstractC1413d;
import p223x.C1424m;
import p223x.C1426o;
import p241y9.c;
import p251z9.k;

/* JADX INFO: renamed from: w.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1390c extends k implements c {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final C1390c f23473A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final C1390c f23474B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final C1390c f23475C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final C1390c f23476D;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final C1390c f23477s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final C1390c f23478t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final C1390c f23479u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final C1390c f23480v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final C1390c f23481w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final C1390c f23482x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final C1390c f23483y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final C1390c f23484z;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f23485r;

    static {
        int i10 = 1;
        f23477s = new C1390c(i10, 0);
        f23478t = new C1390c(i10, 1);
        f23479u = new C1390c(i10, 2);
        f23480v = new C1390c(i10, 3);
        f23481w = new C1390c(i10, 4);
        f23482x = new C1390c(i10, 5);
        f23483y = new C1390c(i10, 6);
        f23484z = new C1390c(i10, 7);
        f23473A = new C1390c(i10, 8);
        f23474B = new C1390c(i10, 9);
        f23475C = new C1390c(i10, 10);
        f23476D = new C1390c(i10, 11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1390c(int i10, int i11) {
        super(i10);
        this.f23485r = i11;
    }

    @Override // p241y9.c
    public final Object e(Object obj) {
        switch (this.f23485r) {
            case 0:
                return obj;
            case 1:
                return Integer.valueOf(((Number) obj).intValue());
            case 2:
                return Integer.valueOf(((Number) obj).intValue());
            case 3:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return bool;
            case 4:
                long jA = q.a(((q) obj).f21845a, d.f22534x);
                return new C1426o(q.d(jA), q.h(jA), q.g(jA), q.e(jA));
            case 5:
                return obj;
            case 6:
                long j = ((M) obj).f21816a;
                return new C1424m(M.b(j), M.c(j));
            case 7:
                C1424m c1424m = (C1424m) obj;
                return new M(F.h(c1424m.f24037a, c1424m.f24038b));
            case 8:
                return AbstractC1413d.p(0.0f, 7, null);
            case 9:
                ((Number) obj).intValue();
                return 0;
            case 10:
                ((Number) obj).intValue();
                return 0;
            default:
                return B.f23417c;
        }
    }
}
