package j$.util.stream;

import j$.util.Spliterator;
import java.util.Deque;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;

/* JADX INFO: renamed from: j$.util.stream.h1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1115h1 extends AbstractC1125j1 implements j$.util.f0 {
    @Override // j$.util.f0
    public final boolean tryAdvance(Object obj) {
        F0 f3;
        if (!c()) {
            return false;
        }
        boolean zTryAdvance = ((j$.util.f0) this.f18486d).tryAdvance(obj);
        if (!zTryAdvance) {
            if (this.f18485c == null && (f3 = (F0) AbstractC1125j1.a(this.f18487e)) != null) {
                j$.util.f0 f0VarSpliterator = f3.spliterator();
                this.f18486d = f0VarSpliterator;
                return f0VarSpliterator.tryAdvance(obj);
            }
            this.f18483a = null;
        }
        return zTryAdvance;
    }

    @Override // j$.util.f0
    public final void forEachRemaining(Object obj) {
        if (this.f18483a == null) {
            return;
        }
        if (this.f18486d == null) {
            Spliterator spliterator = this.f18485c;
            if (spliterator == null) {
                Deque dequeB = b();
                while (true) {
                    F0 f3 = (F0) AbstractC1125j1.a(dequeB);
                    if (f3 != null) {
                        f3.g(obj);
                    } else {
                        this.f18483a = null;
                        return;
                    }
                }
            } else {
                ((j$.util.f0) spliterator).forEachRemaining(obj);
            }
        } else {
            while (tryAdvance(obj)) {
            }
        }
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(IntConsumer intConsumer) {
        forEachRemaining((Object) intConsumer);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(IntConsumer intConsumer) {
        return tryAdvance((Object) intConsumer);
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(LongConsumer longConsumer) {
        forEachRemaining((Object) longConsumer);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(LongConsumer longConsumer) {
        return tryAdvance((Object) longConsumer);
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(DoubleConsumer doubleConsumer) {
        forEachRemaining((Object) doubleConsumer);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(DoubleConsumer doubleConsumer) {
        return tryAdvance((Object) doubleConsumer);
    }
}
