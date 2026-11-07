package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.IntConsumer;

/* JADX INFO: loaded from: classes2.dex */
public final class M extends P implements InterfaceC1126j2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final IntConsumer f18313b;

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final /* bridge */ /* synthetic */ void n(Object obj) {
        d((Integer) obj);
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return j$.com.android.tools.r8.a.e(this, intConsumer);
    }

    @Override // j$.util.stream.InterfaceC1126j2
    public final /* synthetic */ void d(Integer num) {
        AbstractC1184v1.G(this, num);
    }

    @Override // java.util.function.Supplier
    public final /* bridge */ /* synthetic */ Object get() {
        return null;
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

    public M(IntConsumer intConsumer, boolean z10) {
        super(z10);
        this.f18313b = intConsumer;
    }

    @Override // j$.util.stream.P, j$.util.stream.InterfaceC1136l2
    public final void accept(int i10) {
        this.f18313b.accept(i10);
    }
}
