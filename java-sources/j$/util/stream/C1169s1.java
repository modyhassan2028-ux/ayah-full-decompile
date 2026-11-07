package j$.util.stream;

import java.util.function.IntFunction;

/* JADX INFO: renamed from: j$.util.stream.s1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1169s1 extends V2 implements G0, InterfaceC1198y0 {
    @Override // j$.util.stream.InterfaceC1136l2, java.util.function.DoubleConsumer
    public final /* synthetic */ void accept(double d5) {
        AbstractC1184v1.D();
        throw null;
    }

    @Override // j$.util.stream.InterfaceC1136l2
    public final /* synthetic */ void accept(int i10) {
        AbstractC1184v1.K();
        throw null;
    }

    @Override // j$.util.stream.InterfaceC1136l2
    public final /* synthetic */ void accept(long j) {
        AbstractC1184v1.L();
        throw null;
    }

    @Override // j$.util.stream.InterfaceC1198y0
    public final G0 build() {
        return this;
    }

    @Override // j$.util.stream.InterfaceC1136l2
    public final /* synthetic */ boolean e() {
        return false;
    }

    @Override // j$.util.stream.InterfaceC1136l2
    public final void end() {
    }

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

    @Override // j$.util.stream.G0
    public final void k(Object[] objArr, int i10) {
        long j = i10;
        long jCount = count() + j;
        if (jCount > objArr.length || jCount < j) {
            throw new IndexOutOfBoundsException("does not fit");
        }
        if (this.f18448c == 0) {
            System.arraycopy(this.f18378e, 0, objArr, i10, this.f18447b);
            return;
        }
        for (int i11 = 0; i11 < this.f18448c; i11++) {
            Object[] objArr2 = this.f18379f[i11];
            System.arraycopy(objArr2, 0, objArr, i10, objArr2.length);
            i10 += this.f18379f[i11].length;
        }
        int i12 = this.f18447b;
        if (i12 > 0) {
            System.arraycopy(this.f18378e, 0, objArr, i10, i12);
        }
    }

    @Override // j$.util.stream.G0
    public final Object[] m(IntFunction intFunction) {
        long jCount = count();
        if (jCount >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        Object[] objArr = (Object[]) intFunction.apply((int) jCount);
        k(objArr, 0);
        return objArr;
    }

    @Override // j$.util.stream.InterfaceC1136l2
    public final void c(long j) {
        clear();
        p(j);
    }
}
