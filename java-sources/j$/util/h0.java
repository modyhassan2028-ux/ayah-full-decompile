package j$.util;

import j$.util.function.Consumer$CC;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes2.dex */
public final class h0 implements Iterator, Consumer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f18171a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f18172b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Spliterator f18173c;

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    public h0(Spliterator spliterator) {
        this.f18173c = spliterator;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        this.f18171a = true;
        this.f18172b = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (!this.f18171a) {
            this.f18173c.tryAdvance(this);
        }
        return this.f18171a;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.f18171a && !hasNext()) {
            throw new NoSuchElementException();
        }
        this.f18171a = false;
        return this.f18172b;
    }
}
