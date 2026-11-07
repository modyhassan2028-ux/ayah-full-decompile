package j$.util.stream;

import j$.util.AbstractC1062c;
import j$.util.C1211y;
import java.util.IntSummaryStatistics;
import java.util.Iterator;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.Spliterator;
import java.util.function.BiConsumer;
import java.util.function.IntBinaryOperator;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.IntPredicate;
import java.util.function.IntToDoubleFunction;
import java.util.function.IntToLongFunction;
import java.util.function.IntUnaryOperator;
import java.util.function.ObjIntConsumer;
import java.util.function.Supplier;
import java.util.stream.BaseStream;
import java.util.stream.DoubleStream;
import java.util.stream.LongStream;

/* JADX INFO: loaded from: classes2.dex */
public interface IntStream extends InterfaceC1108g {
    IntStream a();

    C asDoubleStream();

    InterfaceC1139m0 asLongStream();

    j$.util.C average();

    IntStream b();

    Stream boxed();

    IntStream c();

    Object collect(Supplier supplier, ObjIntConsumer objIntConsumer, BiConsumer biConsumer);

    long count();

    IntStream distinct();

    IntStream e();

    j$.util.D findAny();

    j$.util.D findFirst();

    void forEach(IntConsumer intConsumer);

    void forEachOrdered(IntConsumer intConsumer);

    C g();

    @Override // j$.util.stream.InterfaceC1108g
    j$.util.M iterator();

    InterfaceC1139m0 l();

    IntStream limit(long j);

    Stream mapToObj(IntFunction intFunction);

    j$.util.D max();

    j$.util.D min();

    @Override // j$.util.stream.InterfaceC1108g
    IntStream parallel();

    IntStream peek(IntConsumer intConsumer);

    boolean q();

    int reduce(int i10, IntBinaryOperator intBinaryOperator);

    j$.util.D reduce(IntBinaryOperator intBinaryOperator);

    IntStream s(K k7);

    @Override // j$.util.stream.InterfaceC1108g
    IntStream sequential();

    IntStream skip(long j);

    IntStream sorted();

    @Override // j$.util.stream.InterfaceC1108g
    j$.util.Z spliterator();

    int sum();

    C1211y summaryStatistics();

    boolean t();

    int[] toArray();

    boolean y();

