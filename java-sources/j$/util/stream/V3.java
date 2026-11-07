package j$.util.stream;

import j$.util.AbstractC1062c;
import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.LongConsumer;
import java.util.function.LongPredicate;

/* JADX INFO: loaded from: classes2.dex */
public final class V3 extends X3 implements LongConsumer, j$.util.c0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f18380e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f18381f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ V3(Spliterator spliterator, int i10) {
        super(spliterator);
        this.f18381f = i10;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ V3(Spliterator spliterator, X3 x9, int i10) {
        super(spliterator, x9);
        this.f18381f = i10;
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return j$.com.android.tools.r8.a.f(this, longConsumer);
    }

    @Override // j$.util.stream.X3, j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC1062c.c(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return AbstractC1062c.h(this, consumer);
    }

    @Override // j$.util.f0
    public final void forEachRemaining(LongConsumer longConsumer) {
        while (tryAdvance(longConsumer)) {
        }
    }

    @Override // java.util.function.LongConsumer
    public final void accept(long j) {
        this.f18394d = (this.f18394d + 1) & 63;
        this.f18380e = j;
    }

    @Override // j$.util.stream.X3
    public final Spliterator b(Spliterator spliterator) {
        switch (this.f18381f) {
            case 0:
                return new V3((j$.util.c0) spliterator, this, 0);
            default:
                return new V3((j$.util.c0) spliterator, this, 1);
        }
    }

    @Override // j$.util.stream.X3, j$.util.Spliterator
    public /* bridge */ /* synthetic */ Spliterator trySplit() {
        switch (this.f18381f) {
            case 1:
                return trySplit();
            default:
                return super.trySplit();
        }
    }

    @Override // j$.util.stream.X3, j$.util.Spliterator
    public /* bridge */ /* synthetic */ j$.util.f0 trySplit() {
        switch (this.f18381f) {
            case 1:
                return trySplit();
            default:
                return super.trySplit();
        }
    }

    @Override // j$.util.c0
    public final boolean tryAdvance(LongConsumer longConsumer) {
        switch (this.f18381f) {
            case 0:
                boolean z10 = this.f18393c;
                Spliterator spliterator = this.f18391a;
                if (z10) {
                    this.f18393c = false;
                    boolean zTryAdvance = ((j$.util.c0) spliterator).tryAdvance((LongConsumer) this);
                    if (zTryAdvance && a()) {
                        LongPredicate longPredicate = null;
                        longPredicate.test(this.f18380e);
                        throw null;
                    }
                    if (!zTryAdvance) {
                        return zTryAdvance;
                    }
                    longConsumer.accept(this.f18380e);
                    return zTryAdvance;
                }
                return ((j$.util.c0) spliterator).tryAdvance(longConsumer);
            default:
                if (this.f18393c && a() && ((j$.util.c0) this.f18391a).tryAdvance((LongConsumer) this)) {
                    LongPredicate longPredicate2 = null;
                    longPredicate2.test(this.f18380e);
                    throw null;
                }
                this.f18393c = false;
                return false;
        }
    }

    @Override // j$.util.stream.X3, j$.util.Spliterator
    public j$.util.c0 trySplit() {
        switch (this.f18381f) {
            case 1:
                if (this.f18392b.get()) {
                    return null;
                }
                return (j$.util.c0) super.trySplit();
            default:
                return super.trySplit();
        }
    }

    @Override // j$.util.f0
    public /* bridge */ /* synthetic */ boolean tryAdvance(Object obj) {
        switch (this.f18381f) {
            case 1:
                tryAdvance((LongConsumer) obj);
                return false;
            default:
                return tryAdvance((LongConsumer) obj);
        }
    }
}
