package j$.util.stream;

import java.util.function.DoublePredicate;

/* JADX INFO: loaded from: classes2.dex */
public final class O3 extends AbstractC1101e2 implements Q3 {
    @Override // j$.util.stream.Q3
    public final long h() {
        return 0L;
    }

    public O3(D2 d5, InterfaceC1136l2 interfaceC1136l2, boolean z10) {
        super(interfaceC1136l2);
    }

    @Override // j$.util.stream.InterfaceC1121i2, j$.util.stream.InterfaceC1136l2, java.util.function.DoubleConsumer
    public final void accept(double d5) {
        DoublePredicate doublePredicate = null;
        doublePredicate.test(d5);
        throw null;
    }
}
