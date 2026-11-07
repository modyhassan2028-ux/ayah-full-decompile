package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.DoubleConsumer;

/* JADX INFO: loaded from: classes2.dex */
public final class L extends P implements InterfaceC1121i2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DoubleConsumer f18306b;

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final /* bridge */ /* synthetic */ void n(Object obj) {
        n((Double) obj);
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.com.android.tools.r8.a.d(this, doubleConsumer);
    }

    @Override // java.util.function.Supplier
    public final /* bridge */ /* synthetic */ Object get() {
        return null;
    }

    @Override // j$.util.stream.InterfaceC1121i2
    public final /* synthetic */ void n(Double d5) {
        AbstractC1184v1.E(this, d5);
    }

    @Override // j$.util.stream.E3
    public final Object f(AbstractC1078a abstractC1078a, Spliterator spliterator) {
        abstractC1078a.E0(spliterator, this);
        return null;
    }

    @Override // j$.util.stream.E3
    public final /* bridge */ /* synthetic */ Object j(AbstractC1184v1 abstractC1184v1, Spliterator spliterator) {
        a(abstractC1184v1, spliterator);
        return null;
    }

    public L(DoubleConsumer doubleConsumer, boolean z10) {
        super(z10);
        this.f18306b = doubleConsumer;
    }

    @Override // j$.util.stream.P, j$.util.stream.InterfaceC1136l2, java.util.function.DoubleConsumer
    public final void accept(double d5) {
        this.f18306b.accept(d5);
    }
}
