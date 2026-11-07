package j$.util;

import java.util.RandomAccess;
import java.util.function.UnaryOperator;

/* JADX INFO: loaded from: classes2.dex */
public interface List<E> extends Collection<E> {
    void replaceAll(UnaryOperator<E> unaryOperator);

    void sort(java.util.Comparator<? super E> comparator);

    @Override // java.util.Collection, java.lang.Iterable, j$.util.List, j$.util.Collection
    Spliterator<E> spliterator();

    /* JADX INFO: renamed from: j$.util.List$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static Spliterator $default$spliterator(java.util.List list) {
            if (!(list instanceof RandomAccess)) {
                return new s0(16, (java.util.Collection) Objects.requireNonNull(list));
            }
            return new C1060a(list);
        }
    }
}
