package j$.util;

import java.util.NoSuchElementException;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: loaded from: classes2.dex */
public final class i0 implements M, IntConsumer, InterfaceC1212z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f18175a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f18176b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Z f18177c;

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return j$.com.android.tools.r8.a.e(this, intConsumer);
    }

    @Override // j$.util.S
    public final void forEachRemaining(IntConsumer intConsumer) {
        Objects.requireNonNull(intConsumer);
        while (hasNext()) {
            intConsumer.accept(nextInt());
        }
    }

    @Override // java.util.Iterator
    public final Integer next() {
        if (w0.f18610a) {
            w0.a(i0.class, "{0} calling PrimitiveIterator.OfInt.nextInt()");
            throw null;
        }
        return Integer.valueOf(nextInt());
    }

    @Override // j$.util.M, java.util.Iterator, j$.util.InterfaceC1212z
    public final void forEachRemaining(Consumer consumer) {
        if (consumer instanceof IntConsumer) {
            forEachRemaining((IntConsumer) consumer);
            return;
        }
        Objects.requireNonNull(consumer);
        if (w0.f18610a) {
            w0.a(i0.class, "{0} calling PrimitiveIterator.OfInt.forEachRemainingInt(action::accept)");
            throw null;
        }
        Objects.requireNonNull(consumer);
        forEachRemaining((IntConsumer) new J(consumer, 0));
    }

    public i0(Z z10) {
        this.f18177c = z10;
    }

    @Override // java.util.function.IntConsumer
    public final void accept(int i10) {
        this.f18175a = true;
        this.f18176b = i10;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (!this.f18175a) {
            this.f18177c.tryAdvance((IntConsumer) this);
        }
        return this.f18175a;
    }

    @Override // j$.util.M
    public final int nextInt() {
        if (!this.f18175a && !hasNext()) {
            throw new NoSuchElementException();
        }
        this.f18175a = false;
        return this.f18176b;
    }
}
