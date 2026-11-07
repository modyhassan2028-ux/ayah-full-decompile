package j$.util.stream;

import j$.util.AbstractC1062c;
import j$.util.Spliterator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: j$.util.stream.o3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1152o3 extends AbstractC1166r3 implements j$.util.W {
    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC1062c.a(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return AbstractC1062c.f(this, consumer);
    }

    @Override // j$.util.stream.AbstractC1176t3
    public final Spliterator a(Spliterator spliterator, long j, long j10, long j11, long j12) {
        return new C1152o3((j$.util.W) spliterator, j, j10, j11, j12);
    }

    @Override // j$.util.stream.AbstractC1166r3
    public final Object b() {
        return new C1203z0(1);
    }
}
