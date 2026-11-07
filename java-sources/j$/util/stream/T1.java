package j$.util.stream;

import java.util.function.IntConsumer;

/* JADX INFO: loaded from: classes2.dex */
public final class T1 extends W1 implements InterfaceC1126j2 {
    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final /* bridge */ /* synthetic */ void n(Object obj) {
        d((Integer) obj);
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return j$.com.android.tools.r8.a.e(this, intConsumer);
    }

    @Override // j$.util.stream.InterfaceC1126j2
    public final /* synthetic */ void d(Integer num) {
        AbstractC1184v1.G(this, num);
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
    public final void accept(int i10) {
        this.f18385b++;
    }
}
