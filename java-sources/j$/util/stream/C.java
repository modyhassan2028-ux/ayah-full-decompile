package j$.util.stream;

import j$.util.C1076q;
import j$.util.C1210x;
import java.util.function.BiConsumer;
import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleConsumer;
import java.util.function.DoubleFunction;
import java.util.function.DoubleUnaryOperator;
import java.util.function.ObjDoubleConsumer;
import java.util.function.Supplier;

/* JADX INFO: loaded from: classes2.dex */
public interface C extends InterfaceC1108g {
    IntStream A();

    boolean C();

    C a();

    j$.util.C average();

    C b();

    Stream boxed();

    C c();

    Object collect(Supplier supplier, ObjDoubleConsumer objDoubleConsumer, BiConsumer biConsumer);

    long count();

    C d(C1076q c1076q);

    C distinct();

    j$.util.C findAny();

    j$.util.C findFirst();

    void forEach(DoubleConsumer doubleConsumer);

    void forEachOrdered(DoubleConsumer doubleConsumer);

    @Override // j$.util.stream.InterfaceC1108g
    j$.util.I iterator();

    C limit(long j);

    C map(DoubleUnaryOperator doubleUnaryOperator);

    Stream mapToObj(DoubleFunction doubleFunction);

    j$.util.C max();

    j$.util.C min();

    boolean p();

    @Override // j$.util.stream.InterfaceC1108g
    C parallel();

    C peek(DoubleConsumer doubleConsumer);

    double reduce(double d5, DoubleBinaryOperator doubleBinaryOperator);

    j$.util.C reduce(DoubleBinaryOperator doubleBinaryOperator);

    @Override // j$.util.stream.InterfaceC1108g
    C sequential();

    C skip(long j);

    C sorted();

    @Override // j$.util.stream.InterfaceC1108g
    j$.util.W spliterator();

    double sum();

    C1210x summaryStatistics();

    double[] toArray();

    boolean u();

    InterfaceC1139m0 v();
}
