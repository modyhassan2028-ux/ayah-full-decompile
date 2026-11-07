package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes2.dex */
public abstract class W1 extends R1 implements Q1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f18385b;

    public /* synthetic */ void accept(double d5) {
        AbstractC1184v1.D();
        throw null;
    }

    public /* synthetic */ void accept(int i10) {
        AbstractC1184v1.K();
        throw null;
    }

    public /* synthetic */ void accept(long j) {
        AbstractC1184v1.L();
        throw null;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.InterfaceC1136l2
    public final /* synthetic */ boolean e() {
        return false;
    }

    @Override // j$.util.stream.InterfaceC1136l2
    public final /* synthetic */ void end() {
    }

    @Override // j$.util.stream.InterfaceC1136l2
    public final void c(long j) {
        this.f18385b = 0L;
    }
}
