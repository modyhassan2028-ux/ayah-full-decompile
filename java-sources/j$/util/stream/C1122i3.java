package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* JADX INFO: renamed from: j$.util.stream.i3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C1122i3 implements InterfaceC1121i2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18480a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DoubleConsumer f18481b;

    public /* synthetic */ C1122i3(DoubleConsumer doubleConsumer, int i10) {
        this.f18480a = i10;
        this.f18481b = doubleConsumer;
    }

    private final /* synthetic */ void a(long j) {
    }

    private final /* synthetic */ void b(long j) {
    }

    private final /* synthetic */ void f() {
    }

    private final /* synthetic */ void g() {
    }

    @Override // j$.util.stream.InterfaceC1121i2, j$.util.stream.InterfaceC1136l2, java.util.function.DoubleConsumer
    public final void accept(double d5) {
        switch (this.f18480a) {
            case 0:
                this.f18481b.accept(d5);
                break;
            default:
                ((O2) this.f18481b).accept(d5);
                break;
        }
    }

    @Override // j$.util.stream.InterfaceC1136l2
    public final /* synthetic */ void accept(int i10) {
        switch (this.f18480a) {
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
        switch (this.f18480a) {
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
        switch (this.f18480a) {
            case 0:
                n((Double) obj);
                break;
            default:
                n((Double) obj);
                break;
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.f18480a) {
            case 0:
                break;
        }
        return Consumer$CC.$default$andThen(this, consumer);
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        switch (this.f18480a) {
            case 0:
                break;
        }
        return j$.com.android.tools.r8.a.d(this, doubleConsumer);
    }

    @Override // j$.util.stream.InterfaceC1136l2
    public final /* synthetic */ void c(long j) {
        int i10 = this.f18480a;
    }

    @Override // j$.util.stream.InterfaceC1136l2
    public final /* synthetic */ boolean e() {
        switch (this.f18480a) {
        }
        return false;
    }

    @Override // j$.util.stream.InterfaceC1136l2
    public final /* synthetic */ void end() {
        int i10 = this.f18480a;
    }

    @Override // j$.util.stream.InterfaceC1121i2
    public final /* synthetic */ void n(Double d5) {
        switch (this.f18480a) {
            case 0:
                AbstractC1184v1.E(this, d5);
                break;
            default:
                AbstractC1184v1.E(this, d5);
                break;
        }
    }
}
