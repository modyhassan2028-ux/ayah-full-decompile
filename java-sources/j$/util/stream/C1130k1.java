package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.LongConsumer;

/* JADX INFO: renamed from: j$.util.stream.k1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C1130k1 implements E0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long[] f18492a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f18493b;

    @Override // j$.util.stream.G0
    public final /* synthetic */ void forEach(Consumer consumer) {
        AbstractC1184v1.S(this, consumer);
    }

    @Override // j$.util.stream.G0
    public final /* synthetic */ G0 j(long j, long j10, IntFunction intFunction) {
        return AbstractC1184v1.V(this, j, j10);
    }

    @Override // j$.util.stream.G0
    public final /* synthetic */ Object[] m(IntFunction intFunction) {
        return AbstractC1184v1.M(this, intFunction);
    }

    @Override // j$.util.stream.G0
    public final /* synthetic */ int o() {
        return 0;
    }

    @Override // j$.util.stream.G0
    public final /* bridge */ /* synthetic */ G0 a(int i10) {
        a(i10);
        throw null;
    }

    @Override // j$.util.stream.F0, j$.util.stream.G0
    public final F0 a(int i10) {
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.G0
    public final /* synthetic */ void k(Object[] objArr, int i10) {
        AbstractC1184v1.P(this, (Long[]) objArr, i10);
    }

    @Override // j$.util.stream.F0
    public final void f(int i10, Object obj) {
        int i11 = this.f18493b;
        System.arraycopy(this.f18492a, 0, (long[]) obj, i10, i11);
    }

    @Override // j$.util.stream.F0
    public final void g(Object obj) {
        LongConsumer longConsumer = (LongConsumer) obj;
        for (int i10 = 0; i10 < this.f18493b; i10++) {
            longConsumer.accept(this.f18492a[i10]);
        }
    }

    public C1130k1(long j) {
        if (j >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.f18492a = new long[(int) j];
        this.f18493b = 0;
    }

    public C1130k1(long[] jArr) {
        this.f18492a = jArr;
        this.f18493b = jArr.length;
    }

    @Override // j$.util.stream.G0
    public final Spliterator spliterator() {
        int i10 = this.f18493b;
        long[] jArr = this.f18492a;
        j$.util.u0.a(((long[]) Objects.requireNonNull(jArr)).length, 0, i10);
        return new j$.util.t0(jArr, 0, i10, 1040);
    }

    @Override // j$.util.stream.F0, j$.util.stream.G0
    public final j$.util.f0 spliterator() {
        int i10 = this.f18493b;
        long[] jArr = this.f18492a;
        j$.util.u0.a(((long[]) Objects.requireNonNull(jArr)).length, 0, i10);
        return new j$.util.t0(jArr, 0, i10, 1040);
    }

    @Override // j$.util.stream.F0
    public final Object b() {
        long[] jArr = this.f18492a;
        int length = jArr.length;
        int i10 = this.f18493b;
        return length == i10 ? jArr : Arrays.copyOf(jArr, i10);
    }

    @Override // j$.util.stream.G0
    public final long count() {
        return this.f18493b;
    }

    public String toString() {
        long[] jArr = this.f18492a;
        return String.format("LongArrayNode[%d][%s]", Integer.valueOf(jArr.length - this.f18493b), Arrays.toString(jArr));
    }
}
