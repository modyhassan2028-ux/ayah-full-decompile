package j$.util;

import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class U implements W {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.Spliterator.OfDouble f18068a;

    public /* synthetic */ U(java.util.Spliterator.OfDouble ofDouble) {
        this.f18068a = ofDouble;
    }

    public static /* synthetic */ W a(java.util.Spliterator.OfDouble ofDouble) {
        if (ofDouble == null) {
            return null;
        }
        return ofDouble instanceof V ? ((V) ofDouble).f18069a : new U(ofDouble);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ int characteristics() {
        return this.f18068a.characteristics();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        java.util.Spliterator.OfDouble ofDouble = this.f18068a;
        if (obj instanceof U) {
            obj = ((U) obj).f18068a;
        }
        return ofDouble.equals(obj);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long estimateSize() {
        return this.f18068a.estimateSize();
    }

    @Override // j$.util.f0
    public final /* synthetic */ void forEachRemaining(Object obj) {
        this.f18068a.forEachRemaining(obj);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.f18068a.forEachRemaining((Consumer<? super Double>) consumer);
    }

    @Override // j$.util.W
    public final /* synthetic */ void forEachRemaining(DoubleConsumer doubleConsumer) {
        this.f18068a.forEachRemaining(doubleConsumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ java.util.Comparator getComparator() {
        return this.f18068a.getComparator();
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return this.f18068a.getExactSizeIfKnown();
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i10) {
        return this.f18068a.hasCharacteristics(i10);
    }

    public final /* synthetic */ int hashCode() {
        return this.f18068a.hashCode();
    }

    @Override // j$.util.f0
    public final /* synthetic */ boolean tryAdvance(Object obj) {
        return this.f18068a.tryAdvance(obj);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return this.f18068a.tryAdvance((Consumer<? super Double>) consumer);
    }

    @Override // j$.util.W
    public final /* synthetic */ boolean tryAdvance(DoubleConsumer doubleConsumer) {
        return this.f18068a.tryAdvance(doubleConsumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ Spliterator trySplit() {
        return g0.a(this.f18068a.trySplit());
    }

    @Override // j$.util.W, j$.util.f0, j$.util.Spliterator
    public final /* synthetic */ W trySplit() {
        return a(this.f18068a.trySplit());
    }

    @Override // j$.util.f0, j$.util.Spliterator
    public final /* synthetic */ f0 trySplit() {
        return d0.a(this.f18068a.trySplit());
    }
}
