package j$.util;

import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class V implements java.util.Spliterator.OfDouble {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ W f18069a;

    public /* synthetic */ V(W w9) {
        this.f18069a = w9;
    }

    public static /* synthetic */ java.util.Spliterator.OfDouble a(W w9) {
        if (w9 == null) {
            return null;
        }
        return w9 instanceof U ? ((U) w9).f18068a : new V(w9);
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ int characteristics() {
        return this.f18069a.characteristics();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        W w9 = this.f18069a;
        if (obj instanceof V) {
            obj = ((V) obj).f18069a;
        }
        return w9.equals(obj);
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ long estimateSize() {
        return this.f18069a.estimateSize();
    }

    @Override // java.util.Spliterator.OfPrimitive
    public final /* synthetic */ void forEachRemaining(DoubleConsumer doubleConsumer) {
        this.f18069a.forEachRemaining((Object) doubleConsumer);
    }

    @Override // java.util.Spliterator.OfDouble, java.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.f18069a.forEachRemaining(consumer);
    }

    @Override // java.util.Spliterator.OfDouble
    /* JADX INFO: renamed from: forEachRemaining, reason: avoid collision after fix types in other method */
    public final /* synthetic */ void forEachRemaining2(DoubleConsumer doubleConsumer) {
        this.f18069a.forEachRemaining(doubleConsumer);
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ java.util.Comparator getComparator() {
        return this.f18069a.getComparator();
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return this.f18069a.getExactSizeIfKnown();
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i10) {
        return this.f18069a.hasCharacteristics(i10);
    }

    public final /* synthetic */ int hashCode() {
        return this.f18069a.hashCode();
    }

    @Override // java.util.Spliterator.OfPrimitive
    public final /* synthetic */ boolean tryAdvance(DoubleConsumer doubleConsumer) {
        return this.f18069a.tryAdvance((Object) doubleConsumer);
    }

    @Override // java.util.Spliterator.OfDouble, java.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return this.f18069a.tryAdvance(consumer);
    }

    @Override // java.util.Spliterator.OfDouble
    /* JADX INFO: renamed from: tryAdvance, reason: avoid collision after fix types in other method */
    public final /* synthetic */ boolean tryAdvance2(DoubleConsumer doubleConsumer) {
        return this.f18069a.tryAdvance(doubleConsumer);
    }

    @Override // java.util.Spliterator.OfDouble, java.util.Spliterator.OfPrimitive, java.util.Spliterator
    public final /* synthetic */ java.util.Spliterator.OfDouble trySplit() {
        return a(this.f18069a.trySplit());
    }

    @Override // java.util.Spliterator.OfDouble, java.util.Spliterator.OfPrimitive, java.util.Spliterator
    public final /* synthetic */ java.util.Spliterator.OfPrimitive trySplit() {
        return e0.a(this.f18069a.trySplit());
    }

    @Override // java.util.Spliterator.OfDouble, java.util.Spliterator.OfPrimitive, java.util.Spliterator
    public final /* synthetic */ java.util.Spliterator trySplit() {
        return Spliterator.Wrapper.convert(this.f18069a.trySplit());
    }
}
