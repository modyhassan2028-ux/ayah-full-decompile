package j$.util.stream;

import java.util.function.DoubleConsumer;

/* JADX INFO: loaded from: classes2.dex */
public final class S1 extends W1 implements InterfaceC1121i2 {
    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final /* bridge */ /* synthetic */ void n(Object obj) {
        n((Double) obj);
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.com.android.tools.r8.a.d(this, doubleConsumer);
    }

    @Override // j$.util.stream.InterfaceC1121i2
    public final /* synthetic */ void n(Double d5) {
        AbstractC1184v1.E(this, d5);
    }

    @Override // j$.util.stream.R1, java.util.function.Supplier
    public final Object get() {
        return Long.valueOf(this.f18385b);
    }

    @Override // j$.util.stream.Q1
    public final void i(Q1 q10) {
        this.f18385b += ((W1) q10).f18385b;
    }

    @Override // j$.util.stream.W1, j$.util.stream.InterfaceC1136l2, java.util.function.DoubleConsumer
    public final void accept(double d5) {
        this.f18385b++;
    }
}
