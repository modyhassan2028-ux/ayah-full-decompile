package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes2.dex */
public final class F1 extends R1 implements Q1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f18253b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ BiFunction f18254c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ BinaryOperator f18255d;

    @Override // j$.util.stream.InterfaceC1136l2, java.util.function.DoubleConsumer
    public final /* synthetic */ void accept(double d5) {
        AbstractC1184v1.D();
        throw null;
    }

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

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
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
        this.f18344a = this.f18255d.apply(this.f18344a, ((F1) q10).f18344a);
    }

    @Override // j$.util.stream.InterfaceC1136l2
    public final void c(long j) {
        this.f18344a = this.f18253b;
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final void n(Object obj) {
        this.f18344a = this.f18254c.apply(this.f18344a, obj);
    }

    public F1(Object obj, BiFunction biFunction, BinaryOperator binaryOperator) {
        this.f18253b = obj;
        this.f18254c = biFunction;
        this.f18255d = binaryOperator;
    }
}
