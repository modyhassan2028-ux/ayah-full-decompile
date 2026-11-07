package j$.util;

import java.util.function.Consumer;

/* JADX INFO: renamed from: j$.util.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1077s implements Spliterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Spliterator f18209a;

    public C1077s(Spliterator spliterator) {
        this.f18209a = spliterator;
    }

    @Override // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        Objects.requireNonNull(consumer);
        return this.f18209a.tryAdvance(new C1076q(0, consumer));
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        Objects.requireNonNull(consumer);
        this.f18209a.forEachRemaining(new C1076q(0, consumer));
    }

    @Override // j$.util.Spliterator
    public final Spliterator trySplit() {
        Spliterator spliteratorTrySplit = this.f18209a.trySplit();
        if (spliteratorTrySplit == null) {
            return null;
        }
        return new C1077s(spliteratorTrySplit);
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return this.f18209a.estimateSize();
    }

    @Override // j$.util.Spliterator
    public final long getExactSizeIfKnown() {
        return this.f18209a.getExactSizeIfKnown();
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return this.f18209a.characteristics();
    }

    @Override // j$.util.Spliterator
    public final boolean hasCharacteristics(int i10) {
        return this.f18209a.hasCharacteristics(i10);
    }

    @Override // j$.util.Spliterator
    public final java.util.Comparator getComparator() {
        return this.f18209a.getComparator();
    }
}
