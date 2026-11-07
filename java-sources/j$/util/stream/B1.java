package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;
import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleConsumer;

/* JADX INFO: loaded from: classes2.dex */
public final class B1 implements Q1, InterfaceC1121i2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f18227a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public double f18228b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ DoubleBinaryOperator f18229c;

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

    public B1(DoubleBinaryOperator doubleBinaryOperator) {
        this.f18229c = doubleBinaryOperator;
    }

    @Override // j$.util.stream.Q1
    public final void i(Q1 q10) {
        B1 b5 = (B1) q10;
        if (b5.f18227a) {
            return;
        }
        accept(b5.f18228b);
    }

    @Override // j$.util.stream.InterfaceC1136l2
    public final void c(long j) {
        this.f18227a = true;
        this.f18228b = 0.0d;
    }

    @Override // j$.util.stream.InterfaceC1136l2, java.util.function.DoubleConsumer
    public final void accept(double d5) {
        if (this.f18227a) {
            this.f18227a = false;
            this.f18228b = d5;
        } else {
            this.f18228b = this.f18229c.applyAsDouble(this.f18228b, d5);
        }
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        return this.f18227a ? j$.util.C.f18045c : new j$.util.C(this.f18228b);
    }
}
