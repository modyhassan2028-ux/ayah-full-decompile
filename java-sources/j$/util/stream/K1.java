package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;
import java.util.function.IntBinaryOperator;
import java.util.function.IntConsumer;

/* JADX INFO: loaded from: classes2.dex */
public final class K1 implements Q1, InterfaceC1126j2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f18301a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f18302b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ IntBinaryOperator f18303c;

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

    public K1(int i10, IntBinaryOperator intBinaryOperator) {
        this.f18302b = i10;
        this.f18303c = intBinaryOperator;
    }

    @Override // j$.util.stream.Q1
    public final void i(Q1 q10) {
        accept(((K1) q10).f18301a);
    }

    @Override // j$.util.stream.InterfaceC1136l2
    public final void c(long j) {
        this.f18301a = this.f18302b;
    }

    @Override // j$.util.stream.InterfaceC1136l2
    public final void accept(int i10) {
        this.f18301a = this.f18303c.applyAsInt(this.f18301a, i10);
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        return Integer.valueOf(this.f18301a);
    }
}
