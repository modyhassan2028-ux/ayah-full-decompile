package j$.util.stream;

import java.util.function.IntFunction;

/* JADX INFO: loaded from: classes2.dex */
public abstract class Z0 implements G0 {
    @Override // j$.util.stream.G0
    public final long count() {
        return 0L;
    }

    public final void g(Object obj) {
    }

    @Override // j$.util.stream.G0
    public /* synthetic */ G0 j(long j, long j10, IntFunction intFunction) {
        return AbstractC1184v1.W(this, j, j10, intFunction);
    }

    @Override // j$.util.stream.G0
    public final /* synthetic */ int o() {
        return 0;
    }

    @Override // j$.util.stream.G0
    public G0 a(int i10) {
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.G0
    public final Object[] m(IntFunction intFunction) {
        return (Object[]) intFunction.apply(0);
    }

    public final void f(int i10, Object obj) {
    }
}
