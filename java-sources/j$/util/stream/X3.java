package j$.util.stream;

import j$.util.AbstractC1062c;
import j$.util.Spliterator;
import java.util.Comparator;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes2.dex */
public abstract class X3 implements Spliterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Spliterator f18391a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f18392b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f18393c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f18394d;

    public abstract Spliterator b(Spliterator spliterator);

    @Override // j$.util.Spliterator
    public final long getExactSizeIfKnown() {
        return -1L;
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i10) {
        return AbstractC1062c.e(this, i10);
    }

    @Override // j$.util.Spliterator
    public void forEachRemaining(Consumer consumer) {
        while (tryAdvance(consumer)) {
        }
    }

    public X3(Spliterator spliterator) {
        this.f18393c = true;
        this.f18391a = spliterator;
        this.f18392b = new AtomicBoolean();
    }

    public X3(Spliterator spliterator, X3 x9) {
        this.f18393c = true;
        this.f18391a = spliterator;
        x9.getClass();
        this.f18392b = x9.f18392b;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return this.f18391a.estimateSize();
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return this.f18391a.characteristics() & (-16449);
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        return this.f18391a.getComparator();
    }

    @Override // j$.util.Spliterator
    public Spliterator trySplit() {
        Spliterator spliteratorTrySplit = this.f18391a.trySplit();
        if (spliteratorTrySplit != null) {
            return b(spliteratorTrySplit);
        }
        return null;
    }

    public final boolean a() {
        return (this.f18394d == 0 && this.f18392b.get()) ? false : true;
    }

    @Override // j$.util.Spliterator
    public /* bridge */ /* synthetic */ j$.util.Z trySplit() {
        return (j$.util.Z) trySplit();
    }

    @Override // j$.util.Spliterator
    public /* bridge */ /* synthetic */ j$.util.c0 trySplit() {
        return (j$.util.c0) trySplit();
    }

    @Override // j$.util.Spliterator
    public /* bridge */ /* synthetic */ j$.util.W trySplit() {
        return (j$.util.W) trySplit();
    }

    @Override // j$.util.Spliterator
    public /* bridge */ /* synthetic */ j$.util.f0 trySplit() {
        return (j$.util.f0) trySplit();
    }
}
