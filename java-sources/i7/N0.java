package i7;

import j$.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class N0 implements Runnable {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ boolean f17036r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Y0 f17037s;

    public N0(Y0 y10, boolean z10) {
        this.f17036r = z10;
        Objects.requireNonNull(y10);
        this.f17037s = y10;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x004e  */
    @Override // java.lang.Runnable
    public final void run() {
        Y0 y10 = this.f17037s;
        C1023u0 c1023u0 = (C1023u0) y10.f16104r;
        boolean zA = c1023u0.a();
        boolean z10 = false;
        boolean z11 = c1023u0.f17578P != null && c1023u0.f17578P.booleanValue();
        boolean z12 = this.f17036r;
        c1023u0.f17578P = Boolean.valueOf(z12);
        if (z11 == z12) {
            X x9 = c1023u0.f17584w;
            C1023u0.m(x9);
            x9.f17178E.b(Boolean.valueOf(z12), "Default data collection state already set to");
        }
        if (c1023u0.a() != zA) {
            boolean zA2 = c1023u0.a();
            if (c1023u0.f17578P != null && c1023u0.f17578P.booleanValue()) {
                z10 = true;
            }
            if (zA2 != z10) {
                X x10 = c1023u0.f17584w;
                C1023u0.m(x10);
                x10.f17175B.c(Boolean.valueOf(z12), Boolean.valueOf(zA), "Default data collection is different than actual status");
            }
        } else {
            X x11 = c1023u0.f17584w;
            C1023u0.m(x11);
            x11.f17175B.c(Boolean.valueOf(z12), Boolean.valueOf(zA), "Default data collection is different than actual status");
        }
        y10.G();
    }
}
