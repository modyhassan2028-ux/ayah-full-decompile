package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* JADX INFO: renamed from: j$.util.stream.s0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1168s0 implements InterfaceC1136l2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f18540a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f18541b;

    @Override // j$.util.stream.InterfaceC1136l2, java.util.function.DoubleConsumer
    public /* synthetic */ void accept(double d5) {
        AbstractC1184v1.D();
        throw null;
    }

    @Override // j$.util.stream.InterfaceC1136l2
    public /* synthetic */ void accept(int i10) {
        AbstractC1184v1.K();
        throw null;
    }

    @Override // j$.util.stream.InterfaceC1136l2
    public /* synthetic */ void accept(long j) {
        AbstractC1184v1.L();
        throw null;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.InterfaceC1136l2
    public final /* synthetic */ void c(long j) {
    }

    @Override // j$.util.stream.InterfaceC1136l2
    public final /* synthetic */ void end() {
    }

    public AbstractC1168s0(EnumC1173t0 enumC1173t0) {
        this.f18541b = !enumC1173t0.f18548b;
    }

    @Override // j$.util.stream.InterfaceC1136l2
    public final boolean e() {
        return this.f18540a;
    }
}
