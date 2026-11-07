package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;

/* JADX INFO: loaded from: classes2.dex */
public final class O0 extends Q0 implements C0 {
    @Override // j$.util.stream.G0
    public final /* synthetic */ void forEach(Consumer consumer) {
        AbstractC1184v1.R(this, consumer);
    }

    @Override // j$.util.stream.G0
    public final /* synthetic */ G0 j(long j, long j10, IntFunction intFunction) {
        return AbstractC1184v1.U(this, j, j10);
    }

    @Override // j$.util.stream.G0
    public final /* synthetic */ void k(Object[] objArr, int i10) {
        AbstractC1184v1.O(this, (Integer[]) objArr, i10);
    }

    @Override // j$.util.stream.F0
    public final Object newArray(int i10) {
        return new int[i10];
    }

    @Override // j$.util.stream.G0
    public final Spliterator spliterator() {
        return new C1105f1(this);
    }

    @Override // j$.util.stream.G0
    public final j$.util.f0 spliterator() {
        return new C1105f1(this);
    }
}
