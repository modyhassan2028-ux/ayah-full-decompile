package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;
import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleConsumer;

/* JADX INFO: renamed from: j$.util.stream.z1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1204z1 implements Q1, InterfaceC1121i2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public double f18591a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ double f18592b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ DoubleBinaryOperator f18593c;

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

    public C1204z1(double d5, DoubleBinaryOperator doubleBinaryOperator) {
        this.f18592b = d5;
        this.f18593c = doubleBinaryOperator;
    }

    @Override // j$.util.stream.Q1
    public final void i(Q1 q10) {
        accept(((C1204z1) q10).f18591a);
    }

    @Override // j$.util.stream.InterfaceC1136l2
    public final void c(long j) {
        this.f18591a = this.f18592b;
    }

    @Override // j$.util.stream.InterfaceC1136l2, java.util.function.DoubleConsumer
    public final void accept(double d5) {
        this.f18591a = this.f18593c.applyAsDouble(this.f18591a, d5);
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        return Double.valueOf(this.f18591a);
    }
}
