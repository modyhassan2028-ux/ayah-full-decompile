package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.ObjDoubleConsumer;
import java.util.function.Supplier;

/* JADX INFO: loaded from: classes2.dex */
public final class D1 extends R1 implements Q1, InterfaceC1121i2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Supplier f18240b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ObjDoubleConsumer f18241c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C1143n f18242d;

    @Override // j$.util.stream.InterfaceC1136l2
    public final /* synthetic */ void accept(int i10) {
        AbstractC1184v1.K();
        throw null;
    }

    @Override // j$.util.stream.InterfaceC1136l2
    public final /* synthetic */ void accept(long j) {
        AbstractC1184v1.L();
        throw null;
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final /* bridge */ /* synthetic */ void n(Object obj) {
        n((Double) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.com.android.tools.r8.a.d(this, doubleConsumer);
    }

    @Override // j$.util.stream.InterfaceC1136l2
    public final /* synthetic */ boolean e() {
        return false;
    }

    @Override // j$.util.stream.InterfaceC1136l2
    public final /* synthetic */ void end() {
    }

    @Override // j$.util.stream.InterfaceC1121i2
    public final /* synthetic */ void n(Double d5) {
        AbstractC1184v1.E(this, d5);
    }

    @Override // j$.util.stream.Q1
    public final void i(Q1 q10) {
        this.f18344a = this.f18242d.apply(this.f18344a, ((D1) q10).f18344a);
    }

    @Override // j$.util.stream.InterfaceC1136l2
    public final void c(long j) {
        this.f18344a = this.f18240b.get();
    }

    @Override // j$.util.stream.InterfaceC1136l2, java.util.function.DoubleConsumer
    public final void accept(double d5) {
        this.f18241c.accept(this.f18344a, d5);
    }

    public D1(Supplier supplier, ObjDoubleConsumer objDoubleConsumer, C1143n c1143n) {
        this.f18240b = supplier;
        this.f18241c = objDoubleConsumer;
        this.f18242d = c1143n;
    }
}
