package j$.util;

import j$.util.stream.InterfaceC1136l2;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class J implements IntConsumer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18058a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Consumer f18059b;

    public /* synthetic */ J(Consumer consumer, int i10) {
        this.f18058a = i10;
        this.f18059b = consumer;
    }

    @Override // java.util.function.IntConsumer
    public final void accept(int i10) {
        switch (this.f18058a) {
            case 0:
                this.f18059b.accept(Integer.valueOf(i10));
                break;
            default:
                ((InterfaceC1136l2) this.f18059b).accept(i10);
                break;
        }
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        switch (this.f18058a) {
            case 0:
                break;
        }
        return j$.com.android.tools.r8.a.e(this, intConsumer);
    }
}
