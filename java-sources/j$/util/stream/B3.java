package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class B3 implements InterfaceC1136l2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18231a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Consumer f18232b;

    public /* synthetic */ B3(Consumer consumer, int i10) {
        this.f18231a = i10;
        this.f18232b = consumer;
    }

    private final /* synthetic */ void a(long j) {
    }

    private final /* synthetic */ void b(long j) {
    }

    private final /* synthetic */ void f() {
    }

    private final /* synthetic */ void g() {
    }

    @Override // j$.util.stream.InterfaceC1136l2, java.util.function.DoubleConsumer
    public final /* synthetic */ void accept(double d5) {
        switch (this.f18231a) {
            case 0:
                AbstractC1184v1.D();
                throw null;
            default:
                AbstractC1184v1.D();
                throw null;
        }
    }

    @Override // j$.util.stream.InterfaceC1136l2
    public final /* synthetic */ void accept(int i10) {
        switch (this.f18231a) {
            case 0:
                AbstractC1184v1.K();
                throw null;
            default:
                AbstractC1184v1.K();
                throw null;
        }
    }

    @Override // j$.util.stream.InterfaceC1136l2
    public final /* synthetic */ void accept(long j) {
        switch (this.f18231a) {
            case 0:
                AbstractC1184v1.L();
                throw null;
            default:
                AbstractC1184v1.L();
                throw null;
        }
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final void n(Object obj) {
        switch (this.f18231a) {
            case 0:
                ((V2) this.f18232b).n(obj);
                break;
            default:
                this.f18232b.n(obj);
                break;
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.f18231a) {
            case 0:
                break;
        }
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.InterfaceC1136l2
    public final /* synthetic */ void c(long j) {
        int i10 = this.f18231a;
    }

    @Override // j$.util.stream.InterfaceC1136l2
    public final /* synthetic */ boolean e() {
        switch (this.f18231a) {
        }
        return false;
    }

    @Override // j$.util.stream.InterfaceC1136l2
    public final /* synthetic */ void end() {
        int i10 = this.f18231a;
    }
}
