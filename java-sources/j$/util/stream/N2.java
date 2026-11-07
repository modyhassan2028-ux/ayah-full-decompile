package j$.util.stream;

import j$.util.AbstractC1062c;
import j$.util.Objects;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* JADX INFO: loaded from: classes2.dex */
public final class N2 extends T2 implements j$.util.W {
    public final /* synthetic */ O2 g;

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC1062c.a(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return AbstractC1062c.f(this, consumer);
    }

    @Override // j$.util.stream.T2
    public final void a(int i10, Object obj, Object obj2) {
        ((DoubleConsumer) obj2).accept(((double[]) obj)[i10]);
    }

    @Override // j$.util.stream.T2
    public final j$.util.f0 b(Object obj, int i10, int i11) {
        double[] dArr = (double[]) obj;
        int i12 = i11 + i10;
        j$.util.u0.a(((double[]) Objects.requireNonNull(dArr)).length, i10, i12);
        return new j$.util.m0(dArr, i10, i12, 1040);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N2(O2 o10, int i10, int i11, int i12, int i13) {
        super(o10, i10, i11, i12, i13);
        this.g = o10;
    }

    @Override // j$.util.stream.T2
    public final j$.util.f0 c(int i10, int i11, int i12, int i13) {
        return new N2(this.g, i10, i11, i12, i13);
    }
}
