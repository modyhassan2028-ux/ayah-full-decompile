package j$.util;

import j$.util.stream.InterfaceC1136l2;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class N implements LongConsumer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18062a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Consumer f18063b;

    public /* synthetic */ N(Consumer consumer, int i10) {
        this.f18062a = i10;
        this.f18063b = consumer;
    }

    @Override // java.util.function.LongConsumer
    public final void accept(long j) {
        switch (this.f18062a) {
            case 0:
                this.f18063b.accept(Long.valueOf(j));
                break;
            default:
                ((InterfaceC1136l2) this.f18063b).accept(j);
                break;
        }
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        switch (this.f18062a) {
            case 0:
                break;
        }
        return j$.com.android.tools.r8.a.f(this, longConsumer);
    }
}
