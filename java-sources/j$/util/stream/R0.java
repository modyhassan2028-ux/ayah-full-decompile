package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;

/* JADX INFO: loaded from: classes2.dex */
public final class R0 extends I0 {
    @Override // j$.util.stream.G0
    public final G0 j(long j, long j10, IntFunction intFunction) {
        if (j == 0 && j10 == this.f18278c) {
            return this;
        }
        long jCount = this.f18276a.count();
        if (j >= jCount) {
            return this.f18277b.j(j - jCount, j10 - jCount, intFunction);
        }
        if (j10 > jCount) {
            return AbstractC1184v1.f0(Z2.REFERENCE, this.f18276a.j(j, jCount, intFunction), this.f18277b.j(0L, j10 - jCount, intFunction));
        }
        return this.f18276a.j(j, j10, intFunction);
    }

    @Override // j$.util.stream.G0
    public final Spliterator spliterator() {
        return new C1120i1(this);
    }

    @Override // j$.util.stream.G0
    public final void k(Object[] objArr, int i10) {
        Objects.requireNonNull(objArr);
        G0 g10 = this.f18276a;
        g10.k(objArr, i10);
        this.f18277b.k(objArr, i10 + ((int) g10.count()));
    }

    @Override // j$.util.stream.G0
    public final Object[] m(IntFunction intFunction) {
        long j = this.f18278c;
        if (j >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        Object[] objArr = (Object[]) intFunction.apply((int) j);
        k(objArr, 0);
        return objArr;
    }

    @Override // j$.util.stream.G0
    public final void forEach(Consumer consumer) {
        this.f18276a.forEach(consumer);
        this.f18277b.forEach(consumer);
    }

    public final String toString() {
        long j = this.f18278c;
        return j < 32 ? String.format("ConcNode[%s.%s]", this.f18276a, this.f18277b) : String.format("ConcNode[size=%d]", Long.valueOf(j));
    }
}
