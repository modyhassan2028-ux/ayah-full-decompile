package j$.util.stream;

import j$.util.AbstractC1062c;
import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* JADX INFO: renamed from: j$.util.stream.w3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1191w3 extends AbstractC1196x3 implements j$.util.c0, LongConsumer {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f18581f;

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return j$.com.android.tools.r8.a.f(this, longConsumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC1062c.c(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return AbstractC1062c.h(this, consumer);
    }

    @Override // j$.util.stream.A3
    public final Spliterator b(Spliterator spliterator) {
        return new C1191w3((j$.util.c0) spliterator, this);
    }

    @Override // j$.util.stream.AbstractC1196x3
    public final void g(Object obj) {
        ((LongConsumer) obj).accept(this.f18581f);
    }

    @Override // java.util.function.LongConsumer
    public final void accept(long j) {
        this.f18581f = j;
    }

    @Override // j$.util.stream.AbstractC1196x3
    public final AbstractC1102e3 j(int i10) {
        return new C1097d3(i10);
    }
}
