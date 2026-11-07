package j$.util;

import j$.util.stream.Stream;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;
import java.util.Set;
import java.util.SortedSet;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;

/* JADX INFO: renamed from: j$.util.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC1062c {
    public static /* synthetic */ Stream s(java.util.Collection collection) {
        return collection instanceof Collection ? ((Collection) collection).parallelStream() : Collection.CC.$default$parallelStream(collection);
    }

    public static /* synthetic */ Stream v(java.util.Collection collection) {
        return collection instanceof Collection ? ((Collection) collection).stream() : Collection.CC.$default$stream(collection);
    }

    public static /* synthetic */ java.util.Comparator w(java.util.Comparator comparator, java.util.Comparator comparator2) {
        return comparator instanceof Comparator ? ((Comparator) comparator).thenComparing(comparator2) : Comparator.CC.$default$thenComparing(comparator, comparator2);
    }

    public static B i(Optional optional) {
        if (optional == null) {
            return null;
        }
        if (!optional.isPresent()) {
            return B.f18043b;
        }
        return new B(optional.get());
    }

    public static C j(OptionalDouble optionalDouble) {
        if (optionalDouble == null) {
            return null;
        }
        if (!optionalDouble.isPresent()) {
            return C.f18045c;
        }
        return new C(optionalDouble.getAsDouble());
    }

    public static E l(OptionalLong optionalLong) {
        if (optionalLong == null) {
            return null;
        }
        if (!optionalLong.isPresent()) {
            return E.f18051c;
        }
        return new E(optionalLong.getAsLong());
    }

    public static D k(OptionalInt optionalInt) {
        if (optionalInt == null) {
            return null;
        }
        if (!optionalInt.isPresent()) {
            return D.f18048c;
        }
        return new D(optionalInt.getAsInt());
    }

    public static void r(Iterator it, Consumer consumer) {
        if (it instanceof InterfaceC1212z) {
            ((InterfaceC1212z) it).forEachRemaining(consumer);
            return;
        }
        Objects.requireNonNull(consumer);
        while (it.hasNext()) {
            consumer.accept(it.next());
        }
    }

    public static OptionalDouble n(C c10) {
        if (c10 == null) {
            return null;
        }
        boolean z10 = c10.f18046a;
        if (!z10) {
            return OptionalDouble.empty();
        }
        if (z10) {
            return OptionalDouble.of(c10.f18047b);
        }
        throw new NoSuchElementException("No value present");
    }

    public static OptionalInt o(D d5) {
        if (d5 == null) {
            return null;
        }
        boolean z10 = d5.f18049a;
        if (!z10) {
            return OptionalInt.empty();
        }
        if (z10) {
            return OptionalInt.of(d5.f18050b);
        }
        throw new NoSuchElementException("No value present");
    }

    public static OptionalLong p(E e10) {
        if (e10 == null) {
            return null;
        }
        boolean z10 = e10.f18052a;
        if (!z10) {
            return OptionalLong.empty();
        }
        if (z10) {
            return OptionalLong.of(e10.f18053b);
        }
        throw new NoSuchElementException("No value present");
    }

    public static Optional m(B b5) {
        if (b5 == null) {
            return null;
        }
        Object obj = b5.f18044a;
        if (obj == null) {
            return Optional.empty();
        }
        if (obj != null) {
            return Optional.of(obj);
        }
        throw new NoSuchElementException("No value present");
    }

    public static long d(Spliterator spliterator) {
        if ((spliterator.characteristics() & 64) == 0) {
            return -1L;
        }
        return spliterator.estimateSize();
    }

    public static Spliterator u(java.util.Collection collection) {
        if (collection instanceof Collection) {
            return ((Collection) collection).spliterator();
        }
        if (collection instanceof LinkedHashSet) {
            return new s0(17, (java.util.Collection) Objects.requireNonNull((LinkedHashSet) collection));
        }
        if (collection instanceof SortedSet) {
            SortedSet sortedSet = (SortedSet) collection;
            return new T(sortedSet, sortedSet);
        }
        if (collection instanceof Set) {
            return new s0(1, (java.util.Collection) Objects.requireNonNull((Set) collection));
        }
        return collection instanceof java.util.List ? List.CC.$default$spliterator((java.util.List) collection) : Collection.CC.$default$spliterator(collection);
    }

    public static boolean e(Spliterator spliterator, int i10) {
        return (spliterator.characteristics() & i10) == i10;
    }

    public static void t(java.util.List list, java.util.Comparator comparator) {
        if (list instanceof List) {
            ((List) list).sort(comparator);
            return;
        }
        Object[] array = list.toArray();
        Arrays.sort(array, comparator);
        ListIterator listIterator = list.listIterator();
        for (Object obj : array) {
            listIterator.next();
            listIterator.set(obj);
        }
    }

    public static void q(java.util.Collection collection, Consumer consumer) {
        if (collection instanceof Collection) {
            ((Collection) collection).forEach(consumer);
            return;
        }
        Objects.requireNonNull(consumer);
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            consumer.accept(it.next());
        }
    }

    public static boolean g(Z z10, Consumer consumer) {
        if (consumer instanceof IntConsumer) {
            return z10.tryAdvance((IntConsumer) consumer);
        }
        if (w0.f18610a) {
            w0.a(z10.getClass(), "{0} calling Spliterator.OfInt.tryAdvance((IntConsumer) action::accept)");
            throw null;
        }
        Objects.requireNonNull(consumer);
        return z10.tryAdvance((IntConsumer) new J(consumer, 0));
    }

    public static void b(Z z10, Consumer consumer) {
        if (consumer instanceof IntConsumer) {
            z10.forEachRemaining((IntConsumer) consumer);
        } else {
            if (w0.f18610a) {
                w0.a(z10.getClass(), "{0} calling Spliterator.OfInt.forEachRemaining((IntConsumer) action::accept)");
                throw null;
            }
            Objects.requireNonNull(consumer);
            z10.forEachRemaining((IntConsumer) new J(consumer, 0));
        }
    }

    public static boolean h(c0 c0Var, Consumer consumer) {
        if (consumer instanceof LongConsumer) {
            return c0Var.tryAdvance((LongConsumer) consumer);
        }
        if (w0.f18610a) {
            w0.a(c0Var.getClass(), "{0} calling Spliterator.OfLong.tryAdvance((LongConsumer) action::accept)");
            throw null;
        }
        Objects.requireNonNull(consumer);
        return c0Var.tryAdvance((LongConsumer) new N(consumer, 0));
    }

    public static void c(c0 c0Var, Consumer consumer) {
        if (consumer instanceof LongConsumer) {
            c0Var.forEachRemaining((LongConsumer) consumer);
        } else {
            if (w0.f18610a) {
                w0.a(c0Var.getClass(), "{0} calling Spliterator.OfLong.forEachRemaining((LongConsumer) action::accept)");
                throw null;
            }
            Objects.requireNonNull(consumer);
            c0Var.forEachRemaining((LongConsumer) new N(consumer, 0));
        }
    }

    public static boolean f(W w9, Consumer consumer) {
        if (consumer instanceof DoubleConsumer) {
            return w9.tryAdvance((DoubleConsumer) consumer);
        }
        if (w0.f18610a) {
            w0.a(w9.getClass(), "{0} calling Spliterator.OfDouble.tryAdvance((DoubleConsumer) action::accept)");
            throw null;
        }
        Objects.requireNonNull(consumer);
        return w9.tryAdvance((DoubleConsumer) new F(consumer, 0));
    }

    public static void a(W w9, Consumer consumer) {
        if (consumer instanceof DoubleConsumer) {
            w9.forEachRemaining((DoubleConsumer) consumer);
        } else {
            if (w0.f18610a) {
                w0.a(w9.getClass(), "{0} calling Spliterator.OfDouble.forEachRemaining((DoubleConsumer) action::accept)");
                throw null;
            }
            Objects.requireNonNull(consumer);
            w9.forEachRemaining((DoubleConsumer) new F(consumer, 0));
        }
    }

    public Spliterator trySplit() {
        return null;
    }

    public boolean tryAdvance(Object obj) {
        Objects.requireNonNull(obj);
        return false;
    }

    public void forEachRemaining(Object obj) {
        Objects.requireNonNull(obj);
    }

    public long estimateSize() {
        return 0L;
    }

    public int characteristics() {
        return 16448;
    }
}
