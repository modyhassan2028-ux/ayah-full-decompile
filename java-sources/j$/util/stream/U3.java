package j$.util.stream;

import j$.util.AbstractC1062c;
import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
import java.util.function.IntPredicate;

/* JADX INFO: loaded from: classes2.dex */
public final class U3 extends X3 implements IntConsumer, j$.util.Z {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f18375e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f18376f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ U3(Spliterator spliterator, int i10) {
        super(spliterator);
        this.f18376f = i10;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ U3(Spliterator spliterator, X3 x9, int i10) {
        super(spliterator, x9);
        this.f18376f = i10;
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return j$.com.android.tools.r8.a.e(this, intConsumer);
    }

    @Override // j$.util.stream.X3, j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC1062c.b(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return AbstractC1062c.g(this, consumer);
    }

    @Override // j$.util.f0
    public final void forEachRemaining(IntConsumer intConsumer) {
        while (tryAdvance(intConsumer)) {
        }
    }

    @Override // java.util.function.IntConsumer
    public final void accept(int i10) {
        this.f18394d = (this.f18394d + 1) & 63;
        this.f18375e = i10;
    }

    @Override // j$.util.stream.X3
    public final Spliterator b(Spliterator spliterator) {
        switch (this.f18376f) {
            case 0:
                return new U3((j$.util.Z) spliterator, this, 0);
            default:
                return new U3((j$.util.Z) spliterator, this, 1);
        }
    }

    @Override // j$.util.stream.X3, j$.util.Spliterator
    public /* bridge */ /* synthetic */ Spliterator trySplit() {
        switch (this.f18376f) {
            case 1:
                return trySplit();
            default:
                return super.trySplit();
        }
    }

    @Override // j$.util.stream.X3, j$.util.Spliterator
    public /* bridge */ /* synthetic */ j$.util.f0 trySplit() {
        switch (this.f18376f) {
            case 1:
                return trySplit();
            default:
                return super.trySplit();
        }
    }

    @Override // j$.util.Z
    public final boolean tryAdvance(IntConsumer intConsumer) {
        switch (this.f18376f) {
            case 0:
                boolean z10 = this.f18393c;
                Spliterator spliterator = this.f18391a;
                if (z10) {
                    this.f18393c = false;
                    boolean zTryAdvance = ((j$.util.Z) spliterator).tryAdvance((IntConsumer) this);
                    if (zTryAdvance && a()) {
                        IntPredicate intPredicate = null;
                        intPredicate.test(this.f18375e);
                        throw null;
                    }
                    if (!zTryAdvance) {
                        return zTryAdvance;
                    }
                    intConsumer.accept(this.f18375e);
                    return zTryAdvance;
                }
                return ((j$.util.Z) spliterator).tryAdvance(intConsumer);
            default:
                if (this.f18393c && a() && ((j$.util.Z) this.f18391a).tryAdvance((IntConsumer) this)) {
                    IntPredicate intPredicate2 = null;
                    intPredicate2.test(this.f18375e);
                    throw null;
                }
                this.f18393c = false;
                return false;
        }
    }

    @Override // j$.util.stream.X3, j$.util.Spliterator
    public j$.util.Z trySplit() {
        switch (this.f18376f) {
            case 1:
                if (this.f18392b.get()) {
                    return null;
                }
                return (j$.util.Z) super.trySplit();
            default:
                return super.trySplit();
        }
    }

    @Override // j$.util.f0
    public /* bridge */ /* synthetic */ boolean tryAdvance(Object obj) {
        switch (this.f18376f) {
            case 1:
                tryAdvance((IntConsumer) obj);
                return false;
            default:
                return tryAdvance((IntConsumer) obj);
        }
    }
}