    public final /* synthetic */ class Wrapper implements java.util.stream.IntStream {
        public /* synthetic */ Wrapper() {
        }

        public static /* synthetic */ java.util.stream.IntStream convert(IntStream intStream) {
            if (intStream == null) {
                return null;
            }
            return intStream instanceof VivifiedWrapper ? ((VivifiedWrapper) intStream).f18288a : intStream.new Wrapper();
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ boolean allMatch(IntPredicate intPredicate) {
            return IntStream.this.q();
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ boolean anyMatch(IntPredicate intPredicate) {
            return IntStream.this.y();
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ DoubleStream asDoubleStream() {
            return B.f(IntStream.this.asDoubleStream());
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ LongStream asLongStream() {
            return C1134l0.f(IntStream.this.asLongStream());
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ OptionalDouble average() {
            return AbstractC1062c.n(IntStream.this.average());
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ java.util.stream.Stream boxed() {
            return Stream.Wrapper.convert(IntStream.this.boxed());
        }

        @Override // java.util.stream.BaseStream, java.lang.AutoCloseable
        public final /* synthetic */ void close() throws Exception {
            IntStream.this.close();
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ Object collect(Supplier supplier, ObjIntConsumer objIntConsumer, BiConsumer biConsumer) {
            return IntStream.this.collect(supplier, objIntConsumer, biConsumer);
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ long count() {
            return IntStream.this.count();
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ java.util.stream.IntStream distinct() {
            return convert(IntStream.this.distinct());
        }

        public final /* synthetic */ java.util.stream.IntStream dropWhile(IntPredicate intPredicate) {
            return convert(IntStream.this.c());
        }

        public final /* synthetic */ boolean equals(Object obj) {
            IntStream intStream = IntStream.this;
            if (obj instanceof Wrapper) {
                obj = IntStream.this;
            }
            return intStream.equals(obj);
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ java.util.stream.IntStream filter(IntPredicate intPredicate) {
            return convert(IntStream.this.b());
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ OptionalInt findAny() {
            return AbstractC1062c.o(IntStream.this.findAny());
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ OptionalInt findFirst() {
            return AbstractC1062c.o(IntStream.this.findFirst());
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ void forEach(IntConsumer intConsumer) {
            IntStream.this.forEach(intConsumer);
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ void forEachOrdered(IntConsumer intConsumer) {
            IntStream.this.forEachOrdered(intConsumer);
        }

        public final /* synthetic */ int hashCode() {
            return IntStream.this.hashCode();
        }

        @Override // java.util.stream.BaseStream
        public final /* synthetic */ boolean isParallel() {
            return IntStream.this.isParallel();
        }

        @Override // java.util.stream.IntStream, java.util.stream.BaseStream
        public final /* synthetic */ Iterator<Integer> iterator() {
            return IntStream.this.iterator();
        }

        @Override // java.util.stream.IntStream, java.util.stream.BaseStream
        /* JADX INFO: renamed from: iterator, reason: avoid collision after fix types in other method */
        public final /* synthetic */ Iterator<Integer> iterator2() {
            j$.util.M it = IntStream.this.iterator();
            if (it == null) {
                return null;
            }
            return it instanceof j$.util.K ? ((j$.util.K) it).f18060a : new j$.util.L(it);
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ java.util.stream.IntStream limit(long j) {
            return convert(IntStream.this.limit(j));
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ java.util.stream.IntStream map(IntUnaryOperator intUnaryOperator) {
            return convert(IntStream.this.e());
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ DoubleStream mapToDouble(IntToDoubleFunction intToDoubleFunction) {
            return B.f(IntStream.this.g());
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ LongStream mapToLong(IntToLongFunction intToLongFunction) {
            return C1134l0.f(IntStream.this.l());
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ java.util.stream.Stream mapToObj(IntFunction intFunction) {
            return Stream.Wrapper.convert(IntStream.this.mapToObj(intFunction));
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ OptionalInt max() {
            return AbstractC1062c.o(IntStream.this.max());
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ OptionalInt min() {
            return AbstractC1062c.o(IntStream.this.min());
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ boolean noneMatch(IntPredicate intPredicate) {
            return IntStream.this.t();
        }

        @Override // java.util.stream.BaseStream
        public final /* synthetic */ BaseStream onClose(Runnable runnable) {
            return C1103f.f(IntStream.this.onClose(runnable));
        }

        @Override // java.util.stream.IntStream, java.util.stream.BaseStream
        public final /* synthetic */ BaseStream parallel() {
            return C1103f.f(IntStream.this.parallel());
        }

        @Override // java.util.stream.IntStream, java.util.stream.BaseStream
        public final /* synthetic */ java.util.stream.IntStream parallel() {
            return convert(IntStream.this.parallel());
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ java.util.stream.IntStream peek(IntConsumer intConsumer) {
            return convert(IntStream.this.peek(intConsumer));
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ int reduce(int i10, IntBinaryOperator intBinaryOperator) {
            return IntStream.this.reduce(i10, intBinaryOperator);
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ OptionalInt reduce(IntBinaryOperator intBinaryOperator) {
            return AbstractC1062c.o(IntStream.this.reduce(intBinaryOperator));
        }

        @Override // java.util.stream.IntStream, java.util.stream.BaseStream
        public final /* synthetic */ BaseStream sequential() {
            return C1103f.f(IntStream.this.sequential());
        }

        @Override // java.util.stream.IntStream, java.util.stream.BaseStream
        public final /* synthetic */ java.util.stream.IntStream sequential() {
            return convert(IntStream.this.sequential());
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ java.util.stream.IntStream skip(long j) {
            return convert(IntStream.this.skip(j));
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ java.util.stream.IntStream sorted() {
            return convert(IntStream.this.sorted());
        }

        @Override // java.util.stream.IntStream, java.util.stream.BaseStream
        public final /* synthetic */ Spliterator<Integer> spliterator() {
            return j$.util.Y.a(IntStream.this.spliterator());
        }

        @Override // java.util.stream.IntStream, java.util.stream.BaseStream
        /* JADX INFO: renamed from: spliterator, reason: avoid collision after fix types in other method */
        public final /* synthetic */ Spliterator<Integer> spliterator2() {
            return j$.util.Spliterator.Wrapper.convert(IntStream.this.spliterator());
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ int sum() {
            return IntStream.this.sum();
        }

        public final /* synthetic */ java.util.stream.IntStream takeWhile(IntPredicate intPredicate) {
            return convert(IntStream.this.a());
        }

        @Override // java.util.stream.IntStream
        public final /* synthetic */ int[] toArray() {
            return IntStream.this.toArray();
        }

        @Override // java.util.stream.BaseStream
        public final /* synthetic */ BaseStream unordered() {
            return C1103f.f(IntStream.this.unordered());
        }

        @Override // java.util.stream.IntStream
        public final IntSummaryStatistics summaryStatistics() {
            IntStream.this.summaryStatistics();
            throw new Error("Java 8+ API desugaring (library desugaring) cannot convert to java.util.IntSummaryStatistics");
        }

        @Override // java.util.stream.IntStream
        public final java.util.stream.IntStream flatMap(IntFunction intFunction) {
            IntStream intStream = IntStream.this;
            K k7 = new K();
            k7.f18299a = intFunction;
            return convert(intStream.s(k7));
        }
    }

    public final /* synthetic */ class VivifiedWrapper implements IntStream {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ java.util.stream.IntStream f18288a;

        public /* synthetic */ VivifiedWrapper(java.util.stream.IntStream intStream) {
            this.f18288a = intStream;
        }

        public static /* synthetic */ IntStream convert(java.util.stream.IntStream intStream) {
            if (intStream == null) {
                return null;
            }
            return intStream instanceof Wrapper ? IntStream.this : new VivifiedWrapper(intStream);
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ IntStream a() {
            return convert(this.f18288a.takeWhile(null));
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ C asDoubleStream() {
            return A.f(this.f18288a.asDoubleStream());
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ InterfaceC1139m0 asLongStream() {
            return C1129k0.f(this.f18288a.asLongStream());
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ j$.util.C average() {
            return AbstractC1062c.j(this.f18288a.average());
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ IntStream b() {
            return convert(this.f18288a.filter(null));
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ Stream boxed() {
            return W2.f(this.f18288a.boxed());
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ IntStream c() {
            return convert(this.f18288a.dropWhile(null));
        }

        @Override // java.lang.AutoCloseable
        public final /* synthetic */ void close() {
            this.f18288a.close();
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ Object collect(Supplier supplier, ObjIntConsumer objIntConsumer, BiConsumer biConsumer) {
            return this.f18288a.collect(supplier, objIntConsumer, biConsumer);
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ long count() {
            return this.f18288a.count();
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ IntStream distinct() {
            return convert(this.f18288a.distinct());
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ IntStream e() {
            return convert(this.f18288a.map(null));
        }

        public final /* synthetic */ boolean equals(Object obj) {
            java.util.stream.IntStream intStream = this.f18288a;
            if (obj instanceof VivifiedWrapper) {
                obj = ((VivifiedWrapper) obj).f18288a;
            }
            return intStream.equals(obj);
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ j$.util.D findAny() {
            return AbstractC1062c.k(this.f18288a.findAny());
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ j$.util.D findFirst() {
            return AbstractC1062c.k(this.f18288a.findFirst());
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ void forEach(IntConsumer intConsumer) {
            this.f18288a.forEach(intConsumer);
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ void forEachOrdered(IntConsumer intConsumer) {
            this.f18288a.forEachOrdered(intConsumer);
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ C g() {
            return A.f(this.f18288a.mapToDouble(null));
        }

        public final /* synthetic */ int hashCode() {
            return this.f18288a.hashCode();
        }

        @Override // j$.util.stream.InterfaceC1108g
        public final /* synthetic */ boolean isParallel() {
            return this.f18288a.isParallel();
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [java.util.PrimitiveIterator$OfInt] */
        @Override // j$.util.stream.IntStream, j$.util.stream.InterfaceC1108g
        public final /* synthetic */ j$.util.M iterator() {
            ?? it = this.f18288a.iterator();
            if (it == 0) {
                return null;
            }
            return it instanceof j$.util.L ? ((j$.util.L) it).f18061a : new j$.util.K(it);
        }

        @Override // j$.util.stream.InterfaceC1108g
        public final /* synthetic */ Iterator iterator() {
            return this.f18288a.iterator();
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ InterfaceC1139m0 l() {
            return C1129k0.f(this.f18288a.mapToLong(null));
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ IntStream limit(long j) {
            return convert(this.f18288a.limit(j));
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ Stream mapToObj(IntFunction intFunction) {
            return W2.f(this.f18288a.mapToObj(intFunction));
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ j$.util.D max() {
            return AbstractC1062c.k(this.f18288a.max());
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ j$.util.D min() {
            return AbstractC1062c.k(this.f18288a.min());
        }

        @Override // j$.util.stream.InterfaceC1108g
        public final /* synthetic */ InterfaceC1108g onClose(Runnable runnable) {
            return C1098e.f(this.f18288a.onClose(runnable));
        }

        @Override // j$.util.stream.IntStream, j$.util.stream.InterfaceC1108g
        public final /* synthetic */ IntStream parallel() {
            return convert(this.f18288a.parallel());
        }

        @Override // j$.util.stream.InterfaceC1108g
        public final /* synthetic */ InterfaceC1108g parallel() {
            return C1098e.f(this.f18288a.parallel());
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ IntStream peek(IntConsumer intConsumer) {
            return convert(this.f18288a.peek(intConsumer));
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ boolean q() {
            return this.f18288a.allMatch(null);
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ int reduce(int i10, IntBinaryOperator intBinaryOperator) {
            return this.f18288a.reduce(i10, intBinaryOperator);
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ j$.util.D reduce(IntBinaryOperator intBinaryOperator) {
            return AbstractC1062c.k(this.f18288a.reduce(intBinaryOperator));
        }

        @Override // j$.util.stream.IntStream, j$.util.stream.InterfaceC1108g
        public final /* synthetic */ IntStream sequential() {
            return convert(this.f18288a.sequential());
        }

        @Override // j$.util.stream.InterfaceC1108g
        public final /* synthetic */ InterfaceC1108g sequential() {
            return C1098e.f(this.f18288a.sequential());
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ IntStream skip(long j) {
            return convert(this.f18288a.skip(j));
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ IntStream sorted() {
            return convert(this.f18288a.sorted());
        }

        @Override // j$.util.stream.InterfaceC1108g
        public final /* synthetic */ j$.util.Spliterator spliterator() {
            return j$.util.g0.a(this.f18288a.spliterator());
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [java.util.Spliterator$OfInt] */
        @Override // j$.util.stream.IntStream, j$.util.stream.InterfaceC1108g
        public final /* synthetic */ j$.util.Z spliterator() {
            return j$.util.X.a(this.f18288a.spliterator());
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ int sum() {
            return this.f18288a.sum();
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ boolean t() {
            return this.f18288a.noneMatch(null);
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ int[] toArray() {
            return this.f18288a.toArray();
        }

        @Override // j$.util.stream.InterfaceC1108g
        public final /* synthetic */ InterfaceC1108g unordered() {
            return C1098e.f(this.f18288a.unordered());
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ boolean y() {
            return this.f18288a.anyMatch(null);
        }

        @Override // j$.util.stream.IntStream
        public final C1211y summaryStatistics() {
            this.f18288a.summaryStatistics();
            throw new Error("Java 8+ API desugaring (library desugaring) cannot convert from java.util.IntSummaryStatistics");
        }

        @Override // j$.util.stream.IntStream
        public final IntStream s(K k7) {
            java.util.stream.IntStream intStream = this.f18288a;
            K k10 = new K();
            k10.f18299a = k7;
            return convert(intStream.flatMap(k10));
        }
    }
}
