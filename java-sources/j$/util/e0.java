package j$.util;

import java.util.function.Consumer;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class e0 implements java.util.Spliterator.OfPrimitive {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f0 f18149a;

    public /* synthetic */ e0(f0 f0Var) {
        this.f18149a = f0Var;
    }

    public static /* synthetic */ java.util.Spliterator.OfPrimitive a(f0 f0Var) {
        if (f0Var == null) {
            return null;
        }
        if (f0Var instanceof d0) {
            return ((d0) f0Var).f18145a;
        }
        if (f0Var instanceof W) {
            return V.a((W) f0Var);
        }
        if (f0Var instanceof Z) {
            return Y.a((Z) f0Var);
        }
        return f0Var instanceof c0 ? b0.a((c0) f0Var) : new e0(f0Var);
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ int characteristics() {
        return this.f18149a.characteristics();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        f0 f0Var = this.f18149a;
        if (obj instanceof e0) {
            obj = ((e0) obj).f18149a;
        }
        return f0Var.equals(obj);
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ long estimateSize() {
        return this.f18149a.estimateSize();
    }

    @Override // java.util.Spliterator.OfPrimitive
    public final /* synthetic */ void forEachRemaining(Object obj) {
        this.f18149a.forEachRemaining(obj);
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.f18149a.forEachRemaining(consumer);
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ java.util.Comparator getComparator() {
        return this.f18149a.getComparator();
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return this.f18149a.getExactSizeIfKnown();
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i10) {
        return this.f18149a.hasCharacteristics(i10);
    }

    public final /* synthetic */ int hashCode() {
        return this.f18149a.hashCode();
    }

    @Override // java.util.Spliterator.OfPrimitive
    public final /* synthetic */ boolean tryAdvance(Object obj) {
        return this.f18149a.tryAdvance(obj);
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return this.f18149a.tryAdvance(consumer);
    }

    @Override // java.util.Spliterator.OfPrimitive, java.util.Spliterator
    public final /* synthetic */ java.util.Spliterator.OfPrimitive trySplit() {
        return a(this.f18149a.trySplit());
    }

    @Override // java.util.Spliterator.OfPrimitive, java.util.Spliterator
    public final /* synthetic */ java.util.Spliterator trySplit() {
        return Spliterator.Wrapper.convert(this.f18149a.trySplit());
    }
}
