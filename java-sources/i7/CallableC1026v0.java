package i7;

import j$.util.Objects;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: i7.v0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC1026v0 implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17617a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f17618b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f17619c;

    public /* synthetic */ CallableC1026v0(B0 b5, Object obj, int i10) {
        this.f17617a = i10;
        this.f17619c = obj;
        this.f17618b = b5;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() throws Throwable {
        switch (this.f17617a) {
            case 0:
                B0 b5 = (B0) this.f17618b;
                b5.f16830f.B();
                C0999m c0999m = b5.f16830f.f17106t;
                Q1.U(c0999m);
                return c0999m.j0((String) this.f17619c);
            case 1:
                B0 b10 = (B0) this.f17618b;
                b10.f16830f.B();
                return new C0987i(b10.f16830f.p0(((X1) this.f17619c).f17204r));
            default:
                X1 x9 = (X1) this.f17619c;
                String str = x9.f17204r;
                U6.y.f(str);
                Q1 q10 = (Q1) this.f17618b;
                H0 h0A = q10.a(str);
                G0 g10 = G0.f16990t;
                if (h0A.i(g10) && H0.c(100, x9.f17196J).i(g10)) {
                    return q10.c0(x9).E();
                }
                q10.b().f17178E.a("Analytics storage consent denied. Returning null app instance id");
                return null;
        }
    }

    public CallableC1026v0(Q1 q10, X1 x9) {
        this.f17617a = 2;
        this.f17619c = x9;
        Objects.requireNonNull(q10);
        this.f17618b = q10;
    }
}
