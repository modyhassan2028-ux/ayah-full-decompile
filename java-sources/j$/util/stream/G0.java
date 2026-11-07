package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;

/* JADX INFO: loaded from: classes2.dex */
public interface G0 {
    G0 a(int i10);

    long count();

    void forEach(Consumer consumer);

    G0 j(long j, long j10, IntFunction intFunction);

    void k(Object[] objArr, int i10);

    Object[] m(IntFunction intFunction);

    int o();

    Spliterator spliterator();
}
