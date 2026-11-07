package j$.util.stream;

import j$.util.AbstractC1062c;
import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.DoublePredicate;

/* JADX INFO: loaded from: classes2.dex */
public final class T3 extends X3 implements DoubleConsumer, j$.util.W {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public double f18369e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f18370f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ T3(Spliterator spliterator, int i10) {
        super(spliterator);
        this.f18370f = i10;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ T3(Spliterator spliterator, X3 x9, int i10) {
        super(spliterator, x9);
        this.f18370f = i10;
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.com.android.tools.r8.a.d(this, doubleConsumer);
    }

    @Override // j$.util.stream.X3, j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC1062c.a(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return AbstractC1062c.f(this, consumer);
    }

    @Override // j$.util.f0
    public final void forEachRemaining(DoubleConsumer doubleConsumer) {
        while (tryAdvance(doubleConsumer)) {
        }
    }

    @Override // java.util.function.DoubleConsumer
    public final void accept(double d5) {
        this.f18394d = (this.f18394d + 1) & 63;
        this.f18369e = d5;
    }

    @Override // j$.util.stream.X3
    public final Spliterator b(Spliterator spliterator) {
        switch (this.f18370f) {
            case 0:
                return new T3((j$.util.W) spliterator, this, 0);
            default:
                return new T3((j$.util.W) spliterator, this, 1);
        }
    }

    @Override // j$.util.stream.X3, j$.util.Spliterator
    public /* bridge */ /* synthetic */ Spliterator trySplit() {
        switch (this.f18370f) {
            case 1:
                return trySplit();
            default:
                return super.trySplit();
        }
    }

    @Override // j$.util.stream.X3, j$.util.Spliterator
    public /* bridge */ /* synthetic */ j$.util.f0 trySplit() {
        switch (this.f18370f) {
            case 1:
                return trySplit();
            default:
                return super.trySplit();
        }
    }

    @Override // j$.util.W
    public final boolean tryAdvance(DoubleConsumer doubleConsumer) {
        switch (this.f18370f) {
            case 0:
                boolean z10 = this.f18393c;
                Spliterator spliterator = this.f18391a;
                if (z10) {
                    this.f18393c = false;
                    boolean zTryAdvance = ((j$.util.W) spliterator).tryAdvance((DoubleConsumer) this);
                    if (zTryAdvance && a()) {
                        DoublePredicate doublePredicate = null;
                        doublePredicate.test(this.f18369e);
                        throw null;
                    }
                    if (!zTryAdvance) {
                        return zTryAdvance;
                    }
                    doubleConsumer.accept(this.f18369e);
                    return zTryAdvance;
                }
                return ((j$.util.W) spliterator).tryAdvance(doubleConsumer);
            default:
                if (this.f18393c && a() && ((j$.util.W) this.f18391a).tryAdvance((DoubleConsumer) this)) {
                    DoublePredicate doublePredicate2 = null;
                    doublePredicate2.test(this.f18369e);
                    throw null;
                }
                this.f18393c = false;
                return false;
        }
    }

    @Override // j$.util.stream.X3, j$.util.Spliterator
    public j$.util.W trySplit() {
        switch (this.f18370f) {
            case 1:
                if (this.f18392b.get()) {
                    return null;
                }
                return (j$.util.W) super.trySplit();
            default:
                return super.trySplit();
        }
    }

    @Override // j$.util.f0
    public /* bridge */ /* synthetic */ boolean tryAdvance(Object obj) {
        switch (this.f18370f) {
            case 1:
                tryAdvance((DoubleConsumer) obj);
                return false;
            default:
                return tryAdvance((DoubleConsumer) obj);
        }
    }
}
