package j$.util;

import java.util.function.Consumer;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class g0 implements Spliterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.Spliterator f18168a;

    public /* synthetic */ g0(java.util.Spliterator spliterator) {
        this.f18168a = spliterator;
    }

    public static /* synthetic */ Spliterator a(java.util.Spliterator spliterator) {
        if (spliterator == null) {
            return null;
        }
        if (spliterator instanceof Spliterator.Wrapper) {
            return Spliterator.this;
        }
        return spliterator instanceof java.util.Spliterator.OfPrimitive ? d0.a((java.util.Spliterator.OfPrimitive) spliterator) : new g0(spliterator);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ int characteristics() {
        return this.f18168a.characteristics();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        java.util.Spliterator spliterator = this.f18168a;
        if (obj instanceof g0) {
            obj = ((g0) obj).f18168a;
        }
        return spliterator.equals(obj);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long estimateSize() {
        return this.f18168a.estimateSize();
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.f18168a.forEachRemaining(consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ java.util.Comparator getComparator() {
        return this.f18168a.getComparator();
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return this.f18168a.getExactSizeIfKnown();
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i10) {
        return this.f18168a.hasCharacteristics(i10);
    }

    public final /* synthetic */ int hashCode() {
        return this.f18168a.hashCode();
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return this.f18168a.tryAdvance(consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ Spliterator trySplit() {
        return a(this.f18168a.trySplit());
    }
}
