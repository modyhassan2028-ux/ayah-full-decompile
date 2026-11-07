package j$.util.stream;

import j$.util.Spliterator;
import java.util.Iterator;
import java.util.stream.BaseStream;
import java.util.stream.DoubleStream;
import java.util.stream.LongStream;

/* JADX INFO: renamed from: j$.util.stream.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C1098e implements InterfaceC1108g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BaseStream f18460a;

    public /* synthetic */ C1098e(BaseStream baseStream) {
        this.f18460a = baseStream;
    }

    public static /* synthetic */ InterfaceC1108g f(BaseStream baseStream) {
        if (baseStream == null) {
            return null;
        }
        if (baseStream instanceof C1103f) {
            return ((C1103f) baseStream).f18466a;
        }
        if (baseStream instanceof DoubleStream) {
            return A.f((DoubleStream) baseStream);
        }
        if (baseStream instanceof java.util.stream.IntStream) {
            return IntStream.VivifiedWrapper.convert((java.util.stream.IntStream) baseStream);
        }
        if (baseStream instanceof LongStream) {
            return C1129k0.f((LongStream) baseStream);
        }
        return baseStream instanceof java.util.stream.Stream ? W2.f((java.util.stream.Stream) baseStream) : new C1098e(baseStream);
    }

    @Override // java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        this.f18460a.close();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        BaseStream baseStream = this.f18460a;
        if (obj instanceof C1098e) {
            obj = ((C1098e) obj).f18460a;
        }
        return baseStream.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f18460a.hashCode();
    }

    @Override // j$.util.stream.InterfaceC1108g
    public final /* synthetic */ boolean isParallel() {
        return this.f18460a.isParallel();
    }

    @Override // j$.util.stream.InterfaceC1108g
    public final /* synthetic */ Iterator iterator() {
        return this.f18460a.iterator();
    }

    @Override // j$.util.stream.InterfaceC1108g
    public final /* synthetic */ InterfaceC1108g onClose(Runnable runnable) {
        return f(this.f18460a.onClose(runnable));
    }

    @Override // j$.util.stream.InterfaceC1108g
    public final /* synthetic */ InterfaceC1108g parallel() {
        return f(this.f18460a.parallel());
    }

    @Override // j$.util.stream.InterfaceC1108g
    public final /* synthetic */ InterfaceC1108g sequential() {
        return f(this.f18460a.sequential());
    }

    @Override // j$.util.stream.InterfaceC1108g
    public final /* synthetic */ Spliterator spliterator() {
        return j$.util.g0.a(this.f18460a.spliterator());
    }

    @Override // j$.util.stream.InterfaceC1108g
    public final /* synthetic */ InterfaceC1108g unordered() {
        return f(this.f18460a.unordered());
    }
}
