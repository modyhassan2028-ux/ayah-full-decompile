package j$.util.stream;

import j$.util.AbstractC1062c;
import j$.util.Spliterator;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.function.Consumer$CC;
import java.util.Comparator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: j$.util.stream.h3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1117h3 implements Spliterator, Consumer {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Object f18475d = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Spliterator f18476a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f18477b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f18478c;

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return AbstractC1062c.d(this);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i10) {
        return AbstractC1062c.e(this, i10);
    }

    public C1117h3(Spliterator spliterator, ConcurrentHashMap concurrentHashMap) {
        this.f18476a = spliterator;
        this.f18477b = concurrentHashMap;
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final void n(Object obj) {
        this.f18478c = obj;
    }

    @Override // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        while (this.f18476a.tryAdvance(this)) {
            Object obj = this.f18478c;
            if (obj == null) {
                obj = f18475d;
            }
            if (this.f18477b.putIfAbsent(obj, Boolean.TRUE) == null) {
                consumer.n(this.f18478c);
                this.f18478c = null;
                return true;
            }
        }
        return false;
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        this.f18476a.forEachRemaining(new j$.util.concurrent.t(8, this, consumer));
    }

    @Override // j$.util.Spliterator
    public final Spliterator trySplit() {
        Spliterator spliteratorTrySplit = this.f18476a.trySplit();
        if (spliteratorTrySplit != null) {
            return new C1117h3(spliteratorTrySplit, this.f18477b);
        }
        return null;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return this.f18476a.estimateSize();
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return (this.f18476a.characteristics() & (-16469)) | 1;
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        return this.f18476a.getComparator();
    }
}
