package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.LongConsumer;

/* JADX INFO: loaded from: classes2.dex */
public final class N extends P implements InterfaceC1131k2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LongConsumer f18325b;

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final /* bridge */ /* synthetic */ void n(Object obj) {
        l((Long) obj);
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return j$.com.android.tools.r8.a.f(this, longConsumer);
    }

    @Override // java.util.function.Supplier
    public final /* bridge */ /* synthetic */ Object get() {
        return null;
    }

    @Override // j$.util.stream.InterfaceC1131k2
    public final /* synthetic */ void l(Long l10) {
        AbstractC1184v1.I(this, l10);
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

    public N(LongConsumer longConsumer, boolean z10) {
        super(z10);
        this.f18325b = longConsumer;
    }

    @Override // j$.util.stream.P, j$.util.stream.InterfaceC1136l2
    public final void accept(long j) {
        this.f18325b.accept(j);
    }
}
