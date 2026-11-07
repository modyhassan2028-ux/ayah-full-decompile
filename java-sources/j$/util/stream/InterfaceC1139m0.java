package j$.util.stream;

import j$.util.C1076q;
import java.util.function.BiConsumer;
import java.util.function.LongBinaryOperator;
import java.util.function.LongConsumer;
import java.util.function.LongFunction;
import java.util.function.ObjLongConsumer;
import java.util.function.Supplier;

/* JADX INFO: renamed from: j$.util.stream.m0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC1139m0 extends InterfaceC1108g {
    IntStream B();

    InterfaceC1139m0 a();

    C asDoubleStream();

    j$.util.C average();

    InterfaceC1139m0 b();

    Stream boxed();

    InterfaceC1139m0 c();

    Object collect(Supplier supplier, ObjLongConsumer objLongConsumer, BiConsumer biConsumer);

    long count();

    InterfaceC1139m0 d(C1076q c1076q);

    InterfaceC1139m0 distinct();

    InterfaceC1139m0 e();

    j$.util.E findAny();

    j$.util.E findFirst();

    void forEach(LongConsumer longConsumer);

    void forEachOrdered(LongConsumer longConsumer);

    @Override // j$.util.stream.InterfaceC1108g
    j$.util.Q iterator();

    C k();

    InterfaceC1139m0 limit(long j);

    Stream mapToObj(LongFunction longFunction);

    j$.util.E max();

    j$.util.E min();

    boolean n();

    @Override // j$.util.stream.InterfaceC1108g
    InterfaceC1139m0 parallel();

    InterfaceC1139m0 peek(LongConsumer longConsumer);

    boolean r();

    long reduce(long j, LongBinaryOperator longBinaryOperator);

    j$.util.E reduce(LongBinaryOperator longBinaryOperator);

    @Override // j$.util.stream.InterfaceC1108g
    InterfaceC1139m0 sequential();

    InterfaceC1139m0 skip(long j);

    InterfaceC1139m0 sorted();

    @Override // j$.util.stream.InterfaceC1108g
    j$.util.c0 spliterator();

    long sum();

    j$.util.A summaryStatistics();

    long[] toArray();

    boolean x();
}
