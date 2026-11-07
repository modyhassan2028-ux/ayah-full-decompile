package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes2.dex */
public abstract class I implements F3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f18274a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f18275b;

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

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final void n(Object obj) {
        if (this.f18274a) {
            return;
        }
        this.f18274a = true;
        this.f18275b = obj;
    }

    @Override // j$.util.stream.InterfaceC1136l2
    public final boolean e() {
        return this.f18274a;
    }
}
