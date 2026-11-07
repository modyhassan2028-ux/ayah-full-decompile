package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;

/* JADX INFO: renamed from: j$.util.stream.b1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C1085b1 implements C0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f18443a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f18444b;

    @Override // j$.util.stream.G0
    public final /* synthetic */ void forEach(Consumer consumer) {
        AbstractC1184v1.R(this, consumer);
    }

    @Override // j$.util.stream.G0
    public final /* synthetic */ G0 j(long j, long j10, IntFunction intFunction) {
        return AbstractC1184v1.U(this, j, j10);
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
        AbstractC1184v1.O(this, (Integer[]) objArr, i10);
    }

    @Override // j$.util.stream.F0
    public final void f(int i10, Object obj) {
        int i11 = this.f18444b;
        System.arraycopy(this.f18443a, 0, (int[]) obj, i10, i11);
    }

    @Override // j$.util.stream.F0
    public final void g(Object obj) {
        IntConsumer intConsumer = (IntConsumer) obj;
        for (int i10 = 0; i10 < this.f18444b; i10++) {
            intConsumer.accept(this.f18443a[i10]);
        }
    }

    public C1085b1(long j) {
        if (j >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.f18443a = new int[(int) j];
        this.f18444b = 0;
    }

    public C1085b1(int[] iArr) {
        this.f18443a = iArr;
        this.f18444b = iArr.length;
    }

    @Override // j$.util.stream.G0
    public final Spliterator spliterator() {
        int i10 = this.f18444b;
        int[] iArr = this.f18443a;
        j$.util.u0.a(((int[]) Objects.requireNonNull(iArr)).length, 0, i10);
        return new j$.util.r0(iArr, 0, i10, 1040);
    }

    @Override // j$.util.stream.F0, j$.util.stream.G0
    public final j$.util.f0 spliterator() {
        int i10 = this.f18444b;
        int[] iArr = this.f18443a;
        j$.util.u0.a(((int[]) Objects.requireNonNull(iArr)).length, 0, i10);
        return new j$.util.r0(iArr, 0, i10, 1040);
    }

    @Override // j$.util.stream.F0
    public final Object b() {
        int[] iArr = this.f18443a;
        int length = iArr.length;
        int i10 = this.f18444b;
        return length == i10 ? iArr : Arrays.copyOf(iArr, i10);
    }

    @Override // j$.util.stream.G0
    public final long count() {
        return this.f18444b;
    }

    public String toString() {
        int[] iArr = this.f18443a;
        return String.format("IntArrayNode[%d][%s]", Integer.valueOf(iArr.length - this.f18444b), Arrays.toString(iArr));
    }
}
