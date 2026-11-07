package j$.util.stream;

import j$.util.C1066g;
import j$.util.C1076q;
import j$.util.Objects;
import j$.util.Spliterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
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
import java.util.stream.Collector;

/* JADX INFO: renamed from: j$.util.stream.d2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1096d2 extends AbstractC1078a implements Stream {
    @Override // j$.util.stream.Stream
    public final Stream sorted() {
        return new G2(this);
    }

    @Override // j$.util.stream.Stream
    public final Stream distinct() {
        return new C1138m(this, Y2.f18404m | Y2.f18411t);
    }

    @Override // j$.util.stream.Stream
    public final j$.util.B min(Comparator comparator) {
        Objects.requireNonNull(comparator);
        return reduce(new j$.util.function.a(comparator, 1));
    }

    @Override // j$.util.stream.Stream
    public final j$.util.B findAny() {
        return (j$.util.B) H0(H.f18266d);
    }

    @Override // j$.util.stream.Stream
    public final j$.util.B findFirst() {
        return (j$.util.B) H0(H.f18265c);
    }

    @Override // j$.util.stream.Stream
    public final Stream sorted(Comparator comparator) {
        return new G2(this, comparator);
    }

    @Override // j$.util.stream.Stream
    public final Object reduce(Object obj, BiFunction biFunction, BinaryOperator binaryOperator) {
        Objects.requireNonNull(biFunction);
        Objects.requireNonNull(binaryOperator);
        return H0(new A1(Z2.REFERENCE, binaryOperator, biFunction, obj, 2));
    }

    @Override // j$.util.stream.Stream
    public final Object reduce(Object obj, BinaryOperator binaryOperator) {
        Objects.requireNonNull(binaryOperator);
        Objects.requireNonNull(binaryOperator);
        return H0(new A1(Z2.REFERENCE, binaryOperator, binaryOperator, obj, 2));
    }

    public void forEach(Consumer consumer) {
        Objects.requireNonNull(consumer);
        H0(new O(consumer, false));
    }

    public void forEachOrdered(Consumer consumer) {
        Objects.requireNonNull(consumer);
        H0(new O(consumer, true));
    }

    @Override // j$.util.stream.Stream
    public final j$.util.B max(Comparator comparator) {
        Objects.requireNonNull(comparator);
        return reduce(new j$.util.function.a(comparator, 0));
    }

    @Override // j$.util.stream.AbstractC1078a
    public final Z2 L0() {
        return Z2.REFERENCE;
    }

    @Override // j$.util.stream.Stream
    public final j$.util.B reduce(BinaryOperator binaryOperator) {
        Objects.requireNonNull(binaryOperator);
        return (j$.util.B) H0(new C1199y1(Z2.REFERENCE, binaryOperator, 2));
    }

    @Override // j$.util.stream.AbstractC1078a
    public final G0 J0(AbstractC1078a abstractC1078a, Spliterator spliterator, boolean z10, IntFunction intFunction) {
        return AbstractC1184v1.b0(abstractC1078a, spliterator, z10, intFunction);
    }

    @Override // j$.util.stream.AbstractC1078a
    public final Spliterator S0(AbstractC1078a abstractC1078a, Supplier supplier, boolean z10) {
        return new C3(abstractC1078a, supplier, z10);
    }

    @Override // j$.util.stream.AbstractC1078a
    public final boolean K0(Spliterator spliterator, InterfaceC1136l2 interfaceC1136l2) {
        boolean zE;
        do {
            zE = interfaceC1136l2.e();
            if (zE) {
                break;
            }
        } while (spliterator.tryAdvance(interfaceC1136l2));
        return zE;
    }

    @Override // j$.util.stream.AbstractC1184v1
    public final InterfaceC1198y0 A0(long j, IntFunction intFunction) {
        return AbstractC1184v1.Z(j, intFunction);
    }

    @Override // j$.util.stream.InterfaceC1108g
    public final Iterator iterator() {
        Spliterator spliterator = spliterator();
        Objects.requireNonNull(spliterator);
        return new j$.util.h0(spliterator);
    }

    @Override // j$.util.stream.Stream
    public final Stream filter(Predicate predicate) {
        Objects.requireNonNull(predicate);
        return new C1158q(this, Y2.f18411t, predicate, 4);
    }

    @Override // j$.util.stream.Stream
    public final Stream map(Function function) {
        Objects.requireNonNull(function);
        return new C1158q(this, Y2.f18407p | Y2.f18405n, function, 5);
    }

    @Override // j$.util.stream.Stream
    public final IntStream mapToInt(ToIntFunction toIntFunction) {
        Objects.requireNonNull(toIntFunction);
        return new U(this, Y2.f18407p | Y2.f18405n, toIntFunction, 2);
    }

    @Override // j$.util.stream.Stream
    public final Object collect(Supplier supplier, BiConsumer biConsumer, BiConsumer biConsumer2) {
        Objects.requireNonNull(supplier);
        Objects.requireNonNull(biConsumer);
        Objects.requireNonNull(biConsumer2);
        return H0(new A1(Z2.REFERENCE, biConsumer2, biConsumer, supplier, 3));
    }

    @Override // j$.util.stream.Stream
    public final InterfaceC1139m0 mapToLong(ToLongFunction toLongFunction) {
        Objects.requireNonNull(toLongFunction);
        return new C1104f0(this, Y2.f18407p | Y2.f18405n, toLongFunction, 3);
    }

    @Override // j$.util.stream.Stream
    public final C mapToDouble(ToDoubleFunction toDoubleFunction) {
        Objects.requireNonNull(toDoubleFunction);
        return new r(this, Y2.f18407p | Y2.f18405n, toDoubleFunction, 3);
    }

    @Override // j$.util.stream.Stream
    public final long count() {
        return ((Long) H0(new C1(2))).longValue();
    }

    @Override // j$.util.stream.Stream
    public final Stream d(C1076q c1076q) {
        Objects.requireNonNull(c1076q);
        return new C1158q(this, Y2.f18407p | Y2.f18405n | Y2.f18411t, c1076q, 6);
    }

    @Override // j$.util.stream.Stream
    public final IntStream o(C1076q c1076q) {
        Objects.requireNonNull(c1076q);
        return new U(this, Y2.f18407p | Y2.f18405n | Y2.f18411t, c1076q, 3);
    }

    @Override // j$.util.stream.Stream
    public final C z(C1076q c1076q) {
        Objects.requireNonNull(c1076q);
        return new r(this, Y2.f18407p | Y2.f18405n | Y2.f18411t, c1076q, 4);
    }

    /* JADX WARN: Code duplicated, block: B:107:0x0154  */
    @Override // j$.util.stream.Stream
    public final Object h(C1118i c1118i) {
        C1118i c1118i2;
        Object objH0;
        EnumC1113h enumC1113h;
        Collector.Characteristics characteristics;
        EnumC1113h enumC1113h2;
        Collector.Characteristics characteristics2;
        EnumC1113h enumC1113h3;
        Collector.Characteristics characteristics3;
        if (this.f18422h.f18431r) {
            Set<Collector.Characteristics> setCharacteristics = c1118i.f18479a.characteristics();
            if (setCharacteristics != null && !setCharacteristics.isEmpty()) {
                HashSet hashSet = new HashSet();
                Collector.Characteristics next = setCharacteristics.iterator().next();
                if (next instanceof EnumC1113h) {
                    Iterator<Collector.Characteristics> it = setCharacteristics.iterator();
                    while (it.hasNext()) {
                        try {
                            EnumC1113h enumC1113h4 = (EnumC1113h) it.next();
                            if (enumC1113h4 == null) {
                                characteristics3 = null;
                            } else if (enumC1113h4 == EnumC1113h.CONCURRENT) {
                                characteristics3 = Collector.Characteristics.CONCURRENT;
                            } else {
                                characteristics3 = enumC1113h4 == EnumC1113h.UNORDERED ? Collector.Characteristics.UNORDERED : Collector.Characteristics.IDENTITY_FINISH;
                            }
                            hashSet.add(characteristics3);
                        } catch (ClassCastException e10) {
                            C1066g.a(e10, "java.util.stream.Collector.Characteristics");
                            throw null;
                        }
                    }
                } else {
                    if (!(next instanceof Collector.Characteristics)) {
                        C1066g.a(next.getClass(), "java.util.stream.Collector.Characteristics");
                        throw null;
                    }
                    Iterator<Collector.Characteristics> it2 = setCharacteristics.iterator();
                    while (it2.hasNext()) {
                        try {
                            Collector.Characteristics next2 = it2.next();
                            if (next2 == null) {
                                enumC1113h3 = null;
                            } else if (next2 == Collector.Characteristics.CONCURRENT) {
                                enumC1113h3 = EnumC1113h.CONCURRENT;
                            } else {
                                enumC1113h3 = next2 == Collector.Characteristics.UNORDERED ? EnumC1113h.UNORDERED : EnumC1113h.IDENTITY_FINISH;
                            }
                            hashSet.add(enumC1113h3);
                        } catch (ClassCastException e11) {
                            C1066g.a(e11, "java.util.stream.Collector.Characteristics");
                            throw null;
                        }
                    }
                }
                setCharacteristics = hashSet;
            }
            if (setCharacteristics.contains(EnumC1113h.CONCURRENT)) {
                if (Y2.ORDERED.v(this.f18426m)) {
                    Set<Collector.Characteristics> setCharacteristics2 = c1118i.f18479a.characteristics();
                    if (setCharacteristics2 != null && !setCharacteristics2.isEmpty()) {
                        HashSet hashSet2 = new HashSet();
                        Collector.Characteristics next3 = setCharacteristics2.iterator().next();
                        if (next3 instanceof EnumC1113h) {
                            Iterator<Collector.Characteristics> it3 = setCharacteristics2.iterator();
                            while (it3.hasNext()) {
                                try {
                                    EnumC1113h enumC1113h5 = (EnumC1113h) it3.next();
                                    if (enumC1113h5 == null) {
                                        characteristics2 = null;
                                    } else if (enumC1113h5 == EnumC1113h.CONCURRENT) {
                                        characteristics2 = Collector.Characteristics.CONCURRENT;
                                    } else {
                                        characteristics2 = enumC1113h5 == EnumC1113h.UNORDERED ? Collector.Characteristics.UNORDERED : Collector.Characteristics.IDENTITY_FINISH;
                                    }
                                    hashSet2.add(characteristics2);
                                } catch (ClassCastException e12) {
                                    C1066g.a(e12, "java.util.stream.Collector.Characteristics");
                                    throw null;
                                }
                            }
                        } else {
                            if (!(next3 instanceof Collector.Characteristics)) {
                                C1066g.a(next3.getClass(), "java.util.stream.Collector.Characteristics");
                                throw null;
                            }
                            Iterator<Collector.Characteristics> it4 = setCharacteristics2.iterator();
                            while (it4.hasNext()) {
                                try {
                                    Collector.Characteristics next4 = it4.next();
                                    if (next4 == null) {
                                        enumC1113h2 = null;
                                    } else if (next4 == Collector.Characteristics.CONCURRENT) {
                                        enumC1113h2 = EnumC1113h.CONCURRENT;
                                    } else {
                                        enumC1113h2 = next4 == Collector.Characteristics.UNORDERED ? EnumC1113h.UNORDERED : EnumC1113h.IDENTITY_FINISH;
                                    }
                                    hashSet2.add(enumC1113h2);
                                } catch (ClassCastException e13) {
                                    C1066g.a(e13, "java.util.stream.Collector.Characteristics");
                                    throw null;
                                }
                            }
                        }
                        setCharacteristics2 = hashSet2;
                    }
                    if (!setCharacteristics2.contains(EnumC1113h.UNORDERED)) {
                        c1118i2 = c1118i;
                        objH0 = H0(new H1(Z2.REFERENCE, c1118i.f18479a.combiner(), c1118i.f18479a.accumulator(), ((C1118i) Objects.requireNonNull(c1118i)).f18479a.supplier(), c1118i2));
                    }
                }
                objH0 = c1118i.f18479a.supplier().get();
                forEach(new j$.util.concurrent.t(7, c1118i.f18479a.accumulator(), objH0));
                c1118i2 = c1118i;
            } else {
                c1118i2 = c1118i;
                objH0 = H0(new H1(Z2.REFERENCE, c1118i.f18479a.combiner(), c1118i.f18479a.accumulator(), ((C1118i) Objects.requireNonNull(c1118i)).f18479a.supplier(), c1118i2));
            }
        } else {
            c1118i2 = c1118i;
            objH0 = H0(new H1(Z2.REFERENCE, c1118i.f18479a.combiner(), c1118i.f18479a.accumulator(), ((C1118i) Objects.requireNonNull(c1118i)).f18479a.supplier(), c1118i2));
        }
        Set<Collector.Characteristics> setCharacteristics3 = c1118i2.f18479a.characteristics();
        if (setCharacteristics3 != null && !setCharacteristics3.isEmpty()) {
            HashSet hashSet3 = new HashSet();
            Collector.Characteristics next5 = setCharacteristics3.iterator().next();
            if (next5 instanceof EnumC1113h) {
                Iterator<Collector.Characteristics> it5 = setCharacteristics3.iterator();
                while (it5.hasNext()) {
                    try {
                        EnumC1113h enumC1113h6 = (EnumC1113h) it5.next();
                        if (enumC1113h6 == null) {
                            characteristics = null;
                        } else if (enumC1113h6 == EnumC1113h.CONCURRENT) {
                            characteristics = Collector.Characteristics.CONCURRENT;
                        } else {
                            characteristics = enumC1113h6 == EnumC1113h.UNORDERED ? Collector.Characteristics.UNORDERED : Collector.Characteristics.IDENTITY_FINISH;
                        }
                        hashSet3.add(characteristics);
                    } catch (ClassCastException e14) {
                        C1066g.a(e14, "java.util.stream.Collector.Characteristics");
                        throw null;
                    }
                }
            } else {
                if (!(next5 instanceof Collector.Characteristics)) {
                    C1066g.a(next5.getClass(), "java.util.stream.Collector.Characteristics");
                    throw null;
                }
                Iterator<Collector.Characteristics> it6 = setCharacteristics3.iterator();
                while (it6.hasNext()) {
                    try {
                        Collector.Characteristics next6 = it6.next();
                        if (next6 == null) {
                            enumC1113h = null;
                        } else if (next6 == Collector.Characteristics.CONCURRENT) {
                            enumC1113h = EnumC1113h.CONCURRENT;
                        } else {
                            enumC1113h = next6 == Collector.Characteristics.UNORDERED ? EnumC1113h.UNORDERED : EnumC1113h.IDENTITY_FINISH;
                        }
                        hashSet3.add(enumC1113h);
                    } catch (ClassCastException e15) {
                        C1066g.a(e15, "java.util.stream.Collector.Characteristics");
                        throw null;
                    }
                }
            }
            setCharacteristics3 = hashSet3;
        }
        return setCharacteristics3.contains(EnumC1113h.IDENTITY_FINISH) ? objH0 : c1118i2.f18479a.finisher().apply(objH0);
    }

    @Override // j$.util.stream.Stream
    public final InterfaceC1139m0 m(C1076q c1076q) {
        Objects.requireNonNull(c1076q);
        return new C1104f0(this, Y2.f18407p | Y2.f18405n | Y2.f18411t, c1076q, 2);
    }

    @Override // j$.util.stream.Stream
    public final Stream peek(Consumer consumer) {
        Objects.requireNonNull(consumer);
        return new C1158q(this, consumer);
    }

    @Override // j$.util.stream.Stream
    public final Stream limit(long j) {
        if (j < 0) {
            throw new IllegalArgumentException(Long.toString(j));
        }
        return AbstractC1184v1.C0(this, 0L, j);
    }

    @Override // j$.util.stream.Stream
    public final Stream skip(long j) {
        if (j >= 0) {
            return j == 0 ? this : AbstractC1184v1.C0(this, j, -1L);
        }
        throw new IllegalArgumentException(Long.toString(j));
    }

    @Override // j$.util.stream.Stream
    public final Stream takeWhile(Predicate predicate) {
        int i10 = Y3.f18419a;
        Objects.requireNonNull(predicate);
        return new H3(this, Y3.f18419a, predicate, 0);
    }

    @Override // j$.util.stream.Stream
    public final Stream dropWhile(Predicate predicate) {
        int i10 = Y3.f18419a;
        Objects.requireNonNull(predicate);
        return new H3(this, Y3.f18420b, predicate, 1);
    }

    @Override // j$.util.stream.Stream
    public final Object[] toArray(IntFunction intFunction) {
        return AbstractC1184v1.n0(I0(intFunction), intFunction).m(intFunction);
    }

    @Override // j$.util.stream.Stream
    public final Object[] toArray() {
        return toArray(new C1084b0(11));
    }

    @Override // j$.util.stream.Stream
    public final boolean anyMatch(Predicate predicate) {
        return ((Boolean) H0(AbstractC1184v1.B0(EnumC1173t0.ANY, predicate))).booleanValue();
    }

    @Override // j$.util.stream.Stream
    public final boolean allMatch(Predicate predicate) {
        return ((Boolean) H0(AbstractC1184v1.B0(EnumC1173t0.ALL, predicate))).booleanValue();
    }

    @Override // j$.util.stream.Stream
    public final boolean noneMatch(Predicate predicate) {
        return ((Boolean) H0(AbstractC1184v1.B0(EnumC1173t0.NONE, predicate))).booleanValue();
    }

    @Override // j$.util.stream.Stream
    public final List toList() {
        return Collections.unmodifiableList(new ArrayList(Arrays.asList(toArray())));
    }
}
