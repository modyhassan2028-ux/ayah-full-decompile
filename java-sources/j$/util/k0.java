package j$.util;

import java.util.NoSuchElementException;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* JADX INFO: loaded from: classes2.dex */
public final class k0 implements I, DoubleConsumer, InterfaceC1212z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f18186a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public double f18187b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ W f18188c;

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.com.android.tools.r8.a.d(this, doubleConsumer);
    }

    @Override // j$.util.S
    public final void forEachRemaining(DoubleConsumer doubleConsumer) {
        Objects.requireNonNull(doubleConsumer);
        while (hasNext()) {
            doubleConsumer.accept(nextDouble());
        }
    }

    @Override // java.util.Iterator
    public final Double next() {
        if (w0.f18610a) {
            w0.a(k0.class, "{0} calling PrimitiveIterator.OfDouble.nextLong()");
            throw null;
        }
        return Double.valueOf(nextDouble());
    }

    @Override // j$.util.I, java.util.Iterator, j$.util.InterfaceC1212z
    public final void forEachRemaining(Consumer consumer) {
        if (consumer instanceof DoubleConsumer) {
            forEachRemaining((DoubleConsumer) consumer);
            return;
        }
        Objects.requireNonNull(consumer);
        if (w0.f18610a) {
            w0.a(k0.class, "{0} calling PrimitiveIterator.OfDouble.forEachRemainingDouble(action::accept)");
            throw null;
        }
        Objects.requireNonNull(consumer);
        forEachRemaining((DoubleConsumer) new F(consumer, 0));
    }

    public k0(W w9) {
        this.f18188c = w9;
    }

    @Override // java.util.function.DoubleConsumer
    public final void accept(double d5) {
        this.f18186a = true;
        this.f18187b = d5;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (!this.f18186a) {
            this.f18188c.tryAdvance((DoubleConsumer) this);
        }
        return this.f18186a;
    }

    @Override // j$.util.I
    public final double nextDouble() {
        if (!this.f18186a && !hasNext()) {
            throw new NoSuchElementException();
        }
        this.f18186a = false;
        return this.f18187b;
    }
}
