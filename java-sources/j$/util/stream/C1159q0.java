package j$.util.stream;

import java.util.function.LongConsumer;
import java.util.function.LongPredicate;

/* JADX INFO: renamed from: j$.util.stream.q0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1159q0 extends AbstractC1168s0 implements InterfaceC1131k2 {
    @Override // java.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        l((Long) obj);
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return j$.com.android.tools.r8.a.f(this, longConsumer);
    }

    @Override // j$.util.stream.InterfaceC1131k2
    public final /* synthetic */ void l(Long l10) {
        AbstractC1184v1.I(this, l10);
    }

    @Override // j$.util.stream.AbstractC1168s0, j$.util.stream.InterfaceC1136l2
    public final void accept(long j) {
        if (this.f18540a) {
            return;
        }
        LongPredicate longPredicate = null;
        longPredicate.test(j);
        throw null;
    }
}
