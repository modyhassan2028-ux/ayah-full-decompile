package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: j$.util.stream.k3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C1132k3 implements InterfaceC1126j2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18494a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ IntConsumer f18495b;

    public /* synthetic */ C1132k3(IntConsumer intConsumer, int i10) {
        this.f18494a = i10;
        this.f18495b = intConsumer;
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
        switch (this.f18494a) {
            case 0:
                AbstractC1184v1.D();
                throw null;
            default:
                AbstractC1184v1.D();
                throw null;
        }
    }

    @Override // j$.util.stream.InterfaceC1126j2, j$.util.stream.InterfaceC1136l2
    public final void accept(int i10) {
        switch (this.f18494a) {
            case 0:
                this.f18495b.accept(i10);
                break;
            default:
                ((Q2) this.f18495b).accept(i10);
                break;
        }
    }

    @Override // j$.util.stream.InterfaceC1136l2
    public final /* synthetic */ void accept(long j) {
        switch (this.f18494a) {
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
    public final /* bridge */ /* synthetic */ void n(Object obj) {
        switch (this.f18494a) {
            case 0:
                d((Integer) obj);
                break;
            default:
                d((Integer) obj);
                break;
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.f18494a) {
            case 0:
                break;
        }
        return Consumer$CC.$default$andThen(this, consumer);
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        switch (this.f18494a) {
            case 0:
                break;
        }
        return j$.com.android.tools.r8.a.e(this, intConsumer);
    }

    @Override // j$.util.stream.InterfaceC1136l2
    public final /* synthetic */ void c(long j) {
        int i10 = this.f18494a;
    }

    @Override // j$.util.stream.InterfaceC1126j2
    public final /* synthetic */ void d(Integer num) {
        switch (this.f18494a) {
            case 0:
                AbstractC1184v1.G(this, num);
                break;
            default:
                AbstractC1184v1.G(this, num);
                break;
        }
    }

    @Override // j$.util.stream.InterfaceC1136l2
    public final /* synthetic */ boolean e() {
        switch (this.f18494a) {
        }
        return false;
    }

    @Override // j$.util.stream.InterfaceC1136l2
    public final /* synthetic */ void end() {
        int i10 = this.f18494a;
    }
}
