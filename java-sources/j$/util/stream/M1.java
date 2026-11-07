package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;
import java.util.function.IntBinaryOperator;
import java.util.function.IntConsumer;

/* JADX INFO: loaded from: classes2.dex */
public final class M1 implements Q1, InterfaceC1126j2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f18316a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f18317b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ IntBinaryOperator f18318c;

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

    public M1(IntBinaryOperator intBinaryOperator) {
        this.f18318c = intBinaryOperator;
    }

    @Override // j$.util.stream.Q1
    public final void i(Q1 q10) {
        M1 m10 = (M1) q10;
        if (m10.f18316a) {
            return;
        }
        accept(m10.f18317b);
    }

    @Override // j$.util.stream.InterfaceC1136l2
    public final void c(long j) {
        this.f18316a = true;
        this.f18317b = 0;
    }

    @Override // j$.util.stream.InterfaceC1136l2
    public final void accept(int i10) {
        if (this.f18316a) {
            this.f18316a = false;
            this.f18317b = i10;
        } else {
            this.f18317b = this.f18318c.applyAsInt(this.f18317b, i10);
        }
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        return this.f18316a ? j$.util.D.f18048c : new j$.util.D(this.f18317b);
    }
}
