package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;

/* JADX INFO: loaded from: classes2.dex */
public final class X0 extends Z0 implements E0 {
    @Override // j$.util.stream.G0
    public final /* synthetic */ void forEach(Consumer consumer) {
        AbstractC1184v1.S(this, consumer);
    }

    @Override // j$.util.stream.Z0, j$.util.stream.G0
    public final /* synthetic */ G0 j(long j, long j10, IntFunction intFunction) {
        return AbstractC1184v1.V(this, j, j10);
    }

    @Override // j$.util.stream.Z0, j$.util.stream.G0
    public final /* bridge */ /* synthetic */ G0 a(int i10) {
        a(i10);
        throw null;
    }

    @Override // j$.util.stream.Z0, j$.util.stream.G0
    public final F0 a(int i10) {
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.G0
    public final /* synthetic */ void k(Object[] objArr, int i10) {
        AbstractC1184v1.P(this, (Long[]) objArr, i10);
    }

    @Override // j$.util.stream.F0
    public final /* bridge */ /* synthetic */ Object b() {
        return AbstractC1184v1.f18571f;
    }

    @Override // j$.util.stream.G0
    public final /* bridge */ /* synthetic */ Spliterator spliterator() {
        return j$.util.u0.f18607c;
    }

    @Override // j$.util.stream.G0
    public final /* bridge */ /* synthetic */ j$.util.f0 spliterator() {
        return j$.util.u0.f18607c;
    }
}
