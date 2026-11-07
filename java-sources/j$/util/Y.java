package j$.util;

import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class Y implements java.util.Spliterator.OfInt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Z f18071a;

    public /* synthetic */ Y(Z z10) {
        this.f18071a = z10;
    }

    public static /* synthetic */ java.util.Spliterator.OfInt a(Z z10) {
        if (z10 == null) {
            return null;
        }
        return z10 instanceof X ? ((X) z10).f18070a : new Y(z10);
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ int characteristics() {
        return this.f18071a.characteristics();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        Z z10 = this.f18071a;
        if (obj instanceof Y) {
            obj = ((Y) obj).f18071a;
        }
        return z10.equals(obj);
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ long estimateSize() {
        return this.f18071a.estimateSize();
    }

    @Override // java.util.Spliterator.OfPrimitive
    public final /* synthetic */ void forEachRemaining(IntConsumer intConsumer) {
        this.f18071a.forEachRemaining((Object) intConsumer);
    }

    @Override // java.util.Spliterator.OfInt, java.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.f18071a.forEachRemaining(consumer);
    }

    @Override // java.util.Spliterator.OfInt
    /* JADX INFO: renamed from: forEachRemaining, reason: avoid collision after fix types in other method */
    public final /* synthetic */ void forEachRemaining2(IntConsumer intConsumer) {
        this.f18071a.forEachRemaining(intConsumer);
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ java.util.Comparator getComparator() {
        return this.f18071a.getComparator();
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return this.f18071a.getExactSizeIfKnown();
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i10) {
        return this.f18071a.hasCharacteristics(i10);
    }

    public final /* synthetic */ int hashCode() {
        return this.f18071a.hashCode();
    }

    @Override // java.util.Spliterator.OfPrimitive
    public final /* synthetic */ boolean tryAdvance(IntConsumer intConsumer) {
        return this.f18071a.tryAdvance((Object) intConsumer);
    }

    @Override // java.util.Spliterator.OfInt, java.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return this.f18071a.tryAdvance(consumer);
    }

    @Override // java.util.Spliterator.OfInt
    /* JADX INFO: renamed from: tryAdvance, reason: avoid collision after fix types in other method */
    public final /* synthetic */ boolean tryAdvance2(IntConsumer intConsumer) {
        return this.f18071a.tryAdvance(intConsumer);
    }

    @Override // java.util.Spliterator.OfInt, java.util.Spliterator.OfPrimitive, java.util.Spliterator
    public final /* synthetic */ java.util.Spliterator.OfInt trySplit() {
        return a(this.f18071a.trySplit());
    }

    @Override // java.util.Spliterator.OfInt, java.util.Spliterator.OfPrimitive, java.util.Spliterator
    public final /* synthetic */ java.util.Spliterator.OfPrimitive trySplit() {
        return e0.a(this.f18071a.trySplit());
    }

    @Override // java.util.Spliterator.OfInt, java.util.Spliterator.OfPrimitive, java.util.Spliterator
    public final /* synthetic */ java.util.Spliterator trySplit() {
        return Spliterator.Wrapper.convert(this.f18071a.trySplit());
    }
}
