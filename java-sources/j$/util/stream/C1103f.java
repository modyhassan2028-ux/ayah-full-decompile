package j$.util.stream;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.stream.BaseStream;

/* JADX INFO: renamed from: j$.util.stream.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C1103f implements BaseStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1108g f18466a;

    public /* synthetic */ C1103f(InterfaceC1108g interfaceC1108g) {
        this.f18466a = interfaceC1108g;
    }

    public static /* synthetic */ BaseStream f(InterfaceC1108g interfaceC1108g) {
        if (interfaceC1108g == null) {
            return null;
        }
        if (interfaceC1108g instanceof C1098e) {
            return ((C1098e) interfaceC1108g).f18460a;
        }
        if (interfaceC1108g instanceof C) {
            return B.f((C) interfaceC1108g);
        }
        if (interfaceC1108g instanceof IntStream) {
            return IntStream.Wrapper.convert((IntStream) interfaceC1108g);
        }
        if (interfaceC1108g instanceof InterfaceC1139m0) {
            return C1134l0.f((InterfaceC1139m0) interfaceC1108g);
        }
        return interfaceC1108g instanceof Stream ? Stream.Wrapper.convert((Stream) interfaceC1108g) : new C1103f(interfaceC1108g);
    }

    @Override // java.util.stream.BaseStream, java.lang.AutoCloseable
    public final /* synthetic */ void close() throws Exception {
        this.f18466a.close();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC1108g interfaceC1108g = this.f18466a;
        if (obj instanceof C1103f) {
            obj = ((C1103f) obj).f18466a;
        }
        return interfaceC1108g.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f18466a.hashCode();
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ boolean isParallel() {
        return this.f18466a.isParallel();
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ Iterator iterator() {
        return this.f18466a.iterator();
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ BaseStream onClose(Runnable runnable) {
        return f(this.f18466a.onClose(runnable));
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ BaseStream parallel() {
        return f(this.f18466a.parallel());
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ BaseStream sequential() {
        return f(this.f18466a.sequential());
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ Spliterator spliterator() {
        return j$.util.Spliterator.Wrapper.convert(this.f18466a.spliterator());
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ BaseStream unordered() {
        return f(this.f18466a.unordered());
    }
}
