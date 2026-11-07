package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.IntFunction;

/* JADX INFO: loaded from: classes2.dex */
public class S0 implements A0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double[] f18353a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f18354b;

    @Override // j$.util.stream.G0
    public final /* synthetic */ void forEach(Consumer consumer) {
        AbstractC1184v1.Q(this, consumer);
    }

    @Override // j$.util.stream.G0
    public final /* synthetic */ G0 j(long j, long j10, IntFunction intFunction) {
        return AbstractC1184v1.T(this, j, j10);
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
        AbstractC1184v1.N(this, (Double[]) objArr, i10);
    }

    @Override // j$.util.stream.F0
    public final void f(int i10, Object obj) {
        int i11 = this.f18354b;
        System.arraycopy(this.f18353a, 0, (double[]) obj, i10, i11);
    }

    @Override // j$.util.stream.F0
    public final void g(Object obj) {
        DoubleConsumer doubleConsumer = (DoubleConsumer) obj;
        for (int i10 = 0; i10 < this.f18354b; i10++) {
            doubleConsumer.accept(this.f18353a[i10]);
        }
    }

    public S0(long j) {
        if (j >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.f18353a = new double[(int) j];
        this.f18354b = 0;
    }

    public S0(double[] dArr) {
        this.f18353a = dArr;
        this.f18354b = dArr.length;
    }

    @Override // j$.util.stream.G0
    public final Spliterator spliterator() {
        int i10 = this.f18354b;
        double[] dArr = this.f18353a;
        j$.util.u0.a(((double[]) Objects.requireNonNull(dArr)).length, 0, i10);
        return new j$.util.m0(dArr, 0, i10, 1040);
    }

    @Override // j$.util.stream.F0, j$.util.stream.G0
    public final j$.util.f0 spliterator() {
        int i10 = this.f18354b;
        double[] dArr = this.f18353a;
        j$.util.u0.a(((double[]) Objects.requireNonNull(dArr)).length, 0, i10);
        return new j$.util.m0(dArr, 0, i10, 1040);
    }

    @Override // j$.util.stream.F0
    public final Object b() {
        double[] dArr = this.f18353a;
        int length = dArr.length;
        int i10 = this.f18354b;
        return length == i10 ? dArr : Arrays.copyOf(dArr, i10);
    }

    @Override // j$.util.stream.G0
    public final long count() {
        return this.f18354b;
    }

    public String toString() {
        double[] dArr = this.f18353a;
        return String.format("DoubleArrayNode[%d][%s]", Integer.valueOf(dArr.length - this.f18354b), Arrays.toString(dArr));
    }
}
