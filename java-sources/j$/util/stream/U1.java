package j$.util.stream;

import java.util.function.LongConsumer;

/* JADX INFO: loaded from: classes2.dex */
public final class U1 extends W1 implements InterfaceC1131k2 {
    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final /* bridge */ /* synthetic */ void n(Object obj) {
        l((Long) obj);
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return j$.com.android.tools.r8.a.f(this, longConsumer);
    }

    @Override // j$.util.stream.InterfaceC1131k2
    public final /* synthetic */ void l(Long l10) {
        AbstractC1184v1.I(this, l10);
    }

    @Override // j$.util.stream.R1, java.util.function.Supplier
    public final Object get() {
        return Long.valueOf(this.f18385b);
    }

    @Override // j$.util.stream.Q1
    public final void i(Q1 q10) {
        this.f18385b += ((W1) q10).f18385b;
    }

    @Override // j$.util.stream.W1, j$.util.stream.InterfaceC1136l2
    public final void accept(long j) {
        this.f18385b++;
    }
}
