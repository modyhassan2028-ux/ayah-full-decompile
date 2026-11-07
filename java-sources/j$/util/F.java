package j$.util;

import j$.util.stream.InterfaceC1136l2;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class F implements DoubleConsumer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18054a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Consumer f18055b;

    public /* synthetic */ F(Consumer consumer, int i10) {
        this.f18054a = i10;
        this.f18055b = consumer;
    }

    @Override // java.util.function.DoubleConsumer
    public final void accept(double d5) {
        switch (this.f18054a) {
            case 0:
                this.f18055b.accept(Double.valueOf(d5));
                break;
            default:
                ((InterfaceC1136l2) this.f18055b).accept(d5);
                break;
        }
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        switch (this.f18054a) {
            case 0:
                break;
        }
        return j$.com.android.tools.r8.a.d(this, doubleConsumer);
    }
}
