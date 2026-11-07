package i7;

import java.util.concurrent.Callable;

/* JADX INFO: renamed from: i7.m0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class CallableC1000m0 implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17466a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f17467b;

    public /* synthetic */ CallableC1000m0(C1003n0 c1003n0) {
        this.f17467b = c1003n0;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f17466a) {
            case 0:
                return new com.google.android.gms.internal.measurement.L1(((C1003n0) this.f17467b).f17474B);
            default:
                B0 b5 = (B0) this.f17467b;
                b5.f16830f.B();
                C0967b0 c0967b0 = b5.f16830f.f17111y;
                Q1.U(c0967b0);
                c0967b0.o();
                throw new IllegalStateException("Unexpected call on client side");
        }
    }

    public CallableC1000m0(B0 b5, C1022u c1022u, String str) {
        this.f17467b = b5;
    }
}
