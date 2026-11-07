package j$.util.stream;

import j$.util.AbstractC1062c;
import j$.util.C1076q;
import j$.util.C1210x;
import j$.util.Spliterator;
import java.util.Iterator;
import java.util.function.BiConsumer;
import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleConsumer;
import java.util.function.DoubleFunction;
import java.util.function.DoubleUnaryOperator;
import java.util.function.ObjDoubleConsumer;
import java.util.function.Supplier;
import java.util.stream.DoubleStream;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class A implements C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DoubleStream f18215a;

    public /* synthetic */ A(DoubleStream doubleStream) {
        this.f18215a = doubleStream;
    }

    public static /* synthetic */ C f(DoubleStream doubleStream) {
        if (doubleStream == null) {
            return null;
        }
        return doubleStream instanceof B ? ((B) doubleStream).f18225a : new A(doubleStream);
    }

    @Override // j$.util.stream.C
    public final /* synthetic */ IntStream A() {
        return IntStream.VivifiedWrapper.convert(this.f18215a.mapToInt(null));
    }

    @Override // j$.util.stream.C
    public final /* synthetic */ boolean C() {
        return this.f18215a.noneMatch(null);
    }

    @Override // j$.util.stream.C
    public final /* synthetic */ C a() {
        return f(this.f18215a.takeWhile(null));
    }

    @Override // j$.util.stream.C
    public final /* synthetic */ j$.util.C average() {
        return AbstractC1062c.j(this.f18215a.average());
    }

    @Override // j$.util.stream.C
    public final /* synthetic */ C b() {
        return f(this.f18215a.filter(null));
    }

    @Override // j$.util.stream.C
    public final /* synthetic */ Stream boxed() {
        return W2.f(this.f18215a.boxed());
    }

    @Override // j$.util.stream.C
    public final /* synthetic */ C c() {
        return f(this.f18215a.dropWhile(null));
    }

    @Override // java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        this.f18215a.close();
    }

    @Override // j$.util.stream.C
    public final /* synthetic */ Object collect(Supplier supplier, ObjDoubleConsumer objDoubleConsumer, BiConsumer biConsumer) {
        return this.f18215a.collect(supplier, objDoubleConsumer, biConsumer);
    }

    @Override // j$.util.stream.C
    public final /* synthetic */ long count() {
        return this.f18215a.count();
    }

    @Override // j$.util.stream.C
    public final /* synthetic */ C distinct() {
        return f(this.f18215a.distinct());
    }

    public final /* synthetic */ boolean equals(Object obj) {
        DoubleStream doubleStream = this.f18215a;
        if (obj instanceof A) {
            obj = ((A) obj).f18215a;
        }
        return doubleStream.equals(obj);
    }

    @Override // j$.util.stream.C
    public final /* synthetic */ j$.util.C findAny() {
        return AbstractC1062c.j(this.f18215a.findAny());
    }

    @Override // j$.util.stream.C
    public final /* synthetic */ j$.util.C findFirst() {
        return AbstractC1062c.j(this.f18215a.findFirst());
    }

    @Override // j$.util.stream.C
    public final /* synthetic */ void forEach(DoubleConsumer doubleConsumer) {
        this.f18215a.forEach(doubleConsumer);
    }

    @Override // j$.util.stream.C
    public final /* synthetic */ void forEachOrdered(DoubleConsumer doubleConsumer) {
        this.f18215a.forEachOrdered(doubleConsumer);
    }

    public final /* synthetic */ int hashCode() {
        return this.f18215a.hashCode();
    }

    @Override // j$.util.stream.InterfaceC1108g
    public final /* synthetic */ boolean isParallel() {
        return this.f18215a.isParallel();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.PrimitiveIterator$OfDouble] */
    @Override // j$.util.stream.C, j$.util.stream.InterfaceC1108g
    public final /* synthetic */ j$.util.I iterator() {
        ?? it = this.f18215a.iterator();
        if (it == 0) {
            return null;
        }
        return it instanceof j$.util.H ? ((j$.util.H) it).f18057a : new j$.util.G(it);
    }

    @Override // j$.util.stream.InterfaceC1108g
    public final /* synthetic */ Iterator iterator() {
        return this.f18215a.iterator();
    }

    @Override // j$.util.stream.C
    public final /* synthetic */ C limit(long j) {
        return f(this.f18215a.limit(j));
    }

    @Override // j$.util.stream.C
    public final /* synthetic */ C map(DoubleUnaryOperator doubleUnaryOperator) {
        return f(this.f18215a.map(doubleUnaryOperator));
    }

    @Override // j$.util.stream.C
    public final /* synthetic */ Stream mapToObj(DoubleFunction doubleFunction) {
        return W2.f(this.f18215a.mapToObj(doubleFunction));
    }

    @Override // j$.util.stream.C
    public final /* synthetic */ j$.util.C max() {
        return AbstractC1062c.j(this.f18215a.max());
    }

    @Override // j$.util.stream.C
    public final /* synthetic */ j$.util.C min() {
        return AbstractC1062c.j(this.f18215a.min());
    }

    @Override // j$.util.stream.InterfaceC1108g
    public final /* synthetic */ InterfaceC1108g onClose(Runnable runnable) {
        return C1098e.f(this.f18215a.onClose(runnable));
    }

    @Override // j$.util.stream.C
    public final /* synthetic */ boolean p() {
        return this.f18215a.anyMatch(null);
    }

    @Override // j$.util.stream.C, j$.util.stream.InterfaceC1108g
    public final /* synthetic */ C parallel() {
        return f(this.f18215a.parallel());
    }

    @Override // j$.util.stream.InterfaceC1108g
    public final /* synthetic */ InterfaceC1108g parallel() {
        return C1098e.f(this.f18215a.parallel());
    }

    @Override // j$.util.stream.C
    public final /* synthetic */ C peek(DoubleConsumer doubleConsumer) {
        return f(this.f18215a.peek(doubleConsumer));
    }

    @Override // j$.util.stream.C
    public final /* synthetic */ double reduce(double d5, DoubleBinaryOperator doubleBinaryOperator) {
        return this.f18215a.reduce(d5, doubleBinaryOperator);
    }

    @Override // j$.util.stream.C
    public final /* synthetic */ j$.util.C reduce(DoubleBinaryOperator doubleBinaryOperator) {
        return AbstractC1062c.j(this.f18215a.reduce(doubleBinaryOperator));
    }

    @Override // j$.util.stream.C, j$.util.stream.InterfaceC1108g
    public final /* synthetic */ C sequential() {
        return f(this.f18215a.sequential());
    }

    @Override // j$.util.stream.InterfaceC1108g
    public final /* synthetic */ InterfaceC1108g sequential() {
        return C1098e.f(this.f18215a.sequential());
    }

    @Override // j$.util.stream.C
    public final /* synthetic */ C skip(long j) {
        return f(this.f18215a.skip(j));
    }

    @Override // j$.util.stream.C
    public final /* synthetic */ C sorted() {
        return f(this.f18215a.sorted());
    }

    @Override // j$.util.stream.InterfaceC1108g
    public final /* synthetic */ Spliterator spliterator() {
        return j$.util.g0.a(this.f18215a.spliterator());
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.Spliterator$OfDouble] */
    @Override // j$.util.stream.C, j$.util.stream.InterfaceC1108g
    public final /* synthetic */ j$.util.W spliterator() {
        return j$.util.U.a(this.f18215a.spliterator());
    }

    @Override // j$.util.stream.C
    public final /* synthetic */ double sum() {
        return this.f18215a.sum();
    }

    @Override // j$.util.stream.C
    public final /* synthetic */ double[] toArray() {
        return this.f18215a.toArray();
    }

    @Override // j$.util.stream.C
    public final /* synthetic */ boolean u() {
        return this.f18215a.allMatch(null);
    }

    @Override // j$.util.stream.InterfaceC1108g
    public final /* synthetic */ InterfaceC1108g unordered() {
        return C1098e.f(this.f18215a.unordered());
    }

    @Override // j$.util.stream.C
    public final /* synthetic */ InterfaceC1139m0 v() {
        return C1129k0.f(this.f18215a.mapToLong(null));
    }

    @Override // j$.util.stream.C
    public final C1210x summaryStatistics() {
        this.f18215a.summaryStatistics();
        throw new Error("Java 8+ API desugaring (library desugaring) cannot convert from java.util.DoubleSummaryStatistics");
    }

    @Override // j$.util.stream.C
    public final C d(C1076q c1076q) {
        DoubleStream doubleStream = this.f18215a;
        C1076q c1076q2 = new C1076q(4);
        c1076q2.f18203b = c1076q;
        return f(doubleStream.flatMap(c1076q2));
    }
}
