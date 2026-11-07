package j$.util.stream;

import j$.util.AbstractC1062c;
import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* JADX INFO: renamed from: j$.util.stream.u3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1181u3 extends AbstractC1196x3 implements j$.util.W, DoubleConsumer {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public double f18564f;

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.com.android.tools.r8.a.d(this, doubleConsumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC1062c.a(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return AbstractC1062c.f(this, consumer);
    }

    @Override // j$.util.stream.A3
    public final Spliterator b(Spliterator spliterator) {
        return new C1181u3((j$.util.W) spliterator, this);
    }

    @Override // j$.util.stream.AbstractC1196x3
    public final void g(Object obj) {
        ((DoubleConsumer) obj).accept(this.f18564f);
    }

    @Override // java.util.function.DoubleConsumer
    public final void accept(double d5) {
        this.f18564f = d5;
    }

    @Override // j$.util.stream.AbstractC1196x3
    public final AbstractC1102e3 j(int i10) {
        return new C1087b3(i10);
    }
}
