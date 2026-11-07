package j$.util;

import java.util.PrimitiveIterator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class K implements M, InterfaceC1212z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PrimitiveIterator.OfInt f18060a;

    public /* synthetic */ K(PrimitiveIterator.OfInt ofInt) {
        this.f18060a = ofInt;
    }

    public final /* synthetic */ boolean equals(Object obj) {
        PrimitiveIterator.OfInt ofInt = this.f18060a;
        if (obj instanceof K) {
            obj = ((K) obj).f18060a;
        }
        return ofInt.equals(obj);
    }

    @Override // j$.util.S
    public final /* synthetic */ void forEachRemaining(Object obj) {
        this.f18060a.forEachRemaining(obj);
    }

    @Override // j$.util.M, java.util.Iterator, j$.util.InterfaceC1212z
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.f18060a.forEachRemaining((Consumer<? super Integer>) consumer);
    }

    @Override // j$.util.M
    public final /* synthetic */ void forEachRemaining(IntConsumer intConsumer) {
        this.f18060a.forEachRemaining(intConsumer);
    }

    @Override // java.util.Iterator
    public final /* synthetic */ boolean hasNext() {
        return this.f18060a.hasNext();
    }

    public final /* synthetic */ int hashCode() {
        return this.f18060a.hashCode();
    }

    @Override // j$.util.M, java.util.Iterator
    public final /* synthetic */ Integer next() {
        return this.f18060a.next();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        return this.f18060a.next();
    }

    @Override // j$.util.M
    public final /* synthetic */ int nextInt() {
        return this.f18060a.nextInt();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ void remove() {
        this.f18060a.remove();
    }
}
