package j$.util.stream;

import j$.util.AbstractC1062c;
import j$.util.Objects;
import j$.util.Spliterator;
import java.util.Comparator;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;

/* JADX INFO: renamed from: j$.util.stream.x3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1196x3 extends A3 implements j$.util.f0 {
    public abstract void g(Object obj);

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return AbstractC1062c.d(this);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i10) {
        return AbstractC1062c.e(this, i10);
    }

    public abstract AbstractC1102e3 j(int i10);

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        throw new IllegalStateException();
    }

    @Override // j$.util.f0
    public final boolean tryAdvance(Object obj) {
        Objects.requireNonNull(obj);
        while (f() != z3.NO_MORE && ((j$.util.f0) this.f18220a).tryAdvance(this)) {
            if (a(1L) == 1) {
                g(obj);
                return true;
            }
        }
        return false;
    }

    @Override // j$.util.f0
    public final void forEachRemaining(Object obj) {
        Objects.requireNonNull(obj);
        AbstractC1102e3 abstractC1102e3J = null;
        while (true) {
            z3 z3VarF = f();
            if (z3VarF == z3.NO_MORE) {
                return;
            }
            z3 z3Var = z3.MAYBE_MORE;
            Spliterator spliterator = this.f18220a;
            if (z3VarF == z3Var) {
                int i10 = this.f18222c;
                if (abstractC1102e3J == null) {
                    abstractC1102e3J = j(i10);
                } else {
                    abstractC1102e3J.f18465b = 0;
                }
                long j = 0;
                while (((j$.util.f0) spliterator).tryAdvance(abstractC1102e3J)) {
                    j++;
                    if (j >= i10) {
                        break;
                    }
                }
                if (j == 0) {
                    return;
                } else {
                    abstractC1102e3J.a(obj, a(j));
                }
            } else {
                ((j$.util.f0) spliterator).forEachRemaining(obj);
                return;
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
