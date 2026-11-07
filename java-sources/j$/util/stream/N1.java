package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
import java.util.function.ObjIntConsumer;
import java.util.function.Supplier;

/* JADX INFO: loaded from: classes2.dex */
public final class N1 extends R1 implements Q1, InterfaceC1126j2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Supplier f18326b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ObjIntConsumer f18327c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C1143n f18328d;

    @Override // j$.util.stream.InterfaceC1136l2, java.util.function.DoubleConsumer
    public final /* synthetic */ void accept(double d5) {
        AbstractC1184v1.D();
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
        d((Integer) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return j$.com.android.tools.r8.a.e(this, intConsumer);
    }

    @Override // j$.util.stream.InterfaceC1126j2
    public final /* synthetic */ void d(Integer num) {
        AbstractC1184v1.G(this, num);
    }

    @Override // j$.util.stream.InterfaceC1136l2
    public final /* synthetic */ boolean e() {
        return false;
    }

    @Override // j$.util.stream.InterfaceC1136l2
    public final /* synthetic */ void end() {
    }

    @Override // j$.util.stream.Q1
    public final void i(Q1 q10) {
        this.f18344a = this.f18328d.apply(this.f18344a, ((N1) q10).f18344a);
    }

    @Override // j$.util.stream.InterfaceC1136l2
    public final void c(long j) {
        this.f18344a = this.f18326b.get();
    }

    @Override // j$.util.stream.InterfaceC1136l2
    public final void accept(int i10) {
        this.f18327c.accept(this.f18344a, i10);
    }

    public N1(Supplier supplier, ObjIntConsumer objIntConsumer, C1143n c1143n) {
        this.f18326b = supplier;
        this.f18327c = objIntConsumer;
        this.f18328d = c1143n;
    }
}
