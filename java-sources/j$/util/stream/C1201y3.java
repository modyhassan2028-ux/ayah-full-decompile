package j$.util.stream;

import j$.util.AbstractC1062c;
import j$.util.Objects;
import j$.util.Spliterator;
import j$.util.function.Consumer$CC;
import java.util.Comparator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: j$.util.stream.y3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1201y3 extends A3 implements Spliterator, Consumer {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f18589f;

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return AbstractC1062c.d(this);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i10) {
        return AbstractC1062c.e(this, i10);
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        throw new IllegalStateException();
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final void n(Object obj) {
        this.f18589f = obj;
    }

    @Override // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        Objects.requireNonNull(consumer);
        while (f() != z3.NO_MORE && this.f18220a.tryAdvance(this)) {
            if (a(1L) == 1) {
                consumer.n(this.f18589f);
                this.f18589f = null;
                return true;
            }
        }
        return false;
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        Objects.requireNonNull(consumer);
        C1107f3 c1107f3 = null;
        while (true) {
            z3 z3VarF = f();
            if (z3VarF == z3.NO_MORE) {
                return;
            }
            z3 z3Var = z3.MAYBE_MORE;
            Spliterator spliterator = this.f18220a;
            if (z3VarF == z3Var) {
                int i10 = this.f18222c;
                if (c1107f3 == null) {
                    c1107f3 = new C1107f3(i10);
                } else {
                    c1107f3.f18472a = 0;
                }
                long j = 0;
                while (spliterator.tryAdvance(c1107f3)) {
                    j++;
                    if (j >= i10) {
                        break;
                    }
                }
                if (j == 0) {
                    return;
                }
                long jA = a(j);
                for (int i11 = 0; i11 < jA; i11++) {
                    consumer.n(c1107f3.f18470b[i11]);
                }
            } else {
                spliterator.forEachRemaining(consumer);
                return;
            }
        }
    }

    @Override // j$.util.stream.A3
    public final Spliterator b(Spliterator spliterator) {
        return new C1201y3(spliterator, this);
    }
}
