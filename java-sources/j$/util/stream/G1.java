package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes2.dex */
public final class G1 implements Q1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f18259a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f18260b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ BinaryOperator f18261c;

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

    public G1(BinaryOperator binaryOperator) {
        this.f18261c = binaryOperator;
    }

    @Override // j$.util.stream.Q1
    public final void i(Q1 q10) {
        G1 g10 = (G1) q10;
        if (g10.f18259a) {
            return;
        }
        n(g10.f18260b);
    }

    @Override // j$.util.stream.InterfaceC1136l2
    public final void c(long j) {
        this.f18259a = true;
        this.f18260b = null;
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final void n(Object obj) {
        if (this.f18259a) {
            this.f18259a = false;
            this.f18260b = obj;
        } else {
            this.f18260b = this.f18261c.apply(this.f18260b, obj);
        }
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        return this.f18259a ? j$.util.B.f18043b : new j$.util.B(this.f18260b);
    }
}
