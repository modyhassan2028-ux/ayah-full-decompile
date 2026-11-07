package j$.util;

import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class X implements Z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.Spliterator.OfInt f18070a;

    public /* synthetic */ X(java.util.Spliterator.OfInt ofInt) {
        this.f18070a = ofInt;
    }

    public static /* synthetic */ Z a(java.util.Spliterator.OfInt ofInt) {
        if (ofInt == null) {
            return null;
        }
        return ofInt instanceof Y ? ((Y) ofInt).f18071a : new X(ofInt);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ int characteristics() {
        return this.f18070a.characteristics();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        java.util.Spliterator.OfInt ofInt = this.f18070a;
        if (obj instanceof X) {
            obj = ((X) obj).f18070a;
        }
        return ofInt.equals(obj);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long estimateSize() {
        return this.f18070a.estimateSize();
    }

    @Override // j$.util.f0
    public final /* synthetic */ void forEachRemaining(Object obj) {
        this.f18070a.forEachRemaining(obj);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.f18070a.forEachRemaining((Consumer<? super Integer>) consumer);
    }

    @Override // j$.util.Z
    public final /* synthetic */ void forEachRemaining(IntConsumer intConsumer) {
        this.f18070a.forEachRemaining(intConsumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ java.util.Comparator getComparator() {
        return this.f18070a.getComparator();
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return this.f18070a.getExactSizeIfKnown();
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i10) {
        return this.f18070a.hasCharacteristics(i10);
    }

    public final /* synthetic */ int hashCode() {
        return this.f18070a.hashCode();
    }

    @Override // j$.util.f0
    public final /* synthetic */ boolean tryAdvance(Object obj) {
        return this.f18070a.tryAdvance(obj);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return this.f18070a.tryAdvance((Consumer<? super Integer>) consumer);
    }

    @Override // j$.util.Z
    public final /* synthetic */ boolean tryAdvance(IntConsumer intConsumer) {
        return this.f18070a.tryAdvance(intConsumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ Spliterator trySplit() {
        return g0.a(this.f18070a.trySplit());
    }

    @Override // j$.util.Z, j$.util.f0, j$.util.Spliterator
    public final /* synthetic */ Z trySplit() {
        return a(this.f18070a.trySplit());
    }

    @Override // j$.util.f0, j$.util.Spliterator
    public final /* synthetic */ f0 trySplit() {
        return d0.a(this.f18070a.trySplit());
    }
}
