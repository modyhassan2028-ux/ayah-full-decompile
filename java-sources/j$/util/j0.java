package j$.util;

import java.util.NoSuchElementException;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* JADX INFO: loaded from: classes2.dex */
public final class j0 implements Q, LongConsumer, InterfaceC1212z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f18183a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f18184b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c0 f18185c;

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return j$.com.android.tools.r8.a.f(this, longConsumer);
    }

    @Override // j$.util.S
    public final void forEachRemaining(LongConsumer longConsumer) {
        Objects.requireNonNull(longConsumer);
        while (hasNext()) {
            longConsumer.accept(nextLong());
        }
    }

    @Override // java.util.Iterator
    public final Long next() {
        if (w0.f18610a) {
            w0.a(j0.class, "{0} calling PrimitiveIterator.OfLong.nextLong()");
            throw null;
        }
        return Long.valueOf(nextLong());
    }

    @Override // j$.util.Q, java.util.Iterator, j$.util.InterfaceC1212z
    public final void forEachRemaining(Consumer consumer) {
        if (consumer instanceof LongConsumer) {
            forEachRemaining((LongConsumer) consumer);
            return;
        }
        Objects.requireNonNull(consumer);
        if (w0.f18610a) {
            w0.a(j0.class, "{0} calling PrimitiveIterator.OfLong.forEachRemainingLong(action::accept)");
            throw null;
        }
        Objects.requireNonNull(consumer);
        forEachRemaining((LongConsumer) new N(consumer, 0));
    }

    public j0(c0 c0Var) {
        this.f18185c = c0Var;
    }

    @Override // java.util.function.LongConsumer
    public final void accept(long j) {
        this.f18183a = true;
        this.f18184b = j;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (!this.f18183a) {
            this.f18185c.tryAdvance((LongConsumer) this);
        }
        return this.f18183a;
    }

    @Override // j$.util.Q
    public final long nextLong() {
        if (!this.f18183a && !hasNext()) {
            throw new NoSuchElementException();
        }
        this.f18183a = false;
        return this.f18184b;
    }
}
