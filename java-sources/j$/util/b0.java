package j$.util;

import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class b0 implements java.util.Spliterator.OfLong {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c0 f18076a;

    public /* synthetic */ b0(c0 c0Var) {
        this.f18076a = c0Var;
    }

    public static /* synthetic */ java.util.Spliterator.OfLong a(c0 c0Var) {
        if (c0Var == null) {
            return null;
        }
        return c0Var instanceof a0 ? ((a0) c0Var).f18075a : new b0(c0Var);
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ int characteristics() {
        return this.f18076a.characteristics();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        c0 c0Var = this.f18076a;
        if (obj instanceof b0) {
            obj = ((b0) obj).f18076a;
        }
        return c0Var.equals(obj);
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ long estimateSize() {
        return this.f18076a.estimateSize();
    }

    @Override // java.util.Spliterator.OfPrimitive
    public final /* synthetic */ void forEachRemaining(LongConsumer longConsumer) {
        this.f18076a.forEachRemaining((Object) longConsumer);
    }

    @Override // java.util.Spliterator.OfLong, java.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.f18076a.forEachRemaining(consumer);
    }

    @Override // java.util.Spliterator.OfLong
    /* JADX INFO: renamed from: forEachRemaining, reason: avoid collision after fix types in other method */
    public final /* synthetic */ void forEachRemaining2(LongConsumer longConsumer) {
        this.f18076a.forEachRemaining(longConsumer);
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ java.util.Comparator getComparator() {
        return this.f18076a.getComparator();
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return this.f18076a.getExactSizeIfKnown();
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i10) {
        return this.f18076a.hasCharacteristics(i10);
    }

    public final /* synthetic */ int hashCode() {
        return this.f18076a.hashCode();
    }

    @Override // java.util.Spliterator.OfPrimitive
    public final /* synthetic */ boolean tryAdvance(LongConsumer longConsumer) {
        return this.f18076a.tryAdvance((Object) longConsumer);
    }

    @Override // java.util.Spliterator.OfLong, java.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return this.f18076a.tryAdvance(consumer);
    }

    @Override // java.util.Spliterator.OfLong
    /* JADX INFO: renamed from: tryAdvance, reason: avoid collision after fix types in other method */
    public final /* synthetic */ boolean tryAdvance2(LongConsumer longConsumer) {
        return this.f18076a.tryAdvance(longConsumer);
    }

    @Override // java.util.Spliterator.OfLong, java.util.Spliterator.OfPrimitive, java.util.Spliterator
    public final /* synthetic */ java.util.Spliterator.OfLong trySplit() {
        return a(this.f18076a.trySplit());
    }

    @Override // java.util.Spliterator.OfLong, java.util.Spliterator.OfPrimitive, java.util.Spliterator
    public final /* synthetic */ java.util.Spliterator.OfPrimitive trySplit() {
        return e0.a(this.f18076a.trySplit());
    }

    @Override // java.util.Spliterator.OfLong, java.util.Spliterator.OfPrimitive, java.util.Spliterator
    public final /* synthetic */ java.util.Spliterator trySplit() {
        return Spliterator.Wrapper.convert(this.f18076a.trySplit());
    }
}
