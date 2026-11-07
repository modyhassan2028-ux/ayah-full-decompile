package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Predicate;
import java.util.function.Supplier;

/* JADX INFO: loaded from: classes2.dex */
public final class D implements E3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f18235a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f18236b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Predicate f18237c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Supplier f18238d;

    public D(boolean z10, Z2 z11, Object obj, Predicate predicate, Supplier supplier) {
        this.f18235a = (z10 ? 0 : Y2.f18409r) | Y2.f18412u;
        this.f18236b = obj;
        this.f18237c = predicate;
        this.f18238d = supplier;
    }

    @Override // j$.util.stream.E3
    public final int w() {
        return this.f18235a;
    }

    @Override // j$.util.stream.E3
    public final Object f(AbstractC1078a abstractC1078a, Spliterator spliterator) {
        F3 f3 = (F3) this.f18238d.get();
        abstractC1078a.E0(spliterator, f3);
        Object obj = f3.get();
        return obj != null ? obj : this.f18236b;
    }

    @Override // j$.util.stream.E3
    public final Object j(AbstractC1184v1 abstractC1184v1, Spliterator spliterator) {
        AbstractC1078a abstractC1078a = (AbstractC1078a) abstractC1184v1;
        return new J(this, Y2.ORDERED.v(abstractC1078a.f18426m), abstractC1078a, spliterator).invoke();
    }
}
