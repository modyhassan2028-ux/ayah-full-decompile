package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;
import java.util.function.Predicate;

/* JADX INFO: loaded from: classes2.dex */
public final class W3 extends X3 implements Consumer {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Predicate f18387e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f18388f;
    public final /* synthetic */ int g;

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W3(Spliterator spliterator, Predicate predicate, int i10) {
        super(spliterator);
        this.g = i10;
        this.f18387e = predicate;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W3(Spliterator spliterator, W3 w9, int i10) {
        super(spliterator, w9);
        this.g = i10;
        this.f18387e = w9.f18387e;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        this.f18394d = (this.f18394d + 1) & 63;
        this.f18388f = obj;
    }

    @Override // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        boolean zTryAdvance;
        boolean zTest;
        switch (this.g) {
            case 0:
                boolean z10 = this.f18393c;
                Spliterator spliterator = this.f18391a;
                if (z10) {
                    boolean z11 = false;
                    this.f18393c = false;
                    while (true) {
                        zTryAdvance = spliterator.tryAdvance(this);
                        if (zTryAdvance && a() && this.f18387e.test(this.f18388f)) {
                            z11 = true;
                        }
                    }
                    if (!zTryAdvance) {
                        return zTryAdvance;
                    }
                    if (z11) {
                        this.f18392b.set(true);
                    }
                    consumer.accept(this.f18388f);
                    return zTryAdvance;
                }
                return spliterator.tryAdvance(consumer);
            default:
                if (this.f18393c && a() && this.f18391a.tryAdvance(this)) {
                    zTest = this.f18387e.test(this.f18388f);
                    if (zTest) {
                        consumer.accept(this.f18388f);
                        return true;
                    }
                } else {
                    zTest = true;
                }
                this.f18393c = false;
                if (!zTest) {
                    this.f18392b.set(true);
                }
                return false;
        }
    }

    @Override // j$.util.stream.X3, j$.util.Spliterator
    public Spliterator trySplit() {
        switch (this.g) {
            case 1:
                if (this.f18392b.get()) {
                    return null;
                }
                return super.trySplit();
            default:
                return super.trySplit();
        }
    }

    @Override // j$.util.stream.X3
    public final Spliterator b(Spliterator spliterator) {
        switch (this.g) {
            case 0:
                return new W3(spliterator, this, 0);
            default:
                return new W3(spliterator, this, 1);
        }
    }
}
