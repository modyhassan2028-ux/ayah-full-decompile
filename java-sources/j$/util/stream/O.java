package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes2.dex */
public final class O extends P {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Consumer f18330b;

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

    public O(Consumer consumer, boolean z10) {
        super(z10);
        this.f18330b = consumer;
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final void n(Object obj) {
        this.f18330b.n(obj);
    }
}
