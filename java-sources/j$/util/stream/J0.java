package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.IntFunction;

/* JADX INFO: loaded from: classes2.dex */
public class J0 implements G0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object[] f18291a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f18292b;

    @Override // j$.util.stream.G0
    public final /* synthetic */ G0 j(long j, long j10, IntFunction intFunction) {
        return AbstractC1184v1.W(this, j, j10, intFunction);
    }

    @Override // j$.util.stream.G0
    public final /* synthetic */ int o() {
        return 0;
    }

    @Override // j$.util.stream.G0
    public final G0 a(int i10) {
        throw new IndexOutOfBoundsException();
    }

    public J0(long j, IntFunction intFunction) {
        if (j >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.f18291a = (Object[]) intFunction.apply((int) j);
        this.f18292b = 0;
    }

    public J0(Object[] objArr) {
        this.f18291a = objArr;
        this.f18292b = objArr.length;
    }

    @Override // j$.util.stream.G0
    public final Spliterator spliterator() {
        int i10 = this.f18292b;
        Object[] objArr = this.f18291a;
        j$.util.u0.a(((Object[]) Objects.requireNonNull(objArr)).length, 0, i10);
        return new j$.util.l0(objArr, 0, i10, 1040);
    }

    @Override // j$.util.stream.G0
    public final void k(Object[] objArr, int i10) {
        System.arraycopy(this.f18291a, 0, objArr, i10, this.f18292b);
    }

    @Override // j$.util.stream.G0
    public final Object[] m(IntFunction intFunction) {
        Object[] objArr = this.f18291a;
        if (objArr.length == this.f18292b) {
            return objArr;
        }
        throw new IllegalStateException();
    }

    @Override // j$.util.stream.G0
    public final long count() {
        return this.f18292b;
    }

    @Override // j$.util.stream.G0
    public final void forEach(Consumer consumer) {
        for (int i10 = 0; i10 < this.f18292b; i10++) {
            consumer.n(this.f18291a[i10]);
        }
    }

    public String toString() {
        Object[] objArr = this.f18291a;
        return String.format("ArrayNode[%d][%s]", Integer.valueOf(objArr.length - this.f18292b), Arrays.toString(objArr));
    }
}
