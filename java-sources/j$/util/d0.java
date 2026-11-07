package j$.util;

import java.util.function.Consumer;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class d0 implements f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.Spliterator.OfPrimitive f18145a;

    public /* synthetic */ d0(java.util.Spliterator.OfPrimitive ofPrimitive) {
        this.f18145a = ofPrimitive;
    }

    public static /* synthetic */ f0 a(java.util.Spliterator.OfPrimitive ofPrimitive) {
        if (ofPrimitive == null) {
            return null;
        }
        if (ofPrimitive instanceof e0) {
            return ((e0) ofPrimitive).f18149a;
        }
        if (ofPrimitive instanceof java.util.Spliterator.OfDouble) {
            return U.a((java.util.Spliterator.OfDouble) ofPrimitive);
        }
        if (ofPrimitive instanceof java.util.Spliterator.OfInt) {
            return X.a((java.util.Spliterator.OfInt) ofPrimitive);
        }
        return ofPrimitive instanceof java.util.Spliterator.OfLong ? a0.a((java.util.Spliterator.OfLong) ofPrimitive) : new d0(ofPrimitive);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ int characteristics() {
        return this.f18145a.characteristics();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        java.util.Spliterator.OfPrimitive ofPrimitive = this.f18145a;
        if (obj instanceof d0) {
            obj = ((d0) obj).f18145a;
        }
        return ofPrimitive.equals(obj);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long estimateSize() {
        return this.f18145a.estimateSize();
    }

    @Override // j$.util.f0
    public final /* synthetic */ void forEachRemaining(Object obj) {
        this.f18145a.forEachRemaining(obj);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.f18145a.forEachRemaining(consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ java.util.Comparator getComparator() {
        return this.f18145a.getComparator();
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return this.f18145a.getExactSizeIfKnown();
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i10) {
        return this.f18145a.hasCharacteristics(i10);
    }

    public final /* synthetic */ int hashCode() {
        return this.f18145a.hashCode();
    }

    @Override // j$.util.f0
    public final /* synthetic */ boolean tryAdvance(Object obj) {
        return this.f18145a.tryAdvance(obj);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return this.f18145a.tryAdvance(consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ Spliterator trySplit() {
        return g0.a(this.f18145a.trySplit());
    }

    @Override // j$.util.f0, j$.util.Spliterator
    public final /* synthetic */ f0 trySplit() {
        return a(this.f18145a.trySplit());
    }
}
