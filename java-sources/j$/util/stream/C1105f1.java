package j$.util.stream;

import j$.util.AbstractC1062c;
import java.util.function.Consumer;

/* JADX INFO: renamed from: j$.util.stream.f1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1105f1 extends AbstractC1115h1 implements j$.util.Z {
    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC1062c.b(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return AbstractC1062c.g(this, consumer);
    }
}
