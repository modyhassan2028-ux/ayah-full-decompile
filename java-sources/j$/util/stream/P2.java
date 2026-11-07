package j$.util.stream;

import j$.util.AbstractC1062c;
import j$.util.Objects;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: loaded from: classes2.dex */
public final class P2 extends T2 implements j$.util.Z {
    public final /* synthetic */ Q2 g;

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC1062c.b(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return AbstractC1062c.g(this, consumer);
    }

    @Override // j$.util.stream.T2
    public final void a(int i10, Object obj, Object obj2) {
        ((IntConsumer) obj2).accept(((int[]) obj)[i10]);
    }

    @Override // j$.util.stream.T2
    public final j$.util.f0 b(Object obj, int i10, int i11) {
        int[] iArr = (int[]) obj;
        int i12 = i11 + i10;
        j$.util.u0.a(((int[]) Objects.requireNonNull(iArr)).length, i10, i12);
        return new j$.util.r0(iArr, i10, i12, 1040);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P2(Q2 q10, int i10, int i11, int i12, int i13) {
        super(q10, i10, i11, i12, i13);
        this.g = q10;
    }

    @Override // j$.util.stream.T2
    public final j$.util.f0 c(int i10, int i11, int i12, int i13) {
        return new P2(this.g, i10, i11, i12, i13);
    }
}
