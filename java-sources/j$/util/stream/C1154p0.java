package j$.util.stream;

import java.util.function.IntConsumer;
import java.util.function.IntPredicate;

/* JADX INFO: renamed from: j$.util.stream.p0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1154p0 extends AbstractC1168s0 implements InterfaceC1126j2 {
    @Override // java.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        d((Integer) obj);
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return j$.com.android.tools.r8.a.e(this, intConsumer);
    }

    @Override // j$.util.stream.InterfaceC1126j2
    public final /* synthetic */ void d(Integer num) {
        AbstractC1184v1.G(this, num);
    }

    @Override // j$.util.stream.AbstractC1168s0, j$.util.stream.InterfaceC1136l2
    public final void accept(int i10) {
        if (this.f18540a) {
            return;
        }
        IntPredicate intPredicate = null;
        intPredicate.test(i10);
        throw null;
    }
}
