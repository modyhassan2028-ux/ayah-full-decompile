package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;
import java.util.function.LongBinaryOperator;
import java.util.function.LongConsumer;

/* JADX INFO: loaded from: classes2.dex */
public final class O1 implements Q1, InterfaceC1131k2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f18331a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f18332b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ LongBinaryOperator f18333c;

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

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final /* bridge */ /* synthetic */ void n(Object obj) {
        l((Long) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return j$.com.android.tools.r8.a.f(this, longConsumer);
    }

    @Override // j$.util.stream.InterfaceC1136l2
    public final /* synthetic */ boolean e() {
        return false;
    }

    @Override // j$.util.stream.InterfaceC1136l2
    public final /* synthetic */ void end() {
    }

    @Override // j$.util.stream.InterfaceC1131k2
    public final /* synthetic */ void l(Long l10) {
        AbstractC1184v1.I(this, l10);
    }

    public O1(long j, LongBinaryOperator longBinaryOperator) {
        this.f18332b = j;
        this.f18333c = longBinaryOperator;
    }

    @Override // j$.util.stream.Q1
    public final void i(Q1 q10) {
        accept(((O1) q10).f18331a);
    }

    @Override // j$.util.stream.InterfaceC1136l2
    public final void c(long j) {
        this.f18331a = this.f18332b;
    }

    @Override // j$.util.stream.InterfaceC1136l2
    public final void accept(long j) {
        this.f18331a = this.f18333c.applyAsLong(this.f18331a, j);
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        return Long.valueOf(this.f18331a);
    }
}
