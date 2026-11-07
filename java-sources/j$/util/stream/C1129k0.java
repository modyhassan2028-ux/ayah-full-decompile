package j$.util.stream;

import j$.util.AbstractC1062c;
import j$.util.C1076q;
import j$.util.Spliterator;
import java.util.Iterator;
import java.util.function.BiConsumer;
import java.util.function.LongBinaryOperator;
import java.util.function.LongConsumer;
import java.util.function.LongFunction;
import java.util.function.ObjLongConsumer;
import java.util.function.Supplier;
import java.util.stream.LongStream;

/* JADX INFO: renamed from: j$.util.stream.k0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C1129k0 implements InterfaceC1139m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ LongStream f18491a;

    public /* synthetic */ C1129k0(LongStream longStream) {
        this.f18491a = longStream;
    }

    public static /* synthetic */ InterfaceC1139m0 f(LongStream longStream) {
        if (longStream == null) {
            return null;
        }
        return longStream instanceof C1134l0 ? ((C1134l0) longStream).f18498a : new C1129k0(longStream);
    }

    @Override // j$.util.stream.InterfaceC1139m0
    public final /* synthetic */ IntStream B() {
        return IntStream.VivifiedWrapper.convert(this.f18491a.mapToInt(null));
    }

    @Override // j$.util.stream.InterfaceC1139m0
    public final /* synthetic */ InterfaceC1139m0 a() {
        return f(this.f18491a.takeWhile(null));
    }

    @Override // j$.util.stream.InterfaceC1139m0
    public final /* synthetic */ C asDoubleStream() {
        return A.f(this.f18491a.asDoubleStream());
    }

    @Override // j$.util.stream.InterfaceC1139m0
    public final /* synthetic */ j$.util.C average() {
        return AbstractC1062c.j(this.f18491a.average());
    }

    @Override // j$.util.stream.InterfaceC1139m0
    public final /* synthetic */ InterfaceC1139m0 b() {
        return f(this.f18491a.filter(null));
    }

    @Override // j$.util.stream.InterfaceC1139m0
    public final /* synthetic */ Stream boxed() {
        return W2.f(this.f18491a.boxed());
    }

    @Override // j$.util.stream.InterfaceC1139m0
    public final /* synthetic */ InterfaceC1139m0 c() {
        return f(this.f18491a.dropWhile(null));
    }

    @Override // java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        this.f18491a.close();
    }

    @Override // j$.util.stream.InterfaceC1139m0
    public final /* synthetic */ Object collect(Supplier supplier, ObjLongConsumer objLongConsumer, BiConsumer biConsumer) {
        return this.f18491a.collect(supplier, objLongConsumer, biConsumer);
    }

    @Override // j$.util.stream.InterfaceC1139m0
    public final /* synthetic */ long count() {
        return this.f18491a.count();
    }

    @Override // j$.util.stream.InterfaceC1139m0
    public final /* synthetic */ InterfaceC1139m0 distinct() {
        return f(this.f18491a.distinct());
    }

    @Override // j$.util.stream.InterfaceC1139m0
    public final /* synthetic */ InterfaceC1139m0 e() {
        return f(this.f18491a.map(null));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        LongStream longStream = this.f18491a;
        if (obj instanceof C1129k0) {
            obj = ((C1129k0) obj).f18491a;
        }
        return longStream.equals(obj);
    }

    @Override // j$.util.stream.InterfaceC1139m0
    public final /* synthetic */ j$.util.E findAny() {
        return AbstractC1062c.l(this.f18491a.findAny());
    }

    @Override // j$.util.stream.InterfaceC1139m0
    public final /* synthetic */ j$.util.E findFirst() {
        return AbstractC1062c.l(this.f18491a.findFirst());
    }

    @Override // j$.util.stream.InterfaceC1139m0
    public final /* synthetic */ void forEach(LongConsumer longConsumer) {
        this.f18491a.forEach(longConsumer);
    }

    @Override // j$.util.stream.InterfaceC1139m0
    public final /* synthetic */ void forEachOrdered(LongConsumer longConsumer) {
        this.f18491a.forEachOrdered(longConsumer);
    }

    public final /* synthetic */ int hashCode() {
        return this.f18491a.hashCode();
    }

    @Override // j$.util.stream.InterfaceC1108g
    public final /* synthetic */ boolean isParallel() {
        return this.f18491a.isParallel();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.PrimitiveIterator$OfLong] */
    @Override // j$.util.stream.InterfaceC1139m0, j$.util.stream.InterfaceC1108g
    public final /* synthetic */ j$.util.Q iterator() {
        ?? it = this.f18491a.iterator();
        if (it == 0) {
            return null;
        }
        return it instanceof j$.util.P ? ((j$.util.P) it).f18065a : new j$.util.O(it);
    }

    @Override // j$.util.stream.InterfaceC1108g
    public final /* synthetic */ Iterator iterator() {
        return this.f18491a.iterator();
    }

    @Override // j$.util.stream.InterfaceC1139m0
    public final /* synthetic */ C k() {
        return A.f(this.f18491a.mapToDouble(null));
    }

    @Override // j$.util.stream.InterfaceC1139m0
    public final /* synthetic */ InterfaceC1139m0 limit(long j) {
        return f(this.f18491a.limit(j));
    }

    @Override // j$.util.stream.InterfaceC1139m0
    public final /* synthetic */ Stream mapToObj(LongFunction longFunction) {
        return W2.f(this.f18491a.mapToObj(longFunction));
    }

    @Override // j$.util.stream.InterfaceC1139m0
    public final /* synthetic */ j$.util.E max() {
        return AbstractC1062c.l(this.f18491a.max());
    }

    @Override // j$.util.stream.InterfaceC1139m0
    public final /* synthetic */ j$.util.E min() {
        return AbstractC1062c.l(this.f18491a.min());
    }

    @Override // j$.util.stream.InterfaceC1139m0
    public final /* synthetic */ boolean n() {
        return this.f18491a.noneMatch(null);
    }

    @Override // j$.util.stream.InterfaceC1108g
    public final /* synthetic */ InterfaceC1108g onClose(Runnable runnable) {
        return C1098e.f(this.f18491a.onClose(runnable));
    }

    @Override // j$.util.stream.InterfaceC1108g
    public final /* synthetic */ InterfaceC1108g parallel() {
        return C1098e.f(this.f18491a.parallel());
    }

    @Override // j$.util.stream.InterfaceC1139m0, j$.util.stream.InterfaceC1108g
    public final /* synthetic */ InterfaceC1139m0 parallel() {
        return f(this.f18491a.parallel());
    }

    @Override // j$.util.stream.InterfaceC1139m0
    public final /* synthetic */ InterfaceC1139m0 peek(LongConsumer longConsumer) {
        return f(this.f18491a.peek(longConsumer));
    }

    @Override // j$.util.stream.InterfaceC1139m0
    public final /* synthetic */ boolean r() {
        return this.f18491a.anyMatch(null);
    }

    @Override // j$.util.stream.InterfaceC1139m0
    public final /* synthetic */ long reduce(long j, LongBinaryOperator longBinaryOperator) {
        return this.f18491a.reduce(j, longBinaryOperator);
    }

    @Override // j$.util.stream.InterfaceC1139m0
    public final /* synthetic */ j$.util.E reduce(LongBinaryOperator longBinaryOperator) {
        return AbstractC1062c.l(this.f18491a.reduce(longBinaryOperator));
    }

    @Override // j$.util.stream.InterfaceC1108g
    public final /* synthetic */ InterfaceC1108g sequential() {
        return C1098e.f(this.f18491a.sequential());
    }

    @Override // j$.util.stream.InterfaceC1139m0, j$.util.stream.InterfaceC1108g
    public final /* synthetic */ InterfaceC1139m0 sequential() {
        return f(this.f18491a.sequential());
    }

    @Override // j$.util.stream.InterfaceC1139m0
    public final /* synthetic */ InterfaceC1139m0 skip(long j) {
        return f(this.f18491a.skip(j));
    }

    @Override // j$.util.stream.InterfaceC1139m0
    public final /* synthetic */ InterfaceC1139m0 sorted() {
        return f(this.f18491a.sorted());
    }

    @Override // j$.util.stream.InterfaceC1108g
    public final /* synthetic */ Spliterator spliterator() {
        return j$.util.g0.a(this.f18491a.spliterator());
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.Spliterator$OfLong] */
    @Override // j$.util.stream.InterfaceC1139m0, j$.util.stream.InterfaceC1108g
    public final /* synthetic */ j$.util.c0 spliterator() {
        return j$.util.a0.a(this.f18491a.spliterator());
    }

    @Override // j$.util.stream.InterfaceC1139m0
    public final /* synthetic */ long sum() {
        return this.f18491a.sum();
    }

    @Override // j$.util.stream.InterfaceC1139m0
    public final /* synthetic */ long[] toArray() {
        return this.f18491a.toArray();
    }

    @Override // j$.util.stream.InterfaceC1108g
    public final /* synthetic */ InterfaceC1108g unordered() {
        return C1098e.f(this.f18491a.unordered());
    }

    @Override // j$.util.stream.InterfaceC1139m0
    public final /* synthetic */ boolean x() {
        return this.f18491a.allMatch(null);
    }

    @Override // j$.util.stream.InterfaceC1139m0
    public final j$.util.A summaryStatistics() {
        this.f18491a.summaryStatistics();
        throw new Error("Java 8+ API desugaring (library desugaring) cannot convert from java.util.LongSummaryStatistics");
    }

    @Override // j$.util.stream.InterfaceC1139m0
    public final InterfaceC1139m0 d(C1076q c1076q) {
        LongStream longStream = this.f18491a;
        C1076q c1076q2 = new C1076q(6);
        c1076q2.f18203b = c1076q;
        return f(longStream.flatMap(c1076q2));
    }
}
