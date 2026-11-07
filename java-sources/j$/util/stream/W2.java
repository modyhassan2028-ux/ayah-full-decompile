package j$.util.stream;

import j$.util.AbstractC1062c;
import j$.util.C1076q;
import j$.util.Spliterator;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class W2 implements Stream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.stream.Stream f18386a;

    public /* synthetic */ W2(java.util.stream.Stream stream) {
        this.f18386a = stream;
    }

    public static /* synthetic */ Stream f(java.util.stream.Stream stream) {
        if (stream == null) {
            return null;
        }
        return stream instanceof Stream.Wrapper ? Stream.this : new W2(stream);
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ boolean allMatch(Predicate predicate) {
        return this.f18386a.allMatch(predicate);
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ boolean anyMatch(Predicate predicate) {
        return this.f18386a.anyMatch(predicate);
    }

    @Override // java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        this.f18386a.close();
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Object collect(Supplier supplier, BiConsumer biConsumer, BiConsumer biConsumer2) {
        return this.f18386a.collect(supplier, biConsumer, biConsumer2);
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ long count() {
        return this.f18386a.count();
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Stream d(C1076q c1076q) {
        return f(this.f18386a.flatMap(AbstractC1184v1.r0(c1076q)));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Stream distinct() {
        return f(this.f18386a.distinct());
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Stream dropWhile(Predicate predicate) {
        return f(this.f18386a.dropWhile(predicate));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        java.util.stream.Stream stream = this.f18386a;
        if (obj instanceof W2) {
            obj = ((W2) obj).f18386a;
        }
        return stream.equals(obj);
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Stream filter(Predicate predicate) {
        return f(this.f18386a.filter(predicate));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ j$.util.B findAny() {
        return AbstractC1062c.i(this.f18386a.findAny());
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ j$.util.B findFirst() {
        return AbstractC1062c.i(this.f18386a.findFirst());
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ void forEach(Consumer consumer) {
        this.f18386a.forEach(consumer);
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ void forEachOrdered(Consumer consumer) {
        this.f18386a.forEachOrdered(consumer);
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Object h(C1118i c1118i) {
        return this.f18386a.collect(c1118i == null ? null : c1118i.f18479a);
    }

    public final /* synthetic */ int hashCode() {
        return this.f18386a.hashCode();
    }

    @Override // j$.util.stream.InterfaceC1108g
    public final /* synthetic */ boolean isParallel() {
        return this.f18386a.isParallel();
    }

    @Override // j$.util.stream.InterfaceC1108g
    public final /* synthetic */ Iterator iterator() {
        return this.f18386a.iterator();
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Stream limit(long j) {
        return f(this.f18386a.limit(j));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ InterfaceC1139m0 m(C1076q c1076q) {
        return C1129k0.f(this.f18386a.flatMapToLong(AbstractC1184v1.r0(c1076q)));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Stream map(Function function) {
        return f(this.f18386a.map(function));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ C mapToDouble(ToDoubleFunction toDoubleFunction) {
        return A.f(this.f18386a.mapToDouble(toDoubleFunction));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ IntStream mapToInt(ToIntFunction toIntFunction) {
        return IntStream.VivifiedWrapper.convert(this.f18386a.mapToInt(toIntFunction));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ InterfaceC1139m0 mapToLong(ToLongFunction toLongFunction) {
        return C1129k0.f(this.f18386a.mapToLong(toLongFunction));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ j$.util.B max(Comparator comparator) {
        return AbstractC1062c.i(this.f18386a.max(comparator));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ j$.util.B min(Comparator comparator) {
        return AbstractC1062c.i(this.f18386a.min(comparator));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ boolean noneMatch(Predicate predicate) {
        return this.f18386a.noneMatch(predicate);
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ IntStream o(C1076q c1076q) {
        return IntStream.VivifiedWrapper.convert(this.f18386a.flatMapToInt(AbstractC1184v1.r0(c1076q)));
    }

    @Override // j$.util.stream.InterfaceC1108g
    public final /* synthetic */ InterfaceC1108g onClose(Runnable runnable) {
        return C1098e.f(this.f18386a.onClose(runnable));
    }

    @Override // j$.util.stream.InterfaceC1108g
    public final /* synthetic */ InterfaceC1108g parallel() {
        return C1098e.f(this.f18386a.parallel());
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Stream peek(Consumer consumer) {
        return f(this.f18386a.peek(consumer));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ j$.util.B reduce(BinaryOperator binaryOperator) {
        return AbstractC1062c.i(this.f18386a.reduce(binaryOperator));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Object reduce(Object obj, BiFunction biFunction, BinaryOperator binaryOperator) {
        return this.f18386a.reduce(obj, biFunction, binaryOperator);
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Object reduce(Object obj, BinaryOperator binaryOperator) {
        return this.f18386a.reduce(obj, binaryOperator);
    }

    @Override // j$.util.stream.InterfaceC1108g
    public final /* synthetic */ InterfaceC1108g sequential() {
        return C1098e.f(this.f18386a.sequential());
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Stream skip(long j) {
        return f(this.f18386a.skip(j));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Stream sorted() {
        return f(this.f18386a.sorted());
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Stream sorted(Comparator comparator) {
        return f(this.f18386a.sorted(comparator));
    }

    @Override // j$.util.stream.InterfaceC1108g
    public final /* synthetic */ Spliterator spliterator() {
        return j$.util.g0.a(this.f18386a.spliterator());
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Stream takeWhile(Predicate predicate) {
        return f(this.f18386a.takeWhile(predicate));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Object[] toArray() {
        return this.f18386a.toArray();
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Object[] toArray(IntFunction intFunction) {
        return this.f18386a.toArray(intFunction);
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ List toList() {
        return this.f18386a.toList();
    }

    @Override // j$.util.stream.InterfaceC1108g
    public final /* synthetic */ InterfaceC1108g unordered() {
        return C1098e.f(this.f18386a.unordered());
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ C z(C1076q c1076q) {
        return A.f(this.f18386a.flatMapToDouble(AbstractC1184v1.r0(c1076q)));
    }
}
