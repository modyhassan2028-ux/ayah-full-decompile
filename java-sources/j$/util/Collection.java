package j$.util;

import j$.util.stream.C1081a2;
import j$.util.stream.Stream;
import j$.util.stream.Y2;
import java.util.Iterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;

/* JADX INFO: loaded from: classes2.dex */
public interface Collection<E> {
    void forEach(Consumer<? super E> consumer);

    Stream<E> parallelStream();

    boolean removeIf(Predicate<? super E> predicate);

    Spliterator<E> spliterator();

    Stream<E> stream();

    <T> T[] toArray(IntFunction<T[]> intFunction);

    /* JADX INFO: renamed from: j$.util.Collection$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static Spliterator $default$spliterator(java.util.Collection collection) {
            return new s0(0, (java.util.Collection) Objects.requireNonNull(collection));
        }

        public static boolean $default$removeIf(java.util.Collection collection, Predicate predicate) {
            Objects.requireNonNull(predicate);
            Iterator<E> it = collection.iterator();
            boolean z10 = false;
            while (it.hasNext()) {
                if (predicate.test(it.next())) {
                    it.remove();
                    z10 = true;
                }
            }
            return z10;
        }

        public static Stream $default$stream(java.util.Collection collection) {
            Spliterator spliteratorU = AbstractC1062c.u(collection);
            Objects.requireNonNull(spliteratorU);
            return new C1081a2(spliteratorU, Y2.p(spliteratorU), false);
        }

        public static Stream $default$parallelStream(java.util.Collection collection) {
            Spliterator spliteratorU = AbstractC1062c.u(collection);
            Objects.requireNonNull(spliteratorU);
            return new C1081a2(spliteratorU, Y2.p(spliteratorU), true);
        }
    }
}
