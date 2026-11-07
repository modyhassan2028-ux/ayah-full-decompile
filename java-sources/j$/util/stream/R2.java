package j$.util.stream;

import j$.util.AbstractC1062c;
import j$.util.Objects;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* JADX INFO: loaded from: classes2.dex */
public final class R2 extends T2 implements j$.util.c0 {
    public final /* synthetic */ S2 g;

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC1062c.c(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return AbstractC1062c.h(this, consumer);
    }

    @Override // j$.util.stream.T2
    public final void a(int i10, Object obj, Object obj2) {
        ((LongConsumer) obj2).accept(((long[]) obj)[i10]);
    }

    @Override // j$.util.stream.T2
    public final j$.util.f0 b(Object obj, int i10, int i11) {
        long[] jArr = (long[]) obj;
        int i12 = i11 + i10;
        j$.util.u0.a(((long[]) Objects.requireNonNull(jArr)).length, i10, i12);
        return new j$.util.t0(jArr, i10, i12, 1040);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public R2(S2 s10, int i10, int i11, int i12, int i13) {
        super(s10, i10, i11, i12, i13);
        this.g = s10;
    }

    @Override // j$.util.stream.T2
    public final j$.util.f0 c(int i10, int i11, int i12, int i13) {
        return new R2(this.g, i10, i11, i12, i13);
    }
}
