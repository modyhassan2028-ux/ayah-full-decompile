package j$.util.stream;

import j$.util.AbstractC1062c;
import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: j$.util.stream.v3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1186v3 extends AbstractC1196x3 implements j$.util.Z, IntConsumer {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f18577f;

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return j$.com.android.tools.r8.a.e(this, intConsumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC1062c.b(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return AbstractC1062c.g(this, consumer);
    }

    @Override // j$.util.stream.A3
    public final Spliterator b(Spliterator spliterator) {
        return new C1186v3((j$.util.Z) spliterator, this);
    }

    @Override // j$.util.stream.AbstractC1196x3
    public final void g(Object obj) {
        ((IntConsumer) obj).accept(this.f18577f);
    }

    @Override // java.util.function.IntConsumer
    public final void accept(int i10) {
        this.f18577f = i10;
    }

    @Override // j$.util.stream.AbstractC1196x3
    public final AbstractC1102e3 j(int i10) {
        return new C1092c3(i10);
    }
}
