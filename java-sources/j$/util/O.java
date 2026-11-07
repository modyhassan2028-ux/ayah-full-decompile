package j$.util;

import java.util.PrimitiveIterator;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class O implements Q, InterfaceC1212z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PrimitiveIterator.OfLong f18064a;

    public /* synthetic */ O(PrimitiveIterator.OfLong ofLong) {
        this.f18064a = ofLong;
    }

    public final /* synthetic */ boolean equals(Object obj) {
        PrimitiveIterator.OfLong ofLong = this.f18064a;
        if (obj instanceof O) {
            obj = ((O) obj).f18064a;
        }
        return ofLong.equals(obj);
    }

    @Override // j$.util.S
    public final /* synthetic */ void forEachRemaining(Object obj) {
        this.f18064a.forEachRemaining(obj);
    }

    @Override // j$.util.Q, java.util.Iterator, j$.util.InterfaceC1212z
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.f18064a.forEachRemaining((Consumer<? super Long>) consumer);
    }

    @Override // j$.util.Q
    public final /* synthetic */ void forEachRemaining(LongConsumer longConsumer) {
        this.f18064a.forEachRemaining(longConsumer);
    }

    @Override // java.util.Iterator
    public final /* synthetic */ boolean hasNext() {
        return this.f18064a.hasNext();
    }

    public final /* synthetic */ int hashCode() {
        return this.f18064a.hashCode();
    }

    @Override // j$.util.Q, java.util.Iterator
    public final /* synthetic */ Long next() {
        return this.f18064a.next();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        return this.f18064a.next();
    }

    @Override // j$.util.Q
    public final /* synthetic */ long nextLong() {
        return this.f18064a.nextLong();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ void remove() {
        this.f18064a.remove();
    }
}
