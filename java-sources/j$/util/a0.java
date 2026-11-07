package j$.util;

import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a0 implements c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.Spliterator.OfLong f18075a;

    public /* synthetic */ a0(java.util.Spliterator.OfLong ofLong) {
        this.f18075a = ofLong;
    }

    public static /* synthetic */ c0 a(java.util.Spliterator.OfLong ofLong) {
        if (ofLong == null) {
            return null;
        }
        return ofLong instanceof b0 ? ((b0) ofLong).f18076a : new a0(ofLong);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ int characteristics() {
        return this.f18075a.characteristics();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        java.util.Spliterator.OfLong ofLong = this.f18075a;
        if (obj instanceof a0) {
            obj = ((a0) obj).f18075a;
        }
        return ofLong.equals(obj);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long estimateSize() {
        return this.f18075a.estimateSize();
    }

    @Override // j$.util.f0
    public final /* synthetic */ void forEachRemaining(Object obj) {
        this.f18075a.forEachRemaining(obj);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.f18075a.forEachRemaining((Consumer<? super Long>) consumer);
    }

    @Override // j$.util.c0
    public final /* synthetic */ void forEachRemaining(LongConsumer longConsumer) {
        this.f18075a.forEachRemaining(longConsumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ java.util.Comparator getComparator() {
        return this.f18075a.getComparator();
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return this.f18075a.getExactSizeIfKnown();
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i10) {
        return this.f18075a.hasCharacteristics(i10);
    }

    public final /* synthetic */ int hashCode() {
        return this.f18075a.hashCode();
    }

    @Override // j$.util.f0
    public final /* synthetic */ boolean tryAdvance(Object obj) {
        return this.f18075a.tryAdvance(obj);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return this.f18075a.tryAdvance((Consumer<? super Long>) consumer);
    }

    @Override // j$.util.c0
    public final /* synthetic */ boolean tryAdvance(LongConsumer longConsumer) {
        return this.f18075a.tryAdvance(longConsumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ Spliterator trySplit() {
        return g0.a(this.f18075a.trySplit());
    }

    @Override // j$.util.c0, j$.util.f0, j$.util.Spliterator
    public final /* synthetic */ c0 trySplit() {
        return a(this.f18075a.trySplit());
    }

    @Override // j$.util.f0, j$.util.Spliterator
    public final /* synthetic */ f0 trySplit() {
        return d0.a(this.f18075a.trySplit());
    }
}
