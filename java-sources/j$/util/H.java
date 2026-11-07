package j$.util;

import java.util.PrimitiveIterator;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class H implements PrimitiveIterator.OfDouble {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ I f18057a;

    public /* synthetic */ H(I i10) {
        this.f18057a = i10;
    }

    public final /* synthetic */ boolean equals(Object obj) {
        I i10 = this.f18057a;
        if (obj instanceof H) {
            obj = ((H) obj).f18057a;
        }
        return i10.equals(obj);
    }

    @Override // java.util.PrimitiveIterator
    public final /* synthetic */ void forEachRemaining(DoubleConsumer doubleConsumer) {
        this.f18057a.forEachRemaining((Object) doubleConsumer);
    }

    @Override // java.util.PrimitiveIterator.OfDouble, java.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.f18057a.forEachRemaining(consumer);
    }

    @Override // java.util.PrimitiveIterator.OfDouble
    /* JADX INFO: renamed from: forEachRemaining, reason: avoid collision after fix types in other method */
    public final /* synthetic */ void forEachRemaining2(DoubleConsumer doubleConsumer) {
        this.f18057a.forEachRemaining(doubleConsumer);
    }

    @Override // java.util.Iterator
    public final /* synthetic */ boolean hasNext() {
        return this.f18057a.hasNext();
    }

    public final /* synthetic */ int hashCode() {
        return this.f18057a.hashCode();
    }

    @Override // java.util.PrimitiveIterator.OfDouble, java.util.Iterator
    public final /* synthetic */ Double next() {
        return this.f18057a.next();
    }

    @Override // java.util.PrimitiveIterator.OfDouble, java.util.Iterator
    public final /* synthetic */ Object next() {
        return this.f18057a.next();
    }

    @Override // java.util.PrimitiveIterator.OfDouble
    public final /* synthetic */ double nextDouble() {
        return this.f18057a.nextDouble();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ void remove() {
        this.f18057a.remove();
    }
}
